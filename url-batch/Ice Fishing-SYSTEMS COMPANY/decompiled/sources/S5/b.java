package S5;

import D4.f;
import D4.g;
import M7.q;
import R5.d;
import R5.j;
import R5.k;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class b extends E4.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final Q5.b _identityModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.onesignal.user.internal.properties.b store, f opRepo, com.onesignal.core.internal.config.c _configModelStore, Q5.b _identityModelStore) {
        super(store, opRepo);
        h.e(store, "store");
        h.e(opRepo, "opRepo");
        h.e(_configModelStore, "_configModelStore");
        h.e(_identityModelStore, "_identityModelStore");
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    @Override // E4.b
    public g getReplaceOperation(com.onesignal.user.internal.properties.a model) {
        h.e(model, "model");
        return null;
    }

    @Override // E4.b
    public g getUpdateOperation(com.onesignal.user.internal.properties.a model, String path, String property, Object obj, Object obj2) {
        h.e(model, "model");
        h.e(path, "path");
        h.e(property, "property");
        if (q.I(path, "locationTimestamp") || q.I(path, "locationBackground") || q.I(path, "locationType") || q.I(path, "locationAccuracy")) {
            return null;
        }
        String externalId = ((Q5.a) this._identityModelStore.getModel()).getExternalId();
        return q.I(path, "tags") ? (obj2 == null || !(obj2 instanceof String)) ? new d(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property) : new k(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property, (String) obj2) : new j(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property, obj2);
    }
}
