package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2366yd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35077a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35078b;

    public C2366yd(@NotNull EnumC2389zd appAdAnalyticsReportType, @NotNull JSONObject payloadJson) {
        Intrinsics.checkNotNullParameter(appAdAnalyticsReportType, "appAdAnalyticsReportType");
        Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
        this.f35077a = appAdAnalyticsReportType.a();
        String jSONObject = payloadJson.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        this.f35078b = jSONObject;
    }

    @NotNull
    public final String a() {
        return this.f35077a;
    }

    @NotNull
    public final String b() {
        return this.f35078b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2366yd)) {
            return false;
        }
        C2366yd c2366yd = (C2366yd) obj;
        return Intrinsics.areEqual(c2366yd.f35077a, this.f35077a) && Intrinsics.areEqual(c2366yd.f35078b, this.f35078b);
    }

    public final int hashCode() {
        return this.f35078b.hashCode() + (this.f35077a.hashCode() * 31);
    }
}
