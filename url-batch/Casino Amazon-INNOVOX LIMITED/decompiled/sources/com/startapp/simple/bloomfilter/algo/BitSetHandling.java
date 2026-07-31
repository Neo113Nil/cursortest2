package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class BitSetHandling {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public BitSetHandling(int i, int i2) {
        this.numberOfHashes = i;
        this.sizeOfBucket = i2;
    }

    public OpenBitSet keysToBitSet(List<String> list) {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSetWithKeys(list, openBitSet);
        return openBitSet;
    }

    public long[] hashBucketsFromApplication(String str) {
        return getHashBuckets(ByteBuffer.wrap(str.getBytes()), new OpenBitSet(this.numberOfHashes * this.sizeOfBucket).size());
    }

    void fillBitSetWithKeys(List<String> list, OpenBitSet openBitSet) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            add(ByteBuffer.wrap(it.next().getBytes()), openBitSet);
        }
    }

    boolean isPresent(long[] jArr, OpenBitSet openBitSet) {
        if (jArr.length == 0) {
            return false;
        }
        for (long j : jArr) {
            if (!openBitSet.indexInBits(j)) {
                return false;
            }
        }
        return true;
    }

    boolean isPresent(String str, OpenBitSet openBitSet) {
        return isPresent(ByteBuffer.wrap(str.getBytes()), openBitSet);
    }

    private boolean isPresent(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        return isPresent(getHashBuckets(byteBuffer, openBitSet.size()), openBitSet);
    }

    private void add(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        for (long j : getHashBuckets(byteBuffer, openBitSet.size())) {
            openBitSet.set(j);
        }
    }

    private long[] getHashBuckets(ByteBuffer byteBuffer, long j) {
        int i = this.numberOfHashes;
        long[] jArr = new long[i];
        long j2 = j / i;
        long hash64 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0L);
        long hash642 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), hash64);
        for (int i2 = 0; i2 < this.numberOfHashes; i2++) {
            long j3 = i2;
            jArr[i2] = (j3 * j2) + Math.abs(((j3 * hash642) + hash64) % j2);
        }
        return jArr;
    }
}
