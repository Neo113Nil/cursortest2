package f3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements Iterator, g3.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f1551f;

    /* renamed from: g, reason: collision with root package name */
    public int f1552g;

    public a(Object[] objArr) {
        this.f1551f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1552g < this.f1551f.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f1551f;
            int i = this.f1552g;
            this.f1552g = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f1552g--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
