package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kj0 f32759a;

    public /* synthetic */ u00() {
        this(new kj0());
    }

    @Nullable
    public final p00 a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String optString = jsonObject.optString("type");
        String optString2 = jsonObject.optString("target");
        String optString3 = jsonObject.optString("layout");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0 || optString3 == null || optString3.length() == 0) {
            return null;
        }
        JSONArray optJSONArray = jsonObject.optJSONArray("images");
        ArrayList a4 = optJSONArray != null ? this.f32759a.a(optJSONArray) : null;
        Intrinsics.checkNotNull(optString);
        Intrinsics.checkNotNull(optString2);
        Intrinsics.checkNotNull(optString3);
        return new p00(optString, optString2, optString3, a4);
    }

    public u00(@NotNull kj0 imageValuesParser) {
        Intrinsics.checkNotNullParameter(imageValuesParser, "imageValuesParser");
        this.f32759a = imageValuesParser;
    }
}
