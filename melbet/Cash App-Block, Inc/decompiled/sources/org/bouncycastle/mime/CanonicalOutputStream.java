package org.bouncycastle.mime;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.bouncycastle.mime.smime.SMimeParserContext;

/* loaded from: classes8.dex */
public class CanonicalOutputStream extends FilterOutputStream {
    protected static byte[] newline = {13, 10};
    private final boolean is7Bit;
    protected int lastb;

    public CanonicalOutputStream(SMimeParserContext sMimeParserContext, Headers headers, OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        if (headers.getContentType() != null) {
            this.is7Bit = (headers.getContentType() == null || headers.getContentType().equals("binary")) ? false : true;
        } else {
            this.is7Bit = sMimeParserContext.getDefaultContentTransferEncoding().equals("7bit");
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        if (this.is7Bit) {
            if (i == 13) {
                ((FilterOutputStream) this).out.write(newline);
            } else if (i == 10) {
                if (this.lastb != 13) {
                    ((FilterOutputStream) this).out.write(newline);
                }
            }
            this.lastb = i;
        }
        ((FilterOutputStream) this).out.write(i);
        this.lastb = i;
    }

    public void writeln() {
        ((FilterOutputStream) this).out.write(newline);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 != i + i2; i3++) {
            write(bArr[i3]);
        }
    }
}
