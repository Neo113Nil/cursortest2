package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3501a;

    /* renamed from: e, reason: collision with root package name */
    public float f3504e;

    /* renamed from: l, reason: collision with root package name */
    public int f3509l;

    /* renamed from: b, reason: collision with root package name */
    public int f3502b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3503c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3505f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3506g = new float[9];
    public final float[] h = new float[9];
    public C0282b[] i = new C0282b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3507j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3508k = 0;

    public C0286f(int i) {
        this.f3509l = i;
    }

    public final void a(C0282b c0282b) {
        int i = 0;
        while (true) {
            int i2 = this.f3507j;
            if (i >= i2) {
                C0282b[] c0282bArr = this.i;
                if (i2 >= c0282bArr.length) {
                    this.i = (C0282b[]) Arrays.copyOf(c0282bArr, c0282bArr.length * 2);
                }
                C0282b[] c0282bArr2 = this.i;
                int i3 = this.f3507j;
                c0282bArr2[i3] = c0282b;
                this.f3507j = i3 + 1;
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
        int i = this.f3507j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0282b) {
                while (i2 < i - 1) {
                    C0282b[] c0282bArr = this.i;
                    int i3 = i2 + 1;
                    c0282bArr[i2] = c0282bArr[i3];
                    i2 = i3;
                }
                this.f3507j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3509l = 5;
        this.d = 0;
        this.f3502b = -1;
        this.f3503c = -1;
        this.f3504e = 0.0f;
        this.f3505f = false;
        int i = this.f3507j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3507j = 0;
        this.f3508k = 0;
        this.f3501a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3502b - ((C0286f) obj).f3502b;
    }

    public final void d(C0283c c0283c, float f2) {
        this.f3504e = f2;
        this.f3505f = true;
        int i = this.f3507j;
        this.f3503c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0283c, this, false);
        }
        this.f3507j = 0;
    }

    public final void e(C0283c c0283c, C0282b c0282b) {
        int i = this.f3507j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0283c, c0282b, false);
        }
        this.f3507j = 0;
    }

    public final String toString() {
        return "" + this.f3502b;
    }
}
