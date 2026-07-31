package com.chartboost.sdk.impl;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t5 {
    public static final a e = new a(null);
    public final p1 a;
    public final String b;
    public final boolean c;
    public final List d;

    public t5(p1 p1Var, String str, boolean z, List clickTrackers) {
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        this.a = p1Var;
        this.b = str;
        this.c = z;
        this.d = clickTrackers;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return Intrinsics.areEqual(this.a, t5Var.a) && Intrinsics.areEqual(this.b, t5Var.b) && this.c == t5Var.c && Intrinsics.areEqual(this.d, t5Var.d);
    }

    public int hashCode() {
        p1 p1Var = this.a;
        int hashCode = (p1Var == null ? 0 : p1Var.hashCode()) * 31;
        String str = this.b;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CtaConfig(appInstallButton=" + this.a + ", buttonHtml=" + this.b + ", showOnEndcard=" + this.c + ", clickTrackers=" + this.d + ")";
    }

    public final p1 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final List c() {
        return this.d;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t5 a(JSONObject jSONObject) {
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("click");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString != null) {
                        Intrinsics.checkNotNull(optString);
                        if (StringsKt.isBlank(optString)) {
                            optString = null;
                        }
                        if (optString != null) {
                            arrayList.add(optString);
                        }
                    }
                }
            }
            p1 a = p1.d.a(jSONObject.optJSONObject("app_install_button"));
            String optString2 = jSONObject.optString("button_html");
            Intrinsics.checkNotNull(optString2);
            if (!StringsKt.isBlank(optString2) && !Intrinsics.areEqual(optString2, POBCommonConstants.NULL_VALUE)) {
                str = optString2;
            }
            return new t5(a, str, jSONObject.optBoolean("show_on_endcard", false), arrayList);
        }
    }
}
