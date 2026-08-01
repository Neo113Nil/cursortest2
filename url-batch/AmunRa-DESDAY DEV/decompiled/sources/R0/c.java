package R0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f703c;

    public c(d dVar, int i, int i2) {
        Z0.d.e(dVar, "list");
        this.f701a = dVar;
        this.f702b = i;
        s1.l.k(i, i2, dVar.a());
        this.f703c = i2 - i;
    }

    @Override // R0.d
    public final int a() {
        return this.f703c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f703c;
        if (i >= 0 && i < i2) {
            return this.f701a.get(this.f702b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
