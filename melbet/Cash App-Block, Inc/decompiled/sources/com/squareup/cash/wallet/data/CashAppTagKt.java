package com.squareup.cash.wallet.data;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.util.Log;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import bo.app.n$$ExternalSyntheticLambda1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.data.CashAppTag;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public abstract class CashAppTagKt {
    public static n$$ExternalSyntheticLambda1 addCallback(ConnectivityManager connectivityManager, NetworkRequest networkRequest, Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4) {
        IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(recomposer$$ExternalSyntheticLambda4);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        try {
            Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register callback");
            connectivityManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
            ref$BooleanRef.element = true;
        } catch (RuntimeException e) {
            if (!StringsKt__StringsJVMKt.endsWith(e.getClass().getName(), "TooManyRequestsException", false)) {
                throw e;
            }
            Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
            String str = WorkConstraintsTrackerKt.TAG;
            if (logger$LogcatLogger.mLoggingLevel <= 3) {
                Log.d(str, "NetworkRequestConstraintController couldn't register callback", e);
            }
            recomposer$$ExternalSyntheticLambda4.invoke(new ConstraintsState.ConstraintsNotMet(7));
        }
        return new n$$ExternalSyntheticLambda1(8, ref$BooleanRef, connectivityManager, individualNetworkCallback);
    }

    public static final CashAppTag currentCashAppTagOrNull(List list) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!isActive((CashAppTag) obj)) {
                break;
            }
        }
        return (CashAppTag) obj;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowApplet.deepLinkSpecs;
    }

    public static final boolean isActive(CashAppTag cashAppTag) {
        cashAppTag.getClass();
        return cashAppTag.lifecycleState == CashAppTag.TagLifecycleState.ACTIVE;
    }
}
