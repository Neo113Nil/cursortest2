package org.apache.commons.imaging.common.bytesource;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class ByteSourceInputStream extends ByteSource {
    private static final int BLOCK_SIZE = 1024;
    private CacheBlock cacheHead;
    private final InputStream is;
    private byte[] readBuffer;
    private long streamLength;

    public class CacheBlock {
        public final byte[] bytes;
        private CacheBlock next;
        private boolean triedNext;

        public CacheBlock(byte[] bArr) {
            this.bytes = bArr;
        }

        public CacheBlock getNext() {
            CacheBlock cacheBlock = this.next;
            if (cacheBlock != null) {
                return cacheBlock;
            }
            if (this.triedNext) {
                return null;
            }
            this.triedNext = true;
            CacheBlock readBlock = ByteSourceInputStream.this.readBlock();
            this.next = readBlock;
            return readBlock;
        }
    }

    public ByteSourceInputStream(InputStream inputStream, String str) {
        super(str);
        this.streamLength = -1L;
        this.is = new BufferedInputStream(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CacheBlock getFirstBlock() {
        if (this.cacheHead == null) {
            this.cacheHead = readBlock();
        }
        return this.cacheHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CacheBlock readBlock() {
        if (this.readBuffer == null) {
            this.readBuffer = new byte[1024];
        }
        int read = this.is.read(this.readBuffer);
        if (read < 1) {
            return null;
        }
        if (read < 1024) {
            byte[] bArr = new byte[read];
            System.arraycopy(this.readBuffer, 0, bArr, 0, read);
            return new CacheBlock(bArr);
        }
        byte[] bArr2 = this.readBuffer;
        this.readBuffer = null;
        return new CacheBlock(bArr2);
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getAll() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (CacheBlock firstBlock = getFirstBlock(); firstBlock != null; firstBlock = firstBlock.getNext()) {
            byteArrayOutputStream.write(firstBlock.bytes);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getBlock(long j, int i) {
        if (j >= 0 && i >= 0) {
            long j2 = i + j;
            if (j2 >= 0 && j2 <= getLength()) {
                InputStream inputStream = getInputStream();
                BinaryFunctions.skipBytes(inputStream, j);
                byte[] bArr = new byte[i];
                int i2 = 0;
                do {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read < 1) {
                        a$$ExternalSyntheticBUOutline0.m$4("Could not read block.");
                        return null;
                    }
                    i2 += read;
                } while (i2 < i);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder("Could not read block (block start: ");
        sb.append(j);
        sb.append(", block length: ");
        sb.append(i);
        sb.append(", data length: ");
        a$$ExternalSyntheticBUOutline0.m$4(CameraState$Type$EnumUnboxingLocalUtility.m(this.streamLength, ").", sb));
        return null;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public String getDescription() {
        return "Inputstream: '" + getFileName() + "'";
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public InputStream getInputStream() {
        return new CacheReadingInputStream();
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public long getLength() {
        long j = this.streamLength;
        if (j >= 0) {
            return j;
        }
        InputStream inputStream = getInputStream();
        long j2 = 0;
        while (true) {
            long skip = inputStream.skip(1024L);
            if (skip <= 0) {
                this.streamLength = j2;
                return j2;
            }
            j2 += skip;
        }
    }

    public class CacheReadingInputStream extends InputStream {
        private CacheBlock block;
        private int blockIndex;
        private boolean readFirst;

        private CacheReadingInputStream() {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3;
            Objects.requireNonNull(bArr, "array");
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                JWK$$ExternalSyntheticBUOutline0.m2173m();
                return 0;
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.block == null) {
                if (this.readFirst) {
                    return -1;
                }
                this.block = ByteSourceInputStream.this.getFirstBlock();
                this.readFirst = true;
            }
            CacheBlock cacheBlock = this.block;
            if (cacheBlock != null && this.blockIndex >= cacheBlock.bytes.length) {
                this.block = cacheBlock.getNext();
                this.blockIndex = 0;
            }
            CacheBlock cacheBlock2 = this.block;
            if (cacheBlock2 == null) {
                return -1;
            }
            int i4 = this.blockIndex;
            byte[] bArr2 = cacheBlock2.bytes;
            if (i4 >= bArr2.length) {
                return -1;
            }
            int min = Math.min(i2, bArr2.length - i4);
            System.arraycopy(this.block.bytes, this.blockIndex, bArr, i, min);
            this.blockIndex += min;
            return min;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j <= 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                if (this.block == null) {
                    if (this.readFirst) {
                        return -1L;
                    }
                    this.block = ByteSourceInputStream.this.getFirstBlock();
                    this.readFirst = true;
                }
                CacheBlock cacheBlock = this.block;
                if (cacheBlock != null && this.blockIndex >= cacheBlock.bytes.length) {
                    this.block = cacheBlock.getNext();
                    this.blockIndex = 0;
                }
                CacheBlock cacheBlock2 = this.block;
                if (cacheBlock2 == null || this.blockIndex >= cacheBlock2.bytes.length) {
                    break;
                }
                int min = Math.min((int) Math.min(1024L, j2), this.block.bytes.length - this.blockIndex);
                this.blockIndex += min;
                j2 -= min;
            }
            return j - j2;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.block == null) {
                if (this.readFirst) {
                    return -1;
                }
                this.block = ByteSourceInputStream.this.getFirstBlock();
                this.readFirst = true;
            }
            CacheBlock cacheBlock = this.block;
            if (cacheBlock != null && this.blockIndex >= cacheBlock.bytes.length) {
                this.block = cacheBlock.getNext();
                this.blockIndex = 0;
            }
            CacheBlock cacheBlock2 = this.block;
            if (cacheBlock2 == null) {
                return -1;
            }
            int i = this.blockIndex;
            byte[] bArr = cacheBlock2.bytes;
            if (i >= bArr.length) {
                return -1;
            }
            this.blockIndex = i + 1;
            return bArr[i] & 255;
        }
    }
}
