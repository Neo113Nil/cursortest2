package com.chartboost.sdk.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class n5 {
    public static final a c = new a(null);
    public final long a;
    public final long b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return this.a == n5Var.a && this.b == n5Var.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "Countdown(duration=" + this.a + ", delay=" + this.b + ")";
    }

    public n5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long b() {
        return this.a;
    }

    public final long a() {
        return this.b;
    }

    public static final class a {
        public final n5 a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new n5(jsonObject.optLong(IronSourceConstants.EVENTS_DURATION, 30L), jsonObject.optLong(POBCTAOverlayData.KEY_CTA_DELAY));
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
