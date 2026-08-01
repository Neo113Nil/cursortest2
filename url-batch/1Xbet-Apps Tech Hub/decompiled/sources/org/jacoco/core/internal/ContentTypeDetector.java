package org.jacoco.core.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ContentTypeDetector {
    private static final int BUFFER_SIZE = 8;
    public static final int CLASSFILE = -889275714;
    public static final int GZFILE = 529203200;
    public static final int PACK200FILE = -889270259;
    public static final int UNKNOWN = -1;
    public static final int ZIPFILE = 1347093252;
    private final InputStream in;
    private final int type;

    public ContentTypeDetector(InputStream inputStream) throws IOException {
        if (inputStream.markSupported()) {
            this.in = inputStream;
        } else {
            this.in = new BufferedInputStream(inputStream, 8);
        }
        this.in.mark(8);
        this.type = determineType(this.in);
        this.in.reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0 != 1347093252) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int determineType(InputStream inputStream) throws IOException {
        int readInt = readInt(inputStream);
        if (readInt != -889275714) {
            int i = PACK200FILE;
            if (readInt != -889270259) {
                i = ZIPFILE;
            }
            return i;
        }
        if ((readInt(inputStream) & 65535) >= 45) {
            return CLASSFILE;
        }
        if (((-65536) & readInt) == 529203200) {
            return GZFILE;
        }
        return -1;
    }

    private static int readInt(InputStream inputStream) throws IOException {
        return inputStream.read() | (inputStream.read() << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
    }

    public InputStream getInputStream() {
        return this.in;
    }

    public int getType() {
        return this.type;
    }
}
