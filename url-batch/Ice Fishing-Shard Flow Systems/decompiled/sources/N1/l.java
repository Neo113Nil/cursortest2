package N1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f1821a;

    public l(long j) {
        this.f1821a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        lVar.getClass();
        return this.f1821a == lVar.f1821a;
    }

    public final int hashCode() {
        long j = this.f1821a;
        return ((int) ((j >>> 32) ^ j)) ^ (-724379968);
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f1821a + "}";
    }
}
