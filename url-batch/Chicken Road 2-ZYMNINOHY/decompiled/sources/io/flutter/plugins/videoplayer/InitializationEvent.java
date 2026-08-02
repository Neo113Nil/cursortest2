package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InitializationEvent extends PlatformVideoEvent {
    public static final Companion Companion = new Companion(null);
    private final long duration;
    private final long height;
    private final long rotationCorrection;
    private final long width;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final InitializationEvent fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) obj).longValue();
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long longValue3 = ((Long) obj2).longValue();
            Object obj3 = list.get(3);
            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            return new InitializationEvent(longValue, longValue2, longValue3, ((Long) obj3).longValue());
        }

        private Companion() {
        }
    }

    public InitializationEvent(long j4, long j5, long j6, long j7) {
        super(null);
        this.duration = j4;
        this.width = j5;
        this.height = j6;
        this.rotationCorrection = j7;
    }

    public static /* synthetic */ InitializationEvent copy$default(InitializationEvent initializationEvent, long j4, long j5, long j6, long j7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = initializationEvent.duration;
        }
        long j8 = j4;
        if ((i4 & 2) != 0) {
            j5 = initializationEvent.width;
        }
        long j9 = j5;
        if ((i4 & 4) != 0) {
            j6 = initializationEvent.height;
        }
        return initializationEvent.copy(j8, j9, j6, (i4 & 8) != 0 ? initializationEvent.rotationCorrection : j7);
    }

    public final long component1() {
        return this.duration;
    }

    public final long component2() {
        return this.width;
    }

    public final long component3() {
        return this.height;
    }

    public final long component4() {
        return this.rotationCorrection;
    }

    public final InitializationEvent copy(long j4, long j5, long j6, long j7) {
        return new InitializationEvent(j4, j5, j6, j7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InitializationEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((InitializationEvent) obj).toList());
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getRotationCorrection() {
        return this.rotationCorrection;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.duration), Long.valueOf(this.width), Long.valueOf(this.height), Long.valueOf(this.rotationCorrection));
    }

    public String toString() {
        long j4 = this.duration;
        long j5 = this.width;
        long j6 = this.height;
        long j7 = this.rotationCorrection;
        StringBuilder sb = new StringBuilder("InitializationEvent(duration=");
        sb.append(j4);
        sb.append(", width=");
        sb.append(j5);
        sb.append(", height=");
        sb.append(j6);
        sb.append(", rotationCorrection=");
        return AbstractC0005f.p(sb, j7, ")");
    }
}
