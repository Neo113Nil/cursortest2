package q;

import androidx.emoji2.text.s;
import androidx.fragment.app.w0;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f3055b;
    public final s c;

    /* renamed from: a, reason: collision with root package name */
    public int f3054a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3056d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3057e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3058f = new int[8];
    public float[] g = new float[8];
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3059i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3060j = false;

    public a(b bVar, s sVar) {
        this.f3055b = bVar;
        this.c = sVar;
    }

    public final void a(f fVar, float f4, boolean z3) {
        if (f4 <= -0.001f || f4 >= 0.001f) {
            int i4 = this.h;
            b bVar = this.f3055b;
            if (i4 == -1) {
                this.h = 0;
                this.g[0] = f4;
                this.f3057e[0] = fVar.g;
                this.f3058f[0] = -1;
                fVar.f3090p++;
                fVar.a(bVar);
                this.f3054a++;
                if (this.f3060j) {
                    return;
                }
                int i5 = this.f3059i + 1;
                this.f3059i = i5;
                int[] iArr = this.f3057e;
                if (i5 >= iArr.length) {
                    this.f3060j = true;
                    this.f3059i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f3054a; i7++) {
                int i8 = this.f3057e[i4];
                int i9 = fVar.g;
                if (i8 == i9) {
                    float[] fArr = this.g;
                    float f5 = fArr[i4] + f4;
                    if (f5 > -0.001f && f5 < 0.001f) {
                        f5 = 0.0f;
                    }
                    fArr[i4] = f5;
                    if (f5 == 0.0f) {
                        if (i4 == this.h) {
                            this.h = this.f3058f[i4];
                        } else {
                            int[] iArr2 = this.f3058f;
                            iArr2[i6] = iArr2[i4];
                        }
                        if (z3) {
                            fVar.b(bVar);
                        }
                        if (this.f3060j) {
                            this.f3059i = i4;
                        }
                        fVar.f3090p--;
                        this.f3054a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i4;
                }
                i4 = this.f3058f[i4];
            }
            int i10 = this.f3059i;
            int i11 = i10 + 1;
            if (this.f3060j) {
                int[] iArr3 = this.f3057e;
                if (iArr3[i10] != -1) {
                    i10 = iArr3.length;
                }
            } else {
                i10 = i11;
            }
            int[] iArr4 = this.f3057e;
            if (i10 >= iArr4.length && this.f3054a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f3057e;
                    if (i12 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i12] == -1) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                }
            }
            int[] iArr6 = this.f3057e;
            if (i10 >= iArr6.length) {
                i10 = iArr6.length;
                int i13 = this.f3056d * 2;
                this.f3056d = i13;
                this.f3060j = false;
                this.f3059i = i10 - 1;
                this.g = Arrays.copyOf(this.g, i13);
                this.f3057e = Arrays.copyOf(this.f3057e, this.f3056d);
                this.f3058f = Arrays.copyOf(this.f3058f, this.f3056d);
            }
            this.f3057e[i10] = fVar.g;
            this.g[i10] = f4;
            if (i6 != -1) {
                int[] iArr7 = this.f3058f;
                iArr7[i10] = iArr7[i6];
                iArr7[i6] = i10;
            } else {
                this.f3058f[i10] = this.h;
                this.h = i10;
            }
            fVar.f3090p++;
            fVar.a(bVar);
            this.f3054a++;
            if (!this.f3060j) {
                this.f3059i++;
            }
            int i14 = this.f3059i;
            int[] iArr8 = this.f3057e;
            if (i14 >= iArr8.length) {
                this.f3060j = true;
                this.f3059i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3054a; i5++) {
            f fVar = ((f[]) this.c.f358d)[this.f3057e[i4]];
            if (fVar != null) {
                fVar.b(this.f3055b);
            }
            i4 = this.f3058f[i4];
        }
        this.h = -1;
        this.f3059i = -1;
        this.f3060j = false;
        this.f3054a = 0;
    }

    public final float c(f fVar) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3054a; i5++) {
            if (this.f3057e[i4] == fVar.g) {
                return this.g[i4];
            }
            i4 = this.f3058f[i4];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3054a;
    }

    public final f e(int i4) {
        int i5 = this.h;
        for (int i6 = 0; i5 != -1 && i6 < this.f3054a; i6++) {
            if (i6 == i4) {
                return ((f[]) this.c.f358d)[this.f3057e[i5]];
            }
            i5 = this.f3058f[i5];
        }
        return null;
    }

    public final float f(int i4) {
        int i5 = this.h;
        for (int i6 = 0; i5 != -1 && i6 < this.f3054a; i6++) {
            if (i6 == i4) {
                return this.g[i5];
            }
            i5 = this.f3058f[i5];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f4) {
        if (f4 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i4 = this.h;
        b bVar = this.f3055b;
        if (i4 == -1) {
            this.h = 0;
            this.g[0] = f4;
            this.f3057e[0] = fVar.g;
            this.f3058f[0] = -1;
            fVar.f3090p++;
            fVar.a(bVar);
            this.f3054a++;
            if (this.f3060j) {
                return;
            }
            int i5 = this.f3059i + 1;
            this.f3059i = i5;
            int[] iArr = this.f3057e;
            if (i5 >= iArr.length) {
                this.f3060j = true;
                this.f3059i = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f3054a; i7++) {
            int i8 = this.f3057e[i4];
            int i9 = fVar.g;
            if (i8 == i9) {
                this.g[i4] = f4;
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f3058f[i4];
        }
        int i10 = this.f3059i;
        int i11 = i10 + 1;
        if (this.f3060j) {
            int[] iArr2 = this.f3057e;
            if (iArr2[i10] != -1) {
                i10 = iArr2.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr3 = this.f3057e;
        if (i10 >= iArr3.length && this.f3054a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f3057e;
                if (i12 >= iArr4.length) {
                    break;
                }
                if (iArr4[i12] == -1) {
                    i10 = i12;
                    break;
                }
                i12++;
            }
        }
        int[] iArr5 = this.f3057e;
        if (i10 >= iArr5.length) {
            i10 = iArr5.length;
            int i13 = this.f3056d * 2;
            this.f3056d = i13;
            this.f3060j = false;
            this.f3059i = i10 - 1;
            this.g = Arrays.copyOf(this.g, i13);
            this.f3057e = Arrays.copyOf(this.f3057e, this.f3056d);
            this.f3058f = Arrays.copyOf(this.f3058f, this.f3056d);
        }
        this.f3057e[i10] = fVar.g;
        this.g[i10] = f4;
        if (i6 != -1) {
            int[] iArr6 = this.f3058f;
            iArr6[i10] = iArr6[i6];
            iArr6[i6] = i10;
        } else {
            this.f3058f[i10] = this.h;
            this.h = i10;
        }
        fVar.f3090p++;
        fVar.a(bVar);
        int i14 = this.f3054a + 1;
        this.f3054a = i14;
        if (!this.f3060j) {
            this.f3059i++;
        }
        int[] iArr7 = this.f3057e;
        if (i14 >= iArr7.length) {
            this.f3060j = true;
        }
        if (this.f3059i >= iArr7.length) {
            this.f3060j = true;
            this.f3059i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z3) {
        int i4 = this.h;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f3054a) {
            if (this.f3057e[i4] == fVar.g) {
                if (i4 == this.h) {
                    this.h = this.f3058f[i4];
                } else {
                    int[] iArr = this.f3058f;
                    iArr[i6] = iArr[i4];
                }
                if (z3) {
                    fVar.b(this.f3055b);
                }
                fVar.f3090p--;
                this.f3054a--;
                this.f3057e[i4] = -1;
                if (this.f3060j) {
                    this.f3059i = i4;
                }
                return this.g[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f3058f[i4];
        }
        return 0.0f;
    }

    public final String toString() {
        int i4 = this.h;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f3054a; i5++) {
            str = (w0.f(str, " -> ") + this.g[i4] + " : ") + ((f[]) this.c.f358d)[this.f3057e[i4]];
            i4 = this.f3058f[i4];
        }
        return str;
    }
}
