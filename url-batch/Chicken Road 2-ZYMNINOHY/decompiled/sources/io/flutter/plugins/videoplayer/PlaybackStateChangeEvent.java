package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlaybackStateChangeEvent extends PlatformVideoEvent {
    public static final Companion Companion = new Companion(null);
    private final PlatformPlaybackState state;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlaybackStateChangeEvent fromList(List<? extends Object> list) {
            return new PlaybackStateChangeEvent((PlatformPlaybackState) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.PlatformPlaybackState"));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackStateChangeEvent(PlatformPlaybackState state) {
        super(null);
        i.e(state, "state");
        this.state = state;
    }

    public static /* synthetic */ PlaybackStateChangeEvent copy$default(PlaybackStateChangeEvent playbackStateChangeEvent, PlatformPlaybackState platformPlaybackState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformPlaybackState = playbackStateChangeEvent.state;
        }
        return playbackStateChangeEvent.copy(platformPlaybackState);
    }

    public final PlatformPlaybackState component1() {
        return this.state;
    }

    public final PlaybackStateChangeEvent copy(PlatformPlaybackState state) {
        i.e(state, "state");
        return new PlaybackStateChangeEvent(state);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaybackStateChangeEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((PlaybackStateChangeEvent) obj).toList());
    }

    public final PlatformPlaybackState getState() {
        return this.state;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(this.state);
    }

    public String toString() {
        return "PlaybackStateChangeEvent(state=" + this.state + ")";
    }
}
