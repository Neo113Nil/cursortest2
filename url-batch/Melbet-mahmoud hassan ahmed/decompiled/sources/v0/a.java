package v0;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return o2.m0.f19752a >= 27 ? bArr : o2.m0.m0(c(o2.m0.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (o2.m0.f19752a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(o2.m0.D(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                if (i7 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return o2.m0.m0(sb.toString());
        } catch (JSONException e7) {
            o2.r.d("ClearKeyUtil", "Failed to adjust response data: " + o2.m0.D(bArr), e7);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
