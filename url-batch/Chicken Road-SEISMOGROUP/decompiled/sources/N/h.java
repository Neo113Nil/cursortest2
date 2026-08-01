package N;

import a.AbstractC0016a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class h implements i, k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f406a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final h f407b = new h();

    @Override // N.k
    public ByteBuffer a(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0016a.G(str)).put(JSONObject.NULL).put(AbstractC0016a.G(str2));
        if (put == null) {
            return null;
        }
        Object G2 = AbstractC0016a.G(put);
        if (G2 instanceof String) {
            o oVar = o.f413b;
            String quote = JSONObject.quote((String) G2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f413b;
        String obj = G2.toString();
        oVar2.getClass();
        return o.d(obj);
    }

    @Override // N.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            o.f413b.getClass();
            JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // N.i
    public ByteBuffer c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object G2 = AbstractC0016a.G(obj);
        if (G2 instanceof String) {
            o oVar = o.f413b;
            String quote = JSONObject.quote((String) G2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f413b;
        String obj2 = G2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    @Override // N.k
    public ByteBuffer d(A.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) aVar.f3c);
            jSONObject.put("args", AbstractC0016a.G(aVar.f4d));
            Object G2 = AbstractC0016a.G(jSONObject);
            if (G2 instanceof String) {
                o oVar = o.f413b;
                String quote = JSONObject.quote((String) G2);
                oVar.getClass();
                return o.d(quote);
            }
            o oVar2 = o.f413b;
            String obj = G2.toString();
            oVar2.getClass();
            return o.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // N.k
    public ByteBuffer e(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0016a.G(str2)).put(AbstractC0016a.G(obj));
        if (put == null) {
            return null;
        }
        Object G2 = AbstractC0016a.G(put);
        if (G2 instanceof String) {
            o oVar = o.f413b;
            String quote = JSONObject.quote((String) G2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f413b;
        String obj2 = G2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    @Override // N.k
    public ByteBuffer f(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0016a.G(obj));
        if (put == null) {
            return null;
        }
        Object G2 = AbstractC0016a.G(put);
        if (G2 instanceof String) {
            o oVar = o.f413b;
            String quote = JSONObject.quote((String) G2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f413b;
        String obj2 = G2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    @Override // N.k
    public A.a g(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    o.f413b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
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
                return new A.a(12, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // N.k
    public Object h(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    o.f413b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
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
                    throw new g((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }
}
