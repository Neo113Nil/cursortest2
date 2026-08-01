package Q0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f662c;

    public c(d dVar, int i, int i2) {
        X0.d.e(dVar, "list");
        this.f660a = dVar;
        this.f661b = i;
        q1.d.k(i, i2, dVar.a());
        this.f662c = i2 - i;
    }

    @Override // Q0.d
    public final int a() {
        return this.f662c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f662c;
        if (i >= 0 && i < i2) {
            return this.f660a.get(this.f661b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
