package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lx1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ n12 o;
    public final /* synthetic */ n12 p;
    public final /* synthetic */ n12 q;
    public final /* synthetic */ n12 r;
    public final /* synthetic */ n12 s;
    public final /* synthetic */ n12 t;
    public final /* synthetic */ n12 u;
    public final /* synthetic */ n12 v;
    public final /* synthetic */ n12 w;
    public final /* synthetic */ mx1 x;
    public final /* synthetic */ qj1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx1(int i, int i2, n12 n12Var, n12 n12Var2, n12 n12Var3, n12 n12Var4, n12 n12Var5, n12 n12Var6, n12 n12Var7, n12 n12Var8, n12 n12Var9, mx1 mx1Var, qj1 qj1Var) {
        super(1);
        this.m = i;
        this.n = i2;
        this.o = n12Var;
        this.p = n12Var2;
        this.q = n12Var3;
        this.r = n12Var4;
        this.s = n12Var5;
        this.t = n12Var6;
        this.u = n12Var7;
        this.v = n12Var8;
        this.w = n12Var9;
        this.x = mx1Var;
        this.y = qj1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m12 m12Var = (m12) obj;
        mx1 mx1Var = this.x;
        float f = mx1Var.c;
        boolean z = mx1Var.b;
        qj1 qj1Var = this.y;
        float d = qj1Var.d();
        u81 layoutDirection = qj1Var.getLayoutDirection();
        yx1 yx1Var = mx1Var.d;
        int i = kx1.b;
        m12.h(m12Var, this.v, 0L);
        float f2 = pu2.b;
        n12 n12Var = this.w;
        int i2 = this.m - (n12Var != null ? n12Var.n : 0);
        int b = si1.b(yx1Var.d() * d);
        int b2 = si1.b(a.f(yx1Var, layoutDirection) * d);
        float f3 = pu2.c * d;
        n12 n12Var2 = this.o;
        if (n12Var2 != null) {
            m12.i(m12Var, n12Var2, 0, Math.round(((i2 - n12Var2.n) / 2.0f) * 1.0f));
        }
        n12 n12Var3 = this.t;
        if (n12Var3 != null) {
            m12.i(m12Var, n12Var3, si1.b(n12Var2 == null ? 0.0f : (1.0f - f) * (n12Var2.m - f3)) + b2, yk3.L(f, z ? Math.round(((i2 - n12Var3.n) / 2.0f) * 1.0f) : b, -(n12Var3.n / 2)));
        }
        n12 n12Var4 = this.q;
        if (n12Var4 != null) {
            m12.i(m12Var, n12Var4, n12Var2 != null ? n12Var2.m : 0, kx1.e(z, i2, b, n12Var3, n12Var4));
        }
        int i3 = (n12Var2 != null ? n12Var2.m : 0) + (n12Var4 != null ? n12Var4.m : 0);
        n12 n12Var5 = this.s;
        m12.i(m12Var, n12Var5, i3, kx1.e(z, i2, b, n12Var3, n12Var5));
        n12 n12Var6 = this.u;
        if (n12Var6 != null) {
            m12.i(m12Var, n12Var6, i3, kx1.e(z, i2, b, n12Var3, n12Var6));
        }
        int i4 = this.n;
        n12 n12Var7 = this.p;
        n12 n12Var8 = this.r;
        if (n12Var8 != null) {
            m12.i(m12Var, n12Var8, (i4 - (n12Var7 != null ? n12Var7.m : 0)) - n12Var8.m, kx1.e(z, i2, b, n12Var3, n12Var8));
        }
        if (n12Var7 != null) {
            m12.i(m12Var, n12Var7, i4 - n12Var7.m, Math.round(((i2 - n12Var7.n) / 2.0f) * 1.0f));
        }
        if (n12Var != null) {
            m12.i(m12Var, n12Var, 0, i2);
        }
        return Unit.a;
    }
}
