package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.impl.OperationRepo;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OperationRepoIvExtensions.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0000¨\u0006\r"}, d2 = {"handleFailUnauthorized", "", "Lcom/onesignal/core/internal/operations/impl/OperationRepo;", "startingOp", "Lcom/onesignal/core/internal/operations/impl/OperationRepo$OperationQueueItem;", "ops", "", "jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "ivBehaviorActive", "hasValidJwtIfRequired", "op", "Lcom/onesignal/core/internal/operations/Operation;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationRepoIvExtensionsKt {
    public static final boolean hasValidJwtIfRequired(OperationRepo operationRepo, JwtTokenStore jwtTokenStore, Operation op, boolean z) {
        Intrinsics.checkNotNullParameter(operationRepo, "<this>");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(op, "op");
        if (!z || !op.getRequiresJwt()) {
            return true;
        }
        String externalId = op.getExternalId();
        return (externalId == null || jwtTokenStore.getJwt(externalId) == null) ? false : true;
    }

    public static final boolean handleFailUnauthorized(OperationRepo operationRepo, OperationRepo.OperationQueueItem startingOp, List<OperationRepo.OperationQueueItem> ops, JwtTokenStore jwtTokenStore, boolean z) {
        String externalId;
        Intrinsics.checkNotNullParameter(operationRepo, "<this>");
        Intrinsics.checkNotNullParameter(startingOp, "startingOp");
        Intrinsics.checkNotNullParameter(ops, "ops");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        if (!z || (externalId = startingOp.getOperation().getExternalId()) == null) {
            return false;
        }
        jwtTokenStore.invalidateJwt(externalId);
        Logging.info$default("Operation execution failed with 401 Unauthorized, JWT invalidated for user: " + externalId + ". Operations re-queued.", null, 2, null);
        Iterator<T> it = ops.iterator();
        while (it.hasNext()) {
            WaiterWithValue<Boolean> waiter = ((OperationRepo.OperationQueueItem) it.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(false);
            }
        }
        synchronized (operationRepo.getQueue$com_onesignal_core()) {
            for (OperationRepo.OperationQueueItem operationQueueItem : CollectionsKt.reversed(ops)) {
                operationRepo.getQueue$com_onesignal_core().add(0, new OperationRepo.OperationQueueItem(operationQueueItem.getOperation(), null, operationQueueItem.getBucket(), operationQueueItem.getRetries()));
            }
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }
}
