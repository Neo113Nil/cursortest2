package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class nj {
    public static final a g = new a(null);
    public final boolean a;
    public final n5 b;
    public final boolean c;
    public final t5 d;
    public final int e;
    public final boolean f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj;
        return this.a == njVar.a && Intrinsics.areEqual(this.b, njVar.b) && this.c == njVar.c && Intrinsics.areEqual(this.d, njVar.d) && this.e == njVar.e && this.f == njVar.f;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        n5 n5Var = this.b;
        int hashCode2 = (((hashCode + (n5Var == null ? 0 : n5Var.hashCode())) * 31) + Boolean.hashCode(this.c)) * 31;
        t5 t5Var = this.d;
        return ((((hashCode2 + (t5Var != null ? t5Var.hashCode() : 0)) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public String toString() {
        return "VASTConfig(videoClickthroughEnabled=" + this.a + ", endCardCountdown=" + this.b + ", showEndCard=" + this.c + ", callToAction=" + this.d + ", endCardIgnoreSafeAreaFlags=" + this.e + ", endcardOptional=" + this.f + ")";
    }

    public nj(boolean z, n5 n5Var, boolean z2, t5 t5Var, int i, boolean z3) {
        this.a = z;
        this.b = n5Var;
        this.c = z2;
        this.d = t5Var;
        this.e = i;
        this.f = z3;
    }

    public final boolean f() {
        return this.a;
    }

    public final n5 b() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public final t5 a() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final boolean d() {
        return this.f;
    }

    public static final class a {
        public final nj a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject optJSONObject = jsonObject.optJSONObject("endcard_countdown");
            return new nj(jsonObject.optBoolean("video_clickthrough_enabled", true), optJSONObject != null ? n5.c.a(optJSONObject) : null, jsonObject.optBoolean("show_endcard", true), t5.e.a(jsonObject.optJSONObject("cta")), jsonObject.optInt("endcard_ignore_safe_area", 0), jsonObject.optBoolean("endcard_optional", true));
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
