package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ExecutorsIvExtensionsKt {
    public static final IvBackendParams resolveBackendParams(Operation op, String onesignalId, JwtTokenStore jwtTokenStore, IdentityVerificationService identityVerificationService) {
        i.e(op, "op");
        i.e(onesignalId, "onesignalId");
        i.e(jwtTokenStore, "jwtTokenStore");
        i.e(identityVerificationService, "identityVerificationService");
        return identityVerificationService.getNewCodePathsRun() ? resolveIvBackendParams(op, onesignalId, jwtTokenStore, identityVerificationService.getIvBehaviorActive()) : IvBackendParams.Companion.legacyFor(onesignalId);
    }

    public static final IvBackendParams resolveIvBackendParams(Operation op, String onesignalId, JwtTokenStore jwtTokenStore, boolean z) {
        i.e(op, "op");
        i.e(onesignalId, "onesignalId");
        i.e(jwtTokenStore, "jwtTokenStore");
        if (!z) {
            return IvBackendParams.Companion.legacyFor(onesignalId);
        }
        String externalId = op.getExternalId();
        if (externalId != null) {
            return new IvBackendParams(IdentityConstants.EXTERNAL_ID, externalId, jwtTokenStore.getJwt(externalId));
        }
        Logging.error$default("IV active but op has null externalId; falling back to onesignal_id", null, 2, null);
        return IvBackendParams.Companion.legacyFor(onesignalId);
    }

    public static final String resolveIvJwt(Operation op, JwtTokenStore jwtTokenStore, boolean z) {
        String externalId;
        i.e(op, "op");
        i.e(jwtTokenStore, "jwtTokenStore");
        if (z && (externalId = op.getExternalId()) != null) {
            return jwtTokenStore.getJwt(externalId);
        }
        return null;
    }

    public static final String resolveJwt(Operation op, JwtTokenStore jwtTokenStore, IdentityVerificationService identityVerificationService) {
        i.e(op, "op");
        i.e(jwtTokenStore, "jwtTokenStore");
        i.e(identityVerificationService, "identityVerificationService");
        if (identityVerificationService.getNewCodePathsRun()) {
            return resolveIvJwt(op, jwtTokenStore, identityVerificationService.getIvBehaviorActive());
        }
        return null;
    }

    public static final boolean shouldFailLoginUserFromSubscription(boolean z) {
        return z;
    }
}
