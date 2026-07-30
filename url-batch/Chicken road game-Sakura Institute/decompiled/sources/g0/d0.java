package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends q0.w {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3708h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f3709c;

    /* renamed from: d, reason: collision with root package name */
    public int f3710d;

    /* renamed from: e, reason: collision with root package name */
    public i.u f3711e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3712f;

    /* renamed from: g, reason: collision with root package name */
    public int f3713g;

    public d0() {
        i.u uVar = i.c0.f4730a;
        r6.k.d(uVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f3711e = uVar;
        this.f3712f = f3708h;
    }

    @Override // q0.w
    public final void a(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        d0 d0Var = (d0) wVar;
        this.f3711e = d0Var.f3711e;
        this.f3712f = d0Var.f3712f;
        this.f3713g = d0Var.f3713g;
    }

    @Override // q0.w
    public final q0.w b() {
        return new d0();
    }

    public final boolean c(e0 e0Var, q0.g gVar) {
        boolean z8;
        boolean z9;
        Object obj = q0.n.f7427b;
        synchronized (obj) {
            z8 = true;
            if (this.f3709c == gVar.d()) {
                if (this.f3710d == gVar.h()) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        if (this.f3712f == f3708h || (z9 && this.f3713g != d(e0Var, gVar))) {
            z8 = false;
        }
        if (!z8 || !z9) {
            return z8;
        }
        synchronized (obj) {
            this.f3709c = gVar.d();
            this.f3710d = gVar.h();
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(e0 e0Var, q0.g gVar) {
        i.u uVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        q0.w j8;
        synchronized (q0.n.f7427b) {
            uVar = this.f3711e;
        }
        int i16 = 7;
        if (uVar.f4802e == 0) {
            return 7;
        }
        i0.d B = d.B();
        int i17 = B.f4842h;
        int i18 = 1;
        if (i17 > 0) {
            Object[] objArr = B.f4840f;
            int i19 = 0;
            do {
                ((o) objArr[i19]).b();
                i19++;
            } while (i19 < i17);
        }
        try {
            Object[] objArr2 = uVar.f4799b;
            int[] iArr = uVar.f4800c;
            long[] jArr = uVar.f4798a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i10 = 7;
                int i20 = 0;
                while (true) {
                    long j9 = jArr[i20];
                    if ((((~j9) << i16) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8;
                        int i22 = 8 - ((~(i20 - length)) >>> 31);
                        i12 = i16;
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j9 & 255) < 128) {
                                int i24 = (i20 << 3) + i23;
                                i15 = i21;
                                q0.u uVar2 = (q0.u) objArr2[i24];
                                if (iArr[i24] != i18) {
                                    i14 = i18;
                                } else {
                                    if (uVar2 instanceof e0) {
                                        e0 e0Var2 = (e0) uVar2;
                                        i14 = i18;
                                        try {
                                            i7 = 0;
                                            try {
                                                j8 = e0Var2.e((d0) q0.n.j(e0Var2.f3718i, gVar), gVar, false, e0Var2.f3716g);
                                            } catch (Throwable th) {
                                                th = th;
                                                i8 = B.f4842h;
                                                if (i8 > 0) {
                                                    Object[] objArr3 = B.f4840f;
                                                    int i25 = i7;
                                                    do {
                                                        ((o) objArr3[i25]).a();
                                                        i25++;
                                                    } while (i25 < i8);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i7 = 0;
                                            i8 = B.f4842h;
                                            if (i8 > 0) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i14 = i18;
                                        i7 = 0;
                                        j8 = q0.n.j(uVar2.a(), gVar);
                                    }
                                    i10 = (((i10 * 31) + System.identityHashCode(j8)) * 31) + j8.f7464a;
                                    j9 >>= i15;
                                    i23++;
                                    i18 = i14;
                                    i21 = i15;
                                }
                            } else {
                                i14 = i18;
                                i15 = i21;
                            }
                            j9 >>= i15;
                            i23++;
                            i18 = i14;
                            i21 = i15;
                        }
                        i13 = i18;
                        i9 = 0;
                        if (i22 != i21) {
                            break;
                        }
                    } else {
                        i12 = i16;
                        i13 = i18;
                        i9 = 0;
                    }
                    if (i20 == length) {
                        i16 = i10;
                        break;
                    }
                    i20++;
                    i16 = i12;
                    i18 = i13;
                }
                i11 = B.f4842h;
                if (i11 > 0) {
                    Object[] objArr4 = B.f4840f;
                    int i26 = i9;
                    do {
                        ((o) objArr4[i26]).a();
                        i26++;
                    } while (i26 < i11);
                }
                return i10;
            }
            i9 = 0;
            i10 = i16;
            i11 = B.f4842h;
            if (i11 > 0) {
            }
            return i10;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
