package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rf0 implements wk0 {
    public final sf0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final wk0 e;
    public final float f;
    public final boolean g;
    public final sn h;
    public final nr i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final et0 o;
    public final int p;
    public final int q;

    public rf0(sf0 sf0Var, int i, boolean z, float f, wk0 wk0Var, float f2, boolean z2, sn snVar, nr nrVar, long j, List list, int i2, int i3, int i4, et0 et0Var, int i5, int i6) {
        this.a = sf0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = wk0Var;
        this.f = f2;
        this.g = z2;
        this.h = snVar;
        this.i = nrVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = et0Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.wk0
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.wk0
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.wk0
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.wk0
    public final Function1 d() {
        return this.e.d();
    }

    @Override // defpackage.wk0
    public final int e() {
        return this.e.e();
    }

    public final rf0 f(int i, boolean z) {
        sf0 sf0Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (sf0Var = this.a) == null) {
            return null;
        }
        int i2 = sf0Var.l;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        sf0 sf0Var2 = (sf0) CollectionsKt.p(list);
        sf0 sf0Var3 = (sf0) CollectionsKt.s(list);
        if (sf0Var2.n || sf0Var3.n) {
            return null;
        }
        int i4 = sf0Var2.j;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + sf0Var2.l) - i6, (sf0Var3.j + sf0Var3.l) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - sf0Var3.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            sf0 sf0Var4 = (sf0) list.get(i7);
            sf0Var4.getClass();
            int[] iArr = sf0Var4.p;
            if (!sf0Var4.n) {
                sf0Var4.j += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = sf0Var4.b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        qy0.u(((vn0) sf0Var4.i.a).g(sf0Var4.g));
                    }
                }
            }
        }
        return new rf0(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        wk0 wk0Var = this.e;
        return (wk0Var.e() << 32) | (wk0Var.c() & 4294967295L);
    }
}
