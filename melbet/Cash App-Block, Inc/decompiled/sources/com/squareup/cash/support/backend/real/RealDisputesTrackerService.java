package com.squareup.cash.support.backend.real;

import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputeTrackerResult;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputesHistoryResult;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.disputron.core.ClaimResolutionStatus;
import com.squareup.protos.cash.disputron.core.DisputeService;
import com.squareup.protos.cash.disputron.core.GetClaimResolutionStatisticsRequest;
import com.squareup.protos.cash.disputron.core.GetClaimResolutionStatisticsResponse;
import com.squareup.protos.cash.disputron.core.ListClaimDSL3Data;
import com.squareup.protos.cash.disputron.core.ListClaimResolutionStatusesRequest;
import com.squareup.protos.cash.disputron.core.ListClaimResolutionStatusesResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealDisputesTrackerService {
    public DisputesTrackerService$DisputesHistoryResult.Success cachedDisputesHistory;
    public final DisputeService disputeService;
    public List disputesCache;
    public final ErrorReporter errorReporter;
    public String nextPageOffset;
    public final AndroidStringManager stringManager;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/support/backend/real/RealDisputesTrackerService$DisputeDataMappingError", "Lcom/squareup/cash/observability/types/ReportedError;", "jvm"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class DisputeDataMappingError extends ReportedError {
        public final String message;
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Support.INSTANCE);
        public final Map metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("", Thread$State$EnumUnboxingLocalUtility.m("owner_id", "#cash-support-android"));

        public DisputeDataMappingError(String str) {
            this.message = str;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    public RealDisputesTrackerService(DisputeService disputeService, AndroidStringManager androidStringManager, ErrorReporter errorReporter) {
        this.disputeService = disputeService;
        this.stringManager = androidStringManager;
        this.errorReporter = errorReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDisputesHistory(ContinuationImpl continuationImpl) {
        RealDisputesTrackerService$getDisputesHistory$1 realDisputesTrackerService$getDisputesHistory$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealDisputesTrackerService$getDisputesHistory$1) {
            realDisputesTrackerService$getDisputesHistory$1 = (RealDisputesTrackerService$getDisputesHistory$1) continuationImpl;
            int i2 = realDisputesTrackerService$getDisputesHistory$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDisputesTrackerService$getDisputesHistory$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDisputesTrackerService$getDisputesHistory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDisputesTrackerService$getDisputesHistory$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetClaimResolutionStatisticsRequest getClaimResolutionStatisticsRequest = new GetClaimResolutionStatisticsRequest(ByteString.EMPTY);
                    realDisputesTrackerService$getDisputesHistory$1.label = 1;
                    obj = this.disputeService.getClaimResolutionStatistics(getClaimResolutionStatisticsRequest, realDisputesTrackerService$getDisputesHistory$1);
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
                    if (apiResult instanceof ApiResult.Failure) {
                        return new DisputesTrackerService$DisputesHistoryResult.Failure(DisputesTrackerService$DisputesHistoryResult.Failure.ErrorType.NETWORK_ERROR);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetClaimResolutionStatisticsResponse getClaimResolutionStatisticsResponse = (GetClaimResolutionStatisticsResponse) ((ApiResult.Success) apiResult).response;
                Integer num = getClaimResolutionStatisticsResponse.total_claims;
                if (num == null || getClaimResolutionStatisticsResponse.active_claims == null) {
                    this.errorReporter.report(new DisputeDataMappingError("Unable to map disputes statistics from response"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    return new DisputesTrackerService$DisputesHistoryResult.Failure(DisputesTrackerService$DisputesHistoryResult.Failure.ErrorType.INVALID_SERVER_RESPONSE);
                }
                num.getClass();
                int intValue = num.intValue();
                Integer num2 = getClaimResolutionStatisticsResponse.active_claims;
                num2.getClass();
                DisputesTrackerService$DisputesHistoryResult.Success success = new DisputesTrackerService$DisputesHistoryResult.Success(intValue, num2.intValue());
                this.cachedDisputesHistory = success;
                return success;
            }
        }
        realDisputesTrackerService$getDisputesHistory$1 = new RealDisputesTrackerService$getDisputesHistory$1(this, continuationImpl);
        Object obj2 = realDisputesTrackerService$getDisputesHistory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDisputesTrackerService$getDisputesHistory$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDisputesList(boolean z, ContinuationImpl continuationImpl) {
        RealDisputesTrackerService$getDisputesList$1 realDisputesTrackerService$getDisputesList$1;
        int i;
        List list;
        boolean z2;
        List list2;
        boolean z3;
        if (continuationImpl instanceof RealDisputesTrackerService$getDisputesList$1) {
            realDisputesTrackerService$getDisputesList$1 = (RealDisputesTrackerService$getDisputesList$1) continuationImpl;
            int i2 = realDisputesTrackerService$getDisputesList$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDisputesTrackerService$getDisputesList$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDisputesTrackerService$getDisputesList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDisputesTrackerService$getDisputesList$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        this.disputesCache = null;
                        this.nextPageOffset = null;
                    }
                    if (this.nextPageOffset == null && !z && (list = this.disputesCache) != null) {
                        return new DisputesTrackerService$DisputeTrackerResult.Success(list, false);
                    }
                    String str = this.nextPageOffset;
                    Long l = new Long(15L);
                    ByteString byteString = ByteString.EMPTY;
                    ListClaimResolutionStatusesRequest listClaimResolutionStatusesRequest = new ListClaimResolutionStatusesRequest(new Pagination(str, l, byteString), null, byteString);
                    realDisputesTrackerService$getDisputesList$1.Z$0 = z;
                    realDisputesTrackerService$getDisputesList$1.label = 1;
                    obj = this.disputeService.listClaimResolutionStatuses(listClaimResolutionStatusesRequest, realDisputesTrackerService$getDisputesList$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = realDisputesTrackerService$getDisputesList$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z2 = apiResult instanceof ApiResult.Success;
                AndroidStringManager androidStringManager = this.stringManager;
                if (z2) {
                    if (apiResult instanceof ApiResult.Failure) {
                        ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null);
                        return new DisputesTrackerService$DisputeTrackerResult.Failure(errorMessaging.title, errorMessaging.message, DisputesTrackerService$DisputeTrackerResult.Failure.ErrorType.NETWORK_ERROR);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ListClaimResolutionStatusesResponse listClaimResolutionStatusesResponse = (ListClaimResolutionStatusesResponse) ((ApiResult.Success) apiResult).response;
                List list3 = listClaimResolutionStatusesResponse.statuses;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    ClaimResolutionStatus claimResolutionStatus = (ClaimResolutionStatus) obj2;
                    if (claimResolutionStatus.status != null && claimResolutionStatus.transaction_token != null && claimResolutionStatus.claim_token != null) {
                        ListClaimDSL3Data listClaimDSL3Data = claimResolutionStatus.dsl3_data;
                        if ((listClaimDSL3Data != null ? listClaimDSL3Data.counterparty_name : null) != null && claimResolutionStatus.amount != null && claimResolutionStatus.claim_submitted_at != null) {
                            z3 = true;
                            if (!z3) {
                                this.errorReporter.report(new DisputeDataMappingError("Invalid dispute item: Missing required fields"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                            }
                            if (!z3) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    z3 = false;
                    if (!z3) {
                    }
                    if (!z3) {
                    }
                }
                if (arrayList.isEmpty() && !listClaimResolutionStatusesResponse.statuses.isEmpty()) {
                    return new DisputesTrackerService$DisputeTrackerResult.Failure(androidStringManager.get(R.string.disputes_tracker_invalid_server_response_title), androidStringManager.get(R.string.disputes_tracker_invalid_server_response_body), DisputesTrackerService$DisputeTrackerResult.Failure.ErrorType.INVALID_SERVER_RESPONSE);
                }
                this.nextPageOffset = listClaimResolutionStatusesResponse.next;
                if (z) {
                    list2 = new ArrayList();
                } else {
                    list2 = this.disputesCache;
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                }
                list2.addAll(arrayList);
                this.disputesCache = list2;
                return new DisputesTrackerService$DisputeTrackerResult.Success(list2, this.nextPageOffset != null);
            }
        }
        realDisputesTrackerService$getDisputesList$1 = new RealDisputesTrackerService$getDisputesList$1(this, continuationImpl);
        Object obj3 = realDisputesTrackerService$getDisputesList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDisputesTrackerService$getDisputesList$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj3;
        z2 = apiResult2 instanceof ApiResult.Success;
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (z2) {
        }
    }
}
