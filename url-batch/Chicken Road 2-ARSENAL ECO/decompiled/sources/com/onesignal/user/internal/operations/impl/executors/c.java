package com.onesignal.user.internal.operations.impl.executors;

/* loaded from: classes.dex */
public abstract class c {
    public static final f resolveBackendParams(d2.g op, String onesignalId, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        kotlin.jvm.internal.i.e(op, "op");
        kotlin.jvm.internal.i.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.i.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.i.e(identityVerificationService, "identityVerificationService");
        return identityVerificationService.getNewCodePathsRun() ? resolveIvBackendParams(op, onesignalId, jwtTokenStore, identityVerificationService.getIvBehaviorActive()) : f.Companion.legacyFor(onesignalId);
    }

    public static final f resolveIvBackendParams(d2.g op, String onesignalId, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z5) {
        kotlin.jvm.internal.i.e(op, "op");
        kotlin.jvm.internal.i.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.i.e(jwtTokenStore, "jwtTokenStore");
        if (!z5) {
            return f.Companion.legacyFor(onesignalId);
        }
        String externalId = op.getExternalId();
        if (externalId != null) {
            return new f("external_id", externalId, jwtTokenStore.getJwt(externalId));
        }
        com.onesignal.debug.internal.logging.b.error$default("IV active but op has null externalId; falling back to onesignal_id", null, 2, null);
        return f.Companion.legacyFor(onesignalId);
    }

    public static final String resolveIvJwt(d2.g op, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z5) {
        String externalId;
        kotlin.jvm.internal.i.e(op, "op");
        kotlin.jvm.internal.i.e(jwtTokenStore, "jwtTokenStore");
        if (z5 && (externalId = op.getExternalId()) != null) {
            return jwtTokenStore.getJwt(externalId);
        }
        return null;
    }

    public static final String resolveJwt(d2.g op, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        kotlin.jvm.internal.i.e(op, "op");
        kotlin.jvm.internal.i.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.i.e(identityVerificationService, "identityVerificationService");
        if (identityVerificationService.getNewCodePathsRun()) {
            return resolveIvJwt(op, jwtTokenStore, identityVerificationService.getIvBehaviorActive());
        }
        return null;
    }

    public static final boolean shouldFailLoginUserFromSubscription(boolean z5) {
        return z5;
    }
}
