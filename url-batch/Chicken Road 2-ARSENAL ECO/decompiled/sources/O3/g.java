package O3;

import a.AbstractC0219a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import u0.C0675e;

/* loaded from: classes.dex */
public final class g implements h, j {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1769a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final g f1770b = new g();

    @Override // O3.j
    public ByteBuffer a(C0675e c0675e) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) c0675e.f5975b);
            jSONObject.put("args", AbstractC0219a.G(c0675e.f5976c));
            Object G6 = AbstractC0219a.G(jSONObject);
            if (G6 instanceof String) {
                n nVar = n.f1776b;
                String quote = JSONObject.quote((String) G6);
                nVar.getClass();
                return n.c(quote);
            }
            n nVar2 = n.f1776b;
            String obj = G6.toString();
            nVar2.getClass();
            return n.c(obj);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // O3.h
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object G6 = AbstractC0219a.G(obj);
        if (G6 instanceof String) {
            n nVar = n.f1776b;
            String quote = JSONObject.quote((String) G6);
            nVar.getClass();
            return n.c(quote);
        }
        n nVar2 = n.f1776b;
        String obj2 = G6.toString();
        nVar2.getClass();
        return n.c(obj2);
    }

    @Override // O3.j
    public ByteBuffer c(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0219a.G(obj));
        if (put == null) {
            return null;
        }
        Object G6 = AbstractC0219a.G(put);
        if (G6 instanceof String) {
            n nVar = n.f1776b;
            String quote = JSONObject.quote((String) G6);
            nVar.getClass();
            return n.c(quote);
        }
        n nVar2 = n.f1776b;
        String obj2 = G6.toString();
        nVar2.getClass();
        return n.c(obj2);
    }

    @Override // O3.j
    public ByteBuffer d(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0219a.G(str)).put(JSONObject.NULL).put(AbstractC0219a.G(str2));
        if (put == null) {
            return null;
        }
        Object G6 = AbstractC0219a.G(put);
        if (G6 instanceof String) {
            n nVar = n.f1776b;
            String quote = JSONObject.quote((String) G6);
            nVar.getClass();
            return n.c(quote);
        }
        n nVar2 = n.f1776b;
        String obj = G6.toString();
        nVar2.getClass();
        return n.c(obj);
    }

    @Override // O3.j
    public ByteBuffer e(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0219a.G(str2)).put(AbstractC0219a.G(obj));
        if (put == null) {
            return null;
        }
        Object G6 = AbstractC0219a.G(put);
        if (G6 instanceof String) {
            n nVar = n.f1776b;
            String quote = JSONObject.quote((String) G6);
            nVar.getClass();
            return n.c(quote);
        }
        n nVar2 = n.f1776b;
        String obj2 = G6.toString();
        nVar2.getClass();
        return n.c(obj2);
    }

    @Override // O3.h
    public Object f(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            n.f1776b.getClass();
            JSONTokener jSONTokener = new JSONTokener(n.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // O3.j
    public C0675e g(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    n.f1776b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(n.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e4) {
                    throw new IllegalArgumentException("Invalid JSON", e4);
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
                return new C0675e((String) obj2, 6, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // O3.j
    public Object h(ByteBuffer byteBuffer) {
        try {
            try {
                n.f1776b.getClass();
                JSONTokener jSONTokener = new JSONTokener(n.a(byteBuffer));
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
            } catch (JSONException e4) {
                throw new IllegalArgumentException("Invalid JSON", e4);
            }
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
