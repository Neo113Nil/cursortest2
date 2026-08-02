package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyj {
    public final String a;
    public final jyi b;
    public final long c;
    public final jyv d;
    public final jyv e;

    public jyj(String str, jyi jyiVar, long j, jyv jyvVar) {
        this.a = str;
        jyiVar.getClass();
        this.b = jyiVar;
        this.c = j;
        this.d = null;
        this.e = jyvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jyj) {
            jyj jyjVar = (jyj) obj;
            if (Objects.equals(this.a, jyjVar.a) && Objects.equals(this.b, jyjVar.b) && this.c == jyjVar.c) {
                jyv jyvVar = jyjVar.d;
                if (Objects.equals(null, null) && Objects.equals(this.e, jyjVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), null, this.e);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("description", this.a);
        T.b("severity", this.b);
        T.f("timestampNanos", this.c);
        T.b("channelRef", null);
        T.b("subchannelRef", this.e);
        return T.toString();
    }
}
