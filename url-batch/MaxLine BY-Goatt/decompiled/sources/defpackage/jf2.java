package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jf2 implements uf2 {
    public static final tt1 i = new tt1(10, sc.L, gs1.D);
    public final iz1 a;
    public float e;
    public final iz1 b = new iz1(0);
    public final bn1 c = new bn1();
    public final iz1 d = new iz1(Integer.MAX_VALUE);
    public final w80 f = new w80(new s72(2, this));
    public final ia0 g = ij2.f(new if2(this, 1));
    public final ia0 h = ij2.f(new if2(this, 0));

    public jf2(int i2) {
        this.a = new iz1(i2);
    }

    @Override // defpackage.uf2
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.uf2
    public final boolean c() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final Object d(ho1 ho1Var, Function2 function2, r30 r30Var) {
        Object d = this.f.d(ho1Var, function2, r30Var);
        return d == b50.m ? d : Unit.a;
    }

    @Override // defpackage.uf2
    public final float e(float f) {
        return this.f.e(f);
    }
}
