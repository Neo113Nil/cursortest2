package I;

import D1.C0014b;
import j.C0503u;

/* loaded from: classes.dex */
public final class G extends S.y implements X0 {

    /* renamed from: e, reason: collision with root package name */
    public final Z1.j f2115e;

    /* renamed from: f, reason: collision with root package name */
    public final X f2116f;

    /* renamed from: g, reason: collision with root package name */
    public E f2117g = new E();

    /* JADX WARN: Multi-variable type inference failed */
    public G(Y1.a aVar, X x3) {
        this.f2115e = (Z1.j) aVar;
        this.f2116f = x3;
    }

    @Override // S.x
    public final S.z c() {
        return this.f2117g;
    }

    @Override // S.x
    public final void d(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f2117g = (E) zVar;
    }

    /* JADX WARN: Finally extract failed */
    public final E g(E e3, S.i iVar, boolean z3, Y1.a aVar) {
        int i3;
        X x3;
        int i4;
        E e4 = e3;
        if (e4.c(this, iVar)) {
            if (z3) {
                K.d C = C0089d.C();
                int i5 = C.f2642f;
                if (i5 > 0) {
                    Object[] objArr = C.f2640d;
                    int i6 = 0;
                    do {
                        ((C0111o) objArr[i6]).b();
                        i6++;
                    } while (i6 < i5);
                }
                try {
                    C0503u c0503u = e4.f2092e;
                    C0014b c0014b = O0.f2172a;
                    Q.b bVar = (Q.b) c0014b.g();
                    if (bVar == null) {
                        bVar = new Q.b(0);
                        c0014b.t(bVar);
                    }
                    int i7 = bVar.f3081a;
                    Object[] objArr2 = c0503u.f5213b;
                    int[] iArr = c0503u.f5214c;
                    long[] jArr = c0503u.f5212a;
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
                                        S.x xVar = (S.x) objArr2[i12];
                                        bVar.f3081a = i7 + iArr[i12];
                                        Y1.c f3 = iVar.f();
                                        if (f3 != null) {
                                            f3.j(xVar);
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
                    bVar.f3081a = i7;
                    int i13 = C.f2642f;
                    if (i13 > 0) {
                        Object[] objArr3 = C.f2640d;
                        int i14 = 0;
                        do {
                            ((C0111o) objArr3[i14]).a();
                            i14++;
                        } while (i14 < i13);
                    }
                } catch (Throwable th) {
                    int i15 = C.f2642f;
                    if (i15 > 0) {
                        Object[] objArr4 = C.f2640d;
                        int i16 = 0;
                        do {
                            ((C0111o) objArr4[i16]).a();
                            i16++;
                        } while (i16 < i15);
                    }
                    throw th;
                }
            }
            return e4;
        }
        C0503u c0503u2 = new C0503u();
        C0014b c0014b2 = O0.f2172a;
        Q.b bVar2 = (Q.b) c0014b2.g();
        if (bVar2 == null) {
            i3 = 0;
            bVar2 = new Q.b(0);
            c0014b2.t(bVar2);
        } else {
            i3 = 0;
        }
        int i17 = bVar2.f3081a;
        K.d C3 = C0089d.C();
        int i18 = C3.f2642f;
        if (i18 > 0) {
            Object[] objArr5 = C3.f2640d;
            int i19 = i3;
            while (true) {
                ((C0111o) objArr5[i19]).b();
                int i20 = i19 + 1;
                if (i20 >= i18) {
                    break;
                }
                i19 = i20;
            }
        }
        try {
            bVar2.f3081a = i17 + 1;
            Object e5 = S.u.e(aVar, new F(this, bVar2, c0503u2, i17));
            bVar2.f3081a = i17;
            int i21 = C3.f2642f;
            if (i21 > 0) {
                Object[] objArr6 = C3.f2640d;
                do {
                    ((C0111o) objArr6[i3]).a();
                    i3++;
                } while (i3 < i21);
            }
            Object obj = S.q.f3235b;
            synchronized (obj) {
                try {
                    S.i k3 = S.q.k();
                    Object obj2 = e4.f2093f;
                    if (obj2 == E.f2089h || (x3 = this.f2116f) == null || !x3.a(e5, obj2)) {
                        E e6 = this.f2117g;
                        synchronized (obj) {
                            S.z m3 = S.q.m(e6, this);
                            m3.a(e6);
                            m3.f3272a = k3.d();
                            e4 = (E) m3;
                            e4.f2092e = c0503u2;
                            e4.f2094g = e4.d(this, k3);
                            e4.f2093f = e5;
                        }
                        return e4;
                    }
                    e4.f2092e = c0503u2;
                    e4.f2094g = e4.d(this, k3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Q.b bVar3 = (Q.b) O0.f2172a.g();
            if (bVar3 != null && bVar3.f3081a == 0) {
                S.q.k().m();
                synchronized (obj) {
                    S.i k4 = S.q.k();
                    e4.f2090c = k4.d();
                    e4.f2091d = k4.h();
                }
            }
            return e4;
        } catch (Throwable th3) {
            int i22 = C3.f2642f;
            if (i22 > 0) {
                Object[] objArr7 = C3.f2640d;
                do {
                    ((C0111o) objArr7[i3]).a();
                    i3++;
                } while (i3 < i22);
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y1.a, Z1.j] */
    @Override // I.X0
    public final Object getValue() {
        Y1.c f3 = S.q.k().f();
        if (f3 != null) {
            f3.j(this);
        }
        S.i k3 = S.q.k();
        return g((E) S.q.j(this.f2117g, k3), k3, true, this.f2115e).f2093f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y1.a, Z1.j] */
    public final E h() {
        S.i k3 = S.q.k();
        return g((E) S.q.j(this.f2117g, k3), k3, false, this.f2115e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        E e3 = (E) S.q.i(this.f2117g);
        sb.append(e3.c(this, S.q.k()) ? String.valueOf(e3.f2093f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
