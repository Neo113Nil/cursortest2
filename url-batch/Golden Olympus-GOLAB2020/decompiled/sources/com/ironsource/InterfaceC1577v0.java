package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1577v0 {

    @Metadata
    /* renamed from: com.ironsource.v0$a */
    public static final class a implements InterfaceC1577v0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONObject f19978a;

        public a(@NotNull JSONObject applicationConfig) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.f19978a = applicationConfig;
        }

        @Override // com.ironsource.InterfaceC1577v0
        @NotNull
        public JSONObject a() {
            JSONObject optJSONObject = this.f19978a.optJSONObject("controllerConfig");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        @Override // com.ironsource.InterfaceC1577v0
        public int b() {
            int optInt = this.f19978a.optInt("debugMode", 0);
            if (this.f19978a.optBoolean(b.f19983e, false)) {
                return 3;
            }
            return optInt;
        }

        @Override // com.ironsource.InterfaceC1577v0
        @NotNull
        public String c() {
            String optString = this.f19978a.optString("controllerUrl");
            return optString == null ? "" : optString;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.v0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f19979a = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f19980b = "controllerUrl";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f19981c = "controllerConfig";

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f19982d = "debugMode";

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f19983e = "adptDebugMode";

        private b() {
        }
    }

    @NotNull
    JSONObject a();

    int b();

    @NotNull
    String c();
}
