package t3;

import F5.q;
import d2.f;
import d2.g;
import kotlin.jvm.internal.i;
import r3.C0617a;
import s3.d;
import s3.j;
import s3.k;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663b extends e2.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final r3.b _identityModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663b(com.onesignal.user.internal.properties.b store, f opRepo, com.onesignal.core.internal.config.c _configModelStore, r3.b _identityModelStore) {
        super(store, opRepo);
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        i.e(_configModelStore, "_configModelStore");
        i.e(_identityModelStore, "_identityModelStore");
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    @Override // e2.b
    public g getReplaceOperation(com.onesignal.user.internal.properties.a model) {
        i.e(model, "model");
        return null;
    }

    @Override // e2.b
    public g getUpdateOperation(com.onesignal.user.internal.properties.a model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        if (q.I(path, "locationTimestamp") || q.I(path, "locationBackground") || q.I(path, "locationType") || q.I(path, "locationAccuracy")) {
            return null;
        }
        String externalId = ((C0617a) this._identityModelStore.getModel()).getExternalId();
        return q.I(path, "tags") ? (obj2 == null || !(obj2 instanceof String)) ? new d(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property) : new k(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property, (String) obj2) : new j(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), externalId, property, obj2);
    }
}
