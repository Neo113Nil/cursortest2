package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class c0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final v f7775a;

    public c0(v vVar) {
        this.f7775a = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        InputStream b8 = b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = b8.read(bArr, 0, 4096);
            if (read < 0) {
                return new b0(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.o
    public final InputStream b() {
        return new j0(this.f7775a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e8) {
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("IOException converting stream to byte array: ");
            a8.append(e8.getMessage());
            throw new q(a8.toString(), e8);
        }
    }
}
