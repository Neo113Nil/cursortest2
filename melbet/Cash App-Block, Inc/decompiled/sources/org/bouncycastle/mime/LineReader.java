package org.bouncycastle.mime;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes8.dex */
class LineReader {
    private int lastC = -1;
    private final InputStream src;

    public LineReader(InputStream inputStream) {
        this.src = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2 = r4.src.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r2 == 10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r2 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r4.lastC = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
    
        r1 = r4.src.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String readLine() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.lastC;
        if (i != -1) {
            if (i == 13) {
                return "";
            }
            this.lastC = -1;
            while (i >= 0 && i != 13 && i != 10) {
                byteArrayOutputStream.write(i);
            }
            if (i < 0) {
                return null;
            }
            return Strings.fromUTF8ByteArray(byteArrayOutputStream.toByteArray());
        }
        i = this.src.read();
    }
}
