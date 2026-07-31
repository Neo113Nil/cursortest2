package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import com.yandex.div.DivDataTag;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f33484a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u10 f33485b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final w10 f33486c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final s20 f33487d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2394zi f33488e;

    public /* synthetic */ v20(mp1 mp1Var) {
        this(mp1Var, new u10(mp1Var), new w10(), new s20(), new C2394zi());
    }

    @Nullable
    public final q20 a(@NotNull p00 design, boolean z4) {
        Intrinsics.checkNotNullParameter(design, "design");
        if (Intrinsics.areEqual(v00.f33455c.a(), design.d())) {
            try {
                String c4 = design.c();
                String b4 = design.b();
                if (z4) {
                    this.f33488e.getClass();
                    b4 = C2394zi.a(b4);
                }
                JSONObject jSONObject = new JSONObject(b4);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List<ej0> a4 = design.a();
                u10 u10Var = this.f33485b;
                Intrinsics.checkNotNull(jSONObject2);
                C1165z4 a5 = u10Var.a(jSONObject2, jSONObject3);
                this.f33486c.getClass();
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                DivDataTag divDataTag = new DivDataTag(uuid);
                Set<h20> a6 = this.f33487d.a(jSONObject2);
                if (a5 != null) {
                    return new q20(c4, jSONObject2, jSONObject3, a4, a5, divDataTag, a6);
                }
            } catch (Throwable th) {
                this.f33484a.reportError("Failed to parse DivKit design", th);
            }
        }
        return null;
    }

    public v20(@NotNull mp1 reporter, @NotNull u10 divDataCreator, @NotNull w10 divDataTagCreator, @NotNull s20 assetsProvider, @NotNull C2394zi base64Decoder) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divDataCreator, "divDataCreator");
        Intrinsics.checkNotNullParameter(divDataTagCreator, "divDataTagCreator");
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f33484a = reporter;
        this.f33485b = divDataCreator;
        this.f33486c = divDataTagCreator;
        this.f33487d = assetsProvider;
        this.f33488e = base64Decoder;
    }
}
