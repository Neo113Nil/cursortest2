package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.impl.OperationRepo;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import g4.AbstractC0465j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OperationRepoIvExtensionsKt {
    public static final boolean handleFailUnauthorized(OperationRepo operationRepo, OperationRepo.OperationQueueItem startingOp, List<OperationRepo.OperationQueueItem> ops, JwtTokenStore jwtTokenStore, boolean z) {
        String externalId;
        i.e(operationRepo, "<this>");
        i.e(startingOp, "startingOp");
        i.e(ops, "ops");
        i.e(jwtTokenStore, "jwtTokenStore");
        if (!z || (externalId = startingOp.getOperation().getExternalId()) == null) {
            return false;
        }
        jwtTokenStore.invalidateJwt(externalId);
        Logging.info$default("Operation execution failed with 401 Unauthorized, JWT invalidated for user: " + externalId + ". Operations re-queued.", null, 2, null);
        Iterator<T> it = ops.iterator();
        while (it.hasNext()) {
            WaiterWithValue<Boolean> waiter = ((OperationRepo.OperationQueueItem) it.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
        synchronized (operationRepo.getQueue$com_onesignal_core()) {
            for (OperationRepo.OperationQueueItem operationQueueItem : AbstractC0465j.O0(ops)) {
                operationRepo.getQueue$com_onesignal_core().add(0, new OperationRepo.OperationQueueItem(operationQueueItem.getOperation(), null, operationQueueItem.getBucket(), operationQueueItem.getRetries()));
            }
        }
        return true;
    }

    public static final boolean hasValidJwtIfRequired(OperationRepo operationRepo, JwtTokenStore jwtTokenStore, Operation op, boolean z) {
        i.e(operationRepo, "<this>");
        i.e(jwtTokenStore, "jwtTokenStore");
        i.e(op, "op");
        if (!z || !op.getRequiresJwt()) {
            return true;
        }
        String externalId = op.getExternalId();
        return (externalId == null || jwtTokenStore.getJwt(externalId) == null) ? false : true;
    }
}
