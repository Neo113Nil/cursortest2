package b8;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: i, reason: collision with root package name */
    public final transient int f1420i;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f1421r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f1422s;

    public f(g gVar, int i3, int i10) {
        this.f1422s = gVar;
        this.f1420i = i3;
        this.f1421r = i10;
    }

    @Override // b8.b
    public final Object[] e() {
        return this.f1422s.e();
    }

    @Override // b8.b
    public final int f() {
        return this.f1422s.g() + this.f1420i + this.f1421r;
    }

    @Override // b8.b
    public final int g() {
        return this.f1422s.g() + this.f1420i;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        i7.a.v(i3, this.f1421r);
        return this.f1422s.get(i3 + this.f1420i);
    }

    @Override // b8.b
    public final boolean h() {
        return true;
    }

    @Override // b8.g, b8.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // b8.g, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // b8.g, java.util.List
    /* renamed from: q */
    public final g subList(int i3, int i10) {
        i7.a.D(i3, i10, this.f1421r);
        int i11 = this.f1420i;
        return this.f1422s.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1421r;
    }

    @Override // b8.g, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
