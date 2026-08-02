package org.bouncycastle.jcajce.spec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.spec.EncodedKeySpec;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class OpenSSHPublicKeySpec extends EncodedKeySpec {
    private static final String[] allowedTypes = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* renamed from: type, reason: collision with root package name */
    private final String f1598type;

    public OpenSSHPublicKeySpec(byte[] bArr) {
        super(bArr);
        int i = 0;
        int i2 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i2 >= bArr.length) {
            a$$ExternalSyntheticBUOutline0.m$3("invalid public key blob: type field longer than blob");
            throw null;
        }
        String fromByteArray = Strings.fromByteArray(Arrays.copyOfRange(bArr, 4, i2));
        this.f1598type = fromByteArray;
        if (fromByteArray.startsWith("ecdsa")) {
            return;
        }
        while (true) {
            String[] strArr = allowedTypes;
            if (i >= strArr.length) {
                Path$$ExternalSyntheticBUOutline0.m(this.f1598type, "unrecognised public key type ");
                throw null;
            }
            if (strArr[i].equals(this.f1598type)) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }

    public String getType() {
        return this.f1598type;
    }
}
