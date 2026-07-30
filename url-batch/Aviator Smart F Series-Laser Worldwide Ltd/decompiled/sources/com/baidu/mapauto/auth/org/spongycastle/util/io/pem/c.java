package com.baidu.mapauto.auth.org.spongycastle.util.io.pem;

import com.baidu.mapauto.auth.org.spongycastle.util.d;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c extends BufferedWriter {

    /* renamed from: a, reason: collision with root package name */
    public char[] f7875a;

    public c(StringWriter stringWriter) {
        super(stringWriter);
        this.f7875a = new char[64];
        int i8 = d.f7864a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b bVar) {
        byte[] byteArray;
        int i8;
        char[] cArr;
        int i9;
        write("-----BEGIN RSA PUBLIC KEY-----");
        newLine();
        if (!bVar.f7873a.isEmpty()) {
            Iterator it = bVar.f7873a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).getClass();
                write((String) null);
                write(": ");
                write((String) null);
                newLine();
            }
            newLine();
        }
        byte[] bArr = bVar.f7874b;
        com.baidu.mapauto.auth.org.spongycastle.util.encoders.b bVar2 = com.baidu.mapauto.auth.org.spongycastle.util.encoders.a.f7865a;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            bVar2.getClass();
            int i10 = length % 3;
            int i11 = length - i10;
            for (int i12 = 0; i12 < i11; i12 += 3) {
                int i13 = bArr[i12] & 255;
                int i14 = bArr[i12 + 1] & 255;
                byte b8 = bArr[i12 + 2];
                byteArrayOutputStream.write(bVar2.f7866a[(i13 >>> 2) & 63]);
                byteArrayOutputStream.write(bVar2.f7866a[((i13 << 4) | (i14 >>> 4)) & 63]);
                byteArrayOutputStream.write(bVar2.f7866a[((i14 << 2) | ((b8 & 255) >>> 6)) & 63]);
                byteArrayOutputStream.write(bVar2.f7866a[b8 & 63]);
            }
            if (i10 == 1) {
                int i15 = bArr[i11] & 255;
                byteArrayOutputStream.write(bVar2.f7866a[(i15 >>> 2) & 63]);
                byteArrayOutputStream.write(bVar2.f7866a[(i15 << 4) & 63]);
                byteArrayOutputStream.write(61);
            } else {
                if (i10 != 2) {
                    int i16 = i11 / 3;
                    byteArray = byteArrayOutputStream.toByteArray();
                    i8 = 0;
                    while (i8 < byteArray.length) {
                        int i17 = 0;
                        while (true) {
                            cArr = this.f7875a;
                            if (i17 != cArr.length && (i9 = i8 + i17) < byteArray.length) {
                                cArr[i17] = (char) byteArray[i9];
                                i17++;
                            }
                        }
                        write(cArr, 0, i17);
                        newLine();
                        i8 += this.f7875a.length;
                    }
                    write("-----END RSA PUBLIC KEY-----");
                    newLine();
                }
                int i18 = bArr[i11] & 255;
                int i19 = bArr[i11 + 1] & 255;
                byteArrayOutputStream.write(bVar2.f7866a[(i18 >>> 2) & 63]);
                byteArrayOutputStream.write(bVar2.f7866a[((i18 << 4) | (i19 >>> 4)) & 63]);
                byteArrayOutputStream.write(bVar2.f7866a[(i19 << 2) & 63]);
            }
            byteArrayOutputStream.write(61);
            int i162 = i11 / 3;
            byteArray = byteArrayOutputStream.toByteArray();
            i8 = 0;
            while (i8 < byteArray.length) {
            }
            write("-----END RSA PUBLIC KEY-----");
            newLine();
        } catch (Exception e8) {
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("exception encoding base64 string: ");
            a8.append(e8.getMessage());
            throw new com.baidu.mapauto.auth.org.spongycastle.util.encoders.c(a8.toString(), e8);
        }
    }
}
