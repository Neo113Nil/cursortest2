package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends q0.v implements m2 {

    /* renamed from: g, reason: collision with root package name */
    public final q6.a f3716g;

    /* renamed from: h, reason: collision with root package name */
    public final f2 f3717h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f3718i = new d0();

    public e0(q6.a aVar, f2 f2Var) {
        this.f3716g = aVar;
        this.f3717h = f2Var;
    }

    @Override // q0.u
    public final q0.w a() {
        return this.f3718i;
    }

    public final d0 e(d0 d0Var, q0.g gVar, boolean z8, q6.a aVar) {
        f2 f2Var;
        boolean z9;
        boolean z10;
        int i7;
        d0 d0Var2 = d0Var;
        boolean z11 = true;
        if (!d0Var2.c(this, gVar)) {
            i.u uVar = new i.u();
            b1.b bVar = g2.f3733a;
            o0.b bVar2 = (o0.b) bVar.j();
            if (bVar2 == null) {
                bVar2 = new o0.b();
                bVar.y(bVar2);
            }
            int i8 = bVar2.f6815a;
            i0.d B = d.B();
            int i9 = B.f4842h;
            if (i9 > 0) {
                Object[] objArr = B.f4840f;
                int i10 = 0;
                do {
                    ((o) objArr[i10]).b();
                    i10++;
                } while (i10 < i9);
            }
            try {
                bVar2.f6815a = i8 + 1;
                Object e9 = q0.r.e(aVar, new d0.e(this, bVar2, uVar, i8));
                bVar2.f6815a = i8;
                int i11 = B.f4842h;
                if (i11 > 0) {
                    Object[] objArr2 = B.f4840f;
                    int i12 = 0;
                    do {
                        ((o) objArr2[i12]).a();
                        i12++;
                    } while (i12 < i11);
                }
                Object obj = q0.n.f7427b;
                synchronized (obj) {
                    try {
                        q0.g k8 = q0.n.k();
                        Object obj2 = d0Var2.f3712f;
                        if (obj2 == d0.f3708h || (f2Var = this.f3717h) == null || !f2Var.a(e9, obj2)) {
                            d0 d0Var3 = this.f3718i;
                            synchronized (obj) {
                                q0.w m8 = q0.n.m(d0Var3, this);
                                m8.a(d0Var3);
                                m8.f7464a = k8.d();
                                d0Var2 = (d0) m8;
                                d0Var2.f3711e = uVar;
                                d0Var2.f3713g = d0Var2.d(this, k8);
                                d0Var2.f3712f = e9;
                            }
                            return d0Var2;
                        }
                        d0Var2.f3711e = uVar;
                        d0Var2.f3713g = d0Var2.d(this, k8);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o0.b bVar3 = (o0.b) g2.f3733a.j();
                if (bVar3 == null || bVar3.f6815a != 0) {
                    return d0Var2;
                }
                q0.n.k().m();
                synchronized (obj) {
                    q0.g k9 = q0.n.k();
                    d0Var2.f3709c = k9.d();
                    d0Var2.f3710d = k9.h();
                    return d0Var2;
                }
            } catch (Throwable th2) {
                int i13 = B.f4842h;
                if (i13 > 0) {
                    Object[] objArr3 = B.f4840f;
                    int i14 = 0;
                    do {
                        ((o) objArr3[i14]).a();
                        i14++;
                    } while (i14 < i13);
                }
                throw th2;
            }
        }
        if (z8) {
            i0.d B2 = d.B();
            int i15 = B2.f4842h;
            if (i15 > 0) {
                Object[] objArr4 = B2.f4840f;
                int i16 = 0;
                do {
                    ((o) objArr4[i16]).b();
                    i16++;
                } while (i16 < i15);
            }
            try {
                i.u uVar2 = d0Var2.f3711e;
                b1.b bVar4 = g2.f3733a;
                o0.b bVar5 = (o0.b) bVar4.j();
                if (bVar5 == null) {
                    bVar5 = new o0.b();
                    bVar4.y(bVar5);
                }
                int i17 = bVar5.f6815a;
                Object[] objArr5 = uVar2.f4799b;
                int[] iArr = uVar2.f4800c;
                long[] jArr = uVar2.f4798a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j8 = jArr[i18];
                        long[] jArr2 = jArr;
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8;
                            int i20 = 8 - ((~(i18 - length)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j8 & 255) < 128) {
                                    int i22 = (i18 << 3) + i21;
                                    z10 = z11;
                                    try {
                                        q0.u uVar3 = (q0.u) objArr5[i22];
                                        i7 = i19;
                                        bVar5.f6815a = i17 + iArr[i22];
                                        q6.c f9 = gVar.f();
                                        if (f9 != null) {
                                            f9.f(uVar3);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        int i23 = B2.f4842h;
                                        if (i23 > 0) {
                                            Object[] objArr6 = B2.f4840f;
                                            int i24 = 0;
                                            do {
                                                ((o) objArr6[i24]).a();
                                                i24++;
                                            } while (i24 < i23);
                                        }
                                        throw th;
                                    }
                                } else {
                                    z10 = z11;
                                    i7 = i19;
                                }
                                j8 >>= i7;
                                i21++;
                                i19 = i7;
                                z11 = z10;
                            }
                            z9 = z11;
                            if (i20 != i19) {
                                break;
                            }
                        } else {
                            z9 = z11;
                        }
                        if (i18 == length) {
                            break;
                        }
                        i18++;
                        jArr = jArr2;
                        z11 = z9;
                    }
                }
                bVar5.f6815a = i17;
                int i25 = B2.f4842h;
                if (i25 > 0) {
                    Object[] objArr7 = B2.f4840f;
                    int i26 = 0;
                    do {
                        ((o) objArr7[i26]).a();
                        i26++;
                    } while (i26 < i25);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return d0Var2;
    }

    public final d0 f() {
        q0.g k8 = q0.n.k();
        return e((d0) q0.n.j(this.f3718i, k8), k8, false, this.f3716g);
    }

    @Override // g0.m2
    public final Object getValue() {
        q6.c f9 = q0.n.k().f();
        if (f9 != null) {
            f9.f(this);
        }
        q0.g k8 = q0.n.k();
        return e((d0) q0.n.j(this.f3718i, k8), k8, true, this.f3716g).f3712f;
    }

    @Override // q0.u
    public final void m(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f3718i = (d0) wVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        d0 d0Var = (d0) q0.n.i(this.f3718i);
        sb.append(d0Var.c(this, q0.n.k()) ? String.valueOf(d0Var.f3712f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
