package com.squareup.cash.work.service.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/service/api/LoginEssentialsService;", "", "getLoginEssentials", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/work/service/api/EssentialsResponse;", "includeLocations", "", "includeJobs", "includeSettings", "includeJobAssignments", "includeInactiveLocations", "(ZZZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LoginEssentialsService {
    @GET("/proxy/1.0/teamapp/api/login/essentials")
    Object getLoginEssentials(@Query("includeLocations") boolean z, @Query("includeJobs") boolean z2, @Query("includeSettings") boolean z3, @Query("includeJobAssignments") boolean z4, @Query("includeInactiveLocations") boolean z5, Continuation<? super ApiResult<EssentialsResponse>> continuation);
}
