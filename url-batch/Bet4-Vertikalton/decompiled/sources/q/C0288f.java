package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3489a;

    /* renamed from: e, reason: collision with root package name */
    public float f3492e;

    /* renamed from: l, reason: collision with root package name */
    public int f3497l;

    /* renamed from: b, reason: collision with root package name */
    public int f3490b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3491c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3493f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3494g = new float[9];
    public final float[] h = new float[9];
    public C0284b[] i = new C0284b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3495j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3496k = 0;

    public C0288f(int i) {
        this.f3497l = i;
    }

    public final void a(C0284b c0284b) {
        int i = 0;
        while (true) {
            int i2 = this.f3495j;
            if (i >= i2) {
                C0284b[] c0284bArr = this.i;
                if (i2 >= c0284bArr.length) {
                    this.i = (C0284b[]) Arrays.copyOf(c0284bArr, c0284bArr.length * 2);
                }
                C0284b[] c0284bArr2 = this.i;
                int i3 = this.f3495j;
                c0284bArr2[i3] = c0284b;
                this.f3495j = i3 + 1;
                return;
            }
            if (this.i[i] == c0284b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0284b c0284b) {
        int i = this.f3495j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0284b) {
                while (i2 < i - 1) {
                    C0284b[] c0284bArr = this.i;
                    int i3 = i2 + 1;
                    c0284bArr[i2] = c0284bArr[i3];
                    i2 = i3;
                }
                this.f3495j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3497l = 5;
        this.d = 0;
        this.f3490b = -1;
        this.f3491c = -1;
        this.f3492e = RecyclerView.f1530C0;
        this.f3493f = false;
        int i = this.f3495j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3495j = 0;
        this.f3496k = 0;
        this.f3489a = false;
        Arrays.fill(this.h, RecyclerView.f1530C0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3490b - ((C0288f) obj).f3490b;
    }

    public final void d(C0285c c0285c, float f2) {
        this.f3492e = f2;
        this.f3493f = true;
        int i = this.f3495j;
        this.f3491c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0285c, this, false);
        }
        this.f3495j = 0;
    }

    public final void e(C0285c c0285c, C0284b c0284b) {
        int i = this.f3495j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0285c, c0284b, false);
        }
        this.f3495j = 0;
    }

    public final String toString() {
        return "" + this.f3490b;
    }
}
