package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class b extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f7763c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7765b;

    public b(byte[] bArr, int i8) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i8 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i8 > 7 || i8 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f7764a = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        this.f7765b = i8;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof b)) {
            return false;
        }
        b bVar = (b) rVar;
        int i8 = this.f7765b;
        if (i8 != bVar.f7765b) {
            return false;
        }
        byte[] bArr = this.f7764a;
        byte[] a8 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        if (i8 > 0) {
            int length = bArr.length - 1;
            a8[length] = (byte) ((255 << i8) & a8[length]);
        }
        byte[] bArr2 = bVar.f7764a;
        int i9 = bVar.f7765b;
        byte[] a9 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr2);
        if (i9 > 0) {
            int length2 = bArr2.length - 1;
            a9[length2] = (byte) ((255 << i9) & a9[length2]);
        }
        return com.baidu.mapauto.auth.org.spongycastle.util.a.a(a8, a9);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        return new m0(this.f7764a, this.f7765b);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        return new j1(this.f7764a, this.f7765b);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        int i8 = this.f7765b;
        byte[] bArr = this.f7764a;
        byte[] a8 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        if (i8 > 0) {
            int length = bArr.length - 1;
            a8[length] = (byte) (a8[length] & (255 << i8));
        }
        return i8 ^ com.baidu.mapauto.auth.org.spongycastle.util.a.b(a8);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new p(byteArrayOutputStream).a((d) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i8 = 0; i8 != byteArray.length; i8++) {
                char[] cArr = f7763c;
                stringBuffer.append(cArr[(byteArray[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e8) {
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("Internal error encoding BitString: ");
            a8.append(e8.getMessage());
            throw new q(a8.toString(), e8);
        }
    }
}
