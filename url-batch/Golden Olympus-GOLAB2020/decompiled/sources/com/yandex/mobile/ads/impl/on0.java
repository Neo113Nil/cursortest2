package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class on0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30112a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fn0 f30113b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<fn0> f30114c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final oc2 f30115d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final dd2 f30116e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final kl0 f30117f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final JSONObject f30118g;

    /* renamed from: h, reason: collision with root package name */
    private final long f30119h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<k70> f30120i;

    public on0(@NotNull String videoAdId, @NotNull fn0 recommendedMediaFile, @NotNull ArrayList mediaFiles, @NotNull oc2 adPodInfo, @Nullable dd2 dd2Var, @NotNull kl0 adInfo, @Nullable JSONObject jSONObject, long j4, @NotNull List extensions) {
        Intrinsics.checkNotNullParameter(videoAdId, "videoAdId");
        Intrinsics.checkNotNullParameter(recommendedMediaFile, "recommendedMediaFile");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f30112a = videoAdId;
        this.f30113b = recommendedMediaFile;
        this.f30114c = mediaFiles;
        this.f30115d = adPodInfo;
        this.f30116e = dd2Var;
        this.f30117f = adInfo;
        this.f30118g = jSONObject;
        this.f30119h = j4;
        this.f30120i = extensions;
    }

    @NotNull
    public final kl0 a() {
        return this.f30117f;
    }

    @NotNull
    public final oc2 b() {
        return this.f30115d;
    }

    public final long c() {
        return this.f30119h;
    }

    @NotNull
    public final List<k70> d() {
        return this.f30120i;
    }

    @Nullable
    public final JSONObject e() {
        return this.f30118g;
    }

    @NotNull
    public final List<fn0> f() {
        return this.f30114c;
    }

    @NotNull
    public final fn0 g() {
        return this.f30113b;
    }

    @Nullable
    public final dd2 h() {
        return this.f30116e;
    }

    @NotNull
    public final String toString() {
        return this.f30112a;
    }
}
