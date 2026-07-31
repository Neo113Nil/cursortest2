package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vy0 f26396a;

    public /* synthetic */ gz0() {
        this(new vy0());
    }

    @Nullable
    public final xy0 a(@NotNull JSONObject jsonAsset) {
        C1795a4 c1795a4;
        String string;
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonMediationNetwork");
        try {
            String a4 = dq0.a(com.ironsource.ge.f16389B1, jsonAsset);
            Intrinsics.checkNotNullParameter(jsonAsset, "parent");
            Intrinsics.checkNotNullParameter("network_data", "name");
            JSONObject jSONObject = jsonAsset.getJSONObject("network_data");
            Map createMapBuilder = MapsKt.createMapBuilder();
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNull(next);
                String string2 = jSONObject.getString(next);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                createMapBuilder.put(next, string2);
            }
            Map build = MapsKt.build(createMapBuilder);
            if (build.isEmpty()) {
                return null;
            }
            List c4 = dq0.c("click_tracking_urls", jsonAsset);
            List c5 = dq0.c("impression_tracking_urls", jsonAsset);
            List c6 = dq0.c("ad_response_tracking_urls", jsonAsset);
            Map a5 = dq0.a(jsonAsset);
            if (jsonAsset.has("impression_data")) {
                this.f26396a.getClass();
                Intrinsics.checkNotNullParameter(jsonAsset, "jsonObject");
                Intrinsics.checkNotNullParameter("impression_data", "attributeName");
                try {
                    Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
                    Intrinsics.checkNotNullParameter("impression_data", "jsonAttribute");
                    string = jsonAsset.getString("impression_data");
                    Intrinsics.checkNotNull(string);
                } catch (Exception unused) {
                    ap0.b(new Object[0]);
                }
                if (string.length() == 0 || Intrinsics.areEqual("null", string)) {
                    throw new JSONException("Json has not required attributes");
                }
                c1795a4 = new C1795a4(string);
                return new xy0(a4, build, c5, c4, c6, c1795a4, a5);
            }
            c1795a4 = null;
            return new xy0(a4, build, c5, c4, c6, c1795a4, a5);
        } catch (JSONException unused2) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    public gz0(@NotNull vy0 impressionDataParser) {
        Intrinsics.checkNotNullParameter(impressionDataParser, "impressionDataParser");
        this.f26396a = impressionDataParser;
    }
}
