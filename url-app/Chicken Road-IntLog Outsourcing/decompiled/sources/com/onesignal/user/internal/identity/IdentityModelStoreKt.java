package com.onesignal.user.internal.identity;

import com.onesignal.user.internal.backend.IdentityConstants;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IdentityModelStoreKt {
    public static final String IDENTITY_NAME_SPACE = "identity";

    public static final boolean hasOneSignalId(IdentityModelStore identityModelStore) {
        i.e(identityModelStore, "<this>");
        return identityModelStore.getModel().hasProperty(IdentityConstants.ONESIGNAL_ID);
    }
}
