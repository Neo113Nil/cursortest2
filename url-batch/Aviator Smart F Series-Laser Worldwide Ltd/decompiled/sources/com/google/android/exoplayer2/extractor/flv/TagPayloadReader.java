package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

@Deprecated
/* loaded from: classes3.dex */
abstract class TagPayloadReader {
    protected final TrackOutput output;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(TrackOutput trackOutput) {
        this.output = trackOutput;
    }

    public final boolean consume(ParsableByteArray parsableByteArray, long j8) {
        return parseHeader(parsableByteArray) && parsePayload(parsableByteArray, j8);
    }

    protected abstract boolean parseHeader(ParsableByteArray parsableByteArray);

    protected abstract boolean parsePayload(ParsableByteArray parsableByteArray, long j8);

    public abstract void seek();
}
