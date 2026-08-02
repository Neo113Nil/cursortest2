package org.apache.commons.imaging.formats.tiff.write;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;

/* loaded from: classes9.dex */
abstract class TiffOutputItem {
    public static final long UNDEFINED_VALUE = -1;
    private long offset = -1;

    public static class Value extends TiffOutputItem {
        private final byte[] bytes;
        private final String name;

        public Value(String str, byte[] bArr) {
            this.name = str;
            this.bytes = bArr;
        }

        @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
        public String getItemDescription() {
            return this.name;
        }

        @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
        public int getItemLength() {
            return this.bytes.length;
        }

        public void updateValue(byte[] bArr) {
            byte[] bArr2 = this.bytes;
            if (bArr2.length == bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return;
            }
            throw new ImageWriteException("Updated data size mismatch: " + this.bytes.length + " vs. " + bArr.length);
        }

        @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
        public void writeItem(BinaryOutputStream binaryOutputStream) {
            binaryOutputStream.write(this.bytes);
        }
    }

    public abstract String getItemDescription();

    public abstract int getItemLength();

    public long getOffset() {
        return this.offset;
    }

    public void setOffset(long j) {
        this.offset = j;
    }

    public abstract void writeItem(BinaryOutputStream binaryOutputStream);
}
