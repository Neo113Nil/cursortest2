package t3;

import d2.f;
import d2.g;
import kotlin.jvm.internal.i;
import r3.C0617a;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662a extends e2.b {
    private final com.onesignal.core.internal.config.c _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0662a(r3.b store, f opRepo, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        i.e(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // e2.b
    public g getReplaceOperation(C0617a model) {
        i.e(model, "model");
        return null;
    }

    @Override // e2.b
    public g getUpdateOperation(C0617a model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new s3.b(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), model.getExternalId(), property) : new s3.i(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), model.getExternalId(), property, (String) obj2);
    }
}
