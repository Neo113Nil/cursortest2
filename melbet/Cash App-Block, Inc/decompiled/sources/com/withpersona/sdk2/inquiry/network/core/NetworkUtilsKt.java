package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;
    public static final String SUBSYSTEM = "com.withpersona.sdk2.inquiry.network";

    public static final <T> Object enqueueRetriableRequestWithRetry(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(function1, new SelfieWorkflow$$ExternalSyntheticLambda79(6), continuation);
    }

    public static final <T> Object enqueueVerificationRequestWithRetry(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(function1, new SelfieWorkflow$$ExternalSyntheticLambda79(7), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueueVerificationRequestWithRetry$lambda$3(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        int code = networkErrorInfo.getCode();
        return (code == 0 || code == 409 || code == 413 || code == 422) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0057 -> B:10:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object enqueueWithRetryWhen(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function12, Continuation<? super NetworkCallResult<T>> continuation) {
        NetworkUtilsKt$enqueueWithRetryWhen$1 networkUtilsKt$enqueueWithRetryWhen$1;
        int i;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function13;
        int i2;
        Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function14;
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
        if (continuation instanceof NetworkUtilsKt$enqueueWithRetryWhen$1) {
            networkUtilsKt$enqueueWithRetryWhen$1 = (NetworkUtilsKt$enqueueWithRetryWhen$1) continuation;
            int i3 = networkUtilsKt$enqueueWithRetryWhen$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                networkUtilsKt$enqueueWithRetryWhen$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = networkUtilsKt$enqueueWithRetryWhen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkUtilsKt$enqueueWithRetryWhen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function13 = function1;
                    i2 = 0;
                    function14 = function12;
                    networkErrorInfo = null;
                    if (i2 < 3) {
                    }
                    if (networkErrorInfo != null) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = networkUtilsKt$enqueueWithRetryWhen$1.I$0;
                    Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function15 = (Function1) networkUtilsKt$enqueueWithRetryWhen$1.L$1;
                    Function1<? super Continuation<? super Response<T>>, ? extends Object> function16 = (Function1) networkUtilsKt$enqueueWithRetryWhen$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    NetworkUtilsKt$enqueueWithRetryWhen$1 networkUtilsKt$enqueueWithRetryWhen$12 = networkUtilsKt$enqueueWithRetryWhen$1;
                    Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function17 = function15;
                    function13 = function16;
                    NetworkUtilsKt$enqueueWithRetryWhen$1 networkUtilsKt$enqueueWithRetryWhen$13 = networkUtilsKt$enqueueWithRetryWhen$12;
                    Response response = (Response) obj;
                    if (!response.rawResponse.isSuccessful) {
                        return new NetworkCallResult.Success(response.body);
                    }
                    InternalErrorInfo.NetworkErrorInfo errorInfo = toErrorInfo(response);
                    if (!((Boolean) function17.invoke(errorInfo)).booleanValue()) {
                        networkErrorInfo = errorInfo;
                        if (networkErrorInfo != null) {
                            return new NetworkCallResult.Failure(networkErrorInfo);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    i2++;
                    networkErrorInfo = errorInfo;
                    function14 = function17;
                    networkUtilsKt$enqueueWithRetryWhen$1 = networkUtilsKt$enqueueWithRetryWhen$13;
                    if (i2 < 3) {
                        networkUtilsKt$enqueueWithRetryWhen$1.L$0 = function13;
                        networkUtilsKt$enqueueWithRetryWhen$1.L$1 = function14;
                        networkUtilsKt$enqueueWithRetryWhen$1.I$0 = i2;
                        networkUtilsKt$enqueueWithRetryWhen$1.label = 1;
                        Object invoke = function13.invoke(networkUtilsKt$enqueueWithRetryWhen$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        networkUtilsKt$enqueueWithRetryWhen$12 = networkUtilsKt$enqueueWithRetryWhen$1;
                        function17 = function14;
                        obj = invoke;
                        NetworkUtilsKt$enqueueWithRetryWhen$1 networkUtilsKt$enqueueWithRetryWhen$132 = networkUtilsKt$enqueueWithRetryWhen$12;
                        Response response2 = (Response) obj;
                        if (!response2.rawResponse.isSuccessful) {
                        }
                    }
                    if (networkErrorInfo != null) {
                    }
                }
            }
        }
        networkUtilsKt$enqueueWithRetryWhen$1 = new NetworkUtilsKt$enqueueWithRetryWhen$1(continuation);
        Object obj2 = networkUtilsKt$enqueueWithRetryWhen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkUtilsKt$enqueueWithRetryWhen$1.label;
        if (i != 0) {
        }
    }

    public static final <T> NetworkCallResult<T> onFailure(NetworkCallResult<T> networkCallResult, Function1<? super InternalErrorInfo.NetworkErrorInfo, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            function1.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    public static final <T> NetworkCallResult<T> onSuccess(NetworkCallResult<T> networkCallResult, Function1<? super T, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Success) {
            function1.invoke(((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InternalErrorInfo.NetworkErrorInfo toErrorInfo(Response<?> response) {
        BufferedSource source;
        ErrorResponse errorResponse;
        List<ErrorResponse.Error> errors;
        Iterator<T> it;
        List<ErrorResponse.Error> errors2;
        Iterator<T> it2;
        List<ErrorResponse.Error> errors3;
        Iterator<T> it3;
        List<ErrorResponse.Error> errors4;
        Iterator<T> it4;
        List<ErrorResponse.Error> errors5;
        Iterator<T> it5;
        List<ErrorResponse.Error> errors6;
        List<ErrorResponse.Error> errors7;
        Iterator<T> it6;
        List<ErrorResponse.Error> errors8;
        ErrorResponse.Error error;
        String description;
        okhttp3.Response response2 = response.rawResponse;
        ResponseBody responseBody = response.errorBody;
        int i = response2.code;
        String str = response2.message;
        ErrorResponse.Error error2 = null;
        String str2 = (str == null || StringsKt.isBlank(str)) ? null : response2.message;
        boolean z = false;
        if (i == 429) {
            error2 = new ErrorResponse.Error.RateLimitExceededError("Quota exceeded", "");
        } else {
            HttpStatusCode httpStatusCode = HttpStatusCode.INSTANCE;
            IntRange client_errors = httpStatusCode.getCLIENT_ERRORS();
            int i2 = client_errors.first;
            if (i > client_errors.last || i2 > i) {
                IntRange server_errors = httpStatusCode.getSERVER_ERRORS();
                int i3 = server_errors.first;
                if (i > server_errors.last || i3 > i) {
                    z = true;
                }
            } else {
                if (responseBody != null) {
                    try {
                        source = responseBody.source();
                    } catch (Exception e) {
                        if (!(e instanceof JsonDataException) && !(e instanceof IOException)) {
                            throw e;
                        }
                    }
                    if (source != null) {
                        Moshi.Builder builder = new Moshi.Builder();
                        builder.add(ErrorResponse.Companion.getAdapter());
                        builder.add(UiComponentError.Companion);
                        errorResponse = (ErrorResponse) new Moshi(builder).adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).fromJson(source.getBuffer().clone());
                        if (errorResponse != null && (errors8 = errorResponse.getErrors()) != null && (error = (ErrorResponse.Error) CollectionsKt.firstOrNull((List) errors8)) != null) {
                            description = error.getDescription();
                            if (description == null) {
                                description = error.getTitle();
                            }
                            if (description != null) {
                                str2 = description;
                            }
                        }
                        if (errorResponse != null && (errors7 = errorResponse.getErrors()) != null && !errors7.isEmpty()) {
                            it6 = errors7.iterator();
                            while (it6.hasNext()) {
                                if (((ErrorResponse.Error) it6.next()) instanceof ErrorResponse.Error.InactiveTemplateError) {
                                    break;
                                }
                            }
                        }
                        if (errorResponse != null && (errors5 = errorResponse.getErrors()) != null && !errors5.isEmpty()) {
                            it5 = errors5.iterator();
                            while (it5.hasNext()) {
                                if (((ErrorResponse.Error) it5.next()) instanceof ErrorResponse.Error.InvalidConfigError) {
                                    break;
                                }
                            }
                        }
                        if (errorResponse != null && (errors4 = errorResponse.getErrors()) != null && !errors4.isEmpty()) {
                            it4 = errors4.iterator();
                            while (it4.hasNext()) {
                                if (((ErrorResponse.Error) it4.next()) instanceof ErrorResponse.Error.UnauthenticatedError) {
                                    break;
                                }
                            }
                        }
                        if (errorResponse != null && (errors3 = errorResponse.getErrors()) != null && !errors3.isEmpty()) {
                            it3 = errors3.iterator();
                            while (it3.hasNext()) {
                                if (((ErrorResponse.Error) it3.next()) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                                    break;
                                }
                            }
                        }
                        if (errorResponse != null && (errors2 = errorResponse.getErrors()) != null && !errors2.isEmpty()) {
                            it2 = errors2.iterator();
                            while (it2.hasNext()) {
                                if (((ErrorResponse.Error) it2.next()) instanceof ErrorResponse.Error.TransitionFromTerminalStateError) {
                                    break;
                                }
                            }
                        }
                        if (errorResponse != null && (errors = errorResponse.getErrors()) != null && !errors.isEmpty()) {
                            it = errors.iterator();
                            while (it.hasNext()) {
                                if (((ErrorResponse.Error) it.next()) instanceof ErrorResponse.Error.FieldNotFoundError) {
                                    break;
                                }
                            }
                        }
                        if (i != 401 && i != 404 && i != 409) {
                            z = true;
                        }
                        if (errorResponse != null && (errors6 = errorResponse.getErrors()) != null) {
                            error2 = (ErrorResponse.Error) CollectionsKt.firstOrNull((List) errors6);
                        }
                        if (error2 instanceof ErrorResponse.Error.UnknownError) {
                            ((ErrorResponse.Error.UnknownError) error2).setErrorBody(responseBody);
                        }
                    }
                }
                errorResponse = null;
                if (errorResponse != null) {
                    description = error.getDescription();
                    if (description == null) {
                    }
                    if (description != null) {
                    }
                }
                if (errorResponse != null) {
                    it6 = errors7.iterator();
                    while (it6.hasNext()) {
                    }
                }
                if (errorResponse != null) {
                    it5 = errors5.iterator();
                    while (it5.hasNext()) {
                    }
                }
                if (errorResponse != null) {
                    it4 = errors4.iterator();
                    while (it4.hasNext()) {
                    }
                }
                if (errorResponse != null) {
                    it3 = errors3.iterator();
                    while (it3.hasNext()) {
                    }
                }
                if (errorResponse != null) {
                    it2 = errors2.iterator();
                    while (it2.hasNext()) {
                    }
                }
                if (errorResponse != null) {
                    it = errors.iterator();
                    while (it.hasNext()) {
                    }
                }
                if (i != 401) {
                    z = true;
                }
                if (errorResponse != null) {
                    error2 = (ErrorResponse.Error) CollectionsKt.firstOrNull((List) errors6);
                }
                if (error2 instanceof ErrorResponse.Error.UnknownError) {
                }
            }
        }
        return new InternalErrorInfo.NetworkErrorInfo(i, str2, z, error2);
    }

    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
