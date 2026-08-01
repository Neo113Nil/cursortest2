package O0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f684b;

    /* renamed from: c, reason: collision with root package name */
    public final int f685c;

    public c(d dVar, int i, int i2) {
        X0.f.e(dVar, "list");
        this.f683a = dVar;
        this.f684b = i;
        q1.d.j(i, i2, dVar.a());
        this.f685c = i2 - i;
    }

    @Override // O0.d
    public final int a() {
        return this.f685c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f685c;
        if (i >= 0 && i < i2) {
            return this.f683a.get(this.f684b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
