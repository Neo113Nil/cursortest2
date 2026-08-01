package q0;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements c1.d, Iterable, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final h f7787d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7788e;

    /* renamed from: i, reason: collision with root package name */
    public final f f7789i;

    public m(h hVar, int i3, c cVar, f fVar) {
        this.f7787d = hVar;
        this.f7788e = i3;
        this.f7789i = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f7788e == this.f7788e && mVar.f7787d.equals(this.f7787d) && mVar.f7789i.equals(this.f7789i);
    }

    public final int hashCode() {
        return this.f7789i.hashCode() + ((this.f7787d.hashCode() + (this.f7788e * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this.f7787d, this.f7788e, null, this.f7789i);
    }
}
