package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlaybackState {
    public static final Companion Companion = new Companion(null);
    private final long bufferPosition;
    private final long playPosition;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlaybackState fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Long");
            return new PlaybackState(longValue, ((Long) obj).longValue());
        }

        private Companion() {
        }
    }

    public PlaybackState(long j4, long j5) {
        this.playPosition = j4;
        this.bufferPosition = j5;
    }

    public static /* synthetic */ PlaybackState copy$default(PlaybackState playbackState, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = playbackState.playPosition;
        }
        if ((i4 & 2) != 0) {
            j5 = playbackState.bufferPosition;
        }
        return playbackState.copy(j4, j5);
    }

    public final long component1() {
        return this.playPosition;
    }

    public final long component2() {
        return this.bufferPosition;
    }

    public final PlaybackState copy(long j4, long j5) {
        return new PlaybackState(j4, j5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaybackState)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((PlaybackState) obj).toList());
    }

    public final long getBufferPosition() {
        return this.bufferPosition;
    }

    public final long getPlayPosition() {
        return this.playPosition;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.playPosition), Long.valueOf(this.bufferPosition));
    }

    public String toString() {
        long j4 = this.playPosition;
        long j5 = this.bufferPosition;
        StringBuilder sb = new StringBuilder("PlaybackState(playPosition=");
        sb.append(j4);
        sb.append(", bufferPosition=");
        return AbstractC0005f.p(sb, j5, ")");
    }
}
