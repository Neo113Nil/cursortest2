package com.onesignal.core.internal.backend.impl;

import M7.j;
import M7.q;
import com.bumptech.glide.f;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import t0.AbstractC5051n;
import u4.f;
import u4.g;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements u4.b {
    public static final C0181a Companion = new C0181a(null);
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String TURBINE_FEATURES_PLATFORM_ANDROID = "android";
    private final A4.c http;

    /* renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0181a {
        public /* synthetic */ C0181a(e eVar) {
            this();
        }

        public final String buildFeatureFlagsGetPath$com_onesignal_core(String appId, String platform, String sdkVersion) {
            h.e(appId, "appId");
            h.e(platform, "platform");
            h.e(sdkVersion, "sdkVersion");
            return d.INSTANCE.buildGetPath(appId, platform, sdkVersion);
        }

        public final boolean isValidFeaturesSdkVersionLabel(String label) {
            h.e(label, "label");
            return d.INSTANCE.isValidFeaturesSdkVersionLabel(label);
        }

        private C0181a() {
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchRemoteFeatureFlags(null, this);
        }
    }

    public a(A4.c http) {
        h.e(http, "http");
        this.http = http;
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String F8 = q.F(q.F(str, '\n', ' '), '\r', ' ');
        return F8.length() <= 200 ? F8 : j.f0(200, F8).concat("…");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // u4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRemoteFeatureFlags(String str, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        a aVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    f.r(obj);
                    com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "FeatureFlagsBackendService.fetchRemoteFeatureFlags(appId=" + str + ')');
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    if (!Companion.isValidFeaturesSdkVersionLabel(sdkVersion)) {
                        com.onesignal.debug.internal.logging.b.warn$default(AbstractC5051n.b('\'', "FeatureFlagsBackendService: sdk version not usable for Turbine path (expected 6-digit label optional -suffix, e.g. 050801 or 050801-beta): '", sdkVersion), null, 2, null);
                        return f.b.INSTANCE;
                    }
                    String buildGetPath = d.INSTANCE.buildGetPath(str, TURBINE_FEATURES_PLATFORM_ANDROID, sdkVersion);
                    A4.c cVar = this.http;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(buildGetPath, null, bVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
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
                if (payload == null || j.T(payload)) {
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
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar2 = (A4.a) obj2;
        String payload2 = aVar2.getPayload();
        if (aVar2.isSuccess()) {
        }
    }
}
