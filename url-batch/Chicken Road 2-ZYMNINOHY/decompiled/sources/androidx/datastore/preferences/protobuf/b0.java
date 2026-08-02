package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class b0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f4619b;

    public /* synthetic */ b0(int i4, Map map) {
        this.f4618a = i4;
        this.f4619b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f4618a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((Y) this.f4619b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4618a) {
            case 0:
                ((Y) this.f4619b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f4618a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((Y) this.f4619b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4618a) {
            case 0:
                return new a0((Y) this.f4619b);
            default:
                return new p.c((p.e) this.f4619b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f4618a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((Y) this.f4619b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4618a) {
            case 0:
                return ((Y) this.f4619b).size();
            default:
                return ((p.e) this.f4619b).f14667c;
        }
    }
}
