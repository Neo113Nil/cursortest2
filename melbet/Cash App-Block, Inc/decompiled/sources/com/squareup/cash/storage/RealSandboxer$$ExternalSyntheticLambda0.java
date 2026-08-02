package com.squareup.cash.storage;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.ui.Ui;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileOsP2pRecipientContactsReorder;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.reactions.views.ChooseReactionOverlay$$ExternalSyntheticLambda4;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.savings.db.SavingsGoalLocalStatusQueries$getGoalStatus$2;
import com.squareup.cash.savings.viewmodels.HeroNumericsBodyTextViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.cash.sheet.BottomSheetState;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.db.ImageType;
import com.squareup.cash.shopping.db.ShopInfoDetailsQueries$forId$2;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewed;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewedQueries$recentlyViewed$2;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.stablecoin.presenters.widgets.RealStablecoinWelcomeWidgetPresenter;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.backend.real.RealScreenshotService$uploadAndSendJob$1$1;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.support.chat.views.transcript.message.MessageBodyLayout;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotResult;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.tabs.views.SwipeControlPlacement;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.ui.BottomSheetStateListener;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
import com.squareup.util.cash.Countries;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowImpl;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;
import okio.Path;
import squareup.cash.savings.SavingsApplet;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealSandboxer$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RealSandboxer$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, byte b) {
        this.$r8$classId = 12;
        ShopInfoDetailsQueries$forId$2 shopInfoDetailsQueries$forId$2 = ShopInfoDetailsQueries$forId$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.squareup.cash.db.WireAdapter] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.squareup.cash.db.WireAdapter] */
    /* JADX WARN: Type inference failed for: r2v19, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.squareup.cash.db.WireAdapter] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.util.AttributeSet, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        boolean z = true;
        int i5 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Path path = (Path) obj;
                path.getClass();
                if (!path.equals((Path) obj2) && !RealSandboxer.preferencesKeepSet.contains(path.name())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                boolean z2 = ((QrCodeProfileViewModel) obj2).showUpdatedSharingUi;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                if (z2) {
                    snapshotStateList.add(CameraXPreviewKt.lambda$1646122024);
                    snapshotStateList.add(CameraXPreviewKt.lambda$961770065);
                } else {
                    snapshotStateList.add(CameraXPreviewKt.lambda$2109618751);
                    snapshotStateList.add(CameraXPreviewKt.f645lambda$85504344);
                }
                return Unit.INSTANCE;
            case 2:
                ChooseReactionOverlay chooseReactionOverlay = (ChooseReactionOverlay) obj2;
                String str = (String) obj;
                str.getClass();
                chooseReactionOverlay.goToStateAnimator(ChooseReactionOverlay.State.SubmittingReaction).start();
                Ui.EventReceiver eventReceiver = chooseReactionOverlay.eventReceiver;
                if (eventReceiver == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                eventReceiver.sendEvent(new ReactionViewEvent.SubmitReaction(str));
                final BottomSheet bottomSheet = chooseReactionOverlay.sheet;
                if (bottomSheet != null) {
                    final ChooseReactionOverlay$$ExternalSyntheticLambda4 chooseReactionOverlay$$ExternalSyntheticLambda4 = new ChooseReactionOverlay$$ExternalSyntheticLambda4(chooseReactionOverlay, i5);
                    BottomSheetState bottomSheetState = bottomSheet.currentState;
                    BottomSheetState bottomSheetState2 = BottomSheetState.SYSTEM_DISMISSED;
                    if (bottomSheetState == bottomSheetState2) {
                        chooseReactionOverlay$$ExternalSyntheticLambda4.invoke();
                    } else {
                        bottomSheet.addOnStateChangeListener(new BottomSheetStateListener() { // from class: com.squareup.cash.sheet.BottomSheet$dismiss$listener$1
                            @Override // com.squareup.cash.ui.BottomSheetStateListener
                            public final void onBottomSheetStateChange(BottomSheetState bottomSheetState3) {
                                bottomSheetState3.getClass();
                                if (bottomSheetState3 == BottomSheetState.SYSTEM_DISMISSED) {
                                    BottomSheet bottomSheet2 = BottomSheet.this;
                                    bottomSheet2.stateListeners.remove(this);
                                    bottomSheet2.post(new Task$$ExternalSyntheticLambda0(chooseReactionOverlay$$ExternalSyntheticLambda4, 1));
                                }
                            }
                        });
                        bottomSheet.setCurrentState(bottomSheetState2);
                        bottomSheet.moveSheetToStateAnimator(bottomSheet.currentState).start();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj;
                recipientSuggestionsProvider$RecipientWithAnalyticsData.getClass();
                boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((RealRecipientSuggestionsProvider) obj2).featureFlagManager).currentValue(AmplitudeExperiments$MobileOsP2pRecipientContactsReorder.INSTANCE)).enabled();
                Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
                return enabled ? Boolean.valueOf(!recipient.isCashCustomer) : Boolean.valueOf(!recipient.isRecent);
            case 4:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, ((RecurringPreferenceQueries.SelectForIdQuery) obj2).entity_id);
                return Unit.INSTANCE;
            case 5:
                TimelineView timelineView = (TimelineView) obj;
                timelineView.getClass();
                timelineView.setModel(((PaymentPlanSummaryViewModel.TimelineSection) obj2).legacyTimeline);
                return Unit.INSTANCE;
            case 6:
                SavingsApplet savingsApplet = (SavingsApplet) obj;
                savingsApplet.getClass();
                return KeyEventDispatcher.toSavingsApplet((SyncValuesBasedSavingsBalanceStore) obj2, savingsApplet);
            case 7:
                SavingsGoalLocalStatusQueries$getGoalStatus$2 savingsGoalLocalStatusQueries$getGoalStatus$2 = SavingsGoalLocalStatusQueries$getGoalStatus$2.INSTANCE;
                RecipientConfig$Adapter recipientConfig$Adapter = (RecipientConfig$Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Boolean bool = androidCursor.getBoolean(1);
                Boolean m = Matcher$$ExternalSyntheticOutline0.m(bool, androidCursor, 2);
                String string2 = androidCursor.getString(3);
                ?? bytes = androidCursor.getBytes(4);
                Money money = bytes != 0 ? (Money) recipientConfig$Adapter.pay_dataAdapter.decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(5);
                return savingsGoalLocalStatusQueries$getGoalStatus$2.invoke(m1431m, bool, m, string2, money, bytes2 != 0 ? (Money) recipientConfig$Adapter.request_dataAdapter.decode(bytes2) : 0, androidCursor.getLong(6));
            case 8:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 9:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                return (Document) BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((BlockersConfig.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).target_balance_amountAdapter);
            case 10:
                HeroNumericsBodyTextViewModel heroNumericsBodyTextViewModel = (HeroNumericsBodyTextViewModel) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str2 = heroNumericsBodyTextViewModel.accessibilityHint;
                if (str2 == null) {
                    str2 = heroNumericsBodyTextViewModel.text;
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                return Unit.INSTANCE;
            case 11:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalAmountRemaining goalAmountRemaining = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalAmountRemaining) ((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer) obj2);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, goalAmountRemaining.amount.label + " " + goalAmountRemaining.subtitle);
                return Unit.INSTANCE;
            case 12:
                ShopInfoDetailsQueries$forId$2 shopInfoDetailsQueries$forId$2 = ShopInfoDetailsQueries$forId$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                Long m2 = re$$ExternalSyntheticOutline0.m(androidCursor3, 0);
                Long l = androidCursor3.getLong(1);
                l.getClass();
                return shopInfoDetailsQueries$forId$2.invoke(m2, l, BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 2, ((Local_tab_content.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).responseAdapter));
            case 13:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 14:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 15:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 16:
                ShoppingRecentlyViewedQueries$recentlyViewed$2 shoppingRecentlyViewedQueries$recentlyViewed$2 = ShoppingRecentlyViewedQueries$recentlyViewed$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor4, 0);
                String string3 = androidCursor4.getString(1);
                String string4 = androidCursor4.getString(2);
                String string5 = androidCursor4.getString(3);
                String string6 = androidCursor4.getString(4);
                Long l2 = androidCursor4.getLong(5);
                l2.getClass();
                ?? bytes3 = androidCursor4.getBytes(6);
                Color color = bytes3 != 0 ? (Color) ((Category$Adapter) gpsConfigQueries.gpsConfigAdapter).category_colorAdapter.decode(bytes3) : null;
                String string7 = androidCursor4.getString(7);
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 8, ((Category$Adapter) gpsConfigQueries.gpsConfigAdapter).prefix_iconAdapter);
                Enum m4 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 9, ((Category$Adapter) gpsConfigQueries.gpsConfigAdapter).typeAdapter);
                long longValue = l2.longValue();
                Metadata.EntityType entityType = (Metadata.EntityType) m3;
                ImageType imageType = (ImageType) m4;
                m1431m2.getClass();
                entityType.getClass();
                imageType.getClass();
                return new ShoppingRecentlyViewed(m1431m2, string3, string4, string5, string6, longValue, color, string7, entityType, imageType);
            case 17:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 18:
                ((Context) obj).getClass();
                Context context = ((SquareLoyaltyDetailsView) obj2).getContext();
                context.getClass();
                FigmaTextView figmaTextView = new FigmaTextView(context, r8, i4, r8);
                figmaTextView.setGravity(17);
                figmaTextView.setTextAlignment(4);
                figmaTextView.setTextIsSelectable(true);
                figmaTextView.setMovementMethod(BetterLinkMovementMethod.getInstance());
                return figmaTextView;
            case 19:
                ((DisposableEffectScope) obj).getClass();
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1((RealStablecoinNullStateCarouselPresenter) obj2, i4);
            case 20:
                StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked stablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked = (StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked) obj;
                stablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked.getClass();
                ((IntentLauncher) ((RealStablecoinWelcomeWidgetPresenter) obj2).stateManager).launchUrlInInternalBrowser(stablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked.url);
                return Unit.INSTANCE;
            case 21:
                RealSessionedLink realSessionedLink = (RealSessionedLink) obj2;
                ((TransactionWrapper) obj).getClass();
                realSessionedLink.checkAndResetForceLegacy.invoke();
                boolean booleanValue = Boolean.FALSE.booleanValue();
                SessionQueries sessionQueries = realSessionedLink.storageLinkQueries;
                if (booleanValue) {
                    sessionQueries.getClass();
                    sessionQueries.setActiveLink(null);
                    return StorageLink.Legacy.INSTANCE;
                }
                long j = Countries.getOrCreateOnboardingLink(sessionQueries).id;
                Long id = realSessionedLink.getActiveLink().getId();
                if (id == null || j != id.longValue()) {
                    sessionQueries.transactionWithWrapper(new StorageLinkQueriesKt$$ExternalSyntheticLambda0(sessionQueries, i5));
                    sessionQueries.setActiveLink(Long.valueOf(j));
                }
                return Countries.getOrCreateOnboardingLink(sessionQueries);
            case 22:
                HCaptcha hCaptcha = (HCaptcha) obj2;
                hCaptcha.internalConfig = null;
                if (((Throwable) obj) instanceof CancellationException) {
                    hCaptcha.notifyState(RealScreenshotService$uploadAndSendJob$1$1.INSTANCE);
                }
                return Unit.INSTANCE;
            case 23:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj2;
                ((DisposableEffectScope) obj).getClass();
                ((RealChatNotificationSuppressor) poolsListPresenter.dateFormatManager).onSurveyScreenState = true;
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(poolsListPresenter, i2);
            case 24:
                String str3 = (String) obj;
                str3.getClass();
                ((MessageBodyLayout) obj2).onUrlClick.invoke(str3);
                return Unit.INSTANCE;
            case 25:
                SupportScreens.ContactScreens.Data data = (SupportScreens.ContactScreens.Data) obj2;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                String str4 = data.flowToken;
                String str5 = data.supportNodeToken;
                return new SupportScreens.SupportSheets.SupportTransactionConfirmationSheet(new SupportScreens.FlowScreens.Data(str4, str5, data.paymentToken, str5, null, data.exitScreen, data.contactOption, data.includeIssueDescription), askedQuestion);
            case 26:
                RealScreenshotManager realScreenshotManager = (RealScreenshotManager) obj2;
                ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult = (ScreenshotManager$ScreenshotResult) obj;
                screenshotManager$ScreenshotResult.getClass();
                StateFlowImpl stateFlowImpl = realScreenshotManager.screenshotState;
                stateFlowImpl.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue(), true, null, null, null, false, 14));
                if (screenshotManager$ScreenshotResult instanceof ScreenshotManager$ScreenshotResult.Success) {
                    realScreenshotManager.runWithIoCoroutineScope(new TaxWebAppBridge$$ExternalSyntheticLambda0(i3, realScreenshotManager, screenshotManager$ScreenshotResult));
                } else {
                    if (!screenshotManager$ScreenshotResult.equals(ScreenshotManager$ScreenshotResult.Prohibited.INSTANCE) && !screenshotManager$ScreenshotResult.equals(ScreenshotManager$ScreenshotResult.Failed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    stateFlowImpl.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue(), false, null, screenshotManager$ScreenshotResult, null, false, 27));
                }
                return Unit.INSTANCE;
            case 27:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                realCellActivityAccessoryScope.amount(new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda6((DisputeRow) obj2, 23), true, 757992626));
                return Unit.INSTANCE;
            case 28:
                SwipeControlPlacement swipeControlPlacement = (SwipeControlPlacement) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                int mo838getSizeYbymL2g = (int) (ValueInsets.findRootCoordinates(layoutCoordinates).mo838getSizeYbymL2g() >> 32);
                if (mo838getSizeYbymL2g > 0) {
                    swipeControlPlacement.centerXFraction$delegate.setValue(Float.valueOf(Float.intBitsToFloat((int) (ValueInsets.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, true).m633getCenterF1C5BW0() >> 32)) / mo838getSizeYbymL2g));
                }
                return Unit.INSTANCE;
            default:
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click.getClass();
                if (promotedAppletTileViewEvent$Click.equals(PromotedAppletTileViewEvent$Click.INSTANCE)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public /* synthetic */ RealSandboxer$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 7;
        SavingsGoalLocalStatusQueries$getGoalStatus$2 savingsGoalLocalStatusQueries$getGoalStatus$2 = SavingsGoalLocalStatusQueries$getGoalStatus$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ RealSandboxer$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, char c) {
        this.$r8$classId = 16;
        ShoppingRecentlyViewedQueries$recentlyViewed$2 shoppingRecentlyViewedQueries$recentlyViewed$2 = ShoppingRecentlyViewedQueries$recentlyViewed$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ RealSandboxer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
