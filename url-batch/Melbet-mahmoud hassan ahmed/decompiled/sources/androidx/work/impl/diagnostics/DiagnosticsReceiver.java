package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import d0.j;
import d0.l;
import d0.t;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1519a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.c().a(f1519a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.d(context).b(l.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e7) {
            j.c().b(f1519a, "WorkManager is not initialized", e7);
        }
    }
}
