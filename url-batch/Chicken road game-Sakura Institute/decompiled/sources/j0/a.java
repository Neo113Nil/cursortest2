package j0;

import e6.d;
import java.util.List;
import k0.c;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: f, reason: collision with root package name */
    public final c f4969f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4970g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4971h;

    public a(c cVar, int i7, int i8) {
        this.f4969f = cVar;
        this.f4970g = i7;
        a.a.o(i7, i8, cVar.a());
        this.f4971h = i8 - i7;
    }

    @Override // e6.a
    public final int a() {
        return this.f4971h;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.a.l(i7, this.f4971h);
        return this.f4969f.get(this.f4970g + i7);
    }

    @Override // e6.d, java.util.List
    public final List subList(int i7, int i8) {
        a.a.o(i7, i8, this.f4971h);
        int i9 = this.f4970g;
        return new a(this.f4969f, i7 + i9, i9 + i8);
    }
}
