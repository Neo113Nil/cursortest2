package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class g1 extends AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Map f822g;

    public /* synthetic */ g1(Map map, int i7) {
        this.f821f = i7;
        this.f822g = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f821f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((a1) this.f822g).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f821f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((a1) this.f822g).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f821f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((a1) this.f822g).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f821f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new f1((a1) this.f822g);
            default:
                return new i.c((i.e) this.f822g);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f821f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((a1) this.f822g).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f821f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((a1) this.f822g).size();
            default:
                return ((i.e) this.f822g).f4744h;
        }
    }
}
