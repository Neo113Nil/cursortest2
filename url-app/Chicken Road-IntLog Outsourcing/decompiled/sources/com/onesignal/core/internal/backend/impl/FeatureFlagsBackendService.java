package com.onesignal.core.internal.backend.impl;

import B0.o;
import B4.k;
import B4.r;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.core.internal.backend.IFeatureFlagsBackendService;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsFetchOutcome;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsResult;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class FeatureFlagsBackendService implements IFeatureFlagsBackendService {
    public static final Companion Companion = new Companion(null);
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String TURBINE_FEATURES_PLATFORM_ANDROID = "android";
    private final IHttpClient http;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String buildFeatureFlagsGetPath$com_onesignal_core(String appId, String platform, String sdkVersion) {
            i.e(appId, "appId");
            i.e(platform, "platform");
            i.e(sdkVersion, "sdkVersion");
            return TurbineSdkFeatureFlagsPath.INSTANCE.buildGetPath(appId, platform, sdkVersion);
        }

        public final boolean isValidFeaturesSdkVersionLabel(String label) {
            i.e(label, "label");
            return TurbineSdkFeatureFlagsPath.INSTANCE.isValidFeaturesSdkVersionLabel(label);
        }

        private Companion() {
        }
    }

    public FeatureFlagsBackendService(IHttpClient http) {
        i.e(http, "http");
        this.http = http;
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String L5 = r.L(r.L(str, '\n', ' '), '\r', ' ');
        return L5.length() <= LOG_BODY_SNIPPET_MAX_CHARS ? L5 : k.l0(LOG_BODY_SNIPPET_MAX_CHARS, L5).concat("…");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.onesignal.core.internal.backend.IFeatureFlagsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRemoteFeatureFlags(String str, InterfaceC1218d interfaceC1218d) {
        FeatureFlagsBackendService$fetchRemoteFeatureFlags$1 featureFlagsBackendService$fetchRemoteFeatureFlags$1;
        int i2;
        FeatureFlagsBackendService featureFlagsBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof FeatureFlagsBackendService$fetchRemoteFeatureFlags$1) {
            featureFlagsBackendService$fetchRemoteFeatureFlags$1 = (FeatureFlagsBackendService$fetchRemoteFeatureFlags$1) interfaceC1218d;
            int i3 = featureFlagsBackendService$fetchRemoteFeatureFlags$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                featureFlagsBackendService$fetchRemoteFeatureFlags$1.label = i3 - Integer.MIN_VALUE;
                Object obj = featureFlagsBackendService$fetchRemoteFeatureFlags$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = featureFlagsBackendService$fetchRemoteFeatureFlags$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.log(LogLevel.DEBUG, "FeatureFlagsBackendService.fetchRemoteFeatureFlags(appId=" + str + ')');
                    String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
                    if (!Companion.isValidFeaturesSdkVersionLabel(sdkVersion)) {
                        Logging.warn$default(o.j("FeatureFlagsBackendService: sdk version not usable for Turbine path (expected 6-digit label optional -suffix, e.g. 050801 or 050801-beta): '", sdkVersion, '\''), null, 2, null);
                        return RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE;
                    }
                    String buildGetPath = TurbineSdkFeatureFlagsPath.INSTANCE.buildGetPath(str, "android", sdkVersion);
                    IHttpClient iHttpClient = this.http;
                    featureFlagsBackendService$fetchRemoteFeatureFlags$1.L$0 = this;
                    featureFlagsBackendService$fetchRemoteFeatureFlags$1.label = 1;
                    obj = iHttpClient.get(buildGetPath, null, featureFlagsBackendService$fetchRemoteFeatureFlags$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    featureFlagsBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    featureFlagsBackendService = (FeatureFlagsBackendService) featureFlagsBackendService$fetchRemoteFeatureFlags$1.L$0;
                    g.y(obj);
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
                if (payload == null || k.Z(payload)) {
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
        featureFlagsBackendService$fetchRemoteFeatureFlags$1 = new FeatureFlagsBackendService$fetchRemoteFeatureFlags$1(this, interfaceC1218d);
        Object obj2 = featureFlagsBackendService$fetchRemoteFeatureFlags$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = featureFlagsBackendService$fetchRemoteFeatureFlags$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        String payload2 = httpResponse.getPayload();
        if (httpResponse.isSuccess()) {
        }
    }
}
