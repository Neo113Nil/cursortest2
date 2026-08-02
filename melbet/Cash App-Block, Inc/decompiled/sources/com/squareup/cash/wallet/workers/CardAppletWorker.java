package com.squareup.cash.wallet.workers;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.wallet.presenters.LiteCashAppTagSyncTopicProvider;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class CardAppletWorker implements IoActivitySetupTeardown {
    public final SyncTopic cardTopic;
    public final LiteCashAppTagSyncTopicProvider cashAppTagSyncTopicProvider;
    public final RealClientSyncer clientSyncer;
    public final RealCardCustomizationRepository customizationRepository;
    public final PostcardClientService postcardService;
    public final SessionManager sessionManager;
    public final SyncValueReader syncValueReader;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider cardTopic;
        public final Provider cashAppTagSyncTopicProvider;
        public final Provider clientSyncer;
        public final Provider customizationRepository;
        public final Provider postcardService;
        public final Provider sessionManager;
        public final Provider syncValueReader;

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Factory factory2, int i) {
            this.$r8$classId = i;
            this.clientSyncer = factory;
            this.customizationRepository = provider;
            this.syncValueReader = provider2;
            this.postcardService = provider3;
            this.sessionManager = provider4;
            this.cardTopic = provider5;
            this.cashAppTagSyncTopicProvider = factory2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.cashAppTagSyncTopicProvider;
            Provider provider2 = this.cardTopic;
            Provider provider3 = this.sessionManager;
            Provider provider4 = this.postcardService;
            Provider provider5 = this.syncValueReader;
            Provider provider6 = this.customizationRepository;
            Provider provider7 = this.clientSyncer;
            switch (i) {
                case 0:
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider7.invoke();
                    RealCardCustomizationRepository realCardCustomizationRepository = (RealCardCustomizationRepository) provider6.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider5.invoke();
                    PostcardClientService postcardClientService = (PostcardClientService) provider4.invoke();
                    SessionManager sessionManager = (SessionManager) provider3.invoke();
                    SyncTopic syncTopic = (SyncTopic) provider2.invoke();
                    LiteCashAppTagSyncTopicProvider liteCashAppTagSyncTopicProvider = (LiteCashAppTagSyncTopicProvider) provider.invoke();
                    realClientSyncer.getClass();
                    realCardCustomizationRepository.getClass();
                    syncValueReader.getClass();
                    postcardClientService.getClass();
                    sessionManager.getClass();
                    syncTopic.getClass();
                    liteCashAppTagSyncTopicProvider.getClass();
                    return new CardAppletWorker(realClientSyncer, realCardCustomizationRepository, syncValueReader, postcardClientService, sessionManager, syncTopic, liteCashAppTagSyncTopicProvider);
                case 1:
                    RealProfileManager realProfileManager = (RealProfileManager) provider7.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider6.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) provider5.invoke();
                    Analytics analytics = (Analytics) provider4.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider3.invoke();
                    AppService appService = (AppService) provider2.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider.invoke();
                    realProfileManager.getClass();
                    flowStarter.getClass();
                    blockerFlowListener.getClass();
                    analytics.getClass();
                    androidStringManager.getClass();
                    appService.getClass();
                    blockersDataNavigator.getClass();
                    return new RealClientScenarioCompleter(realProfileManager, flowStarter, blockerFlowListener, analytics, androidStringManager, appService, blockersDataNavigator);
                default:
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider7.invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider6.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider5.invoke();
                    RealStatusAndLimitsManager realStatusAndLimitsManager = (RealStatusAndLimitsManager) provider4.invoke();
                    RealInstrumentSelectorManager realInstrumentSelectorManager = (RealInstrumentSelectorManager) provider3.invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) provider2.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider.invoke();
                    realBalanceSnapshotManager.getClass();
                    realInstrumentManager.getClass();
                    appConfigManager.getClass();
                    realStatusAndLimitsManager.getClass();
                    realInstrumentSelectorManager.getClass();
                    realProfileManager2.getClass();
                    realFamilyAccountsManager.getClass();
                    return new RealInstrumentRowLoader(realBalanceSnapshotManager, realInstrumentManager, appConfigManager, realStatusAndLimitsManager, realInstrumentSelectorManager, realProfileManager2, realFamilyAccountsManager);
            }
        }
    }

    public CardAppletWorker(RealClientSyncer realClientSyncer, RealCardCustomizationRepository realCardCustomizationRepository, SyncValueReader syncValueReader, PostcardClientService postcardClientService, SessionManager sessionManager, SyncTopic syncTopic, LiteCashAppTagSyncTopicProvider liteCashAppTagSyncTopicProvider) {
        this.clientSyncer = realClientSyncer;
        this.customizationRepository = realCardCustomizationRepository;
        this.syncValueReader = syncValueReader;
        this.postcardService = postcardClientService;
        this.sessionManager = sessionManager;
        this.cardTopic = syncTopic;
        this.cashAppTagSyncTopicProvider = liteCashAppTagSyncTopicProvider;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 17), 1);
        return StateFlowKt.noOpTeardown;
    }
}
