package s;

import java.util.Arrays;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4131a;
    public float e;

    /* renamed from: l, reason: collision with root package name */
    public int f4139l;

    /* renamed from: b, reason: collision with root package name */
    public int f4132b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f4133c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4134d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4135f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4136g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4137h = new float[9];
    public C0377b[] i = new C0377b[16];
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4138k = 0;

    public C0381f(int i) {
        this.f4139l = i;
    }

    public final void a(C0377b c0377b) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i >= i2) {
                C0377b[] c0377bArr = this.i;
                if (i2 >= c0377bArr.length) {
                    this.i = (C0377b[]) Arrays.copyOf(c0377bArr, c0377bArr.length * 2);
                }
                C0377b[] c0377bArr2 = this.i;
                int i3 = this.j;
                c0377bArr2[i3] = c0377b;
                this.j = i3 + 1;
                return;
            }
            if (this.i[i] == c0377b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0377b c0377b) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0377b) {
                while (i2 < i - 1) {
                    C0377b[] c0377bArr = this.i;
                    int i3 = i2 + 1;
                    c0377bArr[i2] = c0377bArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f4139l = 5;
        this.f4134d = 0;
        this.f4132b = -1;
        this.f4133c = -1;
        this.e = 0.0f;
        this.f4135f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.f4138k = 0;
        this.f4131a = false;
        Arrays.fill(this.f4137h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4132b - ((C0381f) obj).f4132b;
    }

    public final void d(C0378c c0378c, float f2) {
        this.e = f2;
        this.f4135f = true;
        int i = this.j;
        this.f4133c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0378c, this, false);
        }
        this.j = 0;
    }

    public final void e(C0378c c0378c, C0377b c0377b) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0378c, c0377b, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f4132b;
    }
}
