package j;

import java.util.ConcurrentModificationException;
import k.AbstractC0561a;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0539m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6291a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f6292b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6293c = new Object();

    public static final void a(C0525G c0525g) {
        int i3 = c0525g.f6262g;
        int[] iArr = c0525g.f6260e;
        Object[] objArr = c0525g.f6261f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f6293c) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        c0525g.f6259d = false;
        c0525g.f6262g = i4;
    }

    public static final void b(C0532f c0532f, int i3) {
        f2.j.f(c0532f, "<this>");
        c0532f.f6279d = new int[i3];
        c0532f.f6280e = new Object[i3];
    }

    public static final int c(C0532f c0532f, Object obj, int i3) {
        f2.j.f(c0532f, "<this>");
        int i4 = c0532f.f6281f;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0561a.a(c0532f.f6279d, c0532f.f6281f, i3);
            if (a3 < 0) {
                return a3;
            }
            if (f2.j.a(obj, c0532f.f6280e[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && c0532f.f6279d[i5] == i3) {
                if (f2.j.a(obj, c0532f.f6280e[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && c0532f.f6279d[i6] == i3; i6--) {
                if (f2.j.a(obj, c0532f.f6280e[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
