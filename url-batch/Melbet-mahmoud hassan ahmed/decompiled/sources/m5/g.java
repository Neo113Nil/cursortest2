package m5;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final g f19246a = new g();

    private g() {
    }

    @Override // m5.l
    public ByteBuffer a(Object obj) {
        return f.f19245a.a(new JSONArray().put(h.a(obj)));
    }

    @Override // m5.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return f.f19245a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    @Override // m5.l
    public ByteBuffer c(String str, String str2, Object obj) {
        return f.f19245a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    @Override // m5.l
    public j d(ByteBuffer byteBuffer) {
        try {
            Object b7 = f.f19245a.b(byteBuffer);
            if (b7 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b7;
                Object obj = jSONObject.get("method");
                Object g7 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, g7);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b7);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // m5.l
    public Object e(ByteBuffer byteBuffer) {
        try {
            Object b7 = f.f19245a.b(byteBuffer);
            if (b7 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b7;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g7 = g(jSONArray.opt(1));
                    Object g8 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g7 == null || (g7 instanceof String))) {
                        throw new e((String) obj, (String) g7, g8);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b7);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // m5.l
    public ByteBuffer f(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f19247a);
            jSONObject.put("args", h.a(jVar.f19248b));
            return f.f19245a.a(jSONObject);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
