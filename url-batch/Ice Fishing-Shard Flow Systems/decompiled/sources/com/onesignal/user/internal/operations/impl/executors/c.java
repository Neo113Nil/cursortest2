package com.onesignal.user.internal.operations.impl.executors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {
    public static final f resolveBackendParams(F2.g op, String onesignalId, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(identityVerificationService, "identityVerificationService");
        return identityVerificationService.getNewCodePathsRun() ? resolveIvBackendParams(op, onesignalId, jwtTokenStore, identityVerificationService.getIvBehaviorActive()) : f.Companion.legacyFor(onesignalId);
    }

    public static final f resolveIvBackendParams(F2.g op, String onesignalId, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z7) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        if (!z7) {
            return f.Companion.legacyFor(onesignalId);
        }
        String externalId = op.getExternalId();
        if (externalId != null) {
            return new f("external_id", externalId, jwtTokenStore.getJwt(externalId));
        }
        com.onesignal.debug.internal.logging.b.error$default("IV active but op has null externalId; falling back to onesignal_id", null, 2, null);
        return f.Companion.legacyFor(onesignalId);
    }

    public static final String resolveIvJwt(F2.g op, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z7) {
        String externalId;
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        if (z7 && (externalId = op.getExternalId()) != null) {
            return jwtTokenStore.getJwt(externalId);
        }
        return null;
    }

    public static final String resolveJwt(F2.g op, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(identityVerificationService, "identityVerificationService");
        if (identityVerificationService.getNewCodePathsRun()) {
            return resolveIvJwt(op, jwtTokenStore, identityVerificationService.getIvBehaviorActive());
        }
        return null;
    }

    public static final boolean shouldFailLoginUserFromSubscription(boolean z7) {
        return z7;
    }
}
