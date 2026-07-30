package androidx.compose.foundation;

import android.view.View;
import defpackage.bh1;
import defpackage.ca0;
import defpackage.ch1;
import defpackage.cm1;
import defpackage.in1;
import defpackage.ji2;
import defpackage.kv2;
import defpackage.pc0;
import defpackage.q40;
import defpackage.s03;
import defpackage.s72;
import defpackage.s93;
import defpackage.ul1;
import defpackage.v12;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MagnifierElement extends cm1 {
    public final s72 a;
    public final kv2 b;
    public final v12 c;

    public MagnifierElement(s72 s72Var, kv2 kv2Var, v12 v12Var) {
        this.a = s72Var;
        this.b = kv2Var;
        this.c = v12Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + in1.i(q40.d(Float.NaN, q40.d(Float.NaN, in1.h(in1.i(q40.d(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new bh1(this.a, this.b, this.c);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        bh1 bh1Var = (bh1) ul1Var;
        bh1Var.getClass();
        v12 v12Var = bh1Var.C;
        View view = bh1Var.D;
        ca0 ca0Var = bh1Var.E;
        bh1Var.A = this.a;
        bh1Var.B = this.b;
        v12 v12Var2 = this.c;
        bh1Var.C = v12Var2;
        View Q = s93.Q(bh1Var);
        ca0 ca0Var2 = s03.J(bh1Var).I;
        if (bh1Var.F != null) {
            ji2 ji2Var = ch1.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !v12Var2.b()) || !pc0.a(Float.NaN, Float.NaN) || !pc0.a(Float.NaN, Float.NaN) || !v12Var2.equals(v12Var) || !Q.equals(view) || !Intrinsics.b(ca0Var2, ca0Var)) {
                bh1Var.H0();
            }
        }
        bh1Var.I0();
    }
}
