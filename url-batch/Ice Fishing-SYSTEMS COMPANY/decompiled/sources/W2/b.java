package W2;

import q2.g1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3423a;

    /* renamed from: b, reason: collision with root package name */
    public int f3424b;

    /* renamed from: c, reason: collision with root package name */
    public int f3425c;

    public b() {
        this.f3423a = 0;
        this.f3424b = 0;
        this.f3425c = 0;
    }

    public static b a(g1 g1Var) {
        return g1Var.f40059w ? new b(3, 0, 0) : g1Var.f40048B ? new b(2, 0, 0) : g1Var.f40047A ? new b(0, 0, 0) : new b(1, g1Var.f40061y, g1Var.f40058v);
    }

    public boolean b() {
        return this.f3423a == 3;
    }

    public b(int i, int i4, int i9) {
        this.f3423a = i;
        this.f3425c = i4;
        this.f3424b = i9;
    }

    public /* synthetic */ b(int i, int i4, int i9, boolean z8) {
        this.f3423a = i;
        this.f3424b = i4;
        this.f3425c = i9;
    }
}
