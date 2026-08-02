package org.apache.commons.imaging.formats.tiff;

import java.util.Comparator;

/* loaded from: classes9.dex */
public abstract class TiffElement {
    public static final Comparator<TiffElement> COMPARATOR = new TiffElement$$ExternalSyntheticLambda0(0);
    public final int length;
    public final long offset;

    public static abstract class DataElement extends TiffElement {
        private final byte[] data;

        public DataElement(long j, int i, byte[] bArr) {
            super(j, i);
            this.data = bArr;
        }

        public byte[] getData() {
            return (byte[]) this.data.clone();
        }

        public int getDataLength() {
            return this.data.length;
        }
    }

    public static final class Stub extends TiffElement {
        public Stub(long j, int i) {
            super(j, i);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public String getElementDescription() {
            return "Element, offset: " + this.offset + ", length: " + this.length + ", last: " + (this.offset + this.length);
        }
    }

    public TiffElement(long j, int i) {
        this.offset = j;
        this.length = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(TiffElement tiffElement, TiffElement tiffElement2) {
        long j = tiffElement.offset;
        long j2 = tiffElement2.offset;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public abstract String getElementDescription();
}
