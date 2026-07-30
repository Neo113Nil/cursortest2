package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.p;
import kotlin.text.t;
import w2.f;
import w2.g;

/* loaded from: classes.dex */
public final class a implements w2.b {
    public static final C0012a Companion = new C0012a(null);
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String TURBINE_FEATURES_PLATFORM_ANDROID = "android";
    private final C2.c http;

    /* renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0012a {
        public /* synthetic */ C0012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String buildFeatureFlagsGetPath$com_onesignal_core(String appId, String platform, String sdkVersion) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return d.INSTANCE.buildGetPath(appId, platform, sdkVersion);
        }

        public final boolean isValidFeaturesSdkVersionLabel(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return d.INSTANCE.isValidFeaturesSdkVersionLabel(label);
        }

        private C0012a() {
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchRemoteFeatureFlags(null, this);
        }
    }

    public a(C2.c http) {
        Intrinsics.checkNotNullParameter(http, "http");
        this.http = http;
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String i2 = p.i(p.i(str, '\n', ' '), '\r', ' ');
        if (i2.length() <= LOG_BODY_SNIPPET_MAX_CHARS) {
            return i2;
        }
        return t.s(LOG_BODY_SNIPPET_MAX_CHARS, i2) + (char) 8230;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // w2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRemoteFeatureFlags(String str, V5.b bVar) {
        b bVar2;
        int i2;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "FeatureFlagsBackendService.fetchRemoteFeatureFlags(appId=" + str + ')');
                    String sdkVersion = h.INSTANCE.getSdkVersion();
                    if (!Companion.isValidFeaturesSdkVersionLabel(sdkVersion)) {
                        com.onesignal.debug.internal.logging.b.warn$default(C4.p.i("FeatureFlagsBackendService: sdk version not usable for Turbine path (expected 6-digit label optional -suffix, e.g. 050801 or 050801-beta): '", sdkVersion, '\''), null, 2, null);
                        return f.b.INSTANCE;
                    }
                    String buildGetPath = d.INSTANCE.buildGetPath(str, TURBINE_FEATURES_PLATFORM_ANDROID, sdkVersion);
                    C2.c cVar = this.http;
                    bVar2.L$0 = this;
                    bVar2.label = 1;
                    obj = cVar.get(buildGetPath, null, bVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                String payload = aVar2.getPayload();
                if (aVar2.isSuccess()) {
                    String str2 = "FeatureFlagsBackendService: non-success status=" + aVar2.getStatusCode() + " body=" + aVar.bodySnippet(payload);
                    if (aVar2.isClientError()) {
                        com.onesignal.debug.internal.logging.b.warn$default(str2, null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default(str2, null, 2, null);
                    }
                    return f.b.INSTANCE;
                }
                if (payload == null || StringsKt.z(payload)) {
                    com.onesignal.debug.internal.logging.b.warn$default("FeatureFlagsBackendService: empty body for success status=" + aVar2.getStatusCode(), null, 2, null);
                    return f.b.INSTANCE;
                }
                g parseSuccessful = com.onesignal.core.internal.backend.impl.b.INSTANCE.parseSuccessful(payload);
                if (parseSuccessful != null) {
                    return new f.a(parseSuccessful);
                }
                com.onesignal.debug.internal.logging.b.warn$default("FeatureFlagsBackendService: response body is not valid Turbine feature-flags JSON: " + aVar.bodySnippet(payload), null, 2, null);
                return f.b.INSTANCE;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        String payload2 = aVar2.getPayload();
        if (aVar2.isSuccess()) {
        }
    }
}
