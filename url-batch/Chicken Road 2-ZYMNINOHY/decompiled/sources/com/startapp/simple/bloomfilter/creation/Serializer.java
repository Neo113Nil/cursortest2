package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class Serializer {
    private final StringManipulations stringManipulations = new StringManipulations();

    public String serialize(OpenBitSet openBitSet) {
        ByteArrayOutputStream byteArrayOutputStream;
        int numWords = openBitSet.getNumWords();
        int pageCount = openBitSet.getPageCount();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i4 = 0; i4 < pageCount; i4++) {
                long[] page = openBitSet.getPage(i4);
                int i5 = 0;
                while (true) {
                    if (i5 < 4096) {
                        int i6 = numWords - 1;
                        if (numWords <= 0) {
                            numWords = i6;
                            break;
                        }
                        dataOutputStream.writeLong(page[i5]);
                        i5++;
                        numWords = i6;
                    }
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            return this.stringManipulations.bytesToHex(byteArrayOutputStream.toByteArray());
        } catch (Exception e5) {
            e = e5;
            throw new RuntimeException("problem serializing bitSet", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
