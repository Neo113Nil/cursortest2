package com.squareup.util.android;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.camera.video.Recorder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.RealImageLoader;
import com.google.mlkit.vision.face.internal.zzm;
import com.squareup.cash.R;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdDownloader;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdStore;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$IntentUrlDecoding;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsContext;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsAuthenticationManager;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationService;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.util.task.RepeatTaskExecutor;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.net.URLDecoder;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealIntentFactory {
    public final List cashDomainHosts;
    public final Context context;
    public final FeatureFlagManager featureFlagManager;
    public final RealPendingIntentFactory pendingIntentFactory;
    public final RealUrlAuthenticator urlAuthenticator;

    /* loaded from: classes6.dex */
    public final class AuthenticatedUrls {
        public final String decodedUrl;
        public final String rawUrl;
        public final boolean urlsDiffer;

        public AuthenticatedUrls(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.decodedUrl = str;
            this.rawUrl = str2;
            this.urlsDiffer = Intrinsics.areEqual(str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthenticatedUrls)) {
                return false;
            }
            AuthenticatedUrls authenticatedUrls = (AuthenticatedUrls) obj;
            return Intrinsics.areEqual(this.decodedUrl, authenticatedUrls.decodedUrl) && Intrinsics.areEqual(this.rawUrl, authenticatedUrls.rawUrl);
        }

        public final String getDecodedUrl() {
            return this.decodedUrl;
        }

        public final String getRawUrl() {
            return this.rawUrl;
        }

        public final boolean getUrlsDiffer() {
            return this.urlsDiffer;
        }

        public final int hashCode() {
            return this.rawUrl.hashCode() + (this.decodedUrl.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("AuthenticatedUrls(decodedUrl=", this.decodedUrl, ", rawUrl=", this.rawUrl, ")");
        }
    }

    public RealIntentFactory(RealUrlAuthenticator realUrlAuthenticator, Context context, FeatureFlagManager featureFlagManager, RealPendingIntentFactory realPendingIntentFactory, List list) {
        this.urlAuthenticator = realUrlAuthenticator;
        this.context = context;
        this.featureFlagManager = featureFlagManager;
        this.pendingIntentFactory = realPendingIntentFactory;
        this.cashDomainHosts = list;
    }

    public static /* synthetic */ Intent createTextIntent$default(RealIntentFactory realIntentFactory, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return realIntentFactory.createTextIntent(str, str2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AuthenticatedUrls authenticatedUrls(String str) {
        String query;
        Uri parse = Uri.parse(str);
        String decode = URLDecoder.decode(str, "utf-8");
        List list = this.cashDomainHosts;
        decode.getClass();
        boolean contains = CollectionsKt.contains(list, Uri.parse(decode).getHost());
        if (!CollectionsKt.contains(list, parse.getHost()) || !contains || (!kotlin.text.StringsKt.contains((CharSequence) decode, (CharSequence) "{{token}}", false) && ((query = parse.getQuery()) == null || !kotlin.text.StringsKt.contains((CharSequence) query, (CharSequence) "{{token}}", false)))) {
            return new AuthenticatedUrls(decode, str);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String str2 = null;
        String str3 = (String) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new WorkerWorkflow$render$1((Object) this, (Object) decode, (Object) ref$ObjectRef, (Continuation) (0 == true ? 1 : 0), 15));
        Uri.Builder buildUpon = parse.buildUpon();
        String query2 = parse.getQuery();
        if (query2 != null) {
            Object obj = ref$ObjectRef.element;
            if (obj == null) {
                Intrinsics.throwUninitializedPropertyAccessException("token");
                throw null;
            }
            str2 = StringsKt__StringsJVMKt.replace$default(query2, "{{token}}", (String) obj);
        }
        String uri = buildUpon.encodedQuery(str2).build().toString();
        uri.getClass();
        return new AuthenticatedUrls(str3, uri);
    }

    public final Intent createTextIntent(String str, String str2, String str3) {
        str.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.TITLE", str2);
        }
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        String upperCase = str4.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (!upperCase.equals("SAMSUNG") && str3 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str3);
        }
        Context context = this.pendingIntentFactory.context;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, new Intent(context, (Class<?>) ShareResultReceiver.class), 167772160);
        broadcast.getClass();
        Intent createChooser = Intent.createChooser(intent, str2, broadcast.getIntentSender());
        createChooser.getClass();
        return createChooser;
    }

    public final Intent createUrlIntent(String str) {
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        AuthenticatedUrls authenticatedUrls = authenticatedUrls(str);
        intent.setData(Uri.parse(authenticatedUrls.getDecodedUrl()));
        intent.setFlags(268435456);
        intent.putExtra("rawUrl", authenticatedUrls.getRawUrl());
        return intent;
    }

    public final boolean maybeStartUrlIntent(String str, Activity activity, boolean z) {
        str.getClass();
        activity.getClass();
        zzm zzmVar = new zzm();
        zzmVar.setColorScheme();
        zzmVar.setShareState(1);
        Recorder.AnonymousClass1 build = zzmVar.build();
        ((Intent) build.val$videoEncoderSession).setFlags(67108864);
        AuthenticatedUrls authenticatedUrls = authenticatedUrls(str);
        Uri parse = Uri.parse(z ? authenticatedUrls.getDecodedUrl() : authenticatedUrls.getRawUrl());
        String str2 = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$IntentUrlDecoding.INSTANCE)).value;
        if ((Intrinsics.areEqual(str2, "LegacyWithValidation") || Intrinsics.areEqual(str2, "ModernWithValidation")) && authenticatedUrls.getUrlsDiffer()) {
            Timber.Forest.e(new RuntimeException("Url decoding differs raw url: " + authenticatedUrls));
        }
        try {
            build.launchUrl(activity, parse);
            return true;
        } catch (ActivityNotFoundException unused) {
            ToastKt.toast(activity, R.string.no_intent_handler, 1);
            return false;
        }
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider cashDomainHosts;
        public final Provider context;
        public final Provider featureFlagManager;
        public final DoubleCheck pendingIntentFactory;
        public final Provider urlAuthenticator;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RepeatTaskExecutor.MetroFactory metroFactory, LambdaProvider lambdaProvider) {
            this.$r8$classId = 6;
            this.urlAuthenticator = doubleCheck;
            this.context = doubleCheck2;
            this.pendingIntentFactory = doubleCheck3;
            this.featureFlagManager = metroFactory;
            this.cashDomainHosts = lambdaProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.cashDomainHosts;
            Provider provider2 = this.featureFlagManager;
            Provider provider3 = this.context;
            DoubleCheck doubleCheck = this.pendingIntentFactory;
            Provider provider4 = this.urlAuthenticator;
            switch (i) {
                case 0:
                    RealUrlAuthenticator realUrlAuthenticator = (RealUrlAuthenticator) provider4.invoke();
                    Context context = (Context) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    RealPendingIntentFactory realPendingIntentFactory = (RealPendingIntentFactory) doubleCheck.getValue();
                    List list = (List) provider.invoke();
                    realUrlAuthenticator.getClass();
                    context.getClass();
                    featureFlagManager.getClass();
                    realPendingIntentFactory.getClass();
                    list.getClass();
                    return new RealIntentFactory(realUrlAuthenticator, context, featureFlagManager, realPendingIntentFactory, list);
                case 1:
                    Context context2 = (Context) provider4.invoke();
                    RealFullscreenAdDownloader realFullscreenAdDownloader = (RealFullscreenAdDownloader) doubleCheck.getValue();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    context2.getClass();
                    realFullscreenAdDownloader.getClass();
                    cashAccountDatabaseImpl.getClass();
                    realImageLoader.getClass();
                    coroutineContext.getClass();
                    return new RealFullscreenAdStore(context2, realFullscreenAdDownloader, cashAccountDatabaseImpl, realImageLoader, coroutineContext);
                case 2:
                    Analytics analytics = (Analytics) provider4.invoke();
                    RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext = (RealGlobalSearchAnalyticsContext) doubleCheck.getValue();
                    SharedPreferences sharedPreferences = (SharedPreferences) provider3.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    analytics.getClass();
                    realGlobalSearchAnalyticsContext.getClass();
                    sharedPreferences.getClass();
                    realUuidGenerator.getClass();
                    coroutineContext2.getClass();
                    return new RealGlobalSearchAnalyticsHelper(analytics, realGlobalSearchAnalyticsContext, sharedPreferences, realUuidGenerator, coroutineContext2);
                case 3:
                    RealMoneyAnalyticsContext realMoneyAnalyticsContext = (RealMoneyAnalyticsContext) doubleCheck.getValue();
                    Analytics analytics2 = (Analytics) provider4.invoke();
                    RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) provider3.invoke();
                    Moshi moshi = (Moshi) provider2.invoke();
                    RealBalancePrivacy realBalancePrivacy = (RealBalancePrivacy) provider.invoke();
                    realMoneyAnalyticsContext.getClass();
                    analytics2.getClass();
                    realUuidGenerator2.getClass();
                    moshi.getClass();
                    realBalancePrivacy.getClass();
                    return new RealMoneyAnalyticsService(realMoneyAnalyticsContext, analytics2, realUuidGenerator2, moshi, realBalancePrivacy);
                case 4:
                    CashSuggestClientService cashSuggestClientService = (CashSuggestClientService) doubleCheck.getValue();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider4.invoke();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    RealNetworkInfo realNetworkInfo = (RealNetworkInfo) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    cashSuggestClientService.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    androidClock.getClass();
                    realNetworkInfo.getClass();
                    coroutineContext3.getClass();
                    return new RealOffersTabRepository(cashSuggestClientService, cashAccountDatabaseImpl2, androidClock, realNetworkInfo, coroutineContext3);
                case 5:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider4.invoke();
                    Moshi moshi2 = (Moshi) doubleCheck.getValue();
                    RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    Analytics analytics3 = (Analytics) provider.invoke();
                    sharedPreferences2.getClass();
                    moshi2.getClass();
                    realOnboardingFlowTokenManager.getClass();
                    errorReporter.getClass();
                    analytics3.getClass();
                    return new RealSessionManager(sharedPreferences2, moshi2, realOnboardingFlowTokenManager, errorReporter, analytics3);
                case 6:
                    Analytics analytics4 = (Analytics) provider4.invoke();
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider3.invoke();
                    RealTapToPaySessionManager realTapToPaySessionManager = (RealTapToPaySessionManager) doubleCheck.getValue();
                    RealTapToPayEligibilityProvider realTapToPayEligibilityProvider = (RealTapToPayEligibilityProvider) provider2.invoke();
                    RealUuidGenerator realUuidGenerator3 = (RealUuidGenerator) provider.invoke();
                    analytics4.getClass();
                    sharedPreferences3.getClass();
                    realTapToPaySessionManager.getClass();
                    realTapToPayEligibilityProvider.getClass();
                    realUuidGenerator3.getClass();
                    return new RealTapToPayAnalyticsHelper(analytics4, sharedPreferences3, realTapToPaySessionManager, realTapToPayEligibilityProvider, realUuidGenerator3);
                default:
                    RealThreeDsService realThreeDsService = (RealThreeDsService) provider4.invoke();
                    ThreeDsAuthenticationService threeDsAuthenticationService = (ThreeDsAuthenticationService) doubleCheck.getValue();
                    AndroidClock androidClock2 = (AndroidClock) provider3.invoke();
                    Analytics analytics5 = (Analytics) provider2.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider.invoke();
                    realThreeDsService.getClass();
                    threeDsAuthenticationService.getClass();
                    androidClock2.getClass();
                    analytics5.getClass();
                    coroutineContext4.getClass();
                    return new RealThreeDsAuthenticationManager(realThreeDsService, threeDsAuthenticationService, androidClock2, analytics5, coroutineContext4);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.urlAuthenticator = doubleCheck;
            this.pendingIntentFactory = doubleCheck2;
            this.context = provider;
            this.featureFlagManager = provider2;
            this.cashDomainHosts = provider3;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.pendingIntentFactory = doubleCheck;
            this.urlAuthenticator = doubleCheck2;
            this.context = lambdaProvider;
            this.featureFlagManager = provider;
            this.cashDomainHosts = provider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5) {
            this.$r8$classId = 0;
            this.urlAuthenticator = doubleCheck;
            this.context = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
            this.pendingIntentFactory = doubleCheck4;
            this.cashDomainHosts = doubleCheck5;
        }
    }
}
