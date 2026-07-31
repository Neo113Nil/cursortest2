package w5;

import android.util.StateSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8059a;

    /* renamed from: b, reason: collision with root package name */
    public n f8060b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f8061c;

    /* renamed from: d, reason: collision with root package name */
    public n[] f8062d;

    /* renamed from: e, reason: collision with root package name */
    public z f8063e;

    /* renamed from: f, reason: collision with root package name */
    public z f8064f;

    /* renamed from: g, reason: collision with root package name */
    public z f8065g;

    /* renamed from: h, reason: collision with root package name */
    public z f8066h;

    public a0(n nVar) {
        b();
        a(StateSet.WILD_CARD, nVar);
    }

    public final void a(int[] iArr, n nVar) {
        int i = this.f8059a;
        if (i == 0 || iArr.length == 0) {
            this.f8060b = nVar;
        }
        int[][] iArr2 = this.f8061c;
        if (i >= iArr2.length) {
            int i8 = i + 10;
            int[][] iArr3 = new int[i8][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f8061c = iArr3;
            n[] nVarArr = new n[i8];
            System.arraycopy(this.f8062d, 0, nVarArr, 0, i);
            this.f8062d = nVarArr;
        }
        int[][] iArr4 = this.f8061c;
        int i9 = this.f8059a;
        iArr4[i9] = iArr;
        this.f8062d[i9] = nVar;
        this.f8059a = i9 + 1;
    }

    public final void b() {
        this.f8060b = new n();
        this.f8061c = new int[10][];
        this.f8062d = new n[10];
    }
}
