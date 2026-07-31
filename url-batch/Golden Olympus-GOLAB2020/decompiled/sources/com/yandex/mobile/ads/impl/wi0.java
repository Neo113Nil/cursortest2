package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f82 f34077a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g02 f34078b;

    public /* synthetic */ wi0() {
        this(new f82(), new g02());
    }

    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ej0 b(@NotNull JSONObject imageObject) {
        f02 f02Var;
        Intrinsics.checkNotNullParameter(imageObject, "imageObject");
        int i4 = imageObject.getInt("w");
        int i5 = imageObject.getInt("h");
        this.f34077a.getClass();
        String a4 = f82.a("url", imageObject);
        if (imageObject.has("smartCenterSettings")) {
            g02 g02Var = this.f34078b;
            JSONObject jSONObject = imageObject.getJSONObject("smartCenterSettings");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            f02Var = g02Var.a(jSONObject);
        } else {
            f02Var = null;
        }
        String optString = imageObject.optString("sizeType");
        Intrinsics.checkNotNull(optString);
        if (optString.length() <= 0) {
            optString = null;
        }
        boolean optBoolean = imageObject.optBoolean("preload", true);
        String optString2 = imageObject.optString("preview");
        Intrinsics.checkNotNull(optString2);
        return new ej0(i4, i5, a4, optString, f02Var, optBoolean, optString2.length() > 0 ? optString2 : null);
    }

    public wi0(@NotNull f82 urlJsonParser, @NotNull g02 smartCenterSettingsParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(smartCenterSettingsParser, "smartCenterSettingsParser");
        this.f34077a = urlJsonParser;
        this.f34078b = smartCenterSettingsParser;
    }
}
