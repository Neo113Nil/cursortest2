package V0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final c f906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f908c;

    public b(c cVar, int i, int i2) {
        g1.d.e(cVar, "list");
        this.f906a = cVar;
        this.f907b = i;
        z1.d.r(i, i2, cVar.a());
        this.f908c = i2 - i;
    }

    @Override // V0.c
    public final int a() {
        return this.f908c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f908c;
        if (i >= 0 && i < i2) {
            return this.f906a.get(this.f907b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
