package com.onesignal.user.internal.operations.impl.listeners;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PropertiesModelStoreListener.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J6\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/listeners/PropertiesModelStoreListener;", "Lcom/onesignal/core/internal/operations/listeners/SingletonModelStoreListener;", "Lcom/onesignal/user/internal/properties/PropertiesModel;", "store", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "opRepo", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "(Lcom/onesignal/user/internal/properties/PropertiesModelStore;Lcom/onesignal/core/internal/operations/IOperationRepo;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/internal/identity/IdentityModelStore;)V", "getReplaceOperation", "Lcom/onesignal/core/internal/operations/Operation;", CommonUrlParts.MODEL, "getUpdateOperation", "path", "", "property", "oldValue", "", "newValue", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PropertiesModelStoreListener extends SingletonModelStoreListener<PropertiesModel> {
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getReplaceOperation(PropertiesModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModelStoreListener(PropertiesModelStore store, IOperationRepo opRepo, ConfigModelStore _configModelStore, IdentityModelStore _identityModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getUpdateOperation(PropertiesModel model, String path, String property, Object oldValue, Object newValue) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        if (StringsKt.startsWith$default(path, "locationTimestamp", false, 2, (Object) null) || StringsKt.startsWith$default(path, "locationBackground", false, 2, (Object) null) || StringsKt.startsWith$default(path, "locationType", false, 2, (Object) null) || StringsKt.startsWith$default(path, "locationAccuracy", false, 2, (Object) null)) {
            return null;
        }
        String externalId = this._identityModelStore.getModel().getExternalId();
        if (StringsKt.startsWith$default(path, "tags", false, 2, (Object) null)) {
            if (newValue != null && (newValue instanceof String)) {
                return new SetTagOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), externalId, property, (String) newValue);
            }
            return new DeleteTagOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), externalId, property);
        }
        return new SetPropertyOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), externalId, property, newValue);
    }
}
