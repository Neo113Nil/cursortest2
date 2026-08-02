package com.squareup.protos.cash.incidentalerts.app.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/incidentalerts/app/v1/IncidentAlertsService;", "", "getIncidentsList", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentsListResponse;", "request", "Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentsListRequest;", "(Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentsListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIncident", "Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentResponse;", "Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentRequest;", "(Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeToIncident", "Lcom/squareup/protos/cash/incidentalerts/app/v1/SubscribeToIncidentResponse;", "Lcom/squareup/protos/cash/incidentalerts/app/v1/SubscribeToIncidentRequest;", "(Lcom/squareup/protos/cash/incidentalerts/app/v1/SubscribeToIncidentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribeFromIncident", "Lcom/squareup/protos/cash/incidentalerts/app/v1/UnsubscribeFromIncidentResponse;", "Lcom/squareup/protos/cash/incidentalerts/app/v1/UnsubscribeFromIncidentRequest;", "(Lcom/squareup/protos/cash/incidentalerts/app/v1/UnsubscribeFromIncidentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IncidentAlertsService {
    @POST("/cash-app/incident-alerts/get-incident")
    Object getIncident(@Body GetIncidentRequest getIncidentRequest, Continuation<? super ApiResult<GetIncidentResponse>> continuation);

    @POST("/cash-app/incident-alerts/get-incidents")
    Object getIncidentsList(@Body GetIncidentsListRequest getIncidentsListRequest, Continuation<? super ApiResult<GetIncidentsListResponse>> continuation);

    @POST("/cash-app/incident-alerts/subscribe-to-incident")
    Object subscribeToIncident(@Body SubscribeToIncidentRequest subscribeToIncidentRequest, Continuation<? super ApiResult<SubscribeToIncidentResponse>> continuation);

    @POST("/cash-app/incident-alerts/unsubscribe-from-incident")
    Object unsubscribeFromIncident(@Body UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest, Continuation<? super ApiResult<UnsubscribeFromIncidentResponse>> continuation);
}
