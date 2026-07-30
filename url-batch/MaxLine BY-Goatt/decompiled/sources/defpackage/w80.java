package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w80 implements uf2 {
    public final Function1 a;
    public final v80 b = new v80(this);
    public final mo1 c = new mo1();
    public final lz1 d;
    public final lz1 e;
    public final lz1 f;

    public w80(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = ij2.j(bool);
        this.e = ij2.j(bool);
        this.f = ij2.j(bool);
    }

    @Override // defpackage.uf2
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final Object d(ho1 ho1Var, Function2 function2, r30 r30Var) {
        Object t = j8.t(new ed(this, ho1Var, function2, null, 9), r30Var);
        return t == b50.m ? t : Unit.a;
    }

    @Override // defpackage.uf2
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
