package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.r6;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q2 {
    public static final a d = new a(null);
    public static final r6 e;
    public static final r6 f;
    public static final r6 g;
    public static final q2 h;
    public final r6 a;
    public final r6 b;
    public final r6 c;

    static {
        r6 r6Var = new r6(0, 0);
        e = r6Var;
        r6 r6Var2 = new r6(8, 8);
        f = r6Var2;
        r6 r6Var3 = new r6(28, 28);
        g = r6Var3;
        h = new q2(r6Var, r6Var2, r6Var3);
    }

    public q2(r6 margin, r6 padding, r6 size) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.a = margin;
        this.b = padding;
        this.c = size;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Intrinsics.areEqual(this.a, q2Var.a) && Intrinsics.areEqual(this.b, q2Var.b) && Intrinsics.areEqual(this.c, q2Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ButtonAttributes(margin=" + this.a + ", padding=" + this.b + ", size=" + this.c + ")";
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q2 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            r6.a aVar = r6.c;
            r6 a = aVar.a(jSONObject.optJSONObject(VastAttributes.MARGIN));
            if (a == null) {
                a = q2.e;
            }
            r6 a2 = aVar.a(jSONObject.optJSONObject(VastAttributes.PADDING));
            if (a2 == null) {
                a2 = q2.f;
            }
            r6 a3 = aVar.a(jSONObject.optJSONObject("size"));
            if (a3 == null) {
                a3 = q2.g;
            }
            return new q2(a, a2, a3);
        }

        public final q2 a() {
            return q2.h;
        }
    }

    public final r6 e() {
        return this.a;
    }

    public final r6 f() {
        return this.b;
    }

    public final r6 g() {
        return this.c;
    }
}
