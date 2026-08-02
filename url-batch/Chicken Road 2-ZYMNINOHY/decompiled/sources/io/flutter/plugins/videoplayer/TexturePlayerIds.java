package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TexturePlayerIds {
    public static final Companion Companion = new Companion(null);
    private final long playerId;
    private final long textureId;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final TexturePlayerIds fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Long");
            return new TexturePlayerIds(longValue, ((Long) obj).longValue());
        }

        private Companion() {
        }
    }

    public TexturePlayerIds(long j4, long j5) {
        this.playerId = j4;
        this.textureId = j5;
    }

    public static /* synthetic */ TexturePlayerIds copy$default(TexturePlayerIds texturePlayerIds, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = texturePlayerIds.playerId;
        }
        if ((i4 & 2) != 0) {
            j5 = texturePlayerIds.textureId;
        }
        return texturePlayerIds.copy(j4, j5);
    }

    public final long component1() {
        return this.playerId;
    }

    public final long component2() {
        return this.textureId;
    }

    public final TexturePlayerIds copy(long j4, long j5) {
        return new TexturePlayerIds(j4, j5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TexturePlayerIds)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((TexturePlayerIds) obj).toList());
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public final long getTextureId() {
        return this.textureId;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.playerId), Long.valueOf(this.textureId));
    }

    public String toString() {
        long j4 = this.playerId;
        long j5 = this.textureId;
        StringBuilder sb = new StringBuilder("TexturePlayerIds(playerId=");
        sb.append(j4);
        sb.append(", textureId=");
        return AbstractC0005f.p(sb, j5, ")");
    }
}
