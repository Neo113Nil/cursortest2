package com.unity.androidnotifications;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedTransferQueue;

/* loaded from: classes2.dex */
public class UnityNotificationBackgroundThread extends Thread {
    private static final int TASKS_FOR_HOUSEKEEPING = 50;
    private UnityNotificationManager mManager;
    private ConcurrentHashMap<Integer, Notification.Builder> mScheduledNotifications;
    private LinkedTransferQueue<Task> mTasks = new LinkedTransferQueue<>();
    private int mTasksSinceHousekeeping = 50;

    private static class CancelAllNotificationsTask extends Task {
        private CancelAllNotificationsTask() {
            super();
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            if (concurrentHashMap.isEmpty()) {
                return false;
            }
            Enumeration<Integer> keys = concurrentHashMap.keys();
            while (keys.hasMoreElements()) {
                Integer nextElement = keys.nextElement();
                unityNotificationManager.cancelPendingNotificationIntent(nextElement.intValue());
                unityNotificationManager.deleteExpiredNotificationIntent(String.valueOf(nextElement));
            }
            concurrentHashMap.clear();
            return true;
        }
    }

    private static class CancelNotificationTask extends Task {
        private int notificationId;

        public CancelNotificationTask(int i4) {
            super();
            this.notificationId = i4;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            unityNotificationManager.cancelPendingNotificationIntent(this.notificationId);
            if (concurrentHashMap.remove(Integer.valueOf(this.notificationId)) == null) {
                return false;
            }
            unityNotificationManager.deleteExpiredNotificationIntent(String.valueOf(this.notificationId));
            return true;
        }
    }

    private static class HousekeepingTask extends Task {
        UnityNotificationBackgroundThread thread;

        public HousekeepingTask(UnityNotificationBackgroundThread unityNotificationBackgroundThread) {
            super();
            this.thread = unityNotificationBackgroundThread;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            HashSet hashSet = new HashSet();
            Enumeration<Integer> keys = concurrentHashMap.keys();
            while (keys.hasMoreElements()) {
                hashSet.add(String.valueOf(keys.nextElement()));
            }
            this.thread.performHousekeeping(hashSet);
            return false;
        }
    }

    private static class ScheduleNotificationTask extends Task {
        private boolean isCustomized;
        private boolean isNew;
        private Notification.Builder notificationBuilder;
        private int notificationId;

        public ScheduleNotificationTask(int i4, Notification.Builder builder, boolean z4, boolean z5) {
            super();
            this.notificationId = i4;
            this.notificationBuilder = builder;
            this.isCustomized = z4;
            this.isNew = z5;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            String valueOf = String.valueOf(this.notificationId);
            try {
                UnityNotificationManager.mUnityNotificationManager.performNotificationScheduling(this.notificationId, this.notificationBuilder, this.isCustomized);
                return this.isNew;
            } catch (Throwable th) {
                concurrentHashMap.remove(Integer.valueOf(this.notificationId));
                unityNotificationManager.cancelPendingNotificationIntent(this.notificationId);
                unityNotificationManager.deleteExpiredNotificationIntent(valueOf);
                throw th;
            }
        }
    }

    private static abstract class Task {
        private Task() {
        }

        public abstract boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap);
    }

    public UnityNotificationBackgroundThread(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
        this.mManager = unityNotificationManager;
        this.mScheduledNotifications = concurrentHashMap;
        if (concurrentHashMap.size() == 0) {
            loadNotifications();
        }
    }

    private void enqueueHousekeeping() {
        this.mTasks.add(new HousekeepingTask(this));
    }

    private boolean executeTask(UnityNotificationManager unityNotificationManager, Task task, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
        try {
            return task.run(unityNotificationManager, concurrentHashMap);
        } catch (Exception e4) {
            Log.e("UnityNotifications", "Exception executing notification task", e4);
            return false;
        }
    }

    private void loadNotifications() {
        List<Notification.Builder> loadSavedNotifications = this.mManager.loadSavedNotifications();
        if (loadSavedNotifications == null || loadSavedNotifications.size() == 0) {
            return;
        }
        long time = Calendar.getInstance().getTime().getTime();
        boolean z4 = false;
        for (Notification.Builder builder : loadSavedNotifications) {
            Bundle extras = builder.getExtras();
            int i4 = extras.getInt("id", -1);
            if (extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L) - time > 0) {
                this.mScheduledNotifications.put(Integer.valueOf(i4), builder);
            } else {
                z4 = true;
            }
        }
        if (z4) {
            enqueueHousekeeping();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performHousekeeping(Set<String> set) {
        boolean z4 = this.mTasksSinceHousekeeping >= 50;
        this.mTasksSinceHousekeeping = 0;
        if (z4) {
            this.mManager.performNotificationHousekeeping(set);
        }
        this.mManager.saveScheduledNotificationIDs(set);
    }

    public void enqueueCancelAllNotifications() {
        this.mTasks.add(new CancelAllNotificationsTask());
    }

    public void enqueueCancelNotification(int i4) {
        this.mTasks.add(new CancelNotificationTask(i4));
    }

    public void enqueueNotification(int i4, Notification.Builder builder, boolean z4, boolean z5) {
        this.mTasks.add(new ScheduleNotificationTask(i4, builder, z4, z5));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            boolean z4 = false;
            while (true) {
                try {
                    Task take = this.mTasks.take();
                    z4 |= executeTask(this.mManager, take, this.mScheduledNotifications);
                    if (!(take instanceof HousekeepingTask)) {
                        this.mTasksSinceHousekeeping++;
                    }
                    if (this.mTasks.size() == 0 && z4) {
                        try {
                            enqueueHousekeeping();
                            break;
                        } catch (InterruptedException unused) {
                            z4 = false;
                            if (this.mTasks.isEmpty()) {
                                return;
                            }
                        }
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }
}
