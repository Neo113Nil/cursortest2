package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tj1 f33154a;

    public /* synthetic */ uj1(f82 f82Var) {
        this(f82Var, new tj1(f82Var));
    }

    @NotNull
    public final ArrayList a(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    arrayList.add(this.f33154a.a(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    public uj1(@NotNull f82 urlJsonParser, @NotNull tj1 preferredPackageParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(preferredPackageParser, "preferredPackageParser");
        this.f33154a = preferredPackageParser;
    }
}
