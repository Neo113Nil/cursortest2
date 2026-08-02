package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.zzai;
import com.google.android.play.core.splitcompat.zzf;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventStateKt;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryResult;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResult;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeCodeResult;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackResult;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquiryResult;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityResult;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.Included;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.Relationship;
import com.withpersona.sdk2.inquiry.network.dto.RelationshipData;
import com.withpersona.sdk2.inquiry.network.dto.Relationships;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsData;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class InquiryApiHelper {
    public final Context applicationContext;
    public final RealDeviceIdProvider deviceIdProvider;
    public final RealFallbackModeManager fallbackModeManager;
    public final PlayIntegrityHelper playIntegrityHelper;
    public final SandboxFlags sandboxFlags;
    public final InquiryService service;

    public InquiryApiHelper(Context context, InquiryService inquiryService, RealFallbackModeManager realFallbackModeManager, SandboxFlags sandboxFlags, RealDeviceIdProvider realDeviceIdProvider, PlayIntegrityHelper playIntegrityHelper) {
        context.getClass();
        inquiryService.getClass();
        realFallbackModeManager.getClass();
        sandboxFlags.getClass();
        realDeviceIdProvider.getClass();
        playIntegrityHelper.getClass();
        this.applicationContext = context;
        this.service = inquiryService;
        this.fallbackModeManager = realFallbackModeManager;
        this.sandboxFlags = sandboxFlags;
        this.deviceIdProvider = realDeviceIdProvider;
        this.playIntegrityHelper = playIntegrityHelper;
    }

    public static InquirySessionDataWrapper createInquirySessionDataWrapper(CheckInquiryResponse checkInquiryResponse) {
        String accessToken;
        InquirySessionData inquirySessionData;
        CheckInquiryResponse.Meta meta = checkInquiryResponse.getMeta();
        if (meta == null || (accessToken = meta.getAccessToken()) == null) {
            return null;
        }
        List<Included> included = checkInquiryResponse.getIncluded();
        if (included != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : included) {
                if (obj instanceof InquirySessionData) {
                    arrayList.add(obj);
                }
            }
            inquirySessionData = (InquirySessionData) CollectionsKt.first((List) arrayList);
        } else {
            inquirySessionData = null;
        }
        if (inquirySessionData != null) {
            return new InquirySessionDataWrapper(accessToken, inquirySessionData);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        if (r2 == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010a, code lost:
    
        if (r2 == r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createInquiry(InquiryAttributes inquiryAttributes, ContinuationImpl continuationImpl) {
        InquiryApiHelper$createInquiry$1 inquiryApiHelper$createInquiry$1;
        int i;
        String str;
        try {
            if (continuationImpl instanceof InquiryApiHelper$createInquiry$1) {
                inquiryApiHelper$createInquiry$1 = (InquiryApiHelper$createInquiry$1) continuationImpl;
                int i2 = inquiryApiHelper$createInquiry$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    inquiryApiHelper$createInquiry$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = inquiryApiHelper$createInquiry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = inquiryApiHelper$createInquiry$1.label;
                    RealFallbackModeManager realFallbackModeManager = this.fallbackModeManager;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            Response response = (Response) obj;
                            if (!response.rawResponse.isSuccessful) {
                                InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(response);
                                return new CreateInquiryResult.Error(errorInfo.getMessage(), errorInfo);
                            }
                            Object obj2 = response.body;
                            obj2.getClass();
                            CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) obj2;
                            return new CreateInquiryResult.Success(checkInquiryResponse.getData().getId(), checkInquiryResponse.getData().getAttributes().getNextStep(), checkInquiryResponse.getToken(), createInquirySessionDataWrapper(checkInquiryResponse));
                        }
                        SafeTrace.throwOnFailure(obj);
                        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) obj;
                        if (networkErrorInfo != null) {
                            return new CreateInquiryResult.Error(networkErrorInfo.getMessage(), networkErrorInfo);
                        }
                        StaticTemplateSession staticTemplateSession = realFallbackModeManager.currentSession;
                        if (staticTemplateSession == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        String str2 = staticTemplateSession.inquiryId;
                        NextStep nextStep = (NextStep) staticTemplateSession.steps.get(staticTemplateSession.getCurrentStepIndex());
                        if (nextStep != null) {
                            return new CreateInquiryResult.Success(str2, nextStep, null, null);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    String str3 = inquiryAttributes.templateId;
                    Environment environment = inquiryAttributes.environment;
                    if (str3 != null && !StringsKt__StringsJVMKt.startsWith(str3, "itmpl_", false)) {
                        return new CreateInquiryResult.Error("The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1", new InternalErrorInfo.IntegrationErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Invalid template format: ", inquiryAttributes.templateId)));
                    }
                    if (realFallbackModeManager.isFallbackModeActive()) {
                        this.sandboxFlags.isSandboxModeEnabled = environment == Environment.SANDBOX;
                        inquiryApiHelper$createInquiry$1.label = 1;
                        obj = realFallbackModeManager.createFallbackSession(inquiryAttributes, inquiryApiHelper$createInquiry$1);
                    } else {
                        InquiryService inquiryService = this.service;
                        String str4 = inquiryAttributes.templateId;
                        String str5 = inquiryAttributes.templateVersion;
                        environment.getClass();
                        int ordinal = environment.ordinal();
                        if (ordinal == 0) {
                            str = "production";
                        } else {
                            if (ordinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "sandbox";
                        }
                        String str6 = str;
                        String str7 = inquiryAttributes.environmentId;
                        String str8 = inquiryAttributes.accountId;
                        String str9 = inquiryAttributes.referenceId;
                        Map map = inquiryAttributes.fields;
                        CreateInquiryRequest createInquiryRequest = new CreateInquiryRequest(new CreateInquiryRequest.Data(new zzai(str4, str5, str6, str7, str8, str9, map != null ? ConversionsKt.toInquiryFieldDtoMap(map) : null, inquiryAttributes.themeSetId, 64)));
                        String str10 = realFallbackModeManager.fallbackMode == FallbackMode.DEFER ? "defer" : null;
                        inquiryApiHelper$createInquiry$1.label = 2;
                        obj = inquiryService.createInquiry(createInquiryRequest, str10, inquiryApiHelper$createInquiry$1);
                    }
                    return coroutineSingletons;
                }
            }
            if (i == 0) {
            }
        } catch (SocketTimeoutException e) {
            return new CreateInquiryResult.Error("There was a problem reaching the server.", NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
        }
        inquiryApiHelper$createInquiry$1 = new InquiryApiHelper$createInquiry$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$createInquiry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$createInquiry$1.label;
        RealFallbackModeManager realFallbackModeManager2 = this.fallbackModeManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createInquirySession(String str, InquirySessionDataWrapper inquirySessionDataWrapper, ContinuationImpl continuationImpl) {
        InquiryApiHelper$createInquirySession$1 inquiryApiHelper$createInquirySession$1;
        int i;
        okhttp3.Response response;
        if (continuationImpl instanceof InquiryApiHelper$createInquirySession$1) {
            inquiryApiHelper$createInquirySession$1 = (InquiryApiHelper$createInquirySession$1) continuationImpl;
            int i2 = inquiryApiHelper$createInquirySession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inquiryApiHelper$createInquirySession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inquiryApiHelper$createInquirySession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inquiryApiHelper$createInquirySession$1.label;
                RealDeviceIdProvider realDeviceIdProvider = this.deviceIdProvider;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StaticTemplateSession staticTemplateSession = this.fallbackModeManager.currentSession;
                    if (staticTemplateSession != null) {
                        return new CreateInquirySessionResult.Success(staticTemplateSession.authorization, InquirySessionConfig.Default);
                    }
                    if (inquirySessionDataWrapper != null) {
                        updateClientStateWithSessionData$inquiry_internal_release(inquirySessionDataWrapper.getInquirySessionData());
                        return new CreateInquirySessionResult.Success(Recorder$$ExternalSyntheticOutline2.m("Bearer ", inquirySessionDataWrapper.getAccessToken()), InquiryApiHelperKt.toInquirySessionConfig(inquirySessionDataWrapper.getInquirySessionData().getAttributes()));
                    }
                    str.getClass();
                    CreateInquirySessionRequest createInquirySessionRequest = new CreateInquirySessionRequest(new CreateInquirySessionRequest.Data(null, 1, null), new CreateInquirySessionRequest.Meta(str));
                    String str2 = realDeviceIdProvider.deviceId;
                    if (str2 == null) {
                        str2 = ((SharedPreferences) realDeviceIdProvider.prefs$delegate.getValue()).getString("DEVICE_ID", null);
                    }
                    inquiryApiHelper$createInquirySession$1.label = 1;
                    obj = this.service.createInquirySession(createInquirySessionRequest, str2, inquiryApiHelper$createInquirySession$1);
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
                Response response2 = (Response) obj;
                response = response2.rawResponse;
                if (response.isSuccessful) {
                    return new CreateInquirySessionResult.Error(NetworkUtilsKt.toErrorInfo(response2));
                }
                String str3 = response.headers.get("persona-device-id");
                if (str3 != null) {
                    realDeviceIdProvider.setDeviceId(str3);
                }
                Object obj2 = response2.body;
                obj2.getClass();
                CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) obj2;
                InquirySessionData inquirySessionData = createInquirySessionResponse.data;
                updateClientStateWithSessionData$inquiry_internal_release(inquirySessionData);
                return new CreateInquirySessionResult.Success("Bearer ".concat(createInquirySessionResponse.meta.accessToken), InquiryApiHelperKt.toInquirySessionConfig(inquirySessionData.getAttributes()));
            }
        }
        inquiryApiHelper$createInquirySession$1 = new InquiryApiHelper$createInquirySession$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$createInquirySession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$createInquirySession$1.label;
        RealDeviceIdProvider realDeviceIdProvider2 = this.deviceIdProvider;
        if (i != 0) {
        }
        Response response22 = (Response) obj3;
        response = response22.rawResponse;
        if (response.isSuccessful) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object exchangeOneTimeLinkCode(String str, ContinuationImpl continuationImpl) {
        InquiryApiHelper$exchangeOneTimeLinkCode$1 inquiryApiHelper$exchangeOneTimeLinkCode$1;
        int i;
        okhttp3.Response response;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data;
        if (continuationImpl instanceof InquiryApiHelper$exchangeOneTimeLinkCode$1) {
            inquiryApiHelper$exchangeOneTimeLinkCode$1 = (InquiryApiHelper$exchangeOneTimeLinkCode$1) continuationImpl;
            int i2 = inquiryApiHelper$exchangeOneTimeLinkCode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inquiryApiHelper$exchangeOneTimeLinkCode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inquiryApiHelper$exchangeOneTimeLinkCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inquiryApiHelper$exchangeOneTimeLinkCode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
                    inquiryApiHelper$exchangeOneTimeLinkCode$1.L$0 = str;
                    inquiryApiHelper$exchangeOneTimeLinkCode$1.label = 1;
                    obj = this.service.exchangeOneTimeLinkCode(exchangeOneTimeLinkCodeRequest, inquiryApiHelper$exchangeOneTimeLinkCode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = inquiryApiHelper$exchangeOneTimeLinkCode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Response response2 = (Response) obj;
                response = response2.rawResponse;
                if (response.isSuccessful) {
                    return NetworkUtilsKt.toErrorInfo(response2).getCode() == 404 ? new ExchangeOneTimeCodeResult.Error(new InternalErrorInfo.InvalidOneTimeLinkCode(str)) : new ExchangeOneTimeCodeResult.Error(NetworkUtilsKt.toErrorInfo(response2));
                }
                String str2 = response.headers.get("persona-device-id");
                if (str2 != null) {
                    this.deviceIdProvider.setDeviceId(str2);
                }
                Object obj2 = response2.body;
                obj2.getClass();
                ExchangeOneTimeLinkCodeResponse exchangeOneTimeLinkCodeResponse = (ExchangeOneTimeLinkCodeResponse) obj2;
                InquirySessionData inquirySessionData = exchangeOneTimeLinkCodeResponse.data;
                String id = (inquirySessionData == null || (relationships = inquirySessionData.getRelationships()) == null || (inquiry = relationships.getInquiry()) == null || (data = inquiry.getData()) == null) ? null : data.getId();
                if (inquirySessionData != null) {
                    updateClientStateWithSessionData$inquiry_internal_release(inquirySessionData);
                }
                if (id == null) {
                    return new ExchangeOneTimeCodeResult.Error(new InternalErrorInfo.UnknownErrorInfo("Error exchanging one-time-code."));
                }
                ExchangeOneTimeLinkCodeResponse.Metadata metadata = exchangeOneTimeLinkCodeResponse.meta;
                return new ExchangeOneTimeCodeResult.Success(id, Recorder$$ExternalSyntheticOutline2.m("Bearer ", metadata != null ? metadata.accessToken : null), InquiryApiHelperKt.toInquirySessionConfig(inquirySessionData.getAttributes()));
            }
        }
        inquiryApiHelper$exchangeOneTimeLinkCode$1 = new InquiryApiHelper$exchangeOneTimeLinkCode$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$exchangeOneTimeLinkCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$exchangeOneTimeLinkCode$1.label;
        if (i != 0) {
        }
        Response response22 = (Response) obj3;
        response = response22.rawResponse;
        if (response.isSuccessful) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeInquiryCallWithRetry(Function1 function1, ContinuationImpl continuationImpl) {
        InquiryApiHelper$makeInquiryCallWithRetry$1 inquiryApiHelper$makeInquiryCallWithRetry$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof InquiryApiHelper$makeInquiryCallWithRetry$1) {
            inquiryApiHelper$makeInquiryCallWithRetry$1 = (InquiryApiHelper$makeInquiryCallWithRetry$1) continuationImpl;
            int i2 = inquiryApiHelper$makeInquiryCallWithRetry$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inquiryApiHelper$makeInquiryCallWithRetry$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inquiryApiHelper$makeInquiryCallWithRetry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inquiryApiHelper$makeInquiryCallWithRetry$1.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    InquiryApiHelper$makeInquiryCallWithRetry$2 inquiryApiHelper$makeInquiryCallWithRetry$2 = new InquiryApiHelper$makeInquiryCallWithRetry$2(function1, m, null);
                    inquiryApiHelper$makeInquiryCallWithRetry$1.L$0 = m;
                    inquiryApiHelper$makeInquiryCallWithRetry$1.label = 1;
                    if (RetryKt.retry(5, inquiryApiHelper$makeInquiryCallWithRetry$2, inquiryApiHelper$makeInquiryCallWithRetry$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef = m;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = inquiryApiHelper$makeInquiryCallWithRetry$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return ref$ObjectRef.element;
            }
        }
        inquiryApiHelper$makeInquiryCallWithRetry$1 = new InquiryApiHelper$makeInquiryCallWithRetry$1(this, continuationImpl);
        Object obj2 = inquiryApiHelper$makeInquiryCallWithRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$makeInquiryCallWithRetry$1.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: SocketTimeoutException -> 0x0076, TryCatch #0 {SocketTimeoutException -> 0x0076, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x0053, B:17:0x005f, B:19:0x006c, B:24:0x0033), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runFallbackTransitionBack(String str, String str2, ContinuationImpl continuationImpl) {
        InquiryApiHelper$runFallbackTransitionBack$1 inquiryApiHelper$runFallbackTransitionBack$1;
        int i;
        try {
            if (continuationImpl instanceof InquiryApiHelper$runFallbackTransitionBack$1) {
                inquiryApiHelper$runFallbackTransitionBack$1 = (InquiryApiHelper$runFallbackTransitionBack$1) continuationImpl;
                int i2 = inquiryApiHelper$runFallbackTransitionBack$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    inquiryApiHelper$runFallbackTransitionBack$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = inquiryApiHelper$runFallbackTransitionBack$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = inquiryApiHelper$runFallbackTransitionBack$1.label;
                    RealFallbackModeManager realFallbackModeManager = this.fallbackModeManager;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        str2.getClass();
                        TransitionBackRequest transitionBackRequest = new TransitionBackRequest(new TransitionBackRequest.Meta(str2));
                        inquiryApiHelper$runFallbackTransitionBack$1.label = 1;
                        obj = realFallbackModeManager.transitionBack(str, transitionBackRequest, inquiryApiHelper$runFallbackTransitionBack$1);
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
                    Response response = (Response) obj;
                    StaticTemplateSession staticTemplateSession = realFallbackModeManager.currentSession;
                    return response.rawResponse.isSuccessful ? new TransitionBackResult.Error(NetworkUtilsKt.toErrorInfo(response)) : staticTemplateSession == null ? new TransitionBackResult.Error(new InternalErrorInfo.UnknownErrorInfo("Current fallback session is unexpectedly null.")) : new TransitionBackResult.Success(staticTemplateSession.currentStepAsInquiryState$inquiry_internal_release());
                }
            }
            if (i != 0) {
            }
            Response response2 = (Response) obj;
            StaticTemplateSession staticTemplateSession2 = realFallbackModeManager.currentSession;
            if (response2.rawResponse.isSuccessful) {
            }
        } catch (SocketTimeoutException e) {
            return new TransitionBackResult.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
        }
        inquiryApiHelper$runFallbackTransitionBack$1 = new InquiryApiHelper$runFallbackTransitionBack$1(this, continuationImpl);
        Object obj2 = inquiryApiHelper$runFallbackTransitionBack$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$runFallbackTransitionBack$1.label;
        RealFallbackModeManager realFallbackModeManager2 = this.fallbackModeManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: SocketTimeoutException -> 0x0074, TryCatch #0 {SocketTimeoutException -> 0x0074, blocks: (B:11:0x0027, B:12:0x0051, B:14:0x0059, B:17:0x006a, B:22:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[Catch: SocketTimeoutException -> 0x0074, TRY_LEAVE, TryCatch #0 {SocketTimeoutException -> 0x0074, blocks: (B:11:0x0027, B:12:0x0051, B:14:0x0059, B:17:0x006a, B:22:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runTransitionBack(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, ContinuationImpl continuationImpl) {
        InquiryApiHelper$runTransitionBack$1 inquiryApiHelper$runTransitionBack$1;
        int i;
        Response response;
        try {
            if (continuationImpl instanceof InquiryApiHelper$runTransitionBack$1) {
                inquiryApiHelper$runTransitionBack$1 = (InquiryApiHelper$runTransitionBack$1) continuationImpl;
                int i2 = inquiryApiHelper$runTransitionBack$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    inquiryApiHelper$runTransitionBack$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = inquiryApiHelper$runTransitionBack$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = inquiryApiHelper$runTransitionBack$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        InquiryService inquiryService = this.service;
                        str3.getClass();
                        TransitionBackRequest transitionBackRequest = new TransitionBackRequest(new TransitionBackRequest.Meta(str3));
                        inquiryApiHelper$runTransitionBack$1.L$0 = str;
                        inquiryApiHelper$runTransitionBack$1.L$1 = inquirySessionConfig;
                        inquiryApiHelper$runTransitionBack$1.label = 1;
                        obj = inquiryService.transitionBack(str, str2, transitionBackRequest, inquiryApiHelper$runTransitionBack$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        inquirySessionConfig = inquiryApiHelper$runTransitionBack$1.L$1;
                        str = inquiryApiHelper$runTransitionBack$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (response.rawResponse.isSuccessful) {
                        return new TransitionBackResult.Error(NetworkUtilsKt.toErrorInfo(response));
                    }
                    Object obj2 = response.body;
                    obj2.getClass();
                    return new TransitionBackResult.Success(ConversionsKt.toInquiryState((CheckInquiryResponse) obj2, str, inquirySessionConfig));
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            if (response.rawResponse.isSuccessful) {
            }
        } catch (SocketTimeoutException e) {
            return new TransitionBackResult.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
        }
        inquiryApiHelper$runTransitionBack$1 = new InquiryApiHelper$runTransitionBack$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$runTransitionBack$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$runTransitionBack$1.label;
    }

    public final void updateClientStateWithSessionData$inquiry_internal_release(InquirySessionData inquirySessionData) {
        Relationship device;
        RelationshipData data;
        String id;
        inquirySessionData.getClass();
        Relationships relationships = inquirySessionData.getRelationships();
        if (relationships != null && (device = relationships.getDevice()) != null && (data = device.getData()) != null && (id = data.getId()) != null) {
            this.deviceIdProvider.setDeviceId(id);
        }
        String playIntegrityProjectId = inquirySessionData.getAttributes().getPlayIntegrityProjectId();
        if (playIntegrityProjectId != null) {
            PlayIntegrityHelper playIntegrityHelper = this.playIntegrityHelper;
            playIntegrityHelper.getClass();
            JobKt.launch$default(playIntegrityHelper.coroutineScope, null, null, new WorkflowContextAdapter$updateState$1(playIntegrityHelper, playIntegrityProjectId, (Continuation) null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateInquiry(String str, InquirySessionConfig inquirySessionConfig, ContinuationImpl continuationImpl) {
        InquiryApiHelper$updateInquiry$1 inquiryApiHelper$updateInquiry$1;
        int i;
        VerifyDeviceIntegrityResult verifyDeviceIntegrityResult;
        InquirySessionConfig inquirySessionConfig2;
        if (continuationImpl instanceof InquiryApiHelper$updateInquiry$1) {
            inquiryApiHelper$updateInquiry$1 = (InquiryApiHelper$updateInquiry$1) continuationImpl;
            int i2 = inquiryApiHelper$updateInquiry$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inquiryApiHelper$updateInquiry$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inquiryApiHelper$updateInquiry$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inquiryApiHelper$updateInquiry$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    inquiryApiHelper$updateInquiry$1.L$0 = str;
                    inquiryApiHelper$updateInquiry$1.L$1 = inquirySessionConfig;
                    inquiryApiHelper$updateInquiry$1.label = 1;
                    obj = verifyDeviceIntegrity(str, inquirySessionConfig, inquiryApiHelper$updateInquiry$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        inquirySessionConfig2 = (InquirySessionConfig) inquiryApiHelper$updateInquiry$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) obj;
                        return (internalErrorInfo == null && inquirySessionConfig2.gpsCollectionRequirement == GpsCollectionRequirement.REQUIRED) ? new UpdateInquiryResult.Error(internalErrorInfo) : UpdateInquiryResult.Success.INSTANCE;
                    }
                    inquirySessionConfig = inquiryApiHelper$updateInquiry$1.L$1;
                    str = (String) inquiryApiHelper$updateInquiry$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                verifyDeviceIntegrityResult = (VerifyDeviceIntegrityResult) obj;
                if (!(verifyDeviceIntegrityResult instanceof VerifyDeviceIntegrityResult.Error)) {
                    return new UpdateInquiryResult.Error(((VerifyDeviceIntegrityResult.Error) verifyDeviceIntegrityResult).cause);
                }
                inquiryApiHelper$updateInquiry$1.L$0 = inquirySessionConfig;
                inquiryApiHelper$updateInquiry$1.L$1 = null;
                inquiryApiHelper$updateInquiry$1.label = 2;
                obj = updateInquiryInternal(str, inquirySessionConfig, inquiryApiHelper$updateInquiry$1);
                if (obj != obj2) {
                    inquirySessionConfig2 = inquirySessionConfig;
                    InternalErrorInfo internalErrorInfo2 = (InternalErrorInfo) obj;
                    if (internalErrorInfo2 == null) {
                    }
                }
                return obj2;
            }
        }
        inquiryApiHelper$updateInquiry$1 = new InquiryApiHelper$updateInquiry$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$updateInquiry$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$updateInquiry$1.label;
        if (i != 0) {
        }
        verifyDeviceIntegrityResult = (VerifyDeviceIntegrityResult) obj3;
        if (!(verifyDeviceIntegrityResult instanceof VerifyDeviceIntegrityResult.Error)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(3:17|(2:19|20)|(1:22)(1:23)))(1:26))(2:36|(1:38)(6:40|28|29|30|(1:32)|(0)(0)))|27|28|29|30|(0)|(0)(0)))|41|6|(0)(0)|27|28|29|30|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateInquiryInternal(String str, InquirySessionConfig inquirySessionConfig, ContinuationImpl continuationImpl) {
        InquiryApiHelper$updateInquiryInternal$1 inquiryApiHelper$updateInquiryInternal$1;
        int i;
        String str2;
        GpsData gpsData;
        StateFlow stateFlow;
        if (continuationImpl instanceof InquiryApiHelper$updateInquiryInternal$1) {
            inquiryApiHelper$updateInquiryInternal$1 = (InquiryApiHelper$updateInquiryInternal$1) continuationImpl;
            int i2 = inquiryApiHelper$updateInquiryInternal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inquiryApiHelper$updateInquiryInternal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inquiryApiHelper$updateInquiryInternal$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inquiryApiHelper$updateInquiryInternal$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (inquirySessionConfig.gpsCollectionRequirement != GpsCollectionRequirement.NONE) {
                        inquiryApiHelper$updateInquiryInternal$1.L$0 = str;
                        inquiryApiHelper$updateInquiryInternal$1.label = 1;
                        obj = zzf.getLocationAndPrecision(this.applicationContext, inquiryApiHelper$updateInquiryInternal$1);
                    } else {
                        str2 = str;
                        gpsData = null;
                        Lazy lazy = ThreatEventStateKt.threatEventReceiver$delegate;
                        Object newInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
                        newInstance.getClass();
                        stateFlow = (StateFlow) newInstance;
                        if (stateFlow != null) {
                            inquiryApiHelper$updateInquiryInternal$1.L$0 = str2;
                            inquiryApiHelper$updateInquiryInternal$1.L$1 = gpsData;
                            inquiryApiHelper$updateInquiryInternal$1.label = 2;
                            obj = FlowKt.firstOrNull(stateFlow, inquiryApiHelper$updateInquiryInternal$1);
                        }
                        if (gpsData != null) {
                        }
                    }
                } else if (i == 1) {
                    str = inquiryApiHelper$updateInquiryInternal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return (InternalErrorInfo) obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gpsData = inquiryApiHelper$updateInquiryInternal$1.L$1;
                    str2 = inquiryApiHelper$updateInquiryInternal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (obj != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                    if (gpsData != null) {
                        return null;
                    }
                    Function1 inquiryApiHelper$updateInquiryInternal$updateInquiryError$1 = new InquiryApiHelper$updateInquiryInternal$updateInquiryError$1(this, str2, gpsData, null);
                    inquiryApiHelper$updateInquiryInternal$1.L$0 = null;
                    inquiryApiHelper$updateInquiryInternal$1.L$1 = null;
                    inquiryApiHelper$updateInquiryInternal$1.label = 3;
                    obj = makeInquiryCallWithRetry(inquiryApiHelper$updateInquiryInternal$updateInquiryError$1, inquiryApiHelper$updateInquiryInternal$1);
                }
                str2 = str;
                gpsData = (GpsData) obj;
                Lazy lazy2 = ThreatEventStateKt.threatEventReceiver$delegate;
                Object newInstance2 = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
                newInstance2.getClass();
                stateFlow = (StateFlow) newInstance2;
                if (stateFlow != null) {
                }
                if (gpsData != null) {
                }
            }
        }
        inquiryApiHelper$updateInquiryInternal$1 = new InquiryApiHelper$updateInquiryInternal$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$updateInquiryInternal$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$updateInquiryInternal$1.label;
        if (i != 0) {
        }
        str2 = str;
        gpsData = (GpsData) obj3;
        Lazy lazy22 = ThreatEventStateKt.threatEventReceiver$delegate;
        Object newInstance22 = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
        newInstance22.getClass();
        stateFlow = (StateFlow) newInstance22;
        if (stateFlow != null) {
        }
        if (gpsData != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifyDeviceIntegrity(String str, InquirySessionConfig inquirySessionConfig, ContinuationImpl continuationImpl) {
        InquiryApiHelper$verifyDeviceIntegrity$1 inquiryApiHelper$verifyDeviceIntegrity$1;
        int i;
        String str2;
        if (continuationImpl instanceof InquiryApiHelper$verifyDeviceIntegrity$1) {
            inquiryApiHelper$verifyDeviceIntegrity$1 = (InquiryApiHelper$verifyDeviceIntegrity$1) continuationImpl;
            int i2 = inquiryApiHelper$verifyDeviceIntegrity$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inquiryApiHelper$verifyDeviceIntegrity$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inquiryApiHelper$verifyDeviceIntegrity$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inquiryApiHelper$verifyDeviceIntegrity$1.label;
                int i3 = 19;
                PlayIntegrityHelper playIntegrityHelper = this.playIntegrityHelper;
                VerifyDeviceIntegrityResult.Success success = VerifyDeviceIntegrityResult.Success.INSTANCE;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (inquirySessionConfig.usePlayIntegrity) {
                        inquiryApiHelper$verifyDeviceIntegrity$1.L$0 = str;
                        inquiryApiHelper$verifyDeviceIntegrity$1.label = 1;
                        obj = JobKt.withContext(playIntegrityHelper.dispatcher, new HazeSourceNode$launchPreDraw$1(playIntegrityHelper, continuation, i3), inquiryApiHelper$verifyDeviceIntegrity$1);
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return success;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    InternalErrorInfo internalErrorInfo = (InternalErrorInfo) obj;
                    if (internalErrorInfo != null) {
                        return new VerifyDeviceIntegrityResult.Error(internalErrorInfo);
                    }
                    inquiryApiHelper$verifyDeviceIntegrity$1.label = 3;
                    Object withContext = JobKt.withContext(playIntegrityHelper.dispatcher, new Logger$log$1(playIntegrityHelper, continuation, i3), inquiryApiHelper$verifyDeviceIntegrity$1);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    return withContext == obj2 ? obj2 : success;
                }
                str = inquiryApiHelper$verifyDeviceIntegrity$1.L$0;
                SafeTrace.throwOnFailure(obj);
                str2 = (String) obj;
                if (str2 != null) {
                    Function1 inquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1 = new InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1(this, str, str2, null);
                    inquiryApiHelper$verifyDeviceIntegrity$1.L$0 = null;
                    inquiryApiHelper$verifyDeviceIntegrity$1.label = 2;
                    obj = makeInquiryCallWithRetry(inquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1, inquiryApiHelper$verifyDeviceIntegrity$1);
                }
            }
        }
        inquiryApiHelper$verifyDeviceIntegrity$1 = new InquiryApiHelper$verifyDeviceIntegrity$1(this, continuationImpl);
        Object obj3 = inquiryApiHelper$verifyDeviceIntegrity$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inquiryApiHelper$verifyDeviceIntegrity$1.label;
        int i32 = 19;
        PlayIntegrityHelper playIntegrityHelper2 = this.playIntegrityHelper;
        VerifyDeviceIntegrityResult.Success success2 = VerifyDeviceIntegrityResult.Success.INSTANCE;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        str2 = (String) obj3;
        if (str2 != null) {
        }
    }
}
