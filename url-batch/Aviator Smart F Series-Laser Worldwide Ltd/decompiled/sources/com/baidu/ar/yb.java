package com.baidu.ar;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yb {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3767a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3768b;

    /* renamed from: c, reason: collision with root package name */
    public int f3769c;

    /* renamed from: d, reason: collision with root package name */
    public c f3770d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3771a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap<String, Double> f3772b;

        public static a a(JSONObject jSONObject) {
            a aVar;
            a aVar2 = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                aVar = new a();
            } catch (Exception e8) {
                e = e8;
            }
            try {
                if (jSONObject.has("audio")) {
                    aVar.a(jSONObject.getString("audio"));
                }
                if (jSONObject.has("values")) {
                    HashMap<String, Double> hashMap = new HashMap<>();
                    JSONObject jSONObject2 = jSONObject.getJSONObject("values");
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Double.valueOf(jSONObject2.getDouble(next)));
                    }
                    aVar.a(hashMap);
                }
                return aVar;
            } catch (Exception e9) {
                e = e9;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }

        public HashMap<String, Double> b() {
            return this.f3772b;
        }

        public String a() {
            return this.f3771a;
        }

        public void a(String str) {
            this.f3771a = str;
        }

        public void a(HashMap<String, Double> hashMap) {
            this.f3772b = hashMap;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public a f3773a;

        public a a() {
            return this.f3773a;
        }

        public static b a(JSONObject jSONObject) {
            b bVar = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                b bVar2 = new b();
                try {
                    if (jSONObject.has("agent")) {
                        bVar2.a(a.a(jSONObject.getJSONObject("agent")));
                    }
                    return bVar2;
                } catch (Exception e8) {
                    e = e8;
                    bVar = bVar2;
                    e.printStackTrace();
                    return bVar;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }

        public void a(a aVar) {
            this.f3773a = aVar;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public b f3774a;

        public b a() {
            return this.f3774a;
        }

        public static c a(JSONObject jSONObject) {
            c cVar = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                c cVar2 = new c();
                try {
                    if (jSONObject.has("animation")) {
                        cVar2.a(b.a(jSONObject.getJSONObject("animation")));
                    }
                    return cVar2;
                } catch (Exception e8) {
                    e = e8;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }

        public void a(b bVar) {
            this.f3774a = bVar;
        }
    }

    public c a() {
        return this.f3770d;
    }

    public int b() {
        return this.f3769c;
    }

    public boolean c() {
        return this.f3767a;
    }

    public boolean d() {
        return this.f3768b;
    }

    public static yb a(JSONObject jSONObject) {
        yb ybVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            yb ybVar2 = new yb();
            try {
                if (jSONObject.has("id")) {
                    ybVar2.a(jSONObject.getString("id"));
                }
                if (jSONObject.has("initial")) {
                    ybVar2.a(jSONObject.getBoolean("initial"));
                }
                if (jSONObject.has("last")) {
                    ybVar2.b(jSONObject.getBoolean("last"));
                }
                if (jSONObject.has("frame_size")) {
                    ybVar2.a(jSONObject.getInt("frame_size"));
                }
                if (jSONObject.has(TypedValues.AttributesType.S_FRAME)) {
                    ybVar2.a(c.a(jSONObject.getJSONObject(TypedValues.AttributesType.S_FRAME)));
                }
                return ybVar2;
            } catch (Exception e8) {
                e = e8;
                ybVar = ybVar2;
                e.printStackTrace();
                return ybVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public void b(boolean z7) {
        this.f3768b = z7;
    }

    public void a(int i8) {
        this.f3769c = i8;
    }

    public void a(c cVar) {
        this.f3770d = cVar;
    }

    public void a(String str) {
    }

    public void a(boolean z7) {
        this.f3767a = z7;
    }
}
