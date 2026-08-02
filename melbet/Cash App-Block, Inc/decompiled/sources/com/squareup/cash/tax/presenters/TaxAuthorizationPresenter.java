package com.squareup.cash.tax.presenters;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.tax.viewmodels.TaxAuthorizationViewModel$Empty;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$DataState;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$FetchResult;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$fetchStubs$1;
import com.squareup.cash.work.presenters.pay.PayHistoryListViewModelMapper;
import com.squareup.cash.work.screens.WorkPayHistoryListScreen;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.payroll.PayStubsResponse;
import com.squareup.cash.work.service.api.payroll.PayrollJsonService;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.protos.cash.tax.OpenTaxHubRequest;
import com.squareup.protos.cash.tax.OpenTaxHubResponse;
import com.squareup.protos.cash.tax.OpenTaxRequest;
import com.squareup.protos.cash.tax.OpenTaxResponse;
import com.squareup.protos.cash.tax.TaxClientService;
import com.squareup.protos.cash.tax.TaxDeepLinkRequest;
import com.squareup.protos.cash.tax.TaxDeepLinkResponse;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.FlowUriMatcher;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class TaxAuthorizationPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object appService;
    public final Object args;
    public final Object blockersDataNavigator;
    public final Object flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;
    public final Object taxEnvironment;
    public final Object taxService;

    public TaxAuthorizationPresenter(WorkPayHistoryListScreen workPayHistoryListScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, PayrollJsonService payrollJsonService, RealSelectedMerchantProvider realSelectedMerchantProvider, RealSelectedMerchantDataProvider realSelectedMerchantDataProvider, RealSellerCardViewModelProducer realSellerCardViewModelProducer, PayHistoryListViewModelMapper payHistoryListViewModelMapper, ShiftsAnalytics shiftsAnalytics) {
        workPayHistoryListScreen.getClass();
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.taxService = payrollJsonService;
        this.flowStarter = realSelectedMerchantProvider;
        this.appService = realSelectedMerchantDataProvider;
        this.blockersDataNavigator = realSellerCardViewModelProducer;
        this.taxEnvironment = payHistoryListViewModelMapper;
        this.args = shiftsAnalytics;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:13:0x0066, B:15:0x006c, B:16:0x0072, B:20:0x007a, B:21:0x0080, B:23:0x008d, B:24:0x0094, B:35:0x003c, B:37:0x004d, B:38:0x0058), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchStubs(TaxAuthorizationPresenter taxAuthorizationPresenter, String str, Integer num, ContinuationImpl continuationImpl) {
        PayHistoryListPresenter$fetchStubs$1 payHistoryListPresenter$fetchStubs$1;
        int i;
        PayStubsResponse payStubsResponse;
        try {
            if (continuationImpl instanceof PayHistoryListPresenter$fetchStubs$1) {
                payHistoryListPresenter$fetchStubs$1 = (PayHistoryListPresenter$fetchStubs$1) continuationImpl;
                int i2 = payHistoryListPresenter$fetchStubs$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    payHistoryListPresenter$fetchStubs$1.label = i2 - PKIFailureInfo.systemUnavail;
                    PayHistoryListPresenter$fetchStubs$1 payHistoryListPresenter$fetchStubs$12 = payHistoryListPresenter$fetchStubs$1;
                    Object obj = payHistoryListPresenter$fetchStubs$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = payHistoryListPresenter$fetchStubs$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        PayrollJsonService payrollJsonService = (PayrollJsonService) taxAuthorizationPresenter.taxService;
                        SquareMerchantToken squareMerchantToken = new SquareMerchantToken(str);
                        Integer num2 = new Integer(20);
                        String valueOf = num != null ? String.valueOf(num.intValue()) : null;
                        payHistoryListPresenter$fetchStubs$12.L$1 = num;
                        payHistoryListPresenter$fetchStubs$12.label = 1;
                        obj = payrollJsonService.getTeamStubs(str, squareMerchantToken, num2, valueOf, "DESC", payHistoryListPresenter$fetchStubs$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        num = payHistoryListPresenter$fetchStubs$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                    }
                    ApiResult apiResult = (ApiResult) obj;
                    payStubsResponse = (PayStubsResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                    if (payStubsResponse != null) {
                        return null;
                    }
                    List list = payStubsResponse.data;
                    return new PayHistoryListPresenter$FetchResult(list, list.size() == 20 ? new Integer((num != null ? num.intValue() : 0) + list.size()) : null);
                }
            }
            if (i != 0) {
            }
            ApiResult apiResult2 = (ApiResult) obj;
            payStubsResponse = (PayStubsResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
            if (payStubsResponse != null) {
            }
        } catch (Exception e) {
            Timber.Forest.e("Failed to fetch pay stubs", new Object[0], e);
            return null;
        }
        payHistoryListPresenter$fetchStubs$1 = new PayHistoryListPresenter$fetchStubs$1(taxAuthorizationPresenter, continuationImpl);
        PayHistoryListPresenter$fetchStubs$1 payHistoryListPresenter$fetchStubs$122 = payHistoryListPresenter$fetchStubs$1;
        Object obj2 = payHistoryListPresenter$fetchStubs$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payHistoryListPresenter$fetchStubs$122.label;
    }

    public static void navigateToBlockerError$default(TaxAuthorizationPresenter taxAuthorizationPresenter, BlockersData blockersData) {
        taxAuthorizationPresenter.navigator.goTo(new BlockersScreens.Error(blockersData, taxAuthorizationPresenter.stringManager.get(R.string.generic_network_error), null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (getTaxFlow((com.squareup.cash.blockers.screens.BlockersScreens.StartFlowEntryPointScreen) r1, r3) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005c, code lost:
    
        if (r1 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFlowTokenFromTaxServer(ContinuationImpl continuationImpl) {
        TaxAuthorizationPresenter$getFlowTokenFromTaxServer$1 taxAuthorizationPresenter$getFlowTokenFromTaxServer$1;
        int i;
        ApiResult apiResult;
        String str;
        TaxAuthorizationScreen taxAuthorizationScreen = (TaxAuthorizationScreen) this.args;
        if (continuationImpl instanceof TaxAuthorizationPresenter$getFlowTokenFromTaxServer$1) {
            taxAuthorizationPresenter$getFlowTokenFromTaxServer$1 = (TaxAuthorizationPresenter$getFlowTokenFromTaxServer$1) continuationImpl;
            int i2 = taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TaxClientService taxClientService = (TaxClientService) this.taxService;
                    OpenTaxRequest openTaxRequest = new OpenTaxRequest(taxAuthorizationScreen.taxLocation.getUrl(), (TaxEnvironment) this.taxEnvironment, ByteString.EMPTY);
                    taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.label = 1;
                    obj = taxClientService.openTax(openTaxRequest, taxAuthorizationPresenter$getFlowTokenFromTaxServer$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    OpenTaxResponse openTaxResponse = (OpenTaxResponse) ((ApiResult.Success) apiResult).response;
                    String str2 = openTaxResponse.flow_url;
                    if (str2 == null || str2.length() == 0) {
                        navigateToBlockerError$default(this, BlockersData.DUMMY);
                        return Unit.INSTANCE;
                    }
                    Timber.Forest forest = Timber.Forest;
                    String str3 = openTaxResponse.flow_url;
                    if (str3 == null) {
                        str3 = "Null";
                    }
                    forest.d("Tax URL respond ".concat(str3), new Object[0]);
                    String str4 = openTaxResponse.flow_url;
                    str4.getClass();
                    Matcher matcher = new FlowUriMatcher(str4).flowMatcher;
                    if (matcher.matches()) {
                        try {
                            str = matcher.group(1);
                        } catch (Exception unused) {
                            str = null;
                        }
                        if (str == null) {
                            Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m("Expected flow token on path ", openTaxResponse.flow_url));
                            return null;
                        }
                        FlowStarter flowStarter = (FlowStarter) this.flowStarter;
                        Screen screen = taxAuthorizationScreen.exitScreen;
                        BlockersScreens.StartFlowEntryPoint startPlasmaFlowWithParams$default = FlowStarter.startPlasmaFlowWithParams$default(flowStarter, str, screen, null, null, screen, null, false, null, 492);
                        if (startPlasmaFlowWithParams$default instanceof BlockersScreens.StartFlowEntryPointScreen) {
                            taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.label = 2;
                        } else {
                            navigateToBlockerError$default(this, BlockersData.DUMMY);
                        }
                    } else {
                        navigateToBlockerError$default(this, BlockersData.DUMMY);
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    navigateToBlockerError$default(this, BlockersData.DUMMY);
                }
                return Unit.INSTANCE;
            }
        }
        taxAuthorizationPresenter$getFlowTokenFromTaxServer$1 = new TaxAuthorizationPresenter$getFlowTokenFromTaxServer$1(this, continuationImpl);
        Object obj3 = taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxAuthorizationPresenter$getFlowTokenFromTaxServer$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTaxFlow(BlockersScreens.StartFlowEntryPointScreen startFlowEntryPointScreen, ContinuationImpl continuationImpl) {
        TaxAuthorizationPresenter$getTaxFlow$1 taxAuthorizationPresenter$getTaxFlow$1;
        int i;
        ApiResult apiResult;
        BlockersScreens.StartFlowEntryPointScreen startFlowEntryPointScreen2 = startFlowEntryPointScreen;
        if (continuationImpl instanceof TaxAuthorizationPresenter$getTaxFlow$1) {
            taxAuthorizationPresenter$getTaxFlow$1 = (TaxAuthorizationPresenter$getTaxFlow$1) continuationImpl;
            int i2 = taxAuthorizationPresenter$getTaxFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                taxAuthorizationPresenter$getTaxFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                TaxAuthorizationPresenter$getTaxFlow$1 taxAuthorizationPresenter$getTaxFlow$12 = taxAuthorizationPresenter$getTaxFlow$1;
                Object obj = taxAuthorizationPresenter$getTaxFlow$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxAuthorizationPresenter$getTaxFlow$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = (AppService) this.appService;
                    RequestContext requestContext = startFlowEntryPointScreen2.blockersData.requestContext;
                    String str = startFlowEntryPointScreen2.initiationData;
                    GetFlowRequest getFlowRequest = new GetFlowRequest(requestContext, str != null ? new GetFlowRequest.Input.InitiationData(str) : null, 4);
                    taxAuthorizationPresenter$getTaxFlow$12.L$0 = startFlowEntryPointScreen2;
                    taxAuthorizationPresenter$getTaxFlow$12.label = 1;
                    obj = appService.getFlow("/2.0/cash/get-flow", null, null, getFlowRequest, taxAuthorizationPresenter$getTaxFlow$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startFlowEntryPointScreen2 = taxAuthorizationPresenter$getTaxFlow$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    GetFlowResponse getFlowResponse = (GetFlowResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext responseContext = getFlowResponse.response_context;
                    responseContext.getClass();
                    BlockersData blockersData = startFlowEntryPointScreen2.blockersData;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    ClientScenario clientScenario = getFlowResponse.client_scenario;
                    String str2 = getFlowResponse.token;
                    str2.getClass();
                    this.navigator.goTo(((BlockersDataNavigator) this.blockersDataNavigator).getNext(startFlowEntryPointScreen2, BlockersData.copy$default(updateFromResponseContext, null, str2, null, null, null, null, null, null, false, false, null, null, null, false, clientScenario, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65539, 65535)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    navigateToBlockerError$default(this, startFlowEntryPointScreen2.blockersData);
                }
                return Unit.INSTANCE;
            }
        }
        taxAuthorizationPresenter$getTaxFlow$1 = new TaxAuthorizationPresenter$getTaxFlow$1(this, continuationImpl);
        TaxAuthorizationPresenter$getTaxFlow$1 taxAuthorizationPresenter$getTaxFlow$122 = taxAuthorizationPresenter$getTaxFlow$1;
        Object obj2 = taxAuthorizationPresenter$getTaxFlow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxAuthorizationPresenter$getTaxFlow$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTaxHubWebViewBlockerFromTaxServer(ContinuationImpl continuationImpl) {
        TaxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1 taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1;
        int i;
        BlockersData blockersData;
        ApiResult apiResult;
        TaxAuthorizationScreen taxAuthorizationScreen = (TaxAuthorizationScreen) this.args;
        if (continuationImpl instanceof TaxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1) {
            taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1 = (TaxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1) continuationImpl;
            int i2 = taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowStarter flowStarter = (FlowStarter) this.flowStarter;
                    Screen screen = taxAuthorizationScreen.exitScreen;
                    RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
                    BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, flow, screen, null, ClientScenario.INITIATE_TAX_UPGRADE, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
                    TaxClientService taxClientService = (TaxClientService) this.taxService;
                    OpenTaxHubRequest openTaxHubRequest = new OpenTaxHubRequest(startFlow$default.requestContext, (TaxEnvironment) this.taxEnvironment, ByteString.EMPTY);
                    taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.L$0 = startFlow$default;
                    taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.label = 1;
                    Object openTaxHub = taxClientService.openTaxHub(openTaxHubRequest, taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1);
                    if (openTaxHub == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blockersData = startFlow$default;
                    obj = openTaxHub;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((OpenTaxHubResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    this.navigator.goTo(((BlockersDataNavigator) this.blockersDataNavigator).getNext(taxAuthorizationScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    navigateToBlockerError$default(this, blockersData);
                }
                return Unit.INSTANCE;
            }
        }
        taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1 = new TaxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1(this, continuationImpl);
        Object obj2 = taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxAuthorizationPresenter$getTaxHubWebViewBlockerFromTaxServer$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewTaxDeepLinkBlockerFromTaxServer(TaxLocation.TaxHubWithDeepLink taxHubWithDeepLink, ContinuationImpl continuationImpl) {
        TaxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1 taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1;
        int i;
        BlockersData blockersData;
        ApiResult apiResult;
        TaxAuthorizationScreen taxAuthorizationScreen = (TaxAuthorizationScreen) this.args;
        if (continuationImpl instanceof TaxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1) {
            taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1 = (TaxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1) continuationImpl;
            int i2 = taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowStarter flowStarter = (FlowStarter) this.flowStarter;
                    Screen screen = taxAuthorizationScreen.exitScreen;
                    RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
                    BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, flow, screen, null, ClientScenario.INITIATE_TAX_UPGRADE, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
                    TaxClientService taxClientService = (TaxClientService) this.taxService;
                    TaxDeepLinkRequest taxDeepLinkRequest = new TaxDeepLinkRequest(startFlow$default.requestContext, taxHubWithDeepLink.url, (TaxEnvironment) this.taxEnvironment, ByteString.EMPTY);
                    taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.L$1 = startFlow$default;
                    taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.label = 1;
                    Object openTaxDeepLink = taxClientService.openTaxDeepLink(taxDeepLinkRequest, taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1);
                    if (openTaxDeepLink == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blockersData = startFlow$default;
                    obj = openTaxDeepLink;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((TaxDeepLinkResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    this.navigator.goTo(((BlockersDataNavigator) this.blockersDataNavigator).getNext(taxAuthorizationScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    navigateToBlockerError$default(this, blockersData);
                }
                return Unit.INSTANCE;
            }
        }
        taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1 = new TaxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1(this, continuationImpl);
        Object obj2 = taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxAuthorizationPresenter$getViewTaxDeepLinkBlockerFromTaxServer$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.squareup.cash.work.viewmodels.PayHistoryListViewModel$Error] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.squareup.cash.work.viewmodels.PayHistoryListViewModel$Loading] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$DataState$Loaded, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.squareup.cash.work.viewmodels.PayHistoryListViewModel$Loaded] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.squareup.cash.work.presenters.RealSellerCardViewModelProducer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Integer num;
        MutableState mutableState;
        PayHistoryListViewModel.Loaded loaded;
        PayHistoryListPresenter$DataState.Loaded loaded2;
        Object obj;
        MutableState mutableState2;
        PayHistoryListViewModelMapper payHistoryListViewModelMapper;
        String str;
        TaxAuthorizationPresenter taxAuthorizationPresenter;
        PayHistoryListViewModel.Loaded map;
        Continuation continuation;
        Continuation continuation2 = null;
        switch (this.$r8$classId) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1340404622);
                Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation2, this, 6));
                gapComposer.end(false);
                return TaxAuthorizationViewModel$Empty.INSTANCE;
            default:
                PayHistoryListViewModelMapper payHistoryListViewModelMapper2 = (PayHistoryListViewModelMapper) this.taxEnvironment;
                flow.getClass();
                ?? r13 = (GapComposer) composer;
                r13.startReplaceGroup(-415662204);
                Object rememberedValue = r13.rememberedValue();
                Object obj2 = Composer.Companion.Empty;
                if (rememberedValue == obj2) {
                    rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, (GapComposer) r13);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                Object rememberedValue2 = r13.rememberedValue();
                if (rememberedValue2 == obj2) {
                    rememberedValue2 = Updater.mutableStateOf$default(PayHistoryListPresenter$DataState.Loading.INSTANCE);
                    r13.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                MutableState collectAsState = Updater.collectAsState(((RealSelectedMerchantProvider) this.flowStarter).getMerchantIdentifierFlow(), null, null, r13, 48, 2);
                MutableState collectAsState2 = Updater.collectAsState(((RealSelectedMerchantDataProvider) this.appService).getSelectedMerchantFlow(), null, null, r13, 48, 2);
                SellerCardViewModel collectSelectedMerchantViewModel = ((RealSellerCardViewModelProducer) this.blockersDataNavigator).collectSelectedMerchantViewModel(r13);
                Merchant merchant = (Merchant) collectAsState2.getValue();
                Continuation continuation3 = null;
                String name = merchant != null ? MerchantKt.getName(merchant) : null;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = r13.changedInstance(this);
                Object rememberedValue3 = r13.rememberedValue();
                if (changedInstance || rememberedValue3 == obj2) {
                    rememberedValue3 = new CameraHelper$unbind$2(this, continuation3, 8);
                    r13.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect((Composer) r13, unit, (Function2) rememberedValue3);
                Updater.LaunchedEffect((Composer) r13, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, mutableState3, parcelableSnapshotMutableIntState, 18));
                MerchantIdentifier merchantIdentifier = (MerchantIdentifier) collectAsState.getValue();
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                boolean changed = r13.changed(collectAsState) | r13.changedInstance(this);
                Object rememberedValue4 = r13.rememberedValue();
                if (changed || rememberedValue4 == obj2) {
                    num = valueOf;
                    mutableState = collectAsState;
                    CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$1 = new CardAppletWorker$setup$1$2$1(this, mutableState, mutableState3, continuation3, 28);
                    loaded = null;
                    mutableState3 = mutableState3;
                    r13.updateRememberedValue(cardAppletWorker$setup$1$2$1);
                    rememberedValue4 = cardAppletWorker$setup$1$2$1;
                } else {
                    mutableState = collectAsState;
                    loaded = null;
                    num = valueOf;
                }
                Updater.LaunchedEffect(merchantIdentifier, num, (Function2) rememberedValue4, r13);
                PayHistoryListPresenter$DataState payHistoryListPresenter$DataState = (PayHistoryListPresenter$DataState) mutableState3.getValue();
                ?? r10 = payHistoryListPresenter$DataState instanceof PayHistoryListPresenter$DataState.Loaded ? (PayHistoryListPresenter$DataState.Loaded) payHistoryListPresenter$DataState : loaded;
                Object valueOf2 = r10 != 0 ? Boolean.valueOf(r10.isLoadingMore) : loaded;
                boolean changedInstance2 = r13.changedInstance(r10) | r13.changed(mutableState) | r13.changedInstance(this);
                Object rememberedValue5 = r13.rememberedValue();
                if (changedInstance2 || rememberedValue5 == obj2) {
                    loaded2 = r10;
                    obj = valueOf2;
                    TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2(loaded2, this, mutableState, mutableState3, null, 17);
                    mutableState2 = mutableState3;
                    r13.updateRememberedValue(takeUntil$collectSafely$2);
                    rememberedValue5 = takeUntil$collectSafely$2;
                } else {
                    mutableState2 = mutableState3;
                    loaded2 = r10;
                    obj = valueOf2;
                }
                Updater.LaunchedEffect((Composer) r13, obj, (Function2) rememberedValue5);
                boolean changed2 = r13.changed(loaded2 != null ? loaded2.nextOffset : loaded) | r13.changed(loaded2 != null ? loaded2.stubs : loaded) | r13.changed(loaded2 != null ? Boolean.valueOf(loaded2.isLoadingMore) : loaded);
                Object rememberedValue6 = r13.rememberedValue();
                if (changed2 || rememberedValue6 == obj2) {
                    if (loaded2 == null) {
                        payHistoryListViewModelMapper = payHistoryListViewModelMapper2;
                        str = name;
                        map = loaded;
                        taxAuthorizationPresenter = this;
                    } else {
                        List list = loaded2.stubs;
                        boolean z = loaded2.nextOffset != null;
                        boolean z2 = loaded2.isLoadingMore;
                        payHistoryListViewModelMapper = payHistoryListViewModelMapper2;
                        str = name;
                        taxAuthorizationPresenter = this;
                        map = payHistoryListViewModelMapper.map(collectSelectedMerchantViewModel, str, list, z, z2);
                    }
                    r13.updateRememberedValue(map);
                    rememberedValue6 = map;
                } else {
                    payHistoryListViewModelMapper = payHistoryListViewModelMapper2;
                    str = name;
                    taxAuthorizationPresenter = this;
                }
                PayHistoryListViewModel.Loaded loaded3 = (PayHistoryListViewModel.Loaded) rememberedValue6;
                PayHistoryListPresenter$DataState payHistoryListPresenter$DataState2 = (PayHistoryListPresenter$DataState) mutableState2.getValue();
                if (payHistoryListPresenter$DataState2 instanceof PayHistoryListPresenter$DataState.Loading) {
                    continuation = PayHistoryListViewModel.Loading.INSTANCE;
                } else {
                    if (!(payHistoryListPresenter$DataState2 instanceof PayHistoryListPresenter$DataState.Error)) {
                        if (!(payHistoryListPresenter$DataState2 instanceof PayHistoryListPresenter$DataState.Loaded)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation2;
                        }
                        loaded3.getClass();
                        collectSelectedMerchantViewModel.getClass();
                        String str2 = str == null ? (String) payHistoryListViewModelMapper.placeholder$delegate.getValue() : str;
                        List list2 = loaded3.sections;
                        boolean z3 = loaded3.isLoadingMore;
                        boolean z4 = loaded3.hasMoreItems;
                        str2.getClass();
                        continuation2 = new PayHistoryListViewModel.Loaded(collectSelectedMerchantViewModel, str2, list2, z3, z4);
                        r13.end(false);
                        return continuation2;
                    }
                    continuation = new PayHistoryListViewModel.Error(taxAuthorizationPresenter.stringManager.get(R.string.work_pay_history_error_load_failed));
                }
                continuation2 = continuation;
                r13.end(false);
                return continuation2;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck appService;
        public final Provider blockersDataNavigator;
        public final DoubleCheck flowStarter;
        public final LambdaProvider stringManager;
        public final DoubleCheck taxService;

        public MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3) {
            this.taxService = doubleCheck;
            this.blockersDataNavigator = metroFactory;
            this.flowStarter = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.appService = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider) {
            this.taxService = doubleCheck;
            this.blockersDataNavigator = metroFactory;
            this.flowStarter = doubleCheck2;
            this.appService = doubleCheck3;
            this.stringManager = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealKnotLauncher.MetroFactory metroFactory) {
            this.taxService = doubleCheck;
            this.stringManager = lambdaProvider;
            this.flowStarter = doubleCheck2;
            this.appService = doubleCheck3;
            this.blockersDataNavigator = metroFactory;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, Factory factory, DoubleCheck doubleCheck3) {
            this.taxService = doubleCheck;
            this.stringManager = lambdaProvider;
            this.flowStarter = doubleCheck2;
            this.blockersDataNavigator = factory;
            this.appService = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, ScoreUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck3) {
            this.taxService = doubleCheck;
            this.flowStarter = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.blockersDataNavigator = metroFactory;
            this.appService = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider) {
            this.taxService = doubleCheck;
            this.flowStarter = doubleCheck2;
            this.appService = doubleCheck3;
            this.blockersDataNavigator = metroFactory;
            this.stringManager = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory) {
            this.taxService = doubleCheck;
            this.flowStarter = doubleCheck2;
            this.appService = doubleCheck3;
            this.stringManager = lambdaProvider;
            this.blockersDataNavigator = metroFactory;
        }
    }

    public TaxAuthorizationPresenter(TaxClientService taxClientService, FlowStarter flowStarter, AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, TaxEnvironment taxEnvironment, TaxAuthorizationScreen taxAuthorizationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        taxAuthorizationScreen.getClass();
        this.taxService = taxClientService;
        this.flowStarter = flowStarter;
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.taxEnvironment = taxEnvironment;
        this.args = taxAuthorizationScreen;
        this.navigator = screenNavigator;
    }
}
