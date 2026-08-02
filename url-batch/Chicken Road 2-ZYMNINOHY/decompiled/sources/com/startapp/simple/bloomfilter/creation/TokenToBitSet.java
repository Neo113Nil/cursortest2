package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class TokenToBitSet {
    public static final String HIGH_PAGE_COUNT_EXCEPTION_TAG = "HighPageCountException";
    private final StringManipulations stringManipulations = new StringManipulations();

    public OpenBitSet convert(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] hexToByte = this.stringManipulations.hexToByte(str);
            if (hexToByte == null) {
                return null;
            }
            return createOpenBitSet(createDataInput(hexToByte));
        } catch (Exception e4) {
            if (e4.getMessage() != null && e4.getMessage().contains(HIGH_PAGE_COUNT_EXCEPTION_TAG)) {
                System.err.println("HighPageCountException (PLM-2573) " + e4.getMessage() + ", bad bloom token: " + str);
            }
            return null;
        }
    }

    public DataInput createDataInput(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    public abstract OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException;

    public void fillBitSet(DataInput dataInput, OpenBitSet openBitSet, long j4) throws IOException {
        int pageCount = openBitSet.getPageCount();
        for (int i4 = 0; i4 < pageCount; i4++) {
            long[] page = openBitSet.getPage(i4);
            int i5 = 0;
            while (true) {
                if (i5 < 4096) {
                    long j5 = j4 - 1;
                    if (j4 <= 0) {
                        j4 = j5;
                        break;
                    } else {
                        page[i5] = dataInput.readLong();
                        i5++;
                        j4 = j5;
                    }
                }
            }
        }
    }
}
