package I;

import j.AbstractC0520B;
import j.C0547u;

/* loaded from: classes.dex */
public final class E extends S.A {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2649h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f2650c;

    /* renamed from: d, reason: collision with root package name */
    public int f2651d;

    /* renamed from: e, reason: collision with root package name */
    public C0547u f2652e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2653f;

    /* renamed from: g, reason: collision with root package name */
    public int f2654g;

    public E() {
        C0547u c0547u = AbstractC0520B.f6252a;
        f2.j.d(c0547u, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f2652e = c0547u;
        this.f2653f = f2649h;
    }

    @Override // S.A
    public final void a(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        E e3 = (E) a3;
        this.f2652e = e3.f2652e;
        this.f2653f = e3.f2653f;
        this.f2654g = e3.f2654g;
    }

    @Override // S.A
    public final S.A b() {
        return new E();
    }

    public final boolean c(F f3, S.i iVar) {
        boolean z3;
        boolean z4;
        Object obj = S.p.f4241b;
        synchronized (obj) {
            z3 = true;
            if (this.f2650c == iVar.d()) {
                if (this.f2651d == iVar.h()) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        if (this.f2653f == f2649h || (z4 && this.f2654g != d(f3, iVar))) {
            z3 = false;
        }
        if (z3 && z4) {
            synchronized (obj) {
                this.f2650c = iVar.d();
                this.f2651d = iVar.h();
            }
        }
        return z3;
    }

    public final int d(F f3, S.i iVar) {
        C0547u c0547u;
        int i3;
        int i4;
        int i5;
        int i6;
        S.A j3;
        synchronized (S.p.f4241b) {
            c0547u = this.f2652e;
        }
        char c2 = 7;
        if (c0547u.f6334e == 0) {
            return 7;
        }
        K.d C = C0143d.C();
        int i7 = C.f3216f;
        int i8 = 1;
        if (i7 > 0) {
            Object[] objArr = C.f3214d;
            int i9 = 0;
            do {
                ((C0165o) objArr[i9]).b();
                i9++;
            } while (i9 < i7);
        }
        try {
            Object[] objArr2 = c0547u.f6331b;
            int[] iArr = c0547u.f6332c;
            long[] jArr = c0547u.f6330a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 7;
                int i11 = 0;
                while (true) {
                    long j4 = jArr[i11];
                    if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j4 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                S.y yVar = (S.y) objArr2[i15];
                                if (iArr[i15] == i8) {
                                    if (yVar instanceof F) {
                                        F f4 = (F) yVar;
                                        i3 = 0;
                                        try {
                                            j3 = f4.g((E) S.p.j(f4.f2671g, iVar), iVar, false, f4.f2669e);
                                        } catch (Throwable th) {
                                            th = th;
                                            int i16 = C.f3216f;
                                            if (i16 > 0) {
                                                Object[] objArr3 = C.f3214d;
                                                int i17 = i3;
                                                do {
                                                    ((C0165o) objArr3[i17]).a();
                                                    i17++;
                                                } while (i17 < i16);
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i3 = 0;
                                        j3 = S.p.j(yVar.c(), iVar);
                                    }
                                    i10 = (((i10 * 31) + System.identityHashCode(j3)) * 31) + j3.f4174a;
                                }
                                i6 = 8;
                            } else {
                                i6 = i12;
                            }
                            j4 >>= i6;
                            i14++;
                            i12 = i6;
                            i8 = 1;
                        }
                        i4 = 0;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        i4 = 0;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    c2 = 7;
                    i8 = 1;
                }
                i5 = i10;
            } else {
                i4 = 0;
                i5 = 7;
            }
            int i18 = C.f3216f;
            if (i18 <= 0) {
                return i5;
            }
            Object[] objArr4 = C.f3214d;
            int i19 = i4;
            do {
                ((C0165o) objArr4[i19]).a();
                i19++;
            } while (i19 < i18);
            return i5;
        } catch (Throwable th2) {
            th = th2;
            i3 = 0;
        }
    }
}
