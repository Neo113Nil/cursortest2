package androidx.compose.foundation;

import defpackage.a00;
import defpackage.jf2;
import defpackage.o81;
import defpackage.s93;
import defpackage.vl1;
import defpackage.ww1;
import defpackage.xt0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e extends o81 implements xt0 {
    public final /* synthetic */ jf2 m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jf2 jf2Var, boolean z) {
        super(3);
        this.m = jf2Var;
        this.n = z;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        a00 a00Var = (a00) obj2;
        ((Number) obj3).intValue();
        a00Var.X(1478351300);
        jf2 jf2Var = this.m;
        boolean z = this.n;
        vl1 k = s93.R(new ScrollSemanticsElement(jf2Var, z), jf2Var, z ? ww1.m : ww1.n, true, null, jf2Var.c, null, a00Var, 64).k(new ScrollingLayoutElement(jf2Var, z));
        a00Var.q(false);
        return k;
    }
}
