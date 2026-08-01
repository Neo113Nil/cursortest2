package ad;

import na.f;
import na.g;
import zc.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends oa.b {
    private final com.onesignal.core.internal.config.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yc.b bVar, f fVar, com.onesignal.core.internal.config.b bVar2) {
        super(bVar, fVar);
        bVar.getClass();
        fVar.getClass();
        bVar2.getClass();
        this._configModelStore = bVar2;
    }

    @Override // oa.b
    public g getUpdateOperation(yc.a aVar, String str, String str2, Object obj, Object obj2) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        return (obj2 == null || !(obj2 instanceof String)) ? new zc.b(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2) : new i(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, (String) obj2);
    }

    @Override // oa.b
    public g getReplaceOperation(yc.a aVar) {
        aVar.getClass();
        return null;
    }
}
