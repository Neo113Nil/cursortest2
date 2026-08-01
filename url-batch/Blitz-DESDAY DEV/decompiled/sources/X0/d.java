package X0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final e f981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f982b;

    /* renamed from: c, reason: collision with root package name */
    public final int f983c;

    public d(e eVar, int i, int i2) {
        g1.d.e(eVar, "list");
        this.f981a = eVar;
        this.f982b = i;
        z1.l.r(i, i2, eVar.a());
        this.f983c = i2 - i;
    }

    @Override // X0.e
    public final int a() {
        return this.f983c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f983c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a.d(i, i2, "index: ", ", size: "));
        }
        return this.f981a.get(this.f982b + i);
    }
}
