package x4;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import m5.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: x4.a$a, reason: collision with other inner class name */
    public static class C0154a {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f23189a;

        static C0154a a(Map<String, Object> map) {
            C0154a c0154a = new C0154a();
            c0154a.f23189a = (Boolean) map.get("enabled");
            return c0154a;
        }

        public void b(Boolean bool) {
            this.f23189a = bool;
        }

        Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enabled", this.f23189a);
            return hashMap;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f23190a;

        static b a(Map<String, Object> map) {
            b bVar = new b();
            bVar.f23190a = (Boolean) map.get("enable");
            return bVar;
        }

        public Boolean b() {
            return this.f23190a;
        }

        Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enable", this.f23190a);
            return hashMap;
        }
    }

    public interface c {
        C0154a d();

        void g(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends q {

        /* renamed from: d, reason: collision with root package name */
        public static final d f23191d = new d();

        private d() {
        }

        @Override // m5.q
        protected Object g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? b7 != -127 ? super.g(b7, byteBuffer) : b.a((Map) f(byteBuffer)) : C0154a.a((Map) f(byteBuffer));
        }

        @Override // m5.q
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> c7;
            if (obj instanceof C0154a) {
                byteArrayOutputStream.write(128);
                c7 = ((C0154a) obj).c();
            } else if (!(obj instanceof b)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                c7 = ((b) obj).c();
            }
            p(byteArrayOutputStream, c7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", null);
        return hashMap;
    }
}
