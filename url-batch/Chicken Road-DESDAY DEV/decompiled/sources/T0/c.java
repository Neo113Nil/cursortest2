package T0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f820c;

    public c(d dVar, int i, int i2) {
        b1.d.e(dVar, "list");
        this.f818a = dVar;
        this.f819b = i;
        u1.d.l(i, i2, dVar.a());
        this.f820c = i2 - i;
    }

    @Override // T0.d
    public final int a() {
        return this.f820c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f820c;
        if (i >= 0 && i < i2) {
            return this.f818a.get(this.f819b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
