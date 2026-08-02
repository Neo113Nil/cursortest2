package com.squareup.cash.support.navigation;

import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessStart;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportUnauthenticatedAccess;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionMapper;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import squareup.cash.paychecks.UiState;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealSupportNavigator {
    public final Analytics analytics;
    public final FeatureFlagManager featureFlagManager;
    public final SessionManager sessionManager;
    public final SyncValueReader syncValueReader;
    public final RealSupportViewedArticlesStore viewedArticlesStore;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SupportNavigator$Source.values().length];
            try {
                SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.PROFILE;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source2 = SupportNavigator$Source.PROFILE;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source3 = SupportNavigator$Source.PROFILE;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source4 = SupportNavigator$Source.PROFILE;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source5 = SupportNavigator$Source.PROFILE;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source6 = SupportNavigator$Source.PROFILE;
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source7 = SupportNavigator$Source.PROFILE;
                iArr[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source8 = SupportNavigator$Source.PROFILE;
                iArr[9] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source9 = SupportNavigator$Source.PROFILE;
                iArr[10] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source10 = SupportNavigator$Source.PROFILE;
                iArr[6] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source11 = SupportNavigator$Source.PROFILE;
                iArr[3] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source12 = SupportNavigator$Source.PROFILE;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                SupportNavigator$Source supportNavigator$Source13 = SupportNavigator$Source.PROFILE;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealSupportNavigator(Analytics analytics, RealSupportViewedArticlesStore realSupportViewedArticlesStore, RealFlowTokenGenerator realFlowTokenGenerator, FeatureFlagManager featureFlagManager, SessionManager sessionManager, SupportTransactionMapper supportTransactionMapper, SyncValueReader syncValueReader) {
        this.analytics = analytics;
        this.viewedArticlesStore = realSupportViewedArticlesStore;
        this.featureFlagManager = featureFlagManager;
        this.sessionManager = sessionManager;
        this.syncValueReader = syncValueReader;
    }

    public static /* synthetic */ void logAccessSupport$default(RealSupportNavigator realSupportNavigator, SupportNavigator$Source supportNavigator$Source, CustomerSupportAccessStart.Destination destination, Screen screen, String str, String str2, String str3, BlockersData.MoneybotContext moneybotContext, int i) {
        if ((i & 4) != 0) {
            screen = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            moneybotContext = null;
        }
        realSupportNavigator.logAccessSupport(supportNavigator$Source, destination, screen, str, str2, str3, moneybotContext);
    }

    public static Screen startSupportChat$default(RealSupportNavigator realSupportNavigator, String str, String str2, Screen screen, SupportNavigator$Source supportNavigator$Source, BlockersData.MoneybotContext moneybotContext, String str3, int i) {
        String str4;
        if ((i & 1) != 0) {
            str = null;
        }
        String str5 = (i & 2) != 0 ? null : str2;
        BlockersData.MoneybotContext moneybotContext2 = (i & 16) != 0 ? null : moneybotContext;
        String str6 = (i & 32) == 0 ? str3 : null;
        SupportScreens.UnauthenticatedArticleScreen showUnauthenticatedArticleScreenIfNecessary = realSupportNavigator.showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source);
        if (showUnauthenticatedArticleScreenIfNecessary != null) {
            return showUnauthenticatedArticleScreenIfNecessary;
        }
        if (str6 == null) {
            if (str == null) {
                BlockersData.Flow.INSTANCE.getClass();
                str = BlockersData.Flow.Companion.generateToken();
            }
            str4 = str;
        } else {
            str4 = str6;
        }
        String str7 = str5;
        BlockersData.MoneybotContext moneybotContext3 = moneybotContext2;
        logAccessSupport$default(realSupportNavigator, supportNavigator$Source, CustomerSupportAccessStart.Destination.CHAT, screen, str4, str7, null, moneybotContext3, 32);
        return new SupportChatScreens.FlowScreen.ChatLoading(screen, str7, null, str4, WhenMappings.$EnumSwitchMapping$0[supportNavigator$Source.ordinal()] == 1 ? SupportChatScreens.FlowScreen.ChatLoading.Source.NOTIFICATION : SupportChatScreens.FlowScreen.ChatLoading.Source.OTHER, moneybotContext3, 4);
    }

    public static SupportScreens startSupportFlow$default(RealSupportNavigator realSupportNavigator, String str, String str2, Screen screen, SupportNavigator$Source supportNavigator$Source, BlockersData.MoneybotContext moneybotContext, String str3, int i) {
        String str4 = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        SupportNavigator$Source supportNavigator$Source2 = (i & 16) != 0 ? SupportNavigator$Source.UNKNOWN : supportNavigator$Source;
        BlockersData.MoneybotContext moneybotContext2 = (i & 32) != 0 ? null : moneybotContext;
        String str6 = (i & 64) != 0 ? null : str3;
        realSupportNavigator.getClass();
        screen.getClass();
        SupportScreens.UnauthenticatedArticleScreen showUnauthenticatedArticleScreenIfNecessary = realSupportNavigator.showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source2);
        if (showUnauthenticatedArticleScreenIfNecessary != null) {
            return showUnauthenticatedArticleScreenIfNecessary;
        }
        if (str6 == null) {
            BlockersData.Flow.INSTANCE.getClass();
            str6 = BlockersData.Flow.Companion.generateToken();
        }
        String str7 = str6;
        SupportScreens.FlowScreens.Data data = new SupportScreens.FlowScreens.Data(str7, str4, str5, screen, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        if (str4 != null) {
            realSupportNavigator.viewedArticlesStore.add(new RecentlyViewedNode(str4));
        }
        if (str4 == null) {
            logAccessSupport$default(realSupportNavigator, supportNavigator$Source2, CustomerSupportAccessStart.Destination.HOME, screen, str7, str5, null, moneybotContext2, 32);
            return new SupportScreens.FlowScreens.SupportHomeScreen(null, data, null, 60);
        }
        String str8 = str4;
        realSupportNavigator.logAccessSupport(supportNavigator$Source2, CustomerSupportAccessStart.Destination.NODE, screen, str7, str5, str8, moneybotContext2);
        return new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken(str8), data, false, 20);
    }

    public final void logAccessSupport(SupportNavigator$Source supportNavigator$Source, CustomerSupportAccessStart.Destination destination, Screen screen, String str, String str2, String str3, BlockersData.MoneybotContext moneybotContext) {
        CustomerSupportAccessStart.Trigger trigger;
        UiState uiState = (UiState) this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PaychecksUiState).getValue();
        Boolean bool = uiState != null ? uiState.customer_is_denylisted : null;
        switch (supportNavigator$Source.ordinal()) {
            case 0:
                trigger = CustomerSupportAccessStart.Trigger.PROFILE;
                break;
            case 1:
                trigger = CustomerSupportAccessStart.Trigger.NOTIFICATION;
                break;
            case 2:
                trigger = CustomerSupportAccessStart.Trigger.RECEIPT;
                break;
            case 3:
            case 5:
            case 6:
            case 11:
            case 12:
                trigger = CustomerSupportAccessStart.Trigger.OTHER;
                break;
            case 4:
                trigger = CustomerSupportAccessStart.Trigger.DEEP_LINK;
                break;
            case 7:
                trigger = CustomerSupportAccessStart.Trigger.MONEYBOT;
                break;
            case 8:
                trigger = CustomerSupportAccessStart.Trigger.BLOCKER_FLOW;
                break;
            case 9:
                trigger = CustomerSupportAccessStart.Trigger.MONEY;
                break;
            case 10:
                trigger = CustomerSupportAccessStart.Trigger.CARD;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        this.analytics.track(new CustomerSupportAccessStart(destination, str, trigger, str2, str3, screen != null ? Reflection.factory.getOrCreateKotlinClass(screen.getClass()).getSimpleName() : null, bool, moneybotContext != null ? moneybotContext.toolRequestId : null, moneybotContext != null ? moneybotContext.sessionId : null), null);
    }

    public final SupportScreens.UnauthenticatedArticleScreen showUnauthenticatedArticleScreenIfNecessary(SupportNavigator$Source supportNavigator$Source) {
        if (!(PlatformKt.getCurrentSessionState(this.sessionManager) instanceof SessionState.Authenticated)) {
            FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = (FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SupportUnauthenticatedAccess.INSTANCE);
            featureFlag$StringFeatureFlag$Value.getClass();
            String str = featureFlag$StringFeatureFlag$Value.value;
            String str2 = (Intrinsics.areEqual(str, "DISABLED") || Intrinsics.areEqual(str, "UNASSIGNED")) ? null : str;
            if (str2 != null) {
                BlockersData.Flow.INSTANCE.getClass();
                String generateToken = BlockersData.Flow.Companion.generateToken();
                logAccessSupport$default(this, supportNavigator$Source, CustomerSupportAccessStart.Destination.NODE, null, generateToken, null, str2, null, 84);
                return new SupportScreens.UnauthenticatedArticleScreen(str2, generateToken, null, null);
            }
            Timber.Forest.e(new IllegalStateException("Support accessed before customer fully authenticated."));
        }
        return null;
    }

    public final SupportScreens startSupportHome(String str, Screen screen, SupportNavigator$Source supportNavigator$Source, BlockersData.MoneybotContext moneybotContext, String str2) {
        screen.getClass();
        SupportScreens.UnauthenticatedArticleScreen showUnauthenticatedArticleScreenIfNecessary = showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source);
        if (showUnauthenticatedArticleScreenIfNecessary != null) {
            return showUnauthenticatedArticleScreenIfNecessary;
        }
        if (str2 == null) {
            BlockersData.Flow.INSTANCE.getClass();
            str2 = BlockersData.Flow.Companion.generateToken();
        }
        String str3 = str2;
        logAccessSupport$default(this, supportNavigator$Source, CustomerSupportAccessStart.Destination.HOME, screen, str3, str, null, moneybotContext, 32);
        return new SupportScreens.FlowScreens.SupportHomeScreen(null, new SupportScreens.FlowScreens.Data(str3, null, str, screen, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE), supportNavigator$Source == SupportNavigator$Source.RECEIPT ? SupportScreens.FlowScreens.BackNavigationAction.BACK : SupportScreens.FlowScreens.BackNavigationAction.CLOSE, 28);
    }

    public final Screen startSupportSurvey(String str) {
        str.getClass();
        SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.UNKNOWN;
        SupportScreens.UnauthenticatedArticleScreen showUnauthenticatedArticleScreenIfNecessary = showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source);
        if (showUnauthenticatedArticleScreenIfNecessary != null) {
            return showUnauthenticatedArticleScreenIfNecessary;
        }
        BlockersData.Flow.INSTANCE.getClass();
        logAccessSupport$default(this, supportNavigator$Source, CustomerSupportAccessStart.Destination.SURVEY, null, BlockersData.Flow.Companion.generateToken(), null, null, null, 116);
        return new SupportChatScreens.FlowScreen.ChatSurveyScreen(str);
    }
}
