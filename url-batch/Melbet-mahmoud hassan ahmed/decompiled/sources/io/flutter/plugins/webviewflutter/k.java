package io.flutter.plugins.webviewflutter;

import android.util.Log;
import io.flutter.plugins.webviewflutter.k;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public class k {

    public interface a0 {
        void b(Long l7, Boolean bool);
    }

    public interface b {
        void a(n<Boolean> nVar);

        void b(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b0 extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final b0 f17685d = new b0();

        private b0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final c f17686d = new c();

        private c() {
        }
    }

    public interface c0 {
        void A(Long l7, Long l8);

        void a(Long l7);

        void b(Long l7, Boolean bool);

        Long c(Long l7);

        String d(Long l7);

        void e(Long l7, String str, String str2, String str3);

        void f(Long l7);

        void g(Long l7, Long l8);

        Boolean h(Long l7);

        void i(Long l7, String str, String str2, String str3, String str4, String str5);

        void j(Long l7);

        void k(Long l7, Long l8);

        void l(Long l7, Long l8);

        void m(Boolean bool);

        void n(Long l7, Long l8);

        void o(Long l7);

        void p(Long l7, String str, Map<String, String> map);

        Boolean q(Long l7);

        void r(Long l7, Boolean bool);

        String s(Long l7);

        void t(Long l7, String str, byte[] bArr);

        void u(Long l7, String str, n<String> nVar);

        void v(Long l7, Long l8, Long l9);

        void w(Long l7, Long l8);

        Long x(Long l7);

        e0 y(Long l7);

        void z(Long l7, Long l8, Long l9);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final m5.c f17687a;

        public interface a<T> {
            void a(T t6);
        }

        public d(m5.c cVar) {
            this.f17687a = cVar;
        }

        static m5.i<Object> d() {
            return e.f17689d;
        }

        public void c(Long l7, final a<Void> aVar) {
            new m5.a(this.f17687a, "dev.flutter.pigeon.DownloadListenerFlutterApi.dispose", d()).d(new ArrayList(Arrays.asList(l7)), new a.e() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.d.a.this.a(null);
                }
            });
        }

        public void g(Long l7, String str, String str2, String str3, String str4, Long l8, final a<Void> aVar) {
            new m5.a(this.f17687a, "dev.flutter.pigeon.DownloadListenerFlutterApi.onDownloadStart", d()).d(new ArrayList(Arrays.asList(l7, str, str2, str3, str4, l8)), new a.e() { // from class: io.flutter.plugins.webviewflutter.p
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.d.a.this.a(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d0 extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final d0 f17688d = new d0();

        private d0() {
        }

        @Override // m5.q
        protected Object g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? super.g(b7, byteBuffer) : e0.a((Map) f(byteBuffer));
        }

        @Override // m5.q
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof e0)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((e0) obj).d());
            }
        }
    }

    private static class e extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final e f17689d = new e();

        private e() {
        }
    }

    public static class e0 {

        /* renamed from: a, reason: collision with root package name */
        private Long f17690a;

        /* renamed from: b, reason: collision with root package name */
        private Long f17691b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Long f17692a;

            /* renamed from: b, reason: collision with root package name */
            private Long f17693b;

            public e0 a() {
                e0 e0Var = new e0();
                e0Var.b(this.f17692a);
                e0Var.c(this.f17693b);
                return e0Var;
            }

            public a b(Long l7) {
                this.f17692a = l7;
                return this;
            }

            public a c(Long l7) {
                this.f17693b = l7;
                return this;
            }
        }

        private e0() {
        }

        static e0 a(Map<String, Object> map) {
            Long valueOf;
            e0 e0Var = new e0();
            Object obj = map.get("x");
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e0Var.b(valueOf);
            Object obj2 = map.get("y");
            if (obj2 != null) {
                l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e0Var.c(l7);
            return e0Var;
        }

        public void b(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f17690a = l7;
        }

        public void c(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f17691b = l7;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("x", this.f17690a);
            hashMap.put("y", this.f17691b);
            return hashMap;
        }
    }

    public interface f {
        void a(Long l7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class g extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final g f17694d = new g();

        private g() {
        }
    }

    public interface h {
        String a(String str);

        List<String> b(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class i extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final i f17695d = new i();

        private i() {
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private final m5.c f17696a;

        public interface a<T> {
            void a(T t6);
        }

        public j(m5.c cVar) {
            this.f17696a = cVar;
        }

        static m5.i<Object> d() {
            return C0077k.f17697d;
        }

        public void c(Long l7, final a<Void> aVar) {
            new m5.a(this.f17696a, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.dispose", d()).d(new ArrayList(Arrays.asList(l7)), new a.e() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.j.a.this.a(null);
                }
            });
        }

        public void g(Long l7, String str, final a<Void> aVar) {
            new m5.a(this.f17696a, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage", d()).d(new ArrayList(Arrays.asList(l7, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.v
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.j.a.this.a(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$k, reason: collision with other inner class name */
    private static class C0077k extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final C0077k f17697d = new C0077k();

        private C0077k() {
        }
    }

    public interface l {
        void a(Long l7, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class m extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final m f17698d = new m();

        private m() {
        }
    }

    public interface n<T> {
        void a(T t6);
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        private final m5.c f17699a;

        public interface a<T> {
            void a(T t6);
        }

        public o(m5.c cVar) {
            this.f17699a = cVar;
        }

        static m5.i<Object> d() {
            return p.f17700d;
        }

        public void c(Long l7, final a<Void> aVar) {
            new m5.a(this.f17699a, "dev.flutter.pigeon.WebChromeClientFlutterApi.dispose", d()).d(new ArrayList(Arrays.asList(l7)), new a.e() { // from class: io.flutter.plugins.webviewflutter.a0
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.o.a.this.a(null);
                }
            });
        }

        public void g(Long l7, Long l8, Long l9, final a<Void> aVar) {
            new m5.a(this.f17699a, "dev.flutter.pigeon.WebChromeClientFlutterApi.onProgressChanged", d()).d(new ArrayList(Arrays.asList(l7, l8, l9)), new a.e() { // from class: io.flutter.plugins.webviewflutter.z
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.o.a.this.a(null);
                }
            });
        }
    }

    private static class p extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final p f17700d = new p();

        private p() {
        }
    }

    public interface q {
        void b(Long l7, Long l8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class r extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final r f17701d = new r();

        private r() {
        }
    }

    public static class s {

        /* renamed from: a, reason: collision with root package name */
        private Long f17702a;

        /* renamed from: b, reason: collision with root package name */
        private String f17703b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Long f17704a;

            /* renamed from: b, reason: collision with root package name */
            private String f17705b;

            public s a() {
                s sVar = new s();
                sVar.c(this.f17704a);
                sVar.b(this.f17705b);
                return sVar;
            }

            public a b(String str) {
                this.f17705b = str;
                return this;
            }

            public a c(Long l7) {
                this.f17704a = l7;
                return this;
            }
        }

        private s() {
        }

        static s a(Map<String, Object> map) {
            Long valueOf;
            s sVar = new s();
            Object obj = map.get("errorCode");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.c(valueOf);
            sVar.b((String) map.get("description"));
            return sVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.f17703b = str;
        }

        public void c(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.f17702a = l7;
        }

        Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", this.f17702a);
            hashMap.put("description", this.f17703b);
            return hashMap;
        }
    }

    public static class t {

        /* renamed from: a, reason: collision with root package name */
        private String f17706a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f17707b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f17708c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f17709d;

        /* renamed from: e, reason: collision with root package name */
        private String f17710e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f17711f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f17712a;

            /* renamed from: b, reason: collision with root package name */
            private Boolean f17713b;

            /* renamed from: c, reason: collision with root package name */
            private Boolean f17714c;

            /* renamed from: d, reason: collision with root package name */
            private Boolean f17715d;

            /* renamed from: e, reason: collision with root package name */
            private String f17716e;

            /* renamed from: f, reason: collision with root package name */
            private Map<String, String> f17717f;

            public t a() {
                t tVar = new t();
                tVar.g(this.f17712a);
                tVar.c(this.f17713b);
                tVar.d(this.f17714c);
                tVar.b(this.f17715d);
                tVar.e(this.f17716e);
                tVar.f(this.f17717f);
                return tVar;
            }

            public a b(Boolean bool) {
                this.f17715d = bool;
                return this;
            }

            public a c(Boolean bool) {
                this.f17713b = bool;
                return this;
            }

            public a d(Boolean bool) {
                this.f17714c = bool;
                return this;
            }

            public a e(String str) {
                this.f17716e = str;
                return this;
            }

            public a f(Map<String, String> map) {
                this.f17717f = map;
                return this;
            }

            public a g(String str) {
                this.f17712a = str;
                return this;
            }
        }

        private t() {
        }

        static t a(Map<String, Object> map) {
            t tVar = new t();
            tVar.g((String) map.get("url"));
            tVar.c((Boolean) map.get("isForMainFrame"));
            tVar.d((Boolean) map.get("isRedirect"));
            tVar.b((Boolean) map.get("hasGesture"));
            tVar.e((String) map.get("method"));
            tVar.f((Map) map.get("requestHeaders"));
            return tVar;
        }

        public void b(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.f17709d = bool;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.f17707b = bool;
        }

        public void d(Boolean bool) {
            this.f17708c = bool;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.f17710e = str;
        }

        public void f(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.f17711f = map;
        }

        public void g(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.f17706a = str;
        }

        Map<String, Object> h() {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.f17706a);
            hashMap.put("isForMainFrame", this.f17707b);
            hashMap.put("isRedirect", this.f17708c);
            hashMap.put("hasGesture", this.f17709d);
            hashMap.put("method", this.f17710e);
            hashMap.put("requestHeaders", this.f17711f);
            return hashMap;
        }
    }

    public interface u {
        void a(Long l7);

        void b(Long l7, Long l8);

        void c(Long l7, Boolean bool);

        void d(Long l7, Boolean bool);

        void e(Long l7, Boolean bool);

        void f(Long l7, Boolean bool);

        void g(Long l7, Boolean bool);

        void h(Long l7, Boolean bool);

        void i(Long l7, Boolean bool);

        void j(Long l7, String str);

        void k(Long l7, Boolean bool);

        void l(Long l7, Boolean bool);

        void m(Long l7, Boolean bool);

        void n(Long l7, Boolean bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class v extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final v f17718d = new v();

        private v() {
        }
    }

    public interface w {
        void a(Long l7);

        void b(Long l7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class x extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final x f17719d = new x();

        private x() {
        }
    }

    public static class y {

        /* renamed from: a, reason: collision with root package name */
        private final m5.c f17720a;

        public interface a<T> {
            void a(T t6);
        }

        public y(m5.c cVar) {
            this.f17720a = cVar;
        }

        static m5.i<Object> i() {
            return z.f17721d;
        }

        public void h(Long l7, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.dispose", i()).d(new ArrayList(Arrays.asList(l7)), new a.e() { // from class: io.flutter.plugins.webviewflutter.b1
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void q(Long l7, Long l8, String str, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageFinished", i()).d(new ArrayList(Arrays.asList(l7, l8, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.w0
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void r(Long l7, Long l8, String str, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageStarted", i()).d(new ArrayList(Arrays.asList(l7, l8, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.z0
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void s(Long l7, Long l8, Long l9, String str, String str2, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedError", i()).d(new ArrayList(Arrays.asList(l7, l8, l9, str, str2)), new a.e() { // from class: io.flutter.plugins.webviewflutter.y0
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void t(Long l7, Long l8, t tVar, s sVar, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedRequestError", i()).d(new ArrayList(Arrays.asList(l7, l8, tVar, sVar)), new a.e() { // from class: io.flutter.plugins.webviewflutter.a1
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void u(Long l7, Long l8, t tVar, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.requestLoading", i()).d(new ArrayList(Arrays.asList(l7, l8, tVar)), new a.e() { // from class: io.flutter.plugins.webviewflutter.v0
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }

        public void v(Long l7, Long l8, String str, final a<Void> aVar) {
            new m5.a(this.f17720a, "dev.flutter.pigeon.WebViewClientFlutterApi.urlLoading", i()).d(new ArrayList(Arrays.asList(l7, l8, str)), new a.e() { // from class: io.flutter.plugins.webviewflutter.x0
                @Override // m5.a.e
                public final void a(Object obj) {
                    k.y.a.this.a(null);
                }
            });
        }
    }

    private static class z extends m5.q {

        /* renamed from: d, reason: collision with root package name */
        public static final z f17721d = new z();

        private z() {
        }

        @Override // m5.q
        protected Object g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? b7 != -127 ? super.g(b7, byteBuffer) : t.a((Map) f(byteBuffer)) : s.a((Map) f(byteBuffer));
        }

        @Override // m5.q
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> h7;
            if (obj instanceof s) {
                byteArrayOutputStream.write(128);
                h7 = ((s) obj).d();
            } else if (!(obj instanceof t)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                h7 = ((t) obj).h();
            }
            p(byteArrayOutputStream, h7);
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
