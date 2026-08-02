package com.squareup.cash.support.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.glance.layout.ColumnKt;
import androidx.glance.session.GlobalSnapshotManagerKt;
import androidx.glance.session.TimerScopeKt;
import androidx.media3.extractor.text.ttml.TtmlRenderUtil;
import androidx.media3.extractor.ts.TsUtil;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewContactOptions;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportAutomationConnectedSupportHome;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportPhonePollInterval;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputesHistoryResult;
import com.squareup.cash.support.backend.api.SearchPlaceholder;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$AllArticlesResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.support.backend.real.RealSearchPlaceholderProvider;
import com.squareup.cash.support.backend.real.RealSupportHomeService;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.backend.real.RealSupportStatus;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Recorded;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Sending;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportHomeDisputes;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.moshi.Moshi;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class SupportHomePresenter implements MoleculePresenter {
    public final Lazy activityContext$delegate;
    public final Lazy activityEmbeddedPresenter$delegate;
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final Analytics analytics;
    public final SupportScreens.FlowScreens.SupportHomeScreen args;
    public final boolean connectedSupportHomeEnabled;
    public final RealConversationService conversationService;
    public final RealDisputesTrackerService disputesTrackerService;
    public final RealIncidentsService incidentsService;
    public final RealSupportLinkNavigator linkNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final long pollingInterval;
    public final RealRouter router;
    public final SearchPlaceholder searchPlaceholder;
    public final Lazy showProminentContactSupportButton$delegate;
    public final Lazy stringListAdapter$delegate;
    public final AndroidStringManager stringManager;
    public final SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenterFactory;
    public final RealSupportHomeService supportHomeService;
    public final RealSupportPhoneService supportPhoneService;
    public final RealSupportStatus supportStatus;
    public final String viewToken;

    public final class MessagePreview {
        public final boolean isUnread;
        public final Message message;

        public MessagePreview(Message message, boolean z) {
            this.message = message;
            this.isUnread = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagePreview)) {
                return false;
            }
            MessagePreview messagePreview = (MessagePreview) obj;
            return this.message.equals(messagePreview.message) && this.isUnread == messagePreview.isUnread;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isUnread) + (this.message.hashCode() * 31);
        }

        public final String toString() {
            return "MessagePreview(message=" + this.message + ", isUnread=" + this.isUnread + ")";
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck activitiesCacheManager;
        public final Provider activityEmbeddedPresenterFactory;
        public final Provider activityTokenFactory;
        public final DoubleCheck analytics;
        public final Provider conversationService;
        public final DoubleCheck disputesTrackerService;
        public final DoubleCheck featureFlagManager;
        public final DoubleCheck incidentsService;
        public final Provider linkNavigator;
        public final LambdaProvider moshi;
        public final LambdaProvider observabilityManager;
        public final Provider routerFactory;
        public final RealLocaleAssetProvider$MetroFactory searchPlaceholderProvider;
        public final LambdaProvider stringManager;
        public final Provider supportActivityItemPresenterFactory;
        public final DoubleCheck supportHomeService;
        public final DoubleCheck supportPhoneService;
        public final Provider supportStatus;
        public final DoubleCheck viewTokenGenerator;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, CashNavigationLogger.MetroFactory metroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4, BreadcrumbListener.MetroFactory metroFactory2, ShiftsAnalytics.MetroFactory metroFactory3, DoubleCheck doubleCheck5, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, RealPasscodeFlowStarter.MetroFactory metroFactory4, DoubleCheck doubleCheck8, RealLocaleAssetProvider$MetroFactory realLocaleAssetProvider$MetroFactory, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider3) {
            this.supportPhoneService = doubleCheck;
            this.incidentsService = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck3;
            this.linkNavigator = metroFactory;
            this.observabilityManager = lambdaProvider2;
            this.supportHomeService = doubleCheck4;
            this.supportStatus = metroFactory2;
            this.conversationService = metroFactory3;
            this.disputesTrackerService = doubleCheck5;
            this.activityEmbeddedPresenterFactory = instanceFactory;
            this.supportActivityItemPresenterFactory = instanceFactory2;
            this.featureFlagManager = doubleCheck6;
            this.activitiesCacheManager = doubleCheck7;
            this.activityTokenFactory = metroFactory4;
            this.viewTokenGenerator = doubleCheck8;
            this.searchPlaceholderProvider = realLocaleAssetProvider$MetroFactory;
            this.routerFactory = instanceFactory3;
            this.moshi = lambdaProvider3;
        }
    }

    public SupportHomePresenter(RealSupportPhoneService realSupportPhoneService, RealIncidentsService realIncidentsService, AndroidStringManager androidStringManager, Analytics analytics, RealSupportLinkNavigator realSupportLinkNavigator, RealObservabilityManager realObservabilityManager, RealSupportHomeService realSupportHomeService, RealSupportStatus realSupportStatus, RealConversationService realConversationService, RealDisputesTrackerService realDisputesTrackerService, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenter$Factory$Impl, FeatureFlagManager featureFlagManager, RealActivitiesCacheManager realActivitiesCacheManager, RealActivityTokenFactory realActivityTokenFactory, RealViewTokenGenerator realViewTokenGenerator, RealSearchPlaceholderProvider realSearchPlaceholderProvider, RealRouter$Factory$Impl realRouter$Factory$Impl, Moshi moshi, SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        supportHomeScreen.getClass();
        this.supportPhoneService = realSupportPhoneService;
        this.incidentsService = realIncidentsService;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.linkNavigator = realSupportLinkNavigator;
        this.observabilityManager = realObservabilityManager;
        this.supportHomeService = realSupportHomeService;
        this.supportStatus = realSupportStatus;
        this.conversationService = realConversationService;
        this.disputesTrackerService = realDisputesTrackerService;
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
        this.supportActivityItemPresenterFactory = supportActivityItemPresenter$Factory$Impl;
        this.args = supportHomeScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        String str = realSearchPlaceholderProvider.stringManager.get(R.string.support_search_hint);
        this.searchPlaceholder = new SearchPlaceholder(str, str);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.stringListAdapter$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticlePresenter$$ExternalSyntheticLambda0(moshi, 2));
        this.viewToken = realViewTokenGenerator.generate();
        Duration.Companion companion = Duration.Companion;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.pollingInterval = DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportPhonePollInterval.INSTANCE)).value, DurationUnit.SECONDS);
        this.connectedSupportHomeEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientSupportAutomationConnectedSupportHome.INSTANCE)).enabled();
        this.showProminentContactSupportButton$delegate = LazyKt.lazy(new BottomSheet$$ExternalSyntheticLambda2(realFeatureFlagManager, 29));
        this.activityContext$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new SupportHomePresenter$$ExternalSyntheticLambda2(realActivityTokenFactory, 0));
        this.activityEmbeddedPresenter$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new TaxWebAppBridge$$ExternalSyntheticLambda0(3, this, realActivitiesCacheManager));
    }

    public static final CustomerSupportAccessViewContactOptions.Option access$mapOptionStatus(SupportHomePresenter supportHomePresenter, List list, SupportHomeViewModel.ContactOption.Type type2) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SupportHomeViewModel.ContactOption) obj).f1210type == type2) {
                break;
            }
        }
        SupportHomeViewModel.ContactOption contactOption = (SupportHomeViewModel.ContactOption) obj;
        Boolean valueOf = contactOption != null ? Boolean.valueOf(contactOption.enabled) : null;
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            return CustomerSupportAccessViewContactOptions.Option.SHOWN;
        }
        if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
            return CustomerSupportAccessViewContactOptions.Option.SHOWN_DISABLED;
        }
        if (valueOf == null) {
            return CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final CustomerSupportAccessViewContactOptions.Option access$mapSheetOptionStatus(SupportHomePresenter supportHomePresenter, ListBuilder listBuilder, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.Type type2) {
        Object obj;
        Iterator<E> it = listBuilder.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption) obj).f1207type == type2) {
                break;
            }
        }
        SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption contactOption = (SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption) obj;
        Boolean valueOf = contactOption != null ? Boolean.valueOf(contactOption.enabled) : null;
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            return CustomerSupportAccessViewContactOptions.Option.SHOWN;
        }
        if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
            return CustomerSupportAccessViewContactOptions.Option.SHOWN_DISABLED;
        }
        if (valueOf == null) {
            return CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static List getCategories(ArticlesService$AllArticlesResult articlesService$AllArticlesResult) {
        if (!(articlesService$AllArticlesResult instanceof ArticlesService$AllArticlesResult.Success)) {
            return EmptyList.INSTANCE;
        }
        ArrayList<Article> arrayList = ((ArticlesService$AllArticlesResult.Success) articlesService$AllArticlesResult).homeArticles;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Article article : arrayList) {
            arrayList2.add(new SupportHomeViewModel.Category(article.token, article.title, article.icon));
        }
        return arrayList2;
    }

    public static List getSuggestedActions(ArticlesService$AllArticlesResult articlesService$AllArticlesResult) {
        SupportHomeViewModel.SuggestedAction.Icon icon;
        if (!(articlesService$AllArticlesResult instanceof ArticlesService$AllArticlesResult.Success)) {
            return EmptyList.INSTANCE;
        }
        List<Link> list = ((ArticlesService$AllArticlesResult.Success) articlesService$AllArticlesResult).recommendedArticles;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Link link : list) {
            Link.Target target = link.target;
            if (target instanceof Link.Target.Article) {
                icon = SupportHomeViewModel.SuggestedAction.Icon.ARTICLE;
            } else if (target instanceof Link.Target.External) {
                icon = SupportHomeViewModel.SuggestedAction.Icon.EXTERNAL_LINK;
            } else if (target instanceof Link.Target.ClientRoute) {
                icon = SupportHomeViewModel.SuggestedAction.Icon.INTERNAL_LINK;
            } else {
                if (!(target instanceof Link.Target.ClientScenario)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                icon = SupportHomeViewModel.SuggestedAction.Icon.INTERNAL_LINK;
            }
            arrayList.add(new SupportHomeViewModel.SuggestedAction(link, icon));
        }
        return arrayList;
    }

    public static final boolean models$lambda$8(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static SupportHomeDisputes toSupportHomeDisputes(DisputesTrackerService$DisputesHistoryResult disputesTrackerService$DisputesHistoryResult) {
        if (!(disputesTrackerService$DisputesHistoryResult instanceof DisputesTrackerService$DisputesHistoryResult.Success)) {
            return null;
        }
        DisputesTrackerService$DisputesHistoryResult.Success success = (DisputesTrackerService$DisputesHistoryResult.Success) disputesTrackerService$DisputesHistoryResult;
        return new SupportHomeDisputes(success.totalClaims, success.activeClaims);
    }

    public final void goToChatLoading(SupportChatScreens.FlowScreen.ChatLoading.Source source) {
        SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = this.args;
        SupportScreens.FlowScreens.Data data = supportHomeScreen.data;
        this.navigator.goTo(new SupportChatScreens.FlowScreen.ChatLoading(supportHomeScreen, data.paymentToken, null, data.flowToken, source, null, 36));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0577 A[LOOP:0: B:177:0x0571->B:179:0x0577, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0440  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object supportHomePresenter$models$3$1;
        MutableState mutableState;
        Boolean bool;
        Unit unit;
        Continuation continuation;
        MutableState mutableState2;
        MutableState mutableState3;
        int i2;
        Continuation continuation2;
        SupportHomeViewModel.NavigationIcon navigationIcon;
        Object loading;
        Object obj;
        Object obj2;
        MessagePreview messagePreview;
        boolean z;
        SupportHomeViewModel.Loaded.ActivitySectionConfig disputeOnly;
        boolean z2;
        SupportPhoneStatus.Active active;
        String str;
        String str2;
        SupportNotification supportNotification;
        DisputesTrackerService$DisputesHistoryResult disputesTrackerService$DisputesHistoryResult;
        Iterator it;
        String str3;
        SupportNotification supportNotification2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(101001932);
        Object rememberedValue = gapComposer.rememberedValue();
        RealSupportHomeService realSupportHomeService = this.supportHomeService;
        SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = this.args;
        Object obj3 = Composer.Companion.Empty;
        if (rememberedValue == obj3) {
            String str4 = supportHomeScreen.data.flowToken;
            str4.getClass();
            rememberedValue = Updater.mutableStateOf$default((ChatStatus) realSupportHomeService.chatStatusCache.get(str4));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState4 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj3) {
            rememberedValue2 = this.supportPhoneService._phoneStatus;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Continuation continuation3 = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i3 = 0;
        if (rememberedValue3 == obj3) {
            Object supportHomePresenter$models$lambda$5$$inlined$map$1 = new SupportHomePresenter$models$lambda$5$$inlined$map$1(this.conversationService.allMessages(), i3);
            gapComposer.updateRememberedValue(supportHomePresenter$models$lambda$5$$inlined$map$1);
            rememberedValue3 = supportHomePresenter$models$lambda$5$$inlined$map$1;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, emptyList, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj3) {
            rememberedValue4 = this.supportStatus.hasUnreadMessages;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, Boolean.FALSE, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj3) {
            rememberedValue5 = this.incidentsService.store;
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, emptyList, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj3) {
            rememberedValue6 = Updater.mutableStateOf$default(this.disputesTrackerService.cachedDisputesHistory);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState5 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj3) {
            String str5 = supportHomeScreen.data.flowToken;
            str5.getClass();
            rememberedValue7 = Updater.mutableStateOf$default((ArticlesService$AllArticlesResult) realSupportHomeService.articlesCache.get(str5));
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState6 = (MutableState) rememberedValue7;
        boolean changed = gapComposer.changed((ChatStatus) mutableState4.getValue()) | gapComposer.changed((ArticlesService$AllArticlesResult) mutableState6.getValue());
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed || rememberedValue8 == obj3) {
            rememberedValue8 = Recorder$$ExternalSyntheticOutline1.m(((ChatStatus) mutableState4.getValue()) == null || ((ArticlesService$AllArticlesResult) mutableState6.getValue()) == null, gapComposer);
        }
        MutableState mutableState7 = (MutableState) rememberedValue8;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.activityEmbeddedPresenter$delegate.getValue()).models(gapComposer, 0), gapComposer);
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(rememberUpdatedState);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue9 == obj3) {
            rememberedValue9 = new SupportHomePresenter$models$1$1(this, rememberUpdatedState, continuation3, i3);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue9);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue10 == obj3) {
            rememberedValue10 = new SupportHomePresenter$models$2$1(this, continuation3, i3);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue10);
        List list = (List) collectAsState4.getValue();
        Boolean bool2 = (Boolean) mutableState7.getValue();
        bool2.getClass();
        boolean changed2 = gapComposer.changed(mutableState7) | gapComposer.changed(collectAsState4) | gapComposer.changedInstance(this);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue11 == obj3) {
            mutableState = rememberUpdatedState;
            bool = bool2;
            unit = unit2;
            continuation = null;
            supportHomePresenter$models$3$1 = new SupportHomePresenter$models$3$1(this, mutableState7, collectAsState4, continuation, 0);
            mutableState2 = collectAsState4;
            mutableState3 = mutableState7;
            gapComposer.updateRememberedValue(supportHomePresenter$models$3$1);
        } else {
            mutableState = rememberUpdatedState;
            mutableState2 = collectAsState4;
            unit = unit2;
            supportHomePresenter$models$3$1 = rememberedValue11;
            continuation = null;
            mutableState3 = mutableState7;
            bool = bool2;
        }
        Updater.LaunchedEffect(list, bool, (Function2) supportHomePresenter$models$3$1, gapComposer);
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue12 == obj3) {
            rememberedValue12 = new SupportHomePresenter$models$1$1(this, mutableState5, continuation, 1);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue12);
        ArticlesService$AllArticlesResult articlesService$AllArticlesResult = (ArticlesService$AllArticlesResult) mutableState6.getValue();
        boolean changedInstance4 = gapComposer.changedInstance(this);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue13 == obj3) {
            i2 = 0;
            rememberedValue13 = new SupportHomePresenter$models$5$1(this, mutableState6, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue13);
        } else {
            i2 = 0;
        }
        Updater.LaunchedEffect(gapComposer, articlesService$AllArticlesResult, (Function2) rememberedValue13);
        Object[] objArr = new Object[i2];
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (rememberedValue14 == obj3) {
            rememberedValue14 = new SheetKt$$ExternalSyntheticLambda9(24);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue14, gapComposer, 48);
        Boolean bool3 = (Boolean) mutableState3.getValue();
        bool3.getClass();
        boolean changed3 = gapComposer.changed(mutableState8) | gapComposer.changed(mutableState3) | gapComposer.changedInstance(this);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue15 == obj3) {
            Object supportHomePresenter$models$3$12 = new SupportHomePresenter$models$3$1(this, mutableState8, mutableState3, continuation, 1);
            continuation2 = continuation;
            gapComposer.updateRememberedValue(supportHomePresenter$models$3$12);
            rememberedValue15 = supportHomePresenter$models$3$12;
        } else {
            continuation2 = continuation;
        }
        Updater.LaunchedEffect(gapComposer, bool3, (Function2) rememberedValue15);
        ArticlesService$AllArticlesResult articlesService$AllArticlesResult2 = (ArticlesService$AllArticlesResult) mutableState6.getValue();
        Boolean bool4 = (Boolean) mutableState3.getValue();
        bool4.getClass();
        if (articlesService$AllArticlesResult2 != null) {
            gapComposer.startReplaceGroup(-1383927846);
            Updater.LaunchedEffect(articlesService$AllArticlesResult2, bool4, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(articlesService$AllArticlesResult2, bool4, continuation2, this), gapComposer);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        }
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue16 == obj3) {
            rememberedValue16 = new SupportHomePresenter$models$5$1(this, mutableState4, continuation2, 1);
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue16);
        boolean changedInstance6 = gapComposer.changedInstance(this);
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (changedInstance6 || rememberedValue17 == obj3) {
            rememberedValue17 = new ChatInputView$Content$1$1$1(this, continuation2, 18);
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue17);
        boolean changedInstance7 = gapComposer.changedInstance(this);
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (changedInstance7 || rememberedValue18 == obj3) {
            rememberedValue18 = new SupportHomePresenter$models$2$1(this, continuation2, 1);
            gapComposer.updateRememberedValue(rememberedValue18);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue18);
        ChatStatus chatStatus = (ChatStatus) mutableState4.getValue();
        ChatStatus.Enabled enabled = chatStatus instanceof ChatStatus.Enabled ? (ChatStatus.Enabled) chatStatus : continuation2;
        boolean z3 = enabled != 0 ? enabled.hasActiveChat : false;
        int ordinal = supportHomeScreen.backNavigationAction.ordinal();
        if (ordinal == 0) {
            navigationIcon = SupportHomeViewModel.NavigationIcon.CLOSE;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            navigationIcon = SupportHomeViewModel.NavigationIcon.BACK;
        }
        SupportHomeViewModel.NavigationIcon navigationIcon2 = navigationIcon;
        MutableState mutableState9 = mutableState3;
        Updater.LaunchedEffect(gapComposer, flow, new CardSchemePresenter$models$3$1(flow, (Continuation) null, this, collectAsState, collectAsState3, mutableState6, mutableState5, mutableState4));
        boolean changedInstance8 = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState3) | gapComposer.changed(collectAsState);
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (changedInstance8 || rememberedValue19 == obj3) {
            rememberedValue19 = new TabToolbarsKt$$ExternalSyntheticLambda6(14, this, collectAsState3, collectAsState);
            gapComposer.updateRememberedValue(rememberedValue19);
        }
        Function2 function2 = (Function2) rememberedValue19;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed4 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue20 == obj3) {
            rememberedValue20 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 28);
            gapComposer.updateRememberedValue(rememberedValue20);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue20, gapComposer);
        String str6 = this.searchPlaceholder.home;
        SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) collectAsState.getValue();
        ChatStatus chatStatus2 = (ChatStatus) mutableState4.getValue();
        List list2 = (List) collectAsState2.getValue();
        boolean models$lambda$8 = models$lambda$8(collectAsState3);
        List list3 = (List) mutableState2.getValue();
        ArticlesService$AllArticlesResult articlesService$AllArticlesResult3 = (ArticlesService$AllArticlesResult) mutableState6.getValue();
        DisputesTrackerService$DisputesHistoryResult disputesTrackerService$DisputesHistoryResult2 = (DisputesTrackerService$DisputesHistoryResult) mutableState5.getValue();
        UiCallbackModel uiCallbackModel = (UiCallbackModel) mutableState.getValue();
        boolean booleanValue = ((Boolean) this.showProminentContactSupportButton$delegate.getValue()).booleanValue();
        if (chatStatus2 == null || articlesService$AllArticlesResult3 == null) {
            loading = new SupportHomeViewModel.Loading(navigationIcon2);
        } else {
            if (z3 || models$lambda$8) {
                ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listIterator.previous();
                    if (!(((Message) obj2).getBody() instanceof MessageBody.SystemMessageBody)) {
                        break;
                    }
                }
                Message message = (Message) obj2;
                if (message != null) {
                    messagePreview = new MessagePreview(message, models$lambda$8);
                    z = this.connectedSupportHomeEnabled;
                    if (!z) {
                        disputeOnly = new SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes(disputesTrackerService$DisputesHistoryResult2 != null ? toSupportHomeDisputes(disputesTrackerService$DisputesHistoryResult2) : null, uiCallbackModel);
                    } else {
                        if (z) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        disputeOnly = new SupportHomeViewModel.Loaded.ActivitySectionConfig.DisputeOnly(disputesTrackerService$DisputesHistoryResult2 != null ? toSupportHomeDisputes(disputesTrackerService$DisputesHistoryResult2) : null);
                    }
                    SupportHomeViewModel.Loaded.ActivitySectionConfig activitySectionConfig = disputeOnly;
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    z2 = chatStatus2 instanceof ChatStatus.Enabled;
                    AndroidStringManager androidStringManager = this.stringManager;
                    if (z2) {
                        createListBuilder.add(new SupportHomeViewModel.ContactOption(androidStringManager.get(R.string.support_home_chat_button_text), ((ChatStatus.Enabled) chatStatus2).availabilitySubtitle, SupportHomeViewModel.ContactOption.Type.CHAT, false, models$lambda$8, 8));
                    }
                    if (supportPhoneStatus instanceof SupportPhoneStatus.IsEligible) {
                        SupportPhoneStatus.IsEligible isEligible = (SupportPhoneStatus.IsEligible) supportPhoneStatus;
                        createListBuilder.add(new SupportHomeViewModel.ContactOption(androidStringManager.get(R.string.support_home_phone_button_text), isEligible.getAvailability().subtitle, SupportHomeViewModel.ContactOption.Type.PHONE, isEligible.getAvailability().isAvailable, false, 16));
                    }
                    ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    active = !(supportPhoneStatus instanceof SupportPhoneStatus.Active) ? (SupportPhoneStatus.Active) supportPhoneStatus : null;
                    if (active == null || (str = active.notificationTitle) == null || (str2 = active.notificationMessage) == null) {
                        disputesTrackerService$DisputesHistoryResult = disputesTrackerService$DisputesHistoryResult2;
                        supportNotification = null;
                    } else {
                        disputesTrackerService$DisputesHistoryResult = disputesTrackerService$DisputesHistoryResult2;
                        supportNotification = new SupportNotification(str, str2, SupportNotification.Trigger.PhoneMessage.INSTANCE, false);
                    }
                    if (supportNotification != null) {
                        createListBuilder2.add(supportNotification);
                    }
                    if (messagePreview != null) {
                        String str7 = androidStringManager.get(R.string.support_home_chat_message_preview_title);
                        Message message2 = messagePreview.message;
                        TimerScopeKt status = message2.getStatus();
                        if (status instanceof MessageStatus$Failed) {
                            MessageBody body = message2.getBody();
                            if (body instanceof MessageBody.TextBody) {
                                str3 = androidStringManager.get(R.string.support_home_chat_message_preview_failed_text);
                            } else if (body instanceof MessageBody.FileBody) {
                                str3 = GlobalSnapshotManagerKt.isImage((MessageBody.FileBody) body) ? androidStringManager.get(R.string.support_home_chat_message_preview_failed_image) : androidStringManager.get(R.string.support_home_chat_message_preview_failed_file);
                            } else if (body instanceof MessageBody.SelectedReplyBody) {
                                str3 = ((MessageBody.SelectedReplyBody) body).reply.text;
                            } else if (body instanceof MessageBody.ActionBody) {
                                str3 = ((MessageBody.ActionBody) body).title;
                            } else if ((body instanceof MessageBody.TransactionBody) || (body instanceof MessageBody.ActivityItemTransactionBody)) {
                                str3 = androidStringManager.get(R.string.support_home_chat_message_preview_failed_transaction);
                            } else {
                                if (!(body instanceof MessageBody.SystemMessageBody)) {
                                    if (body instanceof MessageBody.UnknownBody) {
                                        a$$ExternalSyntheticBUOutline0.m$1("One cannot send what one does not know");
                                        return null;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                str3 = null;
                            }
                            supportNotification2 = str3 == null ? new SupportNotification(str7, str3, SupportNotification.Trigger.ChatMessage.INSTANCE, messagePreview.isUnread) : null;
                            if (supportNotification2 != null) {
                                createListBuilder2.add(supportNotification2);
                            }
                        } else {
                            if (!Intrinsics.areEqual(status, MessageStatus$Sending.INSTANCE) && !Intrinsics.areEqual(status, MessageStatus$Recorded.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            MessageBody body2 = message2.getBody();
                            if (body2 instanceof MessageBody.TextBody) {
                                str3 = ((MessageBody.TextBody) body2).text;
                            } else if (body2 instanceof MessageBody.FileBody) {
                                str3 = GlobalSnapshotManagerKt.isImage((MessageBody.FileBody) body2) ? androidStringManager.get(R.string.support_home_chat_message_preview_image) : androidStringManager.get(R.string.support_home_chat_message_preview_file);
                            } else if (body2 instanceof MessageBody.SelectedReplyBody) {
                                str3 = ((MessageBody.SelectedReplyBody) body2).reply.text;
                            } else if (body2 instanceof MessageBody.ActionBody) {
                                str3 = ((MessageBody.ActionBody) body2).title;
                            } else if ((body2 instanceof MessageBody.TransactionBody) || (body2 instanceof MessageBody.ActivityItemTransactionBody)) {
                                str3 = androidStringManager.get(R.string.support_home_chat_message_preview_transaction);
                            } else {
                                if (!(body2 instanceof MessageBody.SystemMessageBody)) {
                                    if (!(body2 instanceof MessageBody.UnknownBody)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str3 = androidStringManager.get(R.string.support_home_chat_message_preview_unknown_body);
                                }
                                str3 = null;
                            }
                            if (str3 == null) {
                            }
                            if (supportNotification2 != null) {
                            }
                        }
                    }
                    it = list3.iterator();
                    while (it.hasNext()) {
                        createListBuilder2.add(TsUtil.toNotification((Incident) it.next()));
                    }
                    loading = new SupportHomeViewModel.Loaded(build, CollectionsKt__CollectionsJVMKt.build(createListBuilder2), str6, articlesService$AllArticlesResult3.equals(ArticlesService$AllArticlesResult.Failure.INSTANCE), getCategories(articlesService$AllArticlesResult3), getSuggestedActions(articlesService$AllArticlesResult3), navigationIcon2, disputesTrackerService$DisputesHistoryResult != null ? toSupportHomeDisputes(disputesTrackerService$DisputesHistoryResult) : null, activitySectionConfig, booleanValue);
                }
            }
            messagePreview = null;
            z = this.connectedSupportHomeEnabled;
            if (!z) {
            }
            SupportHomeViewModel.Loaded.ActivitySectionConfig activitySectionConfig2 = disputeOnly;
            ListBuilder createListBuilder3 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            z2 = chatStatus2 instanceof ChatStatus.Enabled;
            AndroidStringManager androidStringManager2 = this.stringManager;
            if (z2) {
            }
            if (supportPhoneStatus instanceof SupportPhoneStatus.IsEligible) {
            }
            ListBuilder build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder3);
            ListBuilder createListBuilder22 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (!(supportPhoneStatus instanceof SupportPhoneStatus.Active)) {
            }
            if (active == null) {
                disputesTrackerService$DisputesHistoryResult = disputesTrackerService$DisputesHistoryResult2;
                supportNotification = new SupportNotification(str, str2, SupportNotification.Trigger.PhoneMessage.INSTANCE, false);
                if (supportNotification != null) {
                }
                if (messagePreview != null) {
                }
                it = list3.iterator();
                while (it.hasNext()) {
                }
                loading = new SupportHomeViewModel.Loaded(build2, CollectionsKt__CollectionsJVMKt.build(createListBuilder22), str6, articlesService$AllArticlesResult3.equals(ArticlesService$AllArticlesResult.Failure.INSTANCE), getCategories(articlesService$AllArticlesResult3), getSuggestedActions(articlesService$AllArticlesResult3), navigationIcon2, disputesTrackerService$DisputesHistoryResult != null ? toSupportHomeDisputes(disputesTrackerService$DisputesHistoryResult) : null, activitySectionConfig2, booleanValue);
            }
            disputesTrackerService$DisputesHistoryResult = disputesTrackerService$DisputesHistoryResult2;
            supportNotification = null;
            if (supportNotification != null) {
            }
            if (messagePreview != null) {
            }
            it = list3.iterator();
            while (it.hasNext()) {
            }
            loading = new SupportHomeViewModel.Loaded(build2, CollectionsKt__CollectionsJVMKt.build(createListBuilder22), str6, articlesService$AllArticlesResult3.equals(ArticlesService$AllArticlesResult.Failure.INSTANCE), getCategories(articlesService$AllArticlesResult3), getSuggestedActions(articlesService$AllArticlesResult3), navigationIcon2, disputesTrackerService$DisputesHistoryResult != null ? toSupportHomeDisputes(disputesTrackerService$DisputesHistoryResult) : null, activitySectionConfig2, booleanValue);
        }
        SupportHomeViewModel.Loaded loaded = loading instanceof SupportHomeViewModel.Loaded ? (SupportHomeViewModel.Loaded) loading : null;
        Object obj4 = loaded != null ? loaded.contactOptions : null;
        SupportPhoneStatus supportPhoneStatus2 = (SupportPhoneStatus) collectAsState.getValue();
        Boolean bool5 = (Boolean) mutableState9.getValue();
        bool5.getClass();
        boolean changed5 = gapComposer.changed(mutableState9) | gapComposer.changed(collectAsState) | gapComposer.changedInstance(obj4) | gapComposer.changedInstance(this);
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue21 == obj3) {
            obj = obj4;
            Object anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(obj, (Object) this, mutableState9, collectAsState, (Continuation) null, 3);
            gapComposer.updateRememberedValue(anonymousClass2);
            rememberedValue21 = anonymousClass2;
        } else {
            obj = obj4;
        }
        Updater.LaunchedEffect(obj, supportPhoneStatus2, bool5, (Function2) rememberedValue21, gapComposer);
        gapComposer.end(false);
        return loading;
    }

    public final void onPhoneButtonClicked(SupportPhoneStatus supportPhoneStatus) {
        int ordinal = ColumnKt.getNextScreenOnSelected(supportPhoneStatus).ordinal();
        SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = this.args;
        if (ordinal == 0) {
            ClientRoute.Flow phoneSupportRoute = TtmlRenderUtil.getPhoneSupportRoute(supportHomeScreen.data.paymentToken, null);
            RoutingParams routingParams = new RoutingParams(this.args, BlockersData.AnalyticsData.Source.SUPPORT_HOME.getAnalyticsName(), null, null, null, null, 508);
            RealRouter realRouter = this.router;
            realRouter.getClass();
            realRouter.clientRouteRouter.route(phoneSupportRoute, routingParams);
            return;
        }
        if (ordinal == 1) {
            this.navigator.goTo(new SupportScreens.SupportPhoneStatusScreen(true, supportHomeScreen.data.flowToken, CustomerSupportPhoneViewStatus.Trigger.HOME_CONTACT_BUTTON));
        } else if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Feature not enabled");
        }
    }
}
