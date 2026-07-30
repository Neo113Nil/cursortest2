package k7;

import java.io.BufferedWriter;
import java.io.Writer;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class e extends BufferedWriter {
    private static final int LINE_LENGTH = 64;
    private char[] buf;
    private final int nlLength;

    public e(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String lineSeparator = Strings.lineSeparator();
        this.nlLength = lineSeparator != null ? lineSeparator.length() : 2;
    }

    private void writeEncoded(byte[] bArr) {
        char[] cArr;
        int i8;
        byte[] encode = org.bouncycastle.util.encoders.a.encode(bArr);
        int i9 = 0;
        while (i9 < encode.length) {
            int i10 = 0;
            while (true) {
                cArr = this.buf;
                if (i10 != cArr.length && (i8 = i9 + i10) < encode.length) {
                    cArr[i10] = (char) encode[i8];
                    i10++;
                }
            }
            write(cArr, 0, i10);
            newLine();
            i9 += this.buf.length;
        }
    }

    private void writePostEncapsulationBoundary(String str) {
        write("-----END " + str + "-----");
        newLine();
    }

    private void writePreEncapsulationBoundary(String str) {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public int getOutputSize(b bVar) {
        int length = ((bVar.getType().length() + 10 + this.nlLength) * 2) + 10;
        if (!bVar.getHeaders().isEmpty()) {
            for (a aVar : bVar.getHeaders()) {
                length += aVar.getName().length() + 2 + aVar.getValue().length() + this.nlLength;
            }
            length += this.nlLength;
        }
        int length2 = ((bVar.getContent().length + 2) / 3) * 4;
        return length + length2 + (((length2 + 63) / 64) * this.nlLength);
    }

    public void writeObject(c cVar) {
        b generate = cVar.generate();
        writePreEncapsulationBoundary(generate.getType());
        if (!generate.getHeaders().isEmpty()) {
            for (a aVar : generate.getHeaders()) {
                write(aVar.getName());
                write(": ");
                write(aVar.getValue());
                newLine();
            }
            newLine();
        }
        writeEncoded(generate.getContent());
        writePostEncapsulationBoundary(generate.getType());
    }
}
