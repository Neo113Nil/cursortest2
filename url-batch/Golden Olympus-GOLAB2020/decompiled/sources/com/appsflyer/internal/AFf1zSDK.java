package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1tSDK;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.ironsource.da;
import com.ironsource.ge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFf1zSDK extends AFe1sSDK<Unit> {
    public AFe1tSDK areAllFieldsValid;
    public Executor component1;
    public AFc1iSDK component2;
    public AFc1pSDK component3;
    public AFg1qSDK component4;
    public Function1<AFe1rSDK, Unit> copydefault;
    public AFf1gSDK equals;

    public static final class AFa1vSDK implements OutcomeReceiver {
        private /* synthetic */ CountDownLatch AFAdRevenueData;
        private /* synthetic */ kotlin.jvm.internal.G getCurrencyIso4217Code;
        private /* synthetic */ AFf1zSDK getMonetizationNetwork;

        AFa1vSDK(kotlin.jvm.internal.G g4, CountDownLatch countDownLatch, AFf1zSDK aFf1zSDK) {
            this.getCurrencyIso4217Code = g4;
            this.AFAdRevenueData = countDownLatch;
            this.getMonetizationNetwork = aFf1zSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1zSDK.getMediationNetwork(exc);
            this.AFAdRevenueData.countDown();
        }

        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.f41132b = AFe1rSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.AFAdRevenueData.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1zSDK(AFe1tSDK aFe1tSDK, Executor executor, AFc1pSDK aFc1pSDK, AFc1iSDK aFc1iSDK, AFg1qSDK aFg1qSDK, AFf1gSDK aFf1gSDK, Function1<? super AFe1rSDK, Unit> function1) {
        super(AFe1mSDK.REGISTER_TRIGGER, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1tSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.areAllFieldsValid = aFe1tSDK;
        this.component1 = executor;
        this.component3 = aFc1pSDK;
        this.component2 = aFc1iSDK;
        this.component4 = aFg1qSDK;
        this.equals = aFf1gSDK;
        this.copydefault = function1;
        if (aFe1tSDK instanceof AFe1tSDK.AFa1tSDK) {
            this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
        }
        if (this.areAllFieldsValid instanceof AFe1tSDK.AFa1uSDK) {
            this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
        }
        if (this.areAllFieldsValid instanceof AFe1tSDK.AFa1vSDK) {
            this.AFAdRevenueData.add(AFe1mSDK.INAPP);
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        MeasurementManager a4;
        kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        g4.f41132b = AFe1rSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component2.getMonetizationNetwork;
            if (context != null && (a4 = androidx.privacysandbox.ads.adservices.measurement.f.a(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.e.a()))) != null) {
                new AFj1fSDK(this.component3, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1fSDK.getCurrencyIso4217Code()).buildUpon();
                String AFAdRevenueData = this.component3.AFAdRevenueData();
                if (AFAdRevenueData == null) {
                    AFAdRevenueData = "";
                }
                Pair pair = TuplesKt.to("event_name", this.areAllFieldsValid.getMediationNetwork);
                Pair pair2 = TuplesKt.to("app_id", this.component3.getRevenue.getMonetizationNetwork.getPackageName());
                Context context2 = this.component3.getRevenue.getMonetizationNetwork;
                Map mutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("app_version", AFj1iSDK.getMediationNetwork(context2, context2.getPackageName())), TuplesKt.to(HianalyticsBaseData.SDK_VERSION, AFc1pSDK.getMonetizationNetwork()), TuplesKt.to("api_version", AFc1pSDK.getMediationNetwork()), TuplesKt.to(da.a.f15878d, String.valueOf(this.component4.AFAdRevenueData())), TuplesKt.to(CommonUrlParts.REQUEST_ID, AFc1pSDK.getRevenue()), TuplesKt.to(ge.f16424S0, AFAdRevenueData));
                String revenue = AFb1iSDK.getRevenue(this.component3.getMonetizationNetwork);
                if (revenue != null) {
                    mutableMapOf.put("appsflyer_id", revenue);
                }
                Long currencyIso4217Code = this.component4.getCurrencyIso4217Code();
                if (currencyIso4217Code != null) {
                    mutableMapOf.put("install_time", String.valueOf(currencyIso4217Code.longValue()));
                }
                AFe1tSDK aFe1tSDK = this.areAllFieldsValid;
                if (aFe1tSDK instanceof AFe1tSDK.AFa1vSDK) {
                    Float f4 = ((AFe1tSDK.AFa1vSDK) aFe1tSDK).getRevenue;
                    if (f4 != null) {
                        mutableMapOf.put("event_revenue", String.valueOf(f4.floatValue()));
                    }
                    Integer num = ((AFe1tSDK.AFa1vSDK) this.areAllFieldsValid).getCurrencyIso4217Code;
                    if (num != null) {
                        mutableMapOf.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : mutableMapOf.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                a4.registerTrigger(build, this.component1, androidx.core.os.l.a(new AFa1vSDK(g4, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            g4.f41132b = AFe1rSDK.TIMEOUT;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return (AFe1rSDK) g4.f41132b;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFe1rSDK aFe1rSDK = this.getMediationNetwork;
        if (aFe1rSDK != null) {
            this.copydefault.invoke(aFe1rSDK);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }
}
