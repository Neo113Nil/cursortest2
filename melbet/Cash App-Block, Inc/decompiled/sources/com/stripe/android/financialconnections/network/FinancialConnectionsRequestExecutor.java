package com.stripe.android.financialconnections.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.model.UserFacingEventResponse;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsRequestExecutor {
    public final ToolbarTuckTargets eventEmitter;
    public final Json json;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final DefaultStripeNetworkClient stripeNetworkClient;

    public FinancialConnectionsRequestExecutor(DefaultStripeNetworkClient defaultStripeNetworkClient, ToolbarTuckTargets toolbarTuckTargets, Json json, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        defaultStripeNetworkClient.getClass();
        toolbarTuckTargets.getClass();
        json.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.stripeNetworkClient = defaultStripeNetworkClient;
        this.eventEmitter = toolbarTuckTargets;
        this.json = json;
        this.logger = logger$Companion$NOOP_LOGGER$1;
    }

    public static void handleApiError(StripeResponse stripeResponse) {
        RequestId requestId = stripeResponse.requestId;
        String str = requestId != null ? requestId.value : null;
        int i = stripeResponse.code;
        StripeError parse = KClasses$$Lambda$1.parse(JsonUtilsKt.responseJson(stripeResponse));
        if (i != 202) {
            if (i == 429) {
                throw new RateLimitException(parse, str);
            }
            if (i != 400) {
                if (i == 401) {
                    throw new AuthenticationException(HttpStatusCode.UNAUTHORIZED_401, 24, parse, str, null, null);
                }
                if (i == 403) {
                    throw new PermissionException(403, 24, parse, str, null, null);
                }
                if (i != 404) {
                    throw new APIException(i, 24, parse, str, null, null);
                }
            }
        }
        throw new InvalidRequestException(i, 24, parse, str, null, null);
    }

    public final Object execute(ApiRequest apiRequest, KSerializer kSerializer, Continuation continuation) {
        return executeInternal(apiRequest, new HeroCardViewKt$$ExternalSyntheticLambda0(24, this, kSerializer), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:76|77))(3:78|79|(1:81))|12|13|(13:15|(3:69|70|(10:72|(1:68)(1:23)|(7:25|(4:28|(3:30|31|32)(1:34)|33|26)|35|36|(2:39|37)|40|41)(1:67)|42|43|(1:45)|46|(1:48)|49|(1:(2:52|(2:54|55)(2:57|58))(2:59|60))(2:61|62)))|17|(1:19)|68|(0)(0)|42|43|(0)|46|(0)|49|(0)(0))(2:73|74)))|84|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x002e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0070, code lost:
    
        r0 = kotlin.Result.Companion;
        r11 = new kotlin.Result.Failure(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:70:0x008d, B:72:0x0099, B:19:0x00a3, B:21:0x00ab, B:25:0x00b5, B:26:0x00d6, B:28:0x00dc, B:31:0x00e8, B:36:0x00ee, B:37:0x00f2, B:39:0x00f8, B:41:0x0124), top: B:69:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeInternal(ApiRequest apiRequest, Function1 function1, Continuation continuation) {
        FinancialConnectionsRequestExecutor$executeInternal$1 financialConnectionsRequestExecutor$executeInternal$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object failure;
        Throwable m4120exceptionOrNullimpl2;
        String str;
        Unit unit;
        if (continuation instanceof FinancialConnectionsRequestExecutor$executeInternal$1) {
            financialConnectionsRequestExecutor$executeInternal$1 = (FinancialConnectionsRequestExecutor$executeInternal$1) continuation;
            int i2 = financialConnectionsRequestExecutor$executeInternal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsRequestExecutor$executeInternal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsRequestExecutor$executeInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsRequestExecutor$executeInternal$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    this.logger.debug("Executing " + apiRequest.method.code + " request to " + apiRequest.getUrl());
                    DefaultStripeNetworkClient defaultStripeNetworkClient = this.stripeNetworkClient;
                    financialConnectionsRequestExecutor$executeInternal$1.L$0 = apiRequest;
                    financialConnectionsRequestExecutor$executeInternal$1.L$1 = function1;
                    financialConnectionsRequestExecutor$executeInternal$1.label = 1;
                    obj = defaultStripeNetworkClient.executeRequest(apiRequest, financialConnectionsRequestExecutor$executeInternal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = financialConnectionsRequestExecutor$executeInternal$1.L$1;
                    apiRequest = financialConnectionsRequestExecutor$executeInternal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Object failure2 = (StripeResponse) obj;
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl == null) {
                    throw new APIConnectionException("Failed to execute " + apiRequest, m4120exceptionOrNullimpl);
                }
                StripeResponse stripeResponse = (StripeResponse) failure2;
                ToolbarTuckTargets toolbarTuckTargets = this.eventEmitter;
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) toolbarTuckTargets.endCornerCenterX$delegate;
                stripeResponse.getClass();
                boolean z = stripeResponse.isError;
                if (z) {
                    try {
                        optJSONObject = JsonUtilsKt.responseJson(stripeResponse).optJSONObject(BreadcrumbHelper.Category.ERROR);
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    if (optJSONObject != null) {
                        optJSONObject2 = optJSONObject.optJSONObject("extra_fields");
                        if (optJSONObject2 != null || (str = optJSONObject2.optString("events_to_emit")) == null || str.length() <= 0) {
                            str = null;
                        }
                        if (str == null) {
                            Json json = (Json) toolbarTuckTargets.startCornerCenterX$delegate;
                            KSerializer serializer = UserFacingEventResponse.Companion.serializer();
                            serializer.getClass();
                            Iterable iterable = (Iterable) json.decodeFromString(str, new HashSetSerializer(serializer, 1));
                            ArrayList arrayList = new ArrayList();
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                FinancialConnectionsEvent event = toolbarTuckTargets.toEvent((UserFacingEventResponse) it.next());
                                if (event != null) {
                                    arrayList.add(event);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                FinancialConnectionsEvent financialConnectionsEvent = (FinancialConnectionsEvent) it2.next();
                                FinancialConnectionsEvent.Name name = financialConnectionsEvent.name;
                                FinancialConnectionsEvent.Metadata metadata = financialConnectionsEvent.metadata;
                                logger$Companion$NOOP_LOGGER$1.debug("Emitting event " + name + " with metadata " + metadata);
                                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(financialConnectionsEvent.name, metadata);
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        failure = unit;
                        m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl2 != null) {
                            logger$Companion$NOOP_LOGGER$1.error("Error decoding event response", m4120exceptionOrNullimpl2);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        if (stripeResponse.code != 202) {
                            handleApiError(stripeResponse);
                            throw null;
                        }
                        if (z) {
                            handleApiError(stripeResponse);
                            throw null;
                        }
                        Object obj2 = stripeResponse.body;
                        if (obj2 != null) {
                            return function1.invoke(obj2);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                }
                optJSONObject2 = null;
                if (optJSONObject2 != null) {
                }
                str = null;
                if (str == null) {
                }
                failure = unit;
                m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl2 != null) {
                }
                if (failure instanceof Result.Failure) {
                }
                if (stripeResponse.code != 202) {
                }
            }
        }
        financialConnectionsRequestExecutor$executeInternal$1 = new FinancialConnectionsRequestExecutor$executeInternal$1(this, continuation);
        Object obj3 = financialConnectionsRequestExecutor$executeInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsRequestExecutor$executeInternal$1.label;
        if (i != 0) {
        }
        Object failure22 = (StripeResponse) obj3;
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure22);
        if (m4120exceptionOrNullimpl == null) {
        }
    }
}
