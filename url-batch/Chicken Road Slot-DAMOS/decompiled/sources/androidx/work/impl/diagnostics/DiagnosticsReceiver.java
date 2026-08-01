package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import p.e;
import t5.o;
import u5.j;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f782a = o.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        o d10 = o.d();
        String str = f782a;
        d10.a(str, "Requesting diagnostics");
        try {
            m a9 = m.a(context);
            List singletonList = Collections.singletonList(new e(DiagnosticsWorker.class).d());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new j(a9, null, singletonList).a();
        } catch (IllegalStateException e2) {
            o.d().c(str, "WorkManager is not initialized", e2);
        }
    }
}
