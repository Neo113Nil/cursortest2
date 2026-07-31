package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class dv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f15935a = cv.f15809a.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ie f15936b = new ie();

    @NotNull
    public final JSONObject a() {
        JSONObject a4 = this.f15936b.a(this.f15935a);
        Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a4);
    }

    @NotNull
    public final JSONObject a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject a4 = this.f15936b.a(context, this.f15935a);
        Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(a4);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b4 = je.b(jSONObject.optJSONObject(ge.f16499u));
        if (b4 != null) {
            jSONObject.put(ge.f16499u, b4);
        }
        return jSONObject;
    }
}
