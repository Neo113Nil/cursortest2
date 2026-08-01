package t;

import androidx.emoji2.text.t;
import androidx.fragment.app.w0;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f3233b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3234c;

    /* renamed from: a, reason: collision with root package name */
    public int f3232a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3235e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3236f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3237g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f3238h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3239j = false;

    public a(b bVar, t tVar) {
        this.f3233b = bVar;
        this.f3234c = tVar;
    }

    public final void a(f fVar, float f2, boolean z3) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f3238h;
            b bVar = this.f3233b;
            if (i == -1) {
                this.f3238h = 0;
                this.f3237g[0] = f2;
                this.f3235e[0] = fVar.f3263g;
                this.f3236f[0] = -1;
                fVar.f3271p++;
                fVar.a(bVar);
                this.f3232a++;
                if (this.f3239j) {
                    return;
                }
                int i4 = this.i + 1;
                this.i = i4;
                int[] iArr = this.f3235e;
                if (i4 >= iArr.length) {
                    this.f3239j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i != -1 && i6 < this.f3232a; i6++) {
                int i7 = this.f3235e[i];
                int i8 = fVar.f3263g;
                if (i7 == i8) {
                    float[] fArr = this.f3237g;
                    float f4 = fArr[i] + f2;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i] = f4;
                    if (f4 == 0.0f) {
                        if (i == this.f3238h) {
                            this.f3238h = this.f3236f[i];
                        } else {
                            int[] iArr2 = this.f3236f;
                            iArr2[i5] = iArr2[i];
                        }
                        if (z3) {
                            fVar.b(bVar);
                        }
                        if (this.f3239j) {
                            this.i = i;
                        }
                        fVar.f3271p--;
                        this.f3232a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i;
                }
                i = this.f3236f[i];
            }
            int i9 = this.i;
            int i10 = i9 + 1;
            if (this.f3239j) {
                int[] iArr3 = this.f3235e;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.f3235e;
            if (i9 >= iArr4.length && this.f3232a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f3235e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        i9 = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f3235e;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.d * 2;
                this.d = i12;
                this.f3239j = false;
                this.i = i9 - 1;
                this.f3237g = Arrays.copyOf(this.f3237g, i12);
                this.f3235e = Arrays.copyOf(this.f3235e, this.d);
                this.f3236f = Arrays.copyOf(this.f3236f, this.d);
            }
            this.f3235e[i9] = fVar.f3263g;
            this.f3237g[i9] = f2;
            if (i5 != -1) {
                int[] iArr7 = this.f3236f;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.f3236f[i9] = this.f3238h;
                this.f3238h = i9;
            }
            fVar.f3271p++;
            fVar.a(bVar);
            this.f3232a++;
            if (!this.f3239j) {
                this.i++;
            }
            int i13 = this.i;
            int[] iArr8 = this.f3235e;
            if (i13 >= iArr8.length) {
                this.f3239j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f3238h;
        for (int i4 = 0; i != -1 && i4 < this.f3232a; i4++) {
            f fVar = ((f[]) this.f3234c.d)[this.f3235e[i]];
            if (fVar != null) {
                fVar.b(this.f3233b);
            }
            i = this.f3236f[i];
        }
        this.f3238h = -1;
        this.i = -1;
        this.f3239j = false;
        this.f3232a = 0;
    }

    public final float c(f fVar) {
        int i = this.f3238h;
        for (int i4 = 0; i != -1 && i4 < this.f3232a; i4++) {
            if (this.f3235e[i] == fVar.f3263g) {
                return this.f3237g[i];
            }
            i = this.f3236f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3232a;
    }

    public final f e(int i) {
        int i4 = this.f3238h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3232a; i5++) {
            if (i5 == i) {
                return ((f[]) this.f3234c.d)[this.f3235e[i4]];
            }
            i4 = this.f3236f[i4];
        }
        return null;
    }

    public final float f(int i) {
        int i4 = this.f3238h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3232a; i5++) {
            if (i5 == i) {
                return this.f3237g[i4];
            }
            i4 = this.f3236f[i4];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f2) {
        if (f2 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i = this.f3238h;
        b bVar = this.f3233b;
        if (i == -1) {
            this.f3238h = 0;
            this.f3237g[0] = f2;
            this.f3235e[0] = fVar.f3263g;
            this.f3236f[0] = -1;
            fVar.f3271p++;
            fVar.a(bVar);
            this.f3232a++;
            if (this.f3239j) {
                return;
            }
            int i4 = this.i + 1;
            this.i = i4;
            int[] iArr = this.f3235e;
            if (i4 >= iArr.length) {
                this.f3239j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i != -1 && i6 < this.f3232a; i6++) {
            int i7 = this.f3235e[i];
            int i8 = fVar.f3263g;
            if (i7 == i8) {
                this.f3237g[i] = f2;
                return;
            }
            if (i7 < i8) {
                i5 = i;
            }
            i = this.f3236f[i];
        }
        int i9 = this.i;
        int i10 = i9 + 1;
        if (this.f3239j) {
            int[] iArr2 = this.f3235e;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f3235e;
        if (i9 >= iArr3.length && this.f3232a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f3235e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    i9 = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f3235e;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.d * 2;
            this.d = i12;
            this.f3239j = false;
            this.i = i9 - 1;
            this.f3237g = Arrays.copyOf(this.f3237g, i12);
            this.f3235e = Arrays.copyOf(this.f3235e, this.d);
            this.f3236f = Arrays.copyOf(this.f3236f, this.d);
        }
        this.f3235e[i9] = fVar.f3263g;
        this.f3237g[i9] = f2;
        if (i5 != -1) {
            int[] iArr6 = this.f3236f;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.f3236f[i9] = this.f3238h;
            this.f3238h = i9;
        }
        fVar.f3271p++;
        fVar.a(bVar);
        int i13 = this.f3232a + 1;
        this.f3232a = i13;
        if (!this.f3239j) {
            this.i++;
        }
        int[] iArr7 = this.f3235e;
        if (i13 >= iArr7.length) {
            this.f3239j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3239j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z3) {
        int i = this.f3238h;
        if (i == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f3232a) {
            if (this.f3235e[i] == fVar.f3263g) {
                if (i == this.f3238h) {
                    this.f3238h = this.f3236f[i];
                } else {
                    int[] iArr = this.f3236f;
                    iArr[i5] = iArr[i];
                }
                if (z3) {
                    fVar.b(this.f3233b);
                }
                fVar.f3271p--;
                this.f3232a--;
                this.f3235e[i] = -1;
                if (this.f3239j) {
                    this.i = i;
                }
                return this.f3237g[i];
            }
            i4++;
            i5 = i;
            i = this.f3236f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f3238h;
        String str = "";
        for (int i4 = 0; i != -1 && i4 < this.f3232a; i4++) {
            str = (w0.f(str, " -> ") + this.f3237g[i] + " : ") + ((f[]) this.f3234c.d)[this.f3235e[i]];
            i = this.f3236f[i];
        }
        return str;
    }
}
