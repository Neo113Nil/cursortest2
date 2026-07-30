package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class h0 extends p {
    private static final int DEFAULT_CHUNK_SIZE = 1000;
    private final int chunkSize;
    private final p[] octs;

    class a implements Enumeration {
        int pos = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.pos < h0.this.string.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.pos;
            h0 h0Var = h0.this;
            byte[] bArr = h0Var.string;
            if (i8 >= bArr.length) {
                throw new NoSuchElementException();
            }
            int min = Math.min(bArr.length - i8, h0Var.chunkSize);
            byte[] bArr2 = new byte[min];
            System.arraycopy(h0.this.string, this.pos, bArr2, 0, min);
            this.pos += min;
            return new c1(bArr2);
        }
    }

    class b implements Enumeration {
        int counter = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.counter < h0.this.octs.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.counter >= h0.this.octs.length) {
                throw new NoSuchElementException();
            }
            p[] pVarArr = h0.this.octs;
            int i8 = this.counter;
            this.counter = i8 + 1;
            return pVarArr[i8];
        }
    }

    public h0(byte[] bArr) {
        this(bArr, 1000);
    }

    static h0 fromSequence(v vVar) {
        int size = vVar.size();
        p[] pVarArr = new p[size];
        for (int i8 = 0; i8 < size; i8++) {
            pVarArr[i8] = p.getInstance(vVar.getObjectAt(i8));
        }
        return new h0(pVarArr);
    }

    private static byte[] toBytes(p[] pVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != pVarArr.length; i8++) {
            try {
                byteArrayOutputStream.write(pVarArr[i8].getOctets());
            } catch (IOException e8) {
                throw new IllegalArgumentException("exception converting octets " + e8.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncodedIndef(z7, 36, getObjects());
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        Enumeration objects = getObjects();
        int i8 = 0;
        while (objects.hasMoreElements()) {
            i8 += ((f) objects.nextElement()).toASN1Primitive().encodedLength();
        }
        return i8 + 4;
    }

    public Enumeration getObjects() {
        return this.octs == null ? new a() : new b();
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return true;
    }

    public h0(byte[] bArr, int i8) {
        this(bArr, null, i8);
    }

    private h0(byte[] bArr, p[] pVarArr, int i8) {
        super(bArr);
        this.octs = pVarArr;
        this.chunkSize = i8;
    }

    public h0(p[] pVarArr) {
        this(pVarArr, 1000);
    }

    public h0(p[] pVarArr, int i8) {
        this(toBytes(pVarArr), pVarArr, i8);
    }
}
