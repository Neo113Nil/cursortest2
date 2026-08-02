package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adi {
    public final long a;
    public final long b;

    public adi(long j, long j2) {
        this.a = j2 == 0 ? 0L : j;
        this.b = j2 == 0 ? 1L : j2;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
