package d2;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6071d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6072e;

    public C0547d(i iVar, Comparator comparator, boolean z4) {
        this.f6072e = z4;
        while (!iVar.isEmpty()) {
            this.f6071d.push((k) iVar);
            iVar = z4 ? iVar.f() : iVar.i();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6071d.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f6071d;
        try {
            k kVar = (k) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kVar.f6078a, kVar.f6079b);
            if (this.f6072e) {
                for (i iVar = kVar.f6080c; !iVar.isEmpty(); iVar = iVar.f()) {
                    arrayDeque.push((k) iVar);
                }
            } else {
                for (i iVar2 = kVar.f6081d; !iVar2.isEmpty(); iVar2 = iVar2.i()) {
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
