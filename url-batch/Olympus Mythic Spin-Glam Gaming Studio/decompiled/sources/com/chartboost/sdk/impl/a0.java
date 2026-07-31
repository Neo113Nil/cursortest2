package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.ab;
import com.chartboost.sdk.impl.q2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a0 {
    public static final a n = new a(null);
    public static final sb o = sb.e;
    public final String a;
    public final ab b;
    public final q2 c;
    public final q2 d;
    public final int e;
    public final Integer f;
    public final int g;
    public final boolean h;
    public final List i;
    public final boolean j;
    public final int k;
    public final sb l;
    public final boolean m;

    public a0(String auctionId, ab infoIcon, q2 q2Var, q2 q2Var2, int i, Integer num, int i2, boolean z, List eventTrackers, boolean z2, int i3, sb loadMode, boolean z3) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        Intrinsics.checkNotNullParameter(loadMode, "loadMode");
        this.a = auctionId;
        this.b = infoIcon;
        this.c = q2Var;
        this.d = q2Var2;
        this.e = i;
        this.f = num;
        this.g = i2;
        this.h = z;
        this.i = eventTrackers;
        this.j = z2;
        this.k = i3;
        this.l = loadMode;
        this.m = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.a, a0Var.a) && Intrinsics.areEqual(this.b, a0Var.b) && Intrinsics.areEqual(this.c, a0Var.c) && Intrinsics.areEqual(this.d, a0Var.d) && this.e == a0Var.e && Intrinsics.areEqual(this.f, a0Var.f) && this.g == a0Var.g && this.h == a0Var.h && Intrinsics.areEqual(this.i, a0Var.i) && this.j == a0Var.j && this.k == a0Var.k && this.l == a0Var.l && this.m == a0Var.m;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        q2 q2Var = this.c;
        int hashCode2 = (hashCode + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        q2 q2Var2 = this.d;
        int hashCode3 = (((hashCode2 + (q2Var2 == null ? 0 : q2Var2.hashCode())) * 31) + Integer.hashCode(this.e)) * 31;
        Integer num = this.f;
        return ((((((((((((((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.j)) * 31) + Integer.hashCode(this.k)) * 31) + this.l.hashCode()) * 31) + Boolean.hashCode(this.m);
    }

    public String toString() {
        return "AdMarkupConfig(auctionId=" + this.a + ", infoIcon=" + this.b + ", topLeftButtonGroup=" + this.c + ", topRightButtonGroup=" + this.d + ", expiration=" + this.e + ", rewardDuration=" + this.f + ", clickBrowser=" + this.g + ", resolveRedirections=" + this.h + ", eventTrackers=" + this.i + ", defaultMuted=" + this.j + ", loadTimeoutSeconds=" + this.k + ", loadMode=" + this.l + ", allowEarlyReward=" + this.m + ")";
    }

    public final String c() {
        return this.a;
    }

    public final ab g() {
        return this.b;
    }

    public final q2 j() {
        return this.c;
    }

    public final q2 k() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final Integer i() {
        return this.f;
    }

    public final List e() {
        return this.i;
    }

    public final boolean d() {
        return this.j;
    }

    public final sb h() {
        return this.l;
    }

    public final boolean b() {
        return this.m;
    }

    public static final class a {
        public final a0 a(JSONObject jsonObject, String auctionId) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            List a = t7.a(jsonObject.optJSONArray("event_trackers"));
            ab.a aVar = ab.c;
            JSONObject jSONObject = jsonObject.getJSONObject("info_icon");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            ab a2 = aVar.a(jSONObject);
            q2.a aVar2 = q2.d;
            return new a0(auctionId, a2, aVar2.a(jsonObject.optJSONObject("top_left_button_group")), aVar2.a(jsonObject.optJSONObject("top_right_button_group")), jsonObject.optInt("expiration", 3600), Integer.valueOf(jsonObject.optInt("reward_duration", -1)), jsonObject.optInt("click_browser", 0), jsonObject.optBoolean("resolve_redirections", true), a, jsonObject.optBoolean("default_muted", false), jsonObject.optInt("load_timeout", 30), sb.c.a(jsonObject.optInt("load_mode", a0.o.c())), jsonObject.optBoolean("allow_early_reward", false));
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
