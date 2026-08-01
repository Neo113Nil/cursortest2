package s;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8357a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f8358b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8359c = new Object();

    public static final void a(s0 s0Var) {
        int i3 = s0Var.f8376r;
        int[] iArr = s0Var.f8374e;
        Object[] objArr = s0Var.f8375i;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            Object obj = objArr[i11];
            if (obj != f8359c) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        s0Var.f8373d = false;
        s0Var.f8376r = i10;
    }

    public static final void b(f fVar, int i3) {
        fVar.f8296d = new int[i3];
        fVar.f8297e = new Object[i3];
    }

    public static final int c(f fVar, Object obj, int i3) {
        int i10 = fVar.f8298i;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a9 = t.a.a(i10, i3, fVar.f8296d);
            if (a9 < 0 || Intrinsics.a(obj, fVar.f8297e[a9])) {
                return a9;
            }
            int i11 = a9 + 1;
            while (i11 < i10 && fVar.f8296d[i11] == i3) {
                if (Intrinsics.a(obj, fVar.f8297e[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a9 - 1; i12 >= 0 && fVar.f8296d[i12] == i3; i12--) {
                if (Intrinsics.a(obj, fVar.f8297e[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
