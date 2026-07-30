package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d22 implements z11 {
    public final boolean a;
    public final float b;
    public final zn1 c;

    public d22(boolean z, float f, zn1 zn1Var) {
        this.a = z;
        this.b = f;
        this.c = zn1Var;
    }

    @Override // defpackage.z11
    public final a21 b(b41 b41Var, a00 a00Var) {
        long j;
        qa2 qa2Var;
        a00Var.X(988743187);
        cx cxVar = (cx) a00Var.j(db2.a);
        zn1 zn1Var = this.c;
        if (((aw) zn1Var.getValue()).a != aw.g) {
            a00Var.X(-303571590);
            a00Var.q(false);
            j = ((aw) zn1Var.getValue()).a;
        } else {
            a00Var.X(-303521246);
            switch (cxVar.a) {
                case 0:
                    a00Var.X(-1844533201);
                    j = ((aw) a00Var.j(e20.a)).a;
                    a00Var.q(false);
                    break;
                default:
                    a00Var.X(2042140174);
                    j = aw.b;
                    ap.F(j);
                    a00Var.q(false);
                    break;
            }
            a00Var.q(false);
        }
        zn1 k = ij2.k(new aw(j), a00Var);
        switch (cxVar.a) {
            case 0:
                a00Var.X(-290975286);
                qa2Var = l41.i;
                a00Var.q(false);
                break;
            default:
                a00Var.X(-1629816343);
                qa2Var = ((double) ap.F(aw.b)) > 0.5d ? db2.b : db2.c;
                a00Var.q(false);
                break;
        }
        zn1 k2 = ij2.k(qa2Var, a00Var);
        a00Var.X(331259447);
        ViewGroup b = eb2.b((View) a00Var.j(AndroidCompositionLocals_androidKt.f));
        boolean f = a00Var.f(b41Var) | a00Var.f(this) | a00Var.f(b);
        Object M = a00Var.M();
        Object obj = sz.a;
        if (f || M == obj) {
            Object fbVar = new fb(this.a, this.b, k, k2, b);
            a00Var.i0(fbVar);
            M = fbVar;
        }
        fb fbVar2 = (fb) M;
        a00Var.q(false);
        boolean f2 = a00Var.f(b41Var) | a00Var.h(fbVar2);
        Object M2 = a00Var.M();
        if (f2 || M2 == obj) {
            M2 = new ed(b41Var, fbVar2, (o30) null, 15);
            a00Var.i0(M2);
        }
        l41.i(fbVar2, b41Var, (Function2) M2, a00Var);
        a00Var.q(false);
        return fbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d22)) {
            return false;
        }
        d22 d22Var = (d22) obj;
        return this.a == d22Var.a && pc0.a(this.b, d22Var.b) && this.c.equals(d22Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + q40.d(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
