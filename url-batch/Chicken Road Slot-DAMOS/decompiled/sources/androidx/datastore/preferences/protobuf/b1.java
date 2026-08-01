package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.ph;
import com.google.android.gms.internal.measurement.q2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b1 extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f516e;

    public /* synthetic */ b1(int i3, Object obj) {
        this.f515d = i3;
        this.f516e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f515d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((y0) this.f516e).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((q2) this.f516e).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f515d) {
            case 0:
                ((y0) this.f516e).clear();
                break;
            case 1:
                ((q2) this.f516e).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f515d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((y0) this.f516e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((q2) this.f516e).get(entry2.getKey());
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
        switch (this.f515d) {
            case 0:
                return new a1((y0) this.f516e);
            case 1:
                return new a1((q2) this.f516e);
            case 2:
                return new com.google.android.gms.internal.measurement.u(this, 1);
            default:
                return new s.c((s.e) this.f516e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f515d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((y0) this.f516e).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((q2) this.f516e).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f515d) {
            case 0:
                return ((y0) this.f516e).size();
            case 1:
                return ((q2) this.f516e).size();
            case 2:
                return ((ph) this.f516e).f2683e;
            default:
                return ((s.e) this.f516e).f8369i;
        }
    }
}
