package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ExoPlayerAudioTrackData {
    public static final Companion Companion = new Companion(null);
    private final Long bitrate;
    private final Long channelCount;
    private final String codec;
    private final long groupIndex;
    private final boolean isSelected;
    private final String label;
    private final String language;
    private final Long sampleRate;
    private final long trackIndex;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ExoPlayerAudioTrackData fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) obj).longValue();
            String str = (String) list.get(2);
            String str2 = (String) list.get(3);
            Object obj2 = list.get(4);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new ExoPlayerAudioTrackData(longValue, longValue2, str, str2, ((Boolean) obj2).booleanValue(), (Long) list.get(5), (Long) list.get(6), (Long) list.get(7), (String) list.get(8));
        }

        private Companion() {
        }
    }

    public ExoPlayerAudioTrackData(long j4, long j5, String str, String str2, boolean z, Long l4, Long l5, Long l6, String str3) {
        this.groupIndex = j4;
        this.trackIndex = j5;
        this.label = str;
        this.language = str2;
        this.isSelected = z;
        this.bitrate = l4;
        this.sampleRate = l5;
        this.channelCount = l6;
        this.codec = str3;
    }

    public static /* synthetic */ ExoPlayerAudioTrackData copy$default(ExoPlayerAudioTrackData exoPlayerAudioTrackData, long j4, long j5, String str, String str2, boolean z, Long l4, Long l5, Long l6, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = exoPlayerAudioTrackData.groupIndex;
        }
        return exoPlayerAudioTrackData.copy(j4, (i4 & 2) != 0 ? exoPlayerAudioTrackData.trackIndex : j5, (i4 & 4) != 0 ? exoPlayerAudioTrackData.label : str, (i4 & 8) != 0 ? exoPlayerAudioTrackData.language : str2, (i4 & 16) != 0 ? exoPlayerAudioTrackData.isSelected : z, (i4 & 32) != 0 ? exoPlayerAudioTrackData.bitrate : l4, (i4 & 64) != 0 ? exoPlayerAudioTrackData.sampleRate : l5, (i4 & 128) != 0 ? exoPlayerAudioTrackData.channelCount : l6, (i4 & 256) != 0 ? exoPlayerAudioTrackData.codec : str3);
    }

    public final long component1() {
        return this.groupIndex;
    }

    public final long component2() {
        return this.trackIndex;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.language;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final Long component6() {
        return this.bitrate;
    }

    public final Long component7() {
        return this.sampleRate;
    }

    public final Long component8() {
        return this.channelCount;
    }

    public final String component9() {
        return this.codec;
    }

    public final ExoPlayerAudioTrackData copy(long j4, long j5, String str, String str2, boolean z, Long l4, Long l5, Long l6, String str3) {
        return new ExoPlayerAudioTrackData(j4, j5, str, str2, z, l4, l5, l6, str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExoPlayerAudioTrackData)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((ExoPlayerAudioTrackData) obj).toList());
    }

    public final Long getBitrate() {
        return this.bitrate;
    }

    public final Long getChannelCount() {
        return this.channelCount;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final long getGroupIndex() {
        return this.groupIndex;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getSampleRate() {
        return this.sampleRate;
    }

    public final long getTrackIndex() {
        return this.trackIndex;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.groupIndex), Long.valueOf(this.trackIndex), this.label, this.language, Boolean.valueOf(this.isSelected), this.bitrate, this.sampleRate, this.channelCount, this.codec);
    }

    public String toString() {
        return "ExoPlayerAudioTrackData(groupIndex=" + this.groupIndex + ", trackIndex=" + this.trackIndex + ", label=" + this.label + ", language=" + this.language + ", isSelected=" + this.isSelected + ", bitrate=" + this.bitrate + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", codec=" + this.codec + ")";
    }

    public /* synthetic */ ExoPlayerAudioTrackData(long j4, long j5, String str, String str2, boolean z, Long l4, Long l5, Long l6, String str3, int i4, e eVar) {
        this(j4, j5, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? null : str2, z, (i4 & 32) != 0 ? null : l4, (i4 & 64) != 0 ? null : l5, (i4 & 128) != 0 ? null : l6, (i4 & 256) != 0 ? null : str3);
    }
}
