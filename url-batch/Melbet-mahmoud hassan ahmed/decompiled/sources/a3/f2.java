package a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class f2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g2 f66a;

    /* synthetic */ f2(g2 g2Var, e2 e2Var) {
        this.f66a = g2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g2 g2Var;
        boolean z6;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            g2Var = this.f66a;
            z6 = true;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            g2Var = this.f66a;
            z6 = false;
        }
        g2Var.f76c = z6;
    }
}
