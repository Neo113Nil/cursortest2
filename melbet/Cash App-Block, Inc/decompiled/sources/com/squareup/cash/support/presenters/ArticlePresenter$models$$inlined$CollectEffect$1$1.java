package com.squareup.cash.support.presenters;

import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavArgumentKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.Location;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewEvent;
import app.cash.local.viewmodels.LocalOrderStatusViewEvent;
import app.cash.local.viewmodels.MapDecisionEvent;
import app.cash.local.viewmodels.OrderBuilderEvent;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.PhoneRowEvent$PhoneClicked;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletFeatureError;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletProtoParsingError;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$models$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenterKt;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter$models$2$3;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.cdf.asset.AssetPoolAddMemberDismiss;
import com.squareup.cash.cdf.asset.AssetPoolSharePoolExternally;
import com.squareup.cash.cdf.cash.CashDepositCanceled;
import com.squareup.cash.cdf.cash.CashDepositSelectInstrument;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenLink;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenTransactionDetail;
import com.squareup.cash.cdf.document.DocumentUploadOpenSystemPicker;
import com.squareup.cash.cdf.document.DocumentUploadRemove;
import com.squareup.cash.cdf.document.Trigger;
import com.squareup.cash.cdf.stock.StockSelectSelectAutoInvestment;
import com.squareup.cash.cdf.stock.StockToggleStockToggleToggleGraphTimeRange;
import com.squareup.cash.cdf.stock.StockTradeStart;
import com.squareup.cash.cdf.stock.StockViewViewMyInvestmentDetails;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.common.web.UriSchemeKt;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.filepicker.FilePickerError;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.Loaded;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleResult;
import com.squareup.cash.pools.viewmodels.InviteMemberSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedStringList;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import com.squareup.moshi.JsonAdapter;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchResponse;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.LocalPhone;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.ClearInputTapAction;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterSheet;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterToggle;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$AvatarRow;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$FilterRow;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$AvartarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RowSection;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$ClearInputAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.util.android.Intents;
import com.squareup.util.android.PhoneNumbers;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.IndexedValue;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okio.Okio;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ArticlePresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$LaunchedEffect;
    public final /* synthetic */ MutableState $articleResult$delegate$inlined;
    public final /* synthetic */ Object $hasUnreadMessages$delegate$inlined;
    public final /* synthetic */ Object $isWebViewProvided$delegate$inlined;
    public final /* synthetic */ MutableState $loadedArticle$delegate$inlined;
    public final /* synthetic */ MutableState $phoneStatus$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object $requestCount$delegate$inlined;
    public final /* synthetic */ MutableState $transaction$delegate$inlined;
    public final /* synthetic */ Object this$0;

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalOrderStatusPresenter localOrderStatusPresenter, Location.LocationSummary locationSummary, LocalAddress localAddress, String str, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3, MutableState mutableState4) {
        this.$$this$LaunchedEffect = localOrderStatusPresenter;
        this.this$0 = locationSummary;
        this.$isWebViewProvided$delegate$inlined = localAddress;
        this.$requestCount$delegate$inlined = str;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$hasUnreadMessages$delegate$inlined = state;
        this.$transaction$delegate$inlined = mutableState3;
        this.$phoneStatus$delegate$inlined = mutableState4;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[LOOP:1: B:88:0x019b->B:146:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02bc A[LOOP:3: B:168:0x027e->B:181:0x02bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c4 A[EDGE_INSN: B:182:0x02c4->B:183:0x02c4 BREAK  A[LOOP:3: B:168:0x027e->B:181:0x02bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0330 A[EDGE_INSN: B:211:0x0330->B:212:0x0330 BREAK  A[LOOP:4: B:198:0x02f4->B:304:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[LOOP:4: B:198:0x02f4->B:304:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x032f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0639 A[EDGE_INSN: B:419:0x0639->B:420:0x0639 BREAK  A[LOOP:9: B:406:0x05fd->B:479:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06a7 A[EDGE_INSN: B:450:0x06a7->B:451:0x06a7 BREAK  A[LOOP:10: B:437:0x066b->B:470:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:470:? A[LOOP:10: B:437:0x066b->B:470:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x06a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:479:? A[LOOP:9: B:406:0x05fd->B:479:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0638 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x070e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:? A[LOOP:11: B:495:0x06ed->B:513:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be A[EDGE_INSN: B:99:0x01be->B:100:0x01be BREAK  A[LOOP:1: B:88:0x019b->B:146:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$afterpayapplet$presenters$AfterpaySearchPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        List list;
        Object obj2;
        AnalyticsEvent analyticsEvent;
        AvatarCarouselSection avatarCarouselSection;
        RowSection rowSection;
        AnalyticsEvent analyticsEvent2;
        AnalyticsEvent analyticsEvent3;
        List list2;
        Iterator it;
        ArrayIterator arrayIterator;
        Object obj3;
        IndexedValue indexedValue;
        RowSection.Row row;
        zzlc zzlcVar;
        RowSection.FilterRow filterRow;
        String str;
        List list3;
        Iterator it2;
        ArrayIterator arrayIterator2;
        Object obj4;
        IndexedValue indexedValue2;
        RowSection.Row row2;
        zzlc zzlcVar2;
        RowSection.AvatarRow avatarRow;
        String str2;
        zzld zzldVar;
        FilterGroupSection.FilterGroupItem access$findFilterGroupWithId;
        ErrorEvent.Os.Companion companion;
        Button button;
        TapAction tapAction;
        List list4;
        FilterGroupSection.FilterGroupItem access$findFilterGroupWithId2;
        ErrorEvent.Os.Companion companion2;
        Button button2;
        TapAction tapAction2;
        List list5;
        RowSection rowSection2;
        Ref$ObjectRef ref$ObjectRef;
        RowSection.AvatarRow avatarRow2;
        RowSection.FilterRow filterRow2;
        List list6;
        RowSection.FilterRow.FilterTapAction filterTapAction;
        RowSection.FilterRow.FilterTapAction filterTapAction2;
        String str3;
        Pair pair;
        FilterGroupSection filterGroupSection;
        List<FilterGroupSection.FilterGroupItem> list7;
        UrlTapAction urlTapAction;
        ClearInputTapAction clearInputTapAction;
        String str4;
        TapAction tapAction3;
        List list8;
        Iterator it3;
        ArrayIterator arrayIterator3;
        Object obj5;
        IndexedValue indexedValue3;
        RowSection.Row row3;
        zzlc zzlcVar3;
        RowSection$Row$Type$FilterRow rowSection$Row$Type$FilterRow;
        String str5;
        List list9;
        Object obj6;
        RowSection.Row row4;
        zzlc zzlcVar4;
        String str6;
        zzld zzldVar2;
        Object obj7;
        AvatarCarouselSection.AvatarItem avatarItem;
        zzle zzleVar;
        String str7;
        zzld zzldVar3;
        List list10;
        Object obj8;
        AvatarCarouselSection avatarCarouselSection2;
        FilterGroupSection.FilterGroupItem access$findFilterGroupWithId3;
        ErrorEvent.Os.Companion companion3;
        TapAction tapAction4;
        List list11;
        String str8;
        ErrorEvent.Os.Companion companion4;
        FilterGroupSection.FilterGroupItem access$findFilterGroupWithId4;
        ErrorEvent.Os.Companion companion5;
        AnalyticsEvent analyticsEvent4;
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.$requestCount$delegate$inlined;
        MutableState mutableState = (MutableState) this.$isWebViewProvided$delegate$inlined;
        Object obj9 = this.$hasUnreadMessages$delegate$inlined;
        SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj9;
        LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
        RealAfterpayMerchantRepo realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) localHomePresenter.syncer;
        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) localHomePresenter.clearMarketingBadgesIfNeeded;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        AfterpaySearchViewEvent afterpaySearchViewEvent = (AfterpaySearchViewEvent) obj;
        if (Intrinsics.areEqual(afterpaySearchViewEvent, AfterpaySearchViewEvent.Close.INSTANCE)) {
            realAfterpayAppletAnalytics.searchFlowToken = null;
            ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(Back.INSTANCE);
        } else {
            boolean z = afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.FilterClicked;
            MutableState mutableState2 = this.$loadedArticle$delegate$inlined;
            if (z) {
                AfterpaySearchViewEvent.FilterClicked filterClicked = (AfterpaySearchViewEvent.FilterClicked) afterpaySearchViewEvent;
                String str9 = filterClicked.filterGroupId;
                int ordinal = filterClicked.f1045type.ordinal();
                if (ordinal == 0) {
                    AfterpayAppletSearchResponse afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) mutableState2.getValue();
                    FilterGroupSection.FilterGroupItem access$findFilterGroupWithId5 = afterpayAppletSearchResponse != null ? AfterpaySearchPresenterKt.access$findFilterGroupWithId(afterpayAppletSearchResponse, str9) : null;
                    if (((String) snapshotStateMap.get(str9)) == null) {
                        if (access$findFilterGroupWithId5 != null && (companion4 = access$findFilterGroupWithId5.style) != null) {
                            FilterGroupSection$FilterGroupItem$Style$FilterToggle filterGroupSection$FilterGroupItem$Style$FilterToggle = companion4 instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle ? (FilterGroupSection$FilterGroupItem$Style$FilterToggle) companion4 : null;
                            FilterGroupSection.FilterGroupItem.Toggle toggle = filterGroupSection$FilterGroupItem$Style$FilterToggle != null ? filterGroupSection$FilterGroupItem$Style$FilterToggle.value : null;
                            if (toggle != null) {
                                str8 = toggle.filter_token;
                                snapshotStateMap.put(str9, str8);
                            }
                        }
                        str8 = null;
                        snapshotStateMap.put(str9, str8);
                    } else {
                        snapshotStateMap.put(str9, null);
                    }
                    realAfterpayAppletAnalytics.filterTokens = CollectionsKt.filterNotNull(snapshotStateMap.values);
                    AfterpayAppletSearchResponse afterpayAppletSearchResponse2 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                    if (afterpayAppletSearchResponse2 != null && (access$findFilterGroupWithId3 = AfterpaySearchPresenterKt.access$findFilterGroupWithId(afterpayAppletSearchResponse2, str9)) != null && (companion3 = access$findFilterGroupWithId3.style) != null) {
                        FilterGroupSection$FilterGroupItem$Style$FilterToggle filterGroupSection$FilterGroupItem$Style$FilterToggle2 = companion3 instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle ? (FilterGroupSection$FilterGroupItem$Style$FilterToggle) companion3 : null;
                        FilterGroupSection.FilterGroupItem.Toggle toggle2 = filterGroupSection$FilterGroupItem$Style$FilterToggle2 != null ? filterGroupSection$FilterGroupItem$Style$FilterToggle2.value : null;
                        if (toggle2 != null && (tapAction4 = toggle2.tap_action) != null && (list11 = tapAction4.analytics_tap_events) != null) {
                            Iterator it4 = list11.iterator();
                            while (it4.hasNext()) {
                                realAfterpayAppletAnalytics.trackEvent((AnalyticsEvent) it4.next(), localHomePresenter.clientParams());
                            }
                        }
                    }
                    JobKt.launch$default(coroutineScope, null, null, new AfterpaySearchPresenter$models$1((SnapshotStateMap) obj9, localHomePresenter, ref$ObjectRef2, this.$articleResult$delegate$inlined, this.$transaction$delegate$inlined, this.$phoneStatus$delegate$inlined, this.$loadedArticle$delegate$inlined, null, 3), 3);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AfterpayAppletSearchResponse afterpayAppletSearchResponse3 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                    if (afterpayAppletSearchResponse3 != null && (access$findFilterGroupWithId4 = AfterpaySearchPresenterKt.access$findFilterGroupWithId(afterpayAppletSearchResponse3, str9)) != null && (companion5 = access$findFilterGroupWithId4.style) != null) {
                        FilterGroupSection$FilterGroupItem$Style$FilterSheet filterGroupSection$FilterGroupItem$Style$FilterSheet = companion5 instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet ? (FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion5 : null;
                        FilterGroupSection.FilterGroupItem.Sheet sheet = filterGroupSection$FilterGroupItem$Style$FilterSheet != null ? filterGroupSection$FilterGroupItem$Style$FilterSheet.value : null;
                        if (sheet != null && (analyticsEvent4 = sheet.analytics_view_event) != null) {
                            realAfterpayAppletAnalytics.trackEvent(analyticsEvent4, localHomePresenter.clientParams());
                        }
                    }
                    mutableState.setValue(str9);
                }
            } else if (Intrinsics.areEqual(afterpaySearchViewEvent, AfterpaySearchViewEvent.TryAgainButtonClicked.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new AfterpaySearchPresenter$models$1((SnapshotStateMap) obj9, localHomePresenter, ref$ObjectRef2, this.$articleResult$delegate$inlined, this.$transaction$delegate$inlined, this.$phoneStatus$delegate$inlined, this.$loadedArticle$delegate$inlined, null, 4), 3);
            } else {
                boolean areEqual = Intrinsics.areEqual(afterpaySearchViewEvent, AfterpaySearchViewEvent.NoResultsCtaButtonClicked.INSTANCE);
                MutableState mutableState3 = this.$transaction$delegate$inlined;
                if (areEqual) {
                    mutableState3.setValue(new InputFieldText.Simple(""));
                    snapshotStateMap.clear();
                    realAfterpayAppletAnalytics.filterTokens = CollectionsKt.filterNotNull(snapshotStateMap.values);
                    String obj10 = ((InputFieldText) mutableState3.getValue()).getValue().toString();
                    obj10.getClass();
                    realAfterpayAppletAnalytics.query = obj10;
                    realAfterpayAppletAnalytics.searchFlowToken = Boxes$$ExternalSyntheticOutline1.m();
                    mutableState2.setValue((AfterpayAppletSearchResponse) ref$ObjectRef2.element);
                } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.RecentlyViewedItemClicked) {
                    AfterpayAppletSearchResponse afterpayAppletSearchResponse4 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                    if (afterpayAppletSearchResponse4 != null) {
                        String str10 = ((AfterpaySearchViewEvent.RecentlyViewedItemClicked) afterpaySearchViewEvent).id;
                        int i = AfterpaySearchPresenterKt.$r8$clinit;
                        Iterator it5 = afterpayAppletSearchResponse4.sections.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj7 = null;
                                break;
                            }
                            obj7 = it5.next();
                            zzld zzldVar4 = ((SearchSection) obj7).content;
                            if (zzldVar4 != null) {
                                SearchSection$Content$AvartarCarouselSection searchSection$Content$AvartarCarouselSection = zzldVar4 instanceof SearchSection$Content$AvartarCarouselSection ? (SearchSection$Content$AvartarCarouselSection) zzldVar4 : null;
                                if (searchSection$Content$AvartarCarouselSection != null) {
                                    avatarCarouselSection2 = searchSection$Content$AvartarCarouselSection.value;
                                    if (avatarCarouselSection2 == null) {
                                        break;
                                    }
                                }
                            }
                            avatarCarouselSection2 = null;
                            if (avatarCarouselSection2 == null) {
                            }
                        }
                        SearchSection searchSection = (SearchSection) obj7;
                        if (searchSection != null && (zzldVar3 = searchSection.content) != null) {
                            SearchSection$Content$AvartarCarouselSection searchSection$Content$AvartarCarouselSection2 = zzldVar3 instanceof SearchSection$Content$AvartarCarouselSection ? (SearchSection$Content$AvartarCarouselSection) zzldVar3 : null;
                            AvatarCarouselSection avatarCarouselSection3 = searchSection$Content$AvartarCarouselSection2 != null ? searchSection$Content$AvartarCarouselSection2.value : null;
                            if (avatarCarouselSection3 != null && (list10 = avatarCarouselSection3.avatar_items) != null) {
                                Iterator it6 = CollectionsKt.withIndex(list10).iterator();
                                while (true) {
                                    ArrayIterator arrayIterator4 = (ArrayIterator) it6;
                                    if (!((Iterator) arrayIterator4.f1520array).hasNext()) {
                                        obj8 = null;
                                        break;
                                    }
                                    obj8 = arrayIterator4.next();
                                    IndexedValue indexedValue4 = (IndexedValue) obj8;
                                    if (AfterpaySearchPresenterKt.id((AvatarCarouselSection.AvatarItem) indexedValue4.value, indexedValue4.index).equals(str10)) {
                                        break;
                                    }
                                }
                                IndexedValue indexedValue5 = (IndexedValue) obj8;
                                if (indexedValue5 != null) {
                                    avatarItem = (AvatarCarouselSection.AvatarItem) indexedValue5.value;
                                    if (avatarItem != null) {
                                        EngagedItemToken engagedItemToken = avatarItem.engaged_token;
                                        if (engagedItemToken != null) {
                                            realAfterpayMerchantRepo.addToRecentlyViewed(engagedItemToken);
                                        }
                                        TapAction tapAction5 = avatarItem.tap_action;
                                        if (tapAction5 != null && (zzleVar = tapAction5.action) != null) {
                                            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                                            UrlTapAction urlTapAction2 = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
                                            if (urlTapAction2 != null && (str7 = urlTapAction2.action_url) != null) {
                                                realAfterpayAppletAnalytics.searchFlowToken = null;
                                                localHomePresenter.routeAction$1(str7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        avatarItem = null;
                        if (avatarItem != null) {
                        }
                    }
                } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.SearchResultRowClicked) {
                    AfterpayAppletSearchResponse afterpayAppletSearchResponse5 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                    AfterpaySearchViewEvent.SearchResultRowClicked searchResultRowClicked = (AfterpaySearchViewEvent.SearchResultRowClicked) afterpaySearchViewEvent;
                    String str11 = searchResultRowClicked.rowId;
                    SearchSection findSectionById = AfterpaySearchPresenterKt.findSectionById(afterpayAppletSearchResponse5, searchResultRowClicked.sectionId);
                    if (findSectionById != null && (zzldVar2 = findSectionById.content) != null) {
                        SearchSection$Content$RowSection searchSection$Content$RowSection = zzldVar2 instanceof SearchSection$Content$RowSection ? (SearchSection$Content$RowSection) zzldVar2 : null;
                        if (searchSection$Content$RowSection != null) {
                            rowSection2 = searchSection$Content$RowSection.value;
                            AfterpayAppletSearchResponse afterpayAppletSearchResponse6 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                            if (rowSection2 != null || (list9 = rowSection2.rows) == null) {
                                ref$ObjectRef = ref$ObjectRef2;
                            } else {
                                Iterator it7 = CollectionsKt.withIndex(list9).iterator();
                                while (true) {
                                    ArrayIterator arrayIterator5 = (ArrayIterator) it7;
                                    if (!((Iterator) arrayIterator5.f1520array).hasNext()) {
                                        ref$ObjectRef = ref$ObjectRef2;
                                        obj6 = null;
                                        break;
                                    }
                                    obj6 = arrayIterator5.next();
                                    IndexedValue indexedValue6 = (IndexedValue) obj6;
                                    int i2 = indexedValue6.index;
                                    zzlc zzlcVar5 = ((RowSection.Row) indexedValue6.value).f1337type;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    if (zzlcVar5 != null) {
                                        RowSection$Row$Type$AvatarRow rowSection$Row$Type$AvatarRow = zzlcVar5 instanceof RowSection$Row$Type$AvatarRow ? (RowSection$Row$Type$AvatarRow) zzlcVar5 : null;
                                        RowSection.AvatarRow avatarRow3 = rowSection$Row$Type$AvatarRow != null ? rowSection$Row$Type$AvatarRow.value : null;
                                        if (avatarRow3 != null) {
                                            str6 = AfterpaySearchPresenterKt.id(avatarRow3, i2);
                                            if (!Intrinsics.areEqual(str6, str11)) {
                                                break;
                                            }
                                            ref$ObjectRef2 = ref$ObjectRef;
                                        }
                                    }
                                    str6 = null;
                                    if (!Intrinsics.areEqual(str6, str11)) {
                                    }
                                }
                                IndexedValue indexedValue7 = (IndexedValue) obj6;
                                if (indexedValue7 != null && (row4 = (RowSection.Row) indexedValue7.value) != null && (zzlcVar4 = row4.f1337type) != null) {
                                    RowSection$Row$Type$AvatarRow rowSection$Row$Type$AvatarRow2 = zzlcVar4 instanceof RowSection$Row$Type$AvatarRow ? (RowSection$Row$Type$AvatarRow) zzlcVar4 : null;
                                    if (rowSection$Row$Type$AvatarRow2 != null) {
                                        avatarRow2 = rowSection$Row$Type$AvatarRow2.value;
                                        if (rowSection2 != null && (list8 = rowSection2.rows) != null) {
                                            it3 = CollectionsKt.withIndex(list8).iterator();
                                            while (true) {
                                                arrayIterator3 = (ArrayIterator) it3;
                                                if (((Iterator) arrayIterator3.f1520array).hasNext()) {
                                                    obj5 = null;
                                                    break;
                                                }
                                                obj5 = arrayIterator3.next();
                                                IndexedValue indexedValue8 = (IndexedValue) obj5;
                                                int i3 = indexedValue8.index;
                                                zzlc zzlcVar6 = ((RowSection.Row) indexedValue8.value).f1337type;
                                                if (zzlcVar6 != null) {
                                                    RowSection$Row$Type$FilterRow rowSection$Row$Type$FilterRow2 = zzlcVar6 instanceof RowSection$Row$Type$FilterRow ? (RowSection$Row$Type$FilterRow) zzlcVar6 : null;
                                                    RowSection.FilterRow filterRow3 = rowSection$Row$Type$FilterRow2 != null ? rowSection$Row$Type$FilterRow2.value : null;
                                                    if (filterRow3 != null) {
                                                        str5 = AfterpaySearchPresenterKt.id(filterRow3, i3);
                                                        if (!Intrinsics.areEqual(str5, str11)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                str5 = null;
                                                if (!Intrinsics.areEqual(str5, str11)) {
                                                }
                                            }
                                            indexedValue3 = (IndexedValue) obj5;
                                            if (indexedValue3 != null && (row3 = (RowSection.Row) indexedValue3.value) != null && (zzlcVar3 = row3.f1337type) != null) {
                                                rowSection$Row$Type$FilterRow = !(zzlcVar3 instanceof RowSection$Row$Type$FilterRow) ? (RowSection$Row$Type$FilterRow) zzlcVar3 : null;
                                                if (rowSection$Row$Type$FilterRow != null) {
                                                    filterRow2 = rowSection$Row$Type$FilterRow.value;
                                                    if (avatarRow2 != null || (tapAction3 = avatarRow2.tap_action) == null || (list6 = tapAction3.analytics_tap_events) == null) {
                                                        list6 = (filterRow2 != null || (filterTapAction = filterRow2.tap_action) == null) ? null : filterTapAction.analytics_tap_events;
                                                    }
                                                    if (list6 != null) {
                                                        Iterator it8 = list6.iterator();
                                                        while (it8.hasNext()) {
                                                            realAfterpayAppletAnalytics.trackEvent((AnalyticsEvent) it8.next(), localHomePresenter.clientParams());
                                                        }
                                                    }
                                                    MutableState mutableState4 = this.$articleResult$delegate$inlined;
                                                    MutableState mutableState5 = this.$phoneStatus$delegate$inlined;
                                                    MutableState mutableState6 = this.$loadedArticle$delegate$inlined;
                                                    if (avatarRow2 == null) {
                                                        TapAction tapAction6 = avatarRow2.tap_action;
                                                        if (tapAction6 != null) {
                                                            EngagedItemToken engagedItemToken2 = avatarRow2.engaged_token;
                                                            if (engagedItemToken2 != null) {
                                                                realAfterpayMerchantRepo.addToRecentlyViewed(engagedItemToken2);
                                                            }
                                                            zzle zzleVar2 = tapAction6.action;
                                                            if (zzleVar2 != null) {
                                                                TapAction$Action$UrlAction tapAction$Action$UrlAction2 = zzleVar2 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar2 : null;
                                                                if (tapAction$Action$UrlAction2 != null) {
                                                                    urlTapAction = tapAction$Action$UrlAction2.value;
                                                                    if (urlTapAction != null) {
                                                                        if (zzleVar2 != null) {
                                                                            TapAction$Action$ClearInputAction tapAction$Action$ClearInputAction = zzleVar2 instanceof TapAction$Action$ClearInputAction ? (TapAction$Action$ClearInputAction) zzleVar2 : null;
                                                                            if (tapAction$Action$ClearInputAction != null) {
                                                                                clearInputTapAction = tapAction$Action$ClearInputAction.value;
                                                                                if (clearInputTapAction == null) {
                                                                                    mutableState3.setValue(new InputFieldText.Simple(""));
                                                                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                                                                    emptyMap.getClass();
                                                                                    snapshotStateMap.clear();
                                                                                    snapshotStateMap.putAll(emptyMap);
                                                                                    EmptyList emptyList = EmptyList.INSTANCE;
                                                                                    emptyList.getClass();
                                                                                    realAfterpayAppletAnalytics.filterTokens = emptyList;
                                                                                    realAfterpayAppletAnalytics.query = "";
                                                                                    realAfterpayAppletAnalytics.searchFlowToken = Boxes$$ExternalSyntheticOutline1.m();
                                                                                    JobKt.launch$default(coroutineScope, null, null, new AfterpaySearchPresenter$models$1(snapshotStateMap, localHomePresenter, ref$ObjectRef, mutableState4, mutableState3, mutableState5, mutableState6, null, 5), 3);
                                                                                } else {
                                                                                    ((ErrorReporter) localHomePresenter.localHomeGeoPresenterFactory).report(new AfterpayAppletProtoParsingError("avatar_row.tap_action", null, Recorder$$ExternalSyntheticOutline2.m("Unhandled tap action type for avatar row: ", Reflection.factory.getOrCreateKotlinClass(TapAction.class).getSimpleName()), AfterpayAppletFeatureError.features, "AfterpayApplet"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                                                                }
                                                                            }
                                                                        }
                                                                        clearInputTapAction = null;
                                                                        if (clearInputTapAction == null) {
                                                                        }
                                                                    } else if (zzleVar2 != null) {
                                                                        TapAction$Action$UrlAction tapAction$Action$UrlAction3 = zzleVar2 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar2 : null;
                                                                        UrlTapAction urlTapAction3 = tapAction$Action$UrlAction3 != null ? tapAction$Action$UrlAction3.value : null;
                                                                        if (urlTapAction3 != null && (str4 = urlTapAction3.action_url) != null) {
                                                                            realAfterpayAppletAnalytics.searchFlowToken = null;
                                                                            localHomePresenter.routeAction$1(str4);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            urlTapAction = null;
                                                            if (urlTapAction != null) {
                                                            }
                                                        }
                                                    } else {
                                                        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                                                        if (filterRow2 != null && (filterTapAction2 = filterRow2.tap_action) != null && (str3 = filterTapAction2.filter_token) != null) {
                                                            int i4 = AfterpaySearchPresenterKt.$r8$clinit;
                                                            if (afterpayAppletSearchResponse6 != null && (filterGroupSection = afterpayAppletSearchResponse6.filter_group_sections) != null && (list7 = filterGroupSection.filter_group_items) != null) {
                                                                for (FilterGroupSection.FilterGroupItem filterGroupItem : list7) {
                                                                    FilterGroupSection.FilterGroupItem.FilterItem findItemWithToken = AfterpaySearchPresenterKt.findItemWithToken(filterGroupItem, str3);
                                                                    if (findItemWithToken != null) {
                                                                        pair = new Pair(filterGroupItem, findItemWithToken);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            pair = null;
                                                            if (pair != null) {
                                                                snapshotStateMap.put(AfterpaySearchPresenterKt.id((FilterGroupSection.FilterGroupItem) pair.first), ((FilterGroupSection.FilterGroupItem.FilterItem) pair.second).filter_token);
                                                                mutableState3.setValue(new InputFieldText.Simple(""));
                                                                JobKt.launch$default(coroutineScope, null, null, new AfterpaySearchPresenter$models$1(snapshotStateMap, localHomePresenter, ref$ObjectRef3, mutableState4, mutableState3, mutableState5, mutableState6, null, 5), 3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        filterRow2 = null;
                                        if (avatarRow2 != null) {
                                        }
                                        if (filterRow2 != null) {
                                        }
                                        if (list6 != null) {
                                        }
                                        MutableState mutableState42 = this.$articleResult$delegate$inlined;
                                        MutableState mutableState52 = this.$phoneStatus$delegate$inlined;
                                        MutableState mutableState62 = this.$loadedArticle$delegate$inlined;
                                        if (avatarRow2 == null) {
                                        }
                                    }
                                }
                            }
                            avatarRow2 = null;
                            if (rowSection2 != null) {
                                it3 = CollectionsKt.withIndex(list8).iterator();
                                while (true) {
                                    arrayIterator3 = (ArrayIterator) it3;
                                    if (((Iterator) arrayIterator3.f1520array).hasNext()) {
                                    }
                                }
                                indexedValue3 = (IndexedValue) obj5;
                                if (indexedValue3 != null) {
                                    if (!(zzlcVar3 instanceof RowSection$Row$Type$FilterRow)) {
                                    }
                                    if (rowSection$Row$Type$FilterRow != null) {
                                    }
                                }
                            }
                            filterRow2 = null;
                            if (avatarRow2 != null) {
                            }
                            if (filterRow2 != null) {
                            }
                            if (list6 != null) {
                            }
                            MutableState mutableState422 = this.$articleResult$delegate$inlined;
                            MutableState mutableState522 = this.$phoneStatus$delegate$inlined;
                            MutableState mutableState622 = this.$loadedArticle$delegate$inlined;
                            if (avatarRow2 == null) {
                            }
                        }
                    }
                    rowSection2 = null;
                    AfterpayAppletSearchResponse afterpayAppletSearchResponse62 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                    if (rowSection2 != null) {
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                    avatarRow2 = null;
                    if (rowSection2 != null) {
                    }
                    filterRow2 = null;
                    if (avatarRow2 != null) {
                    }
                    if (filterRow2 != null) {
                    }
                    if (list6 != null) {
                    }
                    MutableState mutableState4222 = this.$articleResult$delegate$inlined;
                    MutableState mutableState5222 = this.$phoneStatus$delegate$inlined;
                    MutableState mutableState6222 = this.$loadedArticle$delegate$inlined;
                    if (avatarRow2 == null) {
                    }
                } else if (!(afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.QueryUpdated)) {
                    if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.FilterBottomSheetViewEvent) {
                        AfterpaySearchViewEvent.FilterBottomSheetViewEvent filterBottomSheetViewEvent = (AfterpaySearchViewEvent.FilterBottomSheetViewEvent) afterpaySearchViewEvent;
                        if (filterBottomSheetViewEvent instanceof AfterpaySearchViewEvent.FilterBottomSheetViewEvent.ClearFilterSelection) {
                            String str12 = ((AfterpaySearchViewEvent.FilterBottomSheetViewEvent.ClearFilterSelection) afterpaySearchViewEvent).filterGroupId;
                            snapshotStateMap.put(str12, null);
                            realAfterpayAppletAnalytics.filterTokens = CollectionsKt.filterNotNull(snapshotStateMap.values);
                            AfterpayAppletSearchResponse afterpayAppletSearchResponse7 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                            if (afterpayAppletSearchResponse7 != null && (access$findFilterGroupWithId2 = AfterpaySearchPresenterKt.access$findFilterGroupWithId(afterpayAppletSearchResponse7, str12)) != null && (companion2 = access$findFilterGroupWithId2.style) != null) {
                                FilterGroupSection$FilterGroupItem$Style$FilterSheet filterGroupSection$FilterGroupItem$Style$FilterSheet2 = companion2 instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet ? (FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion2 : null;
                                FilterGroupSection.FilterGroupItem.Sheet sheet2 = filterGroupSection$FilterGroupItem$Style$FilterSheet2 != null ? filterGroupSection$FilterGroupItem$Style$FilterSheet2.value : null;
                                if (sheet2 != null && (button2 = sheet2.reset_button) != null && (tapAction2 = button2.tap_action) != null && (list5 = tapAction2.analytics_tap_events) != null) {
                                    Iterator it9 = list5.iterator();
                                    while (it9.hasNext()) {
                                        realAfterpayAppletAnalytics.trackEvent((AnalyticsEvent) it9.next(), localHomePresenter.clientParams());
                                    }
                                }
                            }
                            mutableState.setValue(null);
                            JobKt.launch$default(coroutineScope, null, null, new AfterpaySearchPresenter$models$1((SnapshotStateMap) obj9, localHomePresenter, ref$ObjectRef2, this.$articleResult$delegate$inlined, this.$transaction$delegate$inlined, this.$phoneStatus$delegate$inlined, this.$loadedArticle$delegate$inlined, null, 1), 3);
                        } else if (filterBottomSheetViewEvent.equals(AfterpaySearchViewEvent.FilterBottomSheetViewEvent.CloseFilterBottomSheet.INSTANCE)) {
                            mutableState.setValue(null);
                        } else {
                            if (!(filterBottomSheetViewEvent instanceof AfterpaySearchViewEvent.FilterBottomSheetViewEvent.UpdateFilterSelection)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            AfterpaySearchViewEvent.FilterBottomSheetViewEvent.UpdateFilterSelection updateFilterSelection = (AfterpaySearchViewEvent.FilterBottomSheetViewEvent.UpdateFilterSelection) afterpaySearchViewEvent;
                            String str13 = updateFilterSelection.filterGroupId;
                            snapshotStateMap.put(str13, updateFilterSelection.filterItemToken);
                            realAfterpayAppletAnalytics.filterTokens = CollectionsKt.filterNotNull(snapshotStateMap.values);
                            AfterpayAppletSearchResponse afterpayAppletSearchResponse8 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                            if (afterpayAppletSearchResponse8 != null && (access$findFilterGroupWithId = AfterpaySearchPresenterKt.access$findFilterGroupWithId(afterpayAppletSearchResponse8, str13)) != null && (companion = access$findFilterGroupWithId.style) != null) {
                                FilterGroupSection$FilterGroupItem$Style$FilterSheet filterGroupSection$FilterGroupItem$Style$FilterSheet3 = companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet ? (FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion : null;
                                FilterGroupSection.FilterGroupItem.Sheet sheet3 = filterGroupSection$FilterGroupItem$Style$FilterSheet3 != null ? filterGroupSection$FilterGroupItem$Style$FilterSheet3.value : null;
                                if (sheet3 != null && (button = sheet3.apply_button) != null && (tapAction = button.tap_action) != null && (list4 = tapAction.analytics_tap_events) != null) {
                                    Iterator it10 = list4.iterator();
                                    while (it10.hasNext()) {
                                        realAfterpayAppletAnalytics.trackEvent((AnalyticsEvent) it10.next(), localHomePresenter.clientParams());
                                    }
                                }
                            }
                            mutableState.setValue(null);
                            JobKt.launch$default(coroutineScope, null, null, new AfterpaySearchPresenter$models$1((SnapshotStateMap) obj9, localHomePresenter, ref$ObjectRef2, this.$articleResult$delegate$inlined, this.$transaction$delegate$inlined, this.$phoneStatus$delegate$inlined, this.$loadedArticle$delegate$inlined, null, 2), 3);
                        }
                    } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.SectionViewed) {
                        SearchSection findSectionById2 = AfterpaySearchPresenterKt.findSectionById((AfterpayAppletSearchResponse) mutableState2.getValue(), ((AfterpaySearchViewEvent.SectionViewed) afterpaySearchViewEvent).sectionId);
                        if (findSectionById2 != null) {
                            realAfterpayAppletAnalytics.trackEvent(findSectionById2.analytics_view_event, localHomePresenter.clientParams());
                        }
                    } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.SearchResultRowViewed) {
                        AfterpayAppletSearchResponse afterpayAppletSearchResponse9 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                        AfterpaySearchViewEvent.SearchResultRowViewed searchResultRowViewed = (AfterpaySearchViewEvent.SearchResultRowViewed) afterpaySearchViewEvent;
                        String str14 = searchResultRowViewed.sectionId;
                        String str15 = searchResultRowViewed.rowId;
                        SearchSection findSectionById3 = AfterpaySearchPresenterKt.findSectionById(afterpayAppletSearchResponse9, str14);
                        if (findSectionById3 != null && (zzldVar = findSectionById3.content) != null) {
                            SearchSection$Content$RowSection searchSection$Content$RowSection2 = zzldVar instanceof SearchSection$Content$RowSection ? (SearchSection$Content$RowSection) zzldVar : null;
                            if (searchSection$Content$RowSection2 != null) {
                                rowSection = searchSection$Content$RowSection2.value;
                                if (rowSection != null && (list3 = rowSection.rows) != null) {
                                    it2 = CollectionsKt.withIndex(list3).iterator();
                                    while (true) {
                                        arrayIterator2 = (ArrayIterator) it2;
                                        if (((Iterator) arrayIterator2.f1520array).hasNext()) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = arrayIterator2.next();
                                        IndexedValue indexedValue9 = (IndexedValue) obj4;
                                        int i5 = indexedValue9.index;
                                        zzlc zzlcVar7 = ((RowSection.Row) indexedValue9.value).f1337type;
                                        if (zzlcVar7 != null) {
                                            RowSection$Row$Type$AvatarRow rowSection$Row$Type$AvatarRow3 = zzlcVar7 instanceof RowSection$Row$Type$AvatarRow ? (RowSection$Row$Type$AvatarRow) zzlcVar7 : null;
                                            RowSection.AvatarRow avatarRow4 = rowSection$Row$Type$AvatarRow3 != null ? rowSection$Row$Type$AvatarRow3.value : null;
                                            if (avatarRow4 != null) {
                                                str2 = AfterpaySearchPresenterKt.id(avatarRow4, i5);
                                                if (!Intrinsics.areEqual(str2, str15)) {
                                                    break;
                                                }
                                            }
                                        }
                                        str2 = null;
                                        if (!Intrinsics.areEqual(str2, str15)) {
                                        }
                                    }
                                    indexedValue2 = (IndexedValue) obj4;
                                    if (indexedValue2 != null && (row2 = (RowSection.Row) indexedValue2.value) != null && (zzlcVar2 = row2.f1337type) != null) {
                                        RowSection$Row$Type$AvatarRow rowSection$Row$Type$AvatarRow4 = !(zzlcVar2 instanceof RowSection$Row$Type$AvatarRow) ? (RowSection$Row$Type$AvatarRow) zzlcVar2 : null;
                                        avatarRow = rowSection$Row$Type$AvatarRow4 == null ? rowSection$Row$Type$AvatarRow4.value : null;
                                        if (avatarRow != null) {
                                            analyticsEvent2 = avatarRow.analytics_view_event;
                                            if (rowSection != null && (list2 = rowSection.rows) != null) {
                                                it = CollectionsKt.withIndex(list2).iterator();
                                                while (true) {
                                                    arrayIterator = (ArrayIterator) it;
                                                    if (((Iterator) arrayIterator.f1520array).hasNext()) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = arrayIterator.next();
                                                    IndexedValue indexedValue10 = (IndexedValue) obj3;
                                                    int i6 = indexedValue10.index;
                                                    zzlc zzlcVar8 = ((RowSection.Row) indexedValue10.value).f1337type;
                                                    if (zzlcVar8 != null) {
                                                        RowSection$Row$Type$FilterRow rowSection$Row$Type$FilterRow3 = zzlcVar8 instanceof RowSection$Row$Type$FilterRow ? (RowSection$Row$Type$FilterRow) zzlcVar8 : null;
                                                        RowSection.FilterRow filterRow4 = rowSection$Row$Type$FilterRow3 != null ? rowSection$Row$Type$FilterRow3.value : null;
                                                        if (filterRow4 != null) {
                                                            str = AfterpaySearchPresenterKt.id(filterRow4, i6);
                                                            if (!Intrinsics.areEqual(str, str15)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    str = null;
                                                    if (!Intrinsics.areEqual(str, str15)) {
                                                    }
                                                }
                                                indexedValue = (IndexedValue) obj3;
                                                if (indexedValue != null && (row = (RowSection.Row) indexedValue.value) != null && (zzlcVar = row.f1337type) != null) {
                                                    RowSection$Row$Type$FilterRow rowSection$Row$Type$FilterRow4 = !(zzlcVar instanceof RowSection$Row$Type$FilterRow) ? (RowSection$Row$Type$FilterRow) zzlcVar : null;
                                                    filterRow = rowSection$Row$Type$FilterRow4 == null ? rowSection$Row$Type$FilterRow4.value : null;
                                                    if (filterRow != null) {
                                                        analyticsEvent3 = filterRow.analytics_view_event;
                                                        if (analyticsEvent2 == null) {
                                                            analyticsEvent2 = analyticsEvent3;
                                                        }
                                                        if (analyticsEvent2 != null) {
                                                            realAfterpayAppletAnalytics.trackEvent(analyticsEvent2, localHomePresenter.clientParams());
                                                        }
                                                    }
                                                }
                                            }
                                            analyticsEvent3 = null;
                                            if (analyticsEvent2 == null) {
                                            }
                                            if (analyticsEvent2 != null) {
                                            }
                                        }
                                    }
                                }
                                analyticsEvent2 = null;
                                if (rowSection != null) {
                                    it = CollectionsKt.withIndex(list2).iterator();
                                    while (true) {
                                        arrayIterator = (ArrayIterator) it;
                                        if (((Iterator) arrayIterator.f1520array).hasNext()) {
                                        }
                                    }
                                    indexedValue = (IndexedValue) obj3;
                                    if (indexedValue != null) {
                                        if (!(zzlcVar instanceof RowSection$Row$Type$FilterRow)) {
                                        }
                                        if (rowSection$Row$Type$FilterRow4 == null) {
                                        }
                                        if (filterRow != null) {
                                        }
                                    }
                                }
                                analyticsEvent3 = null;
                                if (analyticsEvent2 == null) {
                                }
                                if (analyticsEvent2 != null) {
                                }
                            }
                        }
                        rowSection = null;
                        if (rowSection != null) {
                            it2 = CollectionsKt.withIndex(list3).iterator();
                            while (true) {
                                arrayIterator2 = (ArrayIterator) it2;
                                if (((Iterator) arrayIterator2.f1520array).hasNext()) {
                                }
                            }
                            indexedValue2 = (IndexedValue) obj4;
                            if (indexedValue2 != null) {
                                if (!(zzlcVar2 instanceof RowSection$Row$Type$AvatarRow)) {
                                }
                                if (rowSection$Row$Type$AvatarRow4 == null) {
                                }
                                if (avatarRow != null) {
                                }
                            }
                        }
                        analyticsEvent2 = null;
                        if (rowSection != null) {
                        }
                        analyticsEvent3 = null;
                        if (analyticsEvent2 == null) {
                        }
                        if (analyticsEvent2 != null) {
                        }
                    } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.RecentlyViewedCarouselViewed) {
                        AfterpayAppletSearchResponse afterpayAppletSearchResponse10 = (AfterpayAppletSearchResponse) mutableState2.getValue();
                        if (afterpayAppletSearchResponse10 != null && (list = afterpayAppletSearchResponse10.sections) != null) {
                            Iterator it11 = list.iterator();
                            while (true) {
                                if (!it11.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next = it11.next();
                                zzld zzldVar5 = ((SearchSection) next).content;
                                if (zzldVar5 != null) {
                                    SearchSection$Content$AvartarCarouselSection searchSection$Content$AvartarCarouselSection3 = zzldVar5 instanceof SearchSection$Content$AvartarCarouselSection ? (SearchSection$Content$AvartarCarouselSection) zzldVar5 : null;
                                    if (searchSection$Content$AvartarCarouselSection3 != null) {
                                        avatarCarouselSection = searchSection$Content$AvartarCarouselSection3.value;
                                        if (avatarCarouselSection == null) {
                                            obj2 = next;
                                            break;
                                        }
                                    }
                                }
                                avatarCarouselSection = null;
                                if (avatarCarouselSection == null) {
                                }
                            }
                            SearchSection searchSection2 = (SearchSection) obj2;
                            if (searchSection2 != null && (analyticsEvent = searchSection2.analytics_view_event) != null) {
                                realAfterpayAppletAnalytics.trackEvent(analyticsEvent, localHomePresenter.clientParams());
                            }
                        }
                    } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.CategoryTileClicked) {
                        realAfterpayAppletAnalytics.searchFlowToken = null;
                        localHomePresenter.routeAction$1(((AfterpaySearchViewEvent.CategoryTileClicked) afterpaySearchViewEvent).actionUrl);
                    } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.UpsellCardTapped) {
                        AfterpaySearchViewEvent.UpsellCardTapped upsellCardTapped = (AfterpaySearchViewEvent.UpsellCardTapped) afterpaySearchViewEvent;
                        Iterator it12 = upsellCardTapped.analyticsEventSpecs.iterator();
                        while (it12.hasNext()) {
                            realAfterpayAppletAnalytics.trackEvent(new AnalyticsEvent((String) it12.next(), null, 14), localHomePresenter.clientParams());
                        }
                        String str16 = upsellCardTapped.actionUrl;
                        if (str16 != null) {
                            realAfterpayAppletAnalytics.searchFlowToken = null;
                            localHomePresenter.routeAction$1(str16);
                        }
                    } else if (afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.UpsellCardButtonTapped) {
                        AfterpaySearchViewEvent.UpsellCardButtonTapped upsellCardButtonTapped = (AfterpaySearchViewEvent.UpsellCardButtonTapped) afterpaySearchViewEvent;
                        Iterator it13 = upsellCardButtonTapped.analyticsEventSpecs.iterator();
                        while (it13.hasNext()) {
                            realAfterpayAppletAnalytics.trackEvent(new AnalyticsEvent((String) it13.next(), null, 14), localHomePresenter.clientParams());
                        }
                        String str17 = upsellCardButtonTapped.actionUrl;
                        if (str17 != null) {
                            realAfterpayAppletAnalytics.searchFlowToken = null;
                            localHomePresenter.routeAction$1(str17);
                        }
                    } else {
                        if (!(afterpaySearchViewEvent instanceof AfterpaySearchViewEvent.UpsellCardViewed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str18 = ((AfterpaySearchViewEvent.UpsellCardViewed) afterpaySearchViewEvent).analyticsEventSpec;
                        if (str18 != null) {
                            realAfterpayAppletAnalytics.trackEvent(new AnalyticsEvent(str18, null, 14), localHomePresenter.clientParams());
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        HttpUrl httpUrl;
        String str;
        ListBuilder nodeTokens;
        String str2;
        Investment_holding investment_holding;
        Screen screenForType;
        StockToggleStockToggleToggleGraphTimeRange.TimeRange timeRange;
        Screen profileFor;
        int i = this.$r8$classId;
        MutableState mutableState = this.$phoneStatus$delegate$inlined;
        Back back = Back.INSTANCE;
        MutableState mutableState2 = this.$loadedArticle$delegate$inlined;
        MutableState mutableState3 = this.$transaction$delegate$inlined;
        MutableState mutableState4 = this.$articleResult$delegate$inlined;
        Object obj2 = this.this$0;
        Object obj3 = this.$$this$LaunchedEffect;
        Object obj4 = this.$requestCount$delegate$inlined;
        Object obj5 = this.$isWebViewProvided$delegate$inlined;
        Object obj6 = this.$hasUnreadMessages$delegate$inlined;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                ArticlePresenter articlePresenter = (ArticlePresenter) obj2;
                String str3 = articlePresenter.articleToken;
                String str4 = articlePresenter.viewToken;
                SupportScreens.FlowScreens.ArticleScreen articleScreen = articlePresenter.args;
                Analytics analytics = articlePresenter.analytics;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                ArticleViewEvent articleViewEvent = (ArticleViewEvent) obj;
                if (articleViewEvent instanceof ArticleViewEvent.ActivityTransactionClicked) {
                    String str5 = articleScreen.data.flowToken;
                    Article article = (Article) mutableState2.getValue();
                    analytics.track(new CustomerSupportAccessOpenTransactionDetail(str5, (article == null || (nodeTokens = ArticlePresenter.nodeTokens(article)) == null) ? null : ((JsonAdapter) articlePresenter.jsonListAdapter$delegate.getValue()).toJson(nodeTokens), ActivityItemKt.getItemId(((ArticleViewEvent.ActivityTransactionClicked) articleViewEvent).activityItem), str4), null);
                    JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1(articlePresenter, articleViewEvent, null, 20), 3);
                } else if (!(articleViewEvent instanceof ArticleViewEvent.OpenUrl)) {
                    boolean z = articleViewEvent instanceof ArticleViewEvent.ClickLink;
                    MutableState mutableState5 = this.$articleResult$delegate$inlined;
                    if (z) {
                        JobKt.launch$default(coroutineScope, null, null, new TaxWebAppPresenter$models$1$1(articlePresenter, articleViewEvent, mutableState5, this.$transaction$delegate$inlined, (Continuation) null, 13), 3);
                    } else if (articleViewEvent instanceof ArticleViewEvent.Contact) {
                        JobKt.launch$default(coroutineScope, null, null, new PoolsListPresenter$models$2$2(articleViewEvent, articlePresenter, mutableState5, (State) obj6, this.$phoneStatus$delegate$inlined, (Continuation) null), 3);
                    } else if (Intrinsics.areEqual(articleViewEvent, ArticleViewEvent.GoBack.INSTANCE)) {
                        articlePresenter.navigator.goTo(back);
                    } else if (Intrinsics.areEqual(articleViewEvent, ArticleViewEvent.Retry.INSTANCE)) {
                        List list = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                        mutableState5.setValue(null);
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                        Okio.boxInt(intValue);
                    } else if (!Intrinsics.areEqual(articleViewEvent, ArticleViewEvent.NoWebViewProvided.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        List list2 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                        ((MutableState) obj5).setValue(Boolean.FALSE);
                    }
                } else {
                    String str6 = ((ArticleViewEvent.OpenUrl) articleViewEvent).url;
                    analytics.track(new CustomerSupportAccessOpenLink(articleScreen.data.flowToken, str3, str4, str6), null);
                    str6.getClass();
                    try {
                        HttpUrl.Builder builder = new HttpUrl.Builder();
                        builder.parse$okhttp(null, str6);
                        httpUrl = builder.build();
                    } catch (IllegalArgumentException unused) {
                        httpUrl = null;
                    }
                    if (httpUrl != null) {
                        articlePresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), str6);
                    } else {
                        Uri parse = Uri.parse(str6);
                        List list3 = UriSchemeKt.TEL_SCHEMES;
                        parse.getClass();
                        List list4 = UriSchemeKt.TEL_SCHEMES;
                        String scheme = parse.getScheme();
                        if (scheme != null) {
                            str = scheme.toLowerCase(Locale.ROOT);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        String format2 = !CollectionsKt.contains(list4, str) ? null : PhoneNumbers.format(parse.getSchemeSpecificPart(), "US", PhoneNumbers.Format.INTERNATIONAL);
                        if (format2 != null) {
                            Intents.maybeStartActivity(r0, new Intent("android.intent.action.DIAL", Uri.fromParts("tel", format2, null)), new CameraX$$ExternalSyntheticLambda0(articlePresenter.launcher.activity, 12));
                        } else {
                            Timber.Forest.e("Malformed link in support article %s. URL: %s", str3, str6);
                        }
                    }
                }
                break;
            case 1:
                JWECryptoParts jWECryptoParts = (JWECryptoParts) obj6;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                LocalOpenTabCheckoutViewEvent localOpenTabCheckoutViewEvent = (LocalOpenTabCheckoutViewEvent) obj;
                if (!(localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.BackClicked)) {
                    boolean z2 = localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.EditBuyerInfoClicked;
                    MutableState mutableState6 = this.$loadedArticle$delegate$inlined;
                    if (z2) {
                        ((Function1) mutableState6.getValue()).invoke(new OrderBuilderEvent.UpdateBuyerInfo(CashAppServiceModule.asEditable((OrderBuilderModel.BuyerInfo.UiReady) mutableState4.getValue())));
                    } else if (localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.OrderNotesUpdated) {
                        ((Function1) mutableState6.getValue()).invoke(new OrderBuilderEvent.UpdateOrderNotes(((LocalOpenTabCheckoutViewEvent.OrderNotesUpdated) localOpenTabCheckoutViewEvent).notes));
                    } else if (localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.PaymentMethodSelected) {
                        String str7 = ((LocalOpenTabCheckoutViewEvent.PaymentMethodSelected) localOpenTabCheckoutViewEvent).token;
                        if (jWECryptoParts.m2169onPaymentMethodSelected0YaROmY(str7)) {
                            ((Function1) mutableState6.getValue()).invoke(new OrderBuilderEvent.UpdatePaymentMethod(str7));
                        }
                    } else if (localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.PaymentTimingSelected) {
                        mutableState3.setValue(((LocalOpenTabCheckoutViewEvent.PaymentTimingSelected) localOpenTabCheckoutViewEvent).option);
                    } else if (localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.UrlClicked) {
                        ((RealLocalLauncher) localHomePresenter.localHomeGeoPresenterFactory).openWeb(screenNavigator, ((LocalOpenTabCheckoutViewEvent.UrlClicked) localOpenTabCheckoutViewEvent).url);
                    } else if (!(localOpenTabCheckoutViewEvent instanceof LocalOpenTabCheckoutViewEvent.PlaceOrderClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else if (!((OrderBuilderModel) mutableState.getValue()).updatingCart) {
                        OrderBuilderModel.BuyerInfo.UiReady validateForCheckout = CashAppServiceModule.validateForCheckout(((LocalOpenTabCheckoutViewEvent.PlaceOrderClicked) localOpenTabCheckoutViewEvent).buyerInfo, (AndroidStringManager) localHomePresenter.syncer, true);
                        if (validateForCheckout instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated) {
                            JobKt.launch$default(coroutineScope2, null, null, new MoleculeKt$immediateClockFlow$1$1$1((OrderBuilderModel.BuyerInfo.UiReady.Validated) validateForCheckout, jWECryptoParts, mutableState6, (MutableState) obj5, (MutableState) obj4, null, 3), 3);
                        } else {
                            ((Function1) mutableState6.getValue()).invoke(new OrderBuilderEvent.UpdateBuyerInfo(validateForCheckout));
                        }
                    }
                } else {
                    screenNavigator.goTo(back);
                }
                break;
            case 2:
                Location.LocationSummary locationSummary = (Location.LocationSummary) obj2;
                LocalAddress localAddress = locationSummary.address;
                String str8 = locationSummary.name;
                LocalPhone localPhone = locationSummary.phone;
                LocalOrderStatusPresenter localOrderStatusPresenter = (LocalOrderStatusPresenter) obj3;
                AndroidStringManager androidStringManager = localOrderStatusPresenter.stringManager;
                RealClipboardManager realClipboardManager = localOrderStatusPresenter.clipboardManager;
                RealLocalLauncher realLocalLauncher = localOrderStatusPresenter.launcher;
                LocalOrderStatusViewEvent localOrderStatusViewEvent = (LocalOrderStatusViewEvent) obj;
                if (!(localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.CloseClicked)) {
                    if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.MapClicked) {
                        mutableState2.setValue(Boolean.TRUE);
                    } else if (localOrderStatusViewEvent instanceof PhoneRowEvent$PhoneClicked) {
                        localPhone.getClass();
                        String str9 = localPhone.e164;
                        str9.getClass();
                        realLocalLauncher.openTel(str9);
                    } else if (localOrderStatusViewEvent instanceof MapDecisionEvent) {
                        MapDecisionEvent mapDecisionEvent = (MapDecisionEvent) localOrderStatusViewEvent;
                        if (!mapDecisionEvent.equals(MapDecisionEvent.Cancel.INSTANCE)) {
                            if (mapDecisionEvent.equals(MapDecisionEvent.CopyAddress.INSTANCE)) {
                                str8.getClass();
                                Object[] objArr = {str8};
                                Resources resources = androidStringManager.resources;
                                resources.getClass();
                                String format3 = new MessageFormat(resources.getString(R.string.local_presenters_location_address)).format(objArr);
                                format3.getClass();
                                localAddress.getClass();
                                realClipboardManager.copy(format3, LocalsKt.formattedFull(localAddress));
                            } else if (mapDecisionEvent.equals(MapDecisionEvent.OpenGoogleMap.INSTANCE)) {
                                String formattedFull = LocalsKt.formattedFull((LocalAddress) obj5);
                                localAddress.getClass();
                                String str10 = localAddress.google_place_id;
                                LocalOrder.LocalOrderBrand localOrderBrand = ((LocalOrder) mutableState4.getValue()).local_order_brand;
                                if (localOrderBrand == null || (str2 = localOrderBrand.name) == null) {
                                    str2 = (String) obj4;
                                }
                                realLocalLauncher.openMap(str2 + " " + formattedFull, str10);
                            } else if (!mapDecisionEvent.equals(MapDecisionEvent.CopyPhone.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                str8.getClass();
                                Resources resources2 = androidStringManager.resources;
                                resources2.getClass();
                                String format4 = new MessageFormat(resources2.getString(R.string.local_presenters_location_phone)).format(new Object[]{str8});
                                format4.getClass();
                                localPhone.getClass();
                                String str11 = localPhone.e164;
                                if (str11 == null) {
                                    str11 = localPhone.formatted;
                                    str11.getClass();
                                }
                                realClipboardManager.copy(format4, str11);
                            }
                        }
                        mutableState2.setValue(Boolean.FALSE);
                    } else if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.UrlClicked) {
                        realLocalLauncher.openWeb(localOrderStatusPresenter.navigator, ((LocalOrderStatusViewEvent.UrlClicked) localOrderStatusViewEvent).url);
                    } else if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.BrandPhoneClicked) {
                        localPhone.getClass();
                        String str12 = localPhone.e164;
                        str12.getClass();
                        realLocalLauncher.openTel(str12);
                    } else if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.CourierPhoneClicked) {
                        Fulfillment fulfillment = (Fulfillment) ((State) obj6).getValue();
                        fulfillment.getClass();
                        LocalFulfillment.DeliveryDetails deliveryDetails = fulfillment.deliveryDetails;
                        deliveryDetails.getClass();
                        LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver = deliveryDetails.courier_driver;
                        deliveryCourierDriver.getClass();
                        String str13 = deliveryCourierDriver.phone_number_e164;
                        str13.getClass();
                        realLocalLauncher.openTel(str13);
                    } else if (!(localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.RetryClicked)) {
                        if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.ImHereClicked) {
                            mutableState3.setValue(Boolean.TRUE);
                        } else if (!(localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.ArrivalToastDismissed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            mutableState.setValue(Boolean.FALSE);
                        }
                    }
                }
                break;
            case 3:
                break;
            case 4:
                MutableState mutableState7 = (MutableState) obj5;
                FilesetUploadPresenter filesetUploadPresenter = (FilesetUploadPresenter) obj2;
                Analytics analytics2 = filesetUploadPresenter.analytics;
                BlockersScreens.FilesetUploadScreen filesetUploadScreen = filesetUploadPresenter.args;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj3;
                FilesetUploadViewEvent filesetUploadViewEvent = (FilesetUploadViewEvent) obj;
                if (filesetUploadViewEvent instanceof FilesetUploadViewEvent.SystemFileSelected) {
                    FilePickerResult filePickerResult = ((FilesetUploadViewEvent.SystemFileSelected) filesetUploadViewEvent).result;
                    if (filePickerResult instanceof FilePickerResult.Success) {
                        mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() + 1));
                        mutableState4.setValue(new FilesetUploadPresenter.UriToUpload(((FilePickerResult.Success) filePickerResult).uri, Trigger.SYSTEM_PICKER));
                    } else if (filePickerResult instanceof FilePickerResult.Failure) {
                        filesetUploadPresenter.errorReporter.report(new FilePickerError((FilePickerResult.Failure) filePickerResult), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    } else if (!Intrinsics.areEqual(filePickerResult, FilePickerResult.Canceled.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                    break;
                } else {
                    boolean z3 = filesetUploadViewEvent instanceof FilesetUploadViewEvent.RemoveFile;
                    MutableState mutableState8 = this.$transaction$delegate$inlined;
                    if (!z3) {
                        boolean areEqual = Intrinsics.areEqual(filesetUploadViewEvent, FilesetUploadViewEvent.GoBack.INSTANCE);
                        MutableState mutableState9 = this.$phoneStatus$delegate$inlined;
                        if (areEqual) {
                            JobKt.launch$default(coroutineScope3, null, null, new FilesetUploadPresenter$models$2$3(filesetUploadPresenter, mutableState9, mutableState8, null, 0), 3);
                        } else if (Intrinsics.areEqual(filesetUploadViewEvent, FilesetUploadViewEvent.CancelUpload.INSTANCE)) {
                            mutableState4.setValue(null);
                        } else if (Intrinsics.areEqual(filesetUploadViewEvent, FilesetUploadViewEvent.RetryUpload.INSTANCE)) {
                            int intValue2 = ((Number) mutableState2.getValue()).intValue();
                            mutableState2.setValue(Integer.valueOf(intValue2 + 1));
                            Okio.boxInt(intValue2);
                        } else if (Intrinsics.areEqual(filesetUploadViewEvent, FilesetUploadViewEvent.PrimaryButtonClick.INSTANCE)) {
                            JobKt.launch$default(coroutineScope3, null, null, new FilesetUploadPresenter$models$2$3(filesetUploadPresenter, mutableState9, mutableState8, null, 1), 3);
                        } else if (Intrinsics.areEqual(filesetUploadViewEvent, FilesetUploadViewEvent.SecondaryButtonClick.INSTANCE)) {
                            JobKt.launch$default(coroutineScope3, null, null, new FilesetUploadPresenter$models$2$3(filesetUploadPresenter, mutableState9, mutableState8, null, 2), 3);
                        } else if (Intrinsics.areEqual(filesetUploadViewEvent, FilesetUploadViewEvent.AttachFileClick.INSTANCE)) {
                            filesetUploadPresenter.navigator.goTo(new BlockersScreens.FilesetUploadOptionsBottomSheet(filesetUploadScreen.blockersData));
                        } else if (filesetUploadViewEvent instanceof FilesetUploadViewEvent.UploadingOptionSelected) {
                            int ordinal = ((FilesetUploadViewEvent.UploadingOptionSelected) filesetUploadViewEvent).selectedOption.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    }
                                } else {
                                    String valueOf = String.valueOf(filesetUploadScreen.blockersData.clientScenario);
                                    String str14 = filesetUploadScreen.blockersData.flowToken;
                                    str14.getClass();
                                    analytics2.track(new DocumentUploadOpenSystemPicker(valueOf, str14), null);
                                }
                            } else {
                                Job job = (Job) mutableState7.getValue();
                                if (job != null) {
                                    job.cancel(null);
                                }
                                KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23 = new KClassImpl$Data$$Lambda$23(1, filesetUploadPresenter, (ParcelableSnapshotMutableIntState) obj4, (MutableState) obj6);
                                ConvertFromJavaKt$$Lambda$4 convertFromJavaKt$$Lambda$4 = new ConvertFromJavaKt$$Lambda$4(filesetUploadPresenter, 3);
                                AndroidPermissionManager$create$1 androidPermissionManager$create$1 = filesetUploadPresenter.cameraPermission;
                                if (!androidPermissionManager$create$1.$readonly.check()) {
                                    androidPermissionManager$create$1.request();
                                }
                                mutableState7.setValue(JobKt.launch$default(coroutineScope3, null, null, new zzmh(filesetUploadPresenter, kClassImpl$Data$$Lambda$23, convertFromJavaKt$$Lambda$4, (Continuation) null, 27), 3));
                            }
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        List list5 = (List) mutableState8.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj7 : list5) {
                            if (!Intrinsics.areEqual(((FilesetUploadViewModel.FileViewModel) obj7).id, ((FilesetUploadViewEvent.RemoveFile) filesetUploadViewEvent).id)) {
                                arrayList.add(obj7);
                            }
                        }
                        mutableState8.setValue(arrayList);
                        String valueOf2 = String.valueOf(filesetUploadScreen.blockersData.clientScenario);
                        String str15 = filesetUploadScreen.blockersData.flowToken;
                        str15.getClass();
                        analytics2.track(new DocumentUploadRemove(valueOf2, str15), null);
                        JobKt.launch$default(coroutineScope3, null, null, new SsnPresenter$models$2$2(filesetUploadPresenter, filesetUploadViewEvent, null, 16), 3);
                    }
                }
            case 5:
                InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) obj2;
                InvestingScreens.StockDetails stockDetails = investingStockDetailsPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator2 = investingStockDetailsPresenter.navigator;
                Analytics analytics3 = investingStockDetailsPresenter.analytics;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                InvestingStockDetailsViewEvent investingStockDetailsViewEvent = (InvestingStockDetailsViewEvent) obj;
                boolean z4 = investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.GraphEvent;
                MutableState mutableState10 = this.$loadedArticle$delegate$inlined;
                if (z4) {
                    InvestingGraphViewEvent investingGraphViewEvent = ((InvestingStockDetailsViewEvent.GraphEvent) investingStockDetailsViewEvent).investingGraphViewEvent;
                    if (investingGraphViewEvent instanceof InvestingGraphViewEvent.SelectRange) {
                        String str16 = ((StockDetails) mutableState10.getValue()).symbol;
                        HistoricalRange historicalRange = ((InvestingGraphViewEvent.SelectRange) investingGraphViewEvent).range;
                        historicalRange.getClass();
                        int ordinal2 = historicalRange.ordinal();
                        if (ordinal2 == 0) {
                            timeRange = StockToggleStockToggleToggleGraphTimeRange.TimeRange.DAY;
                        } else if (ordinal2 == 1) {
                            timeRange = StockToggleStockToggleToggleGraphTimeRange.TimeRange.WEEK;
                        } else if (ordinal2 == 2) {
                            timeRange = StockToggleStockToggleToggleGraphTimeRange.TimeRange.MONTH;
                        } else if (ordinal2 == 3) {
                            timeRange = StockToggleStockToggleToggleGraphTimeRange.TimeRange.YEAR;
                        } else if (ordinal2 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            timeRange = StockToggleStockToggleToggleGraphTimeRange.TimeRange.ALL;
                        }
                        analytics3.track(new StockToggleStockToggleToggleGraphTimeRange(str16, timeRange, MultipartBody.Part.Companion.toEquityType(((StockDetails) mutableState10.getValue()).f1150type)), null);
                        investingStockDetailsPresenter.lastSelectedRange.range$delegate.setValue(historicalRange);
                        break;
                    } else if (!(investingGraphViewEvent instanceof InvestingGraphViewEvent.ScrubPoint)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        mutableState4.setValue((InvestingGraphViewEvent.ScrubPoint) investingGraphViewEvent);
                    }
                } else if (investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.Close) {
                    InvestingScreens.StockDetails.Origin origin = stockDetails.origin;
                    InvestingScreens.StockDetails.Origin.Tradable tradable = origin instanceof InvestingScreens.StockDetails.Origin.Tradable ? (InvestingScreens.StockDetails.Origin.Tradable) origin : null;
                    if (tradable == null || !tradable.fromTrade) {
                        screenNavigator2.goTo(back);
                    } else {
                        screenNavigator2.goTo(new InvestingScreens.InvestingHome(null, null, 62, false));
                    }
                } else if (investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.CategoryClick) {
                    JobKt.launch$default(coroutineScope4, null, null, new InvestingHomeView$onScrollFlow$1(investingStockDetailsPresenter, investingStockDetailsViewEvent, mutableState10, null, 25), 3);
                } else if (investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.DisclosureLinkClick) {
                    JobKt.launch$default(coroutineScope4, null, null, new RealKeyStoreProvider$setEntry$2(investingStockDetailsPresenter, (Investing_settings) obj4, investingStockDetailsViewEvent, (Continuation) null, 3), 3);
                } else if (investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.RecurringPurchaseItemTap) {
                    StockDetails stockDetails2 = (StockDetails) mutableState10.getValue();
                    analytics3.track(new StockSelectSelectAutoInvestment(stockDetails2.symbol, MultipartBody.Part.Companion.toEquityType(stockDetails2.f1150type)), null);
                    String str17 = ((InvestingStockDetailsViewEvent.RecurringPurchaseItemTap) investingStockDetailsViewEvent).preferenceId;
                    InvestmentEntityWithPrice investmentEntityWithPrice = stockDetails2.entityWithPrice;
                    screenNavigator2.goTo(new InvestingScreens.RecurringPurchaseReceipt(str17, (ColorModel.Accented) obj6, new InvestingScreens.RecurringPurchaseReceipt.Type.Stock(investmentEntityWithPrice.getIcon(), investmentEntityWithPrice.getToken())));
                } else if (investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.ShowEntityPerformance) {
                    analytics3.track(new StockViewViewMyInvestmentDetails(((StockDetails) mutableState10.getValue()).symbol, MultipartBody.Part.Companion.toEquityType(((StockDetails) mutableState10.getValue()).f1150type)), null);
                    screenNavigator2.goTo(new InvestingScreens.PerformanceScreens.StockPerformanceScreen(stockDetails.investmentEntityToken, true));
                } else if (!(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.FirstButtonTap)) {
                    if (investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.SecondButtonTap) {
                        Loaded loaded = (Loaded) ((MutableState) obj5).getValue();
                        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = (loaded == null || (investment_holding = (Investment_holding) loaded.value) == null) ? null : investment_holding.state;
                        int i2 = investmentHoldingState == null ? -1 : InvestingStockDetailsPresenter.WhenMappings.$EnumSwitchMapping$0[investmentHoldingState.ordinal()];
                        if (i2 != -1) {
                            if (i2 != 1) {
                                if (i2 != 2 && i2 != 3 && i2 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            } else if (((Boolean) mutableState3.getValue()).booleanValue()) {
                                StockDetails stockDetails3 = (StockDetails) mutableState10.getValue();
                                InvestingScreens screenForType2 = investingStockDetailsPresenter.screenForType(OrderSide.SELL, stockDetails3, ((Boolean) mutableState.getValue()).booleanValue());
                                if (screenForType2 instanceof InvestingScreens.TransferStock) {
                                    analytics3.track(new StockTradeStart(com.squareup.cash.cdf.stock.OrderSide.SELL, stockDetails3.entityWithPrice.getSymbol(), MultipartBody.Part.Companion.toEquityType(stockDetails3.f1150type)), null);
                                }
                                screenNavigator2.goTo(screenForType2);
                            }
                        }
                        JobKt.launch$default(coroutineScope4, investingStockDetailsPresenter.ioDispatcher, null, new InvestingHomeView$onScrollFlow$1(investingStockDetailsPresenter, investmentHoldingState, mutableState10, null, 26), 2);
                    } else if (!(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.AnalystOpinionsEvent) && !(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.EarningsEvent) && !(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.FinancialEvent) && !(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.NewsEvent) && !(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.KeyStatEvent) && !(investingStockDetailsViewEvent instanceof InvestingStockDetailsViewEvent.EtfHoldingsEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    StockDetails stockDetails4 = (StockDetails) mutableState10.getValue();
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    InvestingScreens.StockDetails.Origin origin2 = stockDetails.origin;
                    InvestmentEntityToken investmentEntityToken = stockDetails.investmentEntityToken;
                    if (origin2 instanceof InvestingScreens.StockDetails.Origin.StockSearch) {
                        screenForType = (BlockersScreens.StockSelectionBlockerScreen) ((InvestingScreens.StockDetails.Origin.StockSearch) origin2).exitScreen;
                        screenForType.getClass();
                        investmentEntityToken.getClass();
                    } else if (!(origin2 instanceof InvestingScreens.StockDetails.Origin.Tradable)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenForType = investingStockDetailsPresenter.screenForType(OrderSide.BUY, stockDetails4, booleanValue);
                    }
                    if (screenForType instanceof InvestingScreens.TransferStock) {
                        analytics3.track(new StockTradeStart(com.squareup.cash.cdf.stock.OrderSide.BUY, stockDetails4.entityWithPrice.getSymbol(), MultipartBody.Part.Companion.toEquityType(stockDetails4.f1150type)), null);
                    }
                    AskedQuestion askedQuestion = stockDetails.question;
                    if (!(stockDetails.origin instanceof InvestingScreens.StockDetails.Origin.StockSearch) || askedQuestion == null) {
                        screenNavigator2.goTo(screenForType);
                    } else {
                        screenNavigator2.giveAnswer(askedQuestion, new Pair(investmentEntityToken, stockDetails4.symbol));
                    }
                }
                break;
            case 6:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                Analytics analytics4 = (Analytics) poolsListPresenter.analytics;
                PoolInvitePeopleListScreen poolInvitePeopleListScreen = (PoolInvitePeopleListScreen) poolsListPresenter.flowToken;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj3;
                PoolInvitePeopleListViewEvent poolInvitePeopleListViewEvent = (PoolInvitePeopleListViewEvent) obj;
                if (!(poolInvitePeopleListViewEvent instanceof PoolInvitePeopleListViewEvent.SearchTermChanged)) {
                    boolean z5 = poolInvitePeopleListViewEvent instanceof PoolInvitePeopleListViewEvent.AvatarTapped;
                    Back back2 = Back.INSTANCE;
                    if (z5) {
                        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                        profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(((PoolInvitePeopleListViewEvent.AvatarTapped) poolInvitePeopleListViewEvent).token, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE, RealUuidGenerator.generate(), GetProfileDetailsContext.POOLS, CustomerProfileViewOpen.EntryPoint.CELL, back2, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                        screenNavigator3.goTo(profileFor);
                    } else if (poolInvitePeopleListViewEvent instanceof PoolInvitePeopleListViewEvent.AddCustomerToPool) {
                        JobKt.launch$default(coroutineScope5, (CoroutineContext) poolsListPresenter.args, null, new SessionWorkerKt$runSession$4$1(poolInvitePeopleListViewEvent, poolsListPresenter, this.$loadedArticle$delegate$inlined, this.$articleResult$delegate$inlined, this.$transaction$delegate$inlined, this.$phoneStatus$delegate$inlined, (MutableState) obj5, (MutableState) obj6, (MutableState) obj4, (Continuation) null, 11), 2);
                    } else if (!Intrinsics.areEqual(poolInvitePeopleListViewEvent, PoolInvitePeopleListViewEvent.Exit.INSTANCE)) {
                        if (Intrinsics.areEqual(poolInvitePeopleListViewEvent, PoolInvitePeopleListViewEvent.CopyLinkTapped.INSTANCE)) {
                            String str18 = poolInvitePeopleListScreen.flowToken;
                            String str19 = poolInvitePeopleListScreen.token;
                            AssetPoolSharePoolExternally.ShareOption shareOption = AssetPoolSharePoolExternally.ShareOption.COPY_LINK;
                            str18.getClass();
                            str19.getClass();
                            analytics4.track(new AssetPoolSharePoolExternally(str19, str18, shareOption), null);
                            ((MutableState) obj5).setValue(new InviteMemberSnackBarViewModel(((AndroidStringManager) poolsListPresenter.stringManager).get(R.string.pools_toast_copy_link), null, Icons.Copy24, 2));
                            RealClipboardManager realClipboardManager2 = (RealClipboardManager) poolsListPresenter.localeAssetProvider;
                            String str20 = poolInvitePeopleListScreen.shareUrl;
                            realClipboardManager2.copy("Share Pool Link", str20 != null ? str20 : "");
                        } else if (Intrinsics.areEqual(poolInvitePeopleListViewEvent, PoolInvitePeopleListViewEvent.ShareTapped.INSTANCE)) {
                            String str21 = poolInvitePeopleListScreen.flowToken;
                            String str22 = poolInvitePeopleListScreen.token;
                            AssetPoolSharePoolExternally.ShareOption shareOption2 = AssetPoolSharePoolExternally.ShareOption.SHARE_SHEET;
                            str21.getClass();
                            str22.getClass();
                            analytics4.track(new AssetPoolSharePoolExternally(str22, str21, shareOption2), null);
                            IntentLauncher intentLauncher = (IntentLauncher) poolsListPresenter.dateFormatManager;
                            String str23 = poolInvitePeopleListScreen.shareUrl;
                            intentLauncher.shareText(str23 != null ? str23 : "", null, null);
                        } else if (!Intrinsics.areEqual(poolInvitePeopleListViewEvent, PoolInvitePeopleListViewEvent.GrantContactsPermissionClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            JobKt.launch$default(coroutineScope5, null, null, new ShoppingWebBridge.AnonymousClass1(poolsListPresenter, (Continuation) null, 1), 3);
                        }
                    } else {
                        String str24 = poolInvitePeopleListScreen.flowToken;
                        str24.getClass();
                        analytics4.track(new AssetPoolAddMemberDismiss(str24), null);
                        AskedQuestion askedQuestion2 = poolInvitePeopleListScreen.question;
                        if (askedQuestion2 != null) {
                            RedactedParcelableList redactList = DBUtil.redactList((List) ((MutableState) obj4).getValue());
                            List list6 = (List) ((MutableState) obj6).getValue();
                            list6.getClass();
                            screenNavigator3.giveAnswer(askedQuestion2, new PoolInvitePeopleResult(redactList, new RedactedStringList(list6)));
                        } else {
                            screenNavigator3.goTo(back2);
                        }
                    }
                }
                break;
            default:
                CurrencyCode currencyCode = (CurrencyCode) obj3;
                AddMoneyPresenter addMoneyPresenter = (AddMoneyPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator4 = addMoneyPresenter.navigator;
                Analytics analytics5 = addMoneyPresenter.analytics;
                AddMoneyScreen addMoneyScreen = addMoneyPresenter.args;
                AddMoneyViewEvent addMoneyViewEvent = (AddMoneyViewEvent) obj;
                if (addMoneyViewEvent instanceof AddMoneyViewEvent.AmountPickerItemSelected) {
                    AddMoneyViewModel.AtmPicker.AmountPickerItem amountPickerItem = ((AddMoneyViewEvent.AmountPickerItemSelected) addMoneyViewEvent).item;
                    if (amountPickerItem instanceof AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount) {
                        Money money = ((AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount) amountPickerItem).amount;
                        List list7 = AddMoneyPresenter.PRESET_AMOUNTS;
                        mutableState2.setValue(money);
                    } else if (!(amountPickerItem instanceof AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Money zero = Moneys.zero(currencyCode);
                        List list8 = AddMoneyPresenter.PRESET_AMOUNTS;
                        mutableState2.setValue(zero);
                    }
                } else if (addMoneyViewEvent instanceof AddMoneyViewEvent.CtaClick) {
                    List list9 = AddMoneyPresenter.PRESET_AMOUNTS;
                    mutableState4.setValue(Boolean.TRUE);
                } else if (addMoneyViewEvent instanceof AddMoneyViewEvent.CloseClick) {
                    analytics5.track(new CashDepositCanceled(), null);
                    screenNavigator4.goTo(back);
                } else if (addMoneyViewEvent instanceof AddMoneyViewEvent.AmountKeypadEntered) {
                    Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(((AddMoneyViewEvent.AmountKeypadEntered) addMoneyViewEvent).amount, currencyCode);
                    List list10 = AddMoneyPresenter.PRESET_AMOUNTS;
                    mutableState2.setValue(parseMoneyFromString$default);
                } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.Expanded.INSTANCE)) {
                    AddMoneyPresenter.InputMode inputMode = AddMoneyPresenter.InputMode.KEYPAD;
                    List list11 = AddMoneyPresenter.PRESET_AMOUNTS;
                    mutableState3.setValue(inputMode);
                } else if (!Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.Peeking.INSTANCE)) {
                    if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.ChangeInstrumentClick.INSTANCE)) {
                        List list12 = AddMoneyPresenter.PRESET_AMOUNTS;
                        Instrument instrument = (Instrument) ((State) obj6).getValue();
                        if (instrument == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Add Money instrument was null when tapping instrument selector");
                            break;
                        } else {
                            String str25 = instrument.token;
                            analytics5.track(new CashDepositSelectInstrument(addMoneyScreen.blockersData.flowToken, NavArgumentKt.toCdfInstrumentType(instrument.cashInstrumentType)), null);
                            screenNavigator4.goTo(new InstrumentSelectionLoadingScreen(BlockersData.copy$default(addMoneyScreen.blockersData, null, null, null, null, null, null, new TransfersRouterScreen(AddMoneyScreen.copy$default(addMoneyScreen, null, (Money) mutableState2.getValue(), str25, 57)), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535), new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney((Money) mutableState2.getValue(), str25, addMoneyScreen.startInKeypad)));
                        }
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.PayWithGooglePayClick.INSTANCE)) {
                        List list13 = AddMoneyPresenter.PRESET_AMOUNTS;
                        Boolean bool = Boolean.TRUE;
                        mutableState.setValue(bool);
                        mutableState4.setValue(bool);
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.RecurringCashInToggleClick.INSTANCE)) {
                        List list14 = AddMoneyPresenter.PRESET_AMOUNTS;
                        if (((Boolean) ((MutableState) obj5).getValue()).booleanValue()) {
                            ((MutableState) obj4).setValue(Boolean.valueOf(!((Boolean) r13.getValue()).booleanValue()));
                        }
                    } else if (!(addMoneyViewEvent instanceof AddMoneyViewEvent.InstrumentSelected) && !Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.InstrumentPickerDoneClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else if (!addMoneyScreen.startInKeypad) {
                    mutableState2.setValue(Moneys.zero(currencyCode));
                    mutableState3.setValue(AddMoneyPresenter.InputMode.ATM_PICKER);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, SnapshotStateMap snapshotStateMap, Ref$ObjectRef ref$ObjectRef, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.this$0 = localHomePresenter;
        this.$hasUnreadMessages$delegate$inlined = snapshotStateMap;
        this.$requestCount$delegate$inlined = ref$ObjectRef;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$transaction$delegate$inlined = mutableState3;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, JWECryptoParts jWECryptoParts, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.this$0 = localHomePresenter;
        this.$hasUnreadMessages$delegate$inlined = jWECryptoParts;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$transaction$delegate$inlined = mutableState3;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$requestCount$delegate$inlined = mutableState6;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, FilesetUploadPresenter filesetUploadPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState6) {
        this.this$0 = filesetUploadPresenter;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$transaction$delegate$inlined = mutableState3;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$requestCount$delegate$inlined = parcelableSnapshotMutableIntState;
        this.$hasUnreadMessages$delegate$inlined = mutableState6;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, InvestingStockDetailsPresenter investingStockDetailsPresenter, ColorModel.Accented accented, MutableState mutableState, MutableState mutableState2, Investing_settings investing_settings, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.this$0 = investingStockDetailsPresenter;
        this.$hasUnreadMessages$delegate$inlined = accented;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$requestCount$delegate$inlined = investing_settings;
        this.$transaction$delegate$inlined = mutableState3;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, PoolsListPresenter poolsListPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.this$0 = poolsListPresenter;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$transaction$delegate$inlined = mutableState3;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$hasUnreadMessages$delegate$inlined = mutableState6;
        this.$requestCount$delegate$inlined = mutableState7;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, ArticlePresenter articlePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, MutableState mutableState4, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState5) {
        this.this$0 = articlePresenter;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$transaction$delegate$inlined = mutableState3;
        this.$hasUnreadMessages$delegate$inlined = state;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$requestCount$delegate$inlined = parcelableSnapshotMutableIntState;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ArticlePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, CurrencyCode currencyCode, AddMoneyPresenter addMoneyPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.$$this$LaunchedEffect = currencyCode;
        this.this$0 = addMoneyPresenter;
        this.$loadedArticle$delegate$inlined = mutableState;
        this.$articleResult$delegate$inlined = mutableState2;
        this.$transaction$delegate$inlined = mutableState3;
        this.$hasUnreadMessages$delegate$inlined = state;
        this.$phoneStatus$delegate$inlined = mutableState4;
        this.$isWebViewProvided$delegate$inlined = mutableState5;
        this.$requestCount$delegate$inlined = mutableState6;
    }
}
