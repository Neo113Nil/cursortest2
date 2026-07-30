package l0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends e6.h {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5758f;

    /* renamed from: g, reason: collision with root package name */
    public final c f5759g;

    public /* synthetic */ h(c cVar, int i7) {
        this.f5758f = i7;
        this.f5759g = cVar;
    }

    @Override // e6.a
    public final int a() {
        switch (this.f5758f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = this.f5759g;
                cVar.getClass();
                return cVar.f5748g;
            default:
                c cVar2 = this.f5759g;
                cVar2.getClass();
                return cVar2.f5748g;
        }
    }

    @Override // e6.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5758f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                c cVar = this.f5759g;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f5759g.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5758f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k kVar = this.f5759g.f5747f;
                l[] lVarArr = new l[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    lVarArr[i7] = new m(0);
                }
                return new i(kVar, lVarArr);
            default:
                k kVar2 = this.f5759g.f5747f;
                l[] lVarArr2 = new l[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    lVarArr2[i8] = new m(1);
                }
                return new i(kVar2, lVarArr2);
        }
    }
}
