package E1;

import E.AbstractC0005f;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f486c;

    public D(JSONObject jSONObject) {
        this.f484a = jSONObject.optString("productId");
        this.f485b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f486c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return this.f484a.equals(d4.f484a) && this.f485b.equals(d4.f485b) && Objects.equals(this.f486c, d4.f486c);
    }

    public final int hashCode() {
        return Objects.hash(this.f484a, this.f485b, this.f486c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f484a);
        sb.append(", type: ");
        sb.append(this.f485b);
        sb.append(", offer token: ");
        return AbstractC0005f.q(sb, this.f486c, "}");
    }
}
