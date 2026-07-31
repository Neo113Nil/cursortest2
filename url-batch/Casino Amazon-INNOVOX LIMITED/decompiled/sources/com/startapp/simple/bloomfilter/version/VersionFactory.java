package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.TokenCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSet;

/* loaded from: classes3.dex */
abstract class VersionFactory {
    private final BitSetHandling bitSetHandling;
    private final BloomVersion bloomVersion;
    private final TokenCompression tokenCompression;
    private final TokenToBitSet tokenToBitSet;

    protected VersionFactory(BloomVersion bloomVersion, TokenCompression tokenCompression, TokenToBitSet tokenToBitSet, BitSetHandling bitSetHandling) {
        this.bloomVersion = bloomVersion;
        this.tokenCompression = tokenCompression;
        this.tokenToBitSet = tokenToBitSet;
        this.bitSetHandling = bitSetHandling;
    }

    final TokenCompression getTokenCompression() {
        return this.tokenCompression;
    }

    final TokenToBitSet getTokenToBitSet() {
        return this.tokenToBitSet;
    }

    final BitSetHandling getBitSetHandling() {
        return this.bitSetHandling;
    }

    final BloomVersion getBloomVersion() {
        return this.bloomVersion;
    }
}
