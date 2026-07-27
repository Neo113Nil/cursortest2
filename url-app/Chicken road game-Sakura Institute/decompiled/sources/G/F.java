package G;

import B1.C0097d;
import D.C0129f;
import Q.AbstractC0274j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends Q.E implements X0 {

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f2667e;

    /* renamed from: i, reason: collision with root package name */
    public final M0 f2668i;

    /* renamed from: j, reason: collision with root package name */
    public E f2669j = new E();

    public F(M0 m02, Function0 function0) {
        this.f2667e = function0;
        this.f2668i = m02;
    }

    /* JADX WARN: Finally extract failed */
    public final E d(E e4, AbstractC0274j abstractC0274j, boolean z4, Function0 function0) {
        int i2;
        M0 m02;
        int i4;
        int i5;
        E e5 = e4;
        int i6 = 1;
        if (!e5.c(this, abstractC0274j)) {
            i.v vVar = new i.v();
            C0097d c0097d = N0.f2725a;
            O.b bVar = (O.b) c0097d.j();
            if (bVar == null) {
                i2 = 0;
                bVar = new O.b(0);
                c0097d.B(bVar);
            } else {
                i2 = 0;
            }
            int i7 = bVar.f3624a;
            I.d C3 = C0192d.C();
            int i8 = C3.f3332i;
            if (i8 > 0) {
                Object[] objArr = C3.f3330d;
                int i9 = i2;
                while (true) {
                    ((C0214o) objArr[i9]).b();
                    int i10 = i9 + 1;
                    if (i10 >= i8) {
                        break;
                    }
                    i9 = i10;
                }
            }
            try {
                bVar.f3624a = i7 + 1;
                Object e6 = Q.w.e(function0, new C0129f(this, bVar, vVar, i7));
                bVar.f3624a = i7;
                int i11 = C3.f3332i;
                if (i11 > 0) {
                    Object[] objArr2 = C3.f3330d;
                    do {
                        ((C0214o) objArr2[i2]).a();
                        i2++;
                    } while (i2 < i11);
                }
                Object obj = Q.q.f3878b;
                synchronized (obj) {
                    try {
                        AbstractC0274j k4 = Q.q.k();
                        Object obj2 = e5.f2651f;
                        if (obj2 == E.f2647h || (m02 = this.f2668i) == null || !m02.a(e6, obj2)) {
                            E e7 = this.f2669j;
                            synchronized (obj) {
                                Q.F m4 = Q.q.m(e7, this);
                                m4.a(e7);
                                m4.f3809a = k4.d();
                                e5 = (E) m4;
                                e5.f2650e = vVar;
                                e5.f2652g = e5.d(this, k4);
                                e5.f2651f = e6;
                            }
                            return e5;
                        }
                        e5.f2650e = vVar;
                        e5.f2652g = e5.d(this, k4);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                O.b bVar2 = (O.b) N0.f2725a.j();
                if (bVar2 != null && bVar2.f3624a == 0) {
                    Q.q.k().m();
                    synchronized (obj) {
                        AbstractC0274j k5 = Q.q.k();
                        e5.f2648c = k5.d();
                        e5.f2649d = k5.h();
                        Unit unit = Unit.f7487a;
                    }
                }
                return e5;
            } catch (Throwable th2) {
                int i12 = C3.f3332i;
                if (i12 > 0) {
                    Object[] objArr3 = C3.f3330d;
                    do {
                        ((C0214o) objArr3[i2]).a();
                        i2++;
                    } while (i2 < i12);
                }
                throw th2;
            }
        }
        if (z4) {
            I.d C4 = C0192d.C();
            int i13 = C4.f3332i;
            if (i13 > 0) {
                Object[] objArr4 = C4.f3330d;
                int i14 = 0;
                do {
                    ((C0214o) objArr4[i14]).b();
                    i14++;
                } while (i14 < i13);
            }
            try {
                i.v vVar2 = e5.f2650e;
                C0097d c0097d2 = N0.f2725a;
                O.b bVar3 = (O.b) c0097d2.j();
                if (bVar3 == null) {
                    bVar3 = new O.b(0);
                    c0097d2.B(bVar3);
                }
                int i15 = bVar3.f3624a;
                Object[] objArr5 = vVar2.f6969b;
                int[] iArr = vVar2.f6970c;
                long[] jArr = vVar2.f6968a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j4 = jArr[i16];
                        long[] jArr2 = jArr;
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j4 & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    Q.D d4 = (Q.D) objArr5[i20];
                                    bVar3.f3624a = i15 + iArr[i20];
                                    Function1 f4 = abstractC0274j.f();
                                    if (f4 != null) {
                                        f4.invoke(d4);
                                    }
                                    i5 = 8;
                                } else {
                                    i5 = i17;
                                }
                                j4 >>= i5;
                                i19++;
                                i17 = i5;
                                i6 = 1;
                            }
                            int i21 = i17;
                            i4 = i6;
                            if (i18 != i21) {
                                break;
                            }
                        } else {
                            i4 = i6;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16 += i4;
                        i6 = i4;
                        jArr = jArr2;
                    }
                }
                bVar3.f3624a = i15;
                Unit unit2 = Unit.f7487a;
                int i22 = C4.f3332i;
                if (i22 > 0) {
                    Object[] objArr6 = C4.f3330d;
                    int i23 = 0;
                    do {
                        ((C0214o) objArr6[i23]).a();
                        i23++;
                    } while (i23 < i22);
                }
            } catch (Throwable th3) {
                int i24 = C4.f3332i;
                if (i24 > 0) {
                    Object[] objArr7 = C4.f3330d;
                    int i25 = 0;
                    do {
                        ((C0214o) objArr7[i25]).a();
                        i25++;
                    } while (i25 < i24);
                }
                throw th3;
            }
        }
        return e5;
    }

    @Override // Q.D
    public final void e(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f2669j = (E) f4;
    }

    public final E f() {
        AbstractC0274j k4 = Q.q.k();
        return d((E) Q.q.j(this.f2669j, k4), k4, false, this.f2667e);
    }

    @Override // G.X0
    public final Object getValue() {
        Function1 f4 = Q.q.k().f();
        if (f4 != null) {
            f4.invoke(this);
        }
        AbstractC0274j k4 = Q.q.k();
        return d((E) Q.q.j(this.f2669j, k4), k4, true, this.f2667e).f2651f;
    }

    @Override // Q.D
    public final Q.F h() {
        return this.f2669j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        E e4 = (E) Q.q.i(this.f2669j);
        sb.append(e4.c(this, Q.q.k()) ? String.valueOf(e4.f2651f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
