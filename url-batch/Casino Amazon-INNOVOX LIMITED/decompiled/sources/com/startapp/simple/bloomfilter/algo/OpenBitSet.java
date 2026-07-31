package com.startapp.simple.bloomfilter.algo;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class OpenBitSet implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int PAGE_COUNT_LIMIT = 100;
    public static final int PAGE_SIZE = 4096;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    private int bits2words(long j) {
        return (int) (((j - 1) >>> 6) + 1);
    }

    private void ensureCapacityWords(int i) {
    }

    public OpenBitSet(long j) {
        int bits2words = bits2words(j);
        this.wlen = bits2words;
        int i = bits2words % 4096;
        int i2 = bits2words / 4096;
        int i3 = (i == 0 ? 0 : 1) + i2;
        this.pageCount = i3;
        if (i3 > 100) {
            throw new RuntimeException("HighPageCountException pageCount = " + i3);
        }
        this.bits = new long[i3][];
        for (int i4 = 0; i4 < i2; i4++) {
            this.bits[i4] = new long[4096];
        }
        if (i != 0) {
            long[][] jArr = this.bits;
            jArr[jArr.length - 1] = new long[i];
        }
    }

    long size() {
        return this.wlen << 6;
    }

    void set(long j) {
        int expandingWordNum = expandingWordNum(j);
        long[] jArr = this.bits[expandingWordNum / 4096];
        int i = expandingWordNum % 4096;
        jArr[i] = (1 << (((int) j) & 63)) | jArr[i];
    }

    boolean indexInBits(long j) {
        int i = (int) (j >> 6);
        return i < this.wlen && ((1 << (((int) j) & 63)) & this.bits[i / 4096][i % 4096]) != 0;
    }

    private int expandingWordNum(long j) {
        int i = (int) (j >> 6);
        if (i >= this.wlen) {
            ensureCapacity(j + 1);
            this.wlen = i + 1;
        }
        return i;
    }

    private void ensureCapacity(long j) {
        ensureCapacityWords(bits2words(j));
    }

    public int getNumWords() {
        return this.wlen;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public long[] getPage(int i) {
        return this.bits[i];
    }
}
