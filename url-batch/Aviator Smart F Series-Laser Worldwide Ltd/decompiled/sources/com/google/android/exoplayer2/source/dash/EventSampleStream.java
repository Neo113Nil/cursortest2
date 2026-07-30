package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private final Format upstreamFormat;
    private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
    private long pendingSeekPositionUs = C.TIME_UNSET;

    public EventSampleStream(EventStream eventStream, Format format, boolean z7) {
        this.upstreamFormat = format;
        this.eventStream = eventStream;
        this.eventTimesUs = eventStream.presentationTimesUs;
        updateEventStream(eventStream, z7);
    }

    public String eventStreamId() {
        return this.eventStream.id();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i8) {
        int i9 = this.currentIndex;
        boolean z7 = i9 == this.eventTimesUs.length;
        if (z7 && !this.eventStreamAppendable) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        if ((i8 & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        if (z7) {
            return -3;
        }
        if ((i8 & 1) == 0) {
            this.currentIndex = i9 + 1;
        }
        if ((i8 & 4) == 0) {
            byte[] encode = this.eventMessageEncoder.encode(this.eventStream.events[i9]);
            decoderInputBuffer.ensureSpaceForWrite(encode.length);
            decoderInputBuffer.data.put(encode);
        }
        decoderInputBuffer.timeUs = this.eventTimesUs[i9];
        decoderInputBuffer.setFlags(1);
        return -4;
    }

    public void seekToUs(long j8) {
        int binarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j8, true, false);
        this.currentIndex = binarySearchCeil;
        if (!this.eventStreamAppendable || binarySearchCeil != this.eventTimesUs.length) {
            j8 = C.TIME_UNSET;
        }
        this.pendingSeekPositionUs = j8;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long j8) {
        int max = Math.max(this.currentIndex, Util.binarySearchCeil(this.eventTimesUs, j8, true, false));
        int i8 = max - this.currentIndex;
        this.currentIndex = max;
        return i8;
    }

    public void updateEventStream(EventStream eventStream, boolean z7) {
        int i8 = this.currentIndex;
        long j8 = i8 == 0 ? -9223372036854775807L : this.eventTimesUs[i8 - 1];
        this.eventStreamAppendable = z7;
        this.eventStream = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j9 = this.pendingSeekPositionUs;
        if (j9 != C.TIME_UNSET) {
            seekToUs(j9);
        } else if (j8 != C.TIME_UNSET) {
            this.currentIndex = Util.binarySearchCeil(jArr, j8, false, false);
        }
    }
}
