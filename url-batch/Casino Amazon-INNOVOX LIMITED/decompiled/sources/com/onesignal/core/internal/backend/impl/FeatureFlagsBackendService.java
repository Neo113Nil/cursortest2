package com.onesignal.core.internal.backend.impl;

import com.google.firebase.messaging.Constants;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.backend.IFeatureFlagsBackendService;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsFetchOutcome;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsResult;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* compiled from: FeatureFlagsBackendService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onesignal/core/internal/backend/impl/FeatureFlagsBackendService;", "Lcom/onesignal/core/internal/backend/IFeatureFlagsBackendService;", "http", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "bodySnippet", "", "body", "fetchRemoteFeatureFlags", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome;", "appId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureFlagsBackendService implements IFeatureFlagsBackendService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String TURBINE_FEATURES_PLATFORM_ANDROID = "android";
    private final IHttpClient http;

    public FeatureFlagsBackendService(IHttpClient http) {
        Intrinsics.checkNotNullParameter(http, "http");
        this.http = http;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.core.internal.backend.IFeatureFlagsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRemoteFeatureFlags(String str, Continuation<? super RemoteFeatureFlagsFetchOutcome> continuation) {
        FeatureFlagsBackendService$fetchRemoteFeatureFlags$1 featureFlagsBackendService$fetchRemoteFeatureFlags$1;
        int i;
        FeatureFlagsBackendService featureFlagsBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof FeatureFlagsBackendService$fetchRemoteFeatureFlags$1) {
            featureFlagsBackendService$fetchRemoteFeatureFlags$1 = (FeatureFlagsBackendService$fetchRemoteFeatureFlags$1) continuation;
            if ((featureFlagsBackendService$fetchRemoteFeatureFlags$1.label & Integer.MIN_VALUE) != 0) {
                featureFlagsBackendService$fetchRemoteFeatureFlags$1.label -= Integer.MIN_VALUE;
                Object obj = featureFlagsBackendService$fetchRemoteFeatureFlags$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = featureFlagsBackendService$fetchRemoteFeatureFlags$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.log(LogLevel.DEBUG, "FeatureFlagsBackendService.fetchRemoteFeatureFlags(appId=" + str + ')');
                    String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
                    if (!INSTANCE.isValidFeaturesSdkVersionLabel(sdkVersion)) {
                        Logging.warn$default("FeatureFlagsBackendService: sdk version not usable for Turbine path (expected 6-digit label optional -suffix, e.g. 050801 or 050801-beta): '" + sdkVersion + '\'', null, 2, null);
                        return RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE;
                    }
                    String buildGetPath = TurbineSdkFeatureFlagsPath.INSTANCE.buildGetPath(str, "android", sdkVersion);
                    IHttpClient iHttpClient = this.http;
                    featureFlagsBackendService$fetchRemoteFeatureFlags$1.L$0 = this;
                    featureFlagsBackendService$fetchRemoteFeatureFlags$1.label = 1;
                    obj = iHttpClient.get(buildGetPath, null, featureFlagsBackendService$fetchRemoteFeatureFlags$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    featureFlagsBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    featureFlagsBackendService = (FeatureFlagsBackendService) featureFlagsBackendService$fetchRemoteFeatureFlags$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                String payload = httpResponse.getPayload();
                if (httpResponse.isSuccess()) {
                    String str2 = "FeatureFlagsBackendService: non-success status=" + httpResponse.getStatusCode() + " body=" + featureFlagsBackendService.bodySnippet(payload);
                    if (httpResponse.isClientError()) {
                        Logging.warn$default(str2, null, 2, null);
                    } else {
                        Logging.debug$default(str2, null, 2, null);
                    }
                    return RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE;
                }
                String str3 = payload;
                if (str3 == null || StringsKt.isBlank(str3)) {
                    Logging.warn$default("FeatureFlagsBackendService: empty body for success status=" + httpResponse.getStatusCode(), null, 2, null);
                    return RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE;
                }
                RemoteFeatureFlagsResult parseSuccessful = FeatureFlagsJsonParser.INSTANCE.parseSuccessful(payload);
                if (parseSuccessful != null) {
                    return new RemoteFeatureFlagsFetchOutcome.Success(parseSuccessful);
                }
                Logging.warn$default("FeatureFlagsBackendService: response body is not valid Turbine feature-flags JSON: " + featureFlagsBackendService.bodySnippet(payload), null, 2, null);
                return RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE;
            }
        }
        featureFlagsBackendService$fetchRemoteFeatureFlags$1 = new FeatureFlagsBackendService$fetchRemoteFeatureFlags$1(this, continuation);
        Object obj2 = featureFlagsBackendService$fetchRemoteFeatureFlags$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = featureFlagsBackendService$fetchRemoteFeatureFlags$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        String payload2 = httpResponse.getPayload();
        if (httpResponse.isSuccess()) {
        }
    }

    private final String bodySnippet(String body) {
        String str = body;
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(body, '\n', ' ', false, 4, (Object) null), '\r', ' ', false, 4, (Object) null);
        return replace$default.length() <= 200 ? replace$default : StringsKt.take(replace$default, 200) + Typography.ellipsis;
    }

    /* compiled from: FeatureFlagsBackendService.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onesignal/core/internal/backend/impl/FeatureFlagsBackendService$Companion;", "", "()V", "LOG_BODY_SNIPPET_MAX_CHARS", "", "TURBINE_FEATURES_PLATFORM_ANDROID", "", "buildFeatureFlagsGetPath", "appId", "platform", "sdkVersion", "buildFeatureFlagsGetPath$com_onesignal_core", "isValidFeaturesSdkVersionLabel", "", Constants.ScionAnalytics.PARAM_LABEL, BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isValidFeaturesSdkVersionLabel(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return TurbineSdkFeatureFlagsPath.INSTANCE.isValidFeaturesSdkVersionLabel(label);
        }

        public final String buildFeatureFlagsGetPath$com_onesignal_core(String appId, String platform, String sdkVersion) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return TurbineSdkFeatureFlagsPath.INSTANCE.buildGetPath(appId, platform, sdkVersion);
        }
    }
}
