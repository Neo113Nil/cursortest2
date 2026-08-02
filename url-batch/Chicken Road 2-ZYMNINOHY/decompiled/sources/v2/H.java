package v2;

import a.AbstractC0124a;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f15568c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I f15570e;

    public H(I i4, int i5, int i6) {
        this.f15570e = i4;
        this.f15568c = i5;
        this.f15569d = i6;
    }

    @Override // v2.D
    public final Object[] d() {
        return this.f15570e.d();
    }

    @Override // v2.D
    public final int e() {
        return this.f15570e.f() + this.f15568c + this.f15569d;
    }

    @Override // v2.D
    public final int f() {
        return this.f15570e.f() + this.f15568c;
    }

    @Override // v2.D
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0124a.m(i4, this.f15569d);
        return this.f15570e.get(i4 + this.f15568c);
    }

    @Override // v2.I, v2.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // v2.I, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // v2.I, java.util.List
    /* renamed from: r */
    public final I subList(int i4, int i5) {
        AbstractC0124a.r(i4, i5, this.f15569d);
        int i6 = this.f15568c;
        return this.f15570e.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15569d;
    }

    @Override // v2.I, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
        return listIterator(i4);
    }
}
