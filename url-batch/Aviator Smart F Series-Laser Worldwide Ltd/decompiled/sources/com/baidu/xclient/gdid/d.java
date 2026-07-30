package com.baidu.xclient.gdid;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.mshield.b.a.g;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile d f10721a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Context f10722b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f10723c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f10724d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<String, String> f10725e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public com.baidu.xclient.gdid.i.b f10726f;

    /* renamed from: h, reason: collision with root package name */
    public String f10728h;

    /* renamed from: g, reason: collision with root package name */
    public AtomicBoolean f10727g = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap<String, String> f10729i = new ConcurrentHashMap<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.g();
                d.this.a(true, true);
            } catch (Throwable th) {
                com.baidu.xclient.gdid.k.d.a(th);
            }
        }
    }

    public class b implements Runnable {
        public b(d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.a().a(d.f10722b);
            } catch (Throwable th) {
                com.baidu.xclient.gdid.k.d.a(th);
            }
        }
    }

    public static d a() {
        if (f10721a == null) {
            synchronized (d.class) {
                try {
                    if (f10721a == null) {
                        f10721a = new d();
                    }
                } finally {
                }
            }
        }
        return f10721a;
    }

    public String b(String str) {
        return com.baidu.xclient.gdid.jni.c.a(f10722b).d(str);
    }

    public String c(String str) {
        try {
            HashMap<String, String> hashMap = f10725e;
            if (hashMap.size() <= 0) {
                return "";
            }
            synchronized (hashMap) {
                try {
                    if (!hashMap.containsKey(str)) {
                        return "";
                    }
                    return hashMap.get(str);
                } finally {
                }
            }
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
            return "";
        }
    }

    public synchronized String[] d() {
        String[] strArr = {"", ""};
        String str = this.f10728h;
        if (TextUtils.isEmpty(str)) {
            return strArr;
        }
        String str2 = this.f10729i.get(str);
        strArr[0] = str;
        strArr[1] = str2;
        return strArr;
    }

    public String e() {
        return "";
    }

    public final void f() {
        JSONObject c8;
        try {
            if (com.baidu.xclient.gdid.k.d.a(f10722b) && com.baidu.mshield.b.e.a.d(f10722b) && (c8 = c()) != null) {
                if (new com.baidu.xclient.gdid.g.a(f10722b, null).a(com.baidu.xclient.gdid.k.d.a(f10722b, c8, "1072101").toString())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    e.e().g(currentTimeMillis);
                    e.e().c(currentTimeMillis);
                } else {
                    h.a().a(f10722b);
                }
            }
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public final void g() {
        try {
            this.f10726f = new com.baidu.xclient.gdid.i.b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.baidu.xclient.gdid.i.b.f10746a);
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    f10722b.registerReceiver(this.f10726f, intentFilter, 4);
                } catch (Throwable th) {
                    com.baidu.xclient.gdid.k.d.a(th);
                }
            } else {
                f10722b.registerReceiver(this.f10726f, intentFilter);
            }
        } catch (Throwable th2) {
            com.baidu.xclient.gdid.k.d.a(th2);
        }
    }

    public final void h() {
        try {
            f10722b.unregisterReceiver(this.f10726f);
            this.f10726f = null;
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public final void i() {
        JSONObject jSONObject;
        String p8 = e.e().p();
        String u7 = e.e().u();
        e.e().t();
        if (TextUtils.isEmpty(u7)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(u7);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
        }
        if (TextUtils.isEmpty(p8)) {
            return;
        }
        this.f10729i.put(p8, jSONObject.toString());
        this.f10728h = p8;
    }

    public Object a(int i8, Object obj, Object obj2, Object obj3) {
        return com.baidu.xclient.gdid.jni.c.a(f10722b).a(i8, obj, obj2, obj3);
    }

    public void b() {
        try {
            h();
            this.f10727g.set(false);
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            a(jSONObject, sb);
            a(jSONObject);
            b(jSONObject, sb);
            b(jSONObject);
            jSONObject.put("15057", sb);
            jSONObject.put("15006", TextUtils.isEmpty(com.baidu.xclient.gdid.jni.c.a(f10722b).a()) ? 1 : 0);
            return jSONObject;
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
            return null;
        }
    }

    public String a(Context context) {
        try {
            String c8 = c("p");
            if (!TextUtils.isEmpty(c8)) {
                return c8;
            }
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
        return context.getPackageName();
    }

    public final void b(JSONObject jSONObject) {
        try {
            jSONObject.put("12006", com.baidu.mshield.b.e.a.c(f10722b, "screen_brightness"));
        } catch (Throwable unused) {
            try {
                jSONObject.put("12006", -1);
            } catch (Throwable th) {
                try {
                    com.baidu.xclient.gdid.k.d.a(th);
                } catch (Throwable th2) {
                    com.baidu.xclient.gdid.k.d.a(th2);
                }
            }
        }
    }

    public String a(String str) {
        return com.baidu.xclient.gdid.jni.c.a(f10722b).a(str);
    }

    public final void b(JSONObject jSONObject, StringBuilder sb) {
        StringBuilder sb2;
        String str;
        try {
            a(jSONObject, "02018", com.baidu.xclient.gdid.k.c.a("02018", c("arid"), sb));
            jSONObject.put("02015", c("arv"));
            jSONObject.put("02016", c("arl"));
            jSONObject.put("02002", com.baidu.xclient.gdid.jni.c.a(f10722b).f());
            jSONObject.put("02003", c("mod"));
            jSONObject.put("02004", com.baidu.xclient.gdid.jni.c.a(f10722b).k());
            jSONObject.put("02005", com.baidu.xclient.gdid.jni.c.a(f10722b).j());
            jSONObject.put("02006", com.baidu.xclient.gdid.jni.c.a(f10722b).i());
            jSONObject.put("02007", com.baidu.xclient.gdid.jni.c.a(f10722b).h());
            jSONObject.put("02008", com.baidu.xclient.gdid.jni.c.a(f10722b).g());
            jSONObject.put("15023", com.baidu.xclient.gdid.j.a.a());
            jSONObject.put("15021", com.baidu.xclient.gdid.j.a.c());
            jSONObject.put("15020", com.baidu.xclient.gdid.j.a.b());
            jSONObject.put("15022", com.baidu.xclient.gdid.j.a.d());
            String b8 = g.b(f10722b);
            String c8 = g.c(f10722b);
            jSONObject.put("15029", b8);
            jSONObject.put("15030", c8);
            a(jSONObject, "15048", com.baidu.xclient.gdid.jni.b.a(f10722b).a());
            a(jSONObject, "p", com.baidu.mshield.b.a.e.c() ? "1" : "0");
            a(jSONObject, "s", com.baidu.xclient.gdid.jni.c.a(f10722b).a());
            a(jSONObject, "11005", String.valueOf(com.baidu.mshield.b.a.e.b()));
            String a8 = com.baidu.mshield.b.a.e.a();
            if (!TextUtils.isEmpty(a8)) {
                if (a8.contains("64")) {
                    sb2 = new StringBuilder();
                    str = "64 ";
                } else {
                    sb2 = new StringBuilder();
                    str = "32 ";
                }
                sb2.append(str);
                sb2.append(a8);
                a8 = sb2.toString();
            }
            a(jSONObject, "11003", a8);
            a(jSONObject, "02010", com.baidu.xclient.gdid.j.a.a(f10722b));
            a(jSONObject, "02012", com.baidu.xclient.gdid.j.a.b(f10722b));
            a(jSONObject, "02059", com.baidu.xclient.gdid.jni.c.a(f10722b).e());
            try {
                com.baidu.xclient.gdid.k.e eVar = new com.baidu.xclient.gdid.k.e();
                eVar.a(10, 10);
                String glGetString = eVar.f10776f.glGetString(7937);
                a(jSONObject, "20081", eVar.f10776f.glGetString(7936));
                a(jSONObject, "20082", glGetString);
                eVar.b();
            } catch (Throwable th) {
                com.baidu.xclient.gdid.k.d.a(th);
            }
            a(jSONObject, "12001", com.baidu.xclient.gdid.j.a.c(f10722b));
            a(jSONObject, "12007", String.valueOf(com.baidu.xclient.gdid.j.a.d(f10722b)));
            a(jSONObject, "06011", String.valueOf(com.baidu.xclient.gdid.j.a.e(f10722b)));
            a(jSONObject, "06012", String.valueOf(com.baidu.xclient.gdid.j.a.f(f10722b) ? 1 : 0));
        } catch (Throwable th2) {
            com.baidu.xclient.gdid.k.d.a(th2);
        }
    }

    public void a(Context context, String str, String str2) {
        try {
            if (this.f10727g.get()) {
                return;
            }
            f10722b = context;
            f10723c = str;
            f10724d = str2;
            i();
            this.f10727g.set(true);
            new Thread(new a()).start();
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public final void b(boolean z7) {
        if (z7) {
            com.baidu.xclient.gdid.k.b.c().postDelayed(new b(this), 65000L);
        } else {
            h.a().a(f10722b);
        }
    }

    public void a(Context context, String str, String str2, HashMap<String, String> hashMap) {
        f10722b = context;
        f10723c = str;
        f10724d = str2;
        if (hashMap != null) {
            HashMap<String, String> hashMap2 = f10725e;
            synchronized (hashMap2) {
                hashMap2.putAll(hashMap);
            }
        }
    }

    public void a(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            try {
                if (hashMap.size() == 0) {
                    return;
                }
                synchronized (f10725e) {
                    try {
                        for (String str : hashMap.keySet()) {
                            f10725e.put(str, hashMap.get(str));
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.baidu.xclient.gdid.k.d.a(th);
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        try {
            a(jSONObject, "15027", com.baidu.xclient.gdid.b.a.a(f10722b));
            a(jSONObject, "15003", com.baidu.mshield.b.b.a.a(f10722b));
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public final void a(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            jSONObject.put(str, str2);
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public final void a(JSONObject jSONObject, StringBuilder sb) {
        try {
            a(jSONObject, "15200", "C");
            a(jSONObject, "01001", com.baidu.xclient.gdid.k.a.a(f10722b));
            a(jSONObject, "15017", (String) com.baidu.xclient.gdid.k.d.c(f10722b).first);
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public void a(boolean z7) {
        if (e.e().v()) {
            return;
        }
        if (e.e().w()) {
            b(z7);
            return;
        }
        long h8 = e.e().h();
        if (System.currentTimeMillis() - h8 < e.e().i()) {
            b(z7);
        } else {
            f();
        }
    }

    public void a(boolean z7, boolean z8) {
        try {
            c.a().a(f10722b);
            a(z7);
            if (z8) {
                long l8 = e.e().l();
                long m8 = e.e().m();
                long currentTimeMillis = System.currentTimeMillis();
                long j8 = currentTimeMillis - l8;
                if (j8 >= m8) {
                    e.e().e(currentTimeMillis);
                } else {
                    m8 -= j8;
                }
                com.baidu.xclient.gdid.i.a.a(f10722b, m8);
            }
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }
}
