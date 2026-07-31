package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.GZipBase64TokenCompression;
import com.startapp.simple.bloomfilter.compression.ToUrlStringReplacer;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;

/* loaded from: classes3.dex */
class VersionFourFactory extends VersionFactory {
    VersionFourFactory() {
        super(BloomVersion.FOUR, new GZipBase64TokenCompression(new ToUrlStringReplacer()), new DeserializerTokenToBitSet(BloomVersion.FOUR.getNumberOfHashes(), BloomVersion.FOUR.getSizeOfBucket()), new BitSetHandling(BloomVersion.FOUR.getNumberOfHashes(), BloomVersion.FOUR.getSizeOfBucket()));
    }
}
