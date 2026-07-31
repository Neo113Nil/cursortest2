package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f16707a = new ArrayList<>(new hc().a());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ie f16708b = new ie();

    @NotNull
    public final JSONObject a() {
        JSONObject a4 = this.f16708b.a(this.f16707a);
        Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a4;
    }
}
