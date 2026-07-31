package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class oi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f18519a = new ArrayList<>(new ni().a());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ie f18520b = new ie();

    @NotNull
    public final JSONObject a() {
        JSONObject a4 = this.f18520b.a(this.f18519a);
        Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return a4;
    }
}
