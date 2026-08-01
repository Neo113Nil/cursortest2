package l2;

import android.util.StateSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2556a;

    /* renamed from: b, reason: collision with root package name */
    public n f2557b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f2558c;
    public n[] d;

    /* renamed from: e, reason: collision with root package name */
    public z f2559e;

    /* renamed from: f, reason: collision with root package name */
    public z f2560f;

    /* renamed from: g, reason: collision with root package name */
    public z f2561g;

    /* renamed from: h, reason: collision with root package name */
    public z f2562h;

    public a0(n nVar) {
        b();
        a(StateSet.WILD_CARD, nVar);
    }

    public final void a(int[] iArr, n nVar) {
        int i = this.f2556a;
        if (i == 0 || iArr.length == 0) {
            this.f2557b = nVar;
        }
        int[][] iArr2 = this.f2558c;
        if (i >= iArr2.length) {
            int i4 = i + 10;
            int[][] iArr3 = new int[i4][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f2558c = iArr3;
            n[] nVarArr = new n[i4];
            System.arraycopy(this.d, 0, nVarArr, 0, i);
            this.d = nVarArr;
        }
        int[][] iArr4 = this.f2558c;
        int i5 = this.f2556a;
        iArr4[i5] = iArr;
        this.d[i5] = nVar;
        this.f2556a = i5 + 1;
    }

    public final void b() {
        this.f2557b = new n();
        this.f2558c = new int[10][];
        this.d = new n[10];
    }
}
