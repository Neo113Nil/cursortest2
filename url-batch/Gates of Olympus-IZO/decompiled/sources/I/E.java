package I;

import j.AbstractC0476B;
import j.C0503u;

/* loaded from: classes.dex */
public final class E extends S.z {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2089h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f2090c;

    /* renamed from: d, reason: collision with root package name */
    public int f2091d;

    /* renamed from: e, reason: collision with root package name */
    public C0503u f2092e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2093f;

    /* renamed from: g, reason: collision with root package name */
    public int f2094g;

    public E() {
        C0503u c0503u = AbstractC0476B.f5134a;
        Z1.i.d(c0503u, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f2092e = c0503u;
        this.f2093f = f2089h;
    }

    @Override // S.z
    public final void a(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        E e3 = (E) zVar;
        this.f2092e = e3.f2092e;
        this.f2093f = e3.f2093f;
        this.f2094g = e3.f2094g;
    }

    @Override // S.z
    public final S.z b() {
        return new E();
    }

    public final boolean c(G g3, S.i iVar) {
        boolean z3;
        boolean z4;
        Object obj = S.q.f3235b;
        synchronized (obj) {
            z3 = true;
            if (this.f2090c == iVar.d()) {
                if (this.f2091d == iVar.h()) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        if (this.f2093f == f2089h || (z4 && this.f2094g != d(g3, iVar))) {
            z3 = false;
        }
        if (z3 && z4) {
            synchronized (obj) {
                this.f2090c = iVar.d();
                this.f2091d = iVar.h();
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [Y1.a, Z1.j] */
    public final int d(G g3, S.i iVar) {
        C0503u c0503u;
        int i3;
        int i4;
        int i5;
        int i6;
        S.z j3;
        synchronized (S.q.f3235b) {
            c0503u = this.f2092e;
        }
        char c3 = 7;
        if (c0503u.f5216e == 0) {
            return 7;
        }
        K.d C = C0089d.C();
        int i7 = C.f2642f;
        int i8 = 1;
        if (i7 > 0) {
            Object[] objArr = C.f2640d;
            int i9 = 0;
            do {
                ((C0111o) objArr[i9]).b();
                i9++;
            } while (i9 < i7);
        }
        try {
            Object[] objArr2 = c0503u.f5213b;
            int[] iArr = c0503u.f5214c;
            long[] jArr = c0503u.f5212a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 7;
                int i11 = 0;
                while (true) {
                    long j4 = jArr[i11];
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j4 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                S.x xVar = (S.x) objArr2[i15];
                                if (iArr[i15] == i8) {
                                    if (xVar instanceof G) {
                                        G g4 = (G) xVar;
                                        i3 = 0;
                                        try {
                                            j3 = g4.g((E) S.q.j(g4.f2117g, iVar), iVar, false, g4.f2115e);
                                        } catch (Throwable th) {
                                            th = th;
                                            int i16 = C.f2642f;
                                            if (i16 > 0) {
                                                Object[] objArr3 = C.f2640d;
                                                int i17 = i3;
                                                do {
                                                    ((C0111o) objArr3[i17]).a();
                                                    i17++;
                                                } while (i17 < i16);
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i3 = 0;
                                        j3 = S.q.j(xVar.c(), iVar);
                                    }
                                    i10 = (((i10 * 31) + System.identityHashCode(j3)) * 31) + j3.f3272a;
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
                    c3 = 7;
                    i8 = 1;
                }
                i5 = i10;
            } else {
                i4 = 0;
                i5 = 7;
            }
            int i18 = C.f2642f;
            if (i18 <= 0) {
                return i5;
            }
            Object[] objArr4 = C.f2640d;
            int i19 = i4;
            do {
                ((C0111o) objArr4[i19]).a();
                i19++;
            } while (i19 < i18);
            return i5;
        } catch (Throwable th2) {
            th = th2;
            i3 = 0;
        }
    }
}
