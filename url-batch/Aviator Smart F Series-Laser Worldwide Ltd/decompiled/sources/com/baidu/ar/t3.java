package com.baidu.ar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t3 implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3267c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static t3 f3268d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f3269e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f3270f = false;

    /* renamed from: b, reason: collision with root package name */
    public t3 f3272b = null;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f3271a = new JSONObject();

    public t3(String str) {
        h(str);
        a(System.currentTimeMillis());
    }

    public static t3 b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str.trim());
                t3 f8 = f(jSONObject.getString("event_id"));
                f8.f3271a = jSONObject;
                return f8;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static t3 f(String str) {
        if (!f3270f) {
            synchronized (f3267c) {
                try {
                    t3 t3Var = f3268d;
                    if (t3Var != null) {
                        f3268d = t3Var.f3272b;
                        t3Var.f3272b = null;
                        f3269e--;
                        if (t3Var.f3271a == null) {
                            t3Var.f3271a = new JSONObject();
                        }
                        t3Var.h(str);
                        t3Var.a(System.currentTimeMillis());
                        return t3Var;
                    }
                } finally {
                }
            }
        }
        return new t3(str);
    }

    public static void g() {
        if (f3270f) {
            return;
        }
        synchronized (f3267c) {
            f3270f = true;
            f3268d = null;
            f3269e = 0;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t3 clone() {
        t3 f8 = f("");
        try {
            f8.f3271a = new JSONObject(this.f3271a.toString());
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return f8;
    }

    public long c() {
        return this.f3271a.optLong("time");
    }

    public long d(String str) {
        Object c8 = c(str);
        if (c8 instanceof Number) {
            return ((Number) c8).longValue();
        }
        return 0L;
    }

    public String e(String str) {
        return this.f3271a.optString(str);
    }

    public JSONObject h() {
        return a((JSONObject) null, (Collection<String>) null);
    }

    public JSONObject a(Collection<String> collection) {
        return a((JSONObject) null, collection);
    }

    public String b() {
        return this.f3271a.optString("event_id");
    }

    public Object c(String str) {
        return this.f3271a.opt(str);
    }

    public String d() {
        String b8 = b(this);
        if (b8 == null) {
            return null;
        }
        return k8.a(b8);
    }

    public Iterator<String> e() {
        return this.f3271a.keys();
    }

    public final void f() {
        this.f3271a = null;
        int i8 = f3269e;
        if (i8 < 500) {
            this.f3272b = f3268d;
            f3268d = this;
            f3269e = i8 + 1;
        }
    }

    public void g(String str) {
        this.f3271a.remove(str);
    }

    public void h(String str) {
        try {
            this.f3271a.putOpt("event_id", str);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static String b(t3 t3Var) {
        JSONObject jSONObject;
        if (t3Var == null || (jSONObject = t3Var.f3271a) == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public JSONObject a(JSONObject jSONObject, Collection<String> collection) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            Iterator<String> keys = this.f3271a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (collection != null && collection.contains(next)) {
                }
                jSONObject.put(next, this.f3271a.get(next));
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public void a(long j8) {
        try {
            this.f3271a.putOpt("time", Long.valueOf(j8));
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static void a(t3 t3Var) {
        if (f3270f) {
            return;
        }
        synchronized (f3267c) {
            t3Var.f();
        }
    }

    public void a(String str, Object obj) {
        try {
            this.f3271a.putOpt(str, obj);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f3271a.putOpt(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static void a(t3... t3VarArr) {
        if (f3270f) {
            return;
        }
        synchronized (f3267c) {
            if (t3VarArr != null) {
                try {
                    for (t3 t3Var : t3VarArr) {
                        t3Var.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean a(String str) {
        return this.f3271a.has(str);
    }
}
