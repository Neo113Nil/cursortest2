package v0;

import N.P;
import androidx.datastore.preferences.protobuf.k0;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: v0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244i implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0244i f3088a = new C0244i();

    @Override // v0.l
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(k0.K(obj));
        if (put == null) {
            return null;
        }
        Object K2 = k0.K(put);
        if (K2 instanceof String) {
            p pVar = p.f3094b;
            String quote = JSONObject.quote((String) K2);
            pVar.getClass();
            return p.d(quote);
        }
        p pVar2 = p.f3094b;
        String obj2 = K2.toString();
        pVar2.getClass();
        return p.d(obj2);
    }

    @Override // v0.l
    public ByteBuffer b(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(k0.K(str)).put(JSONObject.NULL).put(k0.K(str2));
        if (put == null) {
            return null;
        }
        Object K2 = k0.K(put);
        if (K2 instanceof String) {
            p pVar = p.f3094b;
            String quote = JSONObject.quote((String) K2);
            pVar.getClass();
            return p.d(quote);
        }
        p pVar2 = p.f3094b;
        String obj = K2.toString();
        pVar2.getClass();
        return p.d(obj);
    }

    @Override // v0.l
    public ByteBuffer c(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(k0.K(str2)).put(k0.K(obj));
        if (put == null) {
            return null;
        }
        Object K2 = k0.K(put);
        if (K2 instanceof String) {
            p pVar = p.f3094b;
            String quote = JSONObject.quote((String) K2);
            pVar.getClass();
            return p.d(quote);
        }
        p pVar2 = p.f3094b;
        String obj2 = K2.toString();
        pVar2.getClass();
        return p.d(obj2);
    }

    @Override // v0.l
    public P d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    p.f3094b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
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
                return new P(25, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // v0.l
    public Object e(ByteBuffer byteBuffer) {
        try {
            try {
                p.f3094b.getClass();
                JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
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
                            throw new C0242g((String) obj2, (String) opt2, obj);
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

    @Override // v0.l
    public ByteBuffer f(P p2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) p2.f698f);
            jSONObject.put("args", k0.K(p2.f699g));
            Object K2 = k0.K(jSONObject);
            if (K2 instanceof String) {
                p pVar = p.f3094b;
                String quote = JSONObject.quote((String) K2);
                pVar.getClass();
                return p.d(quote);
            }
            p pVar2 = p.f3094b;
            String obj = K2.toString();
            pVar2.getClass();
            return p.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }
}
