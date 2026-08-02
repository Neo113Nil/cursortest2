package com.squareup.cash.work.wages.real;

import android.content.SharedPreferences;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsq;
import com.squareup.cash.agents.applets.presenters.RealAgentsAppletTileRepository;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.backend.transaction.RealCryptoTransactionActionManager;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.invitations.InviteContactsPresenter$includingEmail$$inlined$map$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.persona.backend.RealPersonaDidvInquiryLauncher;
import com.squareup.cash.pools.backend.real.RealPoolActionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.taptopay.backend.real.RealTapToPayActionManager;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyReporter;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository;
import com.squareup.cash.userjourneys.tracker.UserJourneySignalProcessor;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.cash.work.service.api.taxforms.TaxFormsService;
import com.squareup.cash.work.tinygraph.real.RealLoginEssentialsRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.blockuserjourneys.api.v1.BlockUserJourneysService;
import com.squareup.util.android.SimpleActivityForResultLauncher;
import com.squareup.util.logging.NoOpRetrofitLogger;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.Call;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealWagesTaxDocumentManager {
    public Map cachedFormsByToken;
    public final String endpoint;
    public final MutexImpl formsCacheMutex = new MutexImpl();
    public final RealLoginEssentialsRepository loginEssentialsRepository;
    public final RealMerchantRepository merchantRepository;
    public final TaxFormsService taxFormsService;

    public RealWagesTaxDocumentManager(RealLoginEssentialsRepository realLoginEssentialsRepository, RealMerchantRepository realMerchantRepository, TaxFormsService taxFormsService, String str) {
        this.loginEssentialsRepository = realLoginEssentialsRepository;
        this.merchantRepository = realMerchantRepository;
        this.taxFormsService = taxFormsService;
        this.endpoint = str;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.cachedFormsByToken = emptyMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r5.fetchEssentials(r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$ensureMerchantRepositoryInitialized(RealWagesTaxDocumentManager realWagesTaxDocumentManager, ContinuationImpl continuationImpl) {
        RealWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1 realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1) {
            realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1 = (RealWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1) continuationImpl;
            int i2 = realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest all = realWagesTaxDocumentManager.merchantRepository.getAll();
                    realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.label = 1;
                    obj = FlowKt.first(all, realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1);
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
                if (((Collection) obj).isEmpty()) {
                    return Unit.INSTANCE;
                }
                RealLoginEssentialsRepository realLoginEssentialsRepository = realWagesTaxDocumentManager.loginEssentialsRepository;
                realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.label = 2;
            }
        }
        realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1 = new RealWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1(realWagesTaxDocumentManager, continuationImpl);
        obj = realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realWagesTaxDocumentManager$ensureMerchantRepositoryInitialized$1.label;
        if (i != 0) {
        }
        if (((Collection) obj).isEmpty()) {
        }
    }

    public final ChannelFlowTransformLatest getWagesDocumentsByEmployer() {
        return FlowKt.mapLatest(new CardSchemePresenter$models$3$1(this, null), FlowKt.distinctUntilChanged(new InviteContactsPresenter$includingEmail$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new ExoPlayerVideoView.AnonymousClass2(this, null, 19), this.merchantRepository.getAll()), 4)));
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider endpoint;
        public final Provider loginEssentialsRepository;
        public final Provider merchantRepository;
        public final DoubleCheck taxFormsService;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4) {
            this.$r8$classId = 3;
            this.loginEssentialsRepository = doubleCheck;
            this.taxFormsService = doubleCheck2;
            this.merchantRepository = doubleCheck3;
            this.endpoint = doubleCheck4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.endpoint;
            Provider provider2 = this.merchantRepository;
            Provider provider3 = this.loginEssentialsRepository;
            DoubleCheck doubleCheck = this.taxFormsService;
            switch (i) {
                case 0:
                    RealLoginEssentialsRepository realLoginEssentialsRepository = (RealLoginEssentialsRepository) provider3.invoke();
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider2.invoke();
                    TaxFormsService taxFormsService = (TaxFormsService) doubleCheck.getValue();
                    String str = (String) provider.invoke();
                    realLoginEssentialsRepository.getClass();
                    realMerchantRepository.getClass();
                    taxFormsService.getClass();
                    str.getClass();
                    return new RealWagesTaxDocumentManager(realLoginEssentialsRepository, realMerchantRepository, taxFormsService, str);
                case 1:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider3.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider2.invoke();
                    RealAgentsRepository realAgentsRepository = (RealAgentsRepository) doubleCheck.getValue();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    featureFlagManager.getClass();
                    realFamilyAccountsManager.getClass();
                    realAgentsRepository.getClass();
                    androidStringManager.getClass();
                    return new RealAgentsAppletTileRepository(featureFlagManager, realFamilyAccountsManager, realAgentsRepository, androidStringManager);
                case 2:
                    SessionManager sessionManager = (SessionManager) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sessionManager.getClass();
                    errorReporter.getClass();
                    sharedPreferences.getClass();
                    return new RealClientSyncEntityDecryptor(new RealBrazeManager$$ExternalSyntheticLambda0(doubleCheck, 22), new RoomDatabase$closeBarrier$1(0, sessionManager, PlatformKt.class, "appTokenOrNull", "appTokenOrNull(Lcom/squareup/cash/session/backend/SessionManager;)Ljava/lang/String;", 1, 4), errorReporter, sharedPreferences);
                case 3:
                    PaymentManager paymentManager = (PaymentManager) provider3.invoke();
                    RealCryptoTransactionActionManager realCryptoTransactionActionManager = (RealCryptoTransactionActionManager) doubleCheck.getValue();
                    RealPoolActionManager realPoolActionManager = (RealPoolActionManager) provider2.invoke();
                    RealTapToPayActionManager realTapToPayActionManager = (RealTapToPayActionManager) provider.invoke();
                    paymentManager.getClass();
                    realCryptoTransactionActionManager.getClass();
                    realPoolActionManager.getClass();
                    realTapToPayActionManager.getClass();
                    return new RealMainPaymentPadRefresher(paymentManager, realCryptoTransactionActionManager, realPoolActionManager, realTapToPayActionManager);
                case 4:
                    SimpleActivityForResultLauncher simpleActivityForResultLauncher = (SimpleActivityForResultLauncher) doubleCheck.getValue();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider3.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                    String str2 = (String) provider.invoke();
                    simpleActivityForResultLauncher.getClass();
                    realObservabilityManager.getClass();
                    sessionManager2.getClass();
                    str2.getClass();
                    return new RealPersonaDidvInquiryLauncher(simpleActivityForResultLauncher, realObservabilityManager, sessionManager2, str2);
                case 5:
                    BlockUserJourneysService blockUserJourneysService = (BlockUserJourneysService) doubleCheck.getValue();
                    NoOpUserJourneyNotifier noOpUserJourneyNotifier = (NoOpUserJourneyNotifier) provider3.invoke();
                    RealUserJourneyRepository realUserJourneyRepository = (RealUserJourneyRepository) provider2.invoke();
                    UserJourneySignalProcessor userJourneySignalProcessor = (UserJourneySignalProcessor) provider.invoke();
                    blockUserJourneysService.getClass();
                    noOpUserJourneyNotifier.getClass();
                    realUserJourneyRepository.getClass();
                    userJourneySignalProcessor.getClass();
                    return new RealUserJourneyReporter(blockUserJourneysService, noOpUserJourneyNotifier, realUserJourneyRepository, userJourneySignalProcessor);
                case 6:
                    Call.Factory factory = (Call.Factory) doubleCheck.getValue();
                    String str3 = (String) provider3.invoke();
                    NoOpRetrofitLogger noOpRetrofitLogger = (NoOpRetrofitLogger) provider2.invoke();
                    Moshi moshi = (Moshi) provider.invoke();
                    factory.getClass();
                    str3.getClass();
                    noOpRetrofitLogger.getClass();
                    moshi.getClass();
                    return zzsq.provideCashProxyRetrofit(factory, str3, noOpRetrofitLogger, moshi);
                default:
                    Call.Factory factory2 = (Call.Factory) doubleCheck.getValue();
                    String str4 = (String) provider3.invoke();
                    NoOpRetrofitLogger noOpRetrofitLogger2 = (NoOpRetrofitLogger) provider2.invoke();
                    Moshi moshi2 = (Moshi) provider.invoke();
                    factory2.getClass();
                    str4.getClass();
                    noOpRetrofitLogger2.getClass();
                    moshi2.getClass();
                    return zzsq.provideRegisterRetrofit(factory2, str4, noOpRetrofitLogger2, moshi2);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Provider provider, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, int i) {
            this.$r8$classId = i;
            this.loginEssentialsRepository = doubleCheck;
            this.merchantRepository = provider;
            this.taxFormsService = doubleCheck2;
            this.endpoint = lambdaProvider;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.taxFormsService = doubleCheck;
            this.loginEssentialsRepository = provider;
            this.merchantRepository = provider2;
            this.endpoint = provider3;
        }
    }
}
