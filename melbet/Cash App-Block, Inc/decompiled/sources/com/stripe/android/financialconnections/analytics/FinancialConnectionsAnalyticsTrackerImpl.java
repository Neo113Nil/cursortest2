package com.stripe.android.financialconnections.analytics;

import android.app.Application;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.utils.PluginDetector;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsAnalyticsTrackerImpl {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final GetOrFetchSync getOrFetchSync;
    public final Locale locale;
    public final DefaultAnalyticsRequestV2Executor requestExecutor;
    public final n requestFactory;

    public FinancialConnectionsAnalyticsTrackerImpl(GetOrFetchSync getOrFetchSync, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, Locale locale, Application application, DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor) {
        this.getOrFetchSync = getOrFetchSync;
        this.configuration = financialConnectionsSheetConfiguration;
        this.locale = locale;
        this.requestExecutor = defaultAnalyticsRequestV2Executor;
        String str = PluginDetector.pluginType;
        str = str == null ? "native" : str;
        n nVar = new n();
        nVar.a = "mobile-clients-linked-accounts";
        nVar.b = "stripe-linked-accounts-android";
        nVar.c = str;
        nVar.d = application.getApplicationContext();
        this.requestFactory = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r14 == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$commonParams(FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, ContinuationImpl continuationImpl) {
        FinancialConnectionsAnalyticsTrackerImpl$commonParams$1 financialConnectionsAnalyticsTrackerImpl$commonParams$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsAnalyticsTrackerImpl$commonParams$1) {
            financialConnectionsAnalyticsTrackerImpl$commonParams$1 = (FinancialConnectionsAnalyticsTrackerImpl$commonParams$1) continuationImpl;
            int i2 = financialConnectionsAnalyticsTrackerImpl$commonParams$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsAnalyticsTrackerImpl$commonParams$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsAnalyticsTrackerImpl$commonParams$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsAnalyticsTrackerImpl$commonParams$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetOrFetchSync getOrFetchSync = financialConnectionsAnalyticsTrackerImpl.getOrFetchSync;
                    financialConnectionsAnalyticsTrackerImpl$commonParams$1.label = 1;
                    obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, financialConnectionsAnalyticsTrackerImpl$commonParams$1, 3);
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = ((SynchronizeSessionResponse) obj).manifest;
                Pair pair = new Pair("las_id", financialConnectionsSessionManifest.id);
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = financialConnectionsAnalyticsTrackerImpl.configuration;
                obj2 = MapsKt__MapsKt.mapOf(pair, new Pair("key", financialConnectionsSheetConfiguration.publishableKey), new Pair("stripe_account", financialConnectionsSheetConfiguration.stripeAccountId), new Pair("navigator_language", financialConnectionsAnalyticsTrackerImpl.locale.toLanguageTag()), new Pair("is_webview", "false"), new Pair("livemode", String.valueOf(financialConnectionsSessionManifest.livemode)), new Pair("product", financialConnectionsSessionManifest.product.getValue()), new Pair("is_stripe_direct", String.valueOf(financialConnectionsSessionManifest.isStripeDirect)), new Pair("single_account", String.valueOf(financialConnectionsSessionManifest.singleAccount)), new Pair("allow_manual_entry", String.valueOf(financialConnectionsSessionManifest.allowManualEntry)), new Pair("app_verification_enabled", String.valueOf(financialConnectionsSessionManifest.appVerificationEnabled)), new Pair("account_holder_id", financialConnectionsSessionManifest.accountholderToken));
                return (Serializable) obj2;
            }
        }
        financialConnectionsAnalyticsTrackerImpl$commonParams$1 = new FinancialConnectionsAnalyticsTrackerImpl$commonParams$1(financialConnectionsAnalyticsTrackerImpl, continuationImpl);
        Object obj3 = financialConnectionsAnalyticsTrackerImpl$commonParams$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsAnalyticsTrackerImpl$commonParams$1.label;
        if (i != 0) {
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = ((SynchronizeSessionResponse) obj3).manifest;
        Pair pair2 = new Pair("las_id", financialConnectionsSessionManifest2.id);
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration2 = financialConnectionsAnalyticsTrackerImpl.configuration;
        obj22 = MapsKt__MapsKt.mapOf(pair2, new Pair("key", financialConnectionsSheetConfiguration2.publishableKey), new Pair("stripe_account", financialConnectionsSheetConfiguration2.stripeAccountId), new Pair("navigator_language", financialConnectionsAnalyticsTrackerImpl.locale.toLanguageTag()), new Pair("is_webview", "false"), new Pair("livemode", String.valueOf(financialConnectionsSessionManifest2.livemode)), new Pair("product", financialConnectionsSessionManifest2.product.getValue()), new Pair("is_stripe_direct", String.valueOf(financialConnectionsSessionManifest2.isStripeDirect)), new Pair("single_account", String.valueOf(financialConnectionsSessionManifest2.singleAccount)), new Pair("allow_manual_entry", String.valueOf(financialConnectionsSessionManifest2.allowManualEntry)), new Pair("app_verification_enabled", String.valueOf(financialConnectionsSessionManifest2.appVerificationEnabled)), new Pair("account_holder_id", financialConnectionsSessionManifest2.accountholderToken));
        return (Serializable) obj22;
    }

    public final void track(FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent) {
        financialConnectionsAnalyticsEvent.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(GlobalScope.INSTANCE, DefaultIoScheduler.INSTANCE, null, new WorkflowLayout$start$1(this, financialConnectionsAnalyticsEvent, null, 25), 2);
    }
}
