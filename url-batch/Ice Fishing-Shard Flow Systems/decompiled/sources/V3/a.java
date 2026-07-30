package V3;

import F2.f;
import F2.g;
import U3.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends G2.b {
    private final com.onesignal.core.internal.config.c _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(T3.b store, f opRepo, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // G2.b
    public g getReplaceOperation(T3.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // G2.b
    public g getUpdateOperation(T3.a model, String path, String property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new U3.b(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), model.getExternalId(), property) : new i(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), model.getExternalId(), property, (String) obj2);
    }
}
