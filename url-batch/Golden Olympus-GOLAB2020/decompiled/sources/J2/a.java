package J2;

import O2.d;
import O2.e;
import O2.f;
import S2.c;
import a3.AbstractC1247d;
import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    static e f802a = new C0014a();

    /* renamed from: b, reason: collision with root package name */
    static final Hashtable f803b = new Hashtable();

    /* renamed from: c, reason: collision with root package name */
    static final Hashtable f804c = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    static final Hashtable f805d = new Hashtable();

    /* renamed from: J2.a$a, reason: collision with other inner class name */
    static class C0014a extends e {
        C0014a() {
        }

        @Override // O2.e
        protected d a() {
            BigInteger e4 = a.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger e5 = a.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger e6 = a.e("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger e7 = a.e("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            c c4 = a.c(new c.e(e4, e5, e6, e7, valueOf));
            return new d(c4, new f(c4, AbstractC1247d.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), e7, valueOf, null);
        }
    }

    static {
        d("FRP256v1", b.f806a, f802a);
    }

    static void d(String str, I2.f fVar, e eVar) {
        f803b.put(Z2.e.c(str), fVar);
        f805d.put(fVar, str);
        f804c.put(fVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger e(String str) {
        return new BigInteger(1, AbstractC1247d.a(str));
    }

    public static d f(String str) {
        I2.f h4 = h(str);
        if (h4 == null) {
            return null;
        }
        return g(h4);
    }

    public static d g(I2.f fVar) {
        e eVar = (e) f804c.get(fVar);
        if (eVar == null) {
            return null;
        }
        return eVar.b();
    }

    public static I2.f h(String str) {
        return (I2.f) f803b.get(Z2.e.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c c(c cVar) {
        return cVar;
    }
}
