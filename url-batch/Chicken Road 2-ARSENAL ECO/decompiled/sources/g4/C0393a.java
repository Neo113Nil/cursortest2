package g4;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393a implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f4275f;

    /* renamed from: g, reason: collision with root package name */
    public Map.Entry f4276g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4277h;

    public C0393a(AbstractRunnableC0396d abstractRunnableC0396d, Iterator it) {
        this.f4275f = it;
        a();
    }

    public final void a() {
        T t6;
        do {
            Iterator it = this.f4275f;
            if (!it.hasNext()) {
                this.f4276g = null;
                this.f4277h = null;
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                this.f4276g = entry;
                t6 = ((C0395c) entry.getKey()).get();
                this.f4277h = t6;
            }
        } while (t6 == 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4277h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f4277h;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        try {
            return new C0394b(obj, this.f4276g);
        } finally {
            a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
