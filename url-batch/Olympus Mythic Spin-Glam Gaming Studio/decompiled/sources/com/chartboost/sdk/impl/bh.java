package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bh implements bi {
    public static final a b = new a(null);
    public final zg a;

    public bh(zg session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = session;
    }

    @Override // com.chartboost.sdk.impl.bi
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        ah i = this.a.i();
        jSONObject.put("session_duration", (int) RangesKt.coerceAtMost(i.b() / 1000, 2147483647L));
        jSONObject.put("impression_depth_interstitial", i.d());
        jSONObject.put("impression_depth_rewarded", i.e());
        jSONObject.put("impression_depth_banner", i.a());
        return jSONObject;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
