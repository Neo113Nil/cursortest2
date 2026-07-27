package androidx.datastore.preferences.protobuf;

import i.C0668c;
import i.C0670e;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h0 extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f5354e;

    public /* synthetic */ h0(Map map, int i2) {
        this.f5353d = i2;
        this.f5354e = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f5353d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C0437b0) this.f5354e).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f5353d) {
            case 0:
                ((C0437b0) this.f5354e).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f5353d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C0437b0) this.f5354e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f5353d) {
            case 0:
                return new g0((C0437b0) this.f5354e);
            default:
                return new C0668c((C0670e) this.f5354e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f5353d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C0437b0) this.f5354e).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5353d) {
            case 0:
                return ((C0437b0) this.f5354e).size();
            default:
                return ((C0670e) this.f5354e).f6895i;
        }
    }
}
