package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qr1 {
    public final long a;

    public qr1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qr1) && this.a == ((qr1) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (-724379968) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.a + "}";
    }
}
