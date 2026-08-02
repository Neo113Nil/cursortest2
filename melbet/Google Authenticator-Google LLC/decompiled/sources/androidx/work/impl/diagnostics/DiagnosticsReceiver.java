package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.asq;
import defpackage.asr;
import defpackage.atd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = asq.b("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        asq.a();
        try {
            atd.d(context).f(new asr(DiagnosticsWorker.class).e());
        } catch (IllegalStateException e) {
            asq.a().d(a, "WorkManager is not initialized", e);
        }
    }
}
