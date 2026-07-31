package com.appsflyer.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\f\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", "", "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFf1hSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFf1hSDK;)V", "", "getCurrencyIso4217Code", "()J", "", "AFAdRevenueData", "()Z", "Lcom/appsflyer/internal/AFc1oSDK;", "getMonetizationNetwork", "getMediationNetwork", "Lkotlin/Lazy;", "getRevenue", "Lcom/appsflyer/internal/AFf1hSDK;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AFf1jSDK {
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1oSDK getMonetizationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final Lazy getRevenue;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final Lazy AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final AFf1hSDK getCurrencyIso4217Code;

    public AFf1jSDK(AFc1oSDK aFc1oSDK, AFf1hSDK aFf1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFf1hSDK, "");
        this.getMonetizationNetwork = aFc1oSDK;
        this.getCurrencyIso4217Code = aFf1hSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1jSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1jSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
            }

            {
                super(0);
            }
        });
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final long getCurrencyIso4217Code() {
        Object m213constructorimpl;
        String currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFf1jSDK aFf1jSDK = this;
                m213constructorimpl = Result.m213constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m213constructorimpl = Result.m213constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m216exceptionOrNullimpl = Result.m216exceptionOrNullimpl(m213constructorimpl);
            if (m216exceptionOrNullimpl != null) {
                AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + m216exceptionOrNullimpl.getMessage(), m216exceptionOrNullimpl);
                m213constructorimpl = Long.valueOf(getMonetizationNetwork);
            }
            return ((Number) m213constructorimpl).longValue();
        }
        return getMonetizationNetwork;
    }

    public final boolean AFAdRevenueData() {
        AFi1xSDK aFi1xSDK;
        AFi1vSDK aFi1vSDK = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
        if (aFi1vSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        return ((aFi1zSDK == null || (aFi1xSDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1xSDK.AFAdRevenueData()) || System.currentTimeMillis() - this.getCurrencyIso4217Code.getRevenue > TimeUnit.SECONDS.toMillis(this.getCurrencyIso4217Code.getMonetizationNetwork);
    }
}
