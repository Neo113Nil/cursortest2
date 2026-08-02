package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4613a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4614b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f4615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f4616d;

    public a0(Y y4) {
        this.f4616d = y4;
    }

    public final Iterator a() {
        if (this.f4615c == null) {
            this.f4615c = this.f4616d.f4606b.entrySet().iterator();
        }
        return this.f4615c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f4613a + 1;
        Y y4 = this.f4616d;
        return i4 < y4.f4605a.size() || (!y4.f4606b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4614b = true;
        int i4 = this.f4613a + 1;
        this.f4613a = i4;
        Y y4 = this.f4616d;
        return i4 < y4.f4605a.size() ? (Map.Entry) y4.f4605a.get(this.f4613a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4614b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f4614b = false;
        int i4 = Y.f4604f;
        Y y4 = this.f4616d;
        y4.b();
        if (this.f4613a >= y4.f4605a.size()) {
            a().remove();
            return;
        }
        int i5 = this.f4613a;
        this.f4613a = i5 - 1;
        y4.h(i5);
    }
}
