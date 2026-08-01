package s;

import java.util.Arrays;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3595a;

    /* renamed from: e, reason: collision with root package name */
    public float f3598e;

    /* renamed from: l, reason: collision with root package name */
    public int f3603l;

    /* renamed from: b, reason: collision with root package name */
    public int f3596b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3597c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3599f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3600g = new float[9];
    public final float[] h = new float[9];
    public C0264b[] i = new C0264b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3601j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3602k = 0;

    public C0268f(int i) {
        this.f3603l = i;
    }

    public final void a(C0264b c0264b) {
        int i = 0;
        while (true) {
            int i2 = this.f3601j;
            if (i >= i2) {
                C0264b[] c0264bArr = this.i;
                if (i2 >= c0264bArr.length) {
                    this.i = (C0264b[]) Arrays.copyOf(c0264bArr, c0264bArr.length * 2);
                }
                C0264b[] c0264bArr2 = this.i;
                int i3 = this.f3601j;
                c0264bArr2[i3] = c0264b;
                this.f3601j = i3 + 1;
                return;
            }
            if (this.i[i] == c0264b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0264b c0264b) {
        int i = this.f3601j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0264b) {
                while (i2 < i - 1) {
                    C0264b[] c0264bArr = this.i;
                    int i3 = i2 + 1;
                    c0264bArr[i2] = c0264bArr[i3];
                    i2 = i3;
                }
                this.f3601j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3603l = 5;
        this.d = 0;
        this.f3596b = -1;
        this.f3597c = -1;
        this.f3598e = 0.0f;
        this.f3599f = false;
        int i = this.f3601j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3601j = 0;
        this.f3602k = 0;
        this.f3595a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3596b - ((C0268f) obj).f3596b;
    }

    public final void d(C0265c c0265c, float f2) {
        this.f3598e = f2;
        this.f3599f = true;
        int i = this.f3601j;
        this.f3597c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0265c, this, false);
        }
        this.f3601j = 0;
    }

    public final void e(C0265c c0265c, C0264b c0264b) {
        int i = this.f3601j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0265c, c0264b, false);
        }
        this.f3601j = 0;
    }

    public final String toString() {
        return "" + this.f3596b;
    }
}
