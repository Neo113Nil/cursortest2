package androidx.compose.foundation;

import defpackage.a00;
import defpackage.bn1;
import defpackage.fb2;
import defpackage.o81;
import defpackage.sl1;
import defpackage.sz;
import defpackage.vl1;
import defpackage.xt0;
import defpackage.z11;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b extends o81 implements xt0 {
    public final /* synthetic */ z11 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ fb2 p;
    public final /* synthetic */ Function0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z11 z11Var, boolean z, String str, fb2 fb2Var, Function0 function0) {
        super(3);
        this.m = z11Var;
        this.n = z;
        this.o = str;
        this.p = fb2Var;
        this.q = function0;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        a00 a00Var = (a00) obj2;
        ((Number) obj3).intValue();
        a00Var.X(-1525724089);
        Object M = a00Var.M();
        if (M == sz.a) {
            M = new bn1();
            a00Var.i0(M);
        }
        bn1 bn1Var = (bn1) M;
        vl1 k = d.a(sl1.a, bn1Var, this.m).k(new ClickableElement(bn1Var, null, this.n, this.o, this.p, this.q));
        a00Var.q(false);
        return k;
    }
}
