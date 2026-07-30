package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.relocation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a40 extends o81 implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ cu1 B;
    public final /* synthetic */ ca0 C;
    public final /* synthetic */ sc1 m;
    public final /* synthetic */ pw2 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ dv2 q;
    public final /* synthetic */ nv2 r;
    public final /* synthetic */ ch2 s;
    public final /* synthetic */ vl1 t;
    public final /* synthetic */ vl1 u;
    public final /* synthetic */ vl1 v;
    public final /* synthetic */ vl1 w;
    public final /* synthetic */ op x;
    public final /* synthetic */ gv2 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(sc1 sc1Var, pw2 pw2Var, int i, int i2, dv2 dv2Var, nv2 nv2Var, ch2 ch2Var, vl1 vl1Var, vl1 vl1Var2, vl1 vl1Var3, vl1 vl1Var4, op opVar, gv2 gv2Var, boolean z, Function1 function1, cu1 cu1Var, ca0 ca0Var) {
        super(2);
        this.m = sc1Var;
        this.n = pw2Var;
        this.o = i;
        this.p = i2;
        this.q = dv2Var;
        this.r = nv2Var;
        this.s = ch2Var;
        this.t = vl1Var;
        this.u = vl1Var2;
        this.v = vl1Var3;
        this.w = vl1Var4;
        this.x = opVar;
        this.y = gv2Var;
        this.z = z;
        this.A = function1;
        this.B = cu1Var;
        this.C = ca0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vl1 r43Var;
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            sc1 sc1Var = this.m;
            vl1 e = b.e(sl1.a, ((pc0) sc1Var.g.getValue()).m, Float.NaN);
            int i = this.o;
            int i2 = this.p;
            pw2 pw2Var = this.n;
            vl1 n = bd3.n(e, new ox0(i, i2, pw2Var));
            nv2 nv2Var = this.r;
            long j = nv2Var.b;
            boolean h = a00Var.h(sc1Var);
            Object M = a00Var.M();
            if (h || M == sz.a) {
                M = new u(6, sc1Var);
                a00Var.i0(M);
            }
            Function0 function0 = (Function0) M;
            dv2 dv2Var = this.q;
            ww1 ww1Var = (ww1) dv2Var.e.getValue();
            int i3 = jw2.c;
            int i4 = (int) (j >> 32);
            long j2 = dv2Var.d;
            if (i4 == ((int) (j2 >> 32)) && (i4 = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                i4 = jw2.e(j);
            }
            dv2Var.d = j;
            xy2 r = z71.r(this.s, nv2Var.a);
            int ordinal = ww1Var.ordinal();
            if (ordinal == 0) {
                r43Var = new r43(dv2Var, i4, r, function0);
            } else {
                if (ordinal != 1) {
                    a.b();
                    return null;
                }
                r43Var = new by0(dv2Var, i4, r, function0);
            }
            hl2.a(a.a(bd3.n(yk3.v(n).k(r43Var).k(this.t).k(this.u), new mc(4, pw2Var)).k(this.v).k(this.w), this.x), yj1.H(-363167407, new wq(this.y, sc1Var, this.z, this.A, nv2Var, this.B, this.C, this.p, 2), a00Var), a00Var, 48);
        }
        return Unit.a;
    }
}
