package p3;

import com.onesignal.core.internal.config.c;
import d2.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import o3.InterfaceC0559a;
import r3.C0617a;
import r3.b;
import s3.f;
import s3.h;
import w3.d;
import w3.e;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579a implements InterfaceC0559a {
    private final c _configModelStore;
    private final b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e _subscriptionsModelStore;

    public C0579a(b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, e _subscriptionsModelStore, c _configModelStore) {
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        i.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // o3.InterfaceC0559a
    public List<g> getRebuildOperationsIfCurrentUser(String appId, String onesignalId) {
        i.e(appId, "appId");
        i.e(onesignalId, "onesignalId");
        C0617a c0617a = new C0617a();
        Object obj = null;
        c0617a.initializeFromModel(null, this._identityModelStore.getModel());
        new com.onesignal.user.internal.properties.a().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<com.onesignal.common.modeling.i> it = this._subscriptionsModelStore.list().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            d dVar2 = new d();
            dVar2.initializeFromModel(null, dVar);
            arrayList.add(dVar2);
        }
        if (!i.a(c0617a.getOnesignalId(), onesignalId)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(appId, onesignalId, c0617a.getExternalId(), null, 8, null));
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i7);
            i7++;
            if (i.a(((d) obj2).getId(), ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getPushSubscriptionId())) {
                obj = obj2;
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            arrayList2.add(new s3.a(appId, onesignalId, c0617a.getExternalId(), dVar3.getId(), dVar3.getType(), dVar3.getOptedIn(), dVar3.getAddress(), dVar3.getStatus()));
        }
        arrayList2.add(new h(appId, onesignalId, c0617a.getExternalId()));
        return arrayList2;
    }
}
