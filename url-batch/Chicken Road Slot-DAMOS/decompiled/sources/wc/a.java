package wc;

import com.onesignal.common.modeling.i;
import com.onesignal.core.internal.config.b;
import dd.d;
import dd.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import na.g;
import zc.f;
import zc.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements vc.a {
    private final b _configModelStore;
    private final yc.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e _subscriptionsModelStore;

    public a(yc.b bVar, com.onesignal.user.internal.properties.b bVar2, e eVar, b bVar3) {
        bVar.getClass();
        bVar2.getClass();
        eVar.getClass();
        bVar3.getClass();
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
    }

    @Override // vc.a
    public List<g> getRebuildOperationsIfCurrentUser(String str, String str2) {
        str.getClass();
        str2.getClass();
        yc.a aVar = new yc.a();
        Object obj = null;
        aVar.initializeFromModel(null, this._identityModelStore.getModel());
        new com.onesignal.user.internal.properties.a().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = this._subscriptionsModelStore.list().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            d dVar2 = new d();
            dVar2.initializeFromModel(null, dVar);
            arrayList.add(dVar2);
        }
        if (!Intrinsics.a(aVar.getOnesignalId(), str2)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(str, str2, aVar.getExternalId(), null, 8, null));
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i3);
            i3++;
            if (Intrinsics.a(((d) obj2).getId(), ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getPushSubscriptionId())) {
                obj = obj2;
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            arrayList2.add(new zc.a(str, str2, dVar3.getId(), dVar3.getType(), dVar3.getOptedIn(), dVar3.getAddress(), dVar3.getStatus()));
        }
        arrayList2.add(new h(str, str2));
        return arrayList2;
    }
}
