package org.bouncycastle.asn1;

import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    public DERGenerator(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z;
        this._tagNo = i;
    }

    private void writeLength(OutputStream outputStream, int i) {
        if (i <= 127) {
            outputStream.write((byte) i);
            return;
        }
        int i2 = 1;
        int i3 = i;
        while (true) {
            i3 >>>= 8;
            if (i3 == 0) {
                break;
            } else {
                i2++;
            }
        }
        outputStream.write((byte) (i2 | 128));
        for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
            outputStream.write((byte) (i >> i4));
        }
    }

    public void writeDEREncoded(int i, byte[] bArr) {
        if (!this._tagged) {
            writeDEREncoded(this._out, i, bArr);
            return;
        }
        int i2 = this._tagNo;
        int i3 = i2 | 128;
        if (this._isExplicit) {
            int i4 = i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeDEREncoded(byteArrayOutputStream, i, bArr);
            writeDEREncoded(this._out, i4, byteArrayOutputStream.toByteArray());
            return;
        }
        int i5 = i & 32;
        OutputStream outputStream = this._out;
        if (i5 != 0) {
            writeDEREncoded(outputStream, i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, bArr);
        } else {
            writeDEREncoded(outputStream, i3, bArr);
        }
    }

    public DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    public void writeDEREncoded(OutputStream outputStream, int i, byte[] bArr) {
        outputStream.write(i);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
