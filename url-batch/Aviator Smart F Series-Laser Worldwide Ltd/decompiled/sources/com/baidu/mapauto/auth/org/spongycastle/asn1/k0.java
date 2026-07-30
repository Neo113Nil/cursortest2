package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class k0 extends a {
    public k0(boolean z7, int i8, byte[] bArr) {
        super(z7, i8, bArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.a, com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        int i8 = this.f7758a ? 96 : 64;
        int i9 = this.f7759b;
        byte[] bArr = this.f7760c;
        pVar.a(i8, i9);
        pVar.b(bArr.length);
        pVar.f7818a.write(bArr);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.f7758a) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.f7759b));
        stringBuffer.append("]");
        if (this.f7760c != null) {
            stringBuffer.append(" #");
            byte[] bArr = this.f7760c;
            com.baidu.mapauto.auth.org.spongycastle.util.encoders.e eVar = com.baidu.mapauto.auth.org.spongycastle.util.encoders.d.f7869a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                eVar.getClass();
                for (byte b8 : bArr) {
                    byteArrayOutputStream.write(eVar.f7870a[(b8 & 255) >>> 4]);
                    byteArrayOutputStream.write(eVar.f7870a[b8 & 15]);
                }
                stringBuffer.append(com.baidu.mapauto.auth.org.spongycastle.util.d.a(byteArrayOutputStream.toByteArray()));
            } catch (Exception e8) {
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("exception encoding Hex string: ");
                a8.append(e8.getMessage());
                throw new com.baidu.mapauto.auth.org.spongycastle.util.encoders.c(a8.toString(), e8);
            }
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(cn.hutool.core.text.l.SPACE);
        return stringBuffer.toString();
    }
}
