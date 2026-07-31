package com.onesignal.core.internal.backend.impl;

import F5.j;
import F5.q;
import U1.f;
import U1.g;
import a2.C0224a;
import com.onesignal.common.h;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements U1.b {
    public static final C0013a Companion = new C0013a(null);
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String TURBINE_FEATURES_PLATFORM_ANDROID = "android";
    private final a2.c http;

    /* renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0013a {
        public /* synthetic */ C0013a(e eVar) {
            this();
        }

        public final String buildFeatureFlagsGetPath$com_onesignal_core(String appId, String platform, String sdkVersion) {
            i.e(appId, "appId");
            i.e(platform, "platform");
            i.e(sdkVersion, "sdkVersion");
            return d.INSTANCE.buildGetPath(appId, platform, sdkVersion);
        }

        public final boolean isValidFeaturesSdkVersionLabel(String label) {
            i.e(label, "label");
            return d.INSTANCE.isValidFeaturesSdkVersionLabel(label);
        }

        private C0013a() {
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchRemoteFeatureFlags(null, this);
        }
    }

    public a(a2.c http) {
        i.e(http, "http");
        this.http = http;
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String F6 = q.F(q.F(str, '\n', ' '), '\r', ' ');
        return F6.length() <= LOG_BODY_SNIPPET_MAX_CHARS ? F6 : j.f0(F6, LOG_BODY_SNIPPET_MAX_CHARS).concat("…");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRemoteFeatureFlags(String str, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "FeatureFlagsBackendService.fetchRemoteFeatureFlags(appId=" + str + ')');
                    String sdkVersion = h.INSTANCE.getSdkVersion();
                    if (!Companion.isValidFeaturesSdkVersionLabel(sdkVersion)) {
                        com.onesignal.debug.internal.logging.b.warn$default("FeatureFlagsBackendService: sdk version not usable for Turbine path (expected 6-digit label optional -suffix, e.g. 050801 or 050801-beta): '" + sdkVersion + '\'', null, 2, null);
                        return f.b.INSTANCE;
                    }
                    String buildGetPath = d.INSTANCE.buildGetPath(str, TURBINE_FEATURES_PLATFORM_ANDROID, sdkVersion);
                    a2.c cVar = this.http;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(buildGetPath, null, bVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                String payload = c0224a.getPayload();
                if (c0224a.isSuccess()) {
                    String str2 = "FeatureFlagsBackendService: non-success status=" + c0224a.getStatusCode() + " body=" + aVar.bodySnippet(payload);
                    if (c0224a.isClientError()) {
                        com.onesignal.debug.internal.logging.b.warn$default(str2, null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default(str2, null, 2, null);
                    }
                    return f.b.INSTANCE;
                }
                if (payload == null || j.T(payload)) {
                    com.onesignal.debug.internal.logging.b.warn$default("FeatureFlagsBackendService: empty body for success status=" + c0224a.getStatusCode(), null, 2, null);
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
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        String payload2 = c0224a.getPayload();
        if (c0224a.isSuccess()) {
        }
    }
}
