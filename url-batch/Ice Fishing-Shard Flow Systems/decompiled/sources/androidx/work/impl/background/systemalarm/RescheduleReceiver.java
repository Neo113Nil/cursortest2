package androidx.work.impl.background.systemalarm;

import G0.s;
import H0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4108a = s.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s.d().a(f4108a, "Received intent " + intent);
        try {
            p a7 = p.a(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (p.f917m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = a7.f926i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    a7.f926i = goAsync;
                    if (a7.f925h) {
                        goAsync.finish();
                        a7.f926i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e7) {
            s.d().c(f4108a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e7);
        }
    }
}
