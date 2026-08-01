package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t5.o;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f774a = o.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.d().a(f774a, "Received intent " + intent);
        try {
            m a9 = m.a(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (m.f9648m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = a9.f9656i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    a9.f9656i = goAsync;
                    if (a9.f9655h) {
                        goAsync.finish();
                        a9.f9656i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e2) {
            o.d().c(f774a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
