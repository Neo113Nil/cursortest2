package d6;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final e f2314d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2315e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2316f;

    public d(e eVar, int i, int i8) {
        this.f2314d = eVar;
        this.f2315e = i;
        s6.a.j(i, i8, eVar.a());
        this.f2316f = i8 - i;
    }

    @Override // d6.a
    public final int a() {
        return this.f2316f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i8 = this.f2316f;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", i8));
        }
        return this.f2314d.get(this.f2315e + i);
    }

    @Override // d6.e, java.util.List
    public final List subList(int i, int i8) {
        s6.a.j(i, i8, this.f2316f);
        int i9 = this.f2315e;
        return new d(this.f2314d, i + i9, i9 + i8);
    }
}
