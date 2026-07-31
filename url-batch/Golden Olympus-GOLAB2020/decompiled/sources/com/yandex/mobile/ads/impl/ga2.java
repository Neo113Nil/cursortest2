package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ga2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bb2 f26080a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hu f26081b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mv0 f26082c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final w02 f26083d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f26084e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final JSONObject f26085f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final C1944g9 f26086g;

    public ga2(@NotNull bb2 videoAd, @NotNull hu creative, @NotNull mv0 mediaFile, @Nullable w02 w02Var, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable C1944g9 c1944g9) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        this.f26080a = videoAd;
        this.f26081b = creative;
        this.f26082c = mediaFile;
        this.f26083d = w02Var;
        this.f26084e = str;
        this.f26085f = jSONObject;
        this.f26086g = c1944g9;
    }

    @Nullable
    public final C1944g9 a() {
        return this.f26086g;
    }

    @NotNull
    public final hu b() {
        return this.f26081b;
    }

    @NotNull
    public final mv0 c() {
        return this.f26082c;
    }

    @Nullable
    public final w02 d() {
        return this.f26083d;
    }

    @NotNull
    public final bb2 e() {
        return this.f26080a;
    }

    @Nullable
    public final String f() {
        return this.f26084e;
    }

    @Nullable
    public final JSONObject g() {
        return this.f26085f;
    }
}
