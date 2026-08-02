package v2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f15600a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15601b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f15602c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f15603d = O.f15583a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f15604e;

    public C1454a(W w4) {
        this.f15604e = w4;
        this.f15600a = w4.f15594d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15600a.hasNext() || this.f15603d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15603d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f15600a.next();
            this.f15601b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f15602c = collection;
            this.f15603d = collection.iterator();
        }
        return this.f15603d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15603d.remove();
        Collection collection = this.f15602c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f15600a.remove();
        }
        W w4 = this.f15604e;
        w4.f15595e--;
    }
}
