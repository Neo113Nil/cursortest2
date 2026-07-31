package I;

import F.C0093f;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import j.C0547u;

/* loaded from: classes.dex */
public final class F extends S.z implements W0 {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0422a f2669e;

    /* renamed from: f, reason: collision with root package name */
    public final M0 f2670f;

    /* renamed from: g, reason: collision with root package name */
    public E f2671g = new E();

    public F(M0 m02, InterfaceC0422a interfaceC0422a) {
        this.f2669e = interfaceC0422a;
        this.f2670f = m02;
    }

    @Override // S.y
    public final S.A c() {
        return this.f2671g;
    }

    @Override // S.y
    public final void d(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f2671g = (E) a3;
    }

    /* JADX WARN: Finally extract failed */
    public final E g(E e3, S.i iVar, boolean z3, InterfaceC0422a interfaceC0422a) {
        int i3;
        M0 m02;
        int i4;
        E e4 = e3;
        if (e4.c(this, iVar)) {
            if (z3) {
                K.d C = C0143d.C();
                int i5 = C.f3216f;
                if (i5 > 0) {
                    Object[] objArr = C.f3214d;
                    int i6 = 0;
                    do {
                        ((C0165o) objArr[i6]).b();
                        i6++;
                    } while (i6 < i5);
                }
                try {
                    C0547u c0547u = e4.f2652e;
                    G1.m mVar = N0.f2727a;
                    Q.b bVar = (Q.b) mVar.g();
                    if (bVar == null) {
                        bVar = new Q.b(0);
                        mVar.u(bVar);
                    }
                    int i7 = bVar.f3947a;
                    Object[] objArr2 = c0547u.f6331b;
                    int[] iArr = c0547u.f6332c;
                    long[] jArr = c0547u.f6330a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j3 = jArr[i8];
                            long[] jArr2 = jArr;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j3 & 255) < 128) {
                                        int i12 = (i8 << 3) + i11;
                                        S.y yVar = (S.y) objArr2[i12];
                                        bVar.f3947a = i7 + iArr[i12];
                                        InterfaceC0424c f3 = iVar.f();
                                        if (f3 != null) {
                                            f3.n(yVar);
                                        }
                                        i4 = 8;
                                    } else {
                                        i4 = i9;
                                    }
                                    j3 >>= i4;
                                    i11++;
                                    i9 = i4;
                                }
                                if (i10 != i9) {
                                    break;
                                }
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            jArr = jArr2;
                        }
                    }
                    bVar.f3947a = i7;
                    int i13 = C.f3216f;
                    if (i13 > 0) {
                        Object[] objArr3 = C.f3214d;
                        int i14 = 0;
                        do {
                            ((C0165o) objArr3[i14]).a();
                            i14++;
                        } while (i14 < i13);
                    }
                } catch (Throwable th) {
                    int i15 = C.f3216f;
                    if (i15 > 0) {
                        Object[] objArr4 = C.f3214d;
                        int i16 = 0;
                        do {
                            ((C0165o) objArr4[i16]).a();
                            i16++;
                        } while (i16 < i15);
                    }
                    throw th;
                }
            }
            return e4;
        }
        C0547u c0547u2 = new C0547u();
        G1.m mVar2 = N0.f2727a;
        Q.b bVar2 = (Q.b) mVar2.g();
        if (bVar2 == null) {
            i3 = 0;
            bVar2 = new Q.b(0);
            mVar2.u(bVar2);
        } else {
            i3 = 0;
        }
        int i17 = bVar2.f3947a;
        K.d C3 = C0143d.C();
        int i18 = C3.f3216f;
        if (i18 > 0) {
            Object[] objArr5 = C3.f3214d;
            int i19 = i3;
            while (true) {
                ((C0165o) objArr5[i19]).b();
                int i20 = i19 + 1;
                if (i20 >= i18) {
                    break;
                }
                i19 = i20;
            }
        }
        try {
            bVar2.f3947a = i17 + 1;
            Object e5 = S.u.e(interfaceC0422a, new C0093f(this, bVar2, c0547u2, i17));
            bVar2.f3947a = i17;
            int i21 = C3.f3216f;
            if (i21 > 0) {
                Object[] objArr6 = C3.f3214d;
                do {
                    ((C0165o) objArr6[i3]).a();
                    i3++;
                } while (i3 < i21);
            }
            Object obj = S.p.f4241b;
            synchronized (obj) {
                try {
                    S.i k3 = S.p.k();
                    Object obj2 = e4.f2653f;
                    if (obj2 == E.f2649h || (m02 = this.f2670f) == null || !m02.a(e5, obj2)) {
                        E e6 = this.f2671g;
                        synchronized (obj) {
                            S.A m3 = S.p.m(e6, this);
                            m3.a(e6);
                            m3.f4174a = k3.d();
                            e4 = (E) m3;
                            e4.f2652e = c0547u2;
                            e4.f2654g = e4.d(this, k3);
                            e4.f2653f = e5;
                        }
                        return e4;
                    }
                    e4.f2652e = c0547u2;
                    e4.f2654g = e4.d(this, k3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Q.b bVar3 = (Q.b) N0.f2727a.g();
            if (bVar3 != null && bVar3.f3947a == 0) {
                S.p.k().m();
                synchronized (obj) {
                    S.i k4 = S.p.k();
                    e4.f2650c = k4.d();
                    e4.f2651d = k4.h();
                }
            }
            return e4;
        } catch (Throwable th3) {
            int i22 = C3.f3216f;
            if (i22 > 0) {
                Object[] objArr7 = C3.f3214d;
                do {
                    ((C0165o) objArr7[i3]).a();
                    i3++;
                } while (i3 < i22);
            }
            throw th3;
        }
    }

    @Override // I.W0
    public final Object getValue() {
        InterfaceC0424c f3 = S.p.k().f();
        if (f3 != null) {
            f3.n(this);
        }
        S.i k3 = S.p.k();
        return g((E) S.p.j(this.f2671g, k3), k3, true, this.f2669e).f2653f;
    }

    public final E h() {
        S.i k3 = S.p.k();
        return g((E) S.p.j(this.f2671g, k3), k3, false, this.f2669e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        E e3 = (E) S.p.i(this.f2671g);
        sb.append(e3.c(this, S.p.k()) ? String.valueOf(e3.f2653f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
