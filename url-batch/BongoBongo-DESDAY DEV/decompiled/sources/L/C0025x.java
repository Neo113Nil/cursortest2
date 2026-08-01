package L;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: L.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025x implements Iterator, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f583a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Iterator f584b;

    public C0025x(X x2) {
        this.f584b = x2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f584b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f584b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        X x2 = viewGroup != null ? new X(0, viewGroup) : null;
        ArrayList arrayList = this.f583a;
        if (x2 == null || !x2.hasNext()) {
            while (!this.f584b.hasNext() && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                this.f584b = (Iterator) arrayList.get(W0.h.m0(arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(W0.h.m0(arrayList));
            }
        } else {
            arrayList.add(this.f584b);
            this.f584b = x2;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
