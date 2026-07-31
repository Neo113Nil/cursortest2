package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r6 {
    public static final a c = new a(null);
    public final int a;
    public final int b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return this.a == r6Var.a && this.b == r6Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Dimensions(width=" + this.a + ", height=" + this.b + ")";
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r6 a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new r6(jSONObject.getInt("w"), jSONObject.getInt("h"));
            }
            return null;
        }
    }

    public r6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}
