package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes2.dex */
public class e {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "e";
    public static e mSingleton;
    public final Context mContext;
    public boolean shutdown;

    private static class a {
        private final Context mContext;

        public a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.mContext = context.getApplicationContext();
        }

        public e build() {
            return new e(this.mContext);
        }
    }

    public e(Context context) {
        this.mContext = context;
    }

    public static e with(Context context) {
        if (mSingleton == null) {
            synchronized (e.class) {
                try {
                    if (mSingleton == null) {
                        mSingleton = new a(context).build();
                    }
                } finally {
                }
            }
        }
        return mSingleton;
    }

    public void cancel(int i8) {
        ((NotificationManager) this.mContext.getSystemService("notification")).cancel(i8);
    }

    public c load(int i8) {
        return new c(i8);
    }

    public void shutdown() {
        if (this == mSingleton) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.shutdown) {
            return;
        }
        this.shutdown = true;
    }

    public void cancel(String str, int i8) {
        ((NotificationManager) this.mContext.getSystemService("notification")).cancel(str, i8);
    }
}
