package androidx.work.impl.diagnostics;

import D0.j;
import G0.s;
import H0.k;
import H0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4116a = s.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        s d7 = s.d();
        String str = f4116a;
        d7.a(str, "Requesting diagnostics");
        try {
            p a7 = p.a(context);
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            List singletonList = Collections.singletonList(new j(DiagnosticsWorker.class).z());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new k(a7, null, singletonList).d0();
        } catch (IllegalStateException e7) {
            s.d().c(str, "WorkManager is not initialized", e7);
        }
    }
}
