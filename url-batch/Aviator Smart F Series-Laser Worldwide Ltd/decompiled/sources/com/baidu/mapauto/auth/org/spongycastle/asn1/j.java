package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7796a;

    public j(BigInteger bigInteger) {
        this.f7796a = bigInteger.toByteArray();
    }

    public static boolean b(byte[] bArr) {
        if (bArr.length > 1) {
            byte b8 = bArr[0];
            if (b8 == 0 && (bArr[1] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return true;
            }
            if (b8 == -1 && (bArr[1] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7796a, 2);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7796a.length) + 1 + this.f7796a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f7796a;
            if (i8 == bArr.length) {
                return i9;
            }
            i9 ^= (bArr[i8] & 255) << (i8 % 4);
            i8++;
        }
    }

    public final BigInteger i() {
        return new BigInteger(1, this.f7796a);
    }

    public final String toString() {
        return new BigInteger(this.f7796a).toString();
    }

    public j(byte[] bArr) {
        if (!com.baidu.mapauto.auth.org.spongycastle.util.c.a() && b(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f7796a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof j) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7796a, ((j) rVar).f7796a);
        }
        return false;
    }

    public static j a(Object obj) {
        if (obj == null || (obj instanceof j)) {
            return (j) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (j) r.a((byte[]) obj);
            } catch (Exception e8) {
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("encoding error in getInstance: ");
                a8.append(e8.toString());
                throw new IllegalArgumentException(a8.toString());
            }
        }
        StringBuilder a9 = com.baidu.mapauto.auth.b.a("illegal object in getInstance: ");
        a9.append(obj.getClass().getName());
        throw new IllegalArgumentException(a9.toString());
    }
}
