package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hj0 implements InterfaceC1951gg<ej0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wi0 f26770a;

    public /* synthetic */ hj0() {
        this(new wi0());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ej0 a(@NotNull JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (!jsonAsset.has("value") || jsonAsset.isNull("value")) {
            ap0.b(new Object[0]);
            throw new i61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject("value");
        wi0 wi0Var = this.f26770a;
        Intrinsics.checkNotNull(jSONObject);
        return wi0Var.b(jSONObject);
    }

    public hj0(@NotNull wi0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f26770a = imageParser;
    }
}
