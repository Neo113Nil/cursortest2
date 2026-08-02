package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes.dex */
public class DeserializerTokenToBitSet extends TokenToBitSet {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public DeserializerTokenToBitSet(int i3, int i4) {
        this.numberOfHashes = i3;
        this.sizeOfBucket = i4;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSet(dataInput, openBitSet, openBitSet.getNumWords());
        return openBitSet;
    }
}
