package M1;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {
    private final Long rywDelay;
    private final String rywToken;

    public b(String rywToken, Long l7) {
        i.e(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l7;
    }

    public static /* synthetic */ b copy$default(b bVar, String str, Long l7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bVar.rywToken;
        }
        if ((i7 & 2) != 0) {
            l7 = bVar.rywDelay;
        }
        return bVar.copy(str, l7);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final b copy(String rywToken, Long l7) {
        i.e(rywToken, "rywToken");
        return new b(rywToken, l7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.rywToken, bVar.rywToken) && i.a(this.rywDelay, bVar.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int hashCode = this.rywToken.hashCode() * 31;
        Long l7 = this.rywDelay;
        return hashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
