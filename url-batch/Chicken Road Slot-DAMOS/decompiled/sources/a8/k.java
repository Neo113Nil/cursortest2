package a8;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f355e;

    public k(l lVar, String str) {
        this.f355e = lVar;
        this.f354d = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l lVar = this.f355e;
        d9.c cVar = (d9.c) lVar.f359d;
        cVar.getClass();
        return new j(cVar, lVar, this.f354d);
    }

    public final String toString() {
        f fVar = new f(", ", 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        fVar.a(sb2, iterator());
        sb2.append(']');
        return sb2.toString();
    }
}
