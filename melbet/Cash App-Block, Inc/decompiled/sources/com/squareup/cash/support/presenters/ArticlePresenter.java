package com.squareup.cash.support.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.media3.extractor.ts.MpeghUtil;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewContactOptions;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.backend.api.SupportPhoneScreen;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionService;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.backend.real.RealSupportStatus;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.moshi.Moshi;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class ArticlePresenter implements MoleculePresenter {
    public static final List ONGOING_INCIDENT_TYPES = CollectionsKt__CollectionsKt.listOf((Object[]) new Incident.Status[]{Incident.Status.IDENTIFIED, Incident.Status.INVESTIGATING});
    public final ActivityDataBridge activityDataBridge;
    public final Analytics analytics;
    public final SupportScreens.FlowScreens.ArticleScreen args;
    public final String articleToken;
    public final RealArticlesService articlesService;
    public final AndroidClock clock;
    public final SupportScreens.FlowScreens.SupportArticleConfig config;
    public final RealContactSupportNavigator contactSupportNavigator;
    public final AndroidDateFormatManager dateFormatManager;
    public final String entityId;
    public final RealIncidentsService incidentsService;
    public final Lazy jsonListAdapter$delegate;
    public final IntentLauncher launcher;
    public final RealSupportLinkNavigator linkNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final RealSupportPhoneService supportPhoneService;
    public final RealSupportStatus supportStatus;
    public final SupportTransactionService transactionService;
    public final String viewToken;
    public final RealSupportViewedArticlesStore viewedArticlesStore;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IncidentsState {
        public static final /* synthetic */ IncidentsState[] $VALUES;
        public static final IncidentsState LOADED;
        public static final IncidentsState LOADING;
        public static final IncidentsState NOT_APPLICABLE;
        public static final IncidentsState VIEWED;

        static {
            IncidentsState incidentsState = new IncidentsState("LOADING", 0);
            LOADING = incidentsState;
            IncidentsState incidentsState2 = new IncidentsState("LOADED", 1);
            LOADED = incidentsState2;
            IncidentsState incidentsState3 = new IncidentsState("VIEWED", 2);
            VIEWED = incidentsState3;
            IncidentsState incidentsState4 = new IncidentsState("NOT_APPLICABLE", 3);
            NOT_APPLICABLE = incidentsState4;
            $VALUES = new IncidentsState[]{incidentsState, incidentsState2, incidentsState3, incidentsState4};
        }

        public static IncidentsState valueOf(String str) {
            return (IncidentsState) Enum.valueOf(IncidentsState.class, str);
        }

        public static IncidentsState[] values() {
            return (IncidentsState[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result result = SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result.DISMISSED;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SupportPhoneScreen.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SupportPhoneScreen supportPhoneScreen = SupportPhoneScreen.REQUEST_PHONE_SUPPORT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SupportPhoneScreen supportPhoneScreen2 = SupportPhoneScreen.REQUEST_PHONE_SUPPORT;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Article.ContactOption.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Article.ContactOption contactOption = Article.ContactOption.CHAT;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Article.ContactOption contactOption2 = Article.ContactOption.CHAT;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ArticlePresenter(RealArticlesService realArticlesService, SupportTransactionService supportTransactionService, RealContactSupportNavigator realContactSupportNavigator, RealSupportLinkNavigator realSupportLinkNavigator, RealSupportViewedArticlesStore realSupportViewedArticlesStore, Analytics analytics, RealSupportPhoneService realSupportPhoneService, RealSupportStatus realSupportStatus, RealIncidentsService realIncidentsService, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager, AndroidClock androidClock, RealObservabilityManager realObservabilityManager, ActivityDataBridge activityDataBridge, IntentLauncher intentLauncher, RealRouter$Factory$Impl realRouter$Factory$Impl, Moshi moshi, RealViewTokenGenerator realViewTokenGenerator, BetterNavigator.ScreenNavigator screenNavigator, SupportScreens.FlowScreens.ArticleScreen articleScreen) {
        String str;
        articleScreen.getClass();
        this.articlesService = realArticlesService;
        this.transactionService = supportTransactionService;
        this.contactSupportNavigator = realContactSupportNavigator;
        this.linkNavigator = realSupportLinkNavigator;
        this.viewedArticlesStore = realSupportViewedArticlesStore;
        this.analytics = analytics;
        this.supportPhoneService = realSupportPhoneService;
        this.supportStatus = realSupportStatus;
        this.incidentsService = realIncidentsService;
        this.stringManager = androidStringManager;
        this.dateFormatManager = androidDateFormatManager;
        this.clock = androidClock;
        this.observabilityManager = realObservabilityManager;
        this.activityDataBridge = activityDataBridge;
        this.launcher = intentLauncher;
        this.navigator = screenNavigator;
        this.args = articleScreen;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.jsonListAdapter$delegate = LazyKt.lazy(new ArticlePresenter$$ExternalSyntheticLambda0(moshi, 0));
        this.viewToken = realViewTokenGenerator.generate();
        this.entityId = articleScreen.data.paymentToken;
        SupportScreens.FlowScreens.SupportArticleConfig supportArticleConfig = articleScreen.articleConfig;
        if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) {
            str = ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) supportArticleConfig).articleToken;
        } else {
            if (!(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction)) {
                if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) {
                    str = ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) supportArticleConfig).articleToken;
                } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId) {
                    str = ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId) supportArticleConfig).articleToken;
                } else if (!(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
            }
            str = null;
        }
        this.articleToken = str;
        this.config = supportArticleConfig;
    }

    public static CustomerSupportAccessViewContactOptions.Option contactOptionVisibility(Article article, Article.ContactOption contactOption, SupportPhoneStatus supportPhoneStatus) {
        List list = article.contactOptions;
        int ordinal = contactOption.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return (list != null && list.contains(contactOption) && (supportPhoneStatus instanceof SupportPhoneStatus.IsEligible)) ? ((SupportPhoneStatus.IsEligible) supportPhoneStatus).getAvailability().isAvailable ? CustomerSupportAccessViewContactOptions.Option.SHOWN : CustomerSupportAccessViewContactOptions.Option.SHOWN_DISABLED : CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN;
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return (list == null || !list.contains(contactOption)) ? CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN : CustomerSupportAccessViewContactOptions.Option.SHOWN;
    }

    public static ListBuilder nodeTokens(Article article) {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Link link = article.callToAction;
        if (link != null) {
            createListBuilder.add(link.token);
        }
        Iterator it = article.links.iterator();
        while (it.hasNext()) {
            createListBuilder.add(((Link) it.next()).token);
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Map mapOf;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        Continuation continuation;
        MutableState mutableState4;
        MutableState mutableState5;
        SupportPhoneStatus supportPhoneStatus;
        MutableState mutableState6;
        Continuation continuation2;
        ArticlePresenter articlePresenter;
        GapComposer gapComposer;
        Object articlePresenter$models$9$1;
        MutableState mutableState7;
        Continuation continuation3;
        boolean z;
        ArticleViewModel.ContactOption contactOption;
        Object articlePresenter$models$1$1;
        Unit unit;
        SupportTransaction supportTransaction;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(1188793076);
        SupportScreens.FlowScreens.ArticleScreen articleScreen = this.args;
        String str = articleScreen.data.paymentToken;
        SupportScreens.FlowScreens.SupportArticleConfig supportArticleConfig = articleScreen.articleConfig;
        boolean z2 = supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken;
        if (z2) {
            mapOf = MapsKt__MapsKt.mapOf(new Pair("articleToken", ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) supportArticleConfig).articleToken), new Pair("entityId", str), new Pair("config", "ByArticleToken"));
        } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction) {
            mapOf = MapsKt__MapsKt.mapOf(new Pair("articleToken", str), new Pair("config", "ByTransaction"));
        } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId) {
            mapOf = MapsKt__MapsKt.mapOf(new Pair("entityId", str), new Pair("config", "ByTransactionId"));
        } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) {
            mapOf = MapsKt__MapsKt.mapOf(new Pair("articleToken", ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) supportArticleConfig).articleToken), new Pair("entityId", str), new Pair("config", "ByArticleTokenAndTransaction"));
        } else {
            if (!(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            mapOf = MapsKt__MapsKt.mapOf(new Pair("articleToken", ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId) supportArticleConfig).articleToken), new Pair("entityId", str), new Pair("config", "ByArticleTokenAndTransactionId"));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            value.getClass();
            linkedHashMap2.put(key, (String) value);
        }
        int i2 = 0;
        DragAndDrop_androidKt.AddViewAttributes(this.observabilityManager, linkedHashMap2, gapComposer2, 0);
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer2.rememberedValue();
        int i3 = 22;
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new SheetKt$$ExternalSyntheticLambda9(i3);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 48);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        SupportScreens.FlowScreens.SupportArticleConfig supportArticleConfig2 = this.config;
        if (rememberedValue2 == obj) {
            if (supportArticleConfig2 instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) {
                String str2 = ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) supportArticleConfig2).articleToken;
                str2.getClass();
                RealArticlesService realArticlesService = this.articlesService;
                Article article = (Article) realArticlesService.articleCache.get(str2);
                String str3 = realArticlesService.cssCache;
                rememberedValue2 = Updater.mutableStateOf$default((article == null || str3 == null) ? null : new ArticlesService$ArticleResult.Success(article, RealArticlesService.getFinalHtml(article, str3)));
            } else {
                rememberedValue2 = Updater.mutableStateOf$default(null);
            }
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState9 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer2.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(1, gapComposer2);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == obj) {
            if (!z2) {
                if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction) {
                    supportTransaction = (SupportTransaction) ((SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction) supportArticleConfig).transaction.getValue();
                } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) {
                    supportTransaction = (SupportTransaction) ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) supportArticleConfig).transaction.getValue();
                } else if (!(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId) && !(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                rememberedValue4 = Updater.mutableStateOf$default(supportTransaction);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            supportTransaction = null;
            rememberedValue4 = Updater.mutableStateOf$default(supportTransaction);
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState10 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = this.supportStatus.hasUnreadMessages;
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, Boolean.FALSE, null, gapComposer2, 48, 2);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState11 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = this.supportPhoneService._phoneStatus;
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer2, 1);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Recorder$$ExternalSyntheticOutline1.m((supportArticleConfig2 instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId) || (supportArticleConfig2 instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId), gapComposer2);
        }
        MutableState mutableState12 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState13 = (MutableState) rememberedValue9;
        ArticlesService$ArticleResult articlesService$ArticleResult = (ArticlesService$ArticleResult) mutableState9.getValue();
        ArticlesService$ArticleResult.Success success = articlesService$ArticleResult instanceof ArticlesService$ArticleResult.Success ? (ArticlesService$ArticleResult.Success) articlesService$ArticleResult : null;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(success != null ? success.article : null, gapComposer2);
        if (((Boolean) mutableState12.getValue()).booleanValue()) {
            gapComposer2.startReplaceGroup(-964632113);
            Unit unit2 = Unit.INSTANCE;
            boolean changedInstance = gapComposer2.changedInstance(this);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue10 == obj) {
                mutableState4 = collectAsState2;
                mutableState3 = rememberUpdatedState;
                unit = unit2;
                continuation = null;
                articlePresenter$models$1$1 = new ArticlePresenter$models$1$1(this, mutableState10, mutableState12, continuation, 0);
                mutableState = mutableState10;
                mutableState2 = mutableState12;
                gapComposer2.updateRememberedValue(articlePresenter$models$1$1);
            } else {
                mutableState = mutableState10;
                mutableState2 = mutableState12;
                mutableState3 = rememberUpdatedState;
                unit = unit2;
                articlePresenter$models$1$1 = rememberedValue10;
                continuation = null;
                mutableState4 = collectAsState2;
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) articlePresenter$models$1$1);
            gapComposer2.end(false);
        } else {
            mutableState = mutableState10;
            mutableState2 = mutableState12;
            mutableState3 = rememberUpdatedState;
            continuation = null;
            mutableState4 = collectAsState2;
            gapComposer2.startReplaceGroup(-963987282);
            gapComposer2.end(false);
        }
        Unit unit3 = Unit.INSTANCE;
        boolean changed = gapComposer2.changed(mutableState4) | gapComposer2.changedInstance(this);
        Object rememberedValue11 = gapComposer2.rememberedValue();
        if (changed || rememberedValue11 == obj) {
            rememberedValue11 = new ShoppingWebBridge$loadUrl$1(this, mutableState4, continuation, 21);
            gapComposer2.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue11);
        boolean changed2 = gapComposer2.changed(mutableState8) | gapComposer2.changedInstance(this);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue12 == obj) {
            rememberedValue12 = new ArticlePresenter$models$3$1(this, mutableState8, continuation, i2);
            gapComposer2.updateRememberedValue(rememberedValue12);
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue12);
        if (((Boolean) mutableState13.getValue()).booleanValue() || ((IncidentsState) mutableState8.getValue()) != IncidentsState.LOADED) {
            gapComposer2.startReplaceGroup(-962599474);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-963259681);
            boolean changedInstance2 = gapComposer2.changedInstance(this);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue13 == obj) {
                rememberedValue13 = new ShoppingWebBridge.AnonymousClass1(this, continuation, i3);
                gapComposer2.updateRememberedValue(rememberedValue13);
            }
            Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue13);
            gapComposer2.end(false);
        }
        boolean changed3 = gapComposer2.changed(mutableState8);
        Object rememberedValue14 = gapComposer2.rememberedValue();
        int i4 = 29;
        if (changed3 || rememberedValue14 == obj) {
            rememberedValue14 = new HeroTagViewKt$$ExternalSyntheticLambda12(i4, mutableState8);
            gapComposer2.updateRememberedValue(rememberedValue14);
        }
        Function2 function2 = (Function2) rememberedValue14;
        ProvidableCompositionLocal providableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer2.consume(providableCompositionLocal);
        boolean changed4 = gapComposer2.changed(function2) | gapComposer2.changedInstance(answerDispatcher);
        Object rememberedValue15 = gapComposer2.rememberedValue();
        if (changed4 || rememberedValue15 == obj) {
            rememberedValue15 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i2);
            gapComposer2.updateRememberedValue(rememberedValue15);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue15, gapComposer2);
        Object rememberedValue16 = gapComposer2.rememberedValue();
        if (rememberedValue16 == obj) {
            rememberedValue16 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(rememberedValue16);
        }
        Object obj2 = (CoroutineScope) rememberedValue16;
        boolean changedInstance3 = gapComposer2.changedInstance(this) | gapComposer2.changed(mutableState3) | gapComposer2.changedInstance(obj2);
        Object rememberedValue17 = gapComposer2.rememberedValue();
        if (changedInstance3 || rememberedValue17 == obj) {
            rememberedValue17 = new TabToolbarsKt$$ExternalSyntheticLambda6(13, this, obj2, mutableState3);
            gapComposer2.updateRememberedValue(rememberedValue17);
        }
        Function2 function22 = (Function2) rememberedValue17;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer2.consume(providableCompositionLocal);
        boolean changed5 = gapComposer2.changed(function22) | gapComposer2.changedInstance(answerDispatcher2);
        Object rememberedValue18 = gapComposer2.rememberedValue();
        if (changed5 || rememberedValue18 == obj) {
            rememberedValue18 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 27);
            gapComposer2.updateRememberedValue(rememberedValue18);
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue18, gapComposer2);
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance4 = gapComposer2.changedInstance(this);
        Object rememberedValue19 = gapComposer2.rememberedValue();
        if (changedInstance4 || rememberedValue19 == obj) {
            mutableState5 = mutableState9;
            rememberedValue19 = new ArticlePresenter$models$3$1(this, mutableState5, continuation, 1);
            gapComposer2.updateRememberedValue(rememberedValue19);
        } else {
            mutableState5 = mutableState9;
        }
        Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue19);
        Article article2 = (Article) mutableState3.getValue();
        if (article2 != null) {
            gapComposer2.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer2, article2, new AndroidFileSaver$save$2(article2, continuation, this, i4));
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-1106436997);
            gapComposer2.end(false);
        }
        Article article3 = (Article) mutableState3.getValue();
        SupportPhoneStatus supportPhoneStatus2 = (SupportPhoneStatus) mutableState4.getValue();
        boolean changed6 = gapComposer2.changed(mutableState3) | gapComposer2.changedInstance(this) | gapComposer2.changed(mutableState4);
        Object rememberedValue20 = gapComposer2.rememberedValue();
        if (changed6 || rememberedValue20 == obj) {
            MutableState mutableState14 = mutableState3;
            supportPhoneStatus = supportPhoneStatus2;
            Object articlePresenter$models$9$12 = new ArticlePresenter$models$9$1(this, mutableState14, mutableState4, continuation, 0);
            mutableState6 = mutableState14;
            continuation2 = continuation;
            gapComposer2.updateRememberedValue(articlePresenter$models$9$12);
            rememberedValue20 = articlePresenter$models$9$12;
        } else {
            continuation2 = continuation;
            mutableState6 = mutableState3;
            supportPhoneStatus = supportPhoneStatus2;
        }
        Updater.LaunchedEffect(article3, supportPhoneStatus, (Function2) rememberedValue20, gapComposer2);
        Article article4 = (Article) mutableState6.getValue();
        Boolean bool = (Boolean) mutableState2.getValue();
        bool.getClass();
        if (article4 != null) {
            gapComposer2.startReplaceGroup(-1383927846);
            gapComposer = gapComposer2;
            MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(article4, bool, (Continuation) null, this, mutableState, 29);
            articlePresenter = this;
            Updater.LaunchedEffect(article4, bool, moleculeKt$immediateClockFlow$1$1$1, gapComposer);
            gapComposer.end(false);
        } else {
            articlePresenter = this;
            gapComposer = gapComposer2;
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        }
        Object[] objArr2 = new Object[0];
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (rememberedValue21 == obj) {
            rememberedValue21 = new SheetKt$$ExternalSyntheticLambda9(23);
            gapComposer.updateRememberedValue(rememberedValue21);
        }
        MutableState mutableState15 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue21, gapComposer, 48);
        Boolean bool2 = (Boolean) mutableState13.getValue();
        bool2.getClass();
        boolean changed7 = gapComposer.changed(mutableState15) | gapComposer.changedInstance(articlePresenter);
        Object rememberedValue22 = gapComposer.rememberedValue();
        if (changed7 || rememberedValue22 == obj) {
            mutableState7 = mutableState13;
            continuation3 = continuation2;
            articlePresenter$models$9$1 = new ArticlePresenter$models$9$1(articlePresenter, mutableState7, mutableState15, continuation3, 1);
            gapComposer.updateRememberedValue(articlePresenter$models$9$1);
        } else {
            articlePresenter$models$9$1 = rememberedValue22;
            mutableState7 = mutableState13;
            continuation3 = continuation2;
        }
        Updater.LaunchedEffect(gapComposer, bool2, (Function2) articlePresenter$models$9$1);
        MutableState mutableState16 = mutableState7;
        String str4 = continuation3;
        MutableState mutableState17 = mutableState5;
        MutableState mutableState18 = mutableState4;
        MutableState mutableState19 = mutableState;
        Updater.LaunchedEffect(gapComposer, flow, new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, this, mutableState6, mutableState17, mutableState19, collectAsState, mutableState18, parcelableSnapshotMutableIntState, mutableState11, 13));
        ArticlesService$ArticleResult articlesService$ArticleResult2 = (ArticlesService$ArticleResult) mutableState17.getValue();
        SupportTransaction supportTransaction2 = (SupportTransaction) mutableState19.getValue();
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) mutableState11.getValue()).booleanValue();
        IncidentsState incidentsState = (IncidentsState) mutableState8.getValue();
        SupportPhoneStatus supportPhoneStatus3 = (SupportPhoneStatus) mutableState18.getValue();
        Object obj3 = ArticleViewModel.Loading.INSTANCE;
        if (!booleanValue && incidentsState != IncidentsState.LOADING) {
            if (!(articlesService$ArticleResult2 instanceof ArticlesService$ArticleResult.Failure)) {
                if (!(articlesService$ArticleResult2 instanceof ArticlesService$ArticleResult.Success)) {
                    z = false;
                    if (articlesService$ArticleResult2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                } else if (booleanValue2) {
                    ArticlesService$ArticleResult.Success success2 = (ArticlesService$ArticleResult.Success) articlesService$ArticleResult2;
                    Article article5 = success2.article;
                    String str5 = success2.html;
                    List list = article5.contactOptions;
                    if (!(supportPhoneStatus3 instanceof SupportPhoneStatus.IsEligible)) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (((Article.ContactOption) obj4) != Article.ContactOption.PHONE) {
                                arrayList.add(obj4);
                            }
                        }
                        list = arrayList;
                    }
                    List<Article.ContactOption> list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (Article.ContactOption contactOption2 : list2) {
                        int ordinal = contactOption2.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                contactOption = new ArticleViewModel.ContactOption(MpeghUtil.subtitle(supportPhoneStatus3, this.stringManager, this.dateFormatManager, this.clock), (supportPhoneStatus3 instanceof SupportPhoneStatus.IsEligible) && ((SupportPhoneStatus.IsEligible) supportPhoneStatus3).getAvailability().isAvailable, contactOption2);
                                arrayList2.add(contactOption);
                            } else if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        contactOption = new ArticleViewModel.ContactOption(str4, true, contactOption2);
                        arrayList2.add(contactOption);
                    }
                    obj3 = new ArticleViewModel.Loaded(article5, str5, arrayList2, supportTransaction2);
                } else {
                    z = false;
                    obj3 = new ArticleViewModel.Error(false);
                }
                mutableState16.setValue(Boolean.valueOf(obj3 instanceof ArticleViewModel.Loading));
                gapComposer.end(z);
                return obj3;
            }
            obj3 = new ArticleViewModel.Error(((ArticlesService$ArticleResult.Failure) articlesService$ArticleResult2).isRetryable);
        }
        z = false;
        mutableState16.setValue(Boolean.valueOf(obj3 instanceof ArticleViewModel.Loading));
        gapComposer.end(z);
        return obj3;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activityDataBridge;
        public final Provider analytics;
        public final Provider articlesService;
        public final Provider clock;
        public final Provider contactSupportNavigator;
        public final Provider dateFormatManager;
        public final Provider incidentsService;
        public final Provider launcher;
        public final Provider linkNavigator;
        public final Provider moshi;
        public final Provider observabilityManager;
        public final Provider routerFactory;
        public final Provider stringManager;
        public final Provider supportPhoneService;
        public final Provider supportStatus;
        public final Provider transactionService;
        public final Provider viewTokenGenerator;
        public final Provider viewedArticlesStore;

        public MetroFactory(RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, IntentLauncher.MetroFactory metroFactory2, DoubleCheck doubleCheck4, RealSessionFlags.MetroFactory metroFactory3, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, RealBadger2.MetroFactory metroFactory4, RealReferralManager.MetroFactory metroFactory5, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck5, InstanceFactory instanceFactory5) {
            this.contactSupportNavigator = metroFactory;
            this.articlesService = doubleCheck;
            this.transactionService = doubleCheck2;
            this.analytics = doubleCheck3;
            this.linkNavigator = metroFactory2;
            this.supportPhoneService = doubleCheck4;
            this.viewedArticlesStore = metroFactory3;
            this.stringManager = lambdaProvider;
            this.activityDataBridge = instanceFactory;
            this.supportStatus = metroFactory4;
            this.launcher = metroFactory5;
            this.dateFormatManager = lambdaProvider2;
            this.viewTokenGenerator = instanceFactory2;
            this.observabilityManager = instanceFactory3;
            this.routerFactory = instanceFactory4;
            this.clock = lambdaProvider3;
            this.incidentsService = doubleCheck5;
            this.moshi = instanceFactory5;
        }

        public MetroFactory(LambdaProvider lambdaProvider, RetroUiFactory.MetroFactory metroFactory, DelegateFactory delegateFactory, LambdaProvider lambdaProvider2, RealDependentBalancesStore.MetroFactory metroFactory2, RealMessageSigner.MetroFactory metroFactory3, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory4, DoubleCheck doubleCheck2, MoneyUiFactory.MetroFactory metroFactory5, InstanceFactory instanceFactory3, DoubleCheck doubleCheck3, RealAppLockState.MetroFactory metroFactory6, AndroidFileSaver.MetroFactory metroFactory7, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.stringManager = lambdaProvider;
            this.contactSupportNavigator = metroFactory;
            this.supportPhoneService = delegateFactory;
            this.dateFormatManager = lambdaProvider2;
            this.linkNavigator = metroFactory2;
            this.viewedArticlesStore = metroFactory3;
            this.supportStatus = instanceFactory;
            this.launcher = instanceFactory2;
            this.articlesService = doubleCheck;
            this.routerFactory = metroFactory4;
            this.transactionService = doubleCheck2;
            this.incidentsService = metroFactory5;
            this.activityDataBridge = instanceFactory3;
            this.analytics = doubleCheck3;
            this.viewTokenGenerator = metroFactory6;
            this.observabilityManager = metroFactory7;
            this.clock = lambdaProvider3;
            this.moshi = musicViewFactory$MetroFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealPasscodeFlowStarter.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, IntentLauncher.MetroFactory metroFactory2, InstanceFactory instanceFactory, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DelegateFactory delegateFactory, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck6, RealSessionFlags.MetroFactory metroFactory3, LocalViewFactory.MetroFactory metroFactory4, InstanceFactory instanceFactory2, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8) {
            this.contactSupportNavigator = lambdaProvider;
            this.linkNavigator = doubleCheck;
            this.viewedArticlesStore = metroFactory;
            this.supportStatus = doubleCheck2;
            this.launcher = lambdaProvider2;
            this.routerFactory = metroFactory2;
            this.articlesService = instanceFactory;
            this.transactionService = doubleCheck3;
            this.analytics = doubleCheck4;
            this.supportPhoneService = doubleCheck5;
            this.incidentsService = delegateFactory;
            this.activityDataBridge = lambdaProvider3;
            this.viewTokenGenerator = doubleCheck6;
            this.stringManager = metroFactory3;
            this.dateFormatManager = metroFactory4;
            this.clock = instanceFactory2;
            this.observabilityManager = doubleCheck7;
            this.moshi = doubleCheck8;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBadger2.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, RealSessionFlags.MetroFactory metroFactory2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck3, AndroidFileSaver.MetroFactory metroFactory3, DelegateFactory delegateFactory, RealSessionFlags.MetroFactory metroFactory4, RealMessageSigner.MetroFactory metroFactory5, DoubleCheck doubleCheck4, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, ScoreUiFactory.MetroFactory metroFactory6, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, IntentLauncher.MetroFactory metroFactory7, RealRecipientRepository.MetroFactory metroFactory8, LambdaProvider lambdaProvider2) {
            this.articlesService = doubleCheck;
            this.contactSupportNavigator = metroFactory;
            this.transactionService = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.linkNavigator = metroFactory2;
            this.viewedArticlesStore = walletUiFactory$MetroFactory;
            this.analytics = doubleCheck3;
            this.incidentsService = metroFactory3;
            this.activityDataBridge = delegateFactory;
            this.supportStatus = metroFactory4;
            this.launcher = metroFactory5;
            this.supportPhoneService = doubleCheck4;
            this.routerFactory = realDrawerOpener$MetroFactory;
            this.viewTokenGenerator = metroFactory6;
            this.clock = attestedKeyMetrics$MetroFactory;
            this.observabilityManager = metroFactory7;
            this.moshi = metroFactory8;
            this.dateFormatManager = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, CashNavigationLogger.MetroFactory metroFactory, RealTrifleService.MetroFactory metroFactory2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, BreadcrumbListener.MetroFactory metroFactory3, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck6, IntentLauncher.MetroFactory metroFactory4, InstanceFactory instanceFactory, LambdaProvider lambdaProvider5, DoubleCheck doubleCheck7) {
            this.articlesService = doubleCheck;
            this.transactionService = doubleCheck2;
            this.contactSupportNavigator = broadwayModule$ProvideBroadwayMetroFactory;
            this.linkNavigator = metroFactory;
            this.viewedArticlesStore = metroFactory2;
            this.analytics = doubleCheck3;
            this.supportPhoneService = doubleCheck4;
            this.supportStatus = metroFactory3;
            this.incidentsService = doubleCheck5;
            this.stringManager = lambdaProvider;
            this.dateFormatManager = lambdaProvider2;
            this.clock = lambdaProvider3;
            this.observabilityManager = lambdaProvider4;
            this.activityDataBridge = doubleCheck6;
            this.launcher = metroFactory4;
            this.routerFactory = instanceFactory;
            this.moshi = lambdaProvider5;
            this.viewTokenGenerator = doubleCheck7;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, FillrInitializer.MetroFactory metroFactory, DoubleCheck doubleCheck, FillrInitializer.MetroFactory metroFactory2, AndroidFileSaver.MetroFactory metroFactory3, TreehouseFlows.MetroFactory metroFactory4, FillrInitializer.MetroFactory metroFactory5, RealKnotLauncher.MetroFactory metroFactory6, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory5, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.contactSupportNavigator = instanceFactory;
            this.linkNavigator = instanceFactory2;
            this.stringManager = lambdaProvider;
            this.viewedArticlesStore = instanceFactory3;
            this.supportStatus = instanceFactory4;
            this.transactionService = metroFactory;
            this.articlesService = doubleCheck;
            this.launcher = metroFactory2;
            this.analytics = metroFactory3;
            this.routerFactory = metroFactory4;
            this.supportPhoneService = metroFactory5;
            this.incidentsService = metroFactory6;
            this.dateFormatManager = lambdaProvider2;
            this.clock = lambdaProvider3;
            this.activityDataBridge = instanceFactory5;
            this.observabilityManager = lambdaProvider4;
            this.moshi = lambdaProvider5;
            this.viewTokenGenerator = musicViewFactory$MetroFactory;
        }
    }
}
