package com.squareup.cash.tax.presenters;

import android.app.StatusBarManager;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Build;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotMapKeySet;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateMapMutableKeysIterator;
import androidx.compose.ui.draw.ShadowKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.qg$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$TaxesDocumentsTaxReturnsData;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidUnsupportedSettingRouting;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.nearby.backend.NearbyIdentifier;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.OffersSearchMapperKt$WhenMappings;
import com.squareup.cash.offers.presenters.RealOffersAnalytics$Factory$Impl;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.screens.SheetStyle;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersRedemptionViewModel;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.QuickPayDetailsPresenter$WhenMappings;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewModel;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoIcon;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoInfoItem;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoItem;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoItemArticle;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewModel;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewModel;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.qrcodes.viewmodels.CashQrShortcutsOnboardingViewModel;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.securityhub.presenters.ProtectionsSectionPresenter;
import com.squareup.cash.securityhub.presenters.ProtectionsSectionPresenter$Factory$Impl;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.securityhub.viewmodels.SecurityHubUiModel;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.viewmodels.ScreenshotConfirmViewModel;
import com.squareup.cash.support.viewmodels.SupportTransactionConfirmationViewModel;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.screens.TapToPayFirstTimeScreen;
import com.squareup.cash.tax.backend.real.RealTaxesDocumentsTaxReturnsDataProvider;
import com.squareup.cash.tax.primitives.TaxTooltipModel;
import com.squareup.cash.tax.screens.TaxReturnsScreen;
import com.squareup.cash.tax.screens.TaxTooltipScreen;
import com.squareup.cash.tax.viewmodels.TaxReturnsViewModel;
import com.squareup.cash.tax.viewmodels.TaxTooltipViewModel;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.ui.qrcodes.RealQrShortcutInstaller;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.screens.PresentationTimelineScreen;
import com.squareup.cash.wallet.viewmodels.OverdraftCoverageListItemViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.applets.presenters.MerchantBranding;
import com.squareup.cash.work.applets.presenters.MerchantInfo;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader;
import com.squareup.cash.work.applets.presenters.ShiftsTileState;
import com.squareup.cash.work.applets.presenters.ShiftsTileViewModelBuilder$UpcomingShiftDisplay;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.LongPreference;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.protos.cash.nearby.api.v1.NearbySessionService;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.tax.DocumentsTaxReturnsConfiguration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.overdraft.OverdraftUsage;

/* loaded from: classes7.dex */
public final class TaxReturnsPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object args;
    public final Object navigator;
    public final Object router;
    public final Object taxesDocumentsTaxReturnsDataProvider;

    public TaxReturnsPresenter(CustomAllocationScreen customAllocationScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager) {
        this.$r8$classId = 3;
        this.taxesDocumentsTaxReturnsDataProvider = customAllocationScreen;
        this.navigator = screenNavigator;
        this.args = androidStringManager;
        this.router = LazyKt.lazy(new P2PListViewKt$$ExternalSyntheticLambda2(25));
    }

    private final Object models$com$squareup$cash$qrcodes$presenters$CashQrShortcutsOnboardingPresenter(Flow flow, Composer composer, int i) {
        QrShortcutInstaller qrShortcutInstaller = (QrShortcutInstaller) this.args;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(247164264);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new ShoppingWebBridge.AnonymousClass1(this, continuation, 15);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation, this, 23));
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            RealQrShortcutInstaller realQrShortcutInstaller = (RealQrShortcutInstaller) qrShortcutInstaller;
            rememberedValue2 = new CashQrShortcutsOnboardingViewModel(realQrShortcutInstaller.isWidgetPinSupported(), Build.VERSION.SDK_INT >= 33 && realQrShortcutInstaller.context.getSystemService(StatusBarManager.class) != null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        CashQrShortcutsOnboardingViewModel cashQrShortcutsOnboardingViewModel = (CashQrShortcutsOnboardingViewModel) rememberedValue2;
        gapComposer.end(false);
        return cashQrShortcutsOnboardingViewModel;
    }

    private final Object models$com$squareup$cash$securityhub$presenters$SecurityHubPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(158100232);
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new SheetKt$$ExternalSyntheticLambda9(3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Unit unit = Unit.INSTANCE;
        boolean changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ProfileCropView.AnonymousClass3(this, mutableState, continuation, 15);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 9));
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            ProtectionsSectionPresenter$Factory$Impl protectionsSectionPresenter$Factory$Impl = (ProtectionsSectionPresenter$Factory$Impl) this.router;
            SecurityHubScreen securityHubScreen = (SecurityHubScreen) this.taxesDocumentsTaxReturnsDataProvider;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
            securityHubScreen.getClass();
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = protectionsSectionPresenter$Factory$Impl.delegateFactory;
            AndroidStringManager androidStringManager = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
            RealSupportNavigator realSupportNavigator = (RealSupportNavigator) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
            androidStringManager.getClass();
            realSupportNavigator.getClass();
            ProtectionsSectionPresenter protectionsSectionPresenter = new ProtectionsSectionPresenter(securityHubScreen, screenNavigator, androidStringManager, realSupportNavigator);
            gapComposer.updateRememberedValue(protectionsSectionPresenter);
            rememberedValue3 = protectionsSectionPresenter;
        }
        ProtectionsSectionPresenter protectionsSectionPresenter2 = (ProtectionsSectionPresenter) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new RealRecipientRepository$suggestions$$inlined$map$1(flow, 7), 23);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider);
            rememberedValue4 = nullStateSwipeConfigProvider;
        }
        SecurityHubUiModel securityHubUiModel = new SecurityHubUiModel(protectionsSectionPresenter2.models((Flow) rememberedValue4, (Composer) gapComposer, 0));
        gapComposer.end(false);
        return securityHubUiModel;
    }

    private final Object models$com$squareup$cash$support$chat$presenters$ChatImageDetailPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-126379516);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new ChatInputView$Content$1$1$1(this, continuation, 15);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppPresenter$models$1$1(flow, continuation, (MoleculePresenter) this, mutableState, 8));
        ChatImageDetailViewModel chatImageDetailViewModel = new ChatImageDetailViewModel(((SupportChatScreens.FlowScreen.ChatImageDetail) this.router).url, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return chatImageDetailViewModel;
    }

    private final /* bridge */ /* synthetic */ Object models$com$squareup$cash$taptopay$presenters$TapToPayFirstTimeScreenPresenter(Flow flow, Composer composer, int i) {
        m3767models(flow, composer, i);
        return Unit.INSTANCE;
    }

    private final Object models$com$squareup$cash$tax$presenters$TaxTooltipPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2144401580);
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) null, this, 9));
        TaxTooltipScreen taxTooltipScreen = (TaxTooltipScreen) this.router;
        int i2 = taxTooltipScreen.anchorBottom;
        int i3 = taxTooltipScreen.anchorLeft;
        int i4 = taxTooltipScreen.anchorWidth;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.taxesDocumentsTaxReturnsDataProvider;
        TaxTooltipViewModel taxTooltipViewModel = new TaxTooltipViewModel(i2, i3, i4, new TaxTooltipModel(androidStringManager.get(R.string.tax_presenters_desktop_tooltip_title), androidStringManager.get(R.string.tax_presenters_desktop_tooltip_body), androidStringManager.get(R.string.tax_presenters_desktop_tooltip_button)));
        gapComposer.end(false);
        return taxTooltipViewModel;
    }

    private final Object models$com$squareup$cash$wallet$presenters$PresentationTimelinePresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(132922289);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new CameraHelper$unbind$2(this, continuation, 2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new CardAppletWorker$setup$1$2$1(flow, (Continuation) null, this, 6));
        PresentationTimelineViewModel presentationTimelineViewModel = ((PresentationTimelineScreen) this.taxesDocumentsTaxReturnsDataProvider).viewModel;
        gapComposer.end(false);
        return presentationTimelineViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0115, code lost:
    
        if (((com.squareup.cash.work.applets.presenters.ShiftsTileState.Loaded.ClockedOut) r1).upcomingShift != null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.squareup.protos.cash.shop.rendering.api.TapAction] */
    /* JADX WARN: Type inference failed for: r5v146 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        Object realKeyStoreProvider$setEntry$2;
        Continuation continuation;
        Object obj;
        MutableState mutableState;
        OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel;
        OffersFilterGroupSheetViewModel.Layout layout;
        FormattedResource formattedResource;
        Redacted redacted;
        FormattedResource formattedResource2;
        SnapshotStateMap snapshotStateMap;
        String str2;
        UiCustomer uiCustomer;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        String str7;
        String formatClockInTime;
        List list;
        TaxReturnsPresenter taxReturnsPresenter = this;
        int i2 = taxReturnsPresenter.$r8$classId;
        int i3 = 15;
        int i4 = 24;
        Object obj2 = taxReturnsPresenter.navigator;
        int i5 = 6;
        str = "";
        Object obj3 = taxReturnsPresenter.args;
        Object obj4 = taxReturnsPresenter.router;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj5 = taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
        ?? r2 = 0;
        r2 = null;
        r2 = null;
        r2 = null;
        Object installed = null;
        Object content = null;
        r2 = 0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-477645716);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = (DocumentsTaxReturnsConfiguration) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) ((RealTaxesDocumentsTaxReturnsDataProvider) obj5).featureFlagManager).peekCurrentValue(JsonFeatureFlags$TaxesDocumentsTaxReturnsData.INSTANCE)).value;
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                DocumentsTaxReturnsConfiguration documentsTaxReturnsConfiguration = (DocumentsTaxReturnsConfiguration) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TaxReturnsViewModel(documentsTaxReturnsConfiguration.category_text, documentsTaxReturnsConfiguration.header_text, documentsTaxReturnsConfiguration.body_text, documentsTaxReturnsConfiguration.button_text, documentsTaxReturnsConfiguration.tax_deeplink);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                TaxReturnsViewModel taxReturnsViewModel = (TaxReturnsViewModel) rememberedValue2;
                Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) r2, taxReturnsPresenter, 8));
                gapComposer.end(false);
                return taxReturnsViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(307276767);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                Object obj6 = rememberedValue3;
                if (rememberedValue3 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(((OffersScreen$OffersFilterGroupSheetScreen) obj5).selectedFilterToken);
                    gapComposer2.updateRememberedValue(mutableStateOf$default);
                    obj6 = mutableStateOf$default;
                }
                MutableState mutableState2 = (MutableState) obj6;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                Object obj7 = rememberedValue4;
                if (rememberedValue4 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(mutableStateOf$default2);
                    obj7 = mutableStateOf$default2;
                }
                MutableState mutableState3 = (MutableState) obj7;
                boolean changedInstance = gapComposer2.changedInstance(taxReturnsPresenter);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Continuation continuation2 = null;
                Object obj8 = rememberedValue5;
                if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                    OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1(taxReturnsPresenter, continuation2, 2);
                    gapComposer2.updateRememberedValue(overlayKt$Overlay$1$1$1$1$1);
                    obj8 = overlayKt$Overlay$1$1$1$1$1;
                }
                MutableState produceState = Updater.produceState(gapComposer2, null, (Function2) obj8);
                FilterGroupSection.FilterGroupItem.Sheet sheet = (FilterGroupSection.FilterGroupItem.Sheet) produceState.getValue();
                boolean changed = gapComposer2.changed(produceState) | gapComposer2.changedInstance(taxReturnsPresenter);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed || rememberedValue6 == neverEqualPolicy) {
                    continuation = null;
                    obj = null;
                    realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(this, produceState, mutableState3, continuation, 19);
                    mutableState = produceState;
                    gapComposer2.updateRememberedValue(realKeyStoreProvider$setEntry$2);
                } else {
                    mutableState = produceState;
                    continuation = null;
                    realKeyStoreProvider$setEntry$2 = rememberedValue6;
                    obj = null;
                }
                Updater.LaunchedEffect(gapComposer2, sheet, (Function2) realKeyStoreProvider$setEntry$2);
                Continuation continuation3 = continuation;
                Updater.LaunchedEffect(gapComposer2, flow, new MusicPresenter$models$1$1(flow, continuation3, (MoleculePresenter) this, mutableState2, 24));
                FilterGroupSection.FilterGroupItem.Sheet sheet2 = (FilterGroupSection.FilterGroupItem.Sheet) mutableState.getValue();
                if (sheet2 != null) {
                    String str8 = (String) mutableState2.getValue();
                    String str9 = sheet2.title;
                    FilterGroupSection.FilterGroupItem.ItemLayout itemLayout = sheet2.item_layout;
                    String str10 = str9 == null ? "" : str9;
                    List list2 = sheet2.filter_items;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) it.next();
                            String str11 = filterItem.filter_token;
                            if (str11 != null) {
                                String str12 = filterItem.name;
                                if (str12 != null) {
                                    Image image = filterItem.image;
                                    TapAction tapAction = filterItem.tap_action;
                                    if (tapAction != null) {
                                        List list3 = tapAction.analytics_tap_events;
                                        PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                                        Iterator it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            builder.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it2.next()));
                                        }
                                        arrayList.add(new OffersFilterGroupSheetViewModel.FilterViewModel(str11, str12, image, builder.build()));
                                    } else {
                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterItem.tap_action == null");
                                    }
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterItem.name == null");
                                }
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterItem.filter_token == null");
                            }
                        } else {
                            int i6 = itemLayout == null ? -1 : OffersSearchMapperKt$WhenMappings.$EnumSwitchMapping$0[itemLayout.ordinal()];
                            if (i6 == -1) {
                                layout = OffersFilterGroupSheetViewModel.Layout.PILL;
                            } else if (i6 == 1) {
                                layout = OffersFilterGroupSheetViewModel.Layout.PILL;
                            } else if (i6 == 2) {
                                layout = OffersFilterGroupSheetViewModel.Layout.TILE;
                            } else {
                                if (i6 == 3) {
                                    throw new NotImplementedError("An operation is not implemented: ".concat("Add support for " + itemLayout));
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            OffersFilterGroupSheetViewModel.Layout layout2 = layout;
                            Button button = sheet2.apply_button;
                            ?? r5 = button != null ? button.tap_action : continuation3;
                            if (r5 != 0) {
                                List list4 = r5.analytics_tap_events;
                                PersistentVectorBuilder builder2 = SmallPersistentVector.EMPTY.builder();
                                Iterator it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    builder2.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it3.next()));
                                }
                                offersFilterGroupSheetViewModel = new OffersFilterGroupSheetViewModel(str10, arrayList, str8, layout2, builder2.build());
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: Sheet.apply_button.tap_action == null");
                            }
                        }
                    }
                    return obj;
                }
                offersFilterGroupSheetViewModel = new OffersFilterGroupSheetViewModel("", EmptyList.INSTANCE, null, OffersFilterGroupSheetViewModel.Layout.PILL, SmallPersistentVector.EMPTY);
                gapComposer2.end(false);
                return offersFilterGroupSheetViewModel;
            case 2:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj5;
                Resources resources = androidStringManager.resources;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1339739412);
                SheetStyle sheetStyle = ((OffersScreen$OffersRedemptionScreen) obj4).sheetStyle;
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = Updater.mutableStateOf$default(new OffersRedemptionViewModel(0, "", ""));
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState4 = (MutableState) rememberedValue7;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer3.changedInstance(taxReturnsPresenter);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new InviteErrorPresenter$models$1$1(taxReturnsPresenter, r2, 11);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                }
                Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue8);
                if (sheetStyle instanceof SheetStyle.IncentiveSheet) {
                    String str13 = ((SheetStyle.IncentiveSheet) sheetStyle).discountAmount;
                    str13.getClass();
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.cash_app_pay_redemption_title)).format(new Object[]{str13});
                    format2.getClass();
                    mutableState4.setValue(new OffersRedemptionViewModel(R.drawable.redemption_success, format2, androidStringManager.get(R.string.discounted_redemption_body_text)));
                } else if (sheetStyle instanceof SheetStyle.AffiliateSheet) {
                    String str14 = ((SheetStyle.AffiliateSheet) sheetStyle).discountAmount;
                    str14.getClass();
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.cash_app_card_redemption_title)).format(new Object[]{str14});
                    format3.getClass();
                    mutableState4.setValue(new OffersRedemptionViewModel(R.drawable.redemption_success, format3, androidStringManager.get(R.string.discounted_redemption_body_text)));
                } else if (sheetStyle instanceof SheetStyle.AfterPaySheet) {
                    mutableState4.setValue(new OffersRedemptionViewModel(R.drawable.redemption_success, androidStringManager.get(R.string.afterpay_redemption_title), androidStringManager.get(R.string.pay_later_redemption_body_text)));
                } else {
                    if (!(sheetStyle instanceof SheetStyle.SUPSheet)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState4.setValue(new OffersRedemptionViewModel(R.drawable.redemption_success, androidStringManager.get(R.string.sup_redemption_title), androidStringManager.get(R.string.sup_redemption_body_text)));
                }
                Updater.LaunchedEffect(gapComposer3, flow, new RealMRIFactory$sign$2(flow, (Continuation) r2, taxReturnsPresenter, 14));
                OffersRedemptionViewModel offersRedemptionViewModel = (OffersRedemptionViewModel) mutableState4.getValue();
                gapComposer3.end(false);
                return offersRedemptionViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1993384164);
                Updater.LaunchedEffect(gapComposer4, flow, new RealMRIFactory$sign$2(flow, (Continuation) r2, taxReturnsPresenter, 29));
                CustomAllocationScreen customAllocationScreen = (CustomAllocationScreen) obj5;
                AmountPickerViewModel.Ready ready = new AmountPickerViewModel.Ready(customAllocationScreen.header, customAllocationScreen.customAmountSubtitle, ((AndroidStringManager) obj3).get(R.string.custom_allocation_button_text), new AmountPickerViewModel.Ready.Amount.PercentAmount(new BigDecimal(1)), new AmountPickerViewModel.Ready.Amount.PercentAmount(new BigDecimal(customAllocationScreen.maxAllocation / 100)), false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), null, ((NumberFormat) ((Lazy) obj4).getValue()).format(customAllocationScreen.startingAllocation / 100), false, false, null, null, 15712);
                gapComposer4.end(false);
                return ready;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(219595621);
                PaymentScreens.ConfirmDuplicate confirmDuplicate = (PaymentScreens.ConfirmDuplicate) obj5;
                String format4 = ((MoneyFormatter) obj4).format(confirmDuplicate.amount);
                Updater.LaunchedEffect(gapComposer5, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, 12));
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj3;
                String str15 = androidStringManager2.get(R.string.payment_duplicate_title);
                Redacted redacted2 = confirmDuplicate.recipients;
                if (((List) redacted2.getValue()).size() > 1) {
                    format4.getClass();
                    formattedResource = new FormattedResource(R.string.payment_duplicate_message_group_updated, new Object[]{format4});
                } else {
                    PaymentRecipient paymentRecipient = (PaymentRecipient) CollectionsKt.firstOrNull((List) redacted2.getValue());
                    if (paymentRecipient != null && (redacted = paymentRecipient.displayName) != null) {
                        r2 = (String) redacted.getValue();
                    }
                    str = r2 != 0 ? r2 : "";
                    format4.getClass();
                    formattedResource = new FormattedResource(R.string.payment_duplicate_message_single_recipient, new Object[]{format4, str});
                }
                ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel = new ConfirmDuplicateDialogViewModel(str15, Countries.getString(androidStringManager2.resources, formattedResource), androidStringManager2.get(R.string.payment_duplicate_negative), androidStringManager2.get(R.string.payment_duplicate_title_primary_button_text));
                gapComposer5.end(false);
                return confirmDuplicateDialogViewModel;
            case 5:
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj4;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-1441499715);
                Updater.LaunchedEffect(gapComposer6, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, i3));
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj3;
                PaymentScreens.DuplicatePayment duplicatePayment = (PaymentScreens.DuplicatePayment) obj5;
                Orientation orientation = duplicatePayment.orientation;
                Money money = duplicatePayment.amount;
                Orientation orientation2 = Orientation.CASH;
                String str16 = androidStringManager3.get(orientation == orientation2 ? R.string.duplicate_payment_title : R.string.duplicate_request_title);
                Orientation orientation3 = duplicatePayment.orientation;
                Redacted redacted3 = duplicatePayment.recipient;
                if (orientation3 == orientation2) {
                    String str17 = ((Recipient) redacted3.getValue()).displayName;
                    str = str17 != null ? str17 : "";
                    String format5 = moneyFormatter.format(money);
                    format5.getClass();
                    formattedResource2 = new FormattedResource(R.string.duplicate_payment_subtitle, new Object[]{str, format5});
                } else {
                    String str18 = ((Recipient) redacted3.getValue()).displayName;
                    str = str18 != null ? str18 : "";
                    String format6 = moneyFormatter.format(money);
                    format6.getClass();
                    formattedResource2 = new FormattedResource(R.string.duplicate_request_subtitle, new Object[]{str, format6});
                }
                DuplicatePaymentViewModel duplicatePaymentViewModel = new DuplicatePaymentViewModel(str16, Countries.getString(androidStringManager3.resources, formattedResource2));
                gapComposer6.end(false);
                return duplicatePaymentViewModel;
            case 6:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(270961969);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer7.changedInstance(taxReturnsPresenter);
                Object rememberedValue9 = gapComposer7.rememberedValue();
                int i7 = 17;
                if (changedInstance3 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new InviteErrorPresenter$models$1$1(taxReturnsPresenter, r2, i7);
                    gapComposer7.updateRememberedValue(rememberedValue9);
                }
                Updater.LaunchedEffect(gapComposer7, unit2, (Function2) rememberedValue9);
                Updater.LaunchedEffect(gapComposer7, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, i7));
                NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel = new NearbyPayRequestHelpViewModel(androidStringManager4.get(R.string.nearby_pay_request_help_title), androidStringManager4.get(R.string.nearby_pay_request_help_subtitle), androidStringManager4.get(R.string.nearby_pay_request_help_more_info), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager4.get(R.string.nearby_pay_request_help_step_1), androidStringManager4.get(R.string.nearby_pay_request_help_step_2), androidStringManager4.get(R.string.nearby_pay_request_help_step_3)}));
                gapComposer7.end(false);
                return nearbyPayRequestHelpViewModel;
            case 7:
                PaymentScreens.NearbyPayersSheet nearbyPayersSheet = (PaymentScreens.NearbyPayersSheet) obj4;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-923892664);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer8.changedInstance(taxReturnsPresenter);
                Object rememberedValue10 = gapComposer8.rememberedValue();
                if (changedInstance4 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new InviteErrorPresenter$models$1$1(taxReturnsPresenter, r2, 19);
                    gapComposer8.updateRememberedValue(rememberedValue10);
                }
                Updater.LaunchedEffect(gapComposer8, unit3, (Function2) rememberedValue10);
                Updater.LaunchedEffect(gapComposer8, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, 18));
                String str19 = nearbyPayersSheet.totalReceivedFormatted;
                Redacted redacted4 = nearbyPayersSheet.payers;
                Integer valueOf = Integer.valueOf(((List) redacted4.getValue()).size());
                str19.getClass();
                Object[] objArr = {str19, valueOf};
                Resources resources2 = ((AndroidStringManager) obj5).resources;
                resources2.getClass();
                String format7 = new MessageFormat(resources2.getString(R.string.nearby_payers_sheet_header)).format(objArr);
                format7.getClass();
                NearbyPayersSheetViewModel nearbyPayersSheetViewModel = new NearbyPayersSheetViewModel(format7, (List) redacted4.getValue());
                gapComposer8.end(false);
                return nearbyPayersSheetViewModel;
            case 8:
                AndroidStringManager androidStringManager5 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-2113470050);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer9.changedInstance(taxReturnsPresenter);
                Object rememberedValue11 = gapComposer9.rememberedValue();
                int i8 = 20;
                if (changedInstance5 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new InviteErrorPresenter$models$1$1(taxReturnsPresenter, r2, i8);
                    gapComposer9.updateRememberedValue(rememberedValue11);
                }
                Updater.LaunchedEffect(gapComposer9, unit4, (Function2) rememberedValue11);
                Updater.LaunchedEffect(gapComposer9, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, i8));
                Object rememberedValue12 = gapComposer9.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = CollectionsKt__CollectionsKt.listOf((Object[]) new NearbyPaymentsInfoInfoItem[]{new NearbyPaymentsInfoInfoItem(NearbyPaymentsInfoIcon.FAST, androidStringManager5.get(R.string.nearby_payments_info_item_fastest_label), androidStringManager5.get(R.string.nearby_payments_info_item_fastest_body)), new NearbyPaymentsInfoInfoItem(NearbyPaymentsInfoIcon.CONTACT_ADD, androidStringManager5.get(R.string.nearby_payments_info_item_groups_label), androidStringManager5.get(R.string.nearby_payments_info_item_groups_body)), new NearbyPaymentsInfoInfoItem(NearbyPaymentsInfoIcon.SECURITY_LOCK_OUTLINE, androidStringManager5.get(R.string.nearby_payments_info_item_secure_label), androidStringManager5.get(R.string.nearby_payments_info_item_secure_body))});
                    gapComposer9.updateRememberedValue(rememberedValue12);
                }
                List list5 = (List) rememberedValue12;
                Object rememberedValue13 = gapComposer9.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = CollectionsKt__CollectionsKt.listOf((Object[]) new NearbyPaymentsInfoItemArticle[]{new NearbyPaymentsInfoItemArticle(NearbyPaymentsInfoItem.HOW_TO_PAY, androidStringManager5.get(R.string.nearby_payments_info_nav_how_to_pay)), new NearbyPaymentsInfoItemArticle(NearbyPaymentsInfoItem.HOW_TO_GET_PAID, androidStringManager5.get(R.string.nearby_payments_info_nav_how_to_get_paid)), new NearbyPaymentsInfoItemArticle(NearbyPaymentsInfoItem.PRIVACY_AND_SECURITY, androidStringManager5.get(R.string.nearby_payments_info_nav_privacy)), new NearbyPaymentsInfoItemArticle(NearbyPaymentsInfoItem.TROUBLESHOOTING, androidStringManager5.get(R.string.nearby_payments_info_nav_troubleshooting))});
                    gapComposer9.updateRememberedValue(rememberedValue13);
                }
                NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = new NearbyPaymentsInfoViewModel(androidStringManager5.get(R.string.nearby_payments_info_title), androidStringManager5.get(R.string.nearby_payments_info_body), list5, (List) rememberedValue13, new Image("https://cash-f.squarecdn.com/static/nearby-info-asset-light.png", "https://cash-f.squarecdn.com/static/nearby-info-asset-dark.png", 4));
                gapComposer9.end(false);
                return nearbyPaymentsInfoViewModel;
            case 9:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-824828075);
                Object rememberedValue14 = gapComposer10.rememberedValue();
                Object obj9 = rememberedValue14;
                if (rememberedValue14 == neverEqualPolicy) {
                    SliceStatus.Companion companion = NearbyContext.NearbyIntent.Companion;
                    NearbyIdentifier nearbyIdentifier = new NearbyIdentifier();
                    gapComposer10.updateRememberedValue(nearbyIdentifier);
                    obj9 = nearbyIdentifier;
                }
                SnapshotStateMap discoverNearby$default = zzadq.discoverNearby$default((NearbyIdentifier) obj9, (RealNearbyManager) obj5, gapComposer10);
                Object rememberedValue15 = gapComposer10.rememberedValue();
                Object obj10 = rememberedValue15;
                if (rememberedValue15 == neverEqualPolicy) {
                    DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new qg$$ExternalSyntheticLambda0(2, discoverNearby$default));
                    gapComposer10.updateRememberedValue(derivedStateOf);
                    obj10 = derivedStateOf;
                }
                State state = (State) obj10;
                Object rememberedValue16 = gapComposer10.rememberedValue();
                Object obj11 = rememberedValue16;
                if (rememberedValue16 == neverEqualPolicy) {
                    SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
                    gapComposer10.updateRememberedValue(snapshotStateSet);
                    obj11 = snapshotStateSet;
                }
                SnapshotStateSet snapshotStateSet2 = (SnapshotStateSet) obj11;
                Object rememberedValue17 = gapComposer10.rememberedValue();
                Object obj12 = rememberedValue17;
                if (rememberedValue17 == neverEqualPolicy) {
                    SnapshotStateMap snapshotStateMap2 = new SnapshotStateMap();
                    gapComposer10.updateRememberedValue(snapshotStateMap2);
                    obj12 = snapshotStateMap2;
                }
                SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj12;
                Object rememberedValue18 = gapComposer10.rememberedValue();
                Object obj13 = rememberedValue18;
                if (rememberedValue18 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer10.updateRememberedValue(mutableStateOf$default3);
                    obj13 = mutableStateOf$default3;
                }
                MutableState mutableState5 = (MutableState) obj13;
                Set set = (Set) state.getValue();
                boolean changedInstance6 = gapComposer10.changedInstance(discoverNearby$default) | gapComposer10.changedInstance(taxReturnsPresenter);
                Object rememberedValue19 = gapComposer10.rememberedValue();
                if (changedInstance6 || rememberedValue19 == neverEqualPolicy) {
                    MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(snapshotStateSet2, snapshotStateMap3, discoverNearby$default, this, (Continuation) null, 22);
                    snapshotStateMap = snapshotStateMap3;
                    taxReturnsPresenter = this;
                    gapComposer10.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                    rememberedValue19 = moleculeKt$immediateClockFlow$1$1$1;
                } else {
                    snapshotStateMap = snapshotStateMap3;
                }
                Updater.LaunchedEffect(gapComposer10, set, (Function2) rememberedValue19);
                Integer valueOf2 = Integer.valueOf(snapshotStateMap.size());
                boolean changedInstance7 = gapComposer10.changedInstance(taxReturnsPresenter);
                Object rememberedValue20 = gapComposer10.rememberedValue();
                Continuation continuation4 = null;
                if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                    TaxReturnsPresenter taxReturnsPresenter2 = taxReturnsPresenter;
                    RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$22 = new RealKeyStoreProvider$setEntry$2(snapshotStateMap, taxReturnsPresenter2, mutableState5, continuation4, 29);
                    taxReturnsPresenter = taxReturnsPresenter2;
                    gapComposer10.updateRememberedValue(realKeyStoreProvider$setEntry$22);
                    rememberedValue20 = realKeyStoreProvider$setEntry$22;
                }
                Updater.LaunchedEffect(gapComposer10, valueOf2, (Function2) rememberedValue20);
                Updater.LaunchedEffect(gapComposer10, flow, new MainPaymentPresenter$models$4$4(flow, continuation4, taxReturnsPresenter, 21));
                SnapshotMapKeySet snapshotMapKeySet = snapshotStateMap.values;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = snapshotMapKeySet.iterator();
                while (((StateMapMutableKeysIterator) it4).hasNext()) {
                    Object next = ((StateMapMutableKeysIterator) it4).next();
                    if (hashSet.add(((NearbyPerson) next).customerToken)) {
                        arrayList2.add(next);
                    }
                }
                List list6 = CollectionsKt.toList(arrayList2);
                Object[] objArr2 = {Integer.valueOf(list6.size())};
                Resources resources3 = ((AndroidStringManager) obj4).resources;
                resources3.getClass();
                String format8 = new MessageFormat(resources3.getString(R.string.nearby_people_overflow_sheet_title)).format(objArr2);
                format8.getClass();
                NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = new NearbyPeopleOverflowSheetViewModel(format8, list6);
                gapComposer10.end(false);
                return nearbyPeopleOverflowSheetViewModel;
            case 10:
                PaymentScreens.NoteRequired noteRequired = (PaymentScreens.NoteRequired) obj4;
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-1403149049);
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer11.changedInstance(taxReturnsPresenter);
                Object rememberedValue21 = gapComposer11.rememberedValue();
                if (changedInstance8 || rememberedValue21 == neverEqualPolicy) {
                    rememberedValue21 = new InviteErrorPresenter$models$1$1(taxReturnsPresenter, r2, 21);
                    gapComposer11.updateRememberedValue(rememberedValue21);
                }
                Updater.LaunchedEffect(gapComposer11, unit5, (Function2) rememberedValue21);
                Updater.LaunchedEffect(gapComposer11, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, 22));
                String str20 = androidStringManager6.get(R.string.require_initiator_note_title);
                Redacted redacted5 = noteRequired.recipients;
                if (((List) redacted5.getValue()).size() <= 1) {
                    PaymentRecipient paymentRecipient2 = (PaymentRecipient) CollectionsKt.firstOrNull((List) redacted5.getValue());
                    String firstName = paymentRecipient2 != null ? zzahi.toRecipient(paymentRecipient2).getFirstName() : null;
                    if (firstName != null && !StringsKt.isBlank(firstName)) {
                        PaymentRecipient paymentRecipient3 = (PaymentRecipient) CollectionsKt.firstOrNull((List) redacted5.getValue());
                        if (!((paymentRecipient3 == null || (uiCustomer = paymentRecipient3.sendableUiCustomer) == null) ? false : Intrinsics.areEqual(uiCustomer.is_cash_customer, Boolean.FALSE))) {
                            PaymentRecipient paymentRecipient4 = (PaymentRecipient) CollectionsKt.firstOrNull((List) redacted5.getValue());
                            String firstName2 = paymentRecipient4 != null ? zzahi.toRecipient(paymentRecipient4).getFirstName() : null;
                            str = firstName2 != null ? firstName2 : "";
                            Resources resources4 = androidStringManager6.resources;
                            resources4.getClass();
                            str2 = new MessageFormat(resources4.getString(R.string.require_initiator_note_body_singular)).format(new Object[]{str});
                            str2.getClass();
                            NoteRequiredViewModel noteRequiredViewModel = new NoteRequiredViewModel(str20, str2, androidStringManager6.get(R.string.close));
                            gapComposer11.end(false);
                            return noteRequiredViewModel;
                        }
                    }
                }
                str2 = androidStringManager6.get(R.string.require_initiator_note_body_plural);
                NoteRequiredViewModel noteRequiredViewModel2 = new NoteRequiredViewModel(str20, str2, androidStringManager6.get(R.string.close));
                gapComposer11.end(false);
                return noteRequiredViewModel2;
            case 11:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-963746320);
                Object rememberedValue22 = gapComposer12.rememberedValue();
                if (rememberedValue22 == neverEqualPolicy) {
                    rememberedValue22 = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(((RealPersonalizePaymentManager) obj4).personalizationRepository.loadStickers(), 3), i5);
                    gapComposer12.updateRememberedValue(rememberedValue22);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue22, SmallPersistentVector.EMPTY, null, gapComposer12, 48, 2);
                Updater.LaunchedEffect(gapComposer12, flow, new PhonePlansHomePresenter$models$1$1(flow, (Continuation) null, taxReturnsPresenter, collectAsState, 10));
                PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = new PersonalizePaymentStickersViewModel((ImmutableList) collectAsState.getValue());
                gapComposer12.end(false);
                return personalizePaymentStickersViewModel;
            case 12:
                AndroidStringManager androidStringManager7 = (AndroidStringManager) obj3;
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(1454954733);
                Updater.LaunchedEffect(gapComposer13, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r2, taxReturnsPresenter, 27));
                PaymentScreens.QuickPayDetails quickPayDetails = (PaymentScreens.QuickPayDetails) obj4;
                int i9 = QuickPayDetailsPresenter$WhenMappings.$EnumSwitchMapping$0[quickPayDetails.paymentOrientation.ordinal()];
                if (i9 == 1) {
                    str3 = androidStringManager7.get(R.string.change_payment_orientation_to_request);
                } else {
                    if (i9 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str3 = androidStringManager7.get(R.string.change_payment_orientation_to_pay);
                }
                QuickPayDetailsViewModel quickPayDetailsViewModel = new QuickPayDetailsViewModel(quickPayDetails.accentColor, str3, androidStringManager7.get(R.string.change_payment_orientation_close));
                gapComposer13.end(false);
                return quickPayDetailsViewModel;
            case 13:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(662471092);
                Updater.LaunchedEffect(gapComposer14, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r2, taxReturnsPresenter, 14));
                DeviceManagerDeviceRemovalFailedScreen deviceManagerDeviceRemovalFailedScreen = (DeviceManagerDeviceRemovalFailedScreen) obj5;
                int size = deviceManagerDeviceRemovalFailedScreen.getFailedTokens().size();
                DeviceManagerDeviceRemovalFailedScreen.ErrorReason errorReason = deviceManagerDeviceRemovalFailedScreen.getErrorReason();
                int devicesAttemptedToRemove = deviceManagerDeviceRemovalFailedScreen.getDevicesAttemptedToRemove();
                AndroidStringManager androidStringManager8 = (AndroidStringManager) obj4;
                ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(size), InquiryField.FloatField.TYPE2);
                Resources resources5 = androidStringManager8.resources;
                resources5.getClass();
                String format9 = new MessageFormat(resources5.getString(R.string.device_removal_failure_titles)).format(m);
                format9.getClass();
                if (errorReason == DeviceManagerDeviceRemovalFailedScreen.ErrorReason.CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH) {
                    str4 = new MessageFormat(resources5.getString(R.string.device_removal_failure_description)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(size), "device"));
                    str4.getClass();
                } else if (size != devicesAttemptedToRemove) {
                    str4 = new MessageFormat(resources5.getString(R.string.partial_device_removal_failure_description)).format(new Object[]{Integer.valueOf(size)});
                    str4.getClass();
                } else {
                    str4 = androidStringManager8.get(R.string.default_device_removal_failure_description);
                }
                DeviceRemovalFailedViewModel deviceRemovalFailedViewModel = new DeviceRemovalFailedViewModel(format9, str4);
                gapComposer14.end(false);
                return deviceRemovalFailedViewModel;
            case 14:
                m3767models(flow, composer, i);
                return Unit.INSTANCE;
            case 15:
                ProfileScreens.UnsupportedSettingScreen unsupportedSettingScreen = (ProfileScreens.UnsupportedSettingScreen) obj4;
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(1639531831);
                Object rememberedValue23 = gapComposer15.rememberedValue();
                if (rememberedValue23 == neverEqualPolicy) {
                    CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(((RealP2pSettingsManager) obj5).select(), i4);
                    gapComposer15.updateRememberedValue(cashQrScannerPresenter$special$$inlined$filter$1);
                    rememberedValue23 = cashQrScannerPresenter$special$$inlined$filter$1;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue23, null, null, gapComposer15, 48, 2);
                Object rememberedValue24 = gapComposer15.rememberedValue();
                if (rememberedValue24 == neverEqualPolicy) {
                    rememberedValue24 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj3)).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidUnsupportedSettingRouting.INSTANCE)).enabled());
                    gapComposer15.updateRememberedValue(rememberedValue24);
                }
                Updater.LaunchedEffect(gapComposer15, flow, new RoomDatabase$performClear$1.AnonymousClass1(flow, (Continuation) null, taxReturnsPresenter, ((Boolean) rememberedValue24).booleanValue()));
                Boolean bool = (Boolean) collectAsState2.getValue();
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool2)) {
                    str5 = unsupportedSettingScreen.businessAccountConfiguration.title;
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    str5 = unsupportedSettingScreen.personalAccountConfiguration.title;
                } else {
                    if (bool != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str5 = "";
                }
                Boolean bool3 = (Boolean) collectAsState2.getValue();
                if (Intrinsics.areEqual(bool3, bool2)) {
                    str = unsupportedSettingScreen.businessAccountConfiguration.message;
                } else if (Intrinsics.areEqual(bool3, Boolean.FALSE)) {
                    str = unsupportedSettingScreen.personalAccountConfiguration.message;
                } else if (bool3 != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                UnsupportedSettingViewModel unsupportedSettingViewModel = new UnsupportedSettingViewModel(str5, str, Intrinsics.areEqual((Boolean) collectAsState2.getValue(), Boolean.FALSE));
                gapComposer15.end(false);
                return unsupportedSettingViewModel;
            case 16:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(1079751117);
                Object rememberedValue25 = gapComposer16.rememberedValue();
                if (rememberedValue25 == neverEqualPolicy) {
                    rememberedValue25 = ((RealIdentityVerificationRepo) obj2).status();
                    gapComposer16.updateRememberedValue(rememberedValue25);
                }
                IdentityVerificationStatus identityVerificationStatus = (IdentityVerificationStatus) Updater.collectAsState((Flow) rememberedValue25, null, null, gapComposer16, 48, 2).getValue();
                if (identityVerificationStatus == null) {
                    gapComposer16.startReplaceGroup(1855738111);
                    gapComposer16.end(false);
                } else {
                    gapComposer16.startReplaceGroup(1855738112);
                    if (identityVerificationStatus.shouldShowBadge) {
                        long j = identityVerificationStatus.version;
                        LongPreference longPreference = ((RealIdentityVerificationBadger) obj3).lastSeenIdentityVerificationVersion;
                        if (j != longPreference.preferences.getLong(longPreference.key, longPreference.defaultValue)) {
                            z = true;
                            gapComposer16.startReplaceGroup(-1106477359);
                            Updater.LaunchedEffect(gapComposer16, flow, new RealContactSync$syncRequest$2.AnonymousClass1(flow, (Continuation) null, flow, this, z, identityVerificationStatus));
                            gapComposer16.end(false);
                            content = new IdentityVerificationSectionViewModel.Content(z, identityVerificationStatus.entrypointStatus);
                            gapComposer16.end(false);
                        }
                    }
                    z = false;
                    gapComposer16.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer16, flow, new RealContactSync$syncRequest$2.AnonymousClass1(flow, (Continuation) null, flow, this, z, identityVerificationStatus));
                    gapComposer16.end(false);
                    content = new IdentityVerificationSectionViewModel.Content(z, identityVerificationStatus.entrypointStatus);
                    gapComposer16.end(false);
                }
                if (content == null) {
                    content = IdentityVerificationSectionViewModel.None.INSTANCE;
                }
                gapComposer16.end(false);
                return content;
            case 17:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(-1372178080);
                Object rememberedValue26 = gapComposer17.rememberedValue();
                if (rememberedValue26 == neverEqualPolicy) {
                    rememberedValue26 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer17.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState6 = (MutableState) rememberedValue26;
                Updater.LaunchedEffect(gapComposer17, flow, new RealQrCodesPresenter$models$1$1(flow, (Continuation) null, taxReturnsPresenter, mutableState6, 1));
                ProfileScreens.AdjustableThresholdScreen adjustableThresholdScreen = (ProfileScreens.AdjustableThresholdScreen) obj4;
                AdjustableThresholdViewModel adjustableThresholdViewModel = new AdjustableThresholdViewModel(adjustableThresholdScreen.currentValue, adjustableThresholdScreen.minValue, ((Boolean) mutableState6.getValue()).booleanValue(), adjustableThresholdScreen.maxValue);
                gapComposer17.end(false);
                return adjustableThresholdViewModel;
            case 18:
                return models$com$squareup$cash$qrcodes$presenters$CashQrShortcutsOnboardingPresenter(flow, composer, i);
            case 19:
                return models$com$squareup$cash$securityhub$presenters$SecurityHubPresenter(flow, composer, i);
            case 20:
                m3767models(flow, composer, i);
                return Unit.INSTANCE;
            case 21:
                return models$com$squareup$cash$support$chat$presenters$ChatImageDetailPresenter(flow, composer, i);
            case 22:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(590607160);
                Updater.LaunchedEffect(gapComposer18, flow, new ArticlePresenter$models$1$1(flow, (Continuation) r2, taxReturnsPresenter, i3));
                gapComposer18.end(false);
                return ScreenshotConfirmViewModel.INSTANCE;
            case 23:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(-32586324);
                Updater.LaunchedEffect(gapComposer19, flow, new ArticlePresenter$models$1$1(flow, (Continuation) r2, taxReturnsPresenter, i4));
                AndroidStringManager androidStringManager9 = (AndroidStringManager) obj5;
                SupportTransactionConfirmationViewModel supportTransactionConfirmationViewModel = new SupportTransactionConfirmationViewModel(androidStringManager9.get(R.string.contact_support_transaction_confirmation_title), androidStringManager9.get(R.string.contact_support_transaction_confirmation_yes), androidStringManager9.get(R.string.contact_support_transaction_confirmation_no));
                gapComposer19.end(false);
                return supportTransactionConfirmationViewModel;
            case 24:
                return models$com$squareup$cash$taptopay$presenters$TapToPayFirstTimeScreenPresenter(flow, composer, i);
            case 25:
                return models$com$squareup$cash$tax$presenters$TaxTooltipPresenter(flow, composer, i);
            case 26:
                return models(flow, composer, i);
            case 27:
                return models$com$squareup$cash$wallet$presenters$PresentationTimelinePresenter(flow, composer, i);
            default:
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(-1283358059);
                Unit unit6 = Unit.INSTANCE;
                boolean changedInstance9 = gapComposer20.changedInstance(taxReturnsPresenter);
                Object rememberedValue27 = gapComposer20.rememberedValue();
                if (changedInstance9 || rememberedValue27 == neverEqualPolicy) {
                    rememberedValue27 = new CameraHelper$unbind$2(taxReturnsPresenter, r2, i5);
                    gapComposer20.updateRememberedValue(rememberedValue27);
                }
                Updater.LaunchedEffect(gapComposer20, unit6, (Function2) rememberedValue27);
                Updater.LaunchedEffect(gapComposer20, flow, new CardAppletWorker$setup$1$2$1(flow, (Continuation) null, taxReturnsPresenter, 23));
                ShiftsTileState shiftsTileState = (ShiftsTileState) Updater.collectAsState((StateFlow) ((RealShiftsTileDataLoader) obj2).tileStateFlow$delegate.getValue(), null, gapComposer20, 1).getValue();
                if (Intrinsics.areEqual(shiftsTileState, ShiftsTileState.Loading.INSTANCE)) {
                    installed = WorkAppletTileModel.Loading.INSTANCE;
                } else {
                    if (!(shiftsTileState instanceof ShiftsTileState.Error)) {
                        if (shiftsTileState instanceof ShiftsTileState.Loaded) {
                            ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) obj4;
                            ShiftsTileState.Loaded loaded = (ShiftsTileState.Loaded) shiftsTileState;
                            AndroidStringManager androidStringManager10 = (AndroidStringManager) toolbarTuckTargets.startCornerCenterX$delegate;
                            boolean z2 = loaded instanceof ShiftsTileState.Loaded.NoShiftsFunctionality;
                            if (z2) {
                                str6 = androidStringManager10.get(R.string.work_shifts_tile_subtitle_no_upcoming_shifts);
                            } else if (loaded instanceof ShiftsTileState.Loaded.ClockedOut) {
                                ShiftsTileViewModelBuilder$UpcomingShiftDisplay upcomingShiftDisplay = toolbarTuckTargets.upcomingShiftDisplay((ShiftsTileState.Loaded.ClockedOut) loaded);
                                str6 = (upcomingShiftDisplay == null || (str7 = upcomingShiftDisplay.primaryText) == null) ? androidStringManager10.get(R.string.work_shifts_tile_subtitle_no_upcoming_shifts) : str7;
                            } else if ((loaded instanceof ShiftsTileState.Loaded.ClockedIn) || (loaded instanceof ShiftsTileState.Loaded.OnBreak)) {
                                str6 = androidStringManager10.get(R.string.work_shifts_tile_status_clocked_in);
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            if (!z2) {
                                if (loaded instanceof ShiftsTileState.Loaded.ClockedOut) {
                                    ShiftsTileViewModelBuilder$UpcomingShiftDisplay upcomingShiftDisplay2 = toolbarTuckTargets.upcomingShiftDisplay((ShiftsTileState.Loaded.ClockedOut) loaded);
                                    if (upcomingShiftDisplay2 != null) {
                                        formatClockInTime = upcomingShiftDisplay2.secondaryText;
                                    }
                                } else if (loaded instanceof ShiftsTileState.Loaded.ClockedIn) {
                                    ShiftsTileState.Loaded.ClockedIn clockedIn = (ShiftsTileState.Loaded.ClockedIn) loaded;
                                    formatClockInTime = toolbarTuckTargets.formatClockInTime(clockedIn.clockInTime.toEpochMilli(), clockedIn.shift);
                                } else if (loaded instanceof ShiftsTileState.Loaded.OnBreak) {
                                    ShiftsTileState.Loaded.OnBreak onBreak = (ShiftsTileState.Loaded.OnBreak) loaded;
                                    formatClockInTime = toolbarTuckTargets.formatClockInTime(onBreak.clockInTime.toEpochMilli(), onBreak.shift);
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                if (!z2) {
                                    if (loaded instanceof ShiftsTileState.Loaded.ClockedOut) {
                                        break;
                                    } else if (!(loaded instanceof ShiftsTileState.Loaded.ClockedIn) && !(loaded instanceof ShiftsTileState.Loaded.OnBreak)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                    }
                                    list = CollectionsKt__CollectionsJVMKt.listOf(loaded.getMerchantData().primaryMerchant);
                                    List<MerchantInfo> list7 = list;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                    for (MerchantInfo merchantInfo : list7) {
                                        MerchantBranding merchantBranding = merchantInfo.branding;
                                        arrayList3.add(new SellerCardViewModel(merchantInfo.initials, merchantBranding != null ? merchantBranding.foregroundLightHex : null, merchantBranding != null ? merchantBranding.foregroundDarkHex : null, merchantBranding != null ? merchantBranding.backgroundLightHex : null, merchantBranding != null ? merchantBranding.backgroundDarkHex : null, merchantBranding != null ? merchantBranding.outlineLightHex : null, merchantBranding != null ? merchantBranding.outlineDarkHex : null, merchantBranding != null ? merchantBranding.artworkLightUrl : null, merchantBranding != null ? merchantBranding.artworkDarkUrl : null));
                                    }
                                    installed = new WorkAppletTileModel.Installed(str6, formatClockInTime, arrayList3);
                                }
                                list = loaded.getMerchantData().allMerchants;
                                List<MerchantInfo> list72 = list;
                                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
                                while (r1.hasNext()) {
                                }
                                installed = new WorkAppletTileModel.Installed(str6, formatClockInTime, arrayList32);
                            }
                            formatClockInTime = null;
                            if (!z2) {
                            }
                            list = loaded.getMerchantData().allMerchants;
                            List<MerchantInfo> list722 = list;
                            ArrayList arrayList322 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list722, 10));
                            while (r1.hasNext()) {
                            }
                            installed = new WorkAppletTileModel.Installed(str6, formatClockInTime, arrayList322);
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        return installed;
                    }
                    installed = new WorkAppletTileModel.Failed(new Exception(((ShiftsTileState.Error) shiftsTileState).message));
                }
                gapComposer20.end(false);
                return installed;
        }
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, Analytics analytics, PaymentScreens.NearbyPayersSheet nearbyPayersSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        nearbyPayersSheet.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = analytics;
        this.router = nearbyPayersSheet;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, RealTaxDesktopTooltipPreference realTaxDesktopTooltipPreference, TaxTooltipScreen taxTooltipScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 25;
        taxTooltipScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = realTaxDesktopTooltipPreference;
        this.router = taxTooltipScreen;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(BetterNavigator.ScreenNavigator screenNavigator, SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen screenshotConfirmScreen, RealScreenshotManager realScreenshotManager, Analytics analytics) {
        this.$r8$classId = 22;
        screenshotConfirmScreen.getClass();
        this.navigator = screenNavigator;
        this.taxesDocumentsTaxReturnsDataProvider = screenshotConfirmScreen;
        this.args = realScreenshotManager;
        this.router = analytics;
    }

    public TaxReturnsPresenter(PaymentScreens.ConfirmDuplicate confirmDuplicate, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 4;
        confirmDuplicate.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = confirmDuplicate;
        this.navigator = screenNavigator;
        this.args = androidStringManager;
        this.router = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public TaxReturnsPresenter(PaymentScreens.DuplicatePayment duplicatePayment, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 5;
        duplicatePayment.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = duplicatePayment;
        this.navigator = screenNavigator;
        this.args = androidStringManager;
        this.router = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, Analytics analytics, PaymentScreens.NearbyPayRequestHelp nearbyPayRequestHelp, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        nearbyPayRequestHelp.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = analytics;
        this.router = nearbyPayRequestHelp;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, Analytics analytics, PaymentScreens.NoteRequired noteRequired, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        noteRequired.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = analytics;
        this.router = noteRequired;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(RealTaxesDocumentsTaxReturnsDataProvider realTaxesDocumentsTaxReturnsDataProvider, RealRouter$Factory$Impl realRouter$Factory$Impl, TaxReturnsScreen taxReturnsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        taxReturnsScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = realTaxesDocumentsTaxReturnsDataProvider;
        this.args = taxReturnsScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public TaxReturnsPresenter(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, KeyValue keyValue, BetterNavigator.ScreenNavigator screenNavigator, TapToPayFirstTimeScreen tapToPayFirstTimeScreen) {
        this.$r8$classId = 24;
        tapToPayFirstTimeScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = realTapToPayAnalyticsHelper;
        this.args = keyValue;
        this.navigator = screenNavigator;
        this.router = tapToPayFirstTimeScreen;
    }

    public TaxReturnsPresenter(RealProfileNotificationsRepository realProfileNotificationsRepository, Analytics analytics, ProfileScreens.AdjustableThresholdScreen adjustableThresholdScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        adjustableThresholdScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = realProfileNotificationsRepository;
        this.args = analytics;
        this.router = adjustableThresholdScreen;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, Analytics analytics, SupportScreens.SupportSheets.SupportTransactionConfirmationSheet supportTransactionConfirmationSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        supportTransactionConfirmationSheet.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = analytics;
        this.router = supportTransactionConfirmationSheet;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(PresentationTimelineScreen presentationTimelineScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 27;
        presentationTimelineScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = presentationTimelineScreen;
        this.navigator = screenNavigator;
        this.args = analytics;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public TaxReturnsPresenter(BetterNavigator.ScreenNavigator screenNavigator, DeviceManagerDeviceRemovalFailedScreen deviceManagerDeviceRemovalFailedScreen, RealDeviceManagerAnalytics realDeviceManagerAnalytics, AndroidStringManager androidStringManager) {
        this.$r8$classId = 13;
        deviceManagerDeviceRemovalFailedScreen.getClass();
        this.navigator = screenNavigator;
        this.taxesDocumentsTaxReturnsDataProvider = deviceManagerDeviceRemovalFailedScreen;
        this.args = realDeviceManagerAnalytics;
        this.router = androidStringManager;
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, RealSettingsEligibilityManager realSettingsEligibilityManager, RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = realSettingsEligibilityManager;
        this.navigator = screenNavigator;
        this.router = realAccountOutboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    public TaxReturnsPresenter(Navigator navigator, ShiftsAnalytics shiftsAnalytics, RealShiftsTileDataLoader realShiftsTileDataLoader, ToolbarTuckTargets toolbarTuckTargets) {
        this.$r8$classId = 28;
        navigator.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = navigator;
        this.args = shiftsAnalytics;
        this.navigator = realShiftsTileDataLoader;
        this.router = toolbarTuckTargets;
    }

    public TaxReturnsPresenter(RealChatManager realChatManager, Analytics analytics, SupportChatScreens.SupportChatDialogs.ChatExitPrompt chatExitPrompt, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        chatExitPrompt.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = realChatManager;
        this.args = analytics;
        this.router = chatExitPrompt;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(KeyValue keyValue, QrShortcutInstaller qrShortcutInstaller, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        this.taxesDocumentsTaxReturnsDataProvider = keyValue;
        this.args = qrShortcutInstaller;
        this.router = analytics;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(AndroidAccessibilityManager androidAccessibilityManager, AndroidStringManager androidStringManager, SupportChatScreens.FlowScreen.ChatImageDetail chatImageDetail, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        chatImageDetail.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidAccessibilityManager;
        this.args = androidStringManager;
        this.router = chatImageDetail;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(Analytics analytics, AndroidStringManager androidStringManager, PaymentScreens.QuickPayDetails quickPayDetails, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        quickPayDetails.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = analytics;
        this.args = androidStringManager;
        this.router = quickPayDetails;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(SecurityHubScreen securityHubScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, ProtectionsSectionPresenter$Factory$Impl protectionsSectionPresenter$Factory$Impl) {
        this.$r8$classId = 19;
        securityHubScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = securityHubScreen;
        this.navigator = screenNavigator;
        this.args = analytics;
        this.router = protectionsSectionPresenter$Factory$Impl;
    }

    public TaxReturnsPresenter(RealP2pSettingsManager realP2pSettingsManager, FeatureFlagManager featureFlagManager, ProfileScreens.UnsupportedSettingScreen unsupportedSettingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 15;
        unsupportedSettingScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = realP2pSettingsManager;
        this.args = featureFlagManager;
        this.router = unsupportedSettingScreen;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(Analytics analytics, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealIdentityVerificationBadger realIdentityVerificationBadger, RealIdentityVerificationRepo realIdentityVerificationRepo, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        this.taxesDocumentsTaxReturnsDataProvider = analytics;
        this.args = realIdentityVerificationBadger;
        this.navigator = realIdentityVerificationRepo;
        this.router = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, Analytics analytics, OffersScreen$OffersRedemptionScreen offersScreen$OffersRedemptionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        offersScreen$OffersRedemptionScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = analytics;
        this.router = offersScreen$OffersRedemptionScreen;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(PaymentScreens.PersonalizePaymentStickers personalizePaymentStickers, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealPersonalizePaymentManager realPersonalizePaymentManager) {
        this.$r8$classId = 11;
        personalizePaymentStickers.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = personalizePaymentStickers;
        this.navigator = screenNavigator;
        this.args = analytics;
        this.router = realPersonalizePaymentManager;
    }

    public TaxReturnsPresenter(OffersScreen$OffersFilterGroupSheetScreen offersScreen$OffersFilterGroupSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, RealOffersTabRepository realOffersTabRepository, RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl) {
        this.$r8$classId = 1;
        offersScreen$OffersFilterGroupSheetScreen.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = offersScreen$OffersFilterGroupSheetScreen;
        this.navigator = screenNavigator;
        this.args = realOffersTabRepository;
        this.router = realOffersAnalytics$Factory$Impl.create(offersScreen$OffersFilterGroupSheetScreen);
    }

    public TaxReturnsPresenter(AndroidStringManager androidStringManager, Analytics analytics, PaymentScreens.NearbyPaymentsInfo nearbyPaymentsInfo, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        nearbyPaymentsInfo.getClass();
        this.taxesDocumentsTaxReturnsDataProvider = androidStringManager;
        this.args = analytics;
        this.router = nearbyPaymentsInfo;
        this.navigator = screenNavigator;
    }

    public TaxReturnsPresenter(SyncValueReader syncValueReader, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 26;
        this.taxesDocumentsTaxReturnsDataProvider = syncValueReader;
        this.args = analytics;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public TaxReturnsPresenter(RealNearbyManager realNearbyManager, NearbySessionService nearbySessionService, AndroidStringManager androidStringManager, RealUuidGenerator realUuidGenerator, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        this.taxesDocumentsTaxReturnsDataProvider = realNearbyManager;
        this.args = nearbySessionService;
        this.router = androidStringManager;
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3767models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        flow.getClass();
        switch (i5) {
            case 14:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1140527370);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ShoppingWebBridge.AnonymousClass1(this, continuation, r7);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, "get-account-settings", (Function2) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, 21);
                    break;
                }
                break;
            case 20:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-2037111580);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer2.changedInstance(this);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ChatInputView$Content$1$1$1(this, continuation, 13);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
                    Updater.LaunchedEffect(gapComposer2, flow, new ArticlePresenter$models$1$1(flow, continuation, this, 5));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, flow, i, 14);
                    break;
                }
                break;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(-1506948351);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer3.changedInstance(flow) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance3 = gapComposer3.changedInstance(this);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 27);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer3, unit2, (Function2) rememberedValue3);
                    Updater.LaunchedEffect(gapComposer3, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation, this, r6));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, flow, i, 8);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.squareup.cash.wallet.viewmodels.OverdraftCoverageListItemViewModel$Ready$OverdraftListItemState] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OverdraftCoverageListItemViewModel models(Flow flow, Composer composer, int i) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled;
        OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState overdraftListItemState;
        Money money;
        SyncValueReader syncValueReader = (SyncValueReader) this.taxesDocumentsTaxReturnsDataProvider;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-943236920);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftStatus);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ?? r4 = 0;
        r4 = null;
        r4 = null;
        OverdraftCoverageListItemViewModel overdraftCoverageListItemViewModel = null;
        r4 = 0;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftUsage);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Updater.LaunchedEffect(gapComposer, flow, new TakeUntil$collectSafely$2(flow, (Continuation) r4, this, collectAsState, 2));
        OverdraftStatus overdraftStatus = (OverdraftStatus) collectAsState.getValue();
        OverdraftUsage overdraftUsage = (OverdraftUsage) collectAsState2.getValue();
        if (overdraftStatus != null) {
            OverdraftStatus.State_ state_ = overdraftStatus.State;
            if (state_ != null) {
                OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled2 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : null;
                if (permanentlyDisabled2 != null) {
                    permanentlyDisabled = permanentlyDisabled2.value;
                    if (permanentlyDisabled != null) {
                        if (state_ != null) {
                            OverdraftStatus.State_.Eligible eligible = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                            if ((eligible != null ? eligible.value : null) != null) {
                                overdraftListItemState = OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.NEW;
                                overdraftCoverageListItemViewModel = new OverdraftCoverageListItemViewModel.Ready(overdraftListItemState);
                            }
                        }
                        if (state_ != null) {
                            OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                            if ((activated != null ? activated.value : null) != null) {
                                overdraftListItemState = OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.ON;
                                overdraftCoverageListItemViewModel = new OverdraftCoverageListItemViewModel.Ready(overdraftListItemState);
                            }
                        }
                        if (state_ != null) {
                            OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                            if ((disabled != null ? disabled.value : null) != null) {
                                r4 = OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.OFF;
                            }
                        }
                        overdraftListItemState = r4 == 0 ? OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.ELIGIBLE : r4;
                        overdraftCoverageListItemViewModel = new OverdraftCoverageListItemViewModel.Ready(overdraftListItemState);
                    } else if (overdraftUsage != null && (money = overdraftUsage.usage) != null) {
                        if (Moneys.isZero(money)) {
                            money = null;
                        }
                        if (money != null) {
                            overdraftCoverageListItemViewModel = new OverdraftCoverageListItemViewModel.Ready(OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.OFF);
                        }
                    }
                }
            }
            permanentlyDisabled = null;
            if (permanentlyDisabled != null) {
            }
        }
        overdraftCoverageListItemViewModel = OverdraftCoverageListItemViewModel.Loading.INSTANCE;
        gapComposer.end(false);
        return overdraftCoverageListItemViewModel;
    }
}
