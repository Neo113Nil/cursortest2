package s4;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class l implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7766a = new l();

    @Override // s4.r
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(P0.f.O(obj));
        if (put == null) {
            return null;
        }
        Object O7 = P0.f.O(put);
        if (O7 instanceof String) {
            x xVar = x.f7777b;
            String quote = JSONObject.quote((String) O7);
            xVar.getClass();
            return x.d(quote);
        }
        x xVar2 = x.f7777b;
        String obj2 = O7.toString();
        xVar2.getClass();
        return x.d(obj2);
    }

    @Override // s4.r
    public ByteBuffer b(n nVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", nVar.f7767a);
            jSONObject.put("args", P0.f.O(nVar.f7768b));
            Object O7 = P0.f.O(jSONObject);
            if (O7 instanceof String) {
                x xVar = x.f7777b;
                String quote = JSONObject.quote((String) O7);
                xVar.getClass();
                return x.d(quote);
            }
            x xVar2 = x.f7777b;
            String obj = O7.toString();
            xVar2.getClass();
            return x.d(obj);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // s4.r
    public ByteBuffer c(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(P0.f.O(str)).put(JSONObject.NULL).put(P0.f.O(str2));
        if (put == null) {
            return null;
        }
        Object O7 = P0.f.O(put);
        if (O7 instanceof String) {
            x xVar = x.f7777b;
            String quote = JSONObject.quote((String) O7);
            xVar.getClass();
            return x.d(quote);
        }
        x xVar2 = x.f7777b;
        String obj = O7.toString();
        xVar2.getClass();
        return x.d(obj);
    }

    @Override // s4.r
    public ByteBuffer d(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(P0.f.O(str2)).put(P0.f.O(obj));
        if (put == null) {
            return null;
        }
        Object O7 = P0.f.O(put);
        if (O7 instanceof String) {
            x xVar = x.f7777b;
            String quote = JSONObject.quote((String) O7);
            xVar.getClass();
            return x.d(quote);
        }
        x xVar2 = x.f7777b;
        String obj2 = O7.toString();
        xVar2.getClass();
        return x.d(obj2);
    }

    @Override // s4.r
    public n e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    x.f7777b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(x.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
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
                    return new n(obj, (String) obj2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    @Override // s4.r
    public Object f(ByteBuffer byteBuffer) {
        try {
            try {
                x.f7777b.getClass();
                JSONTokener jSONTokener = new JSONTokener(x.c(byteBuffer));
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
                            throw new j((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e7) {
                throw new IllegalArgumentException("Invalid JSON", e7);
            }
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }
}
