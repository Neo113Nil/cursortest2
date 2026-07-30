package n0;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g implements h, j {

    /* renamed from: a, reason: collision with root package name */
    public static final g f931a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final g f932b = new g();

    @Override // n0.h
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            n.f938b.getClass();
            JSONTokener jSONTokener = new JSONTokener(n.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // n0.h
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object F = a.a.F(obj);
        if (F instanceof String) {
            n nVar = n.f938b;
            String quote = JSONObject.quote((String) F);
            nVar.getClass();
            return n.d(quote);
        }
        n nVar2 = n.f938b;
        String obj2 = F.toString();
        nVar2.getClass();
        return n.d(obj2);
    }

    @Override // n0.j
    public ByteBuffer c(Object obj) {
        JSONArray put = new JSONArray().put(a.a.F(obj));
        if (put == null) {
            return null;
        }
        Object F = a.a.F(put);
        if (F instanceof String) {
            n nVar = n.f938b;
            String quote = JSONObject.quote((String) F);
            nVar.getClass();
            return n.d(quote);
        }
        n nVar2 = n.f938b;
        String obj2 = F.toString();
        nVar2.getClass();
        return n.d(obj2);
    }

    @Override // n0.j
    public c0.a d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    n.f938b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(n.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
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
                    return new c0.a((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // n0.j
    public Object e(ByteBuffer byteBuffer) {
        try {
            try {
                n.f938b.getClass();
                JSONTokener jSONTokener = new JSONTokener(n.c(byteBuffer));
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
                            throw new f((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e2) {
                throw new IllegalArgumentException("Invalid JSON", e2);
            }
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // n0.j
    public ByteBuffer f(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(a.a.F(str)).put(JSONObject.NULL).put(a.a.F(str2));
        if (put == null) {
            return null;
        }
        Object F = a.a.F(put);
        if (F instanceof String) {
            n nVar = n.f938b;
            String quote = JSONObject.quote((String) F);
            nVar.getClass();
            return n.d(quote);
        }
        n nVar2 = n.f938b;
        String obj = F.toString();
        nVar2.getClass();
        return n.d(obj);
    }

    @Override // n0.j
    public ByteBuffer g(c0.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) aVar.f66c);
            jSONObject.put("args", a.a.F(aVar.f67d));
            Object F = a.a.F(jSONObject);
            if (F instanceof String) {
                n nVar = n.f938b;
                String quote = JSONObject.quote((String) F);
                nVar.getClass();
                return n.d(quote);
            }
            n nVar2 = n.f938b;
            String obj = F.toString();
            nVar2.getClass();
            return n.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // n0.j
    public ByteBuffer h(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(a.a.F(str2)).put(a.a.F(obj));
        if (put == null) {
            return null;
        }
        Object F = a.a.F(put);
        if (F instanceof String) {
            n nVar = n.f938b;
            String quote = JSONObject.quote((String) F);
            nVar.getClass();
            return n.d(quote);
        }
        n nVar2 = n.f938b;
        String obj2 = F.toString();
        nVar2.getClass();
        return n.d(obj2);
    }
}
