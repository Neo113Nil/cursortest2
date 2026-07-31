package com.yandex.mobile.ads.impl;

import D2.AbstractC0348a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2.AbstractC3551a;

/* renamed from: com.yandex.mobile.ads.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2167pk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gz0 f30473a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC0348a f30474b;

    public /* synthetic */ C2167pk() {
        this(new gz0(), dq0.a());
    }

    @Nullable
    public final C2063l9 a(@NotNull JSONObject adUnitIdBiddingSettingsJson) {
        String a4;
        Intrinsics.checkNotNullParameter(adUnitIdBiddingSettingsJson, "adUnitIdBiddingSettingsJson");
        try {
            try {
                a4 = dq0.a("ad_unit_id", adUnitIdBiddingSettingsJson);
            } catch (JSONException unused) {
                a4 = dq0.a("block_id", adUnitIdBiddingSettingsJson);
            }
            JSONArray optJSONArray = adUnitIdBiddingSettingsJson.optJSONArray(com.ironsource.ge.f16516z1);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i4);
                    gz0 gz0Var = this.f30473a;
                    Intrinsics.checkNotNull(jSONObject);
                    xy0 a5 = gz0Var.a(jSONObject);
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String jSONObject2 = adUnitIdBiddingSettingsJson.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                    return new C2063l9(a4, jSONObject2, arrayList);
                }
            }
        } catch (JSONException unused2) {
            ap0.b(new Object[0]);
        }
        return null;
    }

    @Nullable
    public final C2144ok b(@NotNull JSONObject jsonBiddingSettings) {
        JSONObject jSONObject;
        tz0 tz0Var;
        String jSONObject2;
        Intrinsics.checkNotNullParameter(jsonBiddingSettings, "jsonBiddingSettings");
        try {
            jSONObject = jsonBiddingSettings.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject = null;
        }
        try {
            JSONArray optJSONArray = jsonBiddingSettings.optJSONArray("ad_unit_id_settings");
            if (optJSONArray == null) {
                optJSONArray = jsonBiddingSettings.optJSONArray("block_id_settings");
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i4);
                    Intrinsics.checkNotNull(jSONObject3);
                    C2063l9 a4 = a(jSONObject3);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                }
            }
            if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
                AbstractC0348a abstractC0348a = this.f30474b;
                abstractC0348a.a();
                tz0Var = (tz0) abstractC0348a.c(AbstractC3551a.t(tz0.Companion.serializer()), jSONObject2);
                if (arrayList.isEmpty() || tz0Var != null) {
                    return new C2144ok(arrayList, tz0Var);
                }
                return null;
            }
            tz0Var = null;
            if (arrayList.isEmpty()) {
            }
            return new C2144ok(arrayList, tz0Var);
        } catch (JSONException unused2) {
            ap0.b(new Object[0]);
            return null;
        }
    }

    public C2167pk(@NotNull gz0 mediationNetworkParser, @NotNull AbstractC0348a jsonParser) {
        Intrinsics.checkNotNullParameter(mediationNetworkParser, "mediationNetworkParser");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.f30473a = mediationNetworkParser;
        this.f30474b = jsonParser;
    }
}
