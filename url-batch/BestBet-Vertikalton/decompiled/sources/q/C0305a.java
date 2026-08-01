package q;

import G1.AbstractC0001b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import u0.C0372k;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305a {

    /* renamed from: b, reason: collision with root package name */
    public final C0306b f3712b;

    /* renamed from: c, reason: collision with root package name */
    public final C0372k f3713c;

    /* renamed from: a, reason: collision with root package name */
    public int f3711a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3714e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3715f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3716g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3717j = false;

    public C0305a(C0306b c0306b, C0372k c0372k) {
        this.f3712b = c0306b;
        this.f3713c = c0372k;
    }

    public final void a(C0310f c0310f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0306b c0306b = this.f3712b;
            if (i == -1) {
                this.h = 0;
                this.f3716g[0] = f2;
                this.f3714e[0] = c0310f.f3740b;
                this.f3715f[0] = -1;
                c0310f.f3746k++;
                c0310f.a(c0306b);
                this.f3711a++;
                if (this.f3717j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3714e;
                if (i2 >= iArr.length) {
                    this.f3717j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3711a; i4++) {
                int i5 = this.f3714e[i];
                int i6 = c0310f.f3740b;
                if (i5 == i6) {
                    float[] fArr = this.f3716g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == RecyclerView.f1937A0) {
                        if (i == this.h) {
                            this.h = this.f3715f[i];
                        } else {
                            int[] iArr2 = this.f3715f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0310f.b(c0306b);
                        }
                        if (this.f3717j) {
                            this.i = i;
                        }
                        c0310f.f3746k--;
                        this.f3711a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3715f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3717j) {
                int[] iArr3 = this.f3714e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3714e;
            if (i7 >= iArr4.length && this.f3711a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3714e;
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
            int[] iArr6 = this.f3714e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3717j = false;
                this.i = i7 - 1;
                this.f3716g = Arrays.copyOf(this.f3716g, i10);
                this.f3714e = Arrays.copyOf(this.f3714e, this.d);
                this.f3715f = Arrays.copyOf(this.f3715f, this.d);
            }
            this.f3714e[i7] = c0310f.f3740b;
            this.f3716g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3715f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3715f[i7] = this.h;
                this.h = i7;
            }
            c0310f.f3746k++;
            c0310f.a(c0306b);
            this.f3711a++;
            if (!this.f3717j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3714e;
            if (i11 >= iArr8.length) {
                this.f3717j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3711a; i2++) {
            C0310f c0310f = ((C0310f[]) this.f3713c.f4192c)[this.f3714e[i]];
            if (c0310f != null) {
                c0310f.b(this.f3712b);
            }
            i = this.f3715f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3717j = false;
        this.f3711a = 0;
    }

    public final float c(C0310f c0310f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3711a; i2++) {
            if (this.f3714e[i] == c0310f.f3740b) {
                return this.f3716g[i];
            }
            i = this.f3715f[i];
        }
        return RecyclerView.f1937A0;
    }

    public final int d() {
        return this.f3711a;
    }

    public final C0310f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3711a; i3++) {
            if (i3 == i) {
                return ((C0310f[]) this.f3713c.f4192c)[this.f3714e[i2]];
            }
            i2 = this.f3715f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3711a; i3++) {
            if (i3 == i) {
                return this.f3716g[i2];
            }
            i2 = this.f3715f[i2];
        }
        return RecyclerView.f1937A0;
    }

    public final void g(C0310f c0310f, float f2) {
        if (f2 == RecyclerView.f1937A0) {
            h(c0310f, true);
            return;
        }
        int i = this.h;
        C0306b c0306b = this.f3712b;
        if (i == -1) {
            this.h = 0;
            this.f3716g[0] = f2;
            this.f3714e[0] = c0310f.f3740b;
            this.f3715f[0] = -1;
            c0310f.f3746k++;
            c0310f.a(c0306b);
            this.f3711a++;
            if (this.f3717j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3714e;
            if (i2 >= iArr.length) {
                this.f3717j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3711a; i4++) {
            int i5 = this.f3714e[i];
            int i6 = c0310f.f3740b;
            if (i5 == i6) {
                this.f3716g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3715f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3717j) {
            int[] iArr2 = this.f3714e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3714e;
        if (i7 >= iArr3.length && this.f3711a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3714e;
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
        int[] iArr5 = this.f3714e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3717j = false;
            this.i = i7 - 1;
            this.f3716g = Arrays.copyOf(this.f3716g, i10);
            this.f3714e = Arrays.copyOf(this.f3714e, this.d);
            this.f3715f = Arrays.copyOf(this.f3715f, this.d);
        }
        this.f3714e[i7] = c0310f.f3740b;
        this.f3716g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3715f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3715f[i7] = this.h;
            this.h = i7;
        }
        c0310f.f3746k++;
        c0310f.a(c0306b);
        int i11 = this.f3711a + 1;
        this.f3711a = i11;
        if (!this.f3717j) {
            this.i++;
        }
        int[] iArr7 = this.f3714e;
        if (i11 >= iArr7.length) {
            this.f3717j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3717j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0310f c0310f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return RecyclerView.f1937A0;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3711a) {
            if (this.f3714e[i] == c0310f.f3740b) {
                if (i == this.h) {
                    this.h = this.f3715f[i];
                } else {
                    int[] iArr = this.f3715f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0310f.b(this.f3712b);
                }
                c0310f.f3746k--;
                this.f3711a--;
                this.f3714e[i] = -1;
                if (this.f3717j) {
                    this.i = i;
                }
                return this.f3716g[i];
            }
            i2++;
            i3 = i;
            i = this.f3715f[i];
        }
        return RecyclerView.f1937A0;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3711a; i2++) {
            str = (AbstractC0001b.g(str, " -> ") + this.f3716g[i] + " : ") + ((C0310f[]) this.f3713c.f4192c)[this.f3714e[i]];
            i = this.f3715f[i];
        }
        return str;
    }
}
