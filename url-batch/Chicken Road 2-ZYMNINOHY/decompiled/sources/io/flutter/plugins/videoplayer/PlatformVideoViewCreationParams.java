package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.List;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class PlatformVideoViewCreationParams {
    public static final Companion Companion = new Companion(null);
    private final long playerId;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlatformVideoViewCreationParams fromList(List<? extends Object> list) {
            return new PlatformVideoViewCreationParams(((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue());
        }

        private Companion() {
        }
    }

    public PlatformVideoViewCreationParams(long j4) {
        this.playerId = j4;
    }

    public static /* synthetic */ PlatformVideoViewCreationParams copy$default(PlatformVideoViewCreationParams platformVideoViewCreationParams, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = platformVideoViewCreationParams.playerId;
        }
        return platformVideoViewCreationParams.copy(j4);
    }

    public final long component1() {
        return this.playerId;
    }

    public final PlatformVideoViewCreationParams copy(long j4) {
        return new PlatformVideoViewCreationParams(j4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlatformVideoViewCreationParams)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((PlatformVideoViewCreationParams) obj).toList());
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(Long.valueOf(this.playerId));
    }

    public String toString() {
        return "PlatformVideoViewCreationParams(playerId=" + this.playerId + ")";
    }
}
