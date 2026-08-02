package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dr extends dt {
    public final PowerManager a;
    final /* synthetic */ dy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(dy dyVar, Context context) {
        super(dyVar);
        this.b = dyVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.dt
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.dt
    public final void b() {
        this.b.M(true, true);
    }
}
