package com.chartboost.sdk.impl;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class o7 {
    public static final a f = new a(null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public o7(String type, String httpMethod, String url, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = type;
        this.b = httpMethod;
        this.c = url;
        this.d = str;
        this.e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return Intrinsics.areEqual(this.a, o7Var.a) && Intrinsics.areEqual(this.b, o7Var.b) && Intrinsics.areEqual(this.c, o7Var.c) && Intrinsics.areEqual(this.d, o7Var.d) && Intrinsics.areEqual(this.e, o7Var.e);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EventTracker(type=" + this.a + ", httpMethod=" + this.b + ", url=" + this.c + ", body=" + this.d + ", contentType=" + this.e + ")";
    }

    public final String d() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public static final class a {
        public final o7 a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String string = jsonObject.getString("type");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("http_method");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jsonObject.getString("url");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String optString = jsonObject.optString("body");
            Intrinsics.checkNotNull(optString);
            if (optString.length() <= 0) {
                optString = null;
            }
            String optString2 = jsonObject.optString("content_type");
            Intrinsics.checkNotNull(optString2);
            return new o7(string, string2, string3, optString, optString2.length() > 0 ? optString2 : null);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b c = new b("CLICK", 0, "click");
        public static final b d = new b("CLICK_ERROR", 1, "click_error");
        public static final b e = new b("TRACKING_ERROR", 2, "tracking_error");
        public static final b f = new b("ENGAGEMENT", 3, "engagement");
        public static final b g = new b("RENDER", 4, "render");
        public static final b h = new b("CLOSE", 5, "close");
        public static final b i = new b("EXPIRATION", 6, "expiration");
        public static final b j = new b(POBOMSDKLogConstants.MSG_OMSDK_IMPRESSION_EVENT, 7, "impression");
        public static final b k = new b("LOAD", 8, "load");
        public static final b l = new b("REWARD", 9, "reward");
        public static final b m = new b("SHOW", 10, "show");
        public static final b n = new b(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 11, "skip");
        public static final b o = new b("INITIALIZATION", 12, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        public static final /* synthetic */ b[] p;
        public static final /* synthetic */ EnumEntries q;
        public final String b;

        static {
            b[] a = a();
            p = a;
            q = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{c, d, e, f, g, h, i, j, k, l, m, n, o};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) p.clone();
        }

        public b(String str, int i2, String str2) {
            this.b = str2;
        }

        public final String b() {
            return this.b;
        }
    }
}
