package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.s;

/* loaded from: classes5.dex */
public class d implements a7.c {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public d() {
        this(new Hashtable(), new Vector());
    }

    Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    @Override // a7.c
    public f getBagAttribute(o oVar) {
        return (f) this.pkcs12Attributes.get(oVar);
    }

    @Override // a7.c
    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    public void readObject(ObjectInputStream objectInputStream) {
        Object readObject = objectInputStream.readObject();
        if (readObject instanceof Hashtable) {
            this.pkcs12Attributes = (Hashtable) readObject;
            this.pkcs12Ordering = (Vector) objectInputStream.readObject();
        } else {
            k kVar = new k((byte[]) readObject);
            while (true) {
                o oVar = (o) kVar.readObject();
                if (oVar == null) {
                    return;
                } else {
                    setBagAttribute(oVar, kVar.readObject());
                }
            }
        }
    }

    @Override // a7.c
    public void setBagAttribute(o oVar, f fVar) {
        if (this.pkcs12Attributes.containsKey(oVar)) {
            this.pkcs12Attributes.put(oVar, fVar);
        } else {
            this.pkcs12Attributes.put(oVar, fVar);
            this.pkcs12Ordering.addElement(oVar);
        }
    }

    int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream) {
        if (this.pkcs12Ordering.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        r create = r.create(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            o oVar = o.getInstance(bagAttributeKeys.nextElement());
            create.writeObject((s) oVar);
            create.writeObject((f) this.pkcs12Attributes.get(oVar));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    d(Hashtable hashtable, Vector vector) {
        this.pkcs12Attributes = hashtable;
        this.pkcs12Ordering = vector;
    }
}
