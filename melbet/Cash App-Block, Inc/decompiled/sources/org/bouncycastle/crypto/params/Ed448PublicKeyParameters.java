package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public final class Ed448PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 57;
    private final Ed448.PublicPoint publicPoint;

    public Ed448PublicKeyParameters(InputStream inputStream) {
        super(false);
        byte[] bArr = new byte[57];
        if (57 == Streams.readFully(inputStream, bArr)) {
            this.publicPoint = parse(bArr, 0);
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1("EOF encountered in middle of Ed448 public key");
            throw null;
        }
    }

    private static Ed448.PublicPoint parse(byte[] bArr, int i) {
        Ed448.PublicPoint validatePublicKeyPartialExport = Ed448.validatePublicKeyPartialExport(bArr, i);
        if (validatePublicKeyPartialExport != null) {
            return validatePublicKeyPartialExport;
        }
        a$$ExternalSyntheticBUOutline0.m$3("invalid public key");
        return null;
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        a$$ExternalSyntheticBUOutline0.m$3("'buf' must have length 57");
        return null;
    }

    public void encode(byte[] bArr, int i) {
        Ed448.encodePublicPoint(this.publicPoint, bArr, i);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[57];
        encode(bArr, 0);
        return bArr;
    }

    public boolean verify(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        String str;
        if (i == 0) {
            if (bArr == null) {
                a$$ExternalSyntheticBUOutline0.m$2("'ctx' cannot be null");
                return false;
            }
            if (bArr.length <= 255) {
                return Ed448.verify(bArr3, i4, this.publicPoint, bArr, bArr2, i2, i3);
            }
            a$$ExternalSyntheticBUOutline0.m$3("ctx");
            return false;
        }
        if (i != 1) {
            str = "algorithm";
        } else {
            if (bArr == null) {
                a$$ExternalSyntheticBUOutline0.m$2("'ctx' cannot be null");
                return false;
            }
            if (bArr.length > 255) {
                a$$ExternalSyntheticBUOutline0.m$3("ctx");
                return false;
            }
            if (64 == i3) {
                return Ed448.verifyPrehash(bArr3, i4, this.publicPoint, bArr, bArr2, i2);
            }
            str = "msgLen";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return false;
    }

    public Ed448PublicKeyParameters(Ed448.PublicPoint publicPoint) {
        super(false);
        if (publicPoint != null) {
            this.publicPoint = publicPoint;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("'publicPoint' cannot be null");
            throw null;
        }
    }

    public Ed448PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed448PublicKeyParameters(byte[] bArr, int i) {
        super(false);
        this.publicPoint = parse(bArr, i);
    }
}
