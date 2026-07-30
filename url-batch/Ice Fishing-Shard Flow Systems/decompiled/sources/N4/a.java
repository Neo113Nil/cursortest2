package N4;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f1830d;

    /* renamed from: e, reason: collision with root package name */
    public Map.Entry f1831e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1832i;

    public a(d dVar, Iterator it) {
        this.f1830d = it;
        a();
    }

    public final void a() {
        T t6;
        do {
            Iterator it = this.f1830d;
            if (!it.hasNext()) {
                this.f1831e = null;
                this.f1832i = null;
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                this.f1831e = entry;
                t6 = ((c) entry.getKey()).get();
                this.f1832i = t6;
            }
        } while (t6 == 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1832i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f1832i;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        try {
            return new b(obj, this.f1831e);
        } finally {
            a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
