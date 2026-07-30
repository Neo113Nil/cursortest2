package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes2.dex */
public final class b0 extends n {

    /* renamed from: b, reason: collision with root package name */
    public n[] f7766b;

    public class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        public int f7767a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f7767a < b0.this.f7766b.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            n[] nVarArr = b0.this.f7766b;
            int i8 = this.f7767a;
            this.f7767a = i8 + 1;
            return nVarArr[i8];
        }
    }

    public b0(byte[] bArr) {
        super(bArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(36);
        pVar.a(128);
        Enumeration j8 = j();
        while (j8.hasMoreElements()) {
            pVar.a((d) j8.nextElement());
        }
        pVar.a(0);
        pVar.a(0);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        Enumeration j8 = j();
        int i8 = 0;
        while (j8.hasMoreElements()) {
            i8 += ((d) j8.nextElement()).c().e();
        }
        return i8 + 4;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return true;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.n
    public final byte[] i() {
        return this.f7808a;
    }

    public final Enumeration j() {
        if (this.f7766b != null) {
            return new a();
        }
        Vector vector = new Vector();
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f7808a;
            if (i8 >= bArr.length) {
                return vector.elements();
            }
            int i9 = i8 + 1000;
            int length = (i9 > bArr.length ? bArr.length : i9) - i8;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i8, bArr2, 0, length);
            vector.addElement(new v0(bArr2));
            i8 = i9;
        }
    }

    public b0(n[] nVarArr) {
        super(a(nVarArr));
        this.f7766b = nVarArr;
    }

    public static byte[] a(n[] nVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != nVarArr.length; i8++) {
            try {
                byteArrayOutputStream.write(((v0) nVarArr[i8]).f7808a);
            } catch (IOException e8) {
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("exception converting octets ");
                a8.append(e8.toString());
                throw new IllegalArgumentException(a8.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(nVarArr[i8].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
