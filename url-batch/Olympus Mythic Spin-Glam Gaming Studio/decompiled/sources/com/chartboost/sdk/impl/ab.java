package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ab {
    public static final a c = new a(null);
    public final String a;
    public final String b;

    public ab(String clickthroughUrl, String imageUrl) {
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.a = clickthroughUrl;
        this.b = imageUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return Intrinsics.areEqual(this.a, abVar.a) && Intrinsics.areEqual(this.b, abVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "InfoIconModel(clickthroughUrl=" + this.a + ", imageUrl=" + this.b + ")";
    }

    public static final class a {
        public final ab a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String optString = jsonObject.optString("clickthrough_url", "https://docs.chartboost.com/opt-out");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String string = jsonObject.getString("image_url");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new ab(optString, string);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
