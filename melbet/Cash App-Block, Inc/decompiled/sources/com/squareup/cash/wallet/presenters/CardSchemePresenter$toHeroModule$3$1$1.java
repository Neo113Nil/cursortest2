package com.squareup.cash.wallet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.glance.layout.ColumnKt;
import androidx.media3.extractor.text.ttml.TtmlRenderUtil;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.ViewSizeResolver$size$3$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.cdf.browser.BrowserDismissEditAutofillDetails;
import com.squareup.cash.cdf.browser.BrowserTapSubmitEditedAutofillDetails;
import com.squareup.cash.cdf.cash.CashRequestCancel;
import com.squareup.cash.cdf.cash.CashSendCancel;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.customersupport.Channel;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenLink;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactStart;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsConfirmAlias;
import com.squareup.cash.cdf.passkey.PasskeyCreateFailedRetry;
import com.squareup.cash.cdf.passkey.PasskeyCreateTapped;
import com.squareup.cash.cdf.passkey.PasskeyDeleteConfirmed;
import com.squareup.cash.cdf.passkey.PasskeyDeleteFailedRetry;
import com.squareup.cash.cdf.passkey.PasskeyDeleteTapped;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionEditDistributionDone;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionEditDistributionShowHelp;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionStartEditAllocation;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.cdf.stock.StockInteractInteractInvestSearch;
import com.squareup.cash.cdf.stock.StockSelectSelectDisclosures;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewEvent;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.music.viewmodels.MusicViewEvent;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.p2pblocking.screens.P2PAllowlistScreen;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewEvent;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.presenters.MultipleAllocationPresenter$models$1$4;
import com.squareup.cash.paychecks.screens.CustomAllocationQuestion;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.HelpSheetScreen;
import com.squareup.cash.paychecks.screens.OverallocationAlertDialogScreen;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewEvent;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewEvent;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1;
import com.squareup.cash.payments.presenters.QuickPayPresenter;
import com.squareup.cash.payments.presenters.QuickPayState;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.phoneplans.WirelessProviderListBlockerScreen;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$2;
import com.squareup.cash.phoneplans.WirelessProviderListViewEvent;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewEvent;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.autofill.presenters.AutofillCombinedInfo;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.shopping.autofill.presenters.InputViewModelExtKt;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.transfers.presenters.ScheduledReloadConfirmationPresenter;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewEvent;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.ui.overlays.viewmodels.BannerStyle;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$Config;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1$2$1;
import com.squareup.cash.work.screens.DeclareCashTipResult$Cancelled;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewEvent;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.HttpUrl;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CardSchemePresenter$toHeroModule$3$1$1 implements FlowCollector {
    public final /* synthetic */ Object $copiedTagDeviceId$delegate;
    public final /* synthetic */ Object $copyText$delegate;
    public final /* synthetic */ Object $hasPendingCopyAfterAuth$delegate;
    public final /* synthetic */ Object $pendingCopiedTagDeviceId$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, MutableState mutableState, MutableState mutableState2, State state) {
        this.$r8$classId = 11;
        this.$copiedTagDeviceId$delegate = realGenericProfileElementsPresenter;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$pendingCopiedTagDeviceId$delegate = mutableState2;
        this.$copyText$delegate = state;
        this.this$0 = coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v5 */
    private final Object emit$com$squareup$cash$payments$presenters$QuickPayPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState;
        Long l;
        Event cashSendCancel;
        QuickPayState quickPayState;
        Analytics analytics;
        boolean z;
        boolean z2;
        boolean z3;
        MutableState mutableState2;
        boolean z4;
        boolean z5;
        boolean z6;
        QuickPayState quickPayState2;
        ?? r26;
        boolean z7;
        MutableState mutableState3 = (MutableState) this.$copiedTagDeviceId$delegate;
        QuickPayPresenter quickPayPresenter = (QuickPayPresenter) this.$copyText$delegate;
        Analytics analytics2 = quickPayPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = quickPayPresenter.navigator;
        PaymentScreens.QuickPay quickPay = quickPayPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        QuickPayViewEvent quickPayViewEvent = (QuickPayViewEvent) obj;
        MutableState mutableState4 = (MutableState) this.$pendingCopiedTagDeviceId$delegate;
        Continuation continuation2 = null;
        if (quickPayViewEvent instanceof QuickPayViewEvent.OnDialogResult) {
            QuickPayViewEvent.OnDialogResult onDialogResult = (QuickPayViewEvent.OnDialogResult) quickPayViewEvent;
            Screen screen = onDialogResult.screenArgs;
            Object obj2 = onDialogResult.result;
            if ((screen instanceof PaymentScreens.SelectPaymentInstrument) || (screen instanceof HistoryScreens.SelectPaymentInstrument)) {
                SelectPaymentInstrumentResult selectPaymentInstrumentResult = obj2 instanceof SelectPaymentInstrumentResult ? (SelectPaymentInstrumentResult) obj2 : null;
                SelectPaymentInstrumentResult.Status status = selectPaymentInstrumentResult != null ? selectPaymentInstrumentResult.status : null;
                int i = status == null ? -1 : QuickPayPresenter.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i == 1) {
                    String str = selectPaymentInstrumentResult.token;
                    str.getClass();
                    ((MutableState) this.$hasPendingCopyAfterAuth$delegate).setValue(new InstrumentSelection(str, selectPaymentInstrumentResult.acceptedAmount, (CashInstrumentType) null, 12));
                    quickPayState2 = QuickPayState.copy$default((QuickPayState) mutableState4.getValue(), null, null, null, false, selectPaymentInstrumentResult.acceptedAmount, null, null, null, null, null, null, null, false, str, false, null, null, 237535);
                } else if (i != 2) {
                    quickPayState2 = QuickPayState.copy$default((QuickPayState) mutableState4.getValue(), null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, 253951);
                } else {
                    FlowStarter flowStarter = quickPayPresenter.flowStarter;
                    CashInstrumentType cashInstrumentType = selectPaymentInstrumentResult.linkType;
                    cashInstrumentType.getClass();
                    Orientation orientation = quickPay.orientation;
                    List list = ((QuickPayState) mutableState4.getValue()).paymentGetters;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzahi.toRecipient((PaymentRecipient) it.next()));
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((Recipient) it2.next()).isBusiness) {
                                z7 = true;
                                break;
                            }
                        }
                    }
                    z7 = false;
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startInstrumentLinkingFlow(cashInstrumentType, orientation, z7, ClientScenario.PAYMENT_FLOW, quickPayPresenter.args));
                    quickPayState2 = (QuickPayState) mutableState4.getValue();
                }
            } else if (screen instanceof PaymentScreens.ConfirmDuplicate) {
                quickPayState2 = obj2 == AlertDialogResult.POSITIVE ? QuickPayState.copy$default((QuickPayState) mutableState4.getValue(), null, null, null, true, null, null, null, null, null, null, null, null, false, null, false, null, null, 262127) : (QuickPayState) mutableState4.getValue();
            } else if (screen instanceof PaymentScreens.QuickPayDetails) {
                PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged paymentScreens$QuickPayDetails$Result$PaymentOrientationChanged = obj2 instanceof PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged ? (PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged) obj2 : null;
                if (paymentScreens$QuickPayDetails$Result$PaymentOrientationChanged != null) {
                    mutableState3.setValue(PersonalizePaymentEntrypointButtonViewModel.copy$default((PersonalizePaymentEntrypointButtonViewModel) mutableState3.getValue(), paymentScreens$QuickPayDetails$Result$PaymentOrientationChanged.newOrientation == Orientation.CASH, false, false, false, 30));
                    quickPayState2 = QuickPayState.copy$default((QuickPayState) mutableState4.getValue(), null, paymentScreens$QuickPayDetails$Result$PaymentOrientationChanged.newOrientation, null, false, null, null, null, null, null, null, null, null, false, null, false, null, (PersonalizePaymentEntrypointButtonViewModel) mutableState3.getValue(), 131067);
                } else {
                    quickPayState2 = (QuickPayState) mutableState4.getValue();
                }
            } else {
                quickPayState2 = screen instanceof PaymentScreens.NoteRequired ? QuickPayState.copy$default((QuickPayState) mutableState4.getValue(), null, null, null, false, null, "", VersionedKt.update(((QuickPayState) mutableState4.getValue()).shouldRequestNoteFocus, Boolean.TRUE), null, null, null, null, null, false, null, false, null, null, 261951) : (QuickPayState) mutableState4.getValue();
            }
        } else if (quickPayViewEvent instanceof QuickPayViewEvent.AmountEntered) {
            String str2 = ((QuickPayViewEvent.AmountEntered) quickPayViewEvent).amount;
            CurrencyCode currencyCode = quickPay.amount.currency_code;
            currencyCode.getClass();
            Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(str2, currencyCode);
            QuickPayState quickPayState3 = (QuickPayState) mutableState4.getValue();
            Long l2 = parseMoneyFromString$default.amount;
            l2.getClass();
            double longValue = l2.longValue();
            CurrencyCode currencyCode2 = quickPay.amount.currency_code;
            currencyCode2.getClass();
            quickPayState2 = QuickPayState.copy$default(quickPayState3, parseMoneyFromString$default, null, null, false, null, null, null, null, null, null, null, null, false, null, longValue < Moneys.displayDivisor(currencyCode2), null, null, 229357);
        } else if (quickPayViewEvent instanceof QuickPayViewEvent.NoteEntered) {
            QuickPayState quickPayState4 = (QuickPayState) mutableState4.getValue();
            String str3 = ((QuickPayViewEvent.NoteEntered) quickPayViewEvent).note;
            if (str3 == null) {
                str3 = "";
            }
            quickPayState2 = QuickPayState.copy$default(quickPayState4, null, null, null, false, null, StringsKt___StringsKt.take(50, str3), null, null, null, null, null, null, false, null, false, null, null, 262079);
        } else if (Intrinsics.areEqual(quickPayViewEvent, QuickPayViewEvent.SelectInstrumentClick.INSTANCE)) {
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            BalanceSnapshot balanceSnapshot = ((QuickPayState) mutableState4.getValue()).balanceSnapshot;
            if (balanceSnapshot != null) {
                createListBuilder.add(balanceSnapshot.token);
            }
            List list2 = ((QuickPayState) mutableState4.getValue()).instruments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Instrument) it3.next()).token);
            }
            createListBuilder.addAll(arrayList2);
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
            List list3 = ((QuickPayState) mutableState4.getValue()).paymentGetters;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((PaymentRecipient) it4.next()).paymentInfo);
            }
            Money money = ((QuickPayState) mutableState4.getValue()).amount;
            InstrumentLinkingConfig instrumentLinkingConfig = ((QuickPayState) mutableState4.getValue()).instrumentLinkingConfig;
            instrumentLinkingConfig.getClass();
            boolean z8 = instrumentLinkingConfig.credit_card_linking_enabled;
            InstrumentLinkingConfig instrumentLinkingConfig2 = ((QuickPayState) mutableState4.getValue()).instrumentLinkingConfig;
            instrumentLinkingConfig2.getClass();
            boolean z9 = instrumentLinkingConfig2.cash_balance_enabled;
            InstrumentLinkingConfig instrumentLinkingConfig3 = ((QuickPayState) mutableState4.getValue()).instrumentLinkingConfig;
            instrumentLinkingConfig3.getClass();
            long j = instrumentLinkingConfig3.credit_card_fee_bps;
            EmptyList emptyList = EmptyList.INSTANCE;
            String str4 = ((QuickPayState) mutableState4.getValue()).selectedInstrumentToken;
            if (str4 == null) {
                SelectPaymentInstrumentOption.ExistingOption selectedInstrument = QuickPayPresenter.getSelectedInstrument((QuickPayState) mutableState4.getValue());
                if (selectedInstrument instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                    continuation2 = ((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) selectedInstrument).balance.token;
                } else if (selectedInstrument instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) {
                    continuation2 = ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) selectedInstrument).instrument.token;
                }
                r26 = continuation2;
            } else {
                r26 = str4;
            }
            screenNavigator.goTo(new PaymentScreens.SelectPaymentInstrument(build, arrayList3, money, z8, z9, j, emptyList, true, r26));
            quickPayState2 = QuickPayState.copy$default((QuickPayState) mutableState4.getValue(), null, null, null, false, null, null, null, null, null, null, null, null, true, null, false, null, null, 253951);
        } else {
            if (quickPayViewEvent instanceof QuickPayViewEvent.PrimaryButtonClick) {
                QuickPayState quickPayState5 = (QuickPayState) mutableState4.getValue();
                JobKt.launch$default(coroutineScope, null, null, new PhonePlansHomePresenter$models$1$1(quickPayPresenter, quickPayState5, ((QuickPayViewEvent.PrimaryButtonClick) quickPayViewEvent).lastGesturesSignal, continuation2, 11), 3);
                quickPayState = quickPayState5;
                mutableState = mutableState4;
                mutableState.setValue(quickPayState);
                return Unit.INSTANCE;
            }
            if (!(quickPayViewEvent instanceof QuickPayViewEvent.OpenDetails)) {
                if (quickPayViewEvent instanceof QuickPayViewEvent.PersonalizePaymentClick) {
                    QuickPayState quickPayState6 = (QuickPayState) mutableState4.getValue();
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    BlockersData.MoneybotContext moneybotContext = quickPay.moneybotContext;
                    PaymentScreens.QuickPay.QuickPayAnalytics quickPayAnalytics = quickPay.analytics;
                    PaymentInitiatorData createPaymentInitiatorData$presenters = quickPayPresenter.createPaymentInitiatorData$presenters(quickPayState6, emptyList2, moneybotContext);
                    InstrumentLinkingConfig instrumentLinkingConfig4 = quickPayState6.instrumentLinkingConfig;
                    Money money2 = quickPayState6.amount;
                    List list4 = quickPayState6.paymentGetters;
                    boolean z10 = !list4.isEmpty();
                    boolean z11 = list4.size() > 1;
                    boolean z12 = quickPayState6.orientation == Orientation.CASH;
                    List list5 = list4;
                    boolean z13 = list5 instanceof Collection;
                    if (!z13 || !list5.isEmpty()) {
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            analytics = analytics2;
                            z = z13;
                            if (((PaymentRecipient) it5.next()).recipientType != RecipientType.CUSTOMER) {
                                z2 = false;
                                break;
                            }
                            z13 = z;
                            analytics2 = analytics;
                        }
                    }
                    analytics = analytics2;
                    z = z13;
                    z2 = true;
                    Region region = quickPayState6.region;
                    region.getClass();
                    if (!z || !list5.isEmpty()) {
                        Iterator it6 = list5.iterator();
                        while (it6.hasNext()) {
                            z3 = z2;
                            Region region2 = ((PaymentRecipient) it6.next()).sendableUiCustomer.region;
                            mutableState2 = mutableState4;
                            if ((region2 != null && region2 != Region.USA) || region != region2) {
                                z4 = false;
                                break;
                            }
                            z2 = z3;
                            mutableState4 = mutableState2;
                        }
                    }
                    z3 = z2;
                    mutableState2 = mutableState4;
                    z4 = true;
                    Long l3 = money2.amount;
                    if (l3 != null && l3.longValue() == 0) {
                        z5 = z12;
                        z6 = true;
                    } else {
                        z5 = z12;
                        z6 = false;
                    }
                    boolean isNetworkAvailable = quickPayPresenter.networkInfo.isNetworkAvailable();
                    boolean z14 = z5;
                    boolean z15 = z4;
                    boolean z16 = z6;
                    boolean z17 = Moneys.compareTo(money2, new Money(Long.valueOf((long) Moneys.displayDivisor(money2.currency_code)), (CurrencyCode) null, 6)) < 0;
                    CurrencyCode currencyCode3 = money2.currency_code;
                    if (currencyCode3 == null) {
                        currencyCode3 = CurrencyCode.USD;
                    }
                    AndroidStringManager androidStringManager = quickPayPresenter.stringManager;
                    MoneyFormatter moneyFormatter = quickPayPresenter.moneyFormatter;
                    CurrencyCode currencyCode4 = currencyCode3;
                    UUID uuid = quickPayAnalytics.externalPaymentId;
                    RedactedParcelableList redactedParcelableList = new RedactedParcelableList(list4);
                    RedactedString redactedString = new RedactedString(quickPayState6.note);
                    InstrumentSelectionData instrumentSelectionData = createPaymentInitiatorData$presenters.selection;
                    boolean z18 = createPaymentInitiatorData$presenters.ignoreDuplicate;
                    String str5 = createPaymentInitiatorData$presenters.referrer;
                    String str6 = createPaymentInitiatorData$presenters.launchUrl;
                    AppCreationActivity appCreationActivity = createPaymentInitiatorData$presenters.appCreationActivity;
                    String str7 = createPaymentInitiatorData$presenters.exchangeRatesToken;
                    Screen screen2 = quickPay.exitScreen;
                    instrumentLinkingConfig4.getClass();
                    PaymentScreens.PersonalizePayment personalizePayment = new PaymentScreens.PersonalizePayment(uuid, money2, redactedParcelableList, redactedString, instrumentSelectionData, z18, str5, str6, appCreationActivity, str7, screen2, instrumentLinkingConfig4.credit_card_linking_enabled, instrumentLinkingConfig4.credit_card_fee_bps, instrumentLinkingConfig4.cash_balance_enabled, ClientScenario.PAYMENT_FLOW, quickPayPresenter.personalizedPaymentFlowToken, createPaymentInitiatorData$presenters.moneybotContext, false, (PersonalizationOrigin) null, 917504);
                    String str8 = quickPayPresenter.personalizedPaymentFlowToken;
                    EntryPoint entryPoint = EntryPoint.PERSON_FIRST;
                    String uuid2 = quickPayAnalytics.externalPaymentId.toString();
                    uuid2.getClass();
                    mutableState = mutableState2;
                    UtilsKt.showPersonalizePayments(str8, z10, z11, z14, z3, z15, z16, isNetworkAvailable, z17, currencyCode4, screenNavigator, androidStringManager, moneyFormatter, personalizePayment, analytics, entryPoint, uuid2, PersonalizationOrigin.BUTTON, PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.INSTANCE);
                    quickPayState = quickPayState6;
                } else {
                    mutableState = mutableState4;
                    if (!(quickPayViewEvent instanceof QuickPayViewEvent.Close)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i2 = QuickPayPresenter.WhenMappings.$EnumSwitchMapping$1[quickPay.orientation.ordinal()];
                    if (i2 == 1) {
                        l = null;
                        cashSendCancel = new CashSendCancel(null, null, null, null);
                    } else {
                        if (i2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        l = null;
                        cashSendCancel = new CashRequestCancel(null, null, null, null);
                    }
                    analytics2.track(cashSendCancel, l);
                    screenNavigator.goTo(Back.INSTANCE);
                    quickPayState = (QuickPayState) mutableState.getValue();
                }
                mutableState.setValue(quickPayState);
                return Unit.INSTANCE;
            }
            quickPayState2 = (QuickPayState) mutableState4.getValue();
            quickPay.getClass();
            quickPayState2.getClass();
            Orientation orientation2 = quickPayState2.orientation;
            List list6 = quickPayState2.paymentGetters;
            Money money3 = quickPayState2.amount;
            orientation2.getClass();
            list6.getClass();
            screenNavigator.goTo(new PaymentScreens.QuickPayDetails(orientation2, new PaymentScreens.QuickPay.QuickPayAnalytics(quickPay.analytics.externalPaymentId, (Origin) null, (SuggestionStrategy) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, 8190), list6, ColorModel.PrimaryButtonBackground.INSTANCE, money3, money3));
        }
        quickPayState = quickPayState2;
        mutableState = mutableState4;
        mutableState.setValue(quickPayState);
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$shopping$autofill$presenters$EditAutofillPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$copiedTagDeviceId$delegate;
        MutableState mutableState2 = (MutableState) this.$pendingCopiedTagDeviceId$delegate;
        MutableState mutableState3 = (MutableState) this.$hasPendingCopyAfterAuth$delegate;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$copyText$delegate;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
        ShoppingAutofillAnalyticsHandler shoppingAutofillAnalyticsHandler = (ShoppingAutofillAnalyticsHandler) localEditorialPresenter.service;
        EditAutofillScreen editAutofillScreen = (EditAutofillScreen) localEditorialPresenter.clock;
        AutofillCombinedInfo autofillCombinedInfo = (AutofillCombinedInfo) localEditorialPresenter.screen;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        EditAutofillViewEvent editAutofillViewEvent = (EditAutofillViewEvent) obj;
        boolean z = editAutofillViewEvent instanceof EditAutofillViewEvent.BackClicked;
        AutofillQuestion.Result.EditAutofillDismissed editAutofillDismissed = AutofillQuestion.Result.EditAutofillDismissed.INSTANCE;
        if (z) {
            if (Intrinsics.areEqual((AutofillCombinedInfo) mutableState3.getValue(), autofillCombinedInfo)) {
                Screen screen = editAutofillScreen.origin;
                screen.getClass();
                shoppingAutofillAnalyticsHandler.analytics.track(new BrowserDismissEditAutofillDetails(ShoppingAutofillAnalyticsHandler.originScreenToAnalyticsOrigin(screen), Boolean.FALSE), null);
                screenNavigator.giveAnswer(editAutofillScreen.question, editAutofillDismissed);
            } else {
                mutableState2.setValue(Boolean.TRUE);
            }
        } else if (editAutofillViewEvent instanceof EditAutofillViewEvent.InputChanged) {
            EditAutofillViewEvent.InputChanged inputChanged = (EditAutofillViewEvent.InputChanged) editAutofillViewEvent;
            mutableState3.setValue(InputViewModelExtKt.update((AutofillCombinedInfo) mutableState3.getValue(), inputChanged.f1200type, inputChanged.newValue));
        } else if (editAutofillViewEvent instanceof EditAutofillViewEvent.InputDropdownSelection) {
            EditAutofillViewEvent.InputDropdownSelection inputDropdownSelection = (EditAutofillViewEvent.InputDropdownSelection) editAutofillViewEvent;
            InputViewModel.InputType inputType = inputDropdownSelection.f1201type;
            if (inputType == InputViewModel.InputType.STATE) {
                mutableState3.setValue(InputViewModelExtKt.update((AutofillCombinedInfo) mutableState3.getValue(), inputType, inputDropdownSelection.newValue));
            }
        } else if (Intrinsics.areEqual(editAutofillViewEvent, EditAutofillViewEvent.DiscardChangesAccepted.INSTANCE)) {
            screenNavigator.giveAnswer(editAutofillScreen.question, editAutofillDismissed);
            Screen screen2 = editAutofillScreen.origin;
            screen2.getClass();
            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserDismissEditAutofillDetails(ShoppingAutofillAnalyticsHandler.originScreenToAnalyticsOrigin(screen2), Boolean.TRUE), null);
            mutableState2.setValue(Boolean.FALSE);
        } else if (editAutofillViewEvent instanceof EditAutofillViewEvent.DiscardChangesDismissed) {
            AutofillAnalyticsParam autofillAnalyticsParam = editAutofillScreen.analyticsParam;
            if (autofillAnalyticsParam != null) {
                shoppingAutofillAnalyticsHandler.trackBrowserCheckoutDismissAutofillError(autofillAnalyticsParam, ((EditAutofillViewEvent.DiscardChangesDismissed) editAutofillViewEvent).errorTitle);
            }
            mutableState2.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual(editAutofillViewEvent, EditAutofillViewEvent.SuccessAnimationCompleted.INSTANCE)) {
            AskedQuestion askedQuestion = editAutofillScreen.question;
            ShippingAddress shippingAddress = (ShippingAddress) localEditorialPresenter.responseContextHandler;
            shippingAddress.getClass();
            screenNavigator.giveAnswer(askedQuestion, new AutofillQuestion.Result.EditAutofillConfirmed(shippingAddress));
        } else if (Intrinsics.areEqual(editAutofillViewEvent, EditAutofillViewEvent.CtaButtonClicked.INSTANCE)) {
            Screen screen3 = editAutofillScreen.origin;
            boolean z2 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).firstName, autofillCombinedInfo.firstName);
            boolean z3 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).lastName, autofillCombinedInfo.lastName);
            boolean z4 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).email, autofillCombinedInfo.email);
            boolean z5 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).phone, autofillCombinedInfo.phone);
            boolean z6 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).address.address_line_1, autofillCombinedInfo.address.address_line_1);
            boolean z7 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).address.address_line_2, autofillCombinedInfo.address.address_line_2);
            boolean z8 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).address.locality, autofillCombinedInfo.address.locality);
            boolean z9 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).address.administrative_district_level_1, autofillCombinedInfo.address.administrative_district_level_1);
            boolean z10 = !Intrinsics.areEqual(((AutofillCombinedInfo) mutableState3.getValue()).address.postal_code, autofillCombinedInfo.address.postal_code);
            screen3.getClass();
            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserTapSubmitEditedAutofillDetails(ShoppingAutofillAnalyticsHandler.originScreenToAnalyticsOrigin(screen3), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(z10)), null);
            mutableState.setValue(AutofillState.Loading.INSTANCE);
            JobKt.launch$default(coroutineScope, null, null, new BasicShieetKt$BasicShieet$4$1(localEditorialPresenter, mutableState3, mutableState, null, 14), 3);
        } else {
            if (!Intrinsics.areEqual(editAutofillViewEvent, EditAutofillViewEvent.ErrorCloseClicked.INSTANCE) && !Intrinsics.areEqual(editAutofillViewEvent, EditAutofillViewEvent.ErrorCtaButtonClicked.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            mutableState.setValue(AutofillState.Loaded.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$support$presenters$SupportSearchPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$hasPendingCopyAfterAuth$delegate;
        SupportSearchPresenter supportSearchPresenter = (SupportSearchPresenter) this.$copyText$delegate;
        SupportScreens.FlowScreens.SupportSearchScreen supportSearchScreen = supportSearchPresenter.args;
        Analytics analytics = supportSearchPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = supportSearchPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        SupportSearchViewEvent supportSearchViewEvent = (SupportSearchViewEvent) obj;
        Continuation continuation2 = null;
        if (supportSearchViewEvent instanceof SupportSearchViewEvent.SearchTextChanged) {
            JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1((MutableSharedFlow) this.$copiedTagDeviceId$delegate, supportSearchViewEvent, null, 27), 3);
        } else if (supportSearchViewEvent instanceof SupportSearchViewEvent.ResultSelected) {
            JobKt.launch$default(coroutineScope, null, null, new ArticlePresenter$models$1$1(supportSearchPresenter, mutableState, supportSearchViewEvent, continuation2, 23), 3);
        } else if (supportSearchViewEvent instanceof SupportSearchViewEvent.ContactOptionSelected) {
            int ordinal = ((SupportSearchViewEvent.ContactOptionSelected) supportSearchViewEvent).contactOptionType.ordinal();
            if (ordinal == 0) {
                SupportSearchPresenter.State state = (SupportSearchPresenter.State) mutableState.getValue();
                Channel channel = Channel.CHAT;
                SupportScreens.FlowScreens.Data data = supportSearchScreen.data;
                analytics.track(new CustomerSupportContactStart(channel, data.flowToken, CustomerSupportContactStart.Trigger.SEARCH, data.paymentToken, null, state.viewToken, null, null, null, 464), null);
                SupportScreens.FlowScreens.Data data2 = supportSearchScreen.data;
                screenNavigator.goTo(new SupportChatScreens.FlowScreen.ChatLoading(supportSearchScreen, data2.paymentToken, null, data2.flowToken, null, null, 52));
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) ((MutableState) this.$pendingCopiedTagDeviceId$delegate).getValue();
                SupportSearchPresenter.State state2 = (SupportSearchPresenter.State) mutableState.getValue();
                Channel channel2 = Channel.CALLBACK;
                SupportScreens.FlowScreens.Data data3 = supportSearchScreen.data;
                analytics.track(new CustomerSupportContactStart(channel2, data3.flowToken, CustomerSupportContactStart.Trigger.SEARCH, data3.paymentToken, null, state2.viewToken, ColumnKt.getChannelAvailability(supportPhoneStatus), ColumnKt.getChannelStatus(supportPhoneStatus), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), null);
                int ordinal2 = ColumnKt.getNextScreenOnSelected(supportPhoneStatus).ordinal();
                if (ordinal2 == 0) {
                    RealRouter realRouter = supportSearchPresenter.router;
                    ClientRoute.Flow phoneSupportRoute = TtmlRenderUtil.getPhoneSupportRoute(data3.paymentToken, null);
                    RoutingParams routingParams = new RoutingParams(supportSearchPresenter.args, BlockersData.AnalyticsData.Source.SUPPORT_SEARCH.getAnalyticsName(), null, null, null, null, 508);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(phoneSupportRoute, routingParams);
                } else {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Feature not enabled");
                        return null;
                    }
                    screenNavigator.goTo(new SupportScreens.SupportPhoneStatusScreen(true, data3.flowToken, CustomerSupportPhoneViewStatus.Trigger.SEARCH_CONTACT_BUTTON));
                }
            }
        } else {
            if (!Intrinsics.areEqual(supportSearchViewEvent, SupportSearchViewEvent.GoBack.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$support$presenters$UnauthenticatedArticlePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$pendingCopiedTagDeviceId$delegate;
        MutableState mutableState2 = (MutableState) this.$hasPendingCopyAfterAuth$delegate;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$copyText$delegate;
        SupportScreens.UnauthenticatedArticleScreen unauthenticatedArticleScreen = (SupportScreens.UnauthenticatedArticleScreen) localEditorialPresenter.clock;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        ArticleViewEvent articleViewEvent = (ArticleViewEvent) obj;
        HttpUrl httpUrl = null;
        Object[] objArr = 0;
        if (articleViewEvent instanceof ArticleViewEvent.OpenUrl) {
            String str = ((ArticleViewEvent.OpenUrl) articleViewEvent).url;
            ((Analytics) localEditorialPresenter.installedStore).track(new CustomerSupportAccessOpenLink(unauthenticatedArticleScreen.flowToken, unauthenticatedArticleScreen.token, (String) localEditorialPresenter.responseContextHandler, str), null);
            str.getClass();
            try {
                HttpUrl.Builder builder = new HttpUrl.Builder();
                builder.parse$okhttp(null, str);
                httpUrl = builder.build();
            } catch (IllegalArgumentException unused) {
            }
            if (httpUrl != null) {
                ((RealRouter) localEditorialPresenter.stringManager).route(new RoutingParams(null, null, null, null, null, null, 511), str);
            } else {
                Timber.Forest.e("Malformed link in support article %s. URL: %s", unauthenticatedArticleScreen.token, str);
            }
        } else if (articleViewEvent instanceof ArticleViewEvent.ClickLink) {
            JobKt.launch$default(coroutineScope, null, null, new ArticlePresenter$models$1$1(25, mutableState2, (Object) localEditorialPresenter, (Object) articleViewEvent, (Continuation) (objArr == true ? 1 : 0)), 3);
        } else {
            if (articleViewEvent instanceof ArticleViewEvent.ActivityTransactionClicked) {
                a$$ExternalSyntheticBUOutline0.m$1("UnauthenticatedArticlePresenter does not support transactions");
                return null;
            }
            if (articleViewEvent instanceof ArticleViewEvent.Contact) {
                a$$ExternalSyntheticBUOutline0.m$1("UnauthenticatedArticlePresenter does not support contact option");
                return null;
            }
            if (Intrinsics.areEqual(articleViewEvent, ArticleViewEvent.GoBack.INSTANCE)) {
                ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(Back.INSTANCE);
            } else if (Intrinsics.areEqual(articleViewEvent, ArticleViewEvent.Retry.INSTANCE)) {
                mutableState2.setValue(null);
                int intValue = ((Number) mutableState.getValue()).intValue();
                mutableState.setValue(Integer.valueOf(intValue + 1));
                Okio.boxInt(intValue);
            } else {
                if (!Intrinsics.areEqual(articleViewEvent, ArticleViewEvent.NoWebViewProvided.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((MutableState) this.$copiedTagDeviceId$delegate).setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$work$presenters$WorkReviewTermsBanner$configFlow$$inlined$map$1$2(Object obj, Continuation continuation) {
        WorkReviewTermsBanner$configFlow$$inlined$map$1$2$1 workReviewTermsBanner$configFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WorkReviewTermsBanner$configFlow$$inlined$map$1$2$1) {
            workReviewTermsBanner$configFlow$$inlined$map$1$2$1 = (WorkReviewTermsBanner$configFlow$$inlined$map$1$2$1) continuation;
            int i2 = workReviewTermsBanner$configFlow$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                workReviewTermsBanner$configFlow$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = workReviewTermsBanner$configFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = workReviewTermsBanner$configFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    WorkReviewTermsBanner$Config workReviewTermsBanner$Config = ((Boolean) obj).booleanValue() ? new WorkReviewTermsBanner$Config(new AlertBannerViewModel(((AndroidStringManager) this.$copyText$delegate).get(R.string.work_review_terms_banner_message), BannerStyle.INFORMATIONAL), new KClassImpl$Data$$Lambda$23(12, (BetterNavigator.ScreenNavigator) this.$hasPendingCopyAfterAuth$delegate, (FlowStarter) this.$pendingCopiedTagDeviceId$delegate, (Screen) this.$copiedTagDeviceId$delegate)) : null;
                    workReviewTermsBanner$configFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(workReviewTermsBanner$Config, workReviewTermsBanner$configFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        workReviewTermsBanner$configFlow$$inlined$map$1$2$1 = new WorkReviewTermsBanner$configFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = workReviewTermsBanner$configFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workReviewTermsBanner$configFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x043c, code lost:
    
        if (r7.emit(r0, r5) == r1) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08db, code lost:
    
        if (r0 != null) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03aa  */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.squareup.cash.music.viewmodels.MusicViewModel$Loaded] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.squareup.cash.music.viewmodels.MusicViewModel$Loaded] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Screen profileFor;
        Set set;
        MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1 mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1;
        int i;
        FlowCollector flowCollector;
        List list;
        MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1 mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12;
        List list2;
        int i2;
        RecipientViewModel recipientViewModel;
        Long l;
        int i3 = this.$r8$classId;
        int i4 = 0;
        Back back = Back.INSTANCE;
        int i5 = 1;
        Object obj2 = this.$copiedTagDeviceId$delegate;
        Object obj3 = this.this$0;
        Object obj4 = this.$pendingCopiedTagDeviceId$delegate;
        Object obj5 = this.$copyText$delegate;
        Object obj6 = this.$hasPendingCopyAfterAuth$delegate;
        PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel = null;
        PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel2 = null;
        Track track = null;
        switch (i3) {
            case 0:
                return emit((PresenterEvents.ExecuteCopy) obj, continuation);
            case 1:
                MutableState mutableState = (MutableState) obj6;
                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) obj5;
                Analytics analytics = investingSearchPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator = investingSearchPresenter.navigator;
                CategoryToken categoryToken = investingSearchPresenter.categoryToken;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                InvestingSearchViewEvent investingSearchViewEvent = (InvestingSearchViewEvent) obj;
                if (investingSearchViewEvent instanceof InvestingSearchViewEvent.FilterConfigurationSelected) {
                    FilterConfiguration filterConfiguration = ((InvestingSearchViewEvent.FilterConfigurationSelected) investingSearchViewEvent).filterConfiguration;
                    if (filterConfiguration instanceof FilterConfiguration.Empty) {
                        mutableState.setValue(MapsKt__MapsKt.minus((Map) mutableState.getValue(), ((FilterConfiguration.Empty) filterConfiguration).filterToken));
                    } else if (filterConfiguration instanceof FilterConfiguration.SubFilters) {
                        FilterConfiguration.SubFilters subFilters = (FilterConfiguration.SubFilters) filterConfiguration;
                        FilterToken filterToken = subFilters.filterToken;
                        mutableState.setValue(subFilters.subFilterSelections.isEmpty() ? MapsKt__MapsKt.minus((Map) mutableState.getValue(), filterToken) : MapsKt__MapsKt.plus((Map) mutableState.getValue(), new Pair(filterToken, filterConfiguration)));
                    } else {
                        if (!(filterConfiguration instanceof FilterConfiguration.Categories)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FilterConfiguration.Categories categories = (FilterConfiguration.Categories) filterConfiguration;
                        FilterToken filterToken2 = categories.filterToken;
                        mutableState.setValue(categories.categoryTokens.isEmpty() ? MapsKt__MapsKt.minus((Map) mutableState.getValue(), filterToken2) : MapsKt__MapsKt.plus((Map) mutableState.getValue(), new Pair(filterToken2, filterConfiguration)));
                    }
                } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.ResetFiltersClicked) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    mutableState.setValue(emptyMap);
                } else {
                    Continuation continuation2 = null;
                    if (investingSearchViewEvent instanceof InvestingSearchViewEvent.BackClicked) {
                        investingSearchPresenter.filterConfigurationCache.cache = null;
                        if (categoryToken == null) {
                            Iterator it = investingSearchPresenter.categoryFilterConfigurationCacheMap.map.values().iterator();
                            while (it.hasNext()) {
                                ((Cache) it.next()).cache = null;
                            }
                        }
                        screenNavigator.goTo(back);
                    } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.StockClicked) {
                        InvestingSearchViewEvent.StockClicked stockClicked = (InvestingSearchViewEvent.StockClicked) investingSearchViewEvent;
                        InvestingSearchViewEvent.StockClicked.SearchStockOrigin searchStockOrigin = stockClicked.origin;
                        if (searchStockOrigin instanceof InvestingSearchViewEvent.StockClicked.SearchStockOrigin.SearchCarousel) {
                            JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$setEntry$2(2, investingSearchPresenter, investingSearchViewEvent, CollectionsKt.joinToString$default(((InvestingSearchViewEvent.StockClicked.SearchStockOrigin.SearchCarousel) searchStockOrigin).tickers, "|", null, null, 0, null, null, 62), continuation2), 3);
                        }
                        screenNavigator.goTo(new InvestingScreens.StockDetails(null, stockClicked.token, categoryToken == null ? StockViewViewStockDetails.InvestingScreenOrigin.INVEST_SEARCH : StockViewViewStockDetails.InvestingScreenOrigin.CATEGORY, null, null, false, 57));
                    } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.CategoryClicked) {
                        JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$2$1(investingSearchPresenter, investingSearchViewEvent, continuation2, i5), 3);
                    } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.DisclosureClicked) {
                        analytics.track(new StockSelectSelectDisclosures(StockSelectSelectDisclosures.DisclosureOrigin.INVEST_SEARCH), null);
                        investingSearchPresenter.launcher.launchUrlInInternalBrowser(((InvestingSearchViewEvent.DisclosureClicked) investingSearchViewEvent).url);
                    } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.InteractedWithSearchBar) {
                        analytics.track(new StockInteractInteractInvestSearch(), null);
                    } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.SearchTextChanged) {
                        ((MutableState) obj4).setValue(((InvestingSearchViewEvent.SearchTextChanged) investingSearchViewEvent).text);
                    } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.FilterSelected) {
                        JobKt.launch$default(coroutineScope, investingSearchPresenter.ioDispatcher, null, new GLThread$start$2(investingSearchPresenter, investingSearchViewEvent, (ColorModel) obj2, mutableState, null, 28), 2);
                    } else if (!Intrinsics.areEqual(investingSearchViewEvent, InvestingSearchViewEvent.FilterMenuClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj2;
                MoneybotAmountInputScreen moneybotAmountInputScreen = (MoneybotAmountInputScreen) verifyCheckDialogPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator;
                MutableState mutableState2 = (MutableState) obj4;
                MoneybotAmountInputViewEvent moneybotAmountInputViewEvent = (MoneybotAmountInputViewEvent) obj;
                if (moneybotAmountInputViewEvent instanceof MoneybotAmountInputViewEvent.AmountChanged) {
                    String str = ((MoneybotAmountInputViewEvent.AmountChanged) moneybotAmountInputViewEvent).rawAmount;
                    ((MutableState) obj6).setValue(str);
                    mutableState2.setValue(Moneys.parseMoneyFromString$default(str, (CurrencyCode) obj3));
                } else if (Intrinsics.areEqual(moneybotAmountInputViewEvent, MoneybotAmountInputViewEvent.ContinueTapped.INSTANCE)) {
                    MoneybotAmountInputQuestion moneybotAmountInputQuestion = (MoneybotAmountInputQuestion) obj5;
                    if (AudioConfigUtil.access$isValid((Money) mutableState2.getValue(), moneybotAmountInputQuestion.minAmount, moneybotAmountInputQuestion.maxAmount)) {
                        screenNavigator2.giveAnswer(moneybotAmountInputScreen.askedQuestion, new MoneybotAmountInputAnswer.Selected((Money) mutableState2.getValue()));
                    }
                } else {
                    if (!Intrinsics.areEqual(moneybotAmountInputViewEvent, MoneybotAmountInputViewEvent.Dismissed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.giveAnswer(moneybotAmountInputScreen.askedQuestion, MoneybotAmountInputAnswer.Dismissed.INSTANCE);
                }
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState3 = (MutableState) obj4;
                MusicPresenter musicPresenter = (MusicPresenter) obj5;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                MusicViewEvent musicViewEvent = (MusicViewEvent) obj;
                if (musicViewEvent instanceof MusicViewEvent.Close) {
                    JobKt.launch$default(coroutineScope2, null, null, new MusicPresenter$models$3$1(musicPresenter, null, 0), 3);
                } else if (musicViewEvent instanceof MusicViewEvent.TrackTapped) {
                    JobKt.launch$default(coroutineScope2, null, null, new MusicPresenter$models$1$1(musicPresenter, musicViewEvent, (MutableState) obj6, mutableState3, (Continuation) null), 3);
                } else if (musicViewEvent instanceof MusicViewEvent.ChooseTapped) {
                    ((RealMusicPlayer) musicPresenter.musicPlayer).stop();
                    Iterator it2 = ((List) ((MutableState) obj6).getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next = it2.next();
                            if (((Track) next).isSelected) {
                                track = next;
                            }
                        }
                    }
                    Track track2 = track;
                    AskedQuestion askedQuestion = ((MusicScreen) musicPresenter.args).question;
                    if (track2 == null || askedQuestion == null) {
                        screenNavigator3.goTo(back);
                    } else {
                        screenNavigator3.giveAnswer(askedQuestion, new MusicScreen.SelectedTrackResult(track2.image, track2.title, track2.artist, track2.musicId));
                    }
                } else {
                    if (!(musicViewEvent instanceof MusicViewEvent.SearchTextChanged)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MusicViewEvent.SearchTextChanged searchTextChanged = (MusicViewEvent.SearchTextChanged) musicViewEvent;
                    ((StateFlowImpl) ((MutableStateFlow) obj2)).setValue(searchTextChanged.query);
                    MusicViewModel musicViewModel = (MusicViewModel) mutableState3.getValue();
                    ?? r5 = musicViewModel instanceof MusicViewModel.Loaded ? (MusicViewModel.Loaded) musicViewModel : null;
                    mutableState3.setValue(r5 != null ? MusicViewModel.Loaded.copy$default(r5, null, false, RecyclerView.DECELERATION_RATE, searchTextChanged.query, 7) : (MusicViewModel) mutableState3.getValue());
                }
                return Unit.INSTANCE;
            case 4:
                State state = (State) obj5;
                MutableState mutableState4 = (MutableState) obj6;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj3;
                AndroidStringManager androidStringManager = (AndroidStringManager) localCashBalancePresenter.stringManager;
                P2PListScreen p2PListScreen = (P2PListScreen) localCashBalancePresenter.service;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
                P2PListViewEvent p2PListViewEvent = (P2PListViewEvent) obj;
                if (Intrinsics.areEqual(p2PListViewEvent, P2PListViewEvent.TapBack.INSTANCE)) {
                    screenNavigator4.goTo(back);
                } else if (p2PListViewEvent instanceof P2PListViewEvent.TapHelp) {
                    ((RealRouter) localCashBalancePresenter.screen).route(new RoutingParams(null, null, null, null, null, null, 511), ((P2PListViewEvent.TapHelp) p2PListViewEvent).clientRouteUrl);
                } else {
                    boolean z = false;
                    if (Intrinsics.areEqual(p2PListViewEvent, P2PListViewEvent.DismissDialog.INSTANCE)) {
                        mutableState4.setValue(null);
                    } else if (p2PListViewEvent instanceof P2PListViewEvent.TapRowButton) {
                        JobKt.launch$default((CoroutineScope) obj4, null, null, new RealMRIFactory$sign$2(localCashBalancePresenter, p2PListViewEvent, mutableState4, z ? 1 : 0, 25), 3);
                    } else if (p2PListViewEvent instanceof P2PListViewEvent.TapAllowlist) {
                        P2PListViewEvent.TapAllowlist tapAllowlist = (P2PListViewEvent.TapAllowlist) p2PListViewEvent;
                        if (tapAllowlist.isAtLimit) {
                            Integer num = tapAllowlist.limit;
                            if (num != null) {
                                int intValue = num.intValue();
                                String str2 = (String) state.getValue();
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Resources resources = androidStringManager.resources;
                                resources.getClass();
                                String format2 = new MessageFormat(resources.getString(R.string.allow_list_exceeded_limit_dialog_title)).format(new Object[]{str2});
                                format2.getClass();
                                Integer num2 = new Integer(intValue);
                                String str3 = (String) state.getValue();
                                Object[] objArr = {num2, str3 != null ? str3 : ""};
                                Resources resources2 = androidStringManager.resources;
                                resources2.getClass();
                                String format3 = new MessageFormat(resources2.getString(R.string.allow_list_exceeded_limit_dialog_body)).format(objArr);
                                format3.getClass();
                                mutableState4.setValue(new P2PFailureDialogModel(format2, format3, androidStringManager.get(R.string.allow_list_exceeded_limit_dialog_button)));
                            }
                        } else {
                            P2PListData p2PListData = (P2PListData) ((State) obj2).getValue();
                            P2PListData.AllowListData allowListData = p2PListData instanceof P2PListData.AllowListData ? (P2PListData.AllowListData) p2PListData : null;
                            if (allowListData != null) {
                                ArrayList arrayList = allowListData.customers;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj7 : arrayList) {
                                    if (Intrinsics.areEqual(((AllowlistCustomer) obj7).is_in_allowlist, Boolean.TRUE)) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    BlocklyCustomerMetadata blocklyCustomerMetadata = ((AllowlistCustomer) it3.next()).metadata;
                                    String str4 = blocklyCustomerMetadata != null ? blocklyCustomerMetadata.customer_token : null;
                                    if (str4 != null) {
                                        arrayList3.add(str4);
                                    }
                                }
                                set = CollectionsKt.toSet(arrayList3);
                                break;
                            }
                            set = EmptySet.INSTANCE;
                            Set set2 = set;
                            String str5 = p2PListScreen.forCustomerToken;
                            String str6 = (String) state.getValue();
                            P2PScreenMode p2PScreenMode = p2PListScreen.screenMode;
                            P2PScreenMode.AllowList allowList = p2PScreenMode instanceof P2PScreenMode.AllowList ? (P2PScreenMode.AllowList) p2PScreenMode : null;
                            screenNavigator4.goTo(new P2PAllowlistScreen(str5, str6, allowList != null ? allowList.limit : null, set2, P2PListScreen.copy$default(p2PListScreen)));
                        }
                    } else if (Intrinsics.areEqual(p2PListViewEvent, P2PListViewEvent.TapBlocklist.INSTANCE)) {
                        screenNavigator4.goTo(new SelectCustomerScreen(p2PListScreen.forCustomerToken, p2PListScreen.context, P2PListScreen.copy$default(p2PListScreen), p2PListScreen.screenMode));
                    } else {
                        if (!(p2PListViewEvent instanceof P2PListViewEvent.TapAvatar)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                        profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(((P2PListViewEvent.TapAvatar) p2PListViewEvent).tapAvatarEvent.customerToken, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, RealUuidGenerator.generate(), GetProfileDetailsContext.ACTIVITY_OTHER, CustomerProfileViewOpen.EntryPoint.CELL_AVATAR, (P2PListScreen) localCashBalancePresenter.service, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                        screenNavigator4.goTo(profileFor);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                State state2 = (State) obj5;
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter;
                RealPasskeyAnalytics realPasskeyAnalytics = (RealPasskeyAnalytics) workHomePresenter.payPresenter;
                MutableState mutableState5 = (MutableState) obj6;
                PasskeyManagementViewEvent passkeyManagementViewEvent = (PasskeyManagementViewEvent) obj;
                if (Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.BackButtonTapped.INSTANCE)) {
                    screenNavigator5.goTo(back);
                } else {
                    boolean areEqual = Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.CreatePasskeyTapped.INSTANCE);
                    PasskeyManagementViewModel.OperationState.Create.InProgress inProgress = PasskeyManagementViewModel.OperationState.Create.InProgress.INSTANCE;
                    if (areEqual) {
                        if (((PasskeyManagementViewModel.OperationState) mutableState5.getValue()) == null) {
                            mutableState5.setValue(inProgress);
                            realPasskeyAnalytics.analytics.track(new PasskeyCreateTapped(), null);
                        }
                    } else if (Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.DismissCreatePasskey.INSTANCE)) {
                        PasskeyManagementViewModel.OperationState operationState = (PasskeyManagementViewModel.OperationState) mutableState5.getValue();
                        if ((operationState instanceof PasskeyManagementViewModel.OperationState.Create) && !(operationState instanceof PasskeyManagementViewModel.OperationState.Create.InProgress)) {
                            WorkHomePresenter.access$trackPasskeyOperationDismissed(workHomePresenter, realPasskeyAnalytics, operationState);
                            mutableState5.setValue(null);
                        }
                    } else if (Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.RetryCreatePasskey.INSTANCE)) {
                        realPasskeyAnalytics.analytics.track(new PasskeyCreateFailedRetry(), null);
                        PasskeyManagementViewModel.OperationState operationState2 = (PasskeyManagementViewModel.OperationState) mutableState5.getValue();
                        if ((operationState2 instanceof PasskeyManagementViewModel.OperationState.Create.Error) && ((PasskeyManagementViewModel.OperationState.Create.Error) operationState2).isRetryable) {
                            mutableState5.setValue(inProgress);
                        }
                    } else if (Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.RetryLoadPasskeys.INSTANCE)) {
                        PasskeyManagementViewModel passkeyManagementViewModel = (PasskeyManagementViewModel) state2.getValue();
                        PasskeyManagementViewModel.Error error = passkeyManagementViewModel instanceof PasskeyManagementViewModel.Error ? (PasskeyManagementViewModel.Error) passkeyManagementViewModel : null;
                        if (error != null) {
                            ((MutableState) obj4).setValue(error);
                            NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                        }
                    } else if (passkeyManagementViewEvent instanceof PasskeyManagementViewEvent.RemovePasskeyTapped) {
                        realPasskeyAnalytics.analytics.track(new PasskeyDeleteTapped(), null);
                        PasskeyManagementViewModel passkeyManagementViewModel2 = (PasskeyManagementViewModel) state2.getValue();
                        PasskeyManagementViewModel.Loaded loaded = passkeyManagementViewModel2 instanceof PasskeyManagementViewModel.Loaded ? (PasskeyManagementViewModel.Loaded) passkeyManagementViewModel2 : null;
                        if (loaded != null) {
                            Iterator it4 = loaded.passkeys.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    ?? next2 = it4.next();
                                    if (Intrinsics.areEqual(((PasskeyManagementViewModel.PasskeyItemViewModel) next2).id, ((PasskeyManagementViewEvent.RemovePasskeyTapped) passkeyManagementViewEvent).passkey.id)) {
                                        passkeyItemViewModel = next2;
                                    }
                                }
                            }
                            passkeyItemViewModel2 = passkeyItemViewModel;
                        }
                        if (passkeyItemViewModel2 != null) {
                            mutableState5.setValue(new PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation(passkeyItemViewModel2));
                        } else {
                            mutableState5.setValue(new PasskeyManagementViewModel.OperationState.Remove.Error(((PasskeyManagementViewEvent.RemovePasskeyTapped) passkeyManagementViewEvent).passkey));
                        }
                    } else if (Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.DismissRemovePasskey.INSTANCE)) {
                        WorkHomePresenter.access$trackPasskeyOperationDismissed(workHomePresenter, realPasskeyAnalytics, (PasskeyManagementViewModel.OperationState) mutableState5.getValue());
                        mutableState5.setValue(null);
                    } else if (passkeyManagementViewEvent instanceof PasskeyManagementViewEvent.ConfirmRemovePasskey) {
                        realPasskeyAnalytics.analytics.track(new PasskeyDeleteConfirmed(), null);
                        PasskeyManagementViewModel.OperationState operationState3 = (PasskeyManagementViewModel.OperationState) mutableState5.getValue();
                        if (operationState3 instanceof PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation) {
                            PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel3 = ((PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation) operationState3).passkey;
                            if (Intrinsics.areEqual(passkeyItemViewModel3.id, ((PasskeyManagementViewEvent.ConfirmRemovePasskey) passkeyManagementViewEvent).passkeyId)) {
                                mutableState5.setValue(new PasskeyManagementViewModel.OperationState.Remove.InProgress(passkeyItemViewModel3));
                            }
                        }
                    } else if (passkeyManagementViewEvent instanceof PasskeyManagementViewEvent.RetryRemovePasskey) {
                        realPasskeyAnalytics.analytics.track(new PasskeyDeleteFailedRetry(), null);
                        PasskeyManagementViewModel.OperationState operationState4 = (PasskeyManagementViewModel.OperationState) mutableState5.getValue();
                        if (operationState4 instanceof PasskeyManagementViewModel.OperationState.Remove.Error) {
                            PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel4 = ((PasskeyManagementViewModel.OperationState.Remove.Error) operationState4).passkey;
                            if (Intrinsics.areEqual(passkeyItemViewModel4.id, ((PasskeyManagementViewEvent.RetryRemovePasskey) passkeyManagementViewEvent).passkeyId)) {
                                mutableState5.setValue(new PasskeyManagementViewModel.OperationState.Remove.InProgress(passkeyItemViewModel4));
                            }
                        }
                    } else {
                        if (!Intrinsics.areEqual(passkeyManagementViewEvent, PasskeyManagementViewEvent.ManageDevicesTapped.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator5.goTo(new DeviceManagerListScreen());
                    }
                }
                return Unit.INSTANCE;
            case 6:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj6;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                Analytics analytics2 = (Analytics) localHomePresenter.localHomeGeoPresenterFactory;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj3;
                DistributePaycheckViewEvent distributePaycheckViewEvent = (DistributePaycheckViewEvent) obj;
                if (Intrinsics.areEqual(distributePaycheckViewEvent, DistributePaycheckViewEvent.Exit.INSTANCE)) {
                    analytics2.track(new PaychecksManageDistributionEditDistributionDone(), null);
                    screenNavigator6.goTo(back);
                } else {
                    boolean areEqual2 = Intrinsics.areEqual(distributePaycheckViewEvent, DistributePaycheckViewEvent.Help.INSTANCE);
                    HelpSheetScreen helpSheetScreen = HelpSheetScreen.INSTANCE;
                    if (areEqual2) {
                        analytics2.track(new PaychecksManageDistributionEditDistributionShowHelp(), null);
                        screenNavigator6.goTo(helpSheetScreen);
                    } else if (distributePaycheckViewEvent instanceof DistributePaycheckViewEvent.AllocationRowViewEvent) {
                        DestinationAllocationRowViewEvent destinationAllocationRowViewEvent = ((DistributePaycheckViewEvent.AllocationRowViewEvent) distributePaycheckViewEvent).event;
                        PaychecksUiConfiguration paychecksUiConfiguration = (PaychecksUiConfiguration) ((State) obj5).getValue();
                        paychecksUiConfiguration.getClass();
                        PaycheckAllocationDistribution paycheckAllocationDistribution = (PaycheckAllocationDistribution) ((State) obj2).getValue();
                        MutableState mutableState6 = (MutableState) ((Ref$ObjectRef) obj4).element;
                        if (destinationAllocationRowViewEvent instanceof DestinationAllocationRowViewEvent.ViewAllocationEvent) {
                            if (paycheckAllocationDistribution != null && !com.squareup.cash.paychecks.presenters.util.UtilsKt.destinationIsAllocated(paycheckAllocationDistribution, ((DestinationAllocationRowViewEvent.ViewAllocationEvent) destinationAllocationRowViewEvent).destination)) {
                                Iterator it5 = paycheckAllocationDistribution.allocations.iterator();
                                double d = 0.0d;
                                while (it5.hasNext()) {
                                    AllocationDestination allocationDestination = ((PaycheckAllocationDistribution.DestinationAndShare) it5.next()).destination;
                                    allocationDestination.getClass();
                                    d += !(allocationDestination instanceof AllocationDestination.CashBalanceDestination) ? r11.shareInBasisPoints / 10000.0f : 0.0d;
                                }
                                if (((float) d) >= 1.0f) {
                                    screenNavigator6.goTo(new OverallocationAlertDialogScreen(paychecksUiConfiguration.distributionSummary.overallocationAlert));
                                }
                            }
                            DestinationAllocationRowViewEvent.ViewAllocationEvent viewAllocationEvent = (DestinationAllocationRowViewEvent.ViewAllocationEvent) destinationAllocationRowViewEvent;
                            AllocationDestination allocationDestination2 = viewAllocationEvent.destination;
                            analytics2.track(new PaychecksManageDistributionStartEditAllocation(com.squareup.cash.paychecks.presenters.util.UtilsKt.toDestinationType(allocationDestination2), Boolean.valueOf(paycheckAllocationDistribution != null ? com.squareup.cash.paychecks.presenters.util.UtilsKt.destinationIsAllocated(paycheckAllocationDistribution, allocationDestination2) : false)), null);
                            JobKt.launch$default(coroutineScope3, null, null, new MusicPresenter$models$1$1(mutableState6, localHomePresenter, viewAllocationEvent.destination, paychecksUiConfiguration, (Continuation) null), 3);
                        } else {
                            if (!(destinationAllocationRowViewEvent instanceof DestinationAllocationRowViewEvent.ViewInfoEvent)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator6.goTo(helpSheetScreen);
                        }
                    } else {
                        if (!(distributePaycheckViewEvent instanceof DistributePaycheckViewEvent.OnDialogResult)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Screen screen = ((DistributePaycheckViewEvent.OnDialogResult) distributePaycheckViewEvent).screen;
                        if (!(screen instanceof OverallocationAlertDialogScreen) && !(screen instanceof BlockersScreens.Error)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) distributePaycheckViewEvent, "Unsupported result received: ");
                            return null;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState7 = (MutableState) obj4;
                MutableState mutableState8 = (MutableState) obj2;
                MutableState mutableState9 = (MutableState) obj6;
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj5;
                BetterNavigator.ScreenNavigator screenNavigator7 = cardLockPresenter.navigator;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                MultipleAllocationViewEvent multipleAllocationViewEvent = (MultipleAllocationViewEvent) obj;
                Event cdfEvent = multipleAllocationViewEvent.getCdfEvent();
                Continuation continuation3 = null;
                if (cdfEvent != null) {
                    ((Analytics) cardLockPresenter.analytics).track(cdfEvent, null);
                }
                if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.Exit) {
                    JobKt.launch$default((CoroutineScope) cardLockPresenter.cardLockFlowTypeProvider, null, null, new MusicPresenter$models$3$1(cardLockPresenter, null, 14), 3);
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.OpenSingleAllocationEditor) {
                    screenNavigator7.askQuestion(EditDistributionScreen.UpdatedAllocationQuestion.INSTANCE, new VerifyCheckDepositPresenter$models$3$2(21, cardLockPresenter, multipleAllocationViewEvent));
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.Submit.SubmitSingleAllocation) {
                    JobKt.launch$default(coroutineScope4, null, null, new MultipleAllocationPresenter$models$1$4(cardLockPresenter, multipleAllocationViewEvent, mutableState9, continuation3, 0), 3);
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.Submit.SubmitAllocations) {
                    JobKt.launch$default(coroutineScope4, null, null, new MultipleAllocationPresenter$models$1$4(cardLockPresenter, multipleAllocationViewEvent, mutableState9, continuation3, 1), 3);
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.Submit.DisableAllocations) {
                    JobKt.launch$default(coroutineScope4, null, null, new MultipleAllocationPresenter$models$1$4(cardLockPresenter, multipleAllocationViewEvent, mutableState9, continuation3, 2), 3);
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.TapInfoButton) {
                    mutableState7.setValue(Boolean.TRUE);
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.ExplanationDismissed) {
                    mutableState7.setValue(Boolean.FALSE);
                } else if (multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.DragWheel) {
                    MultipleAllocationViewEvent.DragWheel dragWheel = (MultipleAllocationViewEvent.DragWheel) multipleAllocationViewEvent;
                    mutableState8.setValue(CardLockPresenter.distributionUpdated(ColorResources_androidKt.group((List) mutableState8.getValue()), dragWheel.index, com.squareup.cash.paychecks.presenters.util.UtilsKt.getBasisPoints(dragWheel.percentage)));
                } else {
                    if (!(multipleAllocationViewEvent instanceof MultipleAllocationViewEvent.TapHeroPercentage)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator7.askQuestion(new CustomAllocationQuestion(), new ViewSizeResolver$size$3$1(8, ColorResources_androidKt.selectedGroup(ColorResources_androidKt.group((List) mutableState8.getValue())), cardLockPresenter, mutableState8));
                }
                return Unit.INSTANCE;
            case 8:
                if (continuation instanceof MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1) {
                    mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1 = (MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1) continuation;
                    int i6 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj8 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            flowCollector = (FlowCollector) obj3;
                            list = (List) obj;
                            if (((CryptoPaymentManager.SelectedRecipient) obj5) != null || ((String) obj4).length() > 0) {
                                MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) obj2;
                                PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
                                if (!mainPayment.isFiatPayment) {
                                    List list3 = CollectionsKt.toList(((Map) ((MutableState) obj6).getValue()).keySet());
                                    mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.L$4 = flowCollector;
                                    mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.L$6 = list;
                                    mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.I$0 = 0;
                                    mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.label = 1;
                                    MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1 mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$13 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1;
                                    Object clipboardRecipient = UtilsKt.getClipboardRecipient((String) obj4, mainPayment.cryptoPaymentOrigin, mainPaymentPresenter.cryptoPaymentManager, mainPaymentPresenter.stringManager, (CryptoPaymentManager.SelectedRecipient) obj5, list3, mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$13);
                                    mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$13;
                                    if (clipboardRecipient != coroutineSingletons) {
                                        list2 = list;
                                        obj8 = clipboardRecipient;
                                        i2 = 0;
                                    }
                                    return coroutineSingletons;
                                }
                            }
                            mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1;
                            mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.L$4 = null;
                            mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.L$6 = null;
                            mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.I$0 = i4;
                            mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.label = 2;
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj8);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i7 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.I$0;
                            list2 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.L$6;
                            flowCollector = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.L$4;
                            SafeTrace.throwOnFailure(obj8);
                            mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1;
                            i2 = i7;
                        }
                        recipientViewModel = (RecipientViewModel) obj8;
                        list2.getClass();
                        if (recipientViewModel == null) {
                            ArrayList arrayList4 = new ArrayList(list2);
                            arrayList4.add(0, new SectionViewModel("", SectionViewModel.Type.SUGGESTED, CollectionsKt__CollectionsJVMKt.listOf(recipientViewModel), null, null));
                            list = arrayList4;
                        } else {
                            list = list2;
                        }
                        i4 = i2;
                        mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.L$4 = null;
                        mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.L$6 = null;
                        mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.I$0 = i4;
                        mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.label = 2;
                    }
                }
                mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1 = new MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1(this, continuation);
                Object obj82 = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1.label;
                if (i != 0) {
                }
                recipientViewModel = (RecipientViewModel) obj82;
                list2.getClass();
                if (recipientViewModel == null) {
                }
                i4 = i2;
                mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.L$4 = null;
                mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.L$6 = null;
                mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.I$0 = i4;
                mainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$12.label = 2;
                break;
            case 9:
                return emit$com$squareup$cash$payments$presenters$QuickPayPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 10:
                MutableState mutableState10 = (MutableState) obj4;
                WirelessProviderListPresenter wirelessProviderListPresenter = (WirelessProviderListPresenter) obj5;
                WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen = wirelessProviderListPresenter.args;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj3;
                WirelessProviderListViewEvent wirelessProviderListViewEvent = (WirelessProviderListViewEvent) obj;
                if (wirelessProviderListViewEvent instanceof WirelessProviderListViewEvent.SearchTextChanged) {
                    ((MutableState) obj6).setValue(((WirelessProviderListViewEvent.SearchTextChanged) wirelessProviderListViewEvent).text);
                } else if (wirelessProviderListViewEvent instanceof WirelessProviderListViewEvent.ProviderSelected) {
                    mutableState10.setValue(((WirelessProviderListViewEvent.ProviderSelected) wirelessProviderListViewEvent).id);
                } else {
                    Continuation continuation4 = null;
                    if (wirelessProviderListViewEvent instanceof WirelessProviderListViewEvent.SubmitClicked) {
                        String str7 = (String) mutableState10.getValue();
                        if (str7 != null) {
                            JobKt.launch$default(coroutineScope5, null, null, new PdfPreviewPresenter$models$1$1(6, (MutableState) obj2, wirelessProviderListPresenter, str7, continuation4), 3);
                        }
                    } else if (wirelessProviderListViewEvent instanceof WirelessProviderListViewEvent.TitleBarButtonClicked) {
                        BlockerAction blockerAction = wirelessProviderListBlockerScreen.retreatAction;
                        if (blockerAction == null) {
                            blockerAction = wirelessProviderListBlockerScreen.dismissAction;
                        }
                        if (blockerAction != null) {
                            JobKt.launch$default(coroutineScope5, null, null, new WirelessProviderListPresenter$models$1$2(wirelessProviderListPresenter, blockerAction, continuation4, r4 ? 1 : 0), 3);
                        } else {
                            wirelessProviderListPresenter.navigator.goTo(wirelessProviderListBlockerScreen.blockersData.exitScreen);
                        }
                    } else {
                        if (!(wirelessProviderListViewEvent instanceof WirelessProviderListViewEvent.HelpButtonClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BlockerAction blockerAction2 = wirelessProviderListBlockerScreen.helpAction;
                        if (blockerAction2 != null) {
                            JobKt.launch$default(coroutineScope5, null, null, new WirelessProviderListPresenter$models$1$2(wirelessProviderListPresenter, blockerAction2, continuation4, i5), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState11 = (MutableState) obj6;
                RealGenericProfileElementsPresenter realGenericProfileElementsPresenter = (RealGenericProfileElementsPresenter) obj2;
                EglCore eglCore = realGenericProfileElementsPresenter.favoritesNavigator;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj3;
                GenericProfileElementsViewEvent genericProfileElementsViewEvent = (GenericProfileElementsViewEvent) obj;
                if (genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.BlockButtonClicked) {
                    CustomerProfileData customerProfileData = (CustomerProfileData) mutableState11.getValue();
                    customerProfileData.getClass();
                    GenericProfileElement.ButtonElement.BlockAction blockAction = ((GenericProfileElementsViewEvent.BlockButtonClicked) genericProfileElementsViewEvent).action;
                    boolean areEqual3 = Intrinsics.areEqual(blockAction.block, Boolean.TRUE);
                    String str8 = blockAction.flow_url;
                    BetterNavigator.ScreenNavigator screenNavigator8 = realGenericProfileElementsPresenter.navigator;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    String str9 = customerProfileData.customerId;
                    str9.getClass();
                    screenNavigator8.goTo(new HistoryScreens.ReportAbuseDialogScreen(areEqual3, generateToken, str9, null, new RedactedString(customerProfileData.firstName), str8, null, null, realGenericProfileElementsPresenter.parentScreen));
                } else if (!(genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.PaymentHistoryViewEvent)) {
                    if (genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.ReportProfileClicked) {
                        JobKt.launch$default(coroutineScope6, null, null, new ShoppingWebBridge.AnonymousClass1(realGenericProfileElementsPresenter, r13, 7), 3);
                    } else if (genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.ReportProfileResult) {
                        JobKt.launch$default(coroutineScope6, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(realGenericProfileElementsPresenter, mutableState11, (Continuation) null), 3);
                    } else if (genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.FavoritesListAddClicked) {
                        ((BetterNavigator.ScreenNavigator) eglCore.eglDisplay).goTo(new AddFavorites(RealUuidGenerator.generate()));
                    } else if (genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.FavoritesListViewAllClicked) {
                        eglCore.showListFavorites(realGenericProfileElementsPresenter.inAppMessageToken != null ? PersonalProfileViewOpenScreen.EntryPoint.APP_MESSAGE : PersonalProfileViewOpenScreen.EntryPoint.PROFILE);
                    } else if (genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.FavoritesListFavoriteClicked) {
                        UUID uuid = realGenericProfileElementsPresenter.externalPaymentId;
                        com.squareup.cash.recipients.data.Recipient recipient = ((GenericProfileElementsViewEvent.FavoritesListFavoriteClicked) genericProfileElementsViewEvent).recipient;
                        Screen screen2 = realGenericProfileElementsPresenter.parentScreen;
                        com.squareup.cash.cdf.thread.EntryPoint[] entryPointArr = com.squareup.cash.cdf.thread.EntryPoint.$VALUES;
                        eglCore.showFavorite(uuid, recipient, screen2);
                    } else {
                        if (!(genericProfileElementsViewEvent instanceof GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope6, null, null, new PhonePlansHomePresenter$models$1$1(realGenericProfileElementsPresenter, genericProfileElementsViewEvent, (MutableState) obj4, (State) obj5, (Continuation) null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 12:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj5;
                Analytics analytics3 = (Analytics) pdfPreviewPresenter.launcher;
                EnableAliasSheetViewEvent enableAliasSheetViewEvent = (EnableAliasSheetViewEvent) obj;
                CoroutineContext coroutineContext = ((CoroutineScope) obj3).getCoroutineContext();
                if (enableAliasSheetViewEvent instanceof EnableAliasSheetViewEvent.AliasChecked) {
                    EnableAliasSheetViewEvent.AliasChecked aliasChecked = (EnableAliasSheetViewEvent.AliasChecked) enableAliasSheetViewEvent;
                    boolean z2 = aliasChecked.isPhoneAliasType;
                    Alias alias = aliasChecked.alias;
                    zzaky.trackToggleAlias(analytics3, !alias.isChecked, z2 ? UiAlias.Type.SMS : UiAlias.Type.EMAIL, true);
                    if (z2) {
                        MutableState mutableState12 = (MutableState) obj6;
                        mutableState12.setValue(PdfPreviewPresenter.access$updateCheckboxValue(pdfPreviewPresenter, (List) mutableState12.getValue(), alias));
                    } else {
                        MutableState mutableState13 = (MutableState) obj4;
                        mutableState13.setValue(PdfPreviewPresenter.access$updateCheckboxValue(pdfPreviewPresenter, (List) mutableState13.getValue(), alias));
                    }
                } else if (enableAliasSheetViewEvent instanceof EnableAliasSheetViewEvent.ConfirmClicked) {
                    ((MutableState) obj2).setValue(Boolean.TRUE);
                    String access$getSessionToken = PdfPreviewPresenter.access$getSessionToken(pdfPreviewPresenter);
                    ProfileScreens.EnableAliasSheetScreen enableAliasSheetScreen = (ProfileScreens.EnableAliasSheetScreen) pdfPreviewPresenter.fileSaver;
                    analytics3.track(new NotificationsSettingsConfirmAlias(access$getSessionToken, zzaky.getChannelListSettingsPage(enableAliasSheetScreen.notificationSettingsName), enableAliasSheetScreen.aliasType, enableAliasSheetScreen.origin), null);
                    JobKt.launch$default((CoroutineScope) pdfPreviewPresenter.pdfFile$delegate, null, null, new RealQrCodesPresenter$models$1$1(pdfPreviewPresenter, coroutineContext, (MutableState) obj6, (MutableState) obj4, (Continuation) null), 3);
                } else {
                    if (!(enableAliasSheetViewEvent instanceof EnableAliasSheetViewEvent.Dismiss)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    pdfPreviewPresenter.navigator.goTo(back);
                }
                return Unit.INSTANCE;
            case 13:
                return emit$com$squareup$cash$shopping$autofill$presenters$EditAutofillPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 14:
                return emit$com$squareup$cash$support$presenters$SupportSearchPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 15:
                return emit$com$squareup$cash$support$presenters$UnauthenticatedArticlePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 16:
                MutableState mutableState14 = (MutableState) obj2;
                MutableState mutableState15 = (MutableState) obj4;
                MutableState mutableState16 = (MutableState) obj6;
                ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter = (ScheduledReloadConfirmationPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator9 = scheduledReloadConfirmationPresenter.navigator;
                ScheduledReloadConfirmationViewEvent scheduledReloadConfirmationViewEvent = (ScheduledReloadConfirmationViewEvent) obj;
                if (Intrinsics.areEqual(scheduledReloadConfirmationViewEvent, ScheduledReloadConfirmationViewEvent.Close.INSTANCE)) {
                    BlockersData blockersData = scheduledReloadConfirmationPresenter.args.blockersData;
                    screenNavigator9.goTo(new RecurringReloadsDismissDialogScreen(blockersData.exitScreen, blockersData, RecurringReloadOptionScreen.ReloadType.SCHEDULED));
                } else if (Intrinsics.areEqual(scheduledReloadConfirmationViewEvent, ScheduledReloadConfirmationViewEvent.FrequencyClicked.INSTANCE)) {
                    Money money = ScheduledReloadConfirmationPresenter.PLACEHOLDER_AMOUNT;
                    scheduledReloadConfirmationPresenter.navigator.askQuestion(RecurringReloadConfigurationQuestion.INSTANCE, new OpenSourceKt$$ExternalSyntheticLambda9((RecurringSchedule.Frequency) mutableState16.getValue(), (Integer) mutableState15.getValue(), (Money) mutableState14.getValue(), RecurringReloadConfigurationScreen.ScheduledStartAt.FREQUENCY, 7));
                } else if (Intrinsics.areEqual(scheduledReloadConfirmationViewEvent, ScheduledReloadConfirmationViewEvent.DayClicked.INSTANCE)) {
                    Money money2 = ScheduledReloadConfirmationPresenter.PLACEHOLDER_AMOUNT;
                    RecurringSchedule.Frequency frequency = (RecurringSchedule.Frequency) mutableState16.getValue();
                    if (frequency != null) {
                        scheduledReloadConfirmationPresenter.navigator.askQuestion(RecurringReloadConfigurationQuestion.INSTANCE, new OpenSourceKt$$ExternalSyntheticLambda9(frequency, (Integer) mutableState15.getValue(), (Money) mutableState14.getValue(), RecurringReloadConfigurationScreen.ScheduledStartAt.DAY, 7));
                    }
                } else if (Intrinsics.areEqual(scheduledReloadConfirmationViewEvent, ScheduledReloadConfirmationViewEvent.AmountClicked.INSTANCE)) {
                    Money money3 = ScheduledReloadConfirmationPresenter.PLACEHOLDER_AMOUNT;
                    RecurringSchedule.Frequency frequency2 = (RecurringSchedule.Frequency) mutableState16.getValue();
                    if (frequency2 != null) {
                        scheduledReloadConfirmationPresenter.navigator.askQuestion(RecurringReloadConfigurationQuestion.INSTANCE, new OpenSourceKt$$ExternalSyntheticLambda9(frequency2, (Integer) mutableState15.getValue(), (Money) mutableState14.getValue(), RecurringReloadConfigurationScreen.ScheduledStartAt.AMOUNT, 7));
                    }
                } else if (Intrinsics.areEqual(scheduledReloadConfirmationViewEvent, ScheduledReloadConfirmationViewEvent.InstrumentCellTapped.INSTANCE)) {
                    screenNavigator9.goTo(RecurringReloadsChangeInstrumentScreen.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(scheduledReloadConfirmationViewEvent, ScheduledReloadConfirmationViewEvent.ConfirmClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Money money4 = ScheduledReloadConfirmationPresenter.PLACEHOLDER_AMOUNT;
                    ((MutableState) obj5).setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 17:
                return emit$com$squareup$cash$work$presenters$WorkReviewTermsBanner$configFlow$$inlined$map$1$2(obj, continuation);
            default:
                MutableState mutableState17 = (MutableState) obj6;
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj3;
                DeclareCashTipBottomSheetViewEvent declareCashTipBottomSheetViewEvent = (DeclareCashTipBottomSheetViewEvent) obj;
                if (Intrinsics.areEqual(declareCashTipBottomSheetViewEvent, DeclareCashTipBottomSheetViewEvent.Dismiss.INSTANCE)) {
                    AskedQuestion askedQuestion2 = (AskedQuestion) obj5;
                    BetterNavigator.ScreenNavigator screenNavigator10 = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                    if (askedQuestion2 != null) {
                        screenNavigator10.giveAnswer(askedQuestion2, DeclareCashTipResult$Cancelled.INSTANCE);
                    } else {
                        screenNavigator10.goTo(back);
                    }
                } else {
                    if (!(declareCashTipBottomSheetViewEvent instanceof DeclareCashTipBottomSheetViewEvent.SaveClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState17.setValue(Boolean.TRUE);
                    String str10 = ((DeclareCashTipBottomSheetViewEvent.SaveClicked) declareCashTipBottomSheetViewEvent).amountText;
                    AskedQuestion askedQuestion3 = (AskedQuestion) obj5;
                    CoroutineScope coroutineScope7 = (CoroutineScope) obj2;
                    KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23 = new KClassImpl$Data$$Lambda$23(13, shareSheetPresenter, mutableState17, (MutableState) obj4);
                    try {
                        StringBuilder sb = new StringBuilder();
                        int length = str10.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            char charAt = str10.charAt(i8);
                            if (Character.isDigit(charAt) || charAt == '.') {
                                sb.append(charAt);
                            }
                        }
                        l = Long.valueOf(new BigDecimal(sb.toString()).multiply(new BigDecimal(100)).longValue());
                    } catch (NumberFormatException unused) {
                        l = null;
                    }
                    if (l != null) {
                        JobKt.launch$default(coroutineScope7, null, null, new TakeUntil$collectSafely$2(shareSheetPresenter, new Money(l, (CurrencyCode) shareSheetPresenter.modelUpdates, 4), askedQuestion3, kClassImpl$Data$$Lambda$23, null, 20), 3);
                    } else {
                        kClassImpl$Data$$Lambda$23.invoke();
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, LocalCashBalancePresenter localCashBalancePresenter, MutableState mutableState, CoroutineScope coroutineScope2, State state, State state2) {
        this.$r8$classId = 4;
        this.this$0 = localCashBalancePresenter;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$pendingCopiedTagDeviceId$delegate = coroutineScope2;
        this.$copyText$delegate = state;
        this.$copiedTagDeviceId$delegate = state2;
    }

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, Ref$ObjectRef ref$ObjectRef, State state, State state2) {
        this.$r8$classId = 6;
        this.$hasPendingCopyAfterAuth$delegate = localHomePresenter;
        this.$pendingCopiedTagDeviceId$delegate = ref$ObjectRef;
        this.$copyText$delegate = state;
        this.$copiedTagDeviceId$delegate = state2;
        this.this$0 = coroutineScope;
    }

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, MusicPresenter musicPresenter, MutableStateFlow mutableStateFlow, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 3;
        this.$copyText$delegate = musicPresenter;
        this.$copiedTagDeviceId$delegate = mutableStateFlow;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$pendingCopiedTagDeviceId$delegate = mutableState2;
        this.this$0 = coroutineScope;
    }

    public /* synthetic */ CardSchemePresenter$toHeroModule$3$1$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.$copyText$delegate = obj2;
        this.$hasPendingCopyAfterAuth$delegate = obj3;
        this.$pendingCopiedTagDeviceId$delegate = obj4;
        this.$copiedTagDeviceId$delegate = obj5;
        this.this$0 = obj;
    }

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, SupportSearchPresenter supportSearchPresenter, MutableState mutableState, MutableSharedFlow mutableSharedFlow, MutableState mutableState2) {
        this.$r8$classId = 14;
        this.$copyText$delegate = supportSearchPresenter;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$copiedTagDeviceId$delegate = mutableSharedFlow;
        this.$pendingCopiedTagDeviceId$delegate = mutableState2;
        this.this$0 = coroutineScope;
    }

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.$r8$classId = 16;
        this.this$0 = scheduledReloadConfirmationPresenter;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$pendingCopiedTagDeviceId$delegate = mutableState2;
        this.$copiedTagDeviceId$delegate = mutableState3;
        this.$copyText$delegate = mutableState4;
    }

    public CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, WorkHomePresenter workHomePresenter, MutableState mutableState, State state, MutableState mutableState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 5;
        this.this$0 = workHomePresenter;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$copyText$delegate = state;
        this.$pendingCopiedTagDeviceId$delegate = mutableState2;
        this.$copiedTagDeviceId$delegate = parcelableSnapshotMutableIntState;
    }

    public /* synthetic */ CardSchemePresenter$toHeroModule$3$1$1(CoroutineScope coroutineScope, Object obj, Parcelable parcelable, Object obj2, MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$copyText$delegate = parcelable;
        this.$copiedTagDeviceId$delegate = obj2;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
        this.$pendingCopiedTagDeviceId$delegate = mutableState2;
    }

    public CardSchemePresenter$toHeroModule$3$1$1(FlowCollector flowCollector, CryptoPaymentManager.SelectedRecipient selectedRecipient, String str, MainPaymentPresenter mainPaymentPresenter, MutableState mutableState) {
        this.$r8$classId = 8;
        this.this$0 = flowCollector;
        this.$copyText$delegate = selectedRecipient;
        this.$pendingCopiedTagDeviceId$delegate = str;
        this.$copiedTagDeviceId$delegate = mainPaymentPresenter;
        this.$hasPendingCopyAfterAuth$delegate = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(PresenterEvents.ExecuteCopy executeCopy, Continuation continuation) {
        CardSchemePresenter$toHeroModule$3$1$1$emit$1 cardSchemePresenter$toHeroModule$3$1$1$emit$1;
        int i;
        PresenterEvents.ExecuteCopy executeCopy2;
        int i2;
        State state = (State) this.$copyText$delegate;
        CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.this$0;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardSchemePresenter.copyAnimationTrigger$delegate;
        if (continuation instanceof CardSchemePresenter$toHeroModule$3$1$1$emit$1) {
            cardSchemePresenter$toHeroModule$3$1$1$emit$1 = (CardSchemePresenter$toHeroModule$3$1$1$emit$1) continuation;
            int i3 = cardSchemePresenter$toHeroModule$3$1$1$emit$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cardSchemePresenter$toHeroModule$3$1$1$emit$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = cardSchemePresenter$toHeroModule$3$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSchemePresenter$toHeroModule$3$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i4 = ((String) state.getValue()) != null ? 1 : 0;
                    if (i4 == 0) {
                        ((MutableState) this.$hasPendingCopyAfterAuth$delegate).setValue(Boolean.TRUE);
                        ((MutableState) this.$pendingCopiedTagDeviceId$delegate).setValue(executeCopy.tagDeviceId);
                    }
                    String str = (String) state.getValue();
                    cardSchemePresenter$toHeroModule$3$1$1$emit$1.L$0 = executeCopy;
                    cardSchemePresenter$toHeroModule$3$1$1$emit$1.I$0 = i4;
                    cardSchemePresenter$toHeroModule$3$1$1$emit$1.label = 1;
                    if (cardSchemePresenter.copyCardAction(str, null, cardSchemePresenter$toHeroModule$3$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    executeCopy2 = executeCopy;
                    i2 = i4;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = cardSchemePresenter$toHeroModule$3$1$1$emit$1.I$0;
                    executeCopy2 = cardSchemePresenter$toHeroModule$3$1$1$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (i2 != 0) {
                    ((MutableState) this.$copiedTagDeviceId$delegate).setValue(executeCopy2.tagDeviceId);
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                }
                return Unit.INSTANCE;
            }
        }
        cardSchemePresenter$toHeroModule$3$1$1$emit$1 = new CardSchemePresenter$toHeroModule$3$1$1$emit$1(this, continuation);
        Object obj2 = cardSchemePresenter$toHeroModule$3$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSchemePresenter$toHeroModule$3$1$1$emit$1.label;
        if (i != 0) {
        }
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }
}
