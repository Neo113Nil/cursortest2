package w2;

import a0.g1;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f7832b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f7833c;

    /* renamed from: a, reason: collision with root package name */
    public int f7831a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7834d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7835e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f7836f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f7837g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f7838h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7839j = false;

    public a(b bVar, g1 g1Var) {
        this.f7832b = bVar;
        this.f7833c = g1Var;
    }

    public final void a(f fVar, float f6, boolean z3) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i = this.f7838h;
            b bVar = this.f7832b;
            if (i == -1) {
                this.f7838h = 0;
                this.f7837g[0] = f6;
                this.f7835e[0] = fVar.f7866e;
                this.f7836f[0] = -1;
                fVar.f7874n++;
                fVar.a(bVar);
                this.f7831a++;
                if (this.f7839j) {
                    return;
                }
                int i8 = this.i + 1;
                this.i = i8;
                int[] iArr = this.f7835e;
                if (i8 >= iArr.length) {
                    this.f7839j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i != -1 && i10 < this.f7831a; i10++) {
                int i11 = this.f7835e[i];
                int i12 = fVar.f7866e;
                if (i11 == i12) {
                    float[] fArr = this.f7837g;
                    float f8 = fArr[i] + f6;
                    if (f8 > -0.001f && f8 < 0.001f) {
                        f8 = 0.0f;
                    }
                    fArr[i] = f8;
                    if (f8 == 0.0f) {
                        if (i == this.f7838h) {
                            this.f7838h = this.f7836f[i];
                        } else {
                            int[] iArr2 = this.f7836f;
                            iArr2[i9] = iArr2[i];
                        }
                        if (z3) {
                            fVar.b(bVar);
                        }
                        if (this.f7839j) {
                            this.i = i;
                        }
                        fVar.f7874n--;
                        this.f7831a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i;
                }
                i = this.f7836f[i];
            }
            int i13 = this.i;
            int i14 = i13 + 1;
            if (this.f7839j) {
                int[] iArr3 = this.f7835e;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f7835e;
            if (i13 >= iArr4.length && this.f7831a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f7835e;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f7835e;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f7834d * 2;
                this.f7834d = i16;
                this.f7839j = false;
                this.i = i13 - 1;
                this.f7837g = Arrays.copyOf(this.f7837g, i16);
                this.f7835e = Arrays.copyOf(this.f7835e, this.f7834d);
                this.f7836f = Arrays.copyOf(this.f7836f, this.f7834d);
            }
            this.f7835e[i13] = fVar.f7866e;
            this.f7837g[i13] = f6;
            if (i9 != -1) {
                int[] iArr7 = this.f7836f;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f7836f[i13] = this.f7838h;
                this.f7838h = i13;
            }
            fVar.f7874n++;
            fVar.a(bVar);
            this.f7831a++;
            if (!this.f7839j) {
                this.i++;
            }
            int i17 = this.i;
            int[] iArr8 = this.f7835e;
            if (i17 >= iArr8.length) {
                this.f7839j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f7838h;
        for (int i8 = 0; i != -1 && i8 < this.f7831a; i8++) {
            f fVar = ((f[]) this.f7833c.f86d)[this.f7835e[i]];
            if (fVar != null) {
                fVar.b(this.f7832b);
            }
            i = this.f7836f[i];
        }
        this.f7838h = -1;
        this.i = -1;
        this.f7839j = false;
        this.f7831a = 0;
    }

    public final float c(f fVar) {
        int i = this.f7838h;
        for (int i8 = 0; i != -1 && i8 < this.f7831a; i8++) {
            if (this.f7835e[i] == fVar.f7866e) {
                return this.f7837g[i];
            }
            i = this.f7836f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f7831a;
    }

    public final f e(int i) {
        int i8 = this.f7838h;
        for (int i9 = 0; i8 != -1 && i9 < this.f7831a; i9++) {
            if (i9 == i) {
                return ((f[]) this.f7833c.f86d)[this.f7835e[i8]];
            }
            i8 = this.f7836f[i8];
        }
        return null;
    }

    public final float f(int i) {
        int i8 = this.f7838h;
        for (int i9 = 0; i8 != -1 && i9 < this.f7831a; i9++) {
            if (i9 == i) {
                return this.f7837g[i8];
            }
            i8 = this.f7836f[i8];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f6) {
        if (f6 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i = this.f7838h;
        b bVar = this.f7832b;
        if (i == -1) {
            this.f7838h = 0;
            this.f7837g[0] = f6;
            this.f7835e[0] = fVar.f7866e;
            this.f7836f[0] = -1;
            fVar.f7874n++;
            fVar.a(bVar);
            this.f7831a++;
            if (this.f7839j) {
                return;
            }
            int i8 = this.i + 1;
            this.i = i8;
            int[] iArr = this.f7835e;
            if (i8 >= iArr.length) {
                this.f7839j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i != -1 && i10 < this.f7831a; i10++) {
            int i11 = this.f7835e[i];
            int i12 = fVar.f7866e;
            if (i11 == i12) {
                this.f7837g[i] = f6;
                return;
            }
            if (i11 < i12) {
                i9 = i;
            }
            i = this.f7836f[i];
        }
        int i13 = this.i;
        int i14 = i13 + 1;
        if (this.f7839j) {
            int[] iArr2 = this.f7835e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f7835e;
        if (i13 >= iArr3.length && this.f7831a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f7835e;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f7835e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f7834d * 2;
            this.f7834d = i16;
            this.f7839j = false;
            this.i = i13 - 1;
            this.f7837g = Arrays.copyOf(this.f7837g, i16);
            this.f7835e = Arrays.copyOf(this.f7835e, this.f7834d);
            this.f7836f = Arrays.copyOf(this.f7836f, this.f7834d);
        }
        this.f7835e[i13] = fVar.f7866e;
        this.f7837g[i13] = f6;
        if (i9 != -1) {
            int[] iArr6 = this.f7836f;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f7836f[i13] = this.f7838h;
            this.f7838h = i13;
        }
        fVar.f7874n++;
        fVar.a(bVar);
        int i17 = this.f7831a + 1;
        this.f7831a = i17;
        if (!this.f7839j) {
            this.i++;
        }
        int[] iArr7 = this.f7835e;
        if (i17 >= iArr7.length) {
            this.f7839j = true;
        }
        if (this.i >= iArr7.length) {
            this.f7839j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z3) {
        int i = this.f7838h;
        if (i == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i != -1 && i8 < this.f7831a) {
            if (this.f7835e[i] == fVar.f7866e) {
                if (i == this.f7838h) {
                    this.f7838h = this.f7836f[i];
                } else {
                    int[] iArr = this.f7836f;
                    iArr[i9] = iArr[i];
                }
                if (z3) {
                    fVar.b(this.f7832b);
                }
                fVar.f7874n--;
                this.f7831a--;
                this.f7835e[i] = -1;
                if (this.f7839j) {
                    this.i = i;
                }
                return this.f7837g[i];
            }
            i8++;
            i9 = i;
            i = this.f7836f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f7838h;
        String str = "";
        for (int i8 = 0; i != -1 && i8 < this.f7831a; i8++) {
            str = ((str + " -> ") + this.f7837g[i] + " : ") + ((f[]) this.f7833c.f86d)[this.f7835e[i]];
            i = this.f7836f[i];
        }
        return str;
    }
}
