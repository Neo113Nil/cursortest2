package org.apache.commons.imaging.common.bytesource;

import java.io.InputStream;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public abstract class ByteSource {
    private final String fileName;

    public ByteSource(String str) {
        this.fileName = str;
    }

    public abstract byte[] getAll();

    public byte[] getBlock(int i, int i2) {
        return getBlock(BodyPartID.bodyIdMax & i, i2);
    }

    public abstract byte[] getBlock(long j, int i);

    public abstract String getDescription();

    public final String getFileName() {
        return this.fileName;
    }

    public abstract InputStream getInputStream();

    public final InputStream getInputStream(long j) {
        InputStream inputStream;
        try {
            inputStream = getInputStream();
            try {
                BinaryFunctions.skipBytes(inputStream, j);
                return inputStream;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public abstract long getLength();
}
