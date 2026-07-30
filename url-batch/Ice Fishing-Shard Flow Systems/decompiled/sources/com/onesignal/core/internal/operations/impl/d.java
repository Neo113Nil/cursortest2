package com.onesignal.core.internal.operations.impl;

import F2.g;
import com.onesignal.common.threading.e;
import com.onesignal.core.internal.operations.impl.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final boolean handleFailUnauthorized(b bVar, b.C0022b startingOp, List<b.C0022b> ops, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z7) {
        String externalId;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(startingOp, "startingOp");
        Intrinsics.checkNotNullParameter(ops, "ops");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        if (!z7 || (externalId = startingOp.getOperation().getExternalId()) == null) {
            return false;
        }
        jwtTokenStore.invalidateJwt(externalId);
        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed with 401 Unauthorized, JWT invalidated for user: " + externalId + ". Operations re-queued.", null, 2, null);
        Iterator<T> it = ops.iterator();
        while (it.hasNext()) {
            e waiter = ((b.C0022b) it.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
        synchronized (bVar.getQueue$com_onesignal_core()) {
            try {
                for (b.C0022b c0022b : CollectionsKt.v(ops)) {
                    bVar.getQueue$com_onesignal_core().add(0, new b.C0022b(c0022b.getOperation(), null, c0022b.getBucket(), c0022b.getRetries()));
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public static final boolean hasValidJwtIfRequired(b bVar, com.onesignal.user.internal.jwt.c jwtTokenStore, g op, boolean z7) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(op, "op");
        if (!z7 || !op.getRequiresJwt()) {
            return true;
        }
        String externalId = op.getExternalId();
        return (externalId == null || jwtTokenStore.getJwt(externalId) == null) ? false : true;
    }
}
