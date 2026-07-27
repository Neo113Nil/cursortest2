package i;

import j.AbstractC0705a;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6929a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f6930b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6931c = new Object();

    public static final void a(H h4) {
        int i2 = h4.f6899j;
        int[] iArr = h4.f6897e;
        Object[] objArr = h4.f6898i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i5];
            if (obj != f6931c) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        h4.f6896d = false;
        h4.f6899j = i4;
    }

    public static final void b(C0671f c0671f, int i2) {
        Intrinsics.checkNotNullParameter(c0671f, "<this>");
        int[] iArr = new int[i2];
        c0671f.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        c0671f.f6916d = iArr;
        Object[] objArr = new Object[i2];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        c0671f.f6917e = objArr;
    }

    public static final int c(C0671f c0671f, Object obj, int i2) {
        Intrinsics.checkNotNullParameter(c0671f, "<this>");
        int i4 = c0671f.f6918i;
        if (i4 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(c0671f, "<this>");
        try {
            int a4 = AbstractC0705a.a(c0671f.f6916d, c0671f.f6918i, i2);
            if (a4 < 0 || Intrinsics.a(obj, c0671f.f6917e[a4])) {
                return a4;
            }
            int i5 = a4 + 1;
            while (i5 < i4 && c0671f.f6916d[i5] == i2) {
                if (Intrinsics.a(obj, c0671f.f6917e[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a4 - 1; i6 >= 0 && c0671f.f6916d[i6] == i2; i6--) {
                if (Intrinsics.a(obj, c0671f.f6917e[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
