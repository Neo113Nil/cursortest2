package androidx.work.impl.background.systemalarm;

import B.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import s0.s;
import t0.o;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4736a = s.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            o.a(context).f11885d.o(new l(intent, context, goAsync(), 7));
        } else {
            s.d().a(f4736a, B0.o.i("Ignoring unknown action ", action));
        }
    }
}
