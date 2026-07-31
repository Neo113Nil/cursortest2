package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class p8 implements tc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f18612a;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f18613a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f18614b = false;

        private a() {
        }
    }

    public p8(@Nullable JSONObject jSONObject) {
        this.f18612a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.tc
    public boolean c() {
        return this.f18612a.optBoolean("clickCheck", false);
    }
}
