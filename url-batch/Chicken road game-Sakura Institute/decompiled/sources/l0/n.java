package l0;

import f1.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: i, reason: collision with root package name */
    public final g0 f5770i;

    public n(g0 g0Var) {
        this.f5770i = g0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f5768h;
        this.f5768h = i7 + 2;
        Object[] objArr = this.f5766f;
        return new b(this.f5770i, objArr[i7], objArr[i7 + 1]);
    }
}
