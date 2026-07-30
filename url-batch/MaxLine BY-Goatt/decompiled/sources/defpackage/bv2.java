package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bv2 implements uf2 {
    public final /* synthetic */ uf2 a;
    public final ia0 b;
    public final ia0 c;

    public bv2(uf2 uf2Var, dv2 dv2Var) {
        this.a = uf2Var;
        this.b = ij2.f(new av2(dv2Var, 1));
        this.c = ij2.f(new av2(dv2Var, 0));
    }

    @Override // defpackage.uf2
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.uf2
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final Object d(ho1 ho1Var, Function2 function2, r30 r30Var) {
        return this.a.d(ho1Var, function2, r30Var);
    }

    @Override // defpackage.uf2
    public final float e(float f) {
        return this.a.e(f);
    }
}
