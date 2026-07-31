package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ly implements InterfaceC2329x<jy> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f82 f28798a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uj1 f28799b;

    public ly(@NotNull f82 urlJsonParser, @NotNull uj1 preferredPackagesParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(preferredPackagesParser, "preferredPackagesParser");
        this.f28798a = urlJsonParser;
        this.f28799b = preferredPackagesParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2329x
    public final jy a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a4 = w81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a4);
        this.f28798a.getClass();
        return new jy(a4, f82.a("fallbackUrl", jsonObject), this.f28799b.a(jsonObject.optJSONArray("preferredPackages")));
    }
}
