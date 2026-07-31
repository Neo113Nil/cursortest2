package t5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: t5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0141b {
        void a();

        void b(h hVar);

        void c(i iVar);

        void d(e eVar);

        h e(i iVar);

        void g(j jVar);

        void h(f fVar);

        void j(g gVar);

        void k(i iVar);

        i l(d dVar);

        void m(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final c f22324d = new c();

        private c() {
        }

        @Override // m5.q
        protected Object g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return d.a((Map) f(byteBuffer));
                case -127:
                    return e.a((Map) f(byteBuffer));
                case -126:
                    return f.a((Map) f(byteBuffer));
                case -125:
                    return g.a((Map) f(byteBuffer));
                case -124:
                    return h.a((Map) f(byteBuffer));
                case -123:
                    return i.a((Map) f(byteBuffer));
                case -122:
                    return j.a((Map) f(byteBuffer));
                default:
                    return super.g(b7, byteBuffer);
            }
        }

        @Override // m5.q
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> d7;
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                d7 = ((d) obj).l();
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                d7 = ((e) obj).f();
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                d7 = ((f) obj).d();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(131);
                d7 = ((g) obj).f();
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(132);
                d7 = ((h) obj).f();
            } else {
                if (!(obj instanceof i)) {
                    if (!(obj instanceof j)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(134);
                        p(byteArrayOutputStream, ((j) obj).f());
                        return;
                    }
                }
                byteArrayOutputStream.write(133);
                d7 = ((i) obj).d();
            }
            p(byteArrayOutputStream, d7);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f22325a;

        /* renamed from: b, reason: collision with root package name */
        private String f22326b;

        /* renamed from: c, reason: collision with root package name */
        private String f22327c;

        /* renamed from: d, reason: collision with root package name */
        private String f22328d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f22329e;

        private d() {
        }

        static d a(Map<String, Object> map) {
            d dVar = new d();
            dVar.g((String) map.get("asset"));
            dVar.k((String) map.get("uri"));
            dVar.j((String) map.get("packageName"));
            dVar.h((String) map.get("formatHint"));
            dVar.i((Map) map.get("httpHeaders"));
            return dVar;
        }

        public String b() {
            return this.f22325a;
        }

        public String c() {
            return this.f22328d;
        }

        public Map<String, String> d() {
            return this.f22329e;
        }

        public String e() {
            return this.f22327c;
        }

        public String f() {
            return this.f22326b;
        }

        public void g(String str) {
            this.f22325a = str;
        }

        public void h(String str) {
            this.f22328d = str;
        }

        public void i(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            }
            this.f22329e = map;
        }

        public void j(String str) {
            this.f22327c = str;
        }

        public void k(String str) {
            this.f22326b = str;
        }

        Map<String, Object> l() {
            HashMap hashMap = new HashMap();
            hashMap.put("asset", this.f22325a);
            hashMap.put("uri", this.f22326b);
            hashMap.put("packageName", this.f22327c);
            hashMap.put("formatHint", this.f22328d);
            hashMap.put("httpHeaders", this.f22329e);
            return hashMap;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private Long f22330a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f22331b;

        private e() {
        }

        static e a(Map<String, Object> map) {
            Long valueOf;
            e eVar = new e();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.e(valueOf);
            eVar.d((Boolean) map.get("isLooping"));
            return eVar;
        }

        public Boolean b() {
            return this.f22331b;
        }

        public Long c() {
            return this.f22330a;
        }

        public void d(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isLooping\" is null.");
            }
            this.f22331b = bool;
        }

        public void e(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f22330a = l7;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f22330a);
            hashMap.put("isLooping", this.f22331b);
            return hashMap;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f22332a;

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.c((Boolean) map.get("mixWithOthers"));
            return fVar;
        }

        public Boolean b() {
            return this.f22332a;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"mixWithOthers\" is null.");
            }
            this.f22332a = bool;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("mixWithOthers", this.f22332a);
            return hashMap;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private Long f22333a;

        /* renamed from: b, reason: collision with root package name */
        private Double f22334b;

        private g() {
        }

        static g a(Map<String, Object> map) {
            Long valueOf;
            g gVar = new g();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            gVar.e(valueOf);
            gVar.d((Double) map.get("speed"));
            return gVar;
        }

        public Double b() {
            return this.f22334b;
        }

        public Long c() {
            return this.f22333a;
        }

        public void d(Double d7) {
            if (d7 == null) {
                throw new IllegalStateException("Nonnull field \"speed\" is null.");
            }
            this.f22334b = d7;
        }

        public void e(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f22333a = l7;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f22333a);
            hashMap.put("speed", this.f22334b);
            return hashMap;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private Long f22335a;

        /* renamed from: b, reason: collision with root package name */
        private Long f22336b;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private Long f22337a;

            /* renamed from: b, reason: collision with root package name */
            private Long f22338b;

            public h a() {
                h hVar = new h();
                hVar.e(this.f22337a);
                hVar.d(this.f22338b);
                return hVar;
            }

            public a b(Long l7) {
                this.f22338b = l7;
                return this;
            }

            public a c(Long l7) {
                this.f22337a = l7;
                return this;
            }
        }

        private h() {
        }

        static h a(Map<String, Object> map) {
            Long valueOf;
            h hVar = new h();
            Object obj = map.get("textureId");
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.e(valueOf);
            Object obj2 = map.get("position");
            if (obj2 != null) {
                l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            hVar.d(l7);
            return hVar;
        }

        public Long b() {
            return this.f22336b;
        }

        public Long c() {
            return this.f22335a;
        }

        public void d(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"position\" is null.");
            }
            this.f22336b = l7;
        }

        public void e(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f22335a = l7;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f22335a);
            hashMap.put("position", this.f22336b);
            return hashMap;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        private Long f22339a;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private Long f22340a;

            public i a() {
                i iVar = new i();
                iVar.c(this.f22340a);
                return iVar;
            }

            public a b(Long l7) {
                this.f22340a = l7;
                return this;
            }
        }

        private i() {
        }

        static i a(Map<String, Object> map) {
            Long valueOf;
            i iVar = new i();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.c(valueOf);
            return iVar;
        }

        public Long b() {
            return this.f22339a;
        }

        public void c(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f22339a = l7;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f22339a);
            return hashMap;
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private Long f22341a;

        /* renamed from: b, reason: collision with root package name */
        private Double f22342b;

        private j() {
        }

        static j a(Map<String, Object> map) {
            Long valueOf;
            j jVar = new j();
            Object obj = map.get("textureId");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.d(valueOf);
            jVar.e((Double) map.get("volume"));
            return jVar;
        }

        public Long b() {
            return this.f22341a;
        }

        public Double c() {
            return this.f22342b;
        }

        public void d(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f22341a = l7;
        }

        public void e(Double d7) {
            if (d7 == null) {
                throw new IllegalStateException("Nonnull field \"volume\" is null.");
            }
            this.f22342b = d7;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f22341a);
            hashMap.put("volume", this.f22342b);
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
