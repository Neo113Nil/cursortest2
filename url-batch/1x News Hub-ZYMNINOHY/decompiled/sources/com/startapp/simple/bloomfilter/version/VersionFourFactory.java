package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.GZipBase64TokenCompression;
import com.startapp.simple.bloomfilter.compression.ToUrlStringReplacer;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;

/* loaded from: classes.dex */
class VersionFourFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VersionFourFactory() {
        super(r0, new GZipBase64TokenCompression(new ToUrlStringReplacer()), new DeserializerTokenToBitSet(r0.getNumberOfHashes(), r0.getSizeOfBucket()), new BitSetHandling(r0.getNumberOfHashes(), r0.getSizeOfBucket()));
        BloomVersion bloomVersion = BloomVersion.FOUR;
    }
}
