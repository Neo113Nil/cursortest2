package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emv implements emk {
    public final hvm a;
    public final jpt b;

    public emv(ldt ldtVar, Context context, hvm hvmVar, jpt jptVar, koe koeVar, koe koeVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ldtVar.n(hvmVar, jptVar, koeVar);
        this.a = hvmVar;
        this.b = jptVar;
        hoq.v(new dxi(this, context, 10, null));
        hoq.v(new eks(koeVar2, 6));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.emk
    public final void k() {
        hnu.aL(new ect(this, 7), this.a);
    }
}
