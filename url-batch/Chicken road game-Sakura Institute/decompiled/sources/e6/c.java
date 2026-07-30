package e6;

import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final d f2810f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2811g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2812h;

    public c(d dVar, int i7, int i8) {
        this.f2810f = dVar;
        this.f2811g = i7;
        j1.c.O(i7, i8, dVar.a());
        this.f2812h = i8 - i7;
    }

    @Override // e6.a
    public final int a() {
        return this.f2812h;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f2812h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return this.f2810f.get(this.f2811g + i7);
    }
}
