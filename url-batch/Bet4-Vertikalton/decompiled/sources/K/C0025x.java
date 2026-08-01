package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: K.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025x implements Iterator, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f513a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Iterator f514b;

    public C0025x(X x2) {
        this.f514b = x2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f514b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f514b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        X x2 = viewGroup != null ? new X(0, viewGroup) : null;
        ArrayList arrayList = this.f513a;
        if (x2 == null || !x2.hasNext()) {
            while (!this.f514b.hasNext() && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                this.f514b = (Iterator) arrayList.get(S0.h.x0(arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(S0.h.x0(arrayList));
            }
        } else {
            arrayList.add(this.f514b);
            this.f514b = x2;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
