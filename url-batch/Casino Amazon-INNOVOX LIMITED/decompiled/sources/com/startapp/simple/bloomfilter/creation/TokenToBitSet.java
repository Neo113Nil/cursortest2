package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class TokenToBitSet {
    public static final String HIGH_PAGE_COUNT_EXCEPTION_TAG = "HighPageCountException";
    private final StringManipulations stringManipulations = new StringManipulations();

    protected abstract OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException;

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
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains(HIGH_PAGE_COUNT_EXCEPTION_TAG)) {
                System.err.println("HighPageCountException (PLM-2573) " + e.getMessage() + ", bad bloom token: " + str);
            }
            return null;
        }
    }

    protected void fillBitSet(DataInput dataInput, OpenBitSet openBitSet, long j) throws IOException {
        int pageCount = openBitSet.getPageCount();
        for (int i = 0; i < pageCount; i++) {
            long[] page = openBitSet.getPage(i);
            int i2 = 0;
            while (true) {
                if (i2 < 4096) {
                    long j2 = j - 1;
                    if (j <= 0) {
                        j = j2;
                        break;
                    } else {
                        page[i2] = dataInput.readLong();
                        i2++;
                        j = j2;
                    }
                }
            }
        }
    }

    protected DataInput createDataInput(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }
}
