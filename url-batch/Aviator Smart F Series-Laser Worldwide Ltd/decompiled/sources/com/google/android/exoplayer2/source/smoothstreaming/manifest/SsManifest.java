package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Deprecated
/* loaded from: classes3.dex */
public class SsManifest implements FilterableManifest<SsManifest> {
    public static final int UNSET_LOOKAHEAD = -1;
    public final long durationUs;
    public final long dvrWindowLengthUs;
    public final boolean isLive;
    public final int lookAheadCount;
    public final int majorVersion;
    public final int minorVersion;

    @Nullable
    public final ProtectionElement protectionElement;
    public final StreamElement[] streamElements;

    public static class ProtectionElement {
        public final byte[] data;
        public final TrackEncryptionBox[] trackEncryptionBoxes;
        public final UUID uuid;

        public ProtectionElement(UUID uuid, byte[] bArr, TrackEncryptionBox[] trackEncryptionBoxArr) {
            this.uuid = uuid;
            this.data = bArr;
            this.trackEncryptionBoxes = trackEncryptionBoxArr;
        }
    }

    public SsManifest(int i8, int i9, long j8, long j9, long j10, int i10, boolean z7, @Nullable ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this(i8, i9, j9 == 0 ? -9223372036854775807L : Util.scaleLargeTimestamp(j9, 1000000L, j8), j10 != 0 ? Util.scaleLargeTimestamp(j10, 1000000L, j8) : C.TIME_UNSET, i10, z7, protectionElement, streamElementArr);
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ SsManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final SsManifest copy(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StreamElement streamElement = null;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i8);
            StreamElement streamElement2 = this.streamElements[streamKey.groupIndex];
            if (streamElement2 != streamElement && streamElement != null) {
                arrayList2.add(streamElement.copy((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(streamElement2.formats[streamKey.streamIndex]);
            i8++;
            streamElement = streamElement2;
        }
        if (streamElement != null) {
            arrayList2.add(streamElement.copy((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new SsManifest(this.majorVersion, this.minorVersion, this.durationUs, this.dvrWindowLengthUs, this.lookAheadCount, this.isLive, this.protectionElement, (StreamElement[]) arrayList2.toArray(new StreamElement[0]));
    }

    public static class StreamElement {
        private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
        private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
        private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
        private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
        private final String baseUri;
        public final int chunkCount;
        private final List<Long> chunkStartTimes;
        private final long[] chunkStartTimesUs;
        private final String chunkTemplate;
        public final int displayHeight;
        public final int displayWidth;
        public final Format[] formats;

        @Nullable
        public final String language;
        private final long lastChunkDurationUs;
        public final int maxHeight;
        public final int maxWidth;
        public final String name;
        public final String subType;
        public final long timescale;
        public final int type;

        public StreamElement(String str, String str2, int i8, String str3, long j8, String str4, int i9, int i10, int i11, int i12, @Nullable String str5, Format[] formatArr, List<Long> list, long j9) {
            this(str, str2, i8, str3, j8, str4, i9, i10, i11, i12, str5, formatArr, list, Util.scaleLargeTimestamps(list, 1000000L, j8), Util.scaleLargeTimestamp(j9, 1000000L, j8));
        }

        public Uri buildRequestUri(int i8, int i9) {
            Assertions.checkState(this.formats != null);
            Assertions.checkState(this.chunkStartTimes != null);
            Assertions.checkState(i9 < this.chunkStartTimes.size());
            String num = Integer.toString(this.formats[i8].bitrate);
            String l8 = this.chunkStartTimes.get(i9).toString();
            return UriUtil.resolveToUri(this.baseUri, this.chunkTemplate.replace(URL_PLACEHOLDER_BITRATE_1, num).replace(URL_PLACEHOLDER_BITRATE_2, num).replace(URL_PLACEHOLDER_START_TIME_1, l8).replace(URL_PLACEHOLDER_START_TIME_2, l8));
        }

        public StreamElement copy(Format[] formatArr) {
            return new StreamElement(this.baseUri, this.chunkTemplate, this.type, this.subType, this.timescale, this.name, this.maxWidth, this.maxHeight, this.displayWidth, this.displayHeight, this.language, formatArr, this.chunkStartTimes, this.chunkStartTimesUs, this.lastChunkDurationUs);
        }

        public long getChunkDurationUs(int i8) {
            if (i8 == this.chunkCount - 1) {
                return this.lastChunkDurationUs;
            }
            long[] jArr = this.chunkStartTimesUs;
            return jArr[i8 + 1] - jArr[i8];
        }

        public int getChunkIndex(long j8) {
            return Util.binarySearchFloor(this.chunkStartTimesUs, j8, true, true);
        }

        public long getStartTimeUs(int i8) {
            return this.chunkStartTimesUs[i8];
        }

        private StreamElement(String str, String str2, int i8, String str3, long j8, String str4, int i9, int i10, int i11, int i12, @Nullable String str5, Format[] formatArr, List<Long> list, long[] jArr, long j9) {
            this.baseUri = str;
            this.chunkTemplate = str2;
            this.type = i8;
            this.subType = str3;
            this.timescale = j8;
            this.name = str4;
            this.maxWidth = i9;
            this.maxHeight = i10;
            this.displayWidth = i11;
            this.displayHeight = i12;
            this.language = str5;
            this.formats = formatArr;
            this.chunkStartTimes = list;
            this.chunkStartTimesUs = jArr;
            this.lastChunkDurationUs = j9;
            this.chunkCount = list.size();
        }
    }

    private SsManifest(int i8, int i9, long j8, long j9, int i10, boolean z7, @Nullable ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this.majorVersion = i8;
        this.minorVersion = i9;
        this.durationUs = j8;
        this.dvrWindowLengthUs = j9;
        this.lookAheadCount = i10;
        this.isLive = z7;
        this.protectionElement = protectionElement;
        this.streamElements = streamElementArr;
    }
}
