package org.bouncycastle.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class DLBitStringParser implements ASN1BitStringParser {
    private int padBits = 0;
    private final DefiniteLengthInputStream stream;

    public DLBitStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.stream = definiteLengthInputStream;
    }

    private InputStream getBitStream(boolean z) {
        String str;
        int remaining = this.stream.getRemaining();
        if (remaining >= 1) {
            int read = this.stream.read();
            this.padBits = read;
            if (read > 0) {
                if (remaining < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (read > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                } else if (z) {
                    Path$$ExternalSyntheticBUOutline0.m$3(this.padBits, "expected octet-aligned bitstring, but found padBits: ");
                    return null;
                }
            }
            return this.stream;
        }
        str = "content octets cannot be empty";
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return ASN1BitString.createPrimitive(this.stream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() {
        return getBitStream(true);
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() {
        return getBitStream(false);
    }
}
