package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d2 implements z1 {

    /* renamed from: f, reason: collision with root package name */
    public final i.o f5446f;

    /* renamed from: g, reason: collision with root package name */
    public final i.p f5447g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5448h;

    /* renamed from: i, reason: collision with root package name */
    public final y f5449i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f5450j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f5451k;

    /* renamed from: l, reason: collision with root package name */
    public q f5452l;

    /* renamed from: m, reason: collision with root package name */
    public q f5453m;

    /* renamed from: n, reason: collision with root package name */
    public q f5454n;

    /* renamed from: o, reason: collision with root package name */
    public q f5455o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f5456p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f5457q;

    /* renamed from: r, reason: collision with root package name */
    public b6.c f5458r;

    public d2(i.o oVar, i.p pVar, int i7, y yVar) {
        this.f5446f = oVar;
        this.f5447g = pVar;
        this.f5448h = i7;
        this.f5449i = yVar;
    }

    public final int d(int i7) {
        int i8;
        i.o oVar = this.f5446f;
        int i9 = oVar.f4769b;
        if (i9 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i9 + ')');
        }
        int i10 = i9 - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int c4 = oVar.c(i8);
                if (c4 >= i7) {
                    if (c4 <= i7) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = -(i11 + 1);
                break;
            }
        }
        return i8 < -1 ? -(i8 + 2) : i8;
    }

    @Override // l.y1
    public final q e(long j8, q qVar, q qVar2, q qVar3) {
        int i7;
        Throwable th;
        int i8;
        int i9;
        boolean z8;
        q qVar4 = qVar;
        q qVar5 = qVar2;
        int i10 = 0;
        int i11 = this.f5448h;
        int f9 = (int) v1.g.f((j8 / 1000000) - 0, 0L, i11);
        i.p pVar = this.f5447g;
        if (pVar.b(f9)) {
            Object f10 = pVar.f(f9);
            r6.k.c(f10);
            return ((c2) f10).f5423a;
        }
        if (f9 >= i11) {
            return qVar5;
        }
        if (f9 <= 0) {
            return qVar4;
        }
        h(qVar4, qVar5, qVar3);
        boolean z9 = true;
        if (this.f5458r == null) {
            int d8 = d(f9);
            float g9 = g(d8, f9, true);
            i.o oVar = this.f5446f;
            int c4 = oVar.c(d8);
            if (pVar.b(c4)) {
                Object f11 = pVar.f(c4);
                r6.k.c(f11);
                qVar4 = ((c2) f11).f5423a;
            }
            int c6 = oVar.c(d8 + 1);
            if (pVar.b(c6)) {
                Object f12 = pVar.f(c6);
                r6.k.c(f12);
                qVar5 = ((c2) f12).f5423a;
            }
            q qVar6 = this.f5452l;
            if (qVar6 == null) {
                r6.k.j("valueVector");
                throw null;
            }
            int b9 = qVar6.b();
            for (int i12 = 0; i12 < b9; i12++) {
                q qVar7 = this.f5452l;
                if (qVar7 == null) {
                    r6.k.j("valueVector");
                    throw null;
                }
                float a3 = qVar4.a(i12);
                float a9 = qVar5.a(i12);
                w1 w1Var = x1.f5722a;
                qVar7.e((a9 * g9) + ((1 - g9) * a3), i12);
            }
            q qVar8 = this.f5452l;
            if (qVar8 != null) {
                return qVar8;
            }
            r6.k.j("valueVector");
            throw null;
        }
        float g10 = g(d(f9), f9, false);
        b6.c cVar = this.f5458r;
        if (cVar == null) {
            r6.k.j("arcSpline");
            throw null;
        }
        float[] fArr = this.f5456p;
        if (fArr == null) {
            r6.k.j("posArray");
            throw null;
        }
        s[][] sVarArr = (s[][]) cVar.f1394g;
        float f13 = sVarArr[0][0].f5633a;
        if (g10 >= f13 && g10 <= sVarArr[sVarArr.length - 1][0].f5634b) {
            int length = sVarArr.length;
            int i13 = 0;
            boolean z10 = false;
            while (true) {
                if (i13 >= length) {
                    i7 = i10;
                    th = null;
                    break;
                }
                int i14 = i10;
                int i15 = i14;
                while (i14 < fArr.length) {
                    s sVar = sVarArr[i13][i15];
                    if (g10 <= sVar.f5634b) {
                        if (sVar.f5650r) {
                            float f14 = sVar.f5633a;
                            i9 = i10;
                            float f15 = sVar.f5643k;
                            float f16 = sVar.f5635c;
                            z8 = z9;
                            fArr[i14] = ((sVar.f5637e - f16) * (g10 - f14) * f15) + f16;
                            float f17 = (g10 - f14) * f15;
                            float f18 = sVar.f5636d;
                            fArr[i14 + 1] = ((sVar.f5638f - f18) * f17) + f18;
                        } else {
                            i9 = i10;
                            z8 = z9;
                            sVar.c(g10);
                            s sVar2 = sVarArr[i13][i15];
                            fArr[i14] = (sVar2.f5644l * sVar2.f5640h) + sVar2.f5646n;
                            fArr[i14 + 1] = (sVar2.f5645m * sVar2.f5641i) + sVar2.f5647o;
                        }
                        z10 = z8;
                    } else {
                        i9 = i10;
                        z8 = z9;
                    }
                    i14 += 2;
                    i15++;
                    i10 = i9;
                    z9 = z8;
                }
                i7 = i10;
                boolean z11 = z9;
                th = null;
                if (z10) {
                    break;
                }
                i13++;
                i10 = i7;
                z9 = z11;
            }
        } else {
            i7 = 0;
            th = null;
            if (g10 > sVarArr[sVarArr.length - 1][0].f5634b) {
                i8 = sVarArr.length - 1;
                f13 = sVarArr[sVarArr.length - 1][0].f5634b;
            } else {
                i8 = 0;
            }
            float f19 = g10 - f13;
            int i16 = 0;
            int i17 = 0;
            while (i16 < fArr.length) {
                s sVar3 = sVarArr[i8][i17];
                if (sVar3.f5650r) {
                    float f20 = sVar3.f5633a;
                    float f21 = sVar3.f5643k;
                    float f22 = sVar3.f5635c;
                    fArr[i16] = (sVar3.f5646n * f19) + ((sVar3.f5637e - f22) * (f13 - f20) * f21) + f22;
                    float f23 = (f13 - f20) * f21;
                    float f24 = sVar3.f5636d;
                    fArr[i16 + 1] = (sVar3.f5647o * f19) + ((sVar3.f5638f - f24) * f23) + f24;
                } else {
                    sVar3.c(f13);
                    s sVar4 = sVarArr[i8][i17];
                    fArr[i16] = (sVar4.a() * f19) + (sVar4.f5644l * sVar4.f5640h) + sVar4.f5646n;
                    s sVar5 = sVarArr[i8][i17];
                    fArr[i16 + 1] = (sVar5.b() * f19) + (sVar5.f5645m * sVar5.f5641i) + sVar5.f5647o;
                }
                i16 += 2;
                i17++;
            }
        }
        float[] fArr2 = this.f5456p;
        if (fArr2 == null) {
            r6.k.j("posArray");
            throw th;
        }
        int length2 = fArr2.length;
        for (int i18 = i7; i18 < length2; i18++) {
            q qVar9 = this.f5452l;
            if (qVar9 == null) {
                r6.k.j("valueVector");
                throw th;
            }
            float[] fArr3 = this.f5456p;
            if (fArr3 == null) {
                r6.k.j("posArray");
                throw th;
            }
            qVar9.e(fArr3[i18], i18);
        }
        q qVar10 = this.f5452l;
        if (qVar10 != null) {
            return qVar10;
        }
        r6.k.j("valueVector");
        throw th;
    }

    @Override // l.y1
    public final q f(long j8, q qVar, q qVar2, q qVar3) {
        int i7 = 0;
        long f9 = v1.g.f((j8 / 1000000) - 0, 0L, this.f5448h);
        if (f9 < 0) {
            return qVar3;
        }
        h(qVar, qVar2, qVar3);
        if (this.f5458r == null) {
            q e9 = e((f9 - 1) * 1000000, qVar, qVar2, qVar3);
            q e10 = e(f9 * 1000000, qVar, qVar2, qVar3);
            int b9 = e9.b();
            while (i7 < b9) {
                q qVar4 = this.f5453m;
                if (qVar4 == null) {
                    r6.k.j("velocityVector");
                    throw null;
                }
                qVar4.e((e9.a(i7) - e10.a(i7)) * 1000.0f, i7);
                i7++;
            }
            q qVar5 = this.f5453m;
            if (qVar5 != null) {
                return qVar5;
            }
            r6.k.j("velocityVector");
            throw null;
        }
        int i8 = (int) f9;
        float g9 = g(d(i8), i8, false);
        b6.c cVar = this.f5458r;
        if (cVar == null) {
            r6.k.j("arcSpline");
            throw null;
        }
        float[] fArr = this.f5457q;
        if (fArr == null) {
            r6.k.j("slopeArray");
            throw null;
        }
        s[][] sVarArr = (s[][]) cVar.f1394g;
        float f10 = sVarArr[0][0].f5633a;
        if (g9 < f10) {
            g9 = f10;
        } else if (g9 > sVarArr[sVarArr.length - 1][0].f5634b) {
            g9 = sVarArr[sVarArr.length - 1][0].f5634b;
        }
        int length = sVarArr.length;
        boolean z8 = false;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < fArr.length) {
                s sVar = sVarArr[i9][i11];
                if (g9 <= sVar.f5634b) {
                    if (sVar.f5650r) {
                        fArr[i10] = sVar.f5646n;
                        fArr[i10 + 1] = sVar.f5647o;
                    } else {
                        sVar.c(g9);
                        fArr[i10] = sVarArr[i9][i11].a();
                        fArr[i10 + 1] = sVarArr[i9][i11].b();
                    }
                    z8 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z8) {
                break;
            }
        }
        float[] fArr2 = this.f5457q;
        if (fArr2 == null) {
            r6.k.j("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i7 < length2) {
            q qVar6 = this.f5453m;
            if (qVar6 == null) {
                r6.k.j("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f5457q;
            if (fArr3 == null) {
                r6.k.j("slopeArray");
                throw null;
            }
            qVar6.e(fArr3[i7], i7);
            i7++;
        }
        q qVar7 = this.f5453m;
        if (qVar7 != null) {
            return qVar7;
        }
        r6.k.j("velocityVector");
        throw null;
    }

    public final float g(int i7, int i8, boolean z8) {
        y yVar;
        float f9;
        i.o oVar = this.f5446f;
        if (i7 >= oVar.f4769b - 1) {
            f9 = i8;
        } else {
            int c4 = oVar.c(i7);
            int c6 = oVar.c(i7 + 1);
            if (i8 == c4) {
                f9 = c4;
            } else {
                int i9 = c6 - c4;
                c2 c2Var = (c2) this.f5447g.f(c4);
                if (c2Var == null || (yVar = c2Var.f5424b) == null) {
                    yVar = this.f5449i;
                }
                float f10 = i9;
                float c9 = yVar.c((i8 - c4) / f10);
                if (z8) {
                    return c9;
                }
                f9 = (f10 * c9) + c4;
            }
        }
        return f9 / 1000;
    }

    public final void h(q qVar, q qVar2, q qVar3) {
        float[] fArr;
        float[] fArr2;
        boolean z8 = this.f5458r != null;
        q qVar4 = this.f5452l;
        i.p pVar = this.f5447g;
        i.o oVar = this.f5446f;
        if (qVar4 == null) {
            this.f5452l = qVar.c();
            this.f5453m = qVar3.c();
            int i7 = oVar.f4769b;
            float[] fArr3 = new float[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                fArr3[i8] = oVar.c(i8) / 1000;
            }
            this.f5451k = fArr3;
            int i9 = oVar.f4769b;
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr[i10] = 0;
            }
            this.f5450j = iArr;
        }
        if (z8) {
            if (this.f5458r != null) {
                q qVar5 = this.f5454n;
                if (qVar5 == null) {
                    r6.k.j("lastInitialValue");
                    throw null;
                }
                if (qVar5.equals(qVar)) {
                    q qVar6 = this.f5455o;
                    if (qVar6 == null) {
                        r6.k.j("lastTargetValue");
                        throw null;
                    }
                    if (qVar6.equals(qVar2)) {
                        return;
                    }
                }
            }
            this.f5454n = qVar;
            this.f5455o = qVar2;
            int b9 = qVar.b() + (qVar.b() % 2);
            this.f5456p = new float[b9];
            this.f5457q = new float[b9];
            int i11 = oVar.f4769b;
            float[][] fArr4 = new float[i11][];
            for (int i12 = 0; i12 < i11; i12++) {
                int c4 = oVar.c(i12);
                if (c4 != 0) {
                    if (c4 != this.f5448h) {
                        fArr = new float[b9];
                        Object f9 = pVar.f(c4);
                        r6.k.c(f9);
                        q qVar7 = ((c2) f9).f5423a;
                        for (int i13 = 0; i13 < b9; i13++) {
                            fArr[i13] = qVar7.a(i13);
                        }
                    } else if (pVar.b(c4)) {
                        fArr = new float[b9];
                        Object f10 = pVar.f(c4);
                        r6.k.c(f10);
                        q qVar8 = ((c2) f10).f5423a;
                        for (int i14 = 0; i14 < b9; i14++) {
                            fArr[i14] = qVar8.a(i14);
                        }
                    } else {
                        fArr2 = new float[b9];
                        for (int i15 = 0; i15 < b9; i15++) {
                            fArr2[i15] = qVar2.a(i15);
                        }
                    }
                    fArr2 = fArr;
                } else if (pVar.b(c4)) {
                    fArr = new float[b9];
                    Object f11 = pVar.f(c4);
                    r6.k.c(f11);
                    q qVar9 = ((c2) f11).f5423a;
                    for (int i16 = 0; i16 < b9; i16++) {
                        fArr[i16] = qVar9.a(i16);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b9];
                    for (int i17 = 0; i17 < b9; i17++) {
                        fArr2[i17] = qVar.a(i17);
                    }
                }
                fArr4[i12] = fArr2;
            }
            int[] iArr2 = this.f5450j;
            if (iArr2 == null) {
                r6.k.j("modes");
                throw null;
            }
            float[] fArr5 = this.f5451k;
            if (fArr5 == null) {
                r6.k.j("times");
                throw null;
            }
            this.f5458r = new b6.c(iArr2, fArr5, fArr4);
        }
    }

    @Override // l.z1
    public final int j() {
        return 0;
    }

    @Override // l.z1
    public final int k() {
        return this.f5448h;
    }
}
