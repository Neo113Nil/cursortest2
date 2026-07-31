package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
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
        } catch (Exception e) {
            e = e;
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i = 0; i < pageCount; i++) {
                long[] page = openBitSet.getPage(i);
                int i2 = 0;
                while (true) {
                    if (i2 < 4096) {
                        int i3 = numWords - 1;
                        if (numWords <= 0) {
                            numWords = i3;
                            break;
                        }
                        dataOutputStream.writeLong(page[i2]);
                        i2++;
                        numWords = i3;
                    }
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            return this.stringManipulations.bytesToHex(byteArrayOutputStream.toByteArray());
        } catch (Exception e2) {
            e = e2;
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
