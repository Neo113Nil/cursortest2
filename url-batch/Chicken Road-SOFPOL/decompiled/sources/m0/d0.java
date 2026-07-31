package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 extends w0.w {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f4889h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f4890c;

    /* renamed from: d, reason: collision with root package name */
    public int f4891d;

    /* renamed from: e, reason: collision with root package name */
    public o.d0 f4892e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4893f;

    /* renamed from: g, reason: collision with root package name */
    public int f4894g;

    public d0(long j7) {
        super(j7);
        o.d0 d0Var = o.o0.f5516a;
        q6.i.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f4892e = d0Var;
        this.f4893f = f4889h;
    }

    @Override // w0.w
    public final void a(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        d0 d0Var = (d0) wVar;
        this.f4892e = d0Var.f4892e;
        this.f4893f = d0Var.f4893f;
        this.f4894g = d0Var.f4894g;
    }

    @Override // w0.w
    public final w0.w b(long j7) {
        return new d0(j7);
    }

    public final boolean c(e0 e0Var, w0.f fVar) {
        boolean z3;
        boolean z7;
        Object obj = w0.m.f7537c;
        synchronized (obj) {
            z3 = true;
            if (this.f4890c == fVar.g()) {
                if (this.f4891d == fVar.h()) {
                    z7 = false;
                }
            }
            z7 = true;
        }
        if (this.f4893f == f4889h || (z7 && this.f4894g != d(e0Var, fVar))) {
            z3 = false;
        }
        if (!z3 || !z7) {
            return z3;
        }
        synchronized (obj) {
            this.f4890c = fVar.g();
            this.f4891d = fVar.h();
        }
        return z3;
    }

    public final int d(e0 e0Var, w0.f fVar) {
        o.d0 d0Var;
        int i;
        long[] jArr;
        int i8;
        long[] jArr2;
        int i9;
        int i10;
        w0.w g3;
        synchronized (w0.m.f7537c) {
            d0Var = this.f4892e;
        }
        int i11 = 7;
        if (d0Var.f5438e == 0) {
            return 7;
        }
        o0.e m7 = b.m();
        Object[] objArr = m7.f5578d;
        int i12 = m7.f5580f;
        for (int i13 = 0; i13 < i12; i13++) {
            ((r) objArr[i13]).b();
        }
        try {
            Object[] objArr2 = d0Var.f5435b;
            int[] iArr = d0Var.f5436c;
            long[] jArr3 = d0Var.f5434a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i14 = 0;
                while (true) {
                    long j7 = jArr3[i14];
                    if ((((~j7) << i11) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j7 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                Object obj = objArr2[i18];
                                i9 = i11;
                                int i19 = iArr[i18];
                                i10 = i15;
                                w0.u uVar = (w0.u) obj;
                                if (i19 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (uVar instanceof e0) {
                                        try {
                                            e0 e0Var2 = (e0) uVar;
                                            g3 = e0Var2.g((d0) w0.m.j(e0Var2.f4905g, fVar), fVar, false, e0Var2.f4903e);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = m7.f5578d;
                                            int i20 = m7.f5580f;
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                ((r) objArr3[i21]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        g3 = w0.m.j(uVar.a(), fVar);
                                    }
                                    jArr2 = jArr3;
                                    i = (((i * 31) + System.identityHashCode(g3)) * 31) + Long.hashCode(g3.f7572a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i9 = i11;
                                i10 = i15;
                            }
                            j7 >>= i10;
                            i17++;
                            i11 = i9;
                            jArr3 = jArr2;
                            i15 = i10;
                        }
                        jArr = jArr3;
                        i8 = i11;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i8 = i11;
                    }
                    if (i14 == length) {
                        i11 = i;
                        break;
                    }
                    i14++;
                    i11 = i8;
                    jArr3 = jArr;
                }
            }
            i = i11;
            Object[] objArr4 = m7.f5578d;
            int i22 = m7.f5580f;
            for (int i23 = 0; i23 < i22; i23++) {
                ((r) objArr4[i23]).a();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
