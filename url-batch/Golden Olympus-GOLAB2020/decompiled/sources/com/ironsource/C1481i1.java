package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1481i1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f16650a = new ArrayList<>(new C1474h1().a());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ie f16651b = new ie();

    @NotNull
    public final JSONObject a() {
        JSONObject a4 = this.f16651b.a(this.f16650a);
        Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return a4;
    }
}
