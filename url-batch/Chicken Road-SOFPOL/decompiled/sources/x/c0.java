package x;

import w1.n1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 extends y0.l implements n1 {

    /* renamed from: r, reason: collision with root package name */
    public float f8204r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8205s;

    @Override // w1.n1
    public final Object W(Object obj) {
        j0 j0Var = obj instanceof j0 ? (j0) obj : null;
        if (j0Var == null) {
            j0Var = new j0();
        }
        j0Var.f8229a = this.f8204r;
        j0Var.f8230b = this.f8205s;
        return j0Var;
    }
}
