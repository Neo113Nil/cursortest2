package P1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1265a = new j();

    @Override // P1.p
    public ByteBuffer a(l lVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", lVar.f1266a);
            jSONObject.put("args", S0.a.O(lVar.f1267b));
            Object O2 = S0.a.O(jSONObject);
            if (O2 instanceof String) {
                v vVar = v.f1275b;
                String quote = JSONObject.quote((String) O2);
                vVar.getClass();
                return v.b(quote);
            }
            v vVar2 = v.f1275b;
            String obj = O2.toString();
            vVar2.getClass();
            return v.b(obj);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // P1.p
    public ByteBuffer b(Object obj) {
        JSONArray put = new JSONArray().put(S0.a.O(obj));
        if (put == null) {
            return null;
        }
        Object O2 = S0.a.O(put);
        if (O2 instanceof String) {
            v vVar = v.f1275b;
            String quote = JSONObject.quote((String) O2);
            vVar.getClass();
            return v.b(quote);
        }
        v vVar2 = v.f1275b;
        String obj2 = O2.toString();
        vVar2.getClass();
        return v.b(obj2);
    }

    @Override // P1.p
    public ByteBuffer c(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(S0.a.O(str)).put(JSONObject.NULL).put(S0.a.O(str2));
        if (put == null) {
            return null;
        }
        Object O2 = S0.a.O(put);
        if (O2 instanceof String) {
            v vVar = v.f1275b;
            String quote = JSONObject.quote((String) O2);
            vVar.getClass();
            return v.b(quote);
        }
        v vVar2 = v.f1275b;
        String obj = O2.toString();
        vVar2.getClass();
        return v.b(obj);
    }

    @Override // P1.p
    public ByteBuffer d(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(S0.a.O(str2)).put(S0.a.O(obj));
        if (put == null) {
            return null;
        }
        Object O2 = S0.a.O(put);
        if (O2 instanceof String) {
            v vVar = v.f1275b;
            String quote = JSONObject.quote((String) O2);
            vVar.getClass();
            return v.b(quote);
        }
        v vVar2 = v.f1275b;
        String obj2 = O2.toString();
        vVar2.getClass();
        return v.b(obj2);
    }

    @Override // P1.p
    public l e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    v.f1275b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(v.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e3) {
                    throw new IllegalArgumentException("Invalid JSON", e3);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new l(obj, (String) obj2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // P1.p
    public Object f(ByteBuffer byteBuffer) {
        try {
            try {
                v.f1275b.getClass();
                JSONTokener jSONTokener = new JSONTokener(v.a(byteBuffer));
                Object nextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object opt = jSONArray.opt(0);
                        if (opt == JSONObject.NULL) {
                            return null;
                        }
                        return opt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object opt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (opt2 == obj3) {
                            opt2 = null;
                        }
                        Object opt3 = jSONArray.opt(2);
                        if (opt3 != obj3) {
                            obj = opt3;
                        }
                        if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                            throw new h((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }
}
