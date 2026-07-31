package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.TokenCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class VersionFactoryHolder {
    private final Map<BloomVersion, VersionFactory> factories;

    public VersionFactoryHolder() {
        HashMap hashMap = new HashMap();
        this.factories = hashMap;
        hashMap.put(BloomVersion.ZERO, new VersionZeroFactory());
        hashMap.put(BloomVersion.THREE, new VersionThreeFactory());
        hashMap.put(BloomVersion.FOUR, new VersionFourFactory());
        hashMap.put(BloomVersion.FIVE, new VersionFiveFactory());
    }

    public BitSetHandling getBitSetHandling(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getBitSetHandling();
    }

    public TokenCompression getTokenCompression(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getTokenCompression();
    }

    public TokenToBitSet getTokenToBitSet(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getTokenToBitSet();
    }

    public BloomVersion getBloomVersion(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getBloomVersion();
    }
}
