package n0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2846f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Iterator f2847g;

    public x(i3.a aVar) {
        this.f2847g = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2847g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f2847g.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        i3.a aVar = viewGroup != null ? new i3.a(1, viewGroup) : null;
        ArrayList arrayList = this.f2846f;
        if (aVar != null && aVar.hasNext()) {
            arrayList.add(this.f2847g);
            this.f2847g = aVar;
            return next;
        }
        while (!this.f2847g.hasNext() && !arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            this.f2847g = (Iterator) arrayList.get(x2.i.A(arrayList));
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(x2.i.A(arrayList));
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
