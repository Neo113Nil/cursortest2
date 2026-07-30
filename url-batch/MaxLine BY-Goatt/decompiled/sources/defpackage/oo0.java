package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oo0 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo0(int i, int i2, Object obj) {
        super(1);
        this.m = i2;
        this.o = obj;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        int i2 = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                Boolean valueOf = Boolean.valueOf(((yo0) obj).K0(i2));
                ((c82) obj2).m = valueOf;
                return valueOf;
            default:
                vb1 vb1Var = (vb1) obj;
                q qVar = ((va1) obj2).a;
                nm2 d = ci2.d();
                ci2.j(d, ci2.f(d), d != null ? d.e() : null);
                qVar.getClass();
                for (int i3 = 0; i3 < 2; i3++) {
                    int i4 = i2 + i3;
                    vb1Var.getClass();
                    long j = yb1.a;
                    xb1 xb1Var = vb1Var.b;
                    mh mhVar = xb1Var.c;
                    if (mhVar != null) {
                        vb1Var.a.add(new n42(mhVar, i4, j, xb1Var.b));
                    }
                }
                return Unit.a;
        }
    }
}
