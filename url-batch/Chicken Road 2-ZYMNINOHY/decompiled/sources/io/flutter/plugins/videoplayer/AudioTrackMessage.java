package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AudioTrackMessage {
    public static final Companion Companion = new Companion(null);
    private final Long bitrate;
    private final Long channelCount;
    private final String codec;
    private final String id;
    private final boolean isSelected;
    private final String label;
    private final String language;
    private final Long sampleRate;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final AudioTrackMessage fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj2;
            Object obj3 = list.get(3);
            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new AudioTrackMessage(str, str2, str3, ((Boolean) obj3).booleanValue(), (Long) list.get(4), (Long) list.get(5), (Long) list.get(6), (String) list.get(7));
        }

        private Companion() {
        }
    }

    public AudioTrackMessage(String id, String label, String language, boolean z, Long l4, Long l5, Long l6, String str) {
        i.e(id, "id");
        i.e(label, "label");
        i.e(language, "language");
        this.id = id;
        this.label = label;
        this.language = language;
        this.isSelected = z;
        this.bitrate = l4;
        this.sampleRate = l5;
        this.channelCount = l6;
        this.codec = str;
    }

    public static /* synthetic */ AudioTrackMessage copy$default(AudioTrackMessage audioTrackMessage, String str, String str2, String str3, boolean z, Long l4, Long l5, Long l6, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = audioTrackMessage.id;
        }
        if ((i4 & 2) != 0) {
            str2 = audioTrackMessage.label;
        }
        if ((i4 & 4) != 0) {
            str3 = audioTrackMessage.language;
        }
        if ((i4 & 8) != 0) {
            z = audioTrackMessage.isSelected;
        }
        if ((i4 & 16) != 0) {
            l4 = audioTrackMessage.bitrate;
        }
        if ((i4 & 32) != 0) {
            l5 = audioTrackMessage.sampleRate;
        }
        if ((i4 & 64) != 0) {
            l6 = audioTrackMessage.channelCount;
        }
        if ((i4 & 128) != 0) {
            str4 = audioTrackMessage.codec;
        }
        Long l7 = l6;
        String str5 = str4;
        Long l8 = l4;
        Long l9 = l5;
        return audioTrackMessage.copy(str, str2, str3, z, l8, l9, l7, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.language;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final Long component5() {
        return this.bitrate;
    }

    public final Long component6() {
        return this.sampleRate;
    }

    public final Long component7() {
        return this.channelCount;
    }

    public final String component8() {
        return this.codec;
    }

    public final AudioTrackMessage copy(String id, String label, String language, boolean z, Long l4, Long l5, Long l6, String str) {
        i.e(id, "id");
        i.e(label, "label");
        i.e(language, "language");
        return new AudioTrackMessage(id, label, language, z, l4, l5, l6, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioTrackMessage)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((AudioTrackMessage) obj).toList());
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

    public final String getId() {
        return this.id;
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

    public int hashCode() {
        return toList().hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final List<Object> toList() {
        return j.W(this.id, this.label, this.language, Boolean.valueOf(this.isSelected), this.bitrate, this.sampleRate, this.channelCount, this.codec);
    }

    public String toString() {
        return "AudioTrackMessage(id=" + this.id + ", label=" + this.label + ", language=" + this.language + ", isSelected=" + this.isSelected + ", bitrate=" + this.bitrate + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", codec=" + this.codec + ")";
    }

    public /* synthetic */ AudioTrackMessage(String str, String str2, String str3, boolean z, Long l4, Long l5, Long l6, String str4, int i4, e eVar) {
        this(str, str2, str3, z, (i4 & 16) != 0 ? null : l4, (i4 & 32) != 0 ? null : l5, (i4 & 64) != 0 ? null : l6, (i4 & 128) != 0 ? null : str4);
    }
}
