package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hrv extends hde {
    final List a;

    public hrv(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.hde, defpackage.hdc
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.hdc, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return this.a.add(obj);
    }

    @Override // defpackage.hde, java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.addAll(i, hoq.j(collection));
    }

    @Override // defpackage.hde
    protected final List b() {
        return this.a;
    }

    @Override // defpackage.hdc, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hde, java.util.List
    public final ListIterator listIterator() {
        return new hrw(this.a.listIterator());
    }

    @Override // defpackage.hde, java.util.List
    public final Object set(int i, Object obj) {
        obj.getClass();
        return this.a.set(i, obj);
    }

    @Override // defpackage.hde, java.util.List
    public final List subList(int i, int i2) {
        return new hrv(this.a.subList(i, i2));
    }

    @Override // defpackage.hde, java.util.List
    public final void add(int i, Object obj) {
        obj.getClass();
        this.a.add(i, obj);
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.a.addAll(hoq.j(collection));
    }

    @Override // defpackage.hde, java.util.List
    public final ListIterator listIterator(int i) {
        return new hrw(this.a.listIterator(i));
    }
}
