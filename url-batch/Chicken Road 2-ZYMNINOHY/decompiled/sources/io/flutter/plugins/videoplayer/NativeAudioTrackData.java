package io.flutter.plugins.videoplayer;

import a.AbstractC0124a;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NativeAudioTrackData {
    public static final Companion Companion = new Companion(null);
    private final List<ExoPlayerAudioTrackData> exoPlayerTracks;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final NativeAudioTrackData fromList(List<? extends Object> pigeonVar_list) {
            i.e(pigeonVar_list, "pigeonVar_list");
            return new NativeAudioTrackData((List) pigeonVar_list.get(0));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAudioTrackData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeAudioTrackData copy$default(NativeAudioTrackData nativeAudioTrackData, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = nativeAudioTrackData.exoPlayerTracks;
        }
        return nativeAudioTrackData.copy(list);
    }

    public final List<ExoPlayerAudioTrackData> component1() {
        return this.exoPlayerTracks;
    }

    public final NativeAudioTrackData copy(List<ExoPlayerAudioTrackData> list) {
        return new NativeAudioTrackData(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeAudioTrackData)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((NativeAudioTrackData) obj).toList());
    }

    public final List<ExoPlayerAudioTrackData> getExoPlayerTracks() {
        return this.exoPlayerTracks;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(this.exoPlayerTracks);
    }

    public String toString() {
        return "NativeAudioTrackData(exoPlayerTracks=" + this.exoPlayerTracks + ")";
    }

    public NativeAudioTrackData(List<ExoPlayerAudioTrackData> list) {
        this.exoPlayerTracks = list;
    }

    public /* synthetic */ NativeAudioTrackData(List list, int i4, e eVar) {
        this((i4 & 1) != 0 ? null : list);
    }
}
