package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3739a;

    /* renamed from: e, reason: collision with root package name */
    public float f3742e;

    /* renamed from: l, reason: collision with root package name */
    public int f3747l;

    /* renamed from: b, reason: collision with root package name */
    public int f3740b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3741c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3743f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3744g = new float[9];
    public final float[] h = new float[9];
    public C0306b[] i = new C0306b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3745j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3746k = 0;

    public C0310f(int i) {
        this.f3747l = i;
    }

    public final void a(C0306b c0306b) {
        int i = 0;
        while (true) {
            int i2 = this.f3745j;
            if (i >= i2) {
                C0306b[] c0306bArr = this.i;
                if (i2 >= c0306bArr.length) {
                    this.i = (C0306b[]) Arrays.copyOf(c0306bArr, c0306bArr.length * 2);
                }
                C0306b[] c0306bArr2 = this.i;
                int i3 = this.f3745j;
                c0306bArr2[i3] = c0306b;
                this.f3745j = i3 + 1;
                return;
            }
            if (this.i[i] == c0306b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0306b c0306b) {
        int i = this.f3745j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0306b) {
                while (i2 < i - 1) {
                    C0306b[] c0306bArr = this.i;
                    int i3 = i2 + 1;
                    c0306bArr[i2] = c0306bArr[i3];
                    i2 = i3;
                }
                this.f3745j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3747l = 5;
        this.d = 0;
        this.f3740b = -1;
        this.f3741c = -1;
        this.f3742e = RecyclerView.f1937A0;
        this.f3743f = false;
        int i = this.f3745j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3745j = 0;
        this.f3746k = 0;
        this.f3739a = false;
        Arrays.fill(this.h, RecyclerView.f1937A0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3740b - ((C0310f) obj).f3740b;
    }

    public final void d(C0307c c0307c, float f2) {
        this.f3742e = f2;
        this.f3743f = true;
        int i = this.f3745j;
        this.f3741c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0307c, this, false);
        }
        this.f3745j = 0;
    }

    public final void e(C0307c c0307c, C0306b c0306b) {
        int i = this.f3745j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0307c, c0306b, false);
        }
        this.f3745j = 0;
    }

    public final String toString() {
        return "" + this.f3740b;
    }
}
