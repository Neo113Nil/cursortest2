package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final er0 f29830a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q02 f29831b;

    public /* synthetic */ o02(er0 er0Var) {
        this(er0Var, new q02());
    }

    @NotNull
    public final n02 a(@NotNull JSONObject jsonObject, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        String a4 = w81.a(jsonObject, "jsonAsset", "name", "jsonAttribute", "name");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        JSONObject jSONObject = jsonObject.getJSONObject("link");
        er0 er0Var = this.f29830a;
        Intrinsics.checkNotNull(jSONObject);
        dr0 a5 = er0Var.a(jSONObject, base64EncodingParameters);
        JSONObject jSONObject2 = jsonObject.getJSONObject("value");
        q02 q02Var = this.f29831b;
        Intrinsics.checkNotNull(jSONObject2);
        return new n02(a5, a4, q02Var.a(jSONObject2));
    }

    public o02(@NotNull er0 linkJsonParser, @NotNull q02 valueParser) {
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        Intrinsics.checkNotNullParameter(valueParser, "valueParser");
        this.f29830a = linkJsonParser;
        this.f29831b = valueParser;
    }
}
