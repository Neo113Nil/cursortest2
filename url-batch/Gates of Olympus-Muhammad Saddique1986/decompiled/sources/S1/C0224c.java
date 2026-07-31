package S1;

import java.util.RandomAccess;

/* renamed from: S1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224c extends AbstractC0225d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0225d f4308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4309e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4310f;

    public C0224c(AbstractC0225d abstractC0225d, int i3, int i4) {
        f2.j.f(abstractC0225d, "list");
        this.f4308d = abstractC0225d;
        this.f4309e = i3;
        l0.c.n(i3, i4, abstractC0225d.b());
        this.f4310f = i4 - i3;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f4310f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        int i4 = this.f4310f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i4, "index: ", ", size: "));
        }
        return this.f4308d.get(this.f4309e + i3);
    }
}
