package com.ironsource;

import com.ironsource.ge;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1436b5 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final ge.a f15259a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f15260b = new ArrayList<>(new C1605z4().a());

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ie f15261c = new ie();

    public C1436b5(@Nullable ge.a aVar) {
        this.f15259a = aVar;
    }

    @NotNull
    public final JSONObject a() {
        ge.a aVar = this.f15259a;
        JSONObject a4 = aVar != null ? this.f15261c.a(this.f15260b, aVar) : null;
        if (a4 == null) {
            a4 = this.f15261c.a(this.f15260b);
            Intrinsics.checkNotNullExpressionValue(a4, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
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
