package d2;

import java.util.Iterator;
import java.util.Map;
import o2.C0924c;
import o2.q;
import o2.s;

/* renamed from: d2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6073d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f6074e;

    public /* synthetic */ C0548e(Iterator it, int i2) {
        this.f6073d = i2;
        this.f6074e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6073d) {
        }
        return this.f6074e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6073d) {
            case 0:
                return ((Map.Entry) this.f6074e.next()).getKey();
            default:
                Map.Entry entry = (Map.Entry) this.f6074e.next();
                return new q((C0924c) entry.getKey(), (s) entry.getValue());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6073d) {
            case 0:
                this.f6074e.remove();
                break;
            default:
                this.f6074e.remove();
                break;
        }
    }
}
