package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;

    @Nullable
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, @Nullable Segment segment, long j8, int i8, long j9, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j10, long j11, boolean z7, boolean z8, boolean z9) {
            super(str, segment, j8, i8, j9, drmInitData, str2, str3, j10, j11, z7);
            this.isIndependent = z8;
            this.isPreload = z9;
        }

        public Part copyWith(long j8, int i8) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i8, j8, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j8, int i8) {
            this.playlistUri = uri;
            this.lastMediaSequence = j8;
            this.lastPartIndex = i8;
        }
    }

    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;

        @Nullable
        public final DrmInitData drmInitData;
        public final long durationUs;

        @Nullable
        public final String encryptionIV;

        @Nullable
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;

        @Nullable
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, @Nullable Segment segment, long j8, int i8, long j9, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j10, long j11, boolean z7) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j8;
            this.relativeDiscontinuitySequence = i8;
            this.relativeStartTimeUs = j9;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j10;
            this.byteRangeLength = j11;
            this.hasGapTag = z7;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l8) {
            if (this.relativeStartTimeUs > l8.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l8.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j8, boolean z7, long j9, long j10, boolean z8) {
            this.skipUntilUs = j8;
            this.canSkipDateRanges = z7;
            this.holdBackUs = j9;
            this.partHoldBackUs = j10;
            this.canBlockReload = z8;
        }
    }

    public HlsMediaPlaylist(int i8, String str, List<String> list, long j8, boolean z7, long j9, boolean z8, int i9, long j10, int i10, long j11, long j12, boolean z9, boolean z10, boolean z11, @Nullable DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map) {
        super(str, list, z9);
        this.playlistType = i8;
        this.startTimeUs = j9;
        this.preciseStart = z7;
        this.hasDiscontinuitySequence = z8;
        this.discontinuitySequence = i9;
        this.mediaSequence = j10;
        this.version = i10;
        this.targetDurationUs = j11;
        this.partTargetDurationUs = j12;
        this.hasEndTag = z10;
        this.hasProgramDateTime = z11;
        this.protectionSchemes = drmInitData;
        this.segments = ImmutableList.copyOf((Collection) list2);
        this.trailingParts = ImmutableList.copyOf((Collection) list3);
        this.renditionReports = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            Part part = (Part) Iterables.getLast(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) Iterables.getLast(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        this.startOffsetUs = j8 != C.TIME_UNSET ? j8 >= 0 ? Math.min(this.durationUs, j8) : Math.max(0L, this.durationUs + j8) : C.TIME_UNSET;
        this.hasPositiveStartOffset = j8 >= 0;
        this.serverControl = serverControl;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j8, int i8) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j8, true, i8, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(@Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist == null) {
            return true;
        }
        long j8 = this.mediaSequence;
        long j9 = hlsMediaPlaylist.mediaSequence;
        if (j8 > j9) {
            return true;
        }
        if (j8 < j9) {
            return false;
        }
        int size = this.segments.size() - hlsMediaPlaylist.segments.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.trailingParts.size();
        int size3 = hlsMediaPlaylist.trailingParts.size();
        if (size2 <= size3) {
            return size2 == size3 && this.hasEndTag && !hlsMediaPlaylist.hasEndTag;
        }
        return true;
    }

    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, long j8, long j9, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j8, j9, false, ImmutableList.of());
        }

        public Segment copyWith(long j8, int i8) {
            ArrayList arrayList = new ArrayList();
            long j9 = j8;
            for (int i9 = 0; i9 < this.parts.size(); i9++) {
                Part part = this.parts.get(i9);
                arrayList.add(part.copyWith(j9, i8));
                j9 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i8, j8, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, @Nullable Segment segment, String str2, long j8, int i8, long j9, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j10, long j11, boolean z7, List<Part> list) {
            super(str, segment, j8, i8, j9, drmInitData, str3, str4, j10, j11, z7);
            this.title = str2;
            this.parts = ImmutableList.copyOf((Collection) list);
        }
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }
}
