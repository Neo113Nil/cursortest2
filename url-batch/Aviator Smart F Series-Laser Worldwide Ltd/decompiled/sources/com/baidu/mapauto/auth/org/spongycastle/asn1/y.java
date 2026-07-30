package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class y extends a {
    public y(int i8, e eVar) {
        super(true, i8, a(eVar));
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.a, com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7758a ? 96 : 64, this.f7759b);
        pVar.a(128);
        pVar.f7818a.write(this.f7760c);
        pVar.a(0);
        pVar.a(0);
    }

    public static byte[] a(e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != eVar.f7778a.size(); i8++) {
            try {
                byteArrayOutputStream.write(((l) eVar.a(i8)).a("BER"));
            } catch (IOException e8) {
                throw new q("malformed object: " + e8, e8);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
