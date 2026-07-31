package j;

import java.util.ConcurrentModificationException;
import k.AbstractC0522a;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0495m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5173a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f5174b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5175c = new Object();

    public static final void a(C0481G c0481g) {
        int i3 = c0481g.f5144g;
        int[] iArr = c0481g.f5142e;
        Object[] objArr = c0481g.f5143f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f5175c) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        c0481g.f5141d = false;
        c0481g.f5144g = i4;
    }

    public static final void b(C0488f c0488f, int i3) {
        Z1.i.f(c0488f, "<this>");
        c0488f.f5161d = new int[i3];
        c0488f.f5162e = new Object[i3];
    }

    public static final int c(C0488f c0488f, Object obj, int i3) {
        Z1.i.f(c0488f, "<this>");
        int i4 = c0488f.f5163f;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0522a.a(c0488f.f5161d, c0488f.f5163f, i3);
            if (a3 < 0) {
                return a3;
            }
            if (Z1.i.a(obj, c0488f.f5162e[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && c0488f.f5161d[i5] == i3) {
                if (Z1.i.a(obj, c0488f.f5162e[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && c0488f.f5161d[i6] == i3; i6--) {
                if (Z1.i.a(obj, c0488f.f5162e[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
