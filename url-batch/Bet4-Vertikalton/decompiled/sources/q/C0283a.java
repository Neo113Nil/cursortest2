package q;

import K.C0014l;
import Y.V;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283a {

    /* renamed from: b, reason: collision with root package name */
    public final C0284b f3462b;

    /* renamed from: c, reason: collision with root package name */
    public final C0014l f3463c;

    /* renamed from: a, reason: collision with root package name */
    public int f3461a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3464e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3465f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3466g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3467j = false;

    public C0283a(C0284b c0284b, C0014l c0014l) {
        this.f3462b = c0284b;
        this.f3463c = c0014l;
    }

    public final void a(C0288f c0288f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0284b c0284b = this.f3462b;
            if (i == -1) {
                this.h = 0;
                this.f3466g[0] = f2;
                this.f3464e[0] = c0288f.f3490b;
                this.f3465f[0] = -1;
                c0288f.f3496k++;
                c0288f.a(c0284b);
                this.f3461a++;
                if (this.f3467j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3464e;
                if (i2 >= iArr.length) {
                    this.f3467j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3461a; i4++) {
                int i5 = this.f3464e[i];
                int i6 = c0288f.f3490b;
                if (i5 == i6) {
                    float[] fArr = this.f3466g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == RecyclerView.f1530C0) {
                        if (i == this.h) {
                            this.h = this.f3465f[i];
                        } else {
                            int[] iArr2 = this.f3465f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0288f.b(c0284b);
                        }
                        if (this.f3467j) {
                            this.i = i;
                        }
                        c0288f.f3496k--;
                        this.f3461a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3465f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3467j) {
                int[] iArr3 = this.f3464e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3464e;
            if (i7 >= iArr4.length && this.f3461a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3464e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f3464e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3467j = false;
                this.i = i7 - 1;
                this.f3466g = Arrays.copyOf(this.f3466g, i10);
                this.f3464e = Arrays.copyOf(this.f3464e, this.d);
                this.f3465f = Arrays.copyOf(this.f3465f, this.d);
            }
            this.f3464e[i7] = c0288f.f3490b;
            this.f3466g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3465f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3465f[i7] = this.h;
                this.h = i7;
            }
            c0288f.f3496k++;
            c0288f.a(c0284b);
            this.f3461a++;
            if (!this.f3467j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3464e;
            if (i11 >= iArr8.length) {
                this.f3467j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3461a; i2++) {
            C0288f c0288f = ((C0288f[]) this.f3463c.f476c)[this.f3464e[i]];
            if (c0288f != null) {
                c0288f.b(this.f3462b);
            }
            i = this.f3465f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3467j = false;
        this.f3461a = 0;
    }

    public final float c(C0288f c0288f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3461a; i2++) {
            if (this.f3464e[i] == c0288f.f3490b) {
                return this.f3466g[i];
            }
            i = this.f3465f[i];
        }
        return RecyclerView.f1530C0;
    }

    public final int d() {
        return this.f3461a;
    }

    public final C0288f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3461a; i3++) {
            if (i3 == i) {
                return ((C0288f[]) this.f3463c.f476c)[this.f3464e[i2]];
            }
            i2 = this.f3465f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3461a; i3++) {
            if (i3 == i) {
                return this.f3466g[i2];
            }
            i2 = this.f3465f[i2];
        }
        return RecyclerView.f1530C0;
    }

    public final void g(C0288f c0288f, float f2) {
        if (f2 == RecyclerView.f1530C0) {
            h(c0288f, true);
            return;
        }
        int i = this.h;
        C0284b c0284b = this.f3462b;
        if (i == -1) {
            this.h = 0;
            this.f3466g[0] = f2;
            this.f3464e[0] = c0288f.f3490b;
            this.f3465f[0] = -1;
            c0288f.f3496k++;
            c0288f.a(c0284b);
            this.f3461a++;
            if (this.f3467j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3464e;
            if (i2 >= iArr.length) {
                this.f3467j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3461a; i4++) {
            int i5 = this.f3464e[i];
            int i6 = c0288f.f3490b;
            if (i5 == i6) {
                this.f3466g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3465f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3467j) {
            int[] iArr2 = this.f3464e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3464e;
        if (i7 >= iArr3.length && this.f3461a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3464e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f3464e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3467j = false;
            this.i = i7 - 1;
            this.f3466g = Arrays.copyOf(this.f3466g, i10);
            this.f3464e = Arrays.copyOf(this.f3464e, this.d);
            this.f3465f = Arrays.copyOf(this.f3465f, this.d);
        }
        this.f3464e[i7] = c0288f.f3490b;
        this.f3466g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3465f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3465f[i7] = this.h;
            this.h = i7;
        }
        c0288f.f3496k++;
        c0288f.a(c0284b);
        int i11 = this.f3461a + 1;
        this.f3461a = i11;
        if (!this.f3467j) {
            this.i++;
        }
        int[] iArr7 = this.f3464e;
        if (i11 >= iArr7.length) {
            this.f3467j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3467j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0288f c0288f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return RecyclerView.f1530C0;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3461a) {
            if (this.f3464e[i] == c0288f.f3490b) {
                if (i == this.h) {
                    this.h = this.f3465f[i];
                } else {
                    int[] iArr = this.f3465f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0288f.b(this.f3462b);
                }
                c0288f.f3496k--;
                this.f3461a--;
                this.f3464e[i] = -1;
                if (this.f3467j) {
                    this.i = i;
                }
                return this.f3466g[i];
            }
            i2++;
            i3 = i;
            i = this.f3465f[i];
        }
        return RecyclerView.f1530C0;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3461a; i2++) {
            str = (V.f(str, " -> ") + this.f3466g[i] + " : ") + ((C0288f[]) this.f3463c.f476c)[this.f3464e[i]];
            i = this.f3465f[i];
        }
        return str;
    }
}
