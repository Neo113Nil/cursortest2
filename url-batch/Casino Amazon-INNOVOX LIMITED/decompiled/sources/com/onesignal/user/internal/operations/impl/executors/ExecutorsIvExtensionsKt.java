package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExecutorsIvExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a(\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\"\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\"\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0000¨\u0006\u0010"}, d2 = {"resolveBackendParams", "Lcom/onesignal/user/internal/operations/impl/executors/IvBackendParams;", "op", "Lcom/onesignal/core/internal/operations/Operation;", "onesignalId", "", "jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "resolveIvBackendParams", "ivBehaviorActive", "", "resolveIvJwt", "resolveJwt", "shouldFailLoginUserFromSubscription", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExecutorsIvExtensionsKt {
    public static final boolean shouldFailLoginUserFromSubscription(boolean z) {
        return z;
    }

    public static final IvBackendParams resolveBackendParams(Operation op, String onesignalId, JwtTokenStore jwtTokenStore, IdentityVerificationService identityVerificationService) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(identityVerificationService, "identityVerificationService");
        if (identityVerificationService.getNewCodePathsRun()) {
            return resolveIvBackendParams(op, onesignalId, jwtTokenStore, identityVerificationService.getIvBehaviorActive());
        }
        return IvBackendParams.INSTANCE.legacyFor(onesignalId);
    }

    public static final IvBackendParams resolveIvBackendParams(Operation op, String onesignalId, JwtTokenStore jwtTokenStore, boolean z) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        if (!z) {
            return IvBackendParams.INSTANCE.legacyFor(onesignalId);
        }
        String externalId = op.getExternalId();
        if (externalId == null) {
            Logging.error$default("IV active but op has null externalId; falling back to onesignal_id", null, 2, null);
            return IvBackendParams.INSTANCE.legacyFor(onesignalId);
        }
        return new IvBackendParams(IdentityConstants.EXTERNAL_ID, externalId, jwtTokenStore.getJwt(externalId));
    }

    public static final String resolveJwt(Operation op, JwtTokenStore jwtTokenStore, IdentityVerificationService identityVerificationService) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(identityVerificationService, "identityVerificationService");
        if (identityVerificationService.getNewCodePathsRun()) {
            return resolveIvJwt(op, jwtTokenStore, identityVerificationService.getIvBehaviorActive());
        }
        return null;
    }

    public static final String resolveIvJwt(Operation op, JwtTokenStore jwtTokenStore, boolean z) {
        String externalId;
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        if (z && (externalId = op.getExternalId()) != null) {
            return jwtTokenStore.getJwt(externalId);
        }
        return null;
    }
}
