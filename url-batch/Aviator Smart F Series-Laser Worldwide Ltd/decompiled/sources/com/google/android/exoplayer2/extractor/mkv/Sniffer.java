package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;

@Deprecated
/* loaded from: classes3.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) {
        int i8 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i9 = this.scratch.getData()[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while ((i9 & i10) == 0) {
            i10 >>= 1;
            i11++;
        }
        int i12 = i9 & (~i10);
        extractorInput.peekFully(this.scratch.getData(), 1, i11);
        while (i8 < i11) {
            i8++;
            i12 = (this.scratch.getData()[i8] & 255) + (i12 << 8);
        }
        this.peekLength += i11 + 1;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sniff(ExtractorInput extractorInput) {
        long length = extractorInput.getLength();
        long j8 = 1024;
        if (length != -1 && length <= 1024) {
            j8 = length;
        }
        int i8 = (int) j8;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long readUnsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (readUnsignedInt != 440786851) {
            int i9 = this.peekLength + 1;
            this.peekLength = i9;
            if (i9 == i8) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            readUnsignedInt = ((readUnsignedInt << 8) & (-256)) | (this.scratch.getData()[0] & 255);
        }
        long readUint = readUint(extractorInput);
        long j9 = this.peekLength;
        if (readUint == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j9 + readUint >= length) {
            return false;
        }
        while (true) {
            int i10 = this.peekLength;
            long j10 = j9 + readUint;
            if (i10 >= j10) {
                return ((long) i10) == j10;
            }
            if (readUint(extractorInput) == Long.MIN_VALUE) {
                return false;
            }
            long readUint2 = readUint(extractorInput);
            if (readUint2 < 0 || readUint2 > 2147483647L) {
                break;
            }
            if (readUint2 != 0) {
                int i11 = (int) readUint2;
                extractorInput.advancePeekPosition(i11);
                this.peekLength += i11;
            }
        }
    }
}
