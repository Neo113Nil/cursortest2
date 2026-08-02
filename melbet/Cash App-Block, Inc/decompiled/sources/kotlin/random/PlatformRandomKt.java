package kotlin.random;

import app.cash.api.ApiResult;
import com.google.common.util.concurrent.AbstractFutureState;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.growtools.GrowToolsToggleError;
import com.squareup.cash.cdf.growtools.GrowToolsToggleSuccess;
import com.squareup.cash.cdf.growtools.InvestmentType;
import com.squareup.cash.cdf.growtools.Origin;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class PlatformRandomKt {
    public static final double doubleFromParts(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }

    public static final Origin toCdfType(GrowToolsManagerScreen.Origin origin) {
        int ordinal = origin.ordinal();
        if (ordinal == 0) {
            return Origin.BITCOIN;
        }
        if (ordinal == 1) {
            return Origin.CARD;
        }
        if (ordinal == 2) {
            return Origin.SAVINGS;
        }
        if (ordinal == 3) {
            return Origin.STOCKS;
        }
        if (ordinal == 4) {
            return Origin.UNSPECIFIED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void trackToggleUpdate(Analytics analytics, ApiResult apiResult, GrowToolsManagerScreen.Origin origin, GrowToolsManagerScreen.InvestmentType investmentType) {
        Event growToolsToggleSuccess;
        apiResult.getClass();
        origin.getClass();
        Origin cdfType = toCdfType(origin);
        InvestmentType cdfType2 = toCdfType(investmentType);
        if (apiResult instanceof ApiResult.Failure) {
            growToolsToggleSuccess = new GrowToolsToggleError(cdfType, cdfType2);
        } else {
            if (!(apiResult instanceof ApiResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            growToolsToggleSuccess = new GrowToolsToggleSuccess(cdfType, cdfType2);
        }
        analytics.track(growToolsToggleSuccess, null);
    }

    public static Throwable tryInternalFastPathGetFailure(AbstractFutureState abstractFutureState) {
        return abstractFutureState.tryInternalFastPathGetFailure();
    }

    public static final InvestmentType toCdfType(GrowToolsManagerScreen.InvestmentType investmentType) {
        int ordinal = investmentType.ordinal();
        if (ordinal == 0) {
            return InvestmentType.ROUND_UPS;
        }
        if (ordinal == 1) {
            return InvestmentType.AUTO_INVEST;
        }
        if (ordinal == 2) {
            return InvestmentType.DIRECT_DEPOSIT;
        }
        if (ordinal == 3) {
            return InvestmentType.P2P_PAYMENT;
        }
        if (ordinal == 4) {
            return InvestmentType.AUTO_WITHDRAW;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
