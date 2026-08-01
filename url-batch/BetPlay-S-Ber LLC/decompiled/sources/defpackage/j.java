package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j extends k implements RandomAccess {
    public final k f;
    public final int g;
    public final int h;

    public j(k kVar, int i, int i2) {
        this.f = kVar;
        this.g = i;
        vw.q(i, i2, kVar.a());
        this.h = i2 - i;
    }

    @Override // defpackage.k
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(o30.d(i, i2, "index: ", ", size: "));
        }
        return this.f.get(this.g + i);
    }

    @Override // defpackage.k, java.util.List
    public final List subList(int i, int i2) {
        vw.q(i, i2, this.h);
        int i3 = this.g;
        return new j(this.f, i + i3, i3 + i2);
    }
}
