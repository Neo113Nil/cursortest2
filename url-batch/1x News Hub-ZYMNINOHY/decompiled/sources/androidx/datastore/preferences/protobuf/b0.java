package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p.C1167c;
import p.C1169e;

/* loaded from: classes.dex */
public class b0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f2280b;

    public /* synthetic */ b0(int i3, Map map) {
        this.f2279a = i3;
        this.f2280b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f2279a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((Y) this.f2280b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f2279a) {
            case 0:
                ((Y) this.f2280b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f2279a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((Y) this.f2280b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2279a) {
            case 0:
                return new a0((Y) this.f2280b);
            default:
                return new C1167c((C1169e) this.f2280b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f2279a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((Y) this.f2280b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2279a) {
            case 0:
                return ((Y) this.f2280b).size();
            default:
                return ((C1169e) this.f2280b).f10206c;
        }
    }
}
