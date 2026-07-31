package v0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s0.u1;
import v0.m;

/* loaded from: classes.dex */
public interface g0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f22611a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22612b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22613c;

        public a(byte[] bArr, String str, int i7) {
            this.f22611a = bArr;
            this.f22612b = str;
            this.f22613c = i7;
        }

        public byte[] a() {
            return this.f22611a;
        }

        public String b() {
            return this.f22612b;
        }
    }

    public interface b {
        void a(g0 g0Var, byte[] bArr, int i7, int i8, byte[] bArr2);
    }

    public interface c {
        g0 a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f22614a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22615b;

        public d(byte[] bArr, String str) {
            this.f22614a = bArr;
            this.f22615b = str;
        }

        public byte[] a() {
            return this.f22614a;
        }

        public String b() {
            return this.f22615b;
        }
    }

    void a();

    void b(byte[] bArr, u1 u1Var);

    void c(b bVar);

    boolean d(byte[] bArr, String str);

    void e(byte[] bArr, byte[] bArr2);

    Map<String, String> f(byte[] bArr);

    void g(byte[] bArr);

    byte[] h(byte[] bArr, byte[] bArr2);

    d i();

    void j(byte[] bArr);

    a k(byte[] bArr, List<m.b> list, int i7, HashMap<String, String> hashMap);

    int l();

    u0.b m(byte[] bArr);

    byte[] n();
}
