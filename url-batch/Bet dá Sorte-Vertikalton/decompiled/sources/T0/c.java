package T0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f835c;

    public c(d dVar, int i, int i2) {
        b1.d.e(dVar, "list");
        this.f833a = dVar;
        this.f834b = i;
        u1.d.i(i, i2, dVar.a());
        this.f835c = i2 - i;
    }

    @Override // T0.d
    public final int a() {
        return this.f835c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f835c;
        if (i >= 0 && i < i2) {
            return this.f833a.get(this.f834b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
