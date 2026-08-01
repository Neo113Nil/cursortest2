package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class m extends n implements RandomAccess {
    public final n f;
    public final int g;
    public final int h;

    public m(n nVar, int i, int i2) {
        this.f = nVar;
        this.g = i;
        bi.r(i, i2, nVar.a());
        this.h = i2 - i;
    }

    @Override // defpackage.n
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(r7.a(i, i2, "index: ", ", size: "));
        }
        return this.f.get(this.g + i);
    }

    @Override // defpackage.n, java.util.List
    public final List subList(int i, int i2) {
        bi.r(i, i2, this.h);
        int i3 = this.g;
        return new m(this.f, i + i3, i3 + i2);
    }
}
