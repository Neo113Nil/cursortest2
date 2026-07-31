package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.i7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1990i7 implements eq1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27115a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2085m7 f27116b;

    public C1990i7(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f27115a = adConfiguration;
        this.f27116b = new C2085m7();
    }

    @Override // com.yandex.mobile.ads.impl.eq1
    @NotNull
    public final Map<String, Object> a() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(AdRevenueScheme.AD_TYPE, this.f27115a.b().b()));
        String c4 = this.f27115a.c();
        if (c4 != null) {
            mutableMapOf.put("block_id", c4);
            mutableMapOf.put("ad_unit_id", c4);
        }
        mutableMapOf.putAll(this.f27116b.a(this.f27115a.a()).b());
        return mutableMapOf;
    }
}
