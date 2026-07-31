package w2;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f7865d;

    /* renamed from: h, reason: collision with root package name */
    public float f7869h;

    /* renamed from: o, reason: collision with root package name */
    public int f7875o;

    /* renamed from: e, reason: collision with root package name */
    public int f7866e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f7867f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f7868g = 0;
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f7870j = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public final float[] f7871k = new float[9];

    /* renamed from: l, reason: collision with root package name */
    public b[] f7872l = new b[16];

    /* renamed from: m, reason: collision with root package name */
    public int f7873m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f7874n = 0;

    public f(int i) {
        this.f7875o = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i8 = this.f7873m;
            if (i >= i8) {
                b[] bVarArr = this.f7872l;
                if (i8 >= bVarArr.length) {
                    this.f7872l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f7872l;
                int i9 = this.f7873m;
                bVarArr2[i9] = bVar;
                this.f7873m = i9 + 1;
                return;
            }
            if (this.f7872l[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f7873m;
        int i8 = 0;
        while (i8 < i) {
            if (this.f7872l[i8] == bVar) {
                while (i8 < i - 1) {
                    b[] bVarArr = this.f7872l;
                    int i9 = i8 + 1;
                    bVarArr[i8] = bVarArr[i9];
                    i8 = i9;
                }
                this.f7873m--;
                return;
            }
            i8++;
        }
    }

    public final void c() {
        this.f7875o = 5;
        this.f7868g = 0;
        this.f7866e = -1;
        this.f7867f = -1;
        this.f7869h = 0.0f;
        this.i = false;
        int i = this.f7873m;
        for (int i8 = 0; i8 < i; i8++) {
            this.f7872l[i8] = null;
        }
        this.f7873m = 0;
        this.f7874n = 0;
        this.f7865d = false;
        Arrays.fill(this.f7871k, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7866e - ((f) obj).f7866e;
    }

    public final void d(c cVar, float f6) {
        this.f7869h = f6;
        this.i = true;
        int i = this.f7873m;
        this.f7867f = -1;
        for (int i8 = 0; i8 < i; i8++) {
            this.f7872l[i8].h(cVar, this, false);
        }
        this.f7873m = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f7873m;
        for (int i8 = 0; i8 < i; i8++) {
            this.f7872l[i8].i(cVar, bVar, false);
        }
        this.f7873m = 0;
    }

    public final String toString() {
        return "" + this.f7866e;
    }
}
