package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class d2 implements Enumeration {
    private k aIn;
    private Object nextObj = readObject();

    public d2(byte[] bArr) {
        this.aIn = new k(bArr, true);
    }

    private Object readObject() {
        try {
            return this.aIn.readObject();
        } catch (IOException e8) {
            throw new ASN1ParsingException("malformed DER construction: " + e8, e8);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.nextObj != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.nextObj;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.nextObj = readObject();
        return obj;
    }
}
