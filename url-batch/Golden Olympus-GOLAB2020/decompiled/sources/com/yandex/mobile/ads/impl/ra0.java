package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ra0 implements InterfaceC1951gg<pa0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hj0 f31100a;

    public ra0(@NotNull hj0 imageValueParser) {
        Intrinsics.checkNotNullParameter(imageValueParser, "imageValueParser");
        this.f31100a = imageValueParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    public final pa0 a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value")) {
            return new pa0(!jsonAsset.isNull("value") ? this.f31100a.a(jsonAsset) : null);
        }
        ap0.b(new Object[0]);
        throw new i61("Native Ad json has not required attributes");
    }
}
