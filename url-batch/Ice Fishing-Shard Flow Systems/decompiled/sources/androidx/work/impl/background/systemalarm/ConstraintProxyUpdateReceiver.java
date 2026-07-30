package androidx.work.impl.background.systemalarm;

import F.n;
import G0.s;
import H0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4107a = s.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.a(context).f921d.r(new n(intent, context, goAsync(), 2));
            return;
        }
        s.d().a(f4107a, "Ignoring unknown action " + action);
    }
}
