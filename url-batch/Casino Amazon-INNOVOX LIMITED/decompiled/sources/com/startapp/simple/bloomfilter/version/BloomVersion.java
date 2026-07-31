package com.startapp.simple.bloomfilter.version;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public enum BloomVersion {
    ZERO(CommonUrlParts.Values.FALSE_INTEGER, 1, 720),
    THREE("3.0", 1, 720) { // from class: com.startapp.simple.bloomfilter.version.BloomVersion.1
        @Override // com.startapp.simple.bloomfilter.version.BloomVersion
        public String substringFromBloom(String str) {
            int length = str.length();
            return length > 20 ? str.substring(0, length - 20) : str;
        }
    },
    FOUR("4", 3, 3500),
    FIVE("5", 3, DurationKt.NANOS_IN_MILLIS);

    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    public String substringFromBloom(String str) {
        return str;
    }

    BloomVersion(String str, int i, int i2) {
        this.version = str;
        this.numberOfHashes = i;
        this.sizeOfBucket = i2;
    }

    public String getVersion() {
        return this.version;
    }

    public int getNumberOfHashes() {
        return this.numberOfHashes;
    }

    public int getSizeOfBucket() {
        return this.sizeOfBucket;
    }
}
