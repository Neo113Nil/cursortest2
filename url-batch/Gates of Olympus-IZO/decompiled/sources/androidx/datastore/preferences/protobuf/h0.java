package androidx.datastore.preferences.protobuf;

import j.C0485c;
import j.C0487e;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h0 extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f3879e;

    public /* synthetic */ h0(Map map, int i3) {
        this.f3878d = i3;
        this.f3879e = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f3878d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C0192b0) this.f3879e).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f3878d) {
            case 0:
                ((C0192b0) this.f3879e).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f3878d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C0192b0) this.f3879e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f3878d) {
            case 0:
                return new g0((C0192b0) this.f3879e);
            default:
                return new C0485c((C0487e) this.f3879e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f3878d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C0192b0) this.f3879e).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3878d) {
            case 0:
                return ((C0192b0) this.f3879e).size();
            default:
                return ((C0487e) this.f3879e).f5140f;
        }
    }
}
