package S0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final c f784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f786c;

    public b(c cVar, int i, int i2) {
        d1.d.e(cVar, "list");
        this.f784a = cVar;
        this.f785b = i;
        w1.d.n(i, i2, cVar.a());
        this.f786c = i2 - i;
    }

    @Override // S0.c
    public final int a() {
        return this.f786c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f786c;
        if (i >= 0 && i < i2) {
            return this.f784a.get(this.f785b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
