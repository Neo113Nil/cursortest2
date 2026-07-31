package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.NoCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSetVersionsOneAndThree;

/* loaded from: classes3.dex */
class VersionZeroFactory extends VersionFactory {
    VersionZeroFactory() {
        super(BloomVersion.ZERO, new NoCompression(), new TokenToBitSetVersionsOneAndThree(), new BitSetHandling(BloomVersion.ZERO.getNumberOfHashes(), BloomVersion.ZERO.getSizeOfBucket()));
    }
}
