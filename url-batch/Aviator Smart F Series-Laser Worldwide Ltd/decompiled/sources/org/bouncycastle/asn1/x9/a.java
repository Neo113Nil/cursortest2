package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public class a {
    private static void addEnumeration(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static e getByName(String str) {
        e byName = b.getByName(str);
        if (byName == null) {
            byName = org.bouncycastle.asn1.sec.b.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.nist.a.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.teletrust.a.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.anssi.a.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.cryptopro.b.getByNameX9(str);
        }
        return byName == null ? org.bouncycastle.asn1.gm.a.getByName(str) : byName;
    }

    public static e getByOID(o oVar) {
        e byOID = b.getByOID(oVar);
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.sec.b.getByOID(oVar);
        }
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.teletrust.a.getByOID(oVar);
        }
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.anssi.a.getByOID(oVar);
        }
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.cryptopro.b.getByOIDX9(oVar);
        }
        return byOID == null ? org.bouncycastle.asn1.gm.a.getByOID(oVar) : byOID;
    }

    public static String getName(o oVar) {
        String name = b.getName(oVar);
        if (name == null) {
            name = org.bouncycastle.asn1.sec.b.getName(oVar);
        }
        if (name == null) {
            name = org.bouncycastle.asn1.nist.a.getName(oVar);
        }
        if (name == null) {
            name = org.bouncycastle.asn1.teletrust.a.getName(oVar);
        }
        if (name == null) {
            name = org.bouncycastle.asn1.anssi.a.getName(oVar);
        }
        if (name == null) {
            name = org.bouncycastle.asn1.cryptopro.b.getName(oVar);
        }
        if (name == null) {
            name = org.bouncycastle.asn1.gm.a.getName(oVar);
        }
        return name == null ? org.bouncycastle.crypto.ec.a.getName(oVar) : name;
    }

    public static Enumeration getNames() {
        Vector vector = new Vector();
        addEnumeration(vector, b.getNames());
        addEnumeration(vector, org.bouncycastle.asn1.sec.b.getNames());
        addEnumeration(vector, org.bouncycastle.asn1.nist.a.getNames());
        addEnumeration(vector, org.bouncycastle.asn1.teletrust.a.getNames());
        addEnumeration(vector, org.bouncycastle.asn1.anssi.a.getNames());
        addEnumeration(vector, org.bouncycastle.asn1.cryptopro.b.getNames());
        addEnumeration(vector, org.bouncycastle.asn1.gm.a.getNames());
        return vector.elements();
    }

    public static o getOID(String str) {
        o oid = b.getOID(str);
        if (oid == null) {
            oid = org.bouncycastle.asn1.sec.b.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.nist.a.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.teletrust.a.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.anssi.a.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.cryptopro.b.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.gm.a.getOID(str);
        }
        return (oid == null && str.equals("curve25519")) ? q6.a.curvey25519 : oid;
    }
}
