package w0;

import P.O;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3556a = new i();

    @Override // w0.m
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(j.d(obj));
        if (put == null) {
            return null;
        }
        Object d2 = j.d(put);
        if (d2 instanceof String) {
            q qVar = q.f3566b;
            String quote = JSONObject.quote((String) d2);
            qVar.getClass();
            return q.d(quote);
        }
        q qVar2 = q.f3566b;
        String obj2 = d2.toString();
        qVar2.getClass();
        return q.d(obj2);
    }

    @Override // w0.m
    public O b(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    q.f3566b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(q.c(byteBuffer));
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
                return new O(23, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // w0.m
    public Object c(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    q.f3566b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(q.c(byteBuffer));
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
                    throw new C0321g((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // w0.m
    public ByteBuffer d(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(j.d(str)).put(JSONObject.NULL).put(j.d(str2));
        if (put == null) {
            return null;
        }
        Object d2 = j.d(put);
        if (d2 instanceof String) {
            q qVar = q.f3566b;
            String quote = JSONObject.quote((String) d2);
            qVar.getClass();
            return q.d(quote);
        }
        q qVar2 = q.f3566b;
        String obj = d2.toString();
        qVar2.getClass();
        return q.d(obj);
    }

    @Override // w0.m
    public ByteBuffer e(O o2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) o2.f875f);
            jSONObject.put("args", j.d(o2.f876g));
            Object d2 = j.d(jSONObject);
            if (d2 instanceof String) {
                q qVar = q.f3566b;
                String quote = JSONObject.quote((String) d2);
                qVar.getClass();
                return q.d(quote);
            }
            q qVar2 = q.f3566b;
            String obj = d2.toString();
            qVar2.getClass();
            return q.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // w0.m
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(j.d(str2)).put(j.d(obj));
        if (put == null) {
            return null;
        }
        Object d2 = j.d(put);
        if (d2 instanceof String) {
            q qVar = q.f3566b;
            String quote = JSONObject.quote((String) d2);
            qVar.getClass();
            return q.d(quote);
        }
        q qVar2 = q.f3566b;
        String obj2 = d2.toString();
        qVar2.getClass();
        return q.d(obj2);
    }
}
