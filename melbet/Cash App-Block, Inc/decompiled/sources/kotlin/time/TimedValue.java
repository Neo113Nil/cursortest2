package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes9.dex */
public final class TimedValue {
    public final long duration;
    public final Object value;

    public TimedValue(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = obj;
        this.duration = j;
    }

    public final Object component1() {
        return this.value;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m4181component2UwyO8pc() {
        return this.duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m4166equalsimpl0(this.duration, timedValue.duration);
    }

    public final int hashCode() {
        Object obj = this.value;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Duration.Companion companion = Duration.Companion;
        return Long.hashCode(this.duration) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m4177toStringimpl(this.duration)) + ')';
    }
}
