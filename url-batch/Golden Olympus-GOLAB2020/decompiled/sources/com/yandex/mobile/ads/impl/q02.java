package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q02 implements InterfaceC1951gg<p02> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wi0 f30630a;

    public /* synthetic */ q02() {
        this(new wi0());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1951gg
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p02 a(@NotNull JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String a4 = w81.a(jsonAsset, "jsonAsset", b9.h.f15436D0, "jsonAttribute", b9.h.f15436D0);
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        JSONObject jSONObject = jsonAsset.getJSONObject("image");
        wi0 wi0Var = this.f30630a;
        Intrinsics.checkNotNull(jSONObject);
        return new p02(wi0Var.b(jSONObject), a4);
    }

    public q02(@NotNull wi0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f30630a = imageParser;
    }
}
