package i5;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f4937f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4938g;

    public d(i iVar, Comparator comparator, boolean z8) {
        this.f4938g = z8;
        while (!iVar.isEmpty()) {
            this.f4937f.push((k) iVar);
            iVar = z8 ? iVar.m() : iVar.d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4937f.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f4937f;
        try {
            k kVar = (k) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kVar.f4944a, kVar.f4945b);
            if (this.f4938g) {
                for (i iVar = kVar.f4946c; !iVar.isEmpty(); iVar = iVar.m()) {
                    arrayDeque.push((k) iVar);
                }
            } else {
                for (i iVar2 = kVar.f4947d; !iVar2.isEmpty(); iVar2 = iVar2.d()) {
                    arrayDeque.push((k) iVar2);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
