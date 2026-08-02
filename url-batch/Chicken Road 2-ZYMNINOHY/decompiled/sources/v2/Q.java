package v2;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class Q extends o0 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f15588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(AbstractList abstractList, ListIterator listIterator, int i4) {
        super(listIterator);
        this.f15587b = i4;
        this.f15588c = abstractList;
    }

    @Override // v2.o0
    public final Object a(Object obj) {
        switch (this.f15587b) {
            case 0:
                return ((S) this.f15588c).f15590b.apply(obj);
            default:
                return ((T) this.f15588c).f15592b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f15665a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f15665a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f15665a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f15665a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
