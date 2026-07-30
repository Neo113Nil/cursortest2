package org.bouncycastle.asn1.gm;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.x9.e;
import org.bouncycastle.asn1.x9.f;
import org.bouncycastle.asn1.x9.g;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.x;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.d;

/* loaded from: classes5.dex */
public class a {
    static f sm2p256v1 = new C0384a();
    static f wapip192v1 = new b();
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    /* renamed from: org.bouncycastle.asn1.gm.a$a, reason: collision with other inner class name */
    static class C0384a extends f {
        C0384a() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected e createParameters() {
            BigInteger fromHex = a.fromHex("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger fromHex2 = a.fromHex("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger fromHex3 = a.fromHex("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger fromHex4 = a.fromHex("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), fromHex4, valueOf, null);
        }
    }

    static class b extends f {
        b() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected org.bouncycastle.asn1.x9.e createParameters() {
            BigInteger fromHex = a.fromHex("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger fromHex2 = a.fromHex("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger fromHex3 = a.fromHex("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger fromHex4 = a.fromHex("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"), fromHex4, valueOf, null);
        }
    }

    static {
        defineCurve("wapip192v1", org.bouncycastle.asn1.gm.b.wapip192v1, wapip192v1);
        defineCurve("sm2p256v1", org.bouncycastle.asn1.gm.b.sm2p256v1, sm2p256v1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g configureBasepoint(org.bouncycastle.math.ec.e eVar, String str) {
        g gVar = new g(eVar, d.decodeStrict(str));
        x.configureBasepoint(gVar.getPoint());
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.math.ec.e configureCurve(org.bouncycastle.math.ec.e eVar) {
        return eVar;
    }

    static void defineCurve(String str, o oVar, f fVar) {
        objIds.put(Strings.toLowerCase(str), oVar);
        names.put(oVar, str);
        curves.put(oVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger fromHex(String str) {
        return new BigInteger(1, d.decodeStrict(str));
    }

    public static org.bouncycastle.asn1.x9.e getByName(String str) {
        o oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }

    public static org.bouncycastle.asn1.x9.e getByOID(o oVar) {
        f fVar = (f) curves.get(oVar);
        if (fVar == null) {
            return null;
        }
        return fVar.getParameters();
    }

    public static String getName(o oVar) {
        return (String) names.get(oVar);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static o getOID(String str) {
        return (o) objIds.get(Strings.toLowerCase(str));
    }
}
