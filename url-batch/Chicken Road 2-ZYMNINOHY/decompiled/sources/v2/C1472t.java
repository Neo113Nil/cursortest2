package v2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: v2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472t extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1474v f15675b;

    public /* synthetic */ C1472t(C1474v c1474v, int i4) {
        this.f15674a = i4;
        this.f15675b = c1474v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15674a) {
            case 0:
                this.f15675b.clear();
                break;
            default:
                this.f15675b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f15674a) {
            case 0:
                C1474v c1474v = this.f15675b;
                Map c4 = c1474v.c();
                if (c4 != null) {
                    return c4.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e4 = c1474v.e(entry.getKey());
                    if (e4 != -1 && V3.b.n(c1474v.k()[e4], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f15675b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15674a) {
            case 0:
                C1474v c1474v = this.f15675b;
                Map c4 = c1474v.c();
                return c4 != null ? c4.entrySet().iterator() : new C1471s(c1474v, 1);
            default:
                C1474v c1474v2 = this.f15675b;
                Map c5 = c1474v2.c();
                return c5 != null ? c5.keySet().iterator() : new C1471s(c1474v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f15674a) {
            case 0:
                C1474v c1474v = this.f15675b;
                Map c4 = c1474v.c();
                if (c4 != null) {
                    return c4.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c1474v.g()) {
                        int d4 = c1474v.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c1474v.f15680a;
                        Objects.requireNonNull(obj2);
                        int o = r.o(key, value, d4, obj2, c1474v.i(), c1474v.j(), c1474v.k());
                        if (o != -1) {
                            c1474v.f(o, d4);
                            c1474v.f15685f--;
                            c1474v.f15684e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C1474v c1474v2 = this.f15675b;
                Map c5 = c1474v2.c();
                return c5 != null ? c5.keySet().remove(obj) : c1474v2.h(obj) != C1474v.f15679j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f15674a) {
        }
        return this.f15675b.size();
    }
}
