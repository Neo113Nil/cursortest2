package v2;

import java.util.List;
import java.util.ListIterator;

/* renamed from: v2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464k extends C1456c implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1465l f15650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464k(C1465l c1465l) {
        super(c1465l);
        this.f15650e = c1465l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C1465l c1465l = this.f15650e;
        boolean isEmpty = c1465l.isEmpty();
        b().add(obj);
        c1465l.f15658f.f15595e++;
        if (isEmpty) {
            c1465l.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f15611b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464k(C1465l c1465l, int i4) {
        super(c1465l, ((List) c1465l.f15654b).listIterator(i4));
        this.f15650e = c1465l;
    }
}
