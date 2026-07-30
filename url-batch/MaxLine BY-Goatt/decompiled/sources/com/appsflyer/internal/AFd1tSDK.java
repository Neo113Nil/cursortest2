package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1tSDK implements Runnable {
    final ExecutorService AFInAppEventParameterName;
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    private Timer afDebugLog = new Timer(true);
    public final List<AFd1zSDK> values = new CopyOnWriteArrayList();
    final Set<AFd1vSDK> AFInAppEventType = new CopyOnWriteArraySet();
    final Set<AFd1vSDK> valueOf = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFd1uSDK<?>> afRDLog = new ConcurrentSkipListSet();
    final NavigableSet<AFd1uSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final List<AFd1uSDK<?>> afErrorLog = new ArrayList();
    final Set<AFd1uSDK<?>> afInfoLog = Collections.newSetFromMap(new ConcurrentHashMap());

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFd1tSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ AFd1uSDK AFInAppEventParameterName;

        public AnonymousClass5(AFd1uSDK aFd1uSDK) {
            this.AFInAppEventParameterName = aFd1uSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFd1tSDK.this.afRDLog) {
                try {
                    if (AFd1tSDK.this.afInfoLog.contains(this.AFInAppEventParameterName)) {
                        StringBuilder sb = new StringBuilder("QUEUE: tried to add already running task: ");
                        sb.append(this.AFInAppEventParameterName);
                        AFLogger.afDebugLog(sb.toString());
                        return;
                    }
                    if (!AFd1tSDK.this.afRDLog.contains(this.AFInAppEventParameterName) && !AFd1tSDK.this.AFLogger.contains(this.AFInAppEventParameterName)) {
                        AFd1tSDK aFd1tSDK = AFd1tSDK.this;
                        AFd1uSDK aFd1uSDK = this.AFInAppEventParameterName;
                        for (AFd1vSDK aFd1vSDK : aFd1uSDK.valueOf) {
                            if (aFd1tSDK.valueOf.contains(aFd1vSDK)) {
                                aFd1uSDK.AFInAppEventType.add(aFd1vSDK);
                            }
                        }
                        boolean AFKeystoreWrapper = AFd1tSDK.this.AFKeystoreWrapper((AFd1uSDK<?>) this.AFInAppEventParameterName);
                        AFd1tSDK aFd1tSDK2 = AFd1tSDK.this;
                        if (AFKeystoreWrapper) {
                            add = aFd1tSDK2.afRDLog.add(this.AFInAppEventParameterName);
                        } else {
                            add = aFd1tSDK2.AFLogger.add(this.AFInAppEventParameterName);
                            if (add) {
                                StringBuilder sb2 = new StringBuilder("QUEUE: new task was blocked: ");
                                sb2.append(this.AFInAppEventParameterName);
                                AFLogger.afDebugLog(sb2.toString());
                                this.AFInAppEventParameterName.AFInAppEventParameterName();
                            }
                        }
                        if (add) {
                            AFd1tSDK aFd1tSDK3 = AFd1tSDK.this;
                            aFd1tSDK3.afRDLog.addAll(aFd1tSDK3.afErrorLog);
                            AFd1tSDK.this.afErrorLog.clear();
                        } else {
                            StringBuilder sb3 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            sb3.append(this.AFInAppEventParameterName);
                            AFLogger.afDebugLog(sb3.toString());
                        }
                        if (!add) {
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.AFInAppEventParameterName);
                            AFLogger.afWarnLog(sb4.toString());
                            return;
                        }
                        AFd1tSDK.this.valueOf.add(this.AFInAppEventParameterName.values);
                        StringBuilder sb5 = new StringBuilder("QUEUE: new task added: ");
                        sb5.append(this.AFInAppEventParameterName);
                        AFLogger.afDebugLog(sb5.toString());
                        for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                        }
                        AFd1tSDK aFd1tSDK4 = AFd1tSDK.this;
                        aFd1tSDK4.AFInAppEventParameterName.submit(aFd1tSDK4);
                        AFd1tSDK aFd1tSDK5 = AFd1tSDK.this;
                        synchronized (aFd1tSDK5.afRDLog) {
                            try {
                                for (int size = (aFd1tSDK5.afRDLog.size() + aFd1tSDK5.AFLogger.size()) - 40; size > 0; size--) {
                                    boolean isEmpty = aFd1tSDK5.AFLogger.isEmpty();
                                    boolean isEmpty2 = aFd1tSDK5.afRDLog.isEmpty();
                                    if (isEmpty2 || isEmpty) {
                                        if (!isEmpty2) {
                                            aFd1tSDK5.valueOf(aFd1tSDK5.afRDLog);
                                        } else if (!isEmpty) {
                                            aFd1tSDK5.valueOf(aFd1tSDK5.AFLogger);
                                        }
                                    } else if (aFd1tSDK5.afRDLog.first().compareTo(aFd1tSDK5.AFLogger.first()) > 0) {
                                        aFd1tSDK5.valueOf(aFd1tSDK5.afRDLog);
                                    } else {
                                        aFd1tSDK5.valueOf(aFd1tSDK5.AFLogger);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    sb6.append(this.AFInAppEventParameterName);
                    AFLogger.afDebugLog(sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFd1tSDK(ExecutorService executorService) {
        this.AFInAppEventParameterName = executorService;
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFd1tSDK aFd1tSDK) {
        synchronized (aFd1tSDK.afRDLog) {
            try {
                Iterator<AFd1uSDK<?>> it = aFd1tSDK.AFLogger.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AFd1uSDK<?> next = it.next();
                    if (aFd1tSDK.AFKeystoreWrapper(next)) {
                        it.remove();
                        aFd1tSDK.afRDLog.add(next);
                        z = true;
                    }
                }
                if (z) {
                    aFd1tSDK.AFInAppEventParameterName.submit(aFd1tSDK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.afRDLog) {
            try {
                final AFd1uSDK<?> pollFirst = this.afRDLog.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                this.afInfoLog.add(pollFirst);
                long AFKeystoreWrapper = pollFirst.AFKeystoreWrapper();
                AFd1xSDK aFd1xSDK = new AFd1xSDK(Thread.currentThread());
                if (AFKeystoreWrapper > 0) {
                    this.afDebugLog.schedule(aFd1xSDK, AFKeystoreWrapper);
                }
                this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                        while (it.hasNext()) {
                            it.next().AFInAppEventType(pollFirst);
                        }
                    }
                });
                if (!this.afRDLog.isEmpty()) {
                    this.AFInAppEventParameterName.submit(this);
                }
                try {
                    AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFd1ySDK call = pollFirst.call();
                    aFd1xSDK.cancel();
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(call);
                            AFLogger.afDebugLog(sb.toString());
                            AFd1tSDK.this.afInfoLog.remove(pollFirst);
                            Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(pollFirst, call);
                            }
                            if (call == AFd1ySDK.SUCCESS) {
                                AFd1tSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            boolean AFInAppEventType = pollFirst.AFInAppEventType();
                            AFd1tSDK aFd1tSDK = AFd1tSDK.this;
                            if (!AFInAppEventType) {
                                aFd1tSDK.AFInAppEventType.add(pollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            synchronized (aFd1tSDK.afRDLog) {
                                try {
                                    AFd1tSDK.this.afErrorLog.add(pollFirst);
                                    for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(pollFirst)));
                    final AFd1ySDK aFd1ySDK = AFd1ySDK.TIMEOUT;
                    pollFirst.AFKeystoreWrapper = aFd1ySDK;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFd1ySDK);
                            AFLogger.afDebugLog(sb.toString());
                            AFd1tSDK.this.afInfoLog.remove(pollFirst);
                            Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(pollFirst, aFd1ySDK);
                            }
                            if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                                AFd1tSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            boolean AFInAppEventType = pollFirst.AFInAppEventType();
                            AFd1tSDK aFd1tSDK = AFd1tSDK.this;
                            if (!AFInAppEventType) {
                                aFd1tSDK.AFInAppEventType.add(pollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            synchronized (aFd1tSDK.afRDLog) {
                                try {
                                    AFd1tSDK.this.afErrorLog.add(pollFirst);
                                    for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (Throwable unused2) {
                    aFd1xSDK.cancel();
                    final AFd1ySDK aFd1ySDK2 = AFd1ySDK.FAILURE;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFd1ySDK2);
                            AFLogger.afDebugLog(sb.toString());
                            AFd1tSDK.this.afInfoLog.remove(pollFirst);
                            Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(pollFirst, aFd1ySDK2);
                            }
                            if (aFd1ySDK2 == AFd1ySDK.SUCCESS) {
                                AFd1tSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            boolean AFInAppEventType = pollFirst.AFInAppEventType();
                            AFd1tSDK aFd1tSDK = AFd1tSDK.this;
                            if (!AFInAppEventType) {
                                aFd1tSDK.AFInAppEventType.add(pollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            synchronized (aFd1tSDK.afRDLog) {
                                try {
                                    AFd1tSDK.this.afErrorLog.add(pollFirst);
                                    for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void valueOf(NavigableSet<AFd1uSDK<?>> navigableSet) {
        AFd1uSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFInAppEventType.add(pollFirst.values);
        Iterator<AFd1zSDK> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(pollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFKeystoreWrapper(AFd1uSDK<?> aFd1uSDK) {
        return this.AFInAppEventType.containsAll(aFd1uSDK.AFInAppEventType);
    }
}
