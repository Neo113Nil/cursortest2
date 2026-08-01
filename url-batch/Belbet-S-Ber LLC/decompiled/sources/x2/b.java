package x2;

import java.util.RandomAccess;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final c f3879f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3880g;
    public final int h;

    public b(c cVar, int i, int i4) {
        this.f3879f = cVar;
        this.f3880g = i;
        s.a.i(i, i4, cVar.a());
        this.h = i4 - i;
    }

    @Override // x2.c
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i4 = this.h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
        }
        return this.f3879f.get(this.f3880g + i);
    }
}
