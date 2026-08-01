package q0;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements c1.d, Iterable, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final h f7757d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7758e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7759i;

    public i(h hVar, int i3, int i10) {
        this.f7757d = hVar;
        this.f7758e = i3;
        this.f7759i = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f7758e == this.f7758e && iVar.f7759i == this.f7759i && iVar.f7757d.equals(this.f7757d);
    }

    public final int hashCode() {
        return (this.f7757d.hashCode() * 31) + this.f7758e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h hVar = this.f7757d;
        if (hVar.f7753v != this.f7759i) {
            j.f();
        }
        int i3 = this.f7758e;
        hVar.h(i3);
        return new d(hVar, i3 + 1, hVar.f7746d[(i3 * 5) + 3] + i3);
    }
}
