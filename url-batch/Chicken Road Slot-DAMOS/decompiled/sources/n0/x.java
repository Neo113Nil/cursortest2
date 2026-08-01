package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends b1.h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6839h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f6840c;

    /* renamed from: d, reason: collision with root package name */
    public int f6841d;

    /* renamed from: e, reason: collision with root package name */
    public s.c0 f6842e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6843f;
    public int g;

    public x(long j) {
        super(j);
        s.c0 c0Var = s.m0.f8346a;
        c0Var.getClass();
        this.f6842e = c0Var;
        this.f6843f = f6839h;
    }

    @Override // b1.h0
    public final void a(b1.h0 h0Var) {
        h0Var.getClass();
        x xVar = (x) h0Var;
        this.f6842e = xVar.f6842e;
        this.f6843f = xVar.f6843f;
        this.g = xVar.g;
    }

    @Override // b1.h0
    public final b1.h0 b(long j) {
        return new x(j);
    }

    public final boolean c(y yVar, b1.i iVar) {
        boolean z10;
        boolean z11;
        Object obj = b1.r.f1030c;
        synchronized (obj) {
            z10 = true;
            if (this.f6840c == iVar.g()) {
                if (this.f6841d == iVar.h()) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (this.f6843f == f6839h || (z11 && this.g != d(yVar, iVar))) {
            z10 = false;
        }
        if (!z10 || !z11) {
            return z10;
        }
        synchronized (obj) {
            this.f6840c = iVar.g();
            this.f6841d = iVar.h();
        }
        return z10;
    }

    public final int d(y yVar, b1.i iVar) {
        s.c0 c0Var;
        int i3;
        long[] jArr;
        int i10;
        Object[] objArr;
        int[] iArr;
        long[] jArr2;
        int i11;
        Object[] objArr2;
        int[] iArr2;
        long j;
        int i12;
        b1.h0 i13;
        x xVar;
        synchronized (b1.r.f1030c) {
            c0Var = this.f6842e;
        }
        int i14 = 7;
        if (c0Var.f8281e == 0) {
            return 7;
        }
        o0.e n10 = h.n();
        Object[] objArr3 = n10.f7317d;
        int i15 = n10.f7319i;
        for (int i16 = 0; i16 < i15; i16++) {
            ((b1.z) objArr3[i16]).b();
        }
        try {
            Object[] objArr4 = c0Var.f8278b;
            int[] iArr3 = c0Var.f8279c;
            long[] jArr3 = c0Var.f8277a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i3 = 7;
                int i17 = 0;
                while (true) {
                    long j3 = jArr3[i17];
                    long j10 = -9187201950435737472L;
                    if ((((~j3) << i14) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        i10 = i14;
                        for (int i20 = 0; i20 < i19; i20 = i11 + 1) {
                            if ((j3 & 255) < 128) {
                                int i21 = (i17 << 3) + i20;
                                j = j10;
                                int i22 = i18;
                                b1.f0 f0Var = (b1.f0) objArr4[i21];
                                if (iArr3[i21] != 1) {
                                    jArr2 = jArr3;
                                    i11 = i20;
                                    objArr2 = objArr4;
                                    iArr2 = iArr3;
                                } else {
                                    if (f0Var instanceof y) {
                                        y yVar2 = (y) f0Var;
                                        x h10 = yVar2.h((x) b1.r.i(yVar2.f6854i, iVar), iVar, false, yVar2.f6853e);
                                        s.c0 c0Var2 = h10.f6842e;
                                        Object[] objArr5 = c0Var2.f8278b;
                                        long[] jArr4 = c0Var2.f8277a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i11 = i20;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i23 = 0;
                                            while (true) {
                                                long j11 = jArr4[i23];
                                                iArr2 = iArr3;
                                                xVar = h10;
                                                if ((((~j11) << i10) & j11 & j) != j) {
                                                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                    for (int i25 = 0; i25 < i24; i25++) {
                                                        if ((j11 & 255) < 128) {
                                                            i3 = (i3 * 31) + System.identityHashCode((b1.f0) objArr5[(i23 << 3) + i25]);
                                                        }
                                                        j11 >>= i22;
                                                    }
                                                    if (i24 != i22) {
                                                        break;
                                                    }
                                                }
                                                if (i23 == length2) {
                                                    break;
                                                }
                                                i23++;
                                                iArr3 = iArr2;
                                                h10 = xVar;
                                                i22 = 8;
                                            }
                                        } else {
                                            iArr2 = iArr3;
                                            xVar = h10;
                                        }
                                        i13 = xVar;
                                    } else {
                                        jArr2 = jArr3;
                                        i11 = i20;
                                        objArr2 = objArr4;
                                        iArr2 = iArr3;
                                        i13 = b1.r.i(f0Var.c(), iVar);
                                    }
                                    i3 = (((i3 * 31) + System.identityHashCode(i13)) * 31) + Long.hashCode(i13.f981a);
                                }
                                i12 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i20;
                                objArr2 = objArr4;
                                iArr2 = iArr3;
                                j = j10;
                                i12 = i18;
                            }
                            j3 >>= i12;
                            i18 = i12;
                            jArr3 = jArr2;
                            j10 = j;
                            objArr4 = objArr2;
                            iArr3 = iArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        iArr = iArr3;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i14;
                        objArr = objArr4;
                        iArr = iArr3;
                    }
                    if (i17 == length) {
                        i14 = i3;
                        break;
                    }
                    i17++;
                    i14 = i10;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    iArr3 = iArr;
                }
            }
            i3 = i14;
            Object[] objArr6 = n10.f7317d;
            int i26 = n10.f7319i;
            for (int i27 = 0; i27 < i26; i27++) {
                ((b1.z) objArr6[i27]).a();
            }
            return i3;
        } catch (Throwable th) {
            Object[] objArr7 = n10.f7317d;
            int i28 = n10.f7319i;
            for (int i29 = 0; i29 < i28; i29++) {
                ((b1.z) objArr7[i29]).a();
            }
            throw th;
        }
    }
}
