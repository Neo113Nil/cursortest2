package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class n extends r implements o {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7808a;

    public n(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f7808a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return this;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.o
    public final InputStream b() {
        return new ByteArrayInputStream(this.f7808a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        return new v0(this.f7808a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        return new v0(this.f7808a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(i());
    }

    public byte[] i() {
        return this.f7808a;
    }

    public final String toString() {
        StringBuilder a8 = com.baidu.mapauto.auth.b.a("#");
        byte[] bArr = this.f7808a;
        com.baidu.mapauto.auth.org.spongycastle.util.encoders.e eVar = com.baidu.mapauto.auth.org.spongycastle.util.encoders.d.f7869a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar.getClass();
            for (byte b8 : bArr) {
                byteArrayOutputStream.write(eVar.f7870a[(b8 & 255) >>> 4]);
                byteArrayOutputStream.write(eVar.f7870a[b8 & 15]);
            }
            a8.append(com.baidu.mapauto.auth.org.spongycastle.util.d.a(byteArrayOutputStream.toByteArray()));
            return a8.toString();
        } catch (Exception e8) {
            StringBuilder a9 = com.baidu.mapauto.auth.b.a("exception encoding Hex string: ");
            a9.append(e8.getMessage());
            throw new com.baidu.mapauto.auth.org.spongycastle.util.encoders.c(a9.toString(), e8);
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof n) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7808a, ((n) rVar).f7808a);
        }
        return false;
    }
}
