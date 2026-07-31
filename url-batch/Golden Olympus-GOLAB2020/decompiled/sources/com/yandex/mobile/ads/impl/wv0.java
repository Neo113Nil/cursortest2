package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wv0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d92 f34192a;

    public wv0(@NotNull d92 valueReader) {
        Intrinsics.checkNotNullParameter(valueReader, "valueReader");
        this.f34192a = valueReader;
    }

    public final Object a(JSONObject jsonValue) {
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        String a4 = this.f34192a.a("html", jsonValue);
        float f4 = (float) jsonValue.getDouble("aspectRatio");
        if (f4 == 0.0f) {
            f4 = 1.7777778f;
        }
        return new eu0(a4, f4);
    }
}
