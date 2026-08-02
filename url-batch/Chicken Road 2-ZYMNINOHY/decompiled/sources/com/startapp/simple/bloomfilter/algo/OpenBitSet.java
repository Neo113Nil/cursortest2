package com.startapp.simple.bloomfilter.algo;

import E.AbstractC0005f;
import java.io.Serializable;

/* loaded from: classes.dex */
public class OpenBitSet implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int PAGE_COUNT_LIMIT = 100;
    public static final int PAGE_SIZE = 4096;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    public OpenBitSet(long j4) {
        int bits2words = bits2words(j4);
        this.wlen = bits2words;
        int i4 = bits2words % 4096;
        int i5 = bits2words / 4096;
        int i6 = (i4 == 0 ? 0 : 1) + i5;
        this.pageCount = i6;
        if (i6 > 100) {
            throw new RuntimeException(AbstractC0005f.j(i6, "HighPageCountException pageCount = "));
        }
        this.bits = new long[i6][];
        for (int i7 = 0; i7 < i5; i7++) {
            this.bits[i7] = new long[4096];
        }
        if (i4 != 0) {
            long[][] jArr = this.bits;
            jArr[jArr.length - 1] = new long[i4];
        }
    }

    private int bits2words(long j4) {
        return (int) (((j4 - 1) >>> 6) + 1);
    }

    private void ensureCapacity(long j4) {
        ensureCapacityWords(bits2words(j4));
    }

    private void ensureCapacityWords(int i4) {
    }

    private int expandingWordNum(long j4) {
        int i4 = (int) (j4 >> 6);
        if (i4 >= this.wlen) {
            ensureCapacity(j4 + 1);
            this.wlen = i4 + 1;
        }
        return i4;
    }

    public int getNumWords() {
        return this.wlen;
    }

    public long[] getPage(int i4) {
        return this.bits[i4];
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public boolean indexInBits(long j4) {
        int i4 = (int) (j4 >> 6);
        return i4 < this.wlen && ((1 << (((int) j4) & 63)) & this.bits[i4 / 4096][i4 % 4096]) != 0;
    }

    public void set(long j4) {
        int expandingWordNum = expandingWordNum(j4);
        long[] jArr = this.bits[expandingWordNum / 4096];
        int i4 = expandingWordNum % 4096;
        jArr[i4] = (1 << (((int) j4) & 63)) | jArr[i4];
    }

    public long size() {
        return this.wlen << 6;
    }
}
