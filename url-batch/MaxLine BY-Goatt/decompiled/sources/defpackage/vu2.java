package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vu2 extends o81 implements Function1 {
    public final /* synthetic */ n12 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ n12 p;
    public final /* synthetic */ n12 q;
    public final /* synthetic */ n12 r;
    public final /* synthetic */ n12 s;
    public final /* synthetic */ n12 t;
    public final /* synthetic */ n12 u;
    public final /* synthetic */ n12 v;
    public final /* synthetic */ n12 w;
    public final /* synthetic */ wu2 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ qj1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu2(n12 n12Var, int i, int i2, n12 n12Var2, n12 n12Var3, n12 n12Var4, n12 n12Var5, n12 n12Var6, n12 n12Var7, n12 n12Var8, n12 n12Var9, wu2 wu2Var, int i3, qj1 qj1Var) {
        super(1);
        this.m = n12Var;
        this.n = i;
        this.o = i2;
        this.p = n12Var2;
        this.q = n12Var3;
        this.r = n12Var4;
        this.s = n12Var5;
        this.t = n12Var6;
        this.u = n12Var7;
        this.v = n12Var8;
        this.w = n12Var9;
        this.x = wu2Var;
        this.y = i3;
        this.z = qj1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        m12 m12Var = (m12) obj;
        wu2 wu2Var = this.x;
        boolean z2 = wu2Var.a;
        qj1 qj1Var = this.z;
        n12 n12Var = this.w;
        n12 n12Var2 = this.u;
        n12 n12Var3 = this.t;
        n12 n12Var4 = this.s;
        n12 n12Var5 = this.r;
        n12 n12Var6 = this.q;
        int i = this.o;
        n12 n12Var7 = this.m;
        int i2 = this.n;
        n12 n12Var8 = this.p;
        n12 n12Var9 = this.v;
        if (n12Var7 != null) {
            int i3 = n12Var7.n + this.y;
            float f = wu2Var.b;
            float d = qj1Var.d();
            m12.h(m12Var, n12Var9, 0L);
            float f2 = pu2.b;
            int i4 = i - (n12Var != null ? n12Var.n : 0);
            if (n12Var5 != null) {
                m12.i(m12Var, n12Var5, 0, Math.round(((i4 - n12Var5.n) / 2.0f) * 1.0f));
            }
            m12.i(m12Var, n12Var7, n12Var5 != null ? n12Var5.m : 0, (z2 ? Math.round(((i4 - n12Var7.n) / 2.0f) * 1.0f) : si1.b(pu2.b * d)) - si1.b((r2 - r0) * f));
            if (n12Var3 != null) {
                m12.i(m12Var, n12Var3, n12Var5 != null ? n12Var5.m : 0, i3);
            }
            int i5 = (n12Var5 != null ? n12Var5.m : 0) + (n12Var3 != null ? n12Var3.m : 0);
            m12.i(m12Var, n12Var8, i5, i3);
            if (n12Var6 != null) {
                m12.i(m12Var, n12Var6, i5, i3);
            }
            if (n12Var2 != null) {
                m12.i(m12Var, n12Var2, (i2 - (n12Var4 != null ? n12Var4.m : 0)) - n12Var2.m, i3);
            }
            if (n12Var4 != null) {
                m12.i(m12Var, n12Var4, i2 - n12Var4.m, Math.round(((i4 - n12Var4.n) / 2.0f) * 1.0f));
            }
            if (n12Var != null) {
                m12.i(m12Var, n12Var, 0, i4);
            }
        } else {
            float d2 = qj1Var.d();
            yx1 yx1Var = wu2Var.c;
            m12.h(m12Var, n12Var9, 0L);
            float f3 = pu2.b;
            int i6 = i - (n12Var != null ? n12Var.n : 0);
            int b = si1.b(yx1Var.d() * d2);
            if (n12Var5 != null) {
                m12.i(m12Var, n12Var5, 0, Math.round(((i6 - n12Var5.n) / 2.0f) * 1.0f));
            }
            if (n12Var3 != null) {
                z = z2;
                m12.i(m12Var, n12Var3, n12Var5 != null ? n12Var5.m : 0, ak2.k(z, i6, b, n12Var3));
            } else {
                z = z2;
            }
            int i7 = (n12Var5 != null ? n12Var5.m : 0) + (n12Var3 != null ? n12Var3.m : 0);
            m12.i(m12Var, n12Var8, i7, ak2.k(z, i6, b, n12Var8));
            if (n12Var6 != null) {
                m12.i(m12Var, n12Var6, i7, ak2.k(z, i6, b, n12Var6));
            }
            if (n12Var2 != null) {
                m12.i(m12Var, n12Var2, (i2 - (n12Var4 != null ? n12Var4.m : 0)) - n12Var2.m, ak2.k(z, i6, b, n12Var2));
            }
            if (n12Var4 != null) {
                m12.i(m12Var, n12Var4, i2 - n12Var4.m, Math.round(((i6 - n12Var4.n) / 2.0f) * 1.0f));
            }
            if (n12Var != null) {
                m12.i(m12Var, n12Var, 0, i6);
            }
        }
        return Unit.a;
    }
}
