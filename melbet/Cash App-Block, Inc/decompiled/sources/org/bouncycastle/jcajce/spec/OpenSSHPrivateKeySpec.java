package org.bouncycastle.jcajce.spec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.spec.EncodedKeySpec;

/* loaded from: classes9.dex */
public class OpenSSHPrivateKeySpec extends EncodedKeySpec {

    /* renamed from: format, reason: collision with root package name */
    private final String f1597format;

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        super(bArr);
        String str;
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else {
            if (b != 111) {
                a$$ExternalSyntheticBUOutline0.m$3("unknown byte encoding");
                throw null;
            }
            str = "OpenSSH";
        }
        this.f1597format = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.f1597format;
    }
}
