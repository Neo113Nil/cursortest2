package K2;

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
    static e f815a = new C0016a();

    /* renamed from: b, reason: collision with root package name */
    static e f816b = new b();

    /* renamed from: c, reason: collision with root package name */
    static final Hashtable f817c = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    static final Hashtable f818d = new Hashtable();

    /* renamed from: e, reason: collision with root package name */
    static final Hashtable f819e = new Hashtable();

    /* renamed from: K2.a$a, reason: collision with other inner class name */
    static class C0016a extends e {
        C0016a() {
        }

        @Override // O2.e
        protected d a() {
            BigInteger e4 = a.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger e5 = a.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger e6 = a.e("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger e7 = a.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1L);
            c c4 = a.c(new c.e(e4, e5, e6, e7, valueOf));
            return new d(c4, new f(c4, AbstractC1247d.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), e7, valueOf, null);
        }
    }

    static class b extends e {
        b() {
        }

        @Override // O2.e
        protected d a() {
            BigInteger e4 = a.e("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger e5 = a.e("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger e6 = a.e("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger e7 = a.e("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1L);
            c c4 = a.c(new c.e(e4, e5, e6, e7, valueOf));
            return new d(c4, new f(c4, AbstractC1247d.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), e7, valueOf, null);
        }
    }

    static {
        d("wapip192v1", K2.b.f829J, f816b);
        d("sm2p256v1", K2.b.f825F, f815a);
    }

    static void d(String str, I2.f fVar, e eVar) {
        f817c.put(Z2.e.c(str), fVar);
        f819e.put(fVar, str);
        f818d.put(fVar, eVar);
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
        e eVar = (e) f818d.get(fVar);
        if (eVar == null) {
            return null;
        }
        return eVar.b();
    }

    public static I2.f h(String str) {
        return (I2.f) f817c.get(Z2.e.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c c(c cVar) {
        return cVar;
    }
}
