package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j40 extends o81 implements xt0 {
    public final /* synthetic */ cu1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ nv2 o;
    public final /* synthetic */ gv2 p;
    public final /* synthetic */ sc1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(cu1 cu1Var, boolean z, nv2 nv2Var, gv2 gv2Var, sc1 sc1Var) {
        super(3);
        this.m = cu1Var;
        this.n = z;
        this.o = nv2Var;
        this.p = gv2Var;
        this.q = sc1Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        nv2 nv2Var = this.o;
        yd ydVar = nv2Var.a;
        cu1 cu1Var = this.m;
        if (!booleanValue) {
            intValue = cu1Var.b(intValue);
        }
        if (!booleanValue) {
            intValue2 = cu1Var.b(intValue2);
        }
        boolean z = false;
        if (this.n) {
            long j = nv2Var.b;
            int i = jw2.c;
            if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                int min = Math.min(intValue, intValue2);
                zw0 zw0Var = zw0.m;
                gv2 gv2Var = this.p;
                if (min < 0 || Math.max(intValue, intValue2) > ydVar.n.length()) {
                    gv2Var.p(false);
                    gv2Var.n(zw0Var);
                } else {
                    if (booleanValue || intValue == intValue2) {
                        gv2Var.p(false);
                        gv2Var.n(zw0Var);
                    } else {
                        gv2Var.f(true);
                    }
                    this.q.t.invoke(new nv2(ydVar, th2.a(intValue, intValue2), (jw2) null));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
