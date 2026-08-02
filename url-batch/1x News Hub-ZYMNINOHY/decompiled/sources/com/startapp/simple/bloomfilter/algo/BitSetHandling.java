package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BitSetHandling {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public BitSetHandling(int i3, int i4) {
        this.numberOfHashes = i3;
        this.sizeOfBucket = i4;
    }

    private void add(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        for (long j3 : getHashBuckets(byteBuffer, openBitSet.size())) {
            openBitSet.set(j3);
        }
    }

    private long[] getHashBuckets(ByteBuffer byteBuffer, long j3) {
        int i3 = this.numberOfHashes;
        long[] jArr = new long[i3];
        long j4 = j3 / i3;
        long hash64 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0L);
        long hash642 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), hash64);
        for (int i4 = 0; i4 < this.numberOfHashes; i4++) {
            long j5 = i4;
            jArr[i4] = Math.abs(((j5 * hash642) + hash64) % j4) + (j5 * j4);
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
        for (long j3 : jArr) {
            if (!openBitSet.indexInBits(j3)) {
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
