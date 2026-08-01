package z7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f10941a;

    public k(long j) {
        this.f10941a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof k) && this.f10941a == ((k) obj).f10941a;
    }

    public final int hashCode() {
        long j = this.f10941a;
        return ((int) ((j >>> 32) ^ j)) ^ (-724379968);
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f10941a + "}";
    }
}
