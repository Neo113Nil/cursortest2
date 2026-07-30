package androidx.work.impl.diagnostics;

import J0.s;
import K0.p;
import Y2.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5503a = s.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        s d2 = s.d();
        String str = f5503a;
        d2.a(str, "Requesting diagnostics");
        try {
            p.b(context).a(new e(DiagnosticsWorker.class).n());
        } catch (IllegalStateException e6) {
            s.d().c(str, "WorkManager is not initialized", e6);
        }
    }
}
