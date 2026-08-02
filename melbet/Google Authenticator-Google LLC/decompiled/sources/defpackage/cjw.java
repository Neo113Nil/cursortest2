package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjw {
    public final Instant a;

    public cjw(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null eventTime");
        }
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjw) {
            return this.a.equals(((cjw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogSamplerProperties{eventTime=" + this.a.toString() + "}";
    }

    public cjw() {
        throw null;
    }
}
