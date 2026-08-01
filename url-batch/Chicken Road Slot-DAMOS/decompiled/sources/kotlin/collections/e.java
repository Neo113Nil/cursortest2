package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends f implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final f f5560e;

    /* renamed from: i, reason: collision with root package name */
    public final int f5561i;

    /* renamed from: r, reason: collision with root package name */
    public final int f5562r;

    public e(f fVar, int i3, int i10) {
        this.f5560e = fVar;
        this.f5561i = i3;
        c cVar = f.f5563d;
        int b10 = fVar.b();
        cVar.getClass();
        c.c(i3, i10, b10);
        this.f5562r = i10 - i3;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f5562r;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        f.f5563d.getClass();
        c.a(i3, this.f5562r);
        return this.f5560e.get(this.f5561i + i3);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i3, int i10) {
        f.f5563d.getClass();
        c.c(i3, i10, this.f5562r);
        int i11 = this.f5561i;
        return new e(this.f5560e, i3 + i11, i11 + i10);
    }
}
