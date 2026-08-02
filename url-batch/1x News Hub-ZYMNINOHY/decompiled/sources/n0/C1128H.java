package n0;

import E1.AbstractC0033i;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: n0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128H {

    /* renamed from: a, reason: collision with root package name */
    public final String f10001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10002b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10003c;

    public /* synthetic */ C1128H(JSONObject jSONObject) {
        this.f10001a = jSONObject.optString("productId");
        this.f10002b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f10003c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1128H)) {
            return false;
        }
        C1128H c1128h = (C1128H) obj;
        return this.f10001a.equals(c1128h.f10001a) && this.f10002b.equals(c1128h.f10002b) && Objects.equals(this.f10003c, c1128h.f10003c);
    }

    public final int hashCode() {
        return Objects.hash(this.f10001a, this.f10002b, this.f10003c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f10001a);
        sb.append(", type: ");
        sb.append(this.f10002b);
        sb.append(", offer token: ");
        return AbstractC0033i.m(sb, this.f10003c, "}");
    }
}
