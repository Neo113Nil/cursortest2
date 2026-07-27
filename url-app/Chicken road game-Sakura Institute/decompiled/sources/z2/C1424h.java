package z2;

import java.util.Iterator;
import java.util.Map;

/* renamed from: z2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424h implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterator f11948e;

    public /* synthetic */ C1424h(Iterator it, int i2) {
        this.f11947d = i2;
        this.f11948e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11947d) {
        }
        return this.f11948e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11947d) {
            case 0:
                return ((Map.Entry) this.f11948e.next()).getKey();
            default:
                return ((Map.Entry) this.f11948e.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11947d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
