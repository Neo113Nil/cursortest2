package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* renamed from: K.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025v implements Iterator, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f664a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f665b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f666c;

    public C0025v(V v2) {
        this.f664a = 0;
        this.f666c = new ArrayList();
        this.f665b = v2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f664a) {
        }
        return this.f665b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f664a) {
            case 0:
                Object next = this.f665b.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                V v2 = viewGroup != null ? new V(0, viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.f666c;
                if (v2 == null || !v2.hasNext()) {
                    while (!this.f665b.hasNext() && !arrayList.isEmpty()) {
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        this.f665b = (Iterator) arrayList.get(Y0.k.y0(arrayList));
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(Y0.k.y0(arrayList));
                    }
                } else {
                    arrayList.add(this.f665b);
                    this.f665b = v2;
                }
                return next;
            default:
                return ((q1.j) this.f666c).f3823b.g(this.f665b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f664a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0025v(q1.j jVar) {
        this.f664a = 1;
        this.f666c = jVar;
        this.f665b = new r1.b(jVar.f3822a);
    }
}
