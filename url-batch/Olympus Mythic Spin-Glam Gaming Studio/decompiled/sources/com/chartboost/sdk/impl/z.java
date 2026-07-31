package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a0;
import com.chartboost.sdk.impl.wf;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class z {
    public static final a c = new a(null);
    public final List a;
    public final a0 b;

    public z(List renderables, a0 admConfig) {
        Intrinsics.checkNotNullParameter(renderables, "renderables");
        Intrinsics.checkNotNullParameter(admConfig, "admConfig");
        this.a = renderables;
        this.b = admConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.a, zVar.a) && Intrinsics.areEqual(this.b, zVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "AdMarkup(renderables=" + this.a + ", admConfig=" + this.b + ")";
    }

    public final List b() {
        return this.a;
    }

    public final a0 a() {
        return this.b;
    }

    public static final class a {
        public final z a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("renderables");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                wf.a aVar = wf.p;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                arrayList.add(aVar.a(jSONObject));
            }
            a0.a aVar2 = a0.n;
            JSONObject jSONObject2 = jsonObject.getJSONObject("config");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            String string = jsonObject.getString("auction_id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new z(arrayList, aVar2.a(jSONObject2, string));
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
