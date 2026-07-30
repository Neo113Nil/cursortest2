package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cm {
    public final long a;
    public final gm b;
    public final wl c;

    public cm(long j, gm gmVar, wl wlVar) {
        this.a = j;
        this.b = gmVar;
        this.c = wlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        return this.a == cmVar.a && this.b.equals(cmVar.b) && this.c.equals(cmVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
