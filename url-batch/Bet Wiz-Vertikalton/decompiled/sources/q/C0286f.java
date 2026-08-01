package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3479a;

    /* renamed from: e, reason: collision with root package name */
    public float f3482e;

    /* renamed from: l, reason: collision with root package name */
    public int f3487l;

    /* renamed from: b, reason: collision with root package name */
    public int f3480b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3481c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3483f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3484g = new float[9];
    public final float[] h = new float[9];
    public C0282b[] i = new C0282b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3485j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3486k = 0;

    public C0286f(int i) {
        this.f3487l = i;
    }

    public final void a(C0282b c0282b) {
        int i = 0;
        while (true) {
            int i2 = this.f3485j;
            if (i >= i2) {
                C0282b[] c0282bArr = this.i;
                if (i2 >= c0282bArr.length) {
                    this.i = (C0282b[]) Arrays.copyOf(c0282bArr, c0282bArr.length * 2);
                }
                C0282b[] c0282bArr2 = this.i;
                int i3 = this.f3485j;
                c0282bArr2[i3] = c0282b;
                this.f3485j = i3 + 1;
                return;
            }
            if (this.i[i] == c0282b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0282b c0282b) {
        int i = this.f3485j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0282b) {
                while (i2 < i - 1) {
                    C0282b[] c0282bArr = this.i;
                    int i3 = i2 + 1;
                    c0282bArr[i2] = c0282bArr[i3];
                    i2 = i3;
                }
                this.f3485j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3487l = 5;
        this.d = 0;
        this.f3480b = -1;
        this.f3481c = -1;
        this.f3482e = 0.0f;
        this.f3483f = false;
        int i = this.f3485j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3485j = 0;
        this.f3486k = 0;
        this.f3479a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3480b - ((C0286f) obj).f3480b;
    }

    public final void d(C0283c c0283c, float f2) {
        this.f3482e = f2;
        this.f3483f = true;
        int i = this.f3485j;
        this.f3481c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0283c, this, false);
        }
        this.f3485j = 0;
    }

    public final void e(C0283c c0283c, C0282b c0282b) {
        int i = this.f3485j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0283c, c0282b, false);
        }
        this.f3485j = 0;
    }

    public final String toString() {
        return "" + this.f3480b;
    }
}
