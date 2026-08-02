package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfo {
    private long a;
    private long b;
    private Set c;
    private byte d;

    public final cfp a() {
        Set set;
        if (this.d == 3 && (set = this.c) != null) {
            return new cfp(this.a, this.b, set);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" delta");
        }
        if ((this.d & 2) == 0) {
            sb.append(" maxAllowedDelay");
        }
        if (this.c == null) {
            sb.append(" flags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.d = (byte) (this.d | 1);
    }

    public final void c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        this.c = set;
    }

    public final void d() {
        this.b = 86400000L;
        this.d = (byte) (this.d | 2);
    }
}
