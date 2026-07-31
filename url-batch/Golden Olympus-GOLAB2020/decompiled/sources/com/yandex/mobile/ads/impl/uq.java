package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zk0 f33228a;

    public /* synthetic */ uq() {
        this(new zk0());
    }

    @NotNull
    public final xa0 a(@NotNull String conditionKey, @NotNull JSONObject jsonNativeAd) {
        Intrinsics.checkNotNullParameter(jsonNativeAd, "jsonNativeAd");
        Intrinsics.checkNotNullParameter(conditionKey, "conditionKey");
        JSONObject jSONObject = jsonNativeAd.getJSONObject(conditionKey);
        zk0 zk0Var = this.f33228a;
        Intrinsics.checkNotNull(jSONObject);
        return new xa0(zk0Var.a(jSONObject));
    }

    public uq(@NotNull zk0 installedPackagesJsonParser) {
        Intrinsics.checkNotNullParameter(installedPackagesJsonParser, "installedPackagesJsonParser");
        this.f33228a = installedPackagesJsonParser;
    }
}
