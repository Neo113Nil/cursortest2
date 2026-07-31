package androidx.work.impl.diagnostics;

import B0.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import l0.q;
import m0.k;
import m0.o;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3587a = q.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q d7 = q.d();
        String str = f3587a;
        d7.a(str, "Requesting diagnostics");
        try {
            o a7 = o.a(context);
            List singletonList = Collections.singletonList(new c(DiagnosticsWorker.class).f());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new k(a7, null, singletonList).H();
        } catch (IllegalStateException e4) {
            q.d().c(str, "WorkManager is not initialized", e4);
        }
    }
}
