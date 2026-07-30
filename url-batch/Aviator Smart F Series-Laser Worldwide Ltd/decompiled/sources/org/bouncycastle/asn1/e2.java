package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes5.dex */
class e2 extends v {
    private byte[] encoded;

    e2(byte[] bArr) {
        this.encoded = bArr;
    }

    private void force() {
        if (this.encoded != null) {
            g gVar = new g();
            d2 d2Var = new d2(this.encoded);
            while (d2Var.hasMoreElements()) {
                gVar.add((s) d2Var.nextElement());
            }
            this.elements = gVar.takeElements();
            this.encoded = null;
        }
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s
    synchronized void encode(r rVar, boolean z7) {
        try {
            byte[] bArr = this.encoded;
            if (bArr != null) {
                rVar.writeEncoded(z7, 48, bArr);
            } else {
                super.toDLObject().encode(rVar, z7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.bouncycastle.asn1.s
    synchronized int encodedLength() {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            return h2.calculateBodyLength(bArr.length) + 1 + this.encoded.length;
        }
        return super.toDLObject().encodedLength();
    }

    @Override // org.bouncycastle.asn1.v
    public synchronized f getObjectAt(int i8) {
        force();
        return super.getObjectAt(i8);
    }

    @Override // org.bouncycastle.asn1.v
    public synchronized Enumeration getObjects() {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            return new d2(bArr);
        }
        return super.getObjects();
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public synchronized int hashCode() {
        force();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.util.f, java.lang.Iterable
    public synchronized Iterator<f> iterator() {
        force();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.v
    public synchronized int size() {
        force();
        return super.size();
    }

    @Override // org.bouncycastle.asn1.v
    public synchronized f[] toArray() {
        force();
        return super.toArray();
    }

    @Override // org.bouncycastle.asn1.v
    f[] toArrayInternal() {
        force();
        return super.toArrayInternal();
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s
    synchronized s toDERObject() {
        force();
        return super.toDERObject();
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s
    synchronized s toDLObject() {
        force();
        return super.toDLObject();
    }
}
