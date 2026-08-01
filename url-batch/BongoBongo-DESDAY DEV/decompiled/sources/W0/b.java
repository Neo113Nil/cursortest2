package W0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final c f948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f950c;

    public b(c cVar, int i, int i2) {
        h1.d.e(cVar, "list");
        this.f948a = cVar;
        this.f949b = i;
        A1.d.l(i, i2, cVar.a());
        this.f950c = i2 - i;
    }

    @Override // W0.c
    public final int a() {
        return this.f950c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f950c;
        if (i >= 0 && i < i2) {
            return this.f948a.get(this.f949b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
