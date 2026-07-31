package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class o8 implements tc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f18491a;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f18492a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f18493b = false;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f18494c = "curlError";

        private a() {
        }
    }

    public o8(@Nullable JSONObject jSONObject) {
        this.f18491a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.tc
    public boolean c() {
        return this.f18491a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f18491a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f18491a.optBoolean("reportController", true);
    }
}
