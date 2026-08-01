package Q0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f661c;

    public c(d dVar, int i, int i2) {
        X0.d.e(dVar, "list");
        this.f659a = dVar;
        this.f660b = i;
        q1.d.k(i, i2, dVar.a());
        this.f661c = i2 - i;
    }

    @Override // Q0.d
    public final int a() {
        return this.f661c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f661c;
        if (i >= 0 && i < i2) {
            return this.f659a.get(this.f660b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
