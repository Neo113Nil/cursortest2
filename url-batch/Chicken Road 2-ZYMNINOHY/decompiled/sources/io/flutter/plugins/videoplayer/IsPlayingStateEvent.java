package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.List;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class IsPlayingStateEvent extends PlatformVideoEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean isPlaying;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final IsPlayingStateEvent fromList(List<? extends Object> list) {
            return new IsPlayingStateEvent(((Boolean) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Boolean")).booleanValue());
        }

        private Companion() {
        }
    }

    public IsPlayingStateEvent(boolean z) {
        super(null);
        this.isPlaying = z;
    }

    public static /* synthetic */ IsPlayingStateEvent copy$default(IsPlayingStateEvent isPlayingStateEvent, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = isPlayingStateEvent.isPlaying;
        }
        return isPlayingStateEvent.copy(z);
    }

    public final boolean component1() {
        return this.isPlaying;
    }

    public final IsPlayingStateEvent copy(boolean z) {
        return new IsPlayingStateEvent(z);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IsPlayingStateEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((IsPlayingStateEvent) obj).toList());
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(Boolean.valueOf(this.isPlaying));
    }

    public String toString() {
        return "IsPlayingStateEvent(isPlaying=" + this.isPlaying + ")";
    }
}
