package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.asq;
import defpackage.auy;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = asq.b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        asq.a();
        Objects.toString(intent);
        try {
            auy i = auy.i(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (auy.a) {
                BroadcastReceiver.PendingResult pendingResult = i.h;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                i.h = goAsync;
                if (i.g) {
                    i.h.finish();
                    i.h = null;
                }
            }
        } catch (IllegalStateException e) {
            asq.a().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
