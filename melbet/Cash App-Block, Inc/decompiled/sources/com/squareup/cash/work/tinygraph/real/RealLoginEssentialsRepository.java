package com.squareup.cash.work.tinygraph.real;

import app.cash.api.ApiResult;
import app.cash.local.presenters.brand.menu.OrderLimitToasts;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.service.api.EssentialsResponse;
import com.squareup.cash.work.service.api.LoginEssentialsService;
import com.squareup.cash.work.tinygraph.EntityStore;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealLoginEssentialsRepository {
    public final StateFlowImpl _isLoading = FlowKt.MutableStateFlow(Boolean.FALSE);
    public final EntityStore entityStore;
    public final LoginEssentialsService loginEssentialsService;

    public RealLoginEssentialsRepository(LoginEssentialsService loginEssentialsService, EntityStore entityStore) {
        this.loginEssentialsService = loginEssentialsService;
        this.entityStore = entityStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:11:0x002d, B:12:0x005a, B:14:0x0060, B:18:0x0076, B:20:0x007a, B:21:0x0089, B:23:0x008d, B:25:0x009b, B:28:0x00a5, B:30:0x00c2, B:31:0x00c7, B:35:0x004a), top: B:8:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:11:0x002d, B:12:0x005a, B:14:0x0060, B:18:0x0076, B:20:0x007a, B:21:0x0089, B:23:0x008d, B:25:0x009b, B:28:0x00a5, B:30:0x00c2, B:31:0x00c7, B:35:0x004a), top: B:8:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchEssentials(ContinuationImpl continuationImpl) {
        RealLoginEssentialsRepository$fetchEssentials$1 realLoginEssentialsRepository$fetchEssentials$1;
        int i;
        StateFlowImpl stateFlowImpl;
        ApiResult apiResult;
        try {
            try {
                if (continuationImpl instanceof RealLoginEssentialsRepository$fetchEssentials$1) {
                    realLoginEssentialsRepository$fetchEssentials$1 = (RealLoginEssentialsRepository$fetchEssentials$1) continuationImpl;
                    int i2 = realLoginEssentialsRepository$fetchEssentials$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        realLoginEssentialsRepository$fetchEssentials$1.label = i2 - PKIFailureInfo.systemUnavail;
                        RealLoginEssentialsRepository$fetchEssentials$1 realLoginEssentialsRepository$fetchEssentials$12 = realLoginEssentialsRepository$fetchEssentials$1;
                        Object obj = realLoginEssentialsRepository$fetchEssentials$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realLoginEssentialsRepository$fetchEssentials$12.label;
                        stateFlowImpl = this._isLoading;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Boolean bool = Boolean.TRUE;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, bool);
                            LoginEssentialsService loginEssentialsService = this.loginEssentialsService;
                            realLoginEssentialsRepository$fetchEssentials$12.label = 1;
                            obj = loginEssentialsService.getLoginEssentials(true, true, true, true, false, realLoginEssentialsRepository$fetchEssentials$12);
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
                        if (!(apiResult instanceof ApiResult.Success)) {
                            OrderLimitToasts.ingestEssentialsResponse(this.entityStore, (EssentialsResponse) ((ApiResult.Success) apiResult).response);
                            Timber.Forest.d("Successfully fetched and ingested login essentials", new Object[0]);
                        } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                            Timber.Forest.w("Request failed due to network error", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Timber.Forest forest = Timber.Forest;
                            int i3 = ((ApiResult.Failure.HttpFailure) apiResult).code;
                            String str = ((ApiResult.Failure.HttpFailure) apiResult).errorBody;
                            String concat = str != null ? ": ".concat(str) : null;
                            if (concat == null) {
                                concat = "";
                            }
                            forest.w("Request failed with code " + i3 + concat, new Object[0]);
                        }
                        Boolean bool2 = Boolean.FALSE;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool2);
                        return apiResult;
                    }
                }
                if (i != 0) {
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                }
                Boolean bool22 = Boolean.FALSE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool22);
                return apiResult;
            } catch (Exception e) {
                Timber.Forest.e("Failed to fetch login essentials", new Object[0], e);
                throw e;
            }
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool3);
            throw th;
        }
        realLoginEssentialsRepository$fetchEssentials$1 = new RealLoginEssentialsRepository$fetchEssentials$1(this, continuationImpl);
        RealLoginEssentialsRepository$fetchEssentials$1 realLoginEssentialsRepository$fetchEssentials$122 = realLoginEssentialsRepository$fetchEssentials$1;
        Object obj2 = realLoginEssentialsRepository$fetchEssentials$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLoginEssentialsRepository$fetchEssentials$122.label;
        stateFlowImpl = this._isLoading;
    }
}
