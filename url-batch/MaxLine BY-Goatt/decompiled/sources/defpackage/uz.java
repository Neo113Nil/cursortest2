package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class uz implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ uz(a00 a00Var, et etVar, vl2 vl2Var, lm1 lm1Var) {
        this.m = 0;
        this.n = a00Var;
        this.o = etVar;
        this.p = vl2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Object obj = this.p;
        Object obj2 = this.o;
        Object obj3 = this.n;
        o30 o30Var = null;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj3;
                et etVar = (et) obj2;
                vl2 vl2Var = (vl2) obj;
                tz tzVar = a00Var.M;
                et etVar2 = tzVar.b;
                try {
                    tzVar.b = etVar;
                    vl2 vl2Var2 = a00Var.G;
                    int[] iArr = a00Var.o;
                    zm1 zm1Var = a00Var.v;
                    a00Var.o = null;
                    a00Var.v = null;
                    try {
                        a00Var.G = vl2Var;
                        boolean z = tzVar.e;
                        try {
                            tzVar.e = false;
                            throw null;
                        } finally {
                        }
                    } catch (Throwable th) {
                        a00Var.G = vl2Var2;
                        a00Var.o = iArr;
                        a00Var.v = zm1Var;
                        throw th;
                    }
                } catch (Throwable th2) {
                    tzVar.b = etVar2;
                    throw th2;
                }
            case 1:
                m6 m6Var = (m6) obj3;
                zl2 zl2Var = (zl2) obj2;
                qw1 qw1Var = (qw1) obj;
                if (m6Var != null) {
                    zl2Var.a(zl2Var.c(m6Var) - zl2Var.t);
                }
                List g = s03.g(zl2Var, null, zl2Var.t, null);
                nz nzVar = (nz) zv.C(g);
                Integer num = nzVar != null ? nzVar.a : null;
                List c = qw1Var.c(num);
                if (num != null && !c.isEmpty()) {
                    nz nzVar2 = (nz) zv.u(c);
                    List r = zv.r(1, c);
                    nzVar2.getClass();
                    c = zv.E(pv.c(new nz(null, num)), r);
                }
                return zv.E(g, c);
            case 2:
                ((zn1) obj2).setValue(Boolean.FALSE);
                z71.H((a50) obj3, null, new fj(8, o30Var, (ij1) obj), 3);
                return Unit.a;
            default:
                z71.H((a50) obj3, null, new z62((ij1) obj2, (Context) obj, null, 3), 3);
                return Unit.a;
        }
    }

    public /* synthetic */ uz(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
