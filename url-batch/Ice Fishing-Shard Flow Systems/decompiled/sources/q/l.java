package q;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7298e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7299i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7300l;

    public /* synthetic */ l(int i2, Object obj, Object obj2, boolean z7) {
        this.f7297d = i2;
        this.f7298e = obj;
        this.f7299i = z7;
        this.f7300l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        switch (this.f7297d) {
            case 0:
                ((o) this.f7298e).onSessionEnded(this.f7299i, (Bundle) this.f7300l);
                return;
            case 1:
                ((o) this.f7298e).onVerticalScrollEvent(this.f7299i, (Bundle) this.f7300l);
                return;
            default:
                Context context = (Context) this.f7298e;
                K1.h hVar = (K1.h) this.f7300l;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = P0.f.t(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f7299i) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    hVar.d(null);
                }
        }
    }
}
