package com.chartboost.sdk.impl;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class p1 {
    public static final a d = new a(null);
    public final URL a;
    public final String b;
    public final String c;

    public p1(URL url, String title, String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.a = url;
        this.b = title;
        this.c = buttonText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.areEqual(this.a, p1Var.a) && Intrinsics.areEqual(this.b, p1Var.b) && Intrinsics.areEqual(this.c, p1Var.c);
    }

    public int hashCode() {
        URL url = this.a;
        return ((((url == null ? 0 : url.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AppInstallButton(iconUrl=" + this.a + ", title=" + this.b + ", buttonText=" + this.c + ")";
    }

    public final URL b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p1 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("icon");
            Intrinsics.checkNotNull(optString);
            if (StringsKt.isBlank(optString) || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
                optString = null;
            }
            URL url = optString != null ? new URL(optString) : null;
            String optString2 = jSONObject.optString("title");
            if (Intrinsics.areEqual(optString2, POBCommonConstants.NULL_VALUE)) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = "";
            }
            String str = POBCTAOverlayData.DEFAULT_CTA_TEXT;
            String optString3 = jSONObject.optString("button_text", POBCTAOverlayData.DEFAULT_CTA_TEXT);
            String str2 = Intrinsics.areEqual(optString3, POBCommonConstants.NULL_VALUE) ? null : optString3;
            if (str2 != null) {
                str = str2;
            }
            return new p1(url, optString2, str);
        }
    }
}
