package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Context;
import com.liulishuo.filedownloader.R$string;

/* loaded from: classes4.dex */
public class k {
    private static final String DEFAULT_NOTIFICATION_CHANNEL_ID = "filedownloader_channel";
    private static final String DEFAULT_NOTIFICATION_CHANNEL_NAME = "Filedownloader";
    private static final int DEFAULT_NOTIFICATION_ID = 17301506;
    private boolean needRecreateChannelId;
    private Notification notification;
    private String notificationChannelId;
    private String notificationChannelName;
    private int notificationId;

    public static class b {
        private boolean needRecreateChannelId;
        private Notification notification;
        private String notificationChannelId;
        private String notificationChannelName;
        private int notificationId;

        public k build() {
            k kVar = new k();
            String str = this.notificationChannelId;
            if (str == null) {
                str = k.DEFAULT_NOTIFICATION_CHANNEL_ID;
            }
            kVar.setNotificationChannelId(str);
            String str2 = this.notificationChannelName;
            if (str2 == null) {
                str2 = k.DEFAULT_NOTIFICATION_CHANNEL_NAME;
            }
            kVar.setNotificationChannelName(str2);
            int i8 = this.notificationId;
            if (i8 == 0) {
                i8 = 17301506;
            }
            kVar.setNotificationId(i8);
            kVar.setNeedRecreateChannelId(this.needRecreateChannelId);
            kVar.setNotification(this.notification);
            return kVar;
        }

        public b needRecreateChannelId(boolean z7) {
            this.needRecreateChannelId = z7;
            return this;
        }

        public b notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        public b notificationChannelId(String str) {
            this.notificationChannelId = str;
            return this;
        }

        public b notificationChannelName(String str) {
            this.notificationChannelName = str;
            return this;
        }

        public b notificationId(int i8) {
            this.notificationId = i8;
            return this;
        }
    }

    private Notification buildDefaultNotification(Context context) {
        String string = context.getString(R$string.default_filedownloader_notification_title);
        String string2 = context.getString(R$string.default_filedownloader_notification_content);
        j.a();
        Notification.Builder a8 = i.a(context, this.notificationChannelId);
        a8.setContentTitle(string).setContentText(string2).setSmallIcon(17301506);
        return a8.build();
    }

    public Notification getNotification(Context context) {
        if (this.notification == null) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "build default notification", new Object[0]);
            }
            this.notification = buildDefaultNotification(context);
        }
        return this.notification;
    }

    public String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public String getNotificationChannelName() {
        return this.notificationChannelName;
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public boolean isNeedRecreateChannelId() {
        return this.needRecreateChannelId;
    }

    public void setNeedRecreateChannelId(boolean z7) {
        this.needRecreateChannelId = z7;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public void setNotificationChannelName(String str) {
        this.notificationChannelName = str;
    }

    public void setNotificationId(int i8) {
        this.notificationId = i8;
    }

    public String toString() {
        return "ForegroundServiceConfig{notificationId=" + this.notificationId + ", notificationChannelId='" + this.notificationChannelId + "', notificationChannelName='" + this.notificationChannelName + "', notification=" + this.notification + ", needRecreateChannelId=" + this.needRecreateChannelId + '}';
    }

    private k() {
    }
}
