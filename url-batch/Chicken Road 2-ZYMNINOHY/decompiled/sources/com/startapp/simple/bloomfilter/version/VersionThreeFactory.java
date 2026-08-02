package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.NoCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSetVersionsOneAndThree;

/* loaded from: classes.dex */
class VersionThreeFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VersionThreeFactory() {
        super(r0, new NoCompression(), new TokenToBitSetVersionsOneAndThree(), new BitSetHandling(r0.getNumberOfHashes(), r0.getSizeOfBucket()));
        BloomVersion bloomVersion = BloomVersion.THREE;
    }
}
