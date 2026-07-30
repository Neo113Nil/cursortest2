package u;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;
import v.AbstractC0955a;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0937h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8035a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8036b = new Object();

    public static final void a(C0935f c0935f, int i2) {
        Intrinsics.checkNotNullParameter(c0935f, "<this>");
        int[] iArr = new int[i2];
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        c0935f.f8028d = iArr;
        Object[] objArr = new Object[i2];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        c0935f.f8029e = objArr;
    }

    public static final int b(C0935f c0935f, Object obj, int i2) {
        Intrinsics.checkNotNullParameter(c0935f, "<this>");
        int i5 = c0935f.f8030i;
        if (i5 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(c0935f, "<this>");
        try {
            int a7 = AbstractC0955a.a(c0935f.f8030i, i2, c0935f.f8028d);
            if (a7 < 0 || Intrinsics.a(obj, c0935f.f8029e[a7])) {
                return a7;
            }
            int i7 = a7 + 1;
            while (i7 < i5 && c0935f.f8028d[i7] == i2) {
                if (Intrinsics.a(obj, c0935f.f8029e[i7])) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = a7 - 1; i8 >= 0 && c0935f.f8028d[i8] == i2; i8--) {
                if (Intrinsics.a(obj, c0935f.f8029e[i8])) {
                    return i8;
                }
            }
            return ~i7;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
