package com.squareup.cash.work.data.api;

import android.app.Application;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public abstract class PayDataKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowRepay.deepLinkSpecs;
    }

    public static boolean provideGmsWalletApiEnabled(Application application) {
        return application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData.getBoolean("com.google.android.gms.wallet.api.enabled");
    }

    public static final Money totalAmount(GetShiftsOverviewResponse getShiftsOverviewResponse) {
        Long l;
        Long l2;
        Long l3;
        CurrencyCode currencyCode;
        getShiftsOverviewResponse.getClass();
        Money money = getShiftsOverviewResponse.total_estimated_pay;
        Money money2 = getShiftsOverviewResponse.total_commissions;
        Money money3 = getShiftsOverviewResponse.total_tips;
        if (money == null || (l = money.amount) == null) {
            return null;
        }
        long longValue = l.longValue();
        if (money3 == null || (l2 = money3.amount) == null) {
            return null;
        }
        long longValue2 = l2.longValue();
        if (money2 == null || (l3 = money2.amount) == null) {
            return null;
        }
        long longValue3 = l3.longValue();
        if ((money == null || (currencyCode = money.currency_code) == null) && (currencyCode = money3.currency_code) == null && (currencyCode = money2.currency_code) == null) {
            return null;
        }
        return new Money(Long.valueOf(longValue + longValue2 + longValue3), currencyCode, 4);
    }
}
