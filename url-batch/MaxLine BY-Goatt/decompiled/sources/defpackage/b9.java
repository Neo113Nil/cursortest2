package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b9 extends o81 implements Function1 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ float n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(float f, y9 y9Var, mo moVar) {
        super(1);
        this.n = f;
        this.o = y9Var;
        this.p = moVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Object obj2 = this.p;
        float f = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                k91 k91Var = (k91) obj;
                k91Var.a();
                y9 y9Var = (y9) obj3;
                mo moVar = (mo) obj2;
                ns nsVar = k91Var.m;
                mh mhVar = nsVar.n;
                long v = mhVar.v();
                mhVar.o().m();
                try {
                    ar0 ar0Var = (ar0) mhVar.n;
                    ar0Var.z(f, 0.0f);
                    ls o = ((mh) ar0Var.n).o();
                    o.h(Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                    o.i();
                    o.h(-Float.intBitsToFloat(0), -Float.intBitsToFloat(0));
                    nsVar.c(y9Var, moVar);
                    mhVar.o().j();
                    mhVar.J(v);
                    return Unit.a;
                } catch (Throwable th) {
                    mhVar.o().j();
                    mhVar.J(v);
                    throw th;
                }
            case 1:
                m12 m12Var = (m12) obj;
                n12 n12Var = (n12) obj3;
                jc jcVar = ((mx2) obj2).D;
                m12.i(m12Var, n12Var, jcVar != null ? (int) ((Number) jcVar.d()).floatValue() : (int) f, 0);
                return Unit.a;
            default:
                long longValue = ((Number) obj).longValue();
                z23 z23Var = (z23) obj3;
                if (z23Var.b == Long.MIN_VALUE) {
                    z23Var.b = longValue;
                }
                float f2 = z23Var.e;
                od odVar = new od(f2);
                od odVar2 = z23.f;
                long e = f == 0.0f ? z23Var.a.e(new od(f2), odVar2, z23Var.c) : si1.c((longValue - z23Var.b) / f);
                float f3 = ((od) z23Var.a.n(e, odVar, odVar2, z23Var.c)).a;
                z23Var.c = (od) z23Var.a.l(e, odVar, odVar2, z23Var.c);
                z23Var.b = longValue;
                float f4 = z23Var.e - f3;
                z23Var.e = f3;
                ((Function1) obj2).invoke(Float.valueOf(f4));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(n12 n12Var, mx2 mx2Var, float f) {
        super(1);
        this.o = n12Var;
        this.p = mx2Var;
        this.n = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(z23 z23Var, float f, Function1 function1) {
        super(1);
        this.o = z23Var;
        this.n = f;
        this.p = function1;
    }
}
