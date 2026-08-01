package ad;

import na.f;
import na.g;
import zc.d;
import zc.j;
import zc.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends oa.b {
    private final com.onesignal.core.internal.config.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.onesignal.user.internal.properties.b bVar, f fVar, com.onesignal.core.internal.config.b bVar2) {
        super(bVar, fVar);
        bVar.getClass();
        fVar.getClass();
        bVar2.getClass();
        this._configModelStore = bVar2;
    }

    @Override // oa.b
    public g getUpdateOperation(com.onesignal.user.internal.properties.a aVar, String str, String str2, Object obj, Object obj2) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        if (str.startsWith("locationTimestamp") || str.startsWith("locationBackground") || str.startsWith("locationType") || str.startsWith("locationAccuracy")) {
            return null;
        }
        return str.startsWith("tags") ? (obj2 == null || !(obj2 instanceof String)) ? new d(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2) : new k(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, (String) obj2) : new j(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, obj2);
    }

    @Override // oa.b
    public g getReplaceOperation(com.onesignal.user.internal.properties.a aVar) {
        aVar.getClass();
        return null;
    }
}
