package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ci extends AbstractSet {
    public final /* synthetic */ int m;
    public final /* synthetic */ Map n;

    public /* synthetic */ ci(Map map, int i) {
        this.m = i;
        this.n = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.m;
        Map map = this.n;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((bm2) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((cp3) map).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.m;
        Map map = this.n;
        switch (i) {
            case 1:
                ((bm2) map).clear();
                break;
            case 2:
                ((cp3) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.m;
        Map map = this.n;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((bm2) map).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((cp3) map).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.m;
        Map map = this.n;
        switch (i) {
            case 0:
                return new fi((hi) map);
            case 1:
                return new dm2((bm2) map);
            default:
                return new dm2((cp3) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.m;
        Map map = this.n;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((bm2) map).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((cp3) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.m;
        Map map = this.n;
        switch (i) {
            case 0:
                return ((hi) map).o;
            case 1:
                return ((bm2) map).size();
            default:
                return ((cp3) map).size();
        }
    }
}
