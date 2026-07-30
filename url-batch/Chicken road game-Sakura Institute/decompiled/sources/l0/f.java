package l0;

import com.android.installreferrer.api.InstallReferrerClient;
import f1.g0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends e6.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5756f;

    /* renamed from: g, reason: collision with root package name */
    public final o0.c f5757g;

    public /* synthetic */ f(int i7, o0.c cVar) {
        this.f5756f = i7;
        this.f5757g = cVar;
    }

    @Override // e6.g
    public final int a() {
        switch (this.f5756f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o0.c cVar = this.f5757g;
                cVar.getClass();
                return cVar.f6820j;
            default:
                o0.c cVar2 = this.f5757g;
                cVar2.getClass();
                return cVar2.f6820j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5756f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5756f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f5757g.clear();
                break;
            default:
                this.f5757g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5756f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                o0.c cVar = this.f5757g;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f5757g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5756f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new g0(this.f5757g);
            default:
                l[] lVarArr = new l[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    lVarArr[i7] = new m(1);
                }
                return new g(this.f5757g, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5756f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f5757g.remove(entry.getKey(), entry.getValue());
            default:
                o0.c cVar = this.f5757g;
                if (!cVar.containsKey(obj)) {
                    return false;
                }
                cVar.remove(obj);
                return true;
        }
    }
}
