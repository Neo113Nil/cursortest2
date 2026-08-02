package com.squareup.cash.work.data.real;

import app.cash.api.ApiResult;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.work.data.api.PayDataLoader;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.payroll.PayStubsResponse;
import com.squareup.cash.work.service.api.payroll.PayrollJsonService;
import com.squareup.cash.work.service.api.payroll.PayrollService;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.protos.payroll.service.GetEmployeeAccessDetailsRequest;
import com.squareup.protos.payroll.service.GetEmployeeAccessDetailsResponse;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewRequest;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewResponse;
import com.squareup.protos.timecards.GetShiftsOverviewRequest;
import com.squareup.protos.timecards.GetShiftsOverviewRequest$DateTime$IncludedDateTime;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPayDataLoader implements PayDataLoader {
    public final AndroidClock clock;
    public final RealLocaleManager localeManager;
    public final RealMerchantRepository merchantRepository;
    public final PayrollJsonService payrollJsonService;
    public final PayrollService payrollService;
    public final ChannelFlowBuilder refreshEvents;
    public final SharedFlowImpl refreshTrigger;
    public final CoroutineScope scope;
    public final Lazy sharedState$delegate;
    public final TimecardsService timecardsService;

    public final class Identity {
        public final MerchantIdentifier merchantIdentifier;
        public final String teamMemberId;

        public Identity(MerchantIdentifier merchantIdentifier, String str) {
            this.merchantIdentifier = merchantIdentifier;
            this.teamMemberId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Identity)) {
                return false;
            }
            Identity identity = (Identity) obj;
            return Intrinsics.areEqual(this.merchantIdentifier, identity.merchantIdentifier) && Intrinsics.areEqual(this.teamMemberId, identity.teamMemberId);
        }

        public final int hashCode() {
            MerchantIdentifier merchantIdentifier = this.merchantIdentifier;
            int hashCode = (merchantIdentifier == null ? 0 : merchantIdentifier.token.hashCode()) * 31;
            String str = this.teamMemberId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Identity(merchantIdentifier=" + this.merchantIdentifier + ", teamMemberId=" + this.teamMemberId + ")";
        }
    }

    public final class RequestMetadata {
        public final String acceptLanguage;
        public final String includedDateTime;
        public final String merchantToken;

        public RequestMetadata(String str, String str2, String str3) {
            str.getClass();
            str3.getClass();
            this.merchantToken = str;
            this.includedDateTime = str2;
            this.acceptLanguage = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestMetadata)) {
                return false;
            }
            RequestMetadata requestMetadata = (RequestMetadata) obj;
            return Intrinsics.areEqual(this.merchantToken, requestMetadata.merchantToken) && this.includedDateTime.equals(requestMetadata.includedDateTime) && Intrinsics.areEqual(this.acceptLanguage, requestMetadata.acceptLanguage);
        }

        public final int hashCode() {
            return this.acceptLanguage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.merchantToken.hashCode() * 31, 31, this.includedDateTime);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RequestMetadata(merchantToken=", this.merchantToken, ", includedDateTime=", this.includedDateTime, ", acceptLanguage="), this.acceptLanguage, ")");
        }
    }

    public RealPayDataLoader(RealPullToRefreshTrigger realPullToRefreshTrigger, RealTeamMemberIdProvider realTeamMemberIdProvider, RealSelectedMerchantProvider realSelectedMerchantProvider, TimecardsService timecardsService, PayrollService payrollService, PayrollJsonService payrollJsonService, RealMerchantRepository realMerchantRepository, RealLocaleManager realLocaleManager, AndroidClock androidClock, CoroutineScope coroutineScope) {
        this.timecardsService = timecardsService;
        this.payrollService = payrollService;
        this.payrollJsonService = payrollJsonService;
        this.merchantRepository = realMerchantRepository;
        this.localeManager = realLocaleManager;
        this.clock = androidClock;
        this.scope = coroutineScope;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, null, 5);
        this.refreshTrigger = MutableSharedFlow$default;
        this.refreshEvents = FlowKt.merge(new AppLockMonitor$special$$inlined$map$2(Unit.INSTANCE, 19), MutableSharedFlow$default, realPullToRefreshTrigger.events);
        this.sharedState$delegate = LazyKt.lazy(new HeroCardViewKt$$ExternalSyntheticLambda9(10, realSelectedMerchantProvider, realTeamMemberIdProvider, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchCanUseDirectDeposit(RealPayDataLoader realPayDataLoader, String str, ContinuationImpl continuationImpl) {
        RealPayDataLoader$fetchCanUseDirectDeposit$1 realPayDataLoader$fetchCanUseDirectDeposit$1;
        int i;
        if (continuationImpl instanceof RealPayDataLoader$fetchCanUseDirectDeposit$1) {
            realPayDataLoader$fetchCanUseDirectDeposit$1 = (RealPayDataLoader$fetchCanUseDirectDeposit$1) continuationImpl;
            int i2 = realPayDataLoader$fetchCanUseDirectDeposit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPayDataLoader$fetchCanUseDirectDeposit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPayDataLoader$fetchCanUseDirectDeposit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPayDataLoader$fetchCanUseDirectDeposit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str == null) {
                        return Boolean.FALSE;
                    }
                    GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest = new GetEmployeeAccessDetailsRequest(str, ByteString.EMPTY);
                    PayrollService payrollService = realPayDataLoader.payrollService;
                    realPayDataLoader$fetchCanUseDirectDeposit$1.label = 1;
                    obj = payrollService.getEmployeeAccessDetails(getEmployeeAccessDetailsRequest, realPayDataLoader$fetchCanUseDirectDeposit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse = (GetEmployeeAccessDetailsResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                return Boolean.valueOf(getEmployeeAccessDetailsResponse == null ? Intrinsics.areEqual(getEmployeeAccessDetailsResponse.can_use_direct_deposit, Boolean.TRUE) : false);
            }
        }
        realPayDataLoader$fetchCanUseDirectDeposit$1 = new RealPayDataLoader$fetchCanUseDirectDeposit$1(realPayDataLoader, continuationImpl);
        Object obj2 = realPayDataLoader$fetchCanUseDirectDeposit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPayDataLoader$fetchCanUseDirectDeposit$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        GetEmployeeAccessDetailsResponse getEmployeeAccessDetailsResponse2 = (GetEmployeeAccessDetailsResponse) (apiResult2 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult2).response : null);
        return Boolean.valueOf(getEmployeeAccessDetailsResponse2 == null ? Intrinsics.areEqual(getEmployeeAccessDetailsResponse2.can_use_direct_deposit, Boolean.TRUE) : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchPastPayStubs(RealPayDataLoader realPayDataLoader, String str, ContinuationImpl continuationImpl) {
        RealPayDataLoader$fetchPastPayStubs$1 realPayDataLoader$fetchPastPayStubs$1;
        int i;
        if (continuationImpl instanceof RealPayDataLoader$fetchPastPayStubs$1) {
            realPayDataLoader$fetchPastPayStubs$1 = (RealPayDataLoader$fetchPastPayStubs$1) continuationImpl;
            int i2 = realPayDataLoader$fetchPastPayStubs$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPayDataLoader$fetchPastPayStubs$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealPayDataLoader$fetchPastPayStubs$1 realPayDataLoader$fetchPastPayStubs$12 = realPayDataLoader$fetchPastPayStubs$1;
                Object obj = realPayDataLoader$fetchPastPayStubs$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPayDataLoader$fetchPastPayStubs$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PayrollJsonService payrollJsonService = realPayDataLoader.payrollJsonService;
                    SquareMerchantToken squareMerchantToken = new SquareMerchantToken(str);
                    Integer num = new Integer(4);
                    realPayDataLoader$fetchPastPayStubs$12.label = 1;
                    obj = payrollJsonService.getTeamStubs(str, squareMerchantToken, num, null, "DESC", realPayDataLoader$fetchPastPayStubs$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                PayStubsResponse payStubsResponse = (PayStubsResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                List list = payStubsResponse != null ? payStubsResponse.data : null;
                return list != null ? EmptyList.INSTANCE : list;
            }
        }
        realPayDataLoader$fetchPastPayStubs$1 = new RealPayDataLoader$fetchPastPayStubs$1(realPayDataLoader, continuationImpl);
        RealPayDataLoader$fetchPastPayStubs$1 realPayDataLoader$fetchPastPayStubs$122 = realPayDataLoader$fetchPastPayStubs$1;
        Object obj2 = realPayDataLoader$fetchPastPayStubs$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPayDataLoader$fetchPastPayStubs$122.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        PayStubsResponse payStubsResponse2 = (PayStubsResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (payStubsResponse2 != null) {
        }
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$fetchPayrollOverview(RealPayDataLoader realPayDataLoader, String str, ContinuationImpl continuationImpl) {
        RealPayDataLoader$fetchPayrollOverview$1 realPayDataLoader$fetchPayrollOverview$1;
        int i;
        if (continuationImpl instanceof RealPayDataLoader$fetchPayrollOverview$1) {
            realPayDataLoader$fetchPayrollOverview$1 = (RealPayDataLoader$fetchPayrollOverview$1) continuationImpl;
            int i2 = realPayDataLoader$fetchPayrollOverview$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPayDataLoader$fetchPayrollOverview$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPayDataLoader$fetchPayrollOverview$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPayDataLoader$fetchPayrollOverview$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str == null) {
                        return new GetEmployeePayrollOverviewResponse();
                    }
                    GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest = new GetEmployeePayrollOverviewRequest(str, GetEmployeePayrollOverviewRequest.APIVersion.V2, ByteString.EMPTY);
                    PayrollService payrollService = realPayDataLoader.payrollService;
                    realPayDataLoader$fetchPayrollOverview$1.label = 1;
                    obj = payrollService.getEmployeePayrollOverview(getEmployeePayrollOverviewRequest, realPayDataLoader$fetchPayrollOverview$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                return getEmployeePayrollOverviewResponse != null ? new GetEmployeePayrollOverviewResponse() : getEmployeePayrollOverviewResponse;
            }
        }
        realPayDataLoader$fetchPayrollOverview$1 = new RealPayDataLoader$fetchPayrollOverview$1(realPayDataLoader, continuationImpl);
        Object obj2 = realPayDataLoader$fetchPayrollOverview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPayDataLoader$fetchPayrollOverview$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse2 = (GetEmployeePayrollOverviewResponse) (apiResult2 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult2).response : null);
        if (getEmployeePayrollOverviewResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchShiftsOverview(RealPayDataLoader realPayDataLoader, RequestMetadata requestMetadata, ContinuationImpl continuationImpl) {
        RealPayDataLoader$fetchShiftsOverview$1 realPayDataLoader$fetchShiftsOverview$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPayDataLoader$fetchShiftsOverview$1) {
            realPayDataLoader$fetchShiftsOverview$1 = (RealPayDataLoader$fetchShiftsOverview$1) continuationImpl;
            int i2 = realPayDataLoader$fetchShiftsOverview$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPayDataLoader$fetchShiftsOverview$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPayDataLoader$fetchShiftsOverview$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPayDataLoader$fetchShiftsOverview$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetShiftsOverviewRequest getShiftsOverviewRequest = new GetShiftsOverviewRequest(new GetShiftsOverviewRequest$DateTime$IncludedDateTime(requestMetadata.includedDateTime), requestMetadata.merchantToken, null, GetShiftsOverviewRequest.APIVersion.V2, ByteString.EMPTY);
                    TimecardsService timecardsService = realPayDataLoader.timecardsService;
                    String str = requestMetadata.acceptLanguage;
                    realPayDataLoader$fetchShiftsOverview$1.label = 1;
                    obj = timecardsService.getShiftsOverview(getShiftsOverviewRequest, str, realPayDataLoader$fetchShiftsOverview$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return null;
                }
                return ((ApiResult.Success) apiResult).response;
            }
        }
        realPayDataLoader$fetchShiftsOverview$1 = new RealPayDataLoader$fetchShiftsOverview$1(realPayDataLoader, continuationImpl);
        Object obj2 = realPayDataLoader$fetchShiftsOverview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPayDataLoader$fetchShiftsOverview$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$hasPayrollFeatures(RealPayDataLoader realPayDataLoader, MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealPayDataLoader$hasPayrollFeatures$1 realPayDataLoader$hasPayrollFeatures$1;
        int i;
        Map map;
        Merchant.Subscription subscription;
        if (continuationImpl instanceof RealPayDataLoader$hasPayrollFeatures$1) {
            realPayDataLoader$hasPayrollFeatures$1 = (RealPayDataLoader$hasPayrollFeatures$1) continuationImpl;
            int i2 = realPayDataLoader$hasPayrollFeatures$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPayDataLoader$hasPayrollFeatures$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPayDataLoader$hasPayrollFeatures$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPayDataLoader$hasPayrollFeatures$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow byId = realPayDataLoader.merchantRepository.getById(merchantIdentifier.entityId);
                    realPayDataLoader$hasPayrollFeatures$1.label = 1;
                    obj = FlowKt.first(byId, realPayDataLoader$hasPayrollFeatures$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Merchant merchant = (Merchant) obj;
                return Boolean.valueOf((merchant != null || (map = merchant.subscriptions) == null || (subscription = (Merchant.Subscription) map.get(Merchant.SubscriptionProduct.PAYROLL)) == null) ? false : Intrinsics.areEqual(subscription.isEnabled, Boolean.TRUE));
            }
        }
        realPayDataLoader$hasPayrollFeatures$1 = new RealPayDataLoader$hasPayrollFeatures$1(realPayDataLoader, continuationImpl);
        Object obj2 = realPayDataLoader$hasPayrollFeatures$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPayDataLoader$hasPayrollFeatures$1.label;
        if (i != 0) {
        }
        Merchant merchant2 = (Merchant) obj2;
        return Boolean.valueOf((merchant2 != null || (map = merchant2.subscriptions) == null || (subscription = (Merchant.Subscription) map.get(Merchant.SubscriptionProduct.PAYROLL)) == null) ? false : Intrinsics.areEqual(subscription.isEnabled, Boolean.TRUE));
    }

    public static final Object access$loadPayData(RealPayDataLoader realPayDataLoader, MerchantIdentifier merchantIdentifier, String str, boolean z, RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$1) {
        String str2 = merchantIdentifier.token;
        AndroidClock androidClock = realPayDataLoader.clock;
        String format2 = LocalDateTime.ofInstant(DimensionKt.now(androidClock), androidClock.timeZone().toZoneId()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        format2.getClass();
        String languageTag = ((Locale) realPayDataLoader.localeManager.resolvedLocale.$$delegate_0.getValue()).toLanguageTag();
        languageTag.getClass();
        return JobKt.coroutineScope(new RealPayDataLoader$loadPayData$2(z, realPayDataLoader, new RequestMetadata(str2, format2, languageTag), str, str2, null), realPayDataLoader$fetchData$1);
    }
}
