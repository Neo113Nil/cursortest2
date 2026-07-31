package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class qi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f18862a = new ArrayList<>(new pi().a());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ie f18863b = new ie();

    @NotNull
    public final JSONObject a() {
        JSONObject a4 = this.f18863b.a(this.f18862a);
        Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return a4;
    }
}
