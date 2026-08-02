package n0;

import E1.AbstractC0033i;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158t {

    /* renamed from: a, reason: collision with root package name */
    public final String f10123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10124b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10125c;

    public C1158t(JSONObject jSONObject) {
        this.f10123a = jSONObject.optString("productId");
        this.f10124b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f10125c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158t)) {
            return false;
        }
        C1158t c1158t = (C1158t) obj;
        return this.f10123a.equals(c1158t.f10123a) && this.f10124b.equals(c1158t.f10124b) && Objects.equals(this.f10125c, c1158t.f10125c);
    }

    public final int hashCode() {
        return Objects.hash(this.f10123a, this.f10124b, this.f10125c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f10123a);
        sb.append(", type: ");
        sb.append(this.f10124b);
        sb.append(", offer token: ");
        return AbstractC0033i.m(sb, this.f10125c, "}");
    }
}
