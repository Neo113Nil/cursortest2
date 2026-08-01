package q;

import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f3082f;

    /* renamed from: j, reason: collision with root package name */
    public float f3084j;

    /* renamed from: q, reason: collision with root package name */
    public int f3091q;
    public int g = -1;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3083i = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3085k = false;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f3086l = new float[9];

    /* renamed from: m, reason: collision with root package name */
    public final float[] f3087m = new float[9];

    /* renamed from: n, reason: collision with root package name */
    public b[] f3088n = new b[16];

    /* renamed from: o, reason: collision with root package name */
    public int f3089o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3090p = 0;

    public f(int i4) {
        this.f3091q = i4;
    }

    public final void a(b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f3089o;
            if (i4 >= i5) {
                b[] bVarArr = this.f3088n;
                if (i5 >= bVarArr.length) {
                    this.f3088n = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3088n;
                int i6 = this.f3089o;
                bVarArr2[i6] = bVar;
                this.f3089o = i6 + 1;
                return;
            }
            if (this.f3088n[i4] == bVar) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void b(b bVar) {
        int i4 = this.f3089o;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f3088n[i5] == bVar) {
                while (i5 < i4 - 1) {
                    b[] bVarArr = this.f3088n;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f3089o--;
                return;
            }
            i5++;
        }
    }

    public final void c() {
        this.f3091q = 5;
        this.f3083i = 0;
        this.g = -1;
        this.h = -1;
        this.f3084j = 0.0f;
        this.f3085k = false;
        int i4 = this.f3089o;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3088n[i5] = null;
        }
        this.f3089o = 0;
        this.f3090p = 0;
        this.f3082f = false;
        Arrays.fill(this.f3087m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g - ((f) obj).g;
    }

    public final void d(c cVar, float f4) {
        this.f3084j = f4;
        this.f3085k = true;
        int i4 = this.f3089o;
        this.h = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3088n[i5].h(cVar, this, false);
        }
        this.f3089o = 0;
    }

    public final void e(c cVar, b bVar) {
        int i4 = this.f3089o;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3088n[i5].i(cVar, bVar, false);
        }
        this.f3089o = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
