package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes3.dex */
public interface RtpPayloadReader {

    public interface Factory {
        RtpPayloadReader createPayloadReader(RtpPayloadFormat rtpPayloadFormat);
    }

    void consume(ParsableByteArray parsableByteArray, long j8, int i8, boolean z7);

    void createTracks(ExtractorOutput extractorOutput, int i8);

    void onReceivingFirstPacket(long j8, int i8);

    void seek(long j8, long j9);
}
