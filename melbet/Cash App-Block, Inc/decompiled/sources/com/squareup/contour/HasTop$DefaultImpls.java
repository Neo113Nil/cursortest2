package com.squareup.contour;

import androidx.paging.LoadState;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$NoLimitReached;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$QuantityLimitExceeded;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$ValueLimitExceeded;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.math.LocalMoneysKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.contour.constraints.PositionConstraint;
import com.squareup.contour.utils.XYIntUtilsKt$unwrapXIntLambda$1;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public abstract class HasTop$DefaultImpls {
    public static void bottomTo$default(ByteArrayProtoReader32 byteArrayProtoReader32, Function1 function1) {
        PositionConstraint positionConstraint = (PositionConstraint) byteArrayProtoReader32.bufferStack;
        positionConstraint.getClass();
        positionConstraint.point = 2;
        positionConstraint.setMode(1);
        positionConstraint.lambda = new XYIntUtilsKt$unwrapXIntLambda$1(1, function1);
    }

    public static LoadState check(Location.LargeOrderLimits largeOrderLimits, int i, LocalMoney localMoney, LocalMoney localMoney2) {
        if (largeOrderLimits != null) {
            if (largeOrderLimits instanceof Location.LargeOrderLimits.QuantityOrderLimit) {
                int i2 = ((Location.LargeOrderLimits.QuantityOrderLimit) largeOrderLimits).maxQuantity;
                if (i > i2) {
                    return new OrderLimitChecker$OrderLimitCheckResult$QuantityLimitExceeded(i2);
                }
                if (i == i2) {
                    return new OrderLimitChecker$OrderLimitCheckResult$QuantityLimitReached(i2);
                }
            } else {
                if (!(largeOrderLimits instanceof Location.LargeOrderLimits.SubtotalOrderLimit)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LocalMoney localMoney3 = ((Location.LargeOrderLimits.SubtotalOrderLimit) largeOrderLimits).maxValue;
                if (LocalMoneysKt.compareTo(localMoney, localMoney3) > 0) {
                    return new OrderLimitChecker$OrderLimitCheckResult$ValueLimitExceeded(LocalsKt.prettyPrint$default(localMoney3, false, null, 7));
                }
                if (localMoney.equals(localMoney3)) {
                    return new OrderLimitChecker$OrderLimitCheckResult$ValueLimitReached(LocalsKt.prettyPrint$default(localMoney3, false, null, 7));
                }
            }
        }
        return OrderLimitChecker$OrderLimitCheckResult$NoLimitReached.INSTANCE;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCashOut.deepLinkSpecs;
    }
}
