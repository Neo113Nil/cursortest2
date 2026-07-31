package androidx.work.impl.background.systemalarm;

import A.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import l0.q;
import m0.o;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3578a = q.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            o.a(context).f5376d.a(new n(intent, context, goAsync(), 9));
            return;
        }
        q.d().a(f3578a, "Ignoring unknown action " + action);
    }
}
