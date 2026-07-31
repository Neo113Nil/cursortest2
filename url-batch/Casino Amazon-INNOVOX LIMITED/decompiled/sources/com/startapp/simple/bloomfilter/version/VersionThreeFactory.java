package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.NoCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSetVersionsOneAndThree;

/* loaded from: classes3.dex */
class VersionThreeFactory extends VersionFactory {
    VersionThreeFactory() {
        super(BloomVersion.THREE, new NoCompression(), new TokenToBitSetVersionsOneAndThree(), new BitSetHandling(BloomVersion.THREE.getNumberOfHashes(), BloomVersion.THREE.getSizeOfBucket()));
    }
}
