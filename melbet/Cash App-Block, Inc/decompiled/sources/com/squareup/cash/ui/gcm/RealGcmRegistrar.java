package com.squareup.cash.ui.gcm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.real.RealDatadogClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.paymentpad.presenters.RealPaymentTabSettings;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.clients.OSLevelPushSettingState;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.RegisterDeviceRequest;
import com.squareup.protos.franklin.app.RegisterDeviceResponse;
import com.squareup.util.android.InstrumentationTestConfig$NotATest;
import com.squareup.util.cash.ProtoDefaults;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import okio.ByteString;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealGcmRegistrar {
    public final AppService appService;
    public final ByteString.Companion firebaseGcm;
    public final StringPreference gcmToken;
    public final CoroutineContext ioDispatcher;
    public StandaloneCoroutine job;
    public final AndroidNotificationManager notificationManager;
    public final KeyValue osPushSettingEnabled;
    public final CoroutineScope scope;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegisterDeviceResponse.Status.values().length];
            try {
                Path.Companion companion = RegisterDeviceResponse.Status.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealGcmRegistrar(StringPreference stringPreference, KeyValue keyValue, AppService appService, AndroidNotificationManager androidNotificationManager, ByteString.Companion companion, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        stringPreference.getClass();
        keyValue.getClass();
        appService.getClass();
        androidNotificationManager.getClass();
        coroutineContext.getClass();
        this.gcmToken = stringPreference;
        this.osPushSettingEnabled = keyValue;
        this.appService = appService;
        this.notificationManager = androidNotificationManager;
        this.firebaseGcm = companion;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r0.set(r2, r3) == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$registerDevice(RealGcmRegistrar realGcmRegistrar, String str, boolean z, ContinuationImpl continuationImpl) {
        RealGcmRegistrar$registerDevice$1 realGcmRegistrar$registerDevice$1;
        int i;
        String str2;
        ApiResult apiResult;
        boolean z2 = z;
        if (continuationImpl instanceof RealGcmRegistrar$registerDevice$1) {
            realGcmRegistrar$registerDevice$1 = (RealGcmRegistrar$registerDevice$1) continuationImpl;
            int i2 = realGcmRegistrar$registerDevice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGcmRegistrar$registerDevice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGcmRegistrar$registerDevice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGcmRegistrar$registerDevice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = realGcmRegistrar.appService;
                    realGcmRegistrar.notificationManager.getClass();
                    RegisterDeviceRequest registerDeviceRequest = new RegisterDeviceRequest(str, null, null, z2 ? OSLevelPushSettingState.OS_PUSH_STATE_ENABLED : OSLevelPushSettingState.OS_PUSH_STATE_DISABLED, null, ByteString.EMPTY);
                    realGcmRegistrar$registerDevice$1.L$0 = str;
                    realGcmRegistrar$registerDevice$1.Z$0 = z2;
                    realGcmRegistrar$registerDevice$1.label = 1;
                    obj = appService.registerDevice(registerDeviceRequest, realGcmRegistrar$registerDevice$1);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d("Success.", new Object[0]);
                    return Unit.INSTANCE;
                }
                z2 = realGcmRegistrar$registerDevice$1.Z$0;
                str2 = realGcmRegistrar$registerDevice$1.L$0;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.d("Error attempting to register for GCM", new Object[0]);
                }
                if (apiResult instanceof ApiResult.Success) {
                    RegisterDeviceResponse.Status status = ((RegisterDeviceResponse) ((ApiResult.Success) apiResult).response).status;
                    if (status == null) {
                        status = ProtoDefaults.REGISTER_DEVICE_STATUS;
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[status.ordinal()] != 1) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                        return null;
                    }
                    realGcmRegistrar.gcmToken.set(str2);
                    KeyValue keyValue = realGcmRegistrar.osPushSettingEnabled;
                    Boolean valueOf = Boolean.valueOf(z2);
                    realGcmRegistrar$registerDevice$1.L$0 = null;
                    realGcmRegistrar$registerDevice$1.Z$0 = z2;
                    realGcmRegistrar$registerDevice$1.label = 2;
                }
                return Unit.INSTANCE;
            }
        }
        realGcmRegistrar$registerDevice$1 = new RealGcmRegistrar$registerDevice$1(realGcmRegistrar, continuationImpl);
        Object obj2 = realGcmRegistrar$registerDevice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGcmRegistrar$registerDevice$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r6.ioDispatcher, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unregister(ContinuationImpl continuationImpl) {
        RealGcmRegistrar$unregister$1 realGcmRegistrar$unregister$1;
        int i;
        if (continuationImpl instanceof RealGcmRegistrar$unregister$1) {
            realGcmRegistrar$unregister$1 = (RealGcmRegistrar$unregister$1) continuationImpl;
            int i2 = realGcmRegistrar$unregister$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGcmRegistrar$unregister$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGcmRegistrar$unregister$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGcmRegistrar$unregister$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StandaloneCoroutine standaloneCoroutine = this.job;
                    if (standaloneCoroutine != null) {
                        realGcmRegistrar$unregister$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.job = null;
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2 = new RealGcmRegistrar$unregister$2(this, continuation, 0);
                realGcmRegistrar$unregister$1.label = 2;
            }
        }
        realGcmRegistrar$unregister$1 = new RealGcmRegistrar$unregister$1(this, continuationImpl);
        Object obj2 = realGcmRegistrar$unregister$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGcmRegistrar$unregister$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        this.job = null;
        RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$22 = new RealGcmRegistrar$unregister$2(this, continuation2, 0);
        realGcmRegistrar$unregister$1.label = 2;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider appService;
        public final Provider gcmToken;
        public final Provider ioDispatcher;
        public final Provider notificationManager;
        public final Provider osPushSettingEnabled;
        public final InstanceFactory scope;

        public MetroFactory(LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3) {
            this.$r8$classId = 5;
            this.gcmToken = lambdaProvider;
            this.scope = instanceFactory;
            this.osPushSettingEnabled = doubleCheck;
            this.appService = lambdaProvider2;
            this.notificationManager = doubleCheck2;
            this.ioDispatcher = lambdaProvider3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.ioDispatcher;
            Provider provider2 = this.notificationManager;
            InstanceFactory instanceFactory = this.scope;
            Provider provider3 = this.appService;
            Provider provider4 = this.osPushSettingEnabled;
            Provider provider5 = this.gcmToken;
            switch (i) {
                case 0:
                    StringPreference stringPreference = (StringPreference) provider5.invoke();
                    KeyValue keyValue = (KeyValue) provider4.invoke();
                    AppService appService = (AppService) provider3.invoke();
                    AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) provider2.invoke();
                    ByteString.Companion companion = new ByteString.Companion();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    stringPreference.getClass();
                    keyValue.getClass();
                    appService.getClass();
                    androidNotificationManager.getClass();
                    coroutineContext.getClass();
                    coroutineScope.getClass();
                    return new RealGcmRegistrar(stringPreference, keyValue, appService, androidNotificationManager, companion, coroutineContext, coroutineScope);
                case 1:
                    SyncValueReader syncValueReader = (SyncValueReader) provider5.invoke();
                    BankingBenefitsAppService bankingBenefitsAppService = (BankingBenefitsAppService) provider4.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider3.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider2.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    syncValueReader.getClass();
                    bankingBenefitsAppService.getClass();
                    androidStringManager.getClass();
                    realFamilyAccountsManager.getClass();
                    coroutineScope2.getClass();
                    coroutineContext2.getClass();
                    return new UnleashContext(syncValueReader, bankingBenefitsAppService, androidStringManager, realFamilyAccountsManager, coroutineScope2, coroutineContext2);
                case 2:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider5.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    RealBitcoinConfigRepo realBitcoinConfigRepo = (RealBitcoinConfigRepo) provider2.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    syncValueReader2.getClass();
                    appConfigManager.getClass();
                    cashAccountDatabaseImpl.getClass();
                    realBitcoinConfigRepo.getClass();
                    coroutineScope3.getClass();
                    coroutineContext3.getClass();
                    return new RealBitcoinRoundUpsRepo(syncValueReader2, appConfigManager, cashAccountDatabaseImpl, realBitcoinConfigRepo, coroutineScope3, coroutineContext3);
                case 3:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider5.invoke();
                    AppService appService2 = (AppService) provider4.invoke();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider2.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) instanceFactory.value;
                    Flow flow = (Flow) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    appService2.getClass();
                    androidClock.getClass();
                    coroutineContext4.getClass();
                    coroutineScope4.getClass();
                    flow.getClass();
                    return new RealCustomerLimitsManager(cashAccountDatabaseImpl2, appService2, androidClock, coroutineContext4, coroutineScope4, flow);
                case 4:
                    CoroutineScope coroutineScope5 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider5.invoke();
                    String str = (String) provider4.invoke();
                    String str2 = (String) provider3.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    coroutineScope5.getClass();
                    coroutineContext5.getClass();
                    str.getClass();
                    str2.getClass();
                    realObservabilityManager.getClass();
                    featureFlagManager.getClass();
                    return new RealFidesmoClient(coroutineScope5, coroutineContext5, str, str2, realObservabilityManager, featureFlagManager);
                case 5:
                    Application application = (Application) provider5.invoke();
                    Activity activity = (Activity) instanceFactory.value;
                    WebViewProvider webViewProvider = (WebViewProvider) provider4.invoke();
                    if (provider3.invoke() != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    Mutex mutex = (Mutex) provider.invoke();
                    application.getClass();
                    activity.getClass();
                    webViewProvider.getClass();
                    featureFlagManager2.getClass();
                    mutex.getClass();
                    return new RealFillrWebManager(application, activity, webViewProvider, featureFlagManager2, mutex);
                case 6:
                    Context context = (Context) instanceFactory.value;
                    String str3 = (String) provider5.invoke();
                    String str4 = (String) provider4.invoke();
                    List list = (List) provider3.invoke();
                    context.getClass();
                    str3.getClass();
                    str4.getClass();
                    list.getClass();
                    Provider provider6 = this.notificationManager;
                    provider6.getClass();
                    Provider provider7 = this.ioDispatcher;
                    provider7.getClass();
                    return new RealDatadogClient("release", context, str3, str4, list, provider6, provider7);
                case 7:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider5.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider4.invoke();
                    RealBleManager realBleManager = (RealBleManager) provider3.invoke();
                    InstrumentationTestConfig$NotATest instrumentationTestConfig$NotATest = (InstrumentationTestConfig$NotATest) provider2.invoke();
                    KeyValue keyValue2 = (KeyValue) provider.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) instanceFactory.value;
                    featureFlagManager3.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realBleManager.getClass();
                    instrumentationTestConfig$NotATest.getClass();
                    keyValue2.getClass();
                    coroutineScope6.getClass();
                    return new RealPaymentTabSettings(featureFlagManager3, realFeatureEligibilityRepository, realBleManager, instrumentationTestConfig$NotATest, keyValue2, coroutineScope6);
                default:
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider5.invoke();
                    RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider = (RealTaxEntryTileUserDataProvider) provider4.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository2 = (RealFeatureEligibilityRepository) provider3.invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider2.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager2 = (RealFamilyAccountsManager) provider.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) instanceFactory.value;
                    featureFlagManager4.getClass();
                    realTaxEntryTileUserDataProvider.getClass();
                    realFeatureEligibilityRepository2.getClass();
                    syncValueReader3.getClass();
                    realFamilyAccountsManager2.getClass();
                    coroutineScope7.getClass();
                    return new RealTaxesAppletTileRepository(featureFlagManager4, realTaxEntryTileUserDataProvider, realFeatureEligibilityRepository2, syncValueReader3, realFamilyAccountsManager2, coroutineScope7);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Provider provider, Provider provider2, InstanceFactory instanceFactory, Provider provider3, int i) {
            this.$r8$classId = i;
            this.gcmToken = doubleCheck;
            this.osPushSettingEnabled = doubleCheck2;
            this.appService = provider;
            this.notificationManager = provider2;
            this.scope = instanceFactory;
            this.ioDispatcher = provider3;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, Provider provider, Provider provider2, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.gcmToken = doubleCheck;
            this.osPushSettingEnabled = doubleCheck2;
            this.appService = doubleCheck3;
            this.notificationManager = provider;
            this.ioDispatcher = provider2;
            this.scope = instanceFactory;
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider, Provider provider2, Provider provider3, Provider provider4, DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.scope = instanceFactory;
            this.gcmToken = provider;
            this.osPushSettingEnabled = provider2;
            this.appService = provider3;
            this.notificationManager = provider4;
            this.ioDispatcher = doubleCheck;
        }
    }
}
