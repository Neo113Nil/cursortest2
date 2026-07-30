package O5;

import D4.g;
import Q5.b;
import R5.f;
import V5.d;
import V5.e;
import com.onesignal.common.modeling.i;
import com.onesignal.core.internal.config.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements N5.a {
    private final c _configModelStore;
    private final b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e _subscriptionsModelStore;

    public a(b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, e _subscriptionsModelStore, c _configModelStore) {
        h.e(_identityModelStore, "_identityModelStore");
        h.e(_propertiesModelStore, "_propertiesModelStore");
        h.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        h.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // N5.a
    public List<g> getRebuildOperationsIfCurrentUser(String appId, String onesignalId) {
        h.e(appId, "appId");
        h.e(onesignalId, "onesignalId");
        Q5.a aVar = new Q5.a();
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
        if (!h.a(aVar.getOnesignalId(), onesignalId)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(appId, onesignalId, aVar.getExternalId(), null, 8, null));
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (h.a(((d) next).getId(), ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getPushSubscriptionId())) {
                obj = next;
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            arrayList2.add(new R5.a(appId, onesignalId, aVar.getExternalId(), dVar3.getId(), dVar3.getType(), dVar3.getOptedIn(), dVar3.getAddress(), dVar3.getStatus()));
        }
        arrayList2.add(new R5.h(appId, onesignalId, aVar.getExternalId()));
        return arrayList2;
    }
}
