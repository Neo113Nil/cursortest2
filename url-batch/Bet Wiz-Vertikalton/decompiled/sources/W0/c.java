package W0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f887c;

    public c(d dVar, int i, int i2) {
        e1.d.e(dVar, "list");
        this.f885a = dVar;
        this.f886b = i;
        x1.l.k(i, i2, dVar.a());
        this.f887c = i2 - i;
    }

    @Override // W0.d
    public final int a() {
        return this.f887c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f887c;
        if (i >= 0 && i < i2) {
            return this.f885a.get(this.f886b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
