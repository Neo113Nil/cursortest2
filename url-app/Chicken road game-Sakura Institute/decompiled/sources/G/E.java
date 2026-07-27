package G;

import Q.AbstractC0274j;
import i.AbstractC0662C;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E extends Q.F {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2647h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f2648c;

    /* renamed from: d, reason: collision with root package name */
    public int f2649d;

    /* renamed from: e, reason: collision with root package name */
    public i.v f2650e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2651f;

    /* renamed from: g, reason: collision with root package name */
    public int f2652g;

    public E() {
        i.v vVar = AbstractC0662C.f6889a;
        Intrinsics.d(vVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f2650e = vVar;
        this.f2651f = f2647h;
    }

    @Override // Q.F
    public final void a(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        E e4 = (E) f4;
        this.f2650e = e4.f2650e;
        this.f2651f = e4.f2651f;
        this.f2652g = e4.f2652g;
    }

    @Override // Q.F
    public final Q.F b() {
        return new E();
    }

    public final boolean c(F f4, AbstractC0274j abstractC0274j) {
        boolean z4;
        boolean z5;
        Object obj = Q.q.f3878b;
        synchronized (obj) {
            z4 = true;
            if (this.f2648c == abstractC0274j.d()) {
                if (this.f2649d == abstractC0274j.h()) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        if (this.f2651f == f2647h || (z5 && this.f2652g != d(f4, abstractC0274j))) {
            z4 = false;
        }
        if (z4 && z5) {
            synchronized (obj) {
                this.f2648c = abstractC0274j.d();
                this.f2649d = abstractC0274j.h();
                Unit unit = Unit.f7487a;
            }
        }
        return z4;
    }

    public final int d(F f4, AbstractC0274j abstractC0274j) {
        i.v vVar;
        int i2;
        int i4;
        int i5;
        int i6;
        Q.F j4;
        int i7 = 1;
        synchronized (Q.q.f3878b) {
            vVar = this.f2650e;
        }
        char c4 = 7;
        if (vVar.f6972e == 0) {
            return 7;
        }
        I.d C3 = C0192d.C();
        int i8 = C3.f3332i;
        if (i8 > 0) {
            Object[] objArr = C3.f3330d;
            int i9 = 0;
            do {
                ((C0214o) objArr[i9]).b();
                i9++;
            } while (i9 < i8);
        }
        try {
            Object[] objArr2 = vVar.f6969b;
            int[] iArr = vVar.f6970c;
            long[] jArr = vVar.f6968a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 7;
                int i11 = 0;
                while (true) {
                    long j5 = jArr[i11];
                    if ((((~j5) << c4) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j5 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Q.D d4 = (Q.D) objArr2[i15];
                                if (iArr[i15] != i7) {
                                    i2 = 0;
                                } else {
                                    if (d4 instanceof F) {
                                        F f5 = (F) d4;
                                        i2 = 0;
                                        j4 = f5.d((E) Q.q.j(f5.f2669j, abstractC0274j), abstractC0274j, false, f5.f2667e);
                                    } else {
                                        i2 = 0;
                                        j4 = Q.q.j(d4.h(), abstractC0274j);
                                    }
                                    i10 = (((i10 * 31) + System.identityHashCode(j4)) * 31) + j4.f3809a;
                                }
                                i6 = 8;
                            } else {
                                i2 = 0;
                                i6 = i12;
                            }
                            try {
                                j5 >>= i6;
                                i14++;
                                i12 = i6;
                                i7 = 1;
                            } catch (Throwable th) {
                                th = th;
                                int i16 = C3.f3332i;
                                if (i16 > 0) {
                                    Object[] objArr3 = C3.f3330d;
                                    int i17 = i2;
                                    do {
                                        ((C0214o) objArr3[i17]).a();
                                        i17++;
                                    } while (i17 < i16);
                                }
                                throw th;
                            }
                        }
                        i5 = i7;
                        i2 = 0;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        i5 = i7;
                        i2 = 0;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11 += i5;
                    i7 = i5;
                    c4 = 7;
                }
                i4 = i10;
            } else {
                i2 = 0;
                i4 = 7;
            }
            Unit unit = Unit.f7487a;
            int i18 = C3.f3332i;
            if (i18 <= 0) {
                return i4;
            }
            Object[] objArr4 = C3.f3330d;
            int i19 = i2;
            do {
                ((C0214o) objArr4[i19]).a();
                i19++;
            } while (i19 < i18);
            return i4;
        } catch (Throwable th2) {
            th = th2;
            i2 = 0;
        }
    }
}
