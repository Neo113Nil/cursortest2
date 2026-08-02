package com.squareup.util.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextStyle;
import androidx.glance.appwidget.WidgetLayoutKt;
import androidx.glance.appwidget.protobuf.Utf8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.sqldelight.TransactionCallbacks;
import coil3.RealImageLoader;
import com.fillr.analytics.util.HttpService;
import com.fillr.browsersdk.BrowserSDKLogger$Companion;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.featuretoggle.strategy.StrategyUtils;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.card.onboarding.CardPillTheme;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.db.Session;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.score.viewmodels.ProfileAvatarViewModel;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.session.backend.DbSessionManager;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.session.backend.FullSessionWithoutAccountTokenError;
import com.squareup.cash.session.backend.UnexpectedSessionStatusDowngradeError;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.shopping.views.search.ShopMessageKt;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewModel;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.views.transcript.message.ActivityTransactionKt$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageRetryKt$$ExternalSyntheticLambda13;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationResult;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SessionStatus;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda4;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import dev.chrisbanes.haze.HazeState;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes7.dex */
public final /* synthetic */ class LifecycleKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ LifecycleKt$$ExternalSyntheticLambda0(MutableSharedFlow mutableSharedFlow, Function0 function0, Function1 function1, MutableState mutableState) {
        this.$r8$classId = 9;
        this.f$0 = mutableSharedFlow;
        this.f$1 = function0;
        this.f$2 = function1;
        this.f$3 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 1;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LifecycleKt.LifecycleLaunchedEffect((Object[]) obj6, (LifecycleOwner) obj5, (Lifecycle.State) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                CalloutKt.RecommendationSheet((CashCreditScoreHomeData.RecommendationOverlayData) obj6, (StyledCardViewModel) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                CalloutKt.RecommendationSheetContent((CashCreditScoreHomeData.RecommendationOverlayData) obj6, (StyledCardViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                CalloutKt.ScoreSummary((CashCreditScoreHomeData.ScoreSummary) obj6, (ProfileAvatarViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ResponseContext responseContext = (ResponseContext) obj6;
                ErrorReporter errorReporter = ((DbSessionManager) obj5).errorReporter;
                Exception exc = (Exception) obj4;
                String str = (String) obj3;
                Session session = (Session) obj2;
                ((TransactionCallbacks) obj).getClass();
                session.getClass();
                String str2 = session.target_account_token;
                com.squareup.cash.session.backend.Session session2 = DbSessionManagerKt.getSession(session);
                if (session2 == null) {
                    return session;
                }
                String str3 = session2.token;
                SessionStatus sessionStatus = session2.status;
                String str4 = responseContext.session_account_token;
                SessionStatus sessionStatus2 = responseContext.session_status;
                SessionStatus sessionStatus3 = SessionStatus.FULL;
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                if (sessionStatus2 == sessionStatus3 && str4 == null && sessionStatus != sessionStatus3) {
                    errorReporter.report(new FullSessionWithoutAccountTokenError(exc), defaultSamplingStrategy);
                }
                if (sessionStatus == sessionStatus3 && sessionStatus2 != null && sessionStatus2 != sessionStatus3) {
                    errorReporter.report(new UnexpectedSessionStatusDowngradeError(sessionStatus2, str, exc), defaultSamplingStrategy);
                }
                String str5 = responseContext.session_token;
                String str6 = str5 == null ? str3 : str5;
                if (sessionStatus2 == null) {
                    sessionStatus2 = sessionStatus;
                }
                return (Intrinsics.areEqual(str6, str3) && sessionStatus2 == sessionStatus) ? session : Session.copy$default(session, null, str4 != null ? str4 : session.account_token, Intrinsics.areEqual(str4, str2) ? null : str2, str6, Long.valueOf(sessionStatus2.value), false, 97);
            case 5:
                ((Integer) obj2).getClass();
                ShopMessageKt.CardAvatarSectionView((DirectoryListItem.CardAvatarSectionViewModel) obj6, (RealImageLoader) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ShopMessageKt.ShopMessage((DirectoryListItem.MessageSectionViewModel) obj6, (RealImageLoader) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                WidgetLayoutKt.HomeContent((StablecoinHomeViewModel) obj6, (RealImageLoader) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                Utf8.DecodeUtil.StablecoinDisclosureWidget((StablecoinHomeDisclosuresWidgetViewModel) obj6, (Function1) obj5, (PaddingValues) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 9:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj6;
                Function0 function0 = (Function0) obj5;
                Function1 function1 = (Function1) obj4;
                State state = (State) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SupportActivityItemLoader.State state2 = (SupportActivityItemLoader.State) state.getValue();
                    if (Intrinsics.areEqual(state2, SupportActivityItemLoader.State.Failure.INSTANCE)) {
                        gapComposer.startReplaceGroup(-305414106);
                        boolean changedInstance = gapComposer.changedInstance(mutableSharedFlow);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ActivityTransactionKt$$ExternalSyntheticLambda3(mutableSharedFlow, 1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        MessageFileKt.ActivityFailedToLoadContent(0, gapComposer, Modifier.Companion.$$INSTANCE, (Function0) rememberedValue);
                        gapComposer.end(false);
                    } else if (Intrinsics.areEqual(state2, SupportActivityItemLoader.State.Failure.INSTANCE$1)) {
                        gapComposer.startReplaceGroup(-305408445);
                        MessageFileKt.ActivityLoadingContent(function0, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        if (!(state2 instanceof SupportActivityItemLoader.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -305416550, false);
                        }
                        gapComposer.startReplaceGroup(-305404342);
                        SupportActivityItemLoader.State.Success success = (SupportActivityItemLoader.State.Success) state2;
                        ActivityItemViewModel activityItemViewModel = success.activityItemViewModel;
                        boolean changedInstance2 = gapComposer.changedInstance(state2) | gapComposer.changed(function0) | gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new BasicShieetScope$$ExternalSyntheticLambda10(20, function0, function1, success);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        MessageFileKt.ActivityLoadedContent(activityItemViewModel, (Function0) rememberedValue2, gapComposer, 0);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                String str7 = (String) obj6;
                Function1 function12 = (Function1) obj5;
                Function1 function13 = (Function1) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(str7) | gapComposer2.changed(function12) | gapComposer2.changed(function13);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MessageRetryKt$$ExternalSyntheticLambda13(str7, function13, function12, 2);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function02 = (Function0) rememberedValue3;
                    boolean changed2 = gapComposer2.changed(str7) | gapComposer2.changed(function14) | gapComposer2.changed(function13);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new MessageRetryKt$$ExternalSyntheticLambda13(str7, function13, function14, 3);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    MessageFileKt.MessageRetryPopupMenuContent(function02, (Function0) rememberedValue4, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SupportFullScreenActivityPickerView((SupportFullScreenActivityPickerViewModel) obj6, (Function1) obj5, (RealImageLoader) obj4, (RealCashVibrator) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState = (MutableState) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                MutableState mutableState4 = (MutableState) obj3;
                RecurringReloadConfigurationResult recurringReloadConfigurationResult = (RecurringReloadConfigurationResult) obj2;
                ((RecurringReloadConfigurationQuestion) obj).getClass();
                if (recurringReloadConfigurationResult instanceof RecurringReloadConfigurationResult.ScheduledReloadResult) {
                    mutableState.setValue(Boolean.TRUE);
                    RecurringReloadConfigurationResult.ScheduledReloadResult scheduledReloadResult = (RecurringReloadConfigurationResult.ScheduledReloadResult) recurringReloadConfigurationResult;
                    mutableState2.setValue(scheduledReloadResult.frequency);
                    mutableState3.setValue(scheduledReloadResult.dayOfPeriod);
                    mutableState4.setValue(scheduledReloadResult.amount);
                } else if (!(recurringReloadConfigurationResult instanceof RecurringReloadConfigurationResult.BalanceBasedReloadResult) && recurringReloadConfigurationResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.Header((Modifier) obj6, (String) obj5, (TextStyle) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                CardAppletTileKt.PillUi((Modifier) obj6, (HazeState) obj5, (CardPillTheme) obj4, (CardAppletTileViewModel.CardPillViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                HeroCardViewKt.CardHomeButtons((CardSchemeViewModel.Module.HeroCard) obj6, (CardSchemeViewModel.Module.Accessory.Button) obj5, (CardSchemeViewModel.Module.Accessory.Button) obj4, (MutableInteractionSourceImpl) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                UtilsKt.NextUpDismissibleContainer((Modifier) obj6, (Function0) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.JobPickerContent((List) obj6, (JobIdentifier) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.LocationPickerContent((List) obj6, (LocationIdentifier) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ShiftListViewKt.ShiftListContent((ImmutableList) obj6, (LocalDate) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                AccountPickerState.Payload payload = (AccountPickerState.Payload) obj6;
                Function1 function15 = (Function1) obj5;
                AccountPickerState accountPickerState = (AccountPickerState) obj4;
                Function0 function03 = (Function0) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (payload == null) {
                        gapComposer3.startReplaceGroup(-104176640);
                    } else {
                        gapComposer3.startReplaceGroup(-104176639);
                        AccountPickerScreenKt.Footer(payload.dataAccessDisclaimer, function15, !accountPickerState.selectedIds.isEmpty(), (accountPickerState.payload instanceof Async.Loading) || (accountPickerState.selectAccounts instanceof Async.Loading), function03, accountPickerState.selectedIds, gapComposer3, 0);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                HttpService.ErrorContent((Throwable) obj6, (Function0) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                BrowserSDKLogger$Companion.ConsentFooter((Async) obj6, (ConsentPane) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                BrowserSDKLogger$Companion.ConsentContent((ConsentState) obj6, (Function0) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ConsentState.Payload payload2 = (ConsentState.Payload) obj6;
                Async async = (Async) obj5;
                Function1 function16 = (Function1) obj4;
                Function0 function04 = (Function0) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    BrowserSDKLogger$Companion.ConsentFooter(async, payload2.consent, function16, function04, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                FinancialConnectionsGenericInfoScreen.Footer footer = (FinancialConnectionsGenericInfoScreen.Footer) obj6;
                Function0 function05 = (Function0) obj5;
                Function0 function06 = (Function0) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    FillrWidget.WidgetType.AnonymousClass1.GenericFooter(footer, null, function05, function06, function17, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.SearchRow((Modifier) obj6, (FocusRequester) obj5, (String) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                StrategyUtils.IDConsentContent((IDConsentContentState) obj6, (Function0) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) obj6;
                State state3 = (State) obj5;
                NavHostController navHostController = (NavHostController) obj4;
                Destination destination = (Destination) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i3 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    TextKt.FinancialConnectionsScaffold(Expect_jvmKt.rememberComposableLambda(1045885766, new FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda4(financialConnectionsSheetNativeActivity, state3, i2), gapComposer6), Expect_jvmKt.rememberComposableLambda(1178447874, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(22, navHostController, destination), gapComposer6), gapComposer6, 54);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                TextKt.FinancialConnectionsBottomSheetLayout((StripeBottomSheetState) obj6, (Modifier) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(3081));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LifecycleKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ LifecycleKt$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
