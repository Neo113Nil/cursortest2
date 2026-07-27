package z2;

import M2.C0249a;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import z2.AbstractC1420d;

/* renamed from: z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421e extends C0249a implements ListIterator {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC1420d f11940j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421e(AbstractC1420d abstractC1420d, int i2) {
        super(6, abstractC1420d);
        this.f11940j = abstractC1420d;
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int e4 = abstractC1420d.e();
        aVar.getClass();
        AbstractC1420d.a.c(i2, e4);
        this.f3585e = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3585e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3585e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3585e - 1;
        this.f3585e = i2;
        return this.f11940j.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3585e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
