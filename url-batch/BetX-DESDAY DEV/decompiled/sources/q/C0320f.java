package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3924a;

    /* renamed from: e, reason: collision with root package name */
    public float f3928e;

    /* renamed from: l, reason: collision with root package name */
    public int f3933l;

    /* renamed from: b, reason: collision with root package name */
    public int f3925b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3926c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f3927d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3929f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3930g = new float[9];
    public final float[] h = new float[9];
    public C0316b[] i = new C0316b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3931j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3932k = 0;

    public C0320f(int i) {
        this.f3933l = i;
    }

    public final void a(C0316b c0316b) {
        int i = 0;
        while (true) {
            int i2 = this.f3931j;
            if (i >= i2) {
                C0316b[] c0316bArr = this.i;
                if (i2 >= c0316bArr.length) {
                    this.i = (C0316b[]) Arrays.copyOf(c0316bArr, c0316bArr.length * 2);
                }
                C0316b[] c0316bArr2 = this.i;
                int i3 = this.f3931j;
                c0316bArr2[i3] = c0316b;
                this.f3931j = i3 + 1;
                return;
            }
            if (this.i[i] == c0316b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0316b c0316b) {
        int i = this.f3931j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0316b) {
                while (i2 < i - 1) {
                    C0316b[] c0316bArr = this.i;
                    int i3 = i2 + 1;
                    c0316bArr[i2] = c0316bArr[i3];
                    i2 = i3;
                }
                this.f3931j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3933l = 5;
        this.f3927d = 0;
        this.f3925b = -1;
        this.f3926c = -1;
        this.f3928e = 0.0f;
        this.f3929f = false;
        int i = this.f3931j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3931j = 0;
        this.f3932k = 0;
        this.f3924a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3925b - ((C0320f) obj).f3925b;
    }

    public final void d(C0317c c0317c, float f2) {
        this.f3928e = f2;
        this.f3929f = true;
        int i = this.f3931j;
        this.f3926c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0317c, this, false);
        }
        this.f3931j = 0;
    }

    public final void e(C0317c c0317c, C0316b c0316b) {
        int i = this.f3931j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0317c, c0316b, false);
        }
        this.f3931j = 0;
    }

    public final String toString() {
        return "" + this.f3925b;
    }
}
