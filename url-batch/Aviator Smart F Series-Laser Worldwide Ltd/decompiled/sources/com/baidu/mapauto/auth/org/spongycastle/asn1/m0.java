package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class m0 extends b {
    public m0(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        byte[] bArr = this.f7764a;
        int i8 = this.f7765b;
        byte[] a8 = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
        if (i8 > 0) {
            int length = bArr.length - 1;
            a8[length] = (byte) ((255 << i8) & a8[length]);
        }
        int length2 = a8.length;
        byte[] bArr2 = new byte[length2 + 1];
        bArr2[0] = (byte) this.f7765b;
        System.arraycopy(a8, 0, bArr2, 1, length2);
        pVar.a(bArr2, 3);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7764a.length + 1) + 1 + this.f7764a.length + 1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    public static m0 a(Object obj) {
        if (obj == null || (obj instanceof m0)) {
            return (m0) obj;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return new m0(j1Var.f7764a, j1Var.f7765b);
        }
        if (obj instanceof byte[]) {
            try {
                return (m0) r.a((byte[]) obj);
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
