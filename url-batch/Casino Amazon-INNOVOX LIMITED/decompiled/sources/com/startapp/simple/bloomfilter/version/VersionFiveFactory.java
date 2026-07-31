package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.GZipBase64TokenCompression;
import com.startapp.simple.bloomfilter.compression.ToUrlStringReplacer;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;

/* loaded from: classes3.dex */
public class VersionFiveFactory extends VersionFactory {
    VersionFiveFactory() {
        super(BloomVersion.FIVE, new GZipBase64TokenCompression(new ToUrlStringReplacer()), new DeserializerTokenToBitSet(BloomVersion.FIVE.getNumberOfHashes(), BloomVersion.FIVE.getSizeOfBucket()), new BitSetHandling(BloomVersion.FIVE.getNumberOfHashes(), BloomVersion.FIVE.getSizeOfBucket()));
    }
}
