package com.chartboost.sdk.impl;

import com.ironsource.C4538a2;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class df implements bi {
    public static final a b = new a(null);
    public final bf a;

    public df(bf privacyApi) {
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.a = privacyApi;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.bi
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        cf g = this.a.g();
        Integer d = g.d();
        if (d != null) {
            jSONObject.put("coppa", d.intValue());
        }
        Integer e = g.e();
        if (e != null) {
            jSONObject.put("gdpr", e.intValue());
        }
        Integer c = g.c();
        if (c != null) {
            jSONObject.put("consent", c.intValue());
        }
        String h = g.h();
        if (h != null) {
            if (StringsKt.isBlank(h)) {
                h = null;
            }
            if (h != null) {
                jSONObject.put("tcf", h);
            }
        }
        String f = g.f();
        if (f != null) {
            if (StringsKt.isBlank(f) || Intrinsics.areEqual(f, C4538a2.f)) {
                f = null;
            }
            if (f != null) {
                jSONObject.put("us_privacy", f);
            }
        }
        String b2 = g.b();
        if (b2 != null) {
            if (StringsKt.isBlank(b2)) {
                b2 = null;
            }
            if (b2 != null) {
                jSONObject.put("gpp", b2);
            }
        }
        String a2 = g.a();
        if (a2 != null) {
            String str = StringsKt.isBlank(a2) ? null : a2;
            if (str != null) {
                jSONObject.put(POBConstants.KEY_GPP_SID, str);
            }
        }
        return jSONObject;
    }
}
