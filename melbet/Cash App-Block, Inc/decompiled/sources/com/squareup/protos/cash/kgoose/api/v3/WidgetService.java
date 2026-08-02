package com.squareup.protos.cash.kgoose.api.v3;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetService;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetResponse;", "addWidget", "(Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteWidgetRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteWidgetResponse;", "deleteWidget", "(Lcom/squareup/protos/cash/kgoose/api/v3/DeleteWidgetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListRenderedWidgetsRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListRenderedWidgetsResponse;", "listRenderedWidgets", "(Lcom/squareup/protos/cash/kgoose/api/v3/ListRenderedWidgetsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedResponse;", "markWidgetAsUsed", "(Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WidgetService {
    @POST("/cash-app/goose-cash/v3/add-widget")
    Object addWidget(@Body AddWidgetRequest addWidgetRequest, Continuation<? super ApiResult<AddWidgetResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/delete-widget")
    Object deleteWidget(@Body DeleteWidgetRequest deleteWidgetRequest, Continuation<? super ApiResult<DeleteWidgetResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/list-rendered-widgets")
    Object listRenderedWidgets(@Body ListRenderedWidgetsRequest listRenderedWidgetsRequest, Continuation<? super ApiResult<ListRenderedWidgetsResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/mark-widget-as-used")
    Object markWidgetAsUsed(@Body MarkWidgetAsUsedRequest markWidgetAsUsedRequest, Continuation<? super ApiResult<MarkWidgetAsUsedResponse>> continuation);
}
