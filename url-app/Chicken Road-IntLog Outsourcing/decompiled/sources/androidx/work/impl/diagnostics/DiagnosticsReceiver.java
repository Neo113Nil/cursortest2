package androidx.work.impl.diagnostics;

import B4.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import s0.s;
import t0.k;
import t0.o;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4745a = s.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        s d6 = s.d();
        String str = f4745a;
        d6.a(str, "Requesting diagnostics");
        try {
            o a6 = o.a(context);
            List singletonList = Collections.singletonList(new i(DiagnosticsWorker.class).w());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new k(a6, null, singletonList).E();
        } catch (IllegalStateException e3) {
            s.d().c(str, "WorkManager is not initialized", e3);
        }
    }
}
