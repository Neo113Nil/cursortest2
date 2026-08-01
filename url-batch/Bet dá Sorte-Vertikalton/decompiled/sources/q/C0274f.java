package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3466a;

    /* renamed from: e, reason: collision with root package name */
    public float f3469e;

    /* renamed from: l, reason: collision with root package name */
    public int f3474l;

    /* renamed from: b, reason: collision with root package name */
    public int f3467b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3468c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3470f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3471g = new float[9];
    public final float[] h = new float[9];
    public C0270b[] i = new C0270b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3472j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3473k = 0;

    public C0274f(int i) {
        this.f3474l = i;
    }

    public final void a(C0270b c0270b) {
        int i = 0;
        while (true) {
            int i2 = this.f3472j;
            if (i >= i2) {
                C0270b[] c0270bArr = this.i;
                if (i2 >= c0270bArr.length) {
                    this.i = (C0270b[]) Arrays.copyOf(c0270bArr, c0270bArr.length * 2);
                }
                C0270b[] c0270bArr2 = this.i;
                int i3 = this.f3472j;
                c0270bArr2[i3] = c0270b;
                this.f3472j = i3 + 1;
                return;
            }
            if (this.i[i] == c0270b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0270b c0270b) {
        int i = this.f3472j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0270b) {
                while (i2 < i - 1) {
                    C0270b[] c0270bArr = this.i;
                    int i3 = i2 + 1;
                    c0270bArr[i2] = c0270bArr[i3];
                    i2 = i3;
                }
                this.f3472j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3474l = 5;
        this.d = 0;
        this.f3467b = -1;
        this.f3468c = -1;
        this.f3469e = 0.0f;
        this.f3470f = false;
        int i = this.f3472j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3472j = 0;
        this.f3473k = 0;
        this.f3466a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3467b - ((C0274f) obj).f3467b;
    }

    public final void d(C0271c c0271c, float f2) {
        this.f3469e = f2;
        this.f3470f = true;
        int i = this.f3472j;
        this.f3468c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0271c, this, false);
        }
        this.f3472j = 0;
    }

    public final void e(C0271c c0271c, C0270b c0270b) {
        int i = this.f3472j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0271c, c0270b, false);
        }
        this.f3472j = 0;
    }

    public final String toString() {
        return "" + this.f3467b;
    }
}
