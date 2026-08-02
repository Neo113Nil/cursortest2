package E1;

import E.AbstractC0005f;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f480a;

    /* renamed from: b, reason: collision with root package name */
    public final String f481b;

    /* renamed from: c, reason: collision with root package name */
    public final String f482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f483d;

    public B(String str) {
        this.f480a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f481b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f482c = optString;
        this.f483d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return TextUtils.equals(this.f480a, ((B) obj).f480a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f480a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f481b);
        sb.append("', productType='");
        sb.append(this.f482c);
        sb.append("', statusCode=");
        return AbstractC0005f.o(sb, this.f483d, "}");
    }
}
