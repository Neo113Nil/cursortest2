package androidx.datastore.preferences.protobuf;

import j.C0529c;
import j.C0531e;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h0 extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f5080e;

    public /* synthetic */ h0(Map map, int i3) {
        this.f5079d = i3;
        this.f5080e = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f5079d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C0248b0) this.f5080e).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f5079d) {
            case 0:
                ((C0248b0) this.f5080e).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f5079d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C0248b0) this.f5080e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f5079d) {
            case 0:
                return new g0((C0248b0) this.f5080e);
            default:
                return new C0529c((C0531e) this.f5080e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f5079d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C0248b0) this.f5080e).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5079d) {
            case 0:
                return ((C0248b0) this.f5080e).size();
            default:
                return ((C0531e) this.f5080e).f6258f;
        }
    }
}
