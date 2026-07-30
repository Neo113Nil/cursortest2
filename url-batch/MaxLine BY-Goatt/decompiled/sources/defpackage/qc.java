package defpackage;

import androidx.compose.ui.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qc extends o81 implements Function2 {
    public final /* synthetic */ fz2 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ zc p;
    public final /* synthetic */ fn2 q;
    public final /* synthetic */ my r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(fz2 fz2Var, Object obj, Function1 function1, zc zcVar, fn2 fn2Var, my myVar) {
        super(2);
        this.m = fz2Var;
        this.n = obj;
        this.o = function1;
        this.p = zcVar;
        this.q = fn2Var;
        this.r = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            Object M = a00Var.M();
            Function1 function1 = this.o;
            zc zcVar = this.p;
            Object obj3 = sz.a;
            if (M == obj3) {
                M = (r20) function1.invoke(zcVar);
                a00Var.i0(M);
            }
            r20 r20Var = (r20) M;
            fz2 fz2Var = this.m;
            cz2 f = fz2Var.f();
            lz1 lz1Var = fz2Var.d;
            Object c = f.c();
            Object obj4 = this.n;
            boolean g = a00Var.g(Intrinsics.b(c, obj4));
            Object M2 = a00Var.M();
            if (g || M2 == obj3) {
                M2 = Intrinsics.b(fz2Var.f().c(), obj4) ? uj0.b : ((r20) function1.invoke(zcVar)).b;
                a00Var.i0(M2);
            }
            uj0 uj0Var = (uj0) M2;
            Object M3 = a00Var.M();
            if (M3 == obj3) {
                M3 = new wc(Intrinsics.b(obj4, lz1Var.getValue()));
                a00Var.i0(M3);
            }
            wc wcVar = (wc) M3;
            ai0 ai0Var = r20Var.a;
            boolean h = a00Var.h(r20Var);
            Object M4 = a00Var.M();
            if (h || M4 == obj3) {
                M4 = new mc(0, r20Var);
                a00Var.i0(M4);
            }
            vl1 b = a.b((xt0) M4);
            wcVar.a.setValue(Boolean.valueOf(Intrinsics.b(obj4, lz1Var.getValue())));
            vl1 k = b.k(wcVar);
            boolean h2 = a00Var.h(obj4);
            Object M5 = a00Var.M();
            if (h2 || M5 == obj3) {
                M5 = new j6(5, obj4);
                a00Var.i0(M5);
            }
            Function1 function12 = (Function1) M5;
            boolean f2 = a00Var.f(uj0Var);
            Object M6 = a00Var.M();
            if (f2 || M6 == obj3) {
                M6 = new c0(3, uj0Var);
                a00Var.i0(M6);
            }
            androidx.compose.animation.a.a(this.m, function12, k, ai0Var, uj0Var, (Function2) M6, yj1.H(-616195562, new pc(this.q, obj4, zcVar, this.r, 0), a00Var), a00Var, 12582912);
        }
        return Unit.a;
    }
}
