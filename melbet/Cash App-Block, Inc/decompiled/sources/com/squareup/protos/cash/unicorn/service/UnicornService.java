package com.squareup.protos.cash.unicorn.service;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.unicorn.api.ComputeDisclosureSyncValueRequest;
import com.squareup.protos.cash.unicorn.api.ComputeDisclosureSyncValueResponse;
import com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueRequest;
import com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueResponse;
import com.squareup.protos.cash.unicorn.dismiss_badge.DismissBadgeRequest;
import com.squareup.protos.cash.unicorn.dismiss_badge.DismissBadgeResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/unicorn/service/UnicornService;", "", "computeDisclosureSyncValue", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/unicorn/api/ComputeDisclosureSyncValueResponse;", "request", "Lcom/squareup/protos/cash/unicorn/api/ComputeDisclosureSyncValueRequest;", "(Lcom/squareup/protos/cash/unicorn/api/ComputeDisclosureSyncValueRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeBankingTabSyncValue", "Lcom/squareup/protos/cash/unicorn/compute_banking_tab_sync_value/ComputeBankingTabSyncValueResponse;", "Lcom/squareup/protos/cash/unicorn/compute_banking_tab_sync_value/ComputeBankingTabSyncValueRequest;", "(Lcom/squareup/protos/cash/unicorn/compute_banking_tab_sync_value/ComputeBankingTabSyncValueRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissBadge", "Lcom/squareup/protos/cash/unicorn/dismiss_badge/DismissBadgeResponse;", "Lcom/squareup/protos/cash/unicorn/dismiss_badge/DismissBadgeRequest;", "(Lcom/squareup/protos/cash/unicorn/dismiss_badge/DismissBadgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface UnicornService {
    @POST("/cash-app/banking-tab/compute-banking-tab-sync-value")
    Object computeBankingTabSyncValue(@Body ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest, Continuation<? super ApiResult<ComputeBankingTabSyncValueResponse>> continuation);

    @POST("/cash-app/banking-tab/v1/compute-disclosure-sync-value")
    Object computeDisclosureSyncValue(@Body ComputeDisclosureSyncValueRequest computeDisclosureSyncValueRequest, Continuation<? super ApiResult<ComputeDisclosureSyncValueResponse>> continuation);

    @POST("/cash-app/banking-tab/dismiss-badge")
    Object dismissBadge(@Body DismissBadgeRequest dismissBadgeRequest, Continuation<? super ApiResult<DismissBadgeResponse>> continuation);
}
