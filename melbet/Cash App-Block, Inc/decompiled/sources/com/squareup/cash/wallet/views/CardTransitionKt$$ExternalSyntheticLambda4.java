package com.squareup.cash.wallet.views;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.sqldelight.TransactionWrapper;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.cdf.session.SessionChangeStateChanged;
import com.squareup.cash.db.Session;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewEvent;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore$andSaveGoalMet$1$1;
import com.squareup.cash.savings.db.SavingsGoalLocalStatus;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.sensors.RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1;
import com.squareup.cash.session.backend.DbSessionManager;
import com.squareup.cash.session.backend.DbSessionManager$delete$2$1;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$CardAvatarSectionView$lambda$0$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.SessionStatus;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SourceParams;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.uicore.navigation.NavigationIntent;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        float longValue;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        SessionStatus sessionStatus;
        SessionStatus sessionStatus2;
        InstrumentLinkingOptionsScreen.Option.Icon localIcon;
        String str5;
        InstrumentLinkingOption link;
        InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon localIcon2;
        Object obj3;
        String str6;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        String str7;
        String str8;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 6;
        int i4 = 10;
        int i5 = 12;
        int i6 = 2;
        int i7 = 11;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        int i8 = 3;
        final int i9 = 1;
        Object obj4 = this.f$1;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                final CardRegistry cardRegistry = (CardRegistry) obj6;
                final String str9 = (String) obj4;
                ((DisposableEffectScope) obj).getClass();
                cardRegistry.sourceCardRegistry.put(str9, (CardScreenId) obj5);
                final int i10 = 0;
                break;
            case 1:
                List list = (List) obj6;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.items(list.size(), new OverridingUtil.AnonymousClass7(i6, new PoolDetailsViewKt$$ExternalSyntheticLambda3(20), list), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 8), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list, (WirelessProviderListViewModel.Content) obj4, (Function1) obj5, i7), true, 802480018));
                break;
            case 2:
                PoolInvitePeopleListViewModel.Loaded loaded = (PoolInvitePeopleListViewModel.Loaded) obj6;
                Function1 function1 = (Function1) obj4;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                boolean z4 = loaded.shouldShowShareSection;
                boolean z5 = loaded.showContactPermissionPrompt;
                ImmutableList<PoolListSection> immutableList = loaded.sections;
                if (z4) {
                    obj2 = null;
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new PdfPreviewViewKt$$ExternalSyntheticLambda4(i5, function1), true, 1813383919), 3);
                } else {
                    obj2 = null;
                }
                if (immutableList.isEmpty() && !z5) {
                    LazyListScope.item$default(lazyListScope2, obj2, obj2, PoolToastKt.f574lambda$79846248, 3);
                }
                for (PoolListSection poolListSection : immutableList) {
                    LazyListScope.stickyHeader$default(lazyListScope2, null, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(poolListSection, 18), true, 121696586), 3);
                    ImmutableList immutableList2 = poolListSection.people;
                    lazyListScope2.items(immutableList2.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(immutableList2, 9), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(immutableList2, delegatingSoftwareKeyboardController, function1, i5), true, 802480018));
                }
                if (z5) {
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new PdfPreviewViewKt$$ExternalSyntheticLambda4(i7, function1), true, 790975351), 3);
                }
                break;
            case 3:
                Category.CategoryType.ChannelList channelList = (Category.CategoryType.ChannelList) obj6;
                ChannelListViewModel channelListViewModel = (ChannelListViewModel) obj4;
                Function1 function12 = (Function1) obj5;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new ShareSheetViewKt$$ExternalSyntheticLambda1(i2, channelListViewModel, channelList), true, -1641680551), 3);
                ArrayList arrayList = channelList.channels;
                lazyListScope3.items(arrayList.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(18, arrayList), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList, function12, 5), true, 802480018));
                if (channelList.adjustableThreshold != null) {
                    LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new ShareSheetViewKt$$ExternalSyntheticLambda1(i8, (Object) channelList, function12), true, 474070196), 3);
                }
                List list2 = ((ChannelListViewModel.Loaded) channelListViewModel).sponsoredFamilyMembers;
                if (list2 != null) {
                    LazyListScope.item$default(lazyListScope3, null, null, ChannelListViewKt.f602lambda$1343165653, 3);
                    if (list2.size() == 1) {
                        LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda5(i3, function12, channelListViewModel, channelList), true, -1941469690), 3);
                    } else {
                        lazyListScope3.items(list2.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list2, 11), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(18, function12, list2), true, 802480018));
                    }
                    LazyListScope.item$default(lazyListScope3, null, null, ChannelListViewKt.lambda$1517185506, 3);
                }
                break;
            case 4:
                Function1 function13 = (Function1) obj4;
                int intValue = ((Integer) obj).intValue();
                ((ParcelableSnapshotMutableIntState) obj5).setIntValue(intValue);
                boolean z6 = ((CashQrScannerViewModel) obj6).showUpdatedSharingUi;
                CashQrScannerViewEvent.MyCode myCode = CashQrScannerViewEvent.MyCode.INSTANCE;
                if (!z6 && intValue == 1) {
                    function13.invoke(myCode);
                } else if (z6 && intValue == 0) {
                    function13.invoke(myCode);
                }
                break;
            case 5:
                QrCodeProfileViewModel qrCodeProfileViewModel = (QrCodeProfileViewModel) obj6;
                Function1 function14 = (Function1) obj4;
                int intValue2 = ((Integer) obj).intValue();
                ((ParcelableSnapshotMutableIntState) obj5).setIntValue(intValue2);
                QrCodeProfileViewEvent.Scan scan = QrCodeProfileViewEvent.Scan.INSTANCE;
                if (intValue2 == 0 && !qrCodeProfileViewModel.showUpdatedSharingUi) {
                    function14.invoke(scan);
                } else if (qrCodeProfileViewModel.showUpdatedSharingUi && intValue2 == 1) {
                    function14.invoke(scan);
                }
                break;
            case 6:
                SavingsGoalLocalStatus savingsGoalLocalStatus = (SavingsGoalLocalStatus) obj6;
                SavingsFolder.GoalFolder goalFolder = (SavingsFolder.GoalFolder) obj4;
                PersistentActiveGoalStore persistentActiveGoalStore = (PersistentActiveGoalStore) obj5;
                CoroutineContext coroutineContext = persistentActiveGoalStore.dispatcher;
                CoroutineScope coroutineScope = persistentActiveGoalStore.coroutineScope;
                SavingsFolder.GoalFolder goalFolder2 = (SavingsFolder.GoalFolder) obj;
                goalFolder2.getClass();
                String str10 = goalFolder2.completionToken;
                String str11 = goalFolder2.token;
                boolean z7 = savingsGoalLocalStatus.met;
                String str12 = savingsGoalLocalStatus.completion_token;
                if (!z7 || !Intrinsics.areEqual(str12, goalFolder.completionToken)) {
                    goalFolder.getClass();
                    Float f = goalFolder.progress;
                    if (f != null) {
                        longValue = f.floatValue();
                    } else {
                        Long l = goalFolder.balance.amount;
                        l.getClass();
                        float longValue2 = l.longValue();
                        goalFolder.goalAmount.amount.getClass();
                        longValue = longValue2 / r8.longValue();
                    }
                    Continuation continuation = null;
                    if (longValue < 1.0f) {
                        if (!Intrinsics.areEqual(str12, goalFolder.completionToken)) {
                            JobKt.launch$default(coroutineScope, coroutineContext, null, new PersistentActiveGoalStore$andSaveGoalMet$1$1(persistentActiveGoalStore, str11, str10, continuation, 1), 2);
                        }
                        z = false;
                        break;
                    } else {
                        JobKt.launch$default(coroutineScope, coroutineContext, null, new PersistentActiveGoalStore$andSaveGoalMet$1$1(persistentActiveGoalStore, str11, str10, continuation, 0), 2);
                    }
                }
                z = true;
                break;
            case 7:
                Sensor sensor = (Sensor) obj6;
                final SensorManager sensorManager = (SensorManager) obj4;
                final RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1 realLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1 = (RealLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1) obj5;
                final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) obj;
                lifecycleResumePauseEffectScope.getClass();
                if (sensor != null) {
                    sensorManager.registerListener(realLifecycleAwareSensorManagerKt$rememberSensorEvents$listener$1$1, sensor, 1);
                }
                break;
            case 8:
                DbSessionManager dbSessionManager = (DbSessionManager) obj6;
                RealSessionManager.StateChangeReason stateChangeReason = (RealSessionManager.StateChangeReason) obj5;
                StateFlowImpl stateFlowImpl = dbSessionManager.dbSessionState;
                Session session = (Session) stateFlowImpl.getValue();
                Session session2 = (Session) ((Function2) obj4).invoke((TransactionWrapper) obj, session);
                SessionState sessionState = DbSessionManagerKt.toSessionState(session);
                SessionState sessionState2 = DbSessionManagerKt.toSessionState(session2);
                String str13 = session.app_token;
                com.squareup.cash.session.backend.Session session3 = DbSessionManagerKt.getSession(session);
                boolean z8 = session.onboarded;
                String str14 = session.account_token;
                String str15 = session.target_account_token;
                String str16 = session2.app_token;
                com.squareup.cash.session.backend.Session session4 = DbSessionManagerKt.getSession(session2);
                boolean z9 = session2.onboarded;
                String str17 = session2.account_token;
                String str18 = session2.target_account_token;
                if (z8 == z9 || !z9) {
                    str = str18;
                    str2 = str14;
                    str3 = str15;
                    str4 = str17;
                } else {
                    str = str18;
                    str2 = str14;
                    str3 = str15;
                    str4 = str17;
                    JobKt.launch(dbSessionManager.scope, dbSessionManager.ioContext, CoroutineStart.UNDISPATCHED, new DbSessionManager$delete$2$1(dbSessionManager, null, 1));
                }
                if (session2.equals(session)) {
                    z2 = false;
                } else {
                    SessionQueries sessionQueries = dbSessionManager.sessionQueries;
                    sessionQueries.driver.execute(989843811, "UPDATE session\nSET\n  app_token = ?,\n  account_token = ?,\n  target_account_token = ?,\n  session_token = ?,\n  session_status = ?,\n  onboarded = ?\nWHERE id = 1", new SessionQueries$$ExternalSyntheticLambda0(session2.app_token, session2.account_token, session2.target_account_token, session2.session_token, session2.session_status, session2.onboarded));
                    sessionQueries.notifyQueries(989843811, new SessionQueries$$ExternalSyntheticLambda1(0, null == true ? 1 : 0));
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, session2);
                    if (!DbSessionManagerKt.toSessionState(session2).equals(DbSessionManagerKt.toSessionState(session)) && !DimensionKt.isStableSignIn(sessionState, sessionState2)) {
                        dbSessionManager.analytics.track(new SessionChangeStateChanged(DimensionKt.toCdfSessionState(sessionState), DimensionKt.toCdfSessionState(sessionState2), DimensionKt.toCdfSessionAttributeChange(str13, str16), DimensionKt.toCdfSessionAttributeChange(session3 != null ? session3.token : null, session4 != null ? session4.token : null), (session3 == null || (sessionStatus2 = session3.status) == null) ? null : DimensionKt.toCdfSessionTokenStatus(sessionStatus2), (session4 == null || (sessionStatus = session4.status) == null) ? null : DimensionKt.toCdfSessionTokenStatus(sessionStatus), str2, str4, str3, str, stateChangeReason.toString()), null);
                    }
                    z2 = true;
                }
                break;
            case 9:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj6;
                MutableState mutableState = (MutableState) obj5;
                ApiResult.Failure failure = (ApiResult.Failure) obj;
                failure.getClass();
                ((MutableState) obj4).setValue(Boolean.FALSE);
                RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator = (RealAutofillNetworkFailureMessageGenerator) localEditorialPresenter.responseContextHandler;
                AutofillScreen autofillScreen = (AutofillScreen) localEditorialPresenter.launcher;
                Pair submitErrorMessaging = realAutofillNetworkFailureMessageGenerator.getSubmitErrorMessaging(autofillScreen, failure);
                Object obj7 = submitErrorMessaging.first;
                AutofillAnalyticsParam analyticsParam = autofillScreen.getAnalyticsParam();
                if (analyticsParam != null) {
                    ((ShoppingAutofillAnalyticsHandler) localEditorialPresenter.installedStore).trackBrowserCheckoutViewAutofillError(analyticsParam, (String) obj7);
                }
                mutableState.setValue(new AutofillViewModel.Error((String) obj7, (String) submitErrorMessaging.second));
                break;
            case 10:
                final Function1 function15 = (Function1) obj5;
                Context context = (Context) obj;
                context.getClass();
                final WebView webView = ((WebViewProvider) obj4).getWebView(((ShoppingViewModel) obj6).getWebViewUseCase(), new ContextThemeWrapper(context, R.style.Theme_Cash_ShoppingWebView));
                if (webView != null) {
                    webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    webView.setClipToOutline(true);
                    final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.squareup.cash.shopping.views.ShoppingWebContainerViewKt$$ExternalSyntheticLambda9
                        @Override // android.view.View.OnScrollChangeListener
                        public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                            int i15 = i12 - i14;
                            boolean z10 = Math.abs(i15) >= scaledTouchSlop;
                            Function1 function16 = function15;
                            ShoppingWebViewEvent.ScrollingUp scrollingUp = ShoppingWebViewEvent.ScrollingUp.INSTANCE;
                            if (i12 == 0) {
                                function16.invoke(scrollingUp);
                                return;
                            }
                            boolean canScrollVertically = webView.canScrollVertically(1);
                            ShoppingWebViewEvent.ScrollingDown scrollingDown = ShoppingWebViewEvent.ScrollingDown.INSTANCE;
                            if (!canScrollVertically) {
                                function16.invoke(scrollingDown);
                            } else if (z10) {
                                if (i15 > 0) {
                                    function16.invoke(scrollingDown);
                                } else {
                                    function16.invoke(scrollingUp);
                                }
                            }
                        }
                    });
                    break;
                } else {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("No WebView instance provided.");
                    break;
                }
            case 11:
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                ArrayList arrayList2 = ((DirectoryListItem.CardAvatarSectionViewModel) obj6).items;
                lazyListScope4.items(arrayList2.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(20, arrayList2), new ComposableLambdaImpl(new ShopHubResultsListKt$CardAvatarSectionView$lambda$0$0$$inlined$itemsIndexed$default$3(arrayList2, (Function1) obj4, (RealImageLoader) obj5, false ? 1 : 0), true, 2039820996));
                break;
            case 12:
                ScreenshotReviewViewModel screenshotReviewViewModel = (ScreenshotReviewViewModel) obj6;
                Function1 function16 = (Function1) obj4;
                Function1 function17 = (Function1) obj5;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope, "page-header", null, new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda3(i7, screenshotReviewViewModel, lazyScaffoldContentScope), true, -1644797016), 2);
                for (ScreenshotReviewViewModel.Screenshot screenshot : screenshotReviewViewModel.getScreenshotList()) {
                    LazyListScope.item$default(lazyScaffoldContentScope, screenshot.uri, null, new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda5(19, screenshot, function16, function17), true, 137390827), 2);
                }
                break;
            case 13:
                InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction linkingAction = (InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction) obj6;
                LinkedAccountsPresenter linkedAccountsPresenter = (LinkedAccountsPresenter) obj4;
                ArrayList<Instrument> arrayList3 = (ArrayList) obj5;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                String str19 = linkingAction.title;
                String str20 = linkingAction.description;
                boolean z10 = linkedAccountsPresenter.useInstrumentCardArt;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                for (Instrument instrument : arrayList3) {
                    InstrumentIcon.IconShape iconShape = (!linkedAccountsPresenter.useInstrumentCardArt || instrument.cashInstrumentType == CashInstrumentType.BANK_ACCOUNT) ? InstrumentIcon.IconShape.CIRCLE : InstrumentIcon.IconShape.CARD;
                    String str21 = instrument.displayName;
                    if (str21 == null) {
                        str21 = "";
                    }
                    String str22 = instrument.bankName;
                    String str23 = str22 != null ? str22 : "";
                    InstrumentLinkingOption.ReplaceInstrument replaceInstrument = new InstrumentLinkingOption.ReplaceInstrument(instrument.cashInstrumentType, instrument.token);
                    InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(instrument, null, iconShape, 5);
                    if (instrumentIcon$default instanceof InstrumentIcon.LocalBrand) {
                        InstrumentIcon.LocalBrand localBrand = (InstrumentIcon.LocalBrand) instrumentIcon$default;
                        localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.LocalResource(localBrand.lightResId, localBrand.darkResId);
                    } else if (instrumentIcon$default instanceof InstrumentIcon.LocalIcon) {
                        localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon(((InstrumentIcon.LocalIcon) instrumentIcon$default).icon.id);
                    } else if (instrumentIcon$default instanceof InstrumentIcon.RemoteIcon) {
                        localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon(((InstrumentIcon.RemoteIcon) instrumentIcon$default).iconUrl);
                    } else if (!(instrumentIcon$default instanceof InstrumentIcon.Savings)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        zzd zzdVar = Icons.Companion;
                        localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon("K9cqyL");
                    }
                    arrayList4.add(new InstrumentLinkingOptionsScreen.Option(str21, str23, replaceInstrument, localIcon));
                }
                break;
            case 14:
                LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata instrumentLinkingOptionsMetadata = (LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata) obj6;
                LinkedAccountsPresenter linkedAccountsPresenter2 = (LinkedAccountsPresenter) obj4;
                List list3 = (List) obj5;
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                if (instrumentLinkingOptionsMetadata == null || (str5 = instrumentLinkingOptionsMetadata.linkingOptionsTitle) == null) {
                    str5 = linkedAccountsPresenter2.stringManager.get(R.string.transfers_instrument_linking_options_header);
                }
                String str24 = str5;
                InstrumentLinkingOptionsScreen.Mode.Question question = new InstrumentLinkingOptionsScreen.Mode.Question(askedQuestion2);
                List<InstrumentLinkingOptionManager$InstrumentLinkingOption> list4 = list3;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (InstrumentLinkingOptionManager$InstrumentLinkingOption instrumentLinkingOptionManager$InstrumentLinkingOption : list4) {
                    CashInstrumentType cashInstrumentType = (CashInstrumentType) CollectionsKt.first(instrumentLinkingOptionManager$InstrumentLinkingOption.cashInstrumentType);
                    InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction linkingAction2 = instrumentLinkingOptionManager$InstrumentLinkingOption.linkingAction;
                    linkingAction2.getClass();
                    String str25 = instrumentLinkingOptionManager$InstrumentLinkingOption.title;
                    str25.getClass();
                    String str26 = instrumentLinkingOptionManager$InstrumentLinkingOption.description;
                    str26.getClass();
                    int ordinal = linkingAction2.linkType.ordinal();
                    if (ordinal == 0) {
                        link = new InstrumentLinkingOption.Link(cashInstrumentType);
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        link = new InstrumentLinkingOption.Replace(cashInstrumentType);
                    }
                    int i11 = LinkedAccountsPresenter.WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
                    if (i11 == 1) {
                        zzd zzdVar2 = Icons.Companion;
                        localIcon2 = new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon("ueUsQA");
                    } else if (i11 == 2) {
                        zzd zzdVar3 = Icons.Companion;
                        localIcon2 = new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon("GXcvqM");
                    } else if (i11 != 3) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(cashInstrumentType, "Unexpected cash instrument type: ");
                        break;
                    } else {
                        zzd zzdVar4 = Icons.Companion;
                        localIcon2 = new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon("Y5acgN");
                    }
                    arrayList5.add(new InstrumentLinkingOptionsScreen.Option(str25, str26, link, localIcon2));
                }
                break;
            case 15:
                Function1 function18 = (Function1) obj6;
                MutableState mutableState2 = (MutableState) obj4;
                KeypadAmount keypadAmount = (KeypadAmount) obj5;
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    function18.invoke(new WithdrawViewEvent.OnAmountChanged(((AmountEvent.AmountChanged) amountEvent).rawAmount));
                    mutableState2.setValue(Long.valueOf(new BigDecimal(keypadAmount.amountText).movePointRight(2).longValueExact()));
                }
                break;
            case 16:
                ((DisposableEffectScope) obj).getClass();
                break;
            case 17:
                MutableState mutableState3 = (MutableState) obj5;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj;
                heroCardDetails.getClass();
                ((MutableState) obj6).setValue(Boolean.TRUE);
                Iterator it = ((List) ((MutableState) obj4).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (Intrinsics.areEqual(((Pair) obj3).first, heroCardDetails)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                Pair pair = (Pair) obj3;
                str6 = pair != null ? (CardAppletTileViewModel.CardPillViewModel) pair.second : null;
                if (str6 != null) {
                    mutableState3.setValue(new Pair(heroCardDetails, str6));
                }
                break;
            case 18:
                final CardRegistry cardRegistry2 = (CardRegistry) obj6;
                final String str27 = (String) obj4;
                ((DisposableEffectScope) obj).getClass();
                cardRegistry2.cards.put(str27, (CardModelView) obj5);
                break;
            case 19:
                CardModelView cardModelView = (CardModelView) obj;
                cardModelView.getClass();
                ((Function1) obj6).invoke(cardModelView);
                ((MutableState) obj5).setValue(cardModelView);
                cardModelView.render((CardModelView.ViewModel) obj4);
                break;
            case 20:
                EntityType entityType = (EntityType) obj6;
                EntityType entityType2 = (EntityType) obj5;
                String str28 = (String) obj4;
                Membership membership = (Membership) obj;
                membership.getClass();
                EntityReference entityReference = membership.toReference;
                EntityReference entityReference2 = membership.fromReference;
                if ((entityType == null || entityReference2.entityType == entityType) && ((entityType2 == null || entityReference.entityType == entityType2) && (str28 == null || Intrinsics.areEqual(entityReference.id, str28)))) {
                    z3 = true;
                }
                break;
            case 21:
                AccountPickerState accountPickerState = (AccountPickerState) obj6;
                AccountPickerState.Payload payload = (AccountPickerState.Payload) obj4;
                Function1 function19 = (Function1) obj5;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) accountPickerState.institution.invoke();
                Set set = accountPickerState.selectedIds;
                LazyListScope.item$default(lazyListScope5, "icon", null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(financialConnectionsInstitution, 14), true, -2135426354), 2);
                LazyListScope.item$default(lazyListScope5, "header", null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(payload, 15), true, -174756233), 2);
                if (payload != null) {
                    List list5 = payload.accounts;
                    lazyListScope5.items(list5.size(), new OverridingUtil.AnonymousClass7(i4, new MarkdownParser$$ExternalSyntheticLambda0(i7), list5), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list5, 16), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list5, set, function19, 17), true, 802480018));
                } else {
                    LazyListScope.items$default(lazyListScope5, 3, null, AccountPickerScreenKt.lambda$1423572609, 6);
                }
                break;
            case 22:
                AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) obj6;
                String str29 = (String) obj4;
                Date date = (Date) obj5;
                FinancialConnectionsSessionManifest.Pane pane = AccountPickerViewModel.PANE;
                accountPickerViewModel.getClass();
                StateFlowImpl stateFlowImpl2 = accountPickerViewModel._stateFlow;
                do {
                    value = stateFlowImpl2.getValue();
                } while (!stateFlowImpl2.compareAndSet(value, AccountPickerState.copy$default((AccountPickerState) value, null, null, null, null, new AccountPickerState$ViewEffect$OpenUrl(str29, date.getTime()), 31)));
            case 23:
                LazyListScope lazyListScope6 = (LazyListScope) obj;
                lazyListScope6.getClass();
                LazyListScope.item$default(lazyListScope6, null, null, new ComposableLambdaImpl(new TaxesAppletTile$$ExternalSyntheticLambda10((ComposableLambdaImpl) obj6, i8), true, -483299155), 3);
                LazyListScope.item$default(lazyListScope6, null, null, new ComposableLambdaImpl(new ShopErrorKt$$ExternalSyntheticLambda0((String) obj4, i7), true, -248203053), 3);
                LazyListScope.item$default(lazyListScope6, null, null, new ComposableLambdaImpl(new ShopErrorKt$$ExternalSyntheticLambda0((String) obj5, i5), true, 1392310012), 3);
                break;
            case 24:
                ConsentViewModel consentViewModel = (ConsentViewModel) obj6;
                String str30 = (String) obj4;
                Date date2 = (Date) obj5;
                consentViewModel.getClass();
                StateFlowImpl stateFlowImpl3 = consentViewModel._stateFlow;
                do {
                    value2 = stateFlowImpl3.getValue();
                } while (!stateFlowImpl3.compareAndSet(value2, ConsentState.copy$default((ConsentState) value2, null, null, new ConsentState$ViewEffect$OpenUrl(str30, date2.getTime()), 7)));
            case 25:
                LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) obj6;
                String str31 = (String) obj4;
                Date date3 = (Date) obj5;
                FinancialConnectionsSessionManifest.Pane pane2 = LinkAccountPickerViewModel.PANE;
                linkAccountPickerViewModel.getClass();
                StateFlowImpl stateFlowImpl4 = linkAccountPickerViewModel._stateFlow;
                do {
                    value3 = stateFlowImpl4.getValue();
                } while (!stateFlowImpl4.compareAndSet(value3, LinkAccountPickerState.copy$default((LinkAccountPickerState) value3, null, null, new LinkAccountPickerState$ViewEffect$OpenUrl(str31, date3.getTime()), 3)));
            case 26:
                NoticeSheetViewModel noticeSheetViewModel = (NoticeSheetViewModel) obj6;
                String str32 = (String) obj4;
                Date date4 = (Date) obj5;
                noticeSheetViewModel.getClass();
                StateFlowImpl stateFlowImpl5 = noticeSheetViewModel._stateFlow;
                do {
                    value4 = stateFlowImpl5.getValue();
                } while (!stateFlowImpl5.compareAndSet(value4, NoticeSheetState.copy$default((NoticeSheetState) value4, null, new NoticeSheetState$ViewEffect$OpenUrl(str32, date4.getTime()), 3)));
            case 27:
                StripeApiRepository stripeApiRepository = (StripeApiRepository) obj6;
                ApiRequest.Options options = (ApiRequest.Options) obj5;
                Result result = (Result) obj;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
                PaymentMethodCreateParams paymentMethodCreateParams = ((ConfirmSetupIntentParams) obj4).paymentMethodCreateParams;
                str6 = paymentMethodCreateParams != null ? paymentMethodCreateParams.code : null;
                String errorMessage = stripeApiRepository.errorMessage(result.value, options);
                paymentAnalyticsRequestFactory.getClass();
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentConfirm, null, str6, null, errorMessage, 26));
                break;
            case 28:
                ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) obj6;
                StripeApiRepository stripeApiRepository2 = (StripeApiRepository) obj4;
                ApiRequest.Options options2 = (ApiRequest.Options) obj5;
                Result result2 = (Result) obj;
                PaymentMethodCreateParams paymentMethodCreateParams2 = confirmPaymentIntentParams.paymentMethodCreateParams;
                if (paymentMethodCreateParams2 == null || (str8 = paymentMethodCreateParams2.code) == null) {
                    SourceParams sourceParams = confirmPaymentIntentParams.sourceParams;
                    str7 = sourceParams != null ? Intrinsics.areEqual(sourceParams.typeRaw, "card") ? "card" : "unknown" : null;
                } else {
                    str7 = str8;
                }
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = stripeApiRepository2.paymentAnalyticsRequestFactory;
                String errorMessage2 = stripeApiRepository2.errorMessage(result2.value, options2);
                paymentAnalyticsRequestFactory2.getClass();
                stripeApiRepository2.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory2, PaymentAnalyticsEvent.PaymentIntentConfirm, null, str7, null, errorMessage2, 26));
                break;
            default:
                NavHostController navHostController = (NavHostController) obj5;
                String str33 = (String) obj4;
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                NavigationIntent.NavigateTo navigateTo = (NavigationIntent.NavigateTo) ((NavigationIntent) obj6);
                navigateTo.getClass();
                navOptionsBuilder.launchSingleTop = true;
                PopUpToBehavior popUpToBehavior = navigateTo.popUpTo;
                if (popUpToBehavior != null) {
                    if (!(popUpToBehavior instanceof PopUpToBehavior.Current)) {
                        if (popUpToBehavior instanceof PopUpToBehavior.Route) {
                            String str34 = ((PopUpToBehavior.Route) popUpToBehavior).route;
                            str34.getClass();
                            navOptionsBuilder.setPopUpToRoute(str34);
                            navOptionsBuilder.setPopUpToId$navigation_common_release(-1);
                            navOptionsBuilder.inclusive = true;
                            navOptionsBuilder.saveState = false;
                        } else if (!popUpToBehavior.equals(PopUpToBehavior.Start.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            navOptionsBuilder.setPopUpToId$navigation_common_release(((NavDestination) navHostController.impl.getGraph$navigation_runtime_release()).impl.id);
                            navOptionsBuilder.inclusive = popUpToBehavior.getInclusive();
                            navOptionsBuilder.saveState = false;
                        }
                    } else if (str33 != null) {
                        navOptionsBuilder.setPopUpToRoute(str33);
                        navOptionsBuilder.setPopUpToId$navigation_common_release(-1);
                        navOptionsBuilder.inclusive = true;
                        navOptionsBuilder.saveState = false;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda4(Object obj, Object obj2, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = str;
    }
}
