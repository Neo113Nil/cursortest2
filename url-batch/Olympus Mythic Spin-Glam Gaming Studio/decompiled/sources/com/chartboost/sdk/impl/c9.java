package com.chartboost.sdk.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c9 {
    public static final a g = new a(null);
    public final URL a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public c9(URL url, List scripts, List scriptsBeforeLoad, boolean z, boolean z2, String mraidVersion) {
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(scriptsBeforeLoad, "scriptsBeforeLoad");
        Intrinsics.checkNotNullParameter(mraidVersion, "mraidVersion");
        this.a = url;
        this.b = scripts;
        this.c = scriptsBeforeLoad;
        this.d = z;
        this.e = z2;
        this.f = mraidVersion;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return Intrinsics.areEqual(this.a, c9Var.a) && Intrinsics.areEqual(this.b, c9Var.b) && Intrinsics.areEqual(this.c, c9Var.c) && this.d == c9Var.d && this.e == c9Var.e && Intrinsics.areEqual(this.f, c9Var.f);
    }

    public int hashCode() {
        URL url = this.a;
        return ((((((((((url == null ? 0 : url.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "HTMLConfig(baseUrl=" + this.a + ", scripts=" + this.b + ", scriptsBeforeLoad=" + this.c + ", strictMraidOpen=" + this.d + ", attachTempContainerToActivity=" + this.e + ", mraidVersion=" + this.f + ")";
    }

    public final URL b() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public final List e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean a() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final c9 a(JSONObject jsonObject) {
            URL url;
            JSONArray optJSONArray;
            int i;
            int i2;
            JSONArray optJSONArray2;
            int i3;
            int i4;
            String optString;
            String optString2;
            String optString3;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                optString3 = jsonObject.optString("base_url");
                Intrinsics.checkNotNull(optString3);
                if (StringsKt.isBlank(optString3)) {
                    optString3 = null;
                }
            } catch (MalformedURLException e) {
                xb.a("Unable to create baseUrl.", e);
            }
            if (optString3 != null) {
                url = new URL(optString3);
                optJSONArray = jsonObject.optJSONArray("scripts");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray == null) {
                    i = optJSONArray.length();
                    i2 = 0;
                } else {
                    i = 0;
                    i2 = 0;
                }
                while (i2 < i) {
                    if (optJSONArray != null && (optString2 = optJSONArray.optString(i2)) != null) {
                        arrayList.add(optString2);
                    }
                    i2++;
                }
                optJSONArray2 = jsonObject.optJSONArray("scripts");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 == null) {
                    i3 = optJSONArray2.length();
                    i4 = 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                while (i4 < i3) {
                    if (optJSONArray2 != null && (optString = optJSONArray2.optString(i4)) != null) {
                        arrayList2.add(optString);
                    }
                    i4++;
                }
                boolean optBoolean = jsonObject.optBoolean("strict_mraid_open", false);
                boolean optBoolean2 = jsonObject.optBoolean("attach_temp_container_to_activity", true);
                String optString4 = jsonObject.optString("mraid_version", "2.0");
                Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
                return new c9(url, arrayList, arrayList2, optBoolean, optBoolean2, optString4);
            }
            url = null;
            optJSONArray = jsonObject.optJSONArray("scripts");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray == null) {
            }
            while (i2 < i) {
            }
            optJSONArray2 = jsonObject.optJSONArray("scripts");
            ArrayList arrayList22 = new ArrayList();
            if (optJSONArray2 == null) {
            }
            while (i4 < i3) {
            }
            boolean optBoolean3 = jsonObject.optBoolean("strict_mraid_open", false);
            boolean optBoolean22 = jsonObject.optBoolean("attach_temp_container_to_activity", true);
            String optString42 = jsonObject.optString("mraid_version", "2.0");
            Intrinsics.checkNotNullExpressionValue(optString42, "optString(...)");
            return new c9(url, arrayList3, arrayList22, optBoolean3, optBoolean22, optString42);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
