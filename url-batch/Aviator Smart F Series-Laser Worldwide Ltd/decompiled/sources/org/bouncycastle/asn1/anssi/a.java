package org.bouncycastle.asn1.anssi;

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
    static f FRP256v1 = new C0383a();
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    /* renamed from: org.bouncycastle.asn1.anssi.a$a, reason: collision with other inner class name */
    static class C0383a extends f {
        C0383a() {
        }

        @Override // org.bouncycastle.asn1.x9.f
        protected e createParameters() {
            BigInteger fromHex = a.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger fromHex2 = a.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger fromHex3 = a.fromHex("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger fromHex4 = a.fromHex("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.e configureCurve = a.configureCurve(new e.f(fromHex, fromHex2, fromHex3, fromHex4, valueOf));
            return new org.bouncycastle.asn1.x9.e(configureCurve, a.configureBasepoint(configureCurve, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"), fromHex4, valueOf, null);
        }
    }

    static {
        defineCurve("FRP256v1", b.FRP256v1, FRP256v1);
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
