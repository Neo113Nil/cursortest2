package r1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6503a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6504b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6505c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f6506d;

    /* renamed from: e, reason: collision with root package name */
    public int f6507e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6508f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f6509g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f6510h;

    public /* synthetic */ c() {
        this(false, b.f6500d);
    }

    public final void a(long j7, float f6) {
        int i = (this.f6507e + 1) % 20;
        this.f6507e = i;
        a[] aVarArr = this.f6506d;
        a aVar = aVarArr[i];
        if (aVar != null) {
            aVar.f6498a = j7;
            aVar.f6499b = f6;
        } else {
            a aVar2 = new a();
            aVar2.f6498a = j7;
            aVar2.f6499b = f6;
            aVarArr[i] = aVar2;
        }
    }

    public final float b(float f6) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f8;
        boolean z3;
        int i;
        float f9;
        float f10 = f6;
        float f11 = 0.0f;
        if (f10 <= 0.0f) {
            t1.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        int i8 = this.f6507e;
        a[] aVarArr = this.f6506d;
        a aVar = aVarArr[i8];
        if (aVar == null) {
            f8 = 0.0f;
        } else {
            int i9 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i8];
                boolean z7 = this.f6503a;
                bVar = this.f6504b;
                fArr = this.f6508f;
                fArr2 = this.f6509g;
                if (aVar3 != null) {
                    long j7 = aVar.f6498a;
                    f8 = f11;
                    int i10 = i8;
                    long j8 = aVar3.f6498a;
                    float f12 = j7 - j8;
                    z3 = z7;
                    i = 1;
                    float abs = Math.abs(j8 - aVar2.f6498a);
                    aVar2 = (bVar == b.f6500d || z3) ? aVar3 : aVar;
                    if (f12 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i9] = aVar3.f6499b;
                    fArr2[i9] = -f12;
                    i8 = (i10 == 0 ? 20 : i10) - 1;
                    i9++;
                    if (i9 >= 20) {
                        break;
                    }
                    f11 = f8;
                } else {
                    f8 = f11;
                    z3 = z7;
                    i = 1;
                    break;
                }
            }
            if (i9 >= this.f6505c) {
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.f6510h;
                        m.a.I(fArr2, fArr, i9, fArr3);
                        f9 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f9 = f8;
                    }
                } else {
                    if (ordinal != i) {
                        throw new a5.c();
                    }
                    int i11 = i9 - i;
                    float f13 = fArr2[i11];
                    int i12 = i11;
                    float f14 = f8;
                    while (i12 > 0) {
                        int i13 = i12 - 1;
                        float f15 = fArr2[i13];
                        if (f13 != f15) {
                            float f16 = (z3 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f13 - f15);
                            f14 += Math.abs(f16) * (f16 - (Math.signum(f14) * ((float) Math.sqrt(Math.abs(f14) * 2))));
                            if (i12 == i11) {
                                f14 *= 0.5f;
                            }
                        }
                        i12--;
                        f13 = f15;
                    }
                    f9 = Math.signum(f14) * ((float) Math.sqrt(Math.abs(f14) * 2));
                }
                f11 = f9 * 1000;
            } else {
                f11 = f8;
            }
        }
        if (f11 == f8 || Float.isNaN(f11)) {
            return f8;
        }
        if (f11 <= f8) {
            f10 = -f10;
            if (f11 >= f10) {
                return f11;
            }
        } else if (f11 <= f10) {
            f10 = f11;
        }
        return f10;
    }

    public c(boolean z3, b bVar) {
        int i;
        this.f6503a = z3;
        this.f6504b = bVar;
        if (z3 && bVar.equals(b.f6500d)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                throw new a5.c();
            }
            i = 2;
        }
        this.f6505c = i;
        this.f6506d = new a[20];
        this.f6508f = new float[20];
        this.f6509g = new float[20];
        this.f6510h = new float[3];
    }

    public c(int i) {
        this(true, b.f6501e);
    }
}
