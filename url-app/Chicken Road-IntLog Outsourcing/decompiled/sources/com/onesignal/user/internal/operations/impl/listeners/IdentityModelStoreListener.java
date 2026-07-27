package com.onesignal.user.internal.operations.impl.listeners;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.DeleteAliasOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IdentityModelStoreListener extends SingletonModelStoreListener<IdentityModel> {
    private final ConfigModelStore _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityModelStoreListener(IdentityModelStore store, IOperationRepo opRepo, ConfigModelStore _configModelStore) {
        super(store, opRepo);
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        i.e(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getReplaceOperation(IdentityModel model) {
        i.e(model, "model");
        return null;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getUpdateOperation(IdentityModel model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new DeleteAliasOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), model.getExternalId(), property) : new SetAliasOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), model.getExternalId(), property, (String) obj2);
    }
}
