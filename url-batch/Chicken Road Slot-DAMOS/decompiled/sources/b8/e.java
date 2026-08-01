package b8;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: i, reason: collision with root package name */
    public final transient g f1419i;

    public e(g gVar) {
        this.f1419i = gVar;
    }

    @Override // b8.g, b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1419i.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        g gVar = this.f1419i;
        i7.a.v(i3, gVar.size());
        return gVar.get((gVar.size() - 1) - i3);
    }

    @Override // b8.b
    public final boolean h() {
        return this.f1419i.h();
    }

    @Override // b8.g, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f1419i.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // b8.g, b8.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // b8.g, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f1419i.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // b8.g, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // b8.g
    public final g p() {
        return this.f1419i;
    }

    @Override // b8.g, java.util.List
    /* renamed from: q */
    public final g subList(int i3, int i10) {
        g gVar = this.f1419i;
        i7.a.D(i3, i10, gVar.size());
        return gVar.subList(gVar.size() - i10, gVar.size() - i3).p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1419i.size();
    }

    @Override // b8.g, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
