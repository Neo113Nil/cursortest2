package f2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import io.appmetrica.analytics.impl.Zb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5629a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5632d;

    public /* synthetic */ q(Context context, boolean z, I1.h hVar) {
        this.f5631c = context;
        this.f5630b = z;
        this.f5632d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        switch (this.f5629a) {
            case 0:
                Context context = (Context) this.f5631c;
                I1.h hVar = (I1.h) this.f5632d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = B0.f.v(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f5630b) {
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
            default:
                Zb.a((Zb) this.f5631c, (LocationControllerObserver) this.f5632d, this.f5630b);
                return;
        }
    }

    public /* synthetic */ q(Zb zb, LocationControllerObserver locationControllerObserver, boolean z) {
        this.f5631c = zb;
        this.f5632d = locationControllerObserver;
        this.f5630b = z;
    }
}
