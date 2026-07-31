package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kj0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wi0 f28214a;

    public /* synthetic */ kj0() {
        this(new wi0());
    }

    @NotNull
    public final ArrayList a(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            wi0 wi0Var = this.f28214a;
            JSONObject jSONObject = jsonArray.getJSONObject(i4);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(wi0Var.b(jSONObject));
        }
        return arrayList;
    }

    public kj0(@NotNull wi0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f28214a = imageParser;
    }
}
