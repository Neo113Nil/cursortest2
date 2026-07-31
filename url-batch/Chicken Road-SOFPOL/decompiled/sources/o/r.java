package o;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5525a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f5526b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5527c = new Object();

    public static final void a(u0 u0Var) {
        int i = u0Var.f5550g;
        int[] iArr = u0Var.f5548e;
        Object[] objArr = u0Var.f5549f;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            if (obj != f5527c) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        u0Var.f5547d = false;
        u0Var.f5550g = i8;
    }

    public static final int b(f fVar, Object obj, int i) {
        int i8 = fVar.f5446f;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a8 = p.a.a(i8, i, fVar.f5444d);
            if (a8 < 0 || q6.i.a(obj, fVar.f5445e[a8])) {
                return a8;
            }
            int i9 = a8 + 1;
            while (i9 < i8 && fVar.f5444d[i9] == i) {
                if (q6.i.a(obj, fVar.f5445e[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a8 - 1; i10 >= 0 && fVar.f5444d[i10] == i; i10--) {
                if (q6.i.a(obj, fVar.f5445e[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
