package t;

import androidx.emoji2.text.t;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f3348b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3349c;

    /* renamed from: a, reason: collision with root package name */
    public int f3347a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3350e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3351f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3352g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3353j = false;

    public a(b bVar, t tVar) {
        this.f3348b = bVar;
        this.f3349c = tVar;
    }

    public final void a(f fVar, float f5, boolean z4) {
        if (f5 <= -0.001f || f5 >= 0.001f) {
            int i = this.h;
            b bVar = this.f3348b;
            if (i == -1) {
                this.h = 0;
                this.f3352g[0] = f5;
                this.f3350e[0] = fVar.f3376g;
                this.f3351f[0] = -1;
                fVar.f3383p++;
                fVar.a(bVar);
                this.f3347a++;
                if (this.f3353j) {
                    return;
                }
                int i4 = this.i + 1;
                this.i = i4;
                int[] iArr = this.f3350e;
                if (i4 >= iArr.length) {
                    this.f3353j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i != -1 && i6 < this.f3347a; i6++) {
                int i7 = this.f3350e[i];
                int i8 = fVar.f3376g;
                if (i7 == i8) {
                    float[] fArr = this.f3352g;
                    float f6 = fArr[i] + f5;
                    if (f6 > -0.001f && f6 < 0.001f) {
                        f6 = 0.0f;
                    }
                    fArr[i] = f6;
                    if (f6 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3351f[i];
                        } else {
                            int[] iArr2 = this.f3351f;
                            iArr2[i5] = iArr2[i];
                        }
                        if (z4) {
                            fVar.b(bVar);
                        }
                        if (this.f3353j) {
                            this.i = i;
                        }
                        fVar.f3383p--;
                        this.f3347a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i;
                }
                i = this.f3351f[i];
            }
            int i9 = this.i;
            int i10 = i9 + 1;
            if (this.f3353j) {
                int[] iArr3 = this.f3350e;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.f3350e;
            if (i9 >= iArr4.length && this.f3347a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f3350e;
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
            int[] iArr6 = this.f3350e;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.d * 2;
                this.d = i12;
                this.f3353j = false;
                this.i = i9 - 1;
                this.f3352g = Arrays.copyOf(this.f3352g, i12);
                this.f3350e = Arrays.copyOf(this.f3350e, this.d);
                this.f3351f = Arrays.copyOf(this.f3351f, this.d);
            }
            this.f3350e[i9] = fVar.f3376g;
            this.f3352g[i9] = f5;
            if (i5 != -1) {
                int[] iArr7 = this.f3351f;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.f3351f[i9] = this.h;
                this.h = i9;
            }
            fVar.f3383p++;
            fVar.a(bVar);
            this.f3347a++;
            if (!this.f3353j) {
                this.i++;
            }
            int i13 = this.i;
            int[] iArr8 = this.f3350e;
            if (i13 >= iArr8.length) {
                this.f3353j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i4 = 0; i != -1 && i4 < this.f3347a; i4++) {
            f fVar = ((f[]) this.f3349c.f474c)[this.f3350e[i]];
            if (fVar != null) {
                fVar.b(this.f3348b);
            }
            i = this.f3351f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3353j = false;
        this.f3347a = 0;
    }

    public final float c(f fVar) {
        int i = this.h;
        for (int i4 = 0; i != -1 && i4 < this.f3347a; i4++) {
            if (this.f3350e[i] == fVar.f3376g) {
                return this.f3352g[i];
            }
            i = this.f3351f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3347a;
    }

    public final f e(int i) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3347a; i5++) {
            if (i5 == i) {
                return ((f[]) this.f3349c.f474c)[this.f3350e[i4]];
            }
            i4 = this.f3351f[i4];
        }
        return null;
    }

    public final float f(int i) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f3347a; i5++) {
            if (i5 == i) {
                return this.f3352g[i4];
            }
            i4 = this.f3351f[i4];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f5) {
        if (f5 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i = this.h;
        b bVar = this.f3348b;
        if (i == -1) {
            this.h = 0;
            this.f3352g[0] = f5;
            this.f3350e[0] = fVar.f3376g;
            this.f3351f[0] = -1;
            fVar.f3383p++;
            fVar.a(bVar);
            this.f3347a++;
            if (this.f3353j) {
                return;
            }
            int i4 = this.i + 1;
            this.i = i4;
            int[] iArr = this.f3350e;
            if (i4 >= iArr.length) {
                this.f3353j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i != -1 && i6 < this.f3347a; i6++) {
            int i7 = this.f3350e[i];
            int i8 = fVar.f3376g;
            if (i7 == i8) {
                this.f3352g[i] = f5;
                return;
            }
            if (i7 < i8) {
                i5 = i;
            }
            i = this.f3351f[i];
        }
        int i9 = this.i;
        int i10 = i9 + 1;
        if (this.f3353j) {
            int[] iArr2 = this.f3350e;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f3350e;
        if (i9 >= iArr3.length && this.f3347a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f3350e;
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
        int[] iArr5 = this.f3350e;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.d * 2;
            this.d = i12;
            this.f3353j = false;
            this.i = i9 - 1;
            this.f3352g = Arrays.copyOf(this.f3352g, i12);
            this.f3350e = Arrays.copyOf(this.f3350e, this.d);
            this.f3351f = Arrays.copyOf(this.f3351f, this.d);
        }
        this.f3350e[i9] = fVar.f3376g;
        this.f3352g[i9] = f5;
        if (i5 != -1) {
            int[] iArr6 = this.f3351f;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.f3351f[i9] = this.h;
            this.h = i9;
        }
        fVar.f3383p++;
        fVar.a(bVar);
        int i13 = this.f3347a + 1;
        this.f3347a = i13;
        if (!this.f3353j) {
            this.i++;
        }
        int[] iArr7 = this.f3350e;
        if (i13 >= iArr7.length) {
            this.f3353j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3353j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z4) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f3347a) {
            if (this.f3350e[i] == fVar.f3376g) {
                if (i == this.h) {
                    this.h = this.f3351f[i];
                } else {
                    int[] iArr = this.f3351f;
                    iArr[i5] = iArr[i];
                }
                if (z4) {
                    fVar.b(this.f3348b);
                }
                fVar.f3383p--;
                this.f3347a--;
                this.f3350e[i] = -1;
                if (this.f3353j) {
                    this.i = i;
                }
                return this.f3352g[i];
            }
            i4++;
            i5 = i;
            i = this.f3351f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i4 = 0; i != -1 && i4 < this.f3347a; i4++) {
            str = (a4.b.g(str, " -> ") + this.f3352g[i] + " : ") + ((f[]) this.f3349c.f474c)[this.f3350e[i]];
            i = this.f3351f[i];
        }
        return str;
    }
}
