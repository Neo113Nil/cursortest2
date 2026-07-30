package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ir2 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ fk2 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ float p;
    public final /* synthetic */ my q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir2(vl1 vl1Var, fk2 fk2Var, long j, float f, my myVar) {
        super(2);
        this.m = vl1Var;
        this.n = fk2Var;
        this.o = j;
        this.p = f;
        this.q = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vl1 k;
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            vl1 b = kr2.b(((ca0) a00Var.j(p00.h)).D(0.0f), kr2.c(this.o, this.p, a00Var), this.m, this.n);
            gs1 gs1Var = gs1.J;
            AtomicInteger atomicInteger = wh2.a;
            k = b.k(new AppendedSemanticsElement(gs1Var, false)).k(new SuspendPointerInputElement(Unit.a, null, new qr2(new ub(2, null, 3)), 6));
            oj1 e = fp.e(qb2.p, true);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, k);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            this.q.invoke(a00Var, 0);
            a00Var.q(true);
        }
        return Unit.a;
    }
}
