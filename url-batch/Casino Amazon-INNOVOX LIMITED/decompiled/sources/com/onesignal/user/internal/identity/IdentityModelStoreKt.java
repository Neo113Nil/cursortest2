package com.onesignal.user.internal.identity;

import com.onesignal.core.BuildConfig;
import com.onesignal.user.internal.backend.IdentityConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityModelStore.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"IDENTITY_NAME_SPACE", "", "hasOneSignalId", "", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentityModelStoreKt {
    public static final String IDENTITY_NAME_SPACE = "identity";

    public static final boolean hasOneSignalId(IdentityModelStore identityModelStore) {
        Intrinsics.checkNotNullParameter(identityModelStore, "<this>");
        return identityModelStore.getModel().hasProperty(IdentityConstants.ONESIGNAL_ID);
    }
}
