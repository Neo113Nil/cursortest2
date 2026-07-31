package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2180qa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f30716a;

    /* renamed from: com.yandex.mobile.ads.impl.qa$a */
    static final class a extends kotlin.jvm.internal.s implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f30717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(0);
            this.f30717b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            JSONObject additionalInfoJson = this.f30717b;
            Intrinsics.checkNotNullExpressionValue(additionalInfoJson, "$additionalInfoJson");
            return eq0.a("skuId", additionalInfoJson);
        }
    }

    public C2180qa(@NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f30716a = reporter;
    }

    @Nullable
    public final C2157pa a(@NotNull JSONObject jsonNativeAd, @NotNull zq1 currentAdType) {
        Intrinsics.checkNotNullParameter(jsonNativeAd, "jsonNativeAd");
        Intrinsics.checkNotNullParameter(currentAdType, "currentAdType");
        try {
            JSONObject jSONObject = jsonNativeAd.getJSONObject("additionalInfo");
            zq1 zq1Var = zq1.f35750e;
            Object invoke = new a(jSONObject).invoke();
            if (currentAdType == zq1Var && invoke == null) {
                throw new i61("Native Ad json has not required attributes");
            }
            return new C2157pa((String) invoke);
        } catch (i61 e4) {
            this.f30716a.reportError("Failed to create AdInfo", e4);
            return null;
        }
    }
}
