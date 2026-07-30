package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ju, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3440ju {
    public static final String a(byte[] bArr, byte[] bArr2, String str, C3002bo c3002bo) {
        C2593Hm c2593Hm;
        if (str != null) {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                    try {
                        YK yk = YK.f28820a;
                        int i = KK.f25952a;
                        C3842rI F8 = C3842rI.F(byteArrayInputStream, YK.f28821b);
                        byteArrayInputStream.close();
                        c2593Hm = C2593Hm.d(F8);
                    } catch (Throwable th) {
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e6) {
                t2.C.k("Failed to get keysethandle".concat(e6.toString()));
                p2.j.f39798C.f39808h.d("CryptoUtils.getHandle", e6);
                c2593Hm = null;
            }
            if (c2593Hm != null) {
                try {
                    AbstractC3406jD.d();
                    byte[] a9 = ((InterfaceC3569mE) c2593Hm.z(AbstractC3035cL.f29686I, InterfaceC3569mE.class)).a(bArr, bArr2);
                    c3002bo.f29588a.put("ds", "1");
                    return new String(a9, StandardCharsets.UTF_8);
                } catch (UnsupportedOperationException | GeneralSecurityException e9) {
                    t2.C.k("Failed to decrypt ".concat(e9.toString()));
                    p2.j.f39798C.f39808h.d("CryptoUtils.decrypt", e9);
                    c3002bo.f29588a.put("dsf", e9.toString());
                }
            }
        }
        return null;
    }
}
