package com.ironsource;

import com.ironsource.mediationsdk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class nb implements mm<String, d.a> {
    @Override // com.ironsource.mm
    @NotNull
    public d.a a(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        d.a a4 = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(a4, "getInstance().getAuction…sponse(JSONObject(input))");
        return a4;
    }
}
