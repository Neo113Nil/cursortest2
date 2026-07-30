package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sf0 {
    public final int a;
    public final List b;
    public final id c;
    public final vc0 d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final ne0 i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;
    public int o = Integer.MIN_VALUE;
    public final int[] p;

    public sf0(int i, List list, id idVar, vc0 vc0Var, int i2, int i3, int i4, long j, Object obj, Object obj2, ne0 ne0Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = idVar;
        this.d = vc0Var;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = ne0Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            zw0 zw0Var = (zw0) list.get(i7);
            i5 += zw0Var.e;
            i6 = Math.max(i6, zw0Var.d);
        }
        this.k = i5;
        int i8 = i5 + this.e;
        this.l = i8 >= 0 ? i8 : 0;
        this.m = i6;
        this.p = new int[this.b.size() * 2];
    }

    public final long a(int i) {
        if (i == 0 && this.b.size() == 0) {
            return this.j & 4294967295L;
        }
        int[] iArr = this.p;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    public final void b(yw0 yw0Var) {
        y3 y3Var = y3.H;
        if (this.o == Integer.MIN_VALUE) {
            r80.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zw0 zw0Var = (zw0) list.get(i);
            int i2 = zw0Var.e;
            long a = a(i);
            qy0.u(((vn0) this.i.a).g(this.g));
            long c = s90.c(a, this.f);
            int i3 = ax0.b;
            yw0Var.getClass();
            yw0.a(yw0Var, zw0Var);
            zw0Var.Y(s90.c(c, zw0Var.i), 0.0f, y3Var);
        }
    }

    public final void c(int i, int i2, int i3) {
        this.j = i;
        this.o = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            zw0 zw0Var = (zw0) list.get(i4);
            int i5 = i4 * 2;
            id idVar = this.c;
            if (idVar == null) {
                r80.b("null horizontalAlignment when isVertical == true");
                throw new kc0();
            }
            int a = idVar.a(zw0Var.d, i2, this.d);
            int[] iArr = this.p;
            iArr[i5] = a;
            iArr[i5 + 1] = i;
            i += zw0Var.e;
        }
    }
}
