package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5023b;

    /* renamed from: c, reason: collision with root package name */
    public int f5024c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5025d;

    /* renamed from: e, reason: collision with root package name */
    public final o.x f5026e;

    /* renamed from: f, reason: collision with root package name */
    public final c6.k f5027f;

    public n1(int i, ArrayList arrayList) {
        this.f5022a = arrayList;
        this.f5023b = i;
        if (i < 0) {
            p1.a("Invalid start index");
        }
        this.f5025d = new ArrayList();
        o.x xVar = new o.x();
        int size = arrayList.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            r0 r0Var = (r0) this.f5022a.get(i9);
            int i10 = r0Var.f5062c;
            int i11 = r0Var.f5063d;
            xVar.g(i10, new k0(i9, i8, i11));
            i8 += i11;
        }
        this.f5026e = xVar;
        this.f5027f = a.a.r(new m1(this));
    }

    public final boolean a(int i, int i8) {
        int i9;
        o.x xVar = this.f5026e;
        k0 k0Var = (k0) xVar.b(i);
        if (k0Var == null) {
            return false;
        }
        int i10 = k0Var.f4985b;
        int i11 = i8 - k0Var.f4986c;
        k0Var.f4986c = i8;
        if (i11 == 0) {
            return true;
        }
        Object[] objArr = xVar.f5496c;
        long[] jArr = xVar.f5494a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j7 = jArr[i12];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j7) < 128) {
                        k0 k0Var2 = (k0) objArr[(i12 << 3) + i14];
                        if (k0Var2.f4985b >= i10 && !k0Var2.equals(k0Var) && (i9 = k0Var2.f4985b + i11) >= 0) {
                            k0Var2.f4985b = i9;
                        }
                    }
                    j7 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }
}
