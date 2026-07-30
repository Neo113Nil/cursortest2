package V3;

import F2.f;
import F2.g;
import U3.d;
import U3.j;
import U3.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;

/* loaded from: classes.dex */
public final class b extends G2.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final T3.b _identityModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.onesignal.user.internal.properties.b store, f opRepo, com.onesignal.core.internal.config.c _configModelStore, T3.b _identityModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    @Override // G2.b
    public g getReplaceOperation(com.onesignal.user.internal.properties.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // G2.b
    public g getUpdateOperation(com.onesignal.user.internal.properties.a model, String path, String property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        if (p.l(path, "locationTimestamp") || p.l(path, "locationBackground") || p.l(path, "locationType") || p.l(path, "locationAccuracy")) {
            return null;
        }
        String externalId = ((T3.a) this._identityModelStore.getModel()).getExternalId();
        return p.l(path, "tags") ? (obj2 == null || !(obj2 instanceof String)) ? new d(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property) : new k(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property, (String) obj2) : new j(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property, obj2);
    }
}
