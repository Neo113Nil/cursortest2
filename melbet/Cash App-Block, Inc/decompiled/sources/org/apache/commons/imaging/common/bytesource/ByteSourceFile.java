package org.apache.commons.imaging.common.bytesource;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class ByteSourceFile extends ByteSource {
    private final File file;

    public ByteSourceFile(File file) {
        super(file.getName());
        this.file = file;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getAll() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = getInputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getBlock(long j, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.file, "r");
        if (j >= 0 && i >= 0) {
            long j2 = i + j;
            if (j2 >= 0) {
                try {
                    if (j2 <= randomAccessFile.length()) {
                        byte[] rAFBytes = BinaryFunctions.getRAFBytes(randomAccessFile, j, i, "Could not read value from file");
                        randomAccessFile.close();
                        return rAFBytes;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        }
        throw new IOException("Could not read block (block start: " + j + ", block length: " + i + ", data length: " + randomAccessFile.length() + ").");
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public String getDescription() {
        return "File: '" + this.file.getAbsolutePath() + "'";
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public InputStream getInputStream() {
        return new BufferedInputStream(new FileInputStream(this.file));
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public long getLength() {
        return this.file.length();
    }
}
