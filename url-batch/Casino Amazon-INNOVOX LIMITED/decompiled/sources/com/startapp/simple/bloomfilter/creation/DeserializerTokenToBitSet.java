package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes3.dex */
public class DeserializerTokenToBitSet extends TokenToBitSet {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public DeserializerTokenToBitSet(int i, int i2) {
        this.numberOfHashes = i;
        this.sizeOfBucket = i2;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    protected OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSet(dataInput, openBitSet, openBitSet.getNumWords());
        return openBitSet;
    }
}
