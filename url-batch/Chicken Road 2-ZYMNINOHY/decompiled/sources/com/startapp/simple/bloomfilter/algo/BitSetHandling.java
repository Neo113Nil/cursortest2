package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BitSetHandling {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public BitSetHandling(int i4, int i5) {
        this.numberOfHashes = i4;
        this.sizeOfBucket = i5;
    }

    private void add(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        for (long j4 : getHashBuckets(byteBuffer, openBitSet.size())) {
            openBitSet.set(j4);
        }
    }

    private long[] getHashBuckets(ByteBuffer byteBuffer, long j4) {
        int i4 = this.numberOfHashes;
        long[] jArr = new long[i4];
        long j5 = j4 / i4;
        long hash64 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0L);
        long hash642 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), hash64);
        for (int i5 = 0; i5 < this.numberOfHashes; i5++) {
            long j6 = i5;
            jArr[i5] = Math.abs(((j6 * hash642) + hash64) % j5) + (j6 * j5);
        }
        return jArr;
    }

    public void fillBitSetWithKeys(List<String> list, OpenBitSet openBitSet) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            add(ByteBuffer.wrap(it.next().getBytes()), openBitSet);
        }
    }

    public long[] hashBucketsFromApplication(String str) {
        return getHashBuckets(ByteBuffer.wrap(str.getBytes()), new OpenBitSet(this.numberOfHashes * this.sizeOfBucket).size());
    }

    public boolean isPresent(long[] jArr, OpenBitSet openBitSet) {
        if (jArr.length == 0) {
            return false;
        }
        for (long j4 : jArr) {
            if (!openBitSet.indexInBits(j4)) {
                return false;
            }
        }
        return true;
    }

    public OpenBitSet keysToBitSet(List<String> list) {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSetWithKeys(list, openBitSet);
        return openBitSet;
    }

    public boolean isPresent(String str, OpenBitSet openBitSet) {
        return isPresent(ByteBuffer.wrap(str.getBytes()), openBitSet);
    }

    private boolean isPresent(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        return isPresent(getHashBuckets(byteBuffer, openBitSet.size()), openBitSet);
    }
}
