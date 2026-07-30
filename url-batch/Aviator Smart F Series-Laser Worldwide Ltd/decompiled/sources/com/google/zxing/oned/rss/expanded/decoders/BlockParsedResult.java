package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes4.dex */
final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    BlockParsedResult(boolean z7) {
        this(null, z7);
    }

    DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    boolean isFinished() {
        return this.finished;
    }

    BlockParsedResult(DecodedInformation decodedInformation, boolean z7) {
        this.finished = z7;
        this.decodedInformation = decodedInformation;
    }
}
