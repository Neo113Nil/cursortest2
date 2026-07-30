package defpackage;

import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nq1 extends o81 implements Function2 {
    public final /* synthetic */ jq1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ my r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq1(jq1 jq1Var, boolean z, boolean z2, Function2 function2, boolean z3, my myVar) {
        super(2);
        this.m = jq1Var;
        this.n = z;
        this.o = z2;
        this.p = function2;
        this.q = z3;
        this.r = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vl1 vl1Var;
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            boolean z = this.o;
            boolean z2 = this.n;
            jq1 jq1Var = this.m;
            so2 a = ml2.a(!z ? jq1Var.f : z2 ? jq1Var.a : jq1Var.d, bd3.P(100, 6, null), a00Var);
            if (this.p == null || !(this.q || z2)) {
                vl1Var = sl1.a;
            } else {
                AtomicInteger atomicInteger = wh2.a;
                vl1Var = new ClearAndSetSemanticsElement();
            }
            oj1 e = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, vl1Var);
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
            yk3.a(e20.a.a(new aw(((aw) a.getValue()).a)), this.r, a00Var, 8);
            a00Var.q(true);
        }
        return Unit.a;
    }
}
