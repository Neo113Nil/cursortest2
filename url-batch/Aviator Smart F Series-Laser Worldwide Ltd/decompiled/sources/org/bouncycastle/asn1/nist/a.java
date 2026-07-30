package org.bouncycastle.asn1.nist;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.sec.c;
import org.bouncycastle.asn1.x9.e;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class a {
    static final Hashtable objIds = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve("B-571", c.sect571r1);
        defineCurve("B-409", c.sect409r1);
        defineCurve("B-283", c.sect283r1);
        defineCurve("B-233", c.sect233r1);
        defineCurve("B-163", c.sect163r2);
        defineCurve("K-571", c.sect571k1);
        defineCurve("K-409", c.sect409k1);
        defineCurve("K-283", c.sect283k1);
        defineCurve("K-233", c.sect233k1);
        defineCurve("K-163", c.sect163k1);
        defineCurve("P-521", c.secp521r1);
        defineCurve("P-384", c.secp384r1);
        defineCurve("P-256", c.secp256r1);
        defineCurve("P-224", c.secp224r1);
        defineCurve("P-192", c.secp192r1);
    }

    static void defineCurve(String str, o oVar) {
        objIds.put(str, oVar);
        names.put(oVar, str);
    }

    public static e getByName(String str) {
        o oVar = (o) objIds.get(Strings.toUpperCase(str));
        if (oVar != null) {
            return getByOID(oVar);
        }
        return null;
    }

    public static e getByOID(o oVar) {
        return org.bouncycastle.asn1.sec.b.getByOID(oVar);
    }

    public static String getName(o oVar) {
        return (String) names.get(oVar);
    }

    public static Enumeration getNames() {
        return objIds.keys();
    }

    public static o getOID(String str) {
        return (o) objIds.get(Strings.toUpperCase(str));
    }
}
