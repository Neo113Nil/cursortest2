package O0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f684c;

    public c(d dVar, int i, int i2) {
        X0.f.e(dVar, "list");
        this.f682a = dVar;
        this.f683b = i;
        q1.d.j(i, i2, dVar.a());
        this.f684c = i2 - i;
    }

    @Override // O0.d
    public final int a() {
        return this.f684c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f684c;
        if (i >= 0 && i < i2) {
            return this.f682a.get(this.f683b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
