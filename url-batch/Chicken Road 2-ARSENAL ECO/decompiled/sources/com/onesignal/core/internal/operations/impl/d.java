package com.onesignal.core.internal.operations.impl;

import com.onesignal.core.internal.operations.impl.b;
import d2.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import l5.AbstractC0506j;

/* loaded from: classes.dex */
public abstract class d {
    public static final boolean handleFailUnauthorized(b bVar, b.C0023b startingOp, List<b.C0023b> ops, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z5) {
        String externalId;
        i.e(bVar, "<this>");
        i.e(startingOp, "startingOp");
        i.e(ops, "ops");
        i.e(jwtTokenStore, "jwtTokenStore");
        if (!z5 || (externalId = startingOp.getOperation().getExternalId()) == null) {
            return false;
        }
        jwtTokenStore.invalidateJwt(externalId);
        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed with 401 Unauthorized, JWT invalidated for user: " + externalId + ". Operations re-queued.", null, 2, null);
        Iterator<T> it = ops.iterator();
        while (it.hasNext()) {
            com.onesignal.common.threading.d waiter = ((b.C0023b) it.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
        synchronized (bVar.getQueue$com_onesignal_core()) {
            for (b.C0023b c0023b : AbstractC0506j.M(ops)) {
                bVar.getQueue$com_onesignal_core().add(0, new b.C0023b(c0023b.getOperation(), null, c0023b.getBucket(), c0023b.getRetries()));
            }
        }
        return true;
    }

    public static final boolean hasValidJwtIfRequired(b bVar, com.onesignal.user.internal.jwt.c jwtTokenStore, g op, boolean z5) {
        i.e(bVar, "<this>");
        i.e(jwtTokenStore, "jwtTokenStore");
        i.e(op, "op");
        if (!z5 || !op.getRequiresJwt()) {
            return true;
        }
        String externalId = op.getExternalId();
        return (externalId == null || jwtTokenStore.getJwt(externalId) == null) ? false : true;
    }
}
