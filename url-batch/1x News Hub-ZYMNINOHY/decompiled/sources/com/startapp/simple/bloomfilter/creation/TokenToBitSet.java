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
        } catch (Exception e3) {
            if (e3.getMessage() != null && e3.getMessage().contains(HIGH_PAGE_COUNT_EXCEPTION_TAG)) {
                System.err.println("HighPageCountException (PLM-2573) " + e3.getMessage() + ", bad bloom token: " + str);
            }
            return null;
        }
    }

    public DataInput createDataInput(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    public abstract OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException;

    public void fillBitSet(DataInput dataInput, OpenBitSet openBitSet, long j3) throws IOException {
        int pageCount = openBitSet.getPageCount();
        for (int i3 = 0; i3 < pageCount; i3++) {
            long[] page = openBitSet.getPage(i3);
            int i4 = 0;
            while (true) {
                if (i4 < 4096) {
                    long j4 = j3 - 1;
                    if (j3 <= 0) {
                        j3 = j4;
                        break;
                    } else {
                        page[i4] = dataInput.readLong();
                        i4++;
                        j3 = j4;
                    }
                }
            }
        }
    }
}
