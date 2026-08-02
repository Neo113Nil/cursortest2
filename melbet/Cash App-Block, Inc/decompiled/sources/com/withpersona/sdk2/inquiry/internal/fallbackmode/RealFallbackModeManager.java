package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.time.DurationKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal._UtilJvmKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class RealFallbackModeManager implements FallbackModeManager {
    public final ApiController apiController;
    public StaticTemplateSession currentSession;
    public final Environment environment;
    public final FallbackMode fallbackMode;
    public final Moshi moshi;

    public RealFallbackModeManager(FallbackMode fallbackMode, ApiController apiController, Environment environment, Moshi moshi) {
        fallbackMode.getClass();
        apiController.getClass();
        environment.getClass();
        moshi.getClass();
        this.fallbackMode = fallbackMode;
        this.apiController = apiController;
        this.environment = environment;
        this.moshi = moshi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFallbackSession(InquiryAttributes inquiryAttributes, ContinuationImpl continuationImpl) {
        RealFallbackModeManager$createFallbackSession$1 realFallbackModeManager$createFallbackSession$1;
        int i;
        Object mo1999createSessiongIAlus;
        if (continuationImpl instanceof RealFallbackModeManager$createFallbackSession$1) {
            realFallbackModeManager$createFallbackSession$1 = (RealFallbackModeManager$createFallbackSession$1) continuationImpl;
            int i2 = realFallbackModeManager$createFallbackSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFallbackModeManager$createFallbackSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFallbackModeManager$createFallbackSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFallbackModeManager$createFallbackSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realFallbackModeManager$createFallbackSession$1.label = 1;
                    mo1999createSessiongIAlus = this.apiController.mo1999createSessiongIAlus(inquiryAttributes, realFallbackModeManager$createFallbackSession$1);
                    if (mo1999createSessiongIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mo1999createSessiongIAlus = ((Result) obj).value;
                }
                Result.Companion companion = Result.Companion;
                if (!(mo1999createSessiongIAlus instanceof Result.Failure)) {
                    this.currentSession = (StaticTemplateSession) mo1999createSessiongIAlus;
                }
                if (Result.m4120exceptionOrNullimpl(mo1999createSessiongIAlus) == null) {
                    return new InternalErrorInfo.NetworkErrorInfo(0, "Failed to create fallback session.", false, null, 8, null);
                }
                return null;
            }
        }
        realFallbackModeManager$createFallbackSession$1 = new RealFallbackModeManager$createFallbackSession$1(this, continuationImpl);
        Object obj2 = realFallbackModeManager$createFallbackSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFallbackModeManager$createFallbackSession$1.label;
        if (i != 0) {
        }
        Result.Companion companion2 = Result.Companion;
        if (!(mo1999createSessiongIAlus instanceof Result.Failure)) {
        }
        if (Result.m4120exceptionOrNullimpl(mo1999createSessiongIAlus) == null) {
        }
    }

    public final boolean isFallbackModeActive() {
        return this.fallbackMode == FallbackMode.ALWAYS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
    
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
    
        if (createFallbackSession(r9, r2) == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transition(String str, Object obj, ContinuationImpl continuationImpl) {
        RealFallbackModeManager$transition$1 realFallbackModeManager$transition$1;
        int i;
        String str2;
        Object obj2;
        StaticTemplateSession staticTemplateSession;
        Response success;
        if (continuationImpl instanceof RealFallbackModeManager$transition$1) {
            realFallbackModeManager$transition$1 = (RealFallbackModeManager$transition$1) continuationImpl;
            int i2 = realFallbackModeManager$transition$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFallbackModeManager$transition$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = realFallbackModeManager$transition$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFallbackModeManager$transition$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    if (this.currentSession == null) {
                        str2 = str;
                        InquiryAttributes inquiryAttributes = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, 4071);
                        realFallbackModeManager$transition$1.L$0 = str2;
                        obj2 = obj;
                        realFallbackModeManager$transition$1.L$1 = obj2;
                        realFallbackModeManager$transition$1.label = 1;
                    } else {
                        str2 = str;
                        obj2 = obj;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj3);
                            return obj3;
                        }
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj3);
                        success = (Response) obj3;
                        success.getClass();
                        return success;
                    }
                    Object obj5 = realFallbackModeManager$transition$1.L$1;
                    String str3 = realFallbackModeManager$transition$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    obj2 = obj5;
                    str2 = str3;
                }
                staticTemplateSession = this.currentSession;
                if (staticTemplateSession != null) {
                    int currentStepIndex = staticTemplateSession.getCurrentStepIndex();
                    List list = staticTemplateSession.steps;
                    if (currentStepIndex != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                        staticTemplateSession.savedStateHandle.set(Integer.valueOf(staticTemplateSession.getCurrentStepIndex() + 1), "current_fallback_mode_step_index");
                    }
                }
                if (!(obj2 instanceof SubmitDocumentRequest)) {
                    return Response.success(null);
                }
                boolean z = obj2 instanceof TransitionInquiryRequest;
                ApiController apiController = this.apiController;
                if (z) {
                    Moshi moshi = this.moshi;
                    moshi.getClass();
                    String json = moshi.adapter(TransitionInquiryRequest.class, Util.NO_ANNOTATIONS, null).toJson(obj2);
                    RequestBody.Companion companion = RequestBody.Companion;
                    json.getClass();
                    Regex regex = MediaType.TYPE_SUBTYPE;
                    MediaType mediaType = UnsignedKt.get("application/json");
                    companion.getClass();
                    RequestBody$Companion$toRequestBody$3 create = RequestBody.Companion.create(json, mediaType);
                    realFallbackModeManager$transition$1.L$0 = null;
                    realFallbackModeManager$transition$1.L$1 = null;
                    realFallbackModeManager$transition$1.label = 2;
                    Object transitionWithRequestBody = apiController.transitionWithRequestBody(str2, create, realFallbackModeManager$transition$1);
                    if (transitionWithRequestBody != obj4) {
                        return transitionWithRequestBody;
                    }
                } else {
                    if (!(obj2 instanceof List) || ((Collection) obj2).isEmpty()) {
                        return Response.success(null);
                    }
                    if (!(CollectionsKt.first((List) obj2) instanceof MultipartBody.Part)) {
                        success = Response.success(null);
                        success.getClass();
                        return success;
                    }
                    String m = Boxes$$ExternalSyntheticOutline1.m();
                    ByteString.Companion companion2 = ByteString.Companion;
                    ByteString encodeUtf8 = ByteString.Companion.encodeUtf8(m);
                    MediaType mediaType2 = MultipartBody.MIXED;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : (Iterable) obj2) {
                        if (obj6 instanceof MultipartBody.Part) {
                            arrayList2.add(obj6);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        MultipartBody.Part part = (MultipartBody.Part) it.next();
                        part.getClass();
                        arrayList.add(part);
                    }
                    if (arrayList.isEmpty()) {
                        a$$ExternalSyntheticBUOutline0.m$1("Multipart body must have at least one part.");
                        return null;
                    }
                    MultipartBody multipartBody = new MultipartBody(encodeUtf8, mediaType2, _UtilJvmKt.toImmutableList(arrayList));
                    realFallbackModeManager$transition$1.L$0 = null;
                    realFallbackModeManager$transition$1.L$1 = null;
                    realFallbackModeManager$transition$1.label = 3;
                    obj3 = apiController.transitionWithRequestBody(str2, multipartBody, realFallbackModeManager$transition$1);
                }
                return obj4;
            }
        }
        realFallbackModeManager$transition$1 = new RealFallbackModeManager$transition$1(this, continuationImpl);
        Object obj32 = realFallbackModeManager$transition$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFallbackModeManager$transition$1.label;
        if (i != 0) {
        }
        staticTemplateSession = this.currentSession;
        if (staticTemplateSession != null) {
        }
        if (!(obj2 instanceof SubmitDocumentRequest)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (createFallbackSession(r11, r3) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transitionBack(String str, TransitionBackRequest transitionBackRequest, ContinuationImpl continuationImpl) {
        RealFallbackModeManager$transitionBack$1 realFallbackModeManager$transitionBack$1;
        int i;
        String str2;
        StaticTemplateSession staticTemplateSession;
        TransitionBackRequest transitionBackRequest2 = transitionBackRequest;
        if (continuationImpl instanceof RealFallbackModeManager$transitionBack$1) {
            realFallbackModeManager$transitionBack$1 = (RealFallbackModeManager$transitionBack$1) continuationImpl;
            int i2 = realFallbackModeManager$transitionBack$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFallbackModeManager$transitionBack$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFallbackModeManager$transitionBack$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFallbackModeManager$transitionBack$1.label;
                Moshi moshi = this.moshi;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (transitionBackRequest2 == null) {
                        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                        moshi.getClass();
                        String json = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create("Body is not a TransitionBackRequest"));
                        json.getClass();
                        Regex regex = MediaType.TYPE_SUBTYPE;
                        Response.error(DurationKt.create(json, UnsignedKt.get("application/json")));
                        throw null;
                    }
                    if (this.currentSession == null) {
                        str2 = str;
                        InquiryAttributes inquiryAttributes = new InquiryAttributes(null, null, null, str2, this.environment, null, null, null, null, null, 4071);
                        realFallbackModeManager$transitionBack$1.L$0 = str2;
                        realFallbackModeManager$transitionBack$1.L$1 = transitionBackRequest2;
                        realFallbackModeManager$transitionBack$1.label = 1;
                    } else {
                        str2 = str;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    transitionBackRequest2 = realFallbackModeManager$transitionBack$1.L$1;
                    String str3 = realFallbackModeManager$transitionBack$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str2 = str3;
                }
                staticTemplateSession = this.currentSession;
                if (staticTemplateSession != null && staticTemplateSession.getCurrentStepIndex() != 0) {
                    staticTemplateSession.savedStateHandle.set(Integer.valueOf(staticTemplateSession.getCurrentStepIndex() - 1), "current_fallback_mode_step_index");
                }
                moshi.getClass();
                String json2 = moshi.adapter(TransitionBackRequest.class, Util.NO_ANNOTATIONS, null).toJson(transitionBackRequest2);
                RequestBody.Companion companion = RequestBody.Companion;
                json2.getClass();
                Regex regex2 = MediaType.TYPE_SUBTYPE;
                MediaType mediaType = UnsignedKt.get("application/json");
                companion.getClass();
                RequestBody$Companion$toRequestBody$3 create = RequestBody.Companion.create(json2, mediaType);
                realFallbackModeManager$transitionBack$1.L$0 = null;
                realFallbackModeManager$transitionBack$1.L$1 = null;
                realFallbackModeManager$transitionBack$1.label = 2;
                Object transitionBack = this.apiController.transitionBack(str2, create, realFallbackModeManager$transitionBack$1);
                return transitionBack != obj2 ? obj2 : transitionBack;
            }
        }
        realFallbackModeManager$transitionBack$1 = new RealFallbackModeManager$transitionBack$1(this, continuationImpl);
        Object obj3 = realFallbackModeManager$transitionBack$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFallbackModeManager$transitionBack$1.label;
        Moshi moshi2 = this.moshi;
        if (i != 0) {
        }
        staticTemplateSession = this.currentSession;
        if (staticTemplateSession != null) {
            staticTemplateSession.savedStateHandle.set(Integer.valueOf(staticTemplateSession.getCurrentStepIndex() - 1), "current_fallback_mode_step_index");
        }
        moshi2.getClass();
        String json22 = moshi2.adapter(TransitionBackRequest.class, Util.NO_ANNOTATIONS, null).toJson(transitionBackRequest2);
        RequestBody.Companion companion2 = RequestBody.Companion;
        json22.getClass();
        Regex regex22 = MediaType.TYPE_SUBTYPE;
        MediaType mediaType2 = UnsignedKt.get("application/json");
        companion2.getClass();
        RequestBody$Companion$toRequestBody$3 create2 = RequestBody.Companion.create(json22, mediaType2);
        realFallbackModeManager$transitionBack$1.L$0 = null;
        realFallbackModeManager$transitionBack$1.L$1 = null;
        realFallbackModeManager$transitionBack$1.label = 2;
        Object transitionBack2 = this.apiController.transitionBack(str2, create2, realFallbackModeManager$transitionBack$1);
        if (transitionBack2 != obj22) {
        }
    }
}
