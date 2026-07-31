package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import l0.q;
import m0.o;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3579a = q.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q.d().a(f3579a, "Received intent " + intent);
        try {
            o a7 = o.a(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (o.f5372m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = a7.f5381i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    a7.f5381i = goAsync;
                    if (a7.f5380h) {
                        goAsync.finish();
                        a7.f5381i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e4) {
            q.d().c(f3579a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
