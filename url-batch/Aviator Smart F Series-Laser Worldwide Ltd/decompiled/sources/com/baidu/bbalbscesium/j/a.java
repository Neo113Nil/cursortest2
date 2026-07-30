package com.baidu.bbalbscesium.j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.n.a;
import java.util.Comparator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    static final String f3965e = "cs";

    /* renamed from: f, reason: collision with root package name */
    public static Comparator<a> f3966f = new C0044a();

    /* renamed from: a, reason: collision with root package name */
    protected b f3967a;

    /* renamed from: b, reason: collision with root package name */
    protected a.C0047a f3968b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3969c;

    /* renamed from: d, reason: collision with root package name */
    private long f3970d;

    /* renamed from: com.baidu.bbalbscesium.j.a$a, reason: collision with other inner class name */
    class C0044a implements Comparator<a> {
        C0044a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            long b8 = aVar.b() - aVar2.b();
            return b8 != 0 ? b8 > 0 ? -1 : 1 : aVar.a().compareTo(aVar2.a());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f3971a;

        /* renamed from: b, reason: collision with root package name */
        public com.baidu.bbalbscesium.n.a f3972b;
    }

    public static abstract class c {

        /* renamed from: e, reason: collision with root package name */
        private static final String f3973e = "target-pkg-";

        /* renamed from: f, reason: collision with root package name */
        private static final int f3974f = 3;

        /* renamed from: a, reason: collision with root package name */
        private a.C0047a f3975a;

        /* renamed from: b, reason: collision with root package name */
        private String f3976b;

        /* renamed from: c, reason: collision with root package name */
        private String f3977c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3978d = true;

        public c(a.C0047a c0047a, String str) {
            this.f3975a = c0047a;
            this.f3976b = str;
            this.f3977c = f3973e + Base64.encodeToString(str.getBytes(), 3);
        }

        public abstract void a(JSONObject jSONObject);

        public void a(boolean z7) {
            this.f3978d = z7;
        }

        public abstract void b(JSONObject jSONObject);

        public boolean b() {
            String a8 = this.f3975a.a(this.f3977c, true);
            if (!TextUtils.isEmpty(a8)) {
                try {
                    a(new JSONObject(a8));
                    a(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public boolean a() {
            if (this.f3978d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    b(jSONObject);
                    this.f3975a.a(this.f3977c, jSONObject.toString(), true);
                    a(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public static class d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3979a;
    }

    public static class f {

        /* renamed from: d, reason: collision with root package name */
        public static final int f3980d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f3981e = -1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f3982f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f3983g = -100;

        /* renamed from: a, reason: collision with root package name */
        private int f3984a;

        /* renamed from: b, reason: collision with root package name */
        private int f3985b;

        /* renamed from: c, reason: collision with root package name */
        public Exception f3986c;

        public f(int i8, int i9, Exception exc) {
            this.f3984a = i8;
            this.f3985b = i9;
            this.f3986c = exc;
        }

        public static f a() {
            return a(0);
        }

        public static f d() {
            return new f(0, 0, null);
        }

        public int b() {
            return this.f3984a;
        }

        public int c() {
            return this.f3985b;
        }

        public static f a(int i8) {
            return new f(-1, i8, null);
        }

        public static f a(Exception exc) {
            return new f(-1, 0, exc);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3987a;
    }

    public static class h {

        /* renamed from: d, reason: collision with root package name */
        public static final int f3988d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f3989e = -1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f3990f = -2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f3991g = -100;

        /* renamed from: a, reason: collision with root package name */
        public h.a f3992a;

        /* renamed from: b, reason: collision with root package name */
        public int f3993b;

        /* renamed from: c, reason: collision with root package name */
        public Exception f3994c;

        public h(int i8, h.a aVar, Exception exc) {
            this.f3993b = i8;
            this.f3992a = aVar;
            this.f3994c = exc;
        }

        public static h a() {
            return new h(-1, null, null);
        }

        public boolean b() {
            return this.f3993b == 0;
        }

        public static h a(int i8) {
            return new h(i8, null, null);
        }

        public static h a(int i8, Exception exc) {
            return new h(i8, null, exc);
        }

        public static h a(h.a aVar) {
            return new h(0, aVar, null);
        }

        public static h a(Exception exc) {
            return new h(-1, null, exc);
        }
    }

    public a(String str, long j8) {
        this.f3969c = str;
        this.f3970d = j8;
    }

    public abstract f a(e eVar, h.a aVar);

    public abstract h a(String str, g gVar);

    public String a() {
        return this.f3969c;
    }

    public abstract void a(d dVar);

    public long b() {
        return this.f3970d;
    }

    public void a(long j8) {
        this.f3970d = j8;
    }

    public final void a(b bVar) {
        this.f3967a = bVar;
        this.f3968b = bVar.f3972b.c().b(f3965e);
    }
}
