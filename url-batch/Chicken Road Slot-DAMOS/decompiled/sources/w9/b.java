package w9;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    private final Long rywDelay;
    private final String rywToken;

    public b(String str, Long l10) {
        str.getClass();
        this.rywToken = str;
        this.rywDelay = l10;
    }

    public static /* synthetic */ b copy$default(b bVar, String str, Long l10, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bVar.rywToken;
        }
        if ((i3 & 2) != 0) {
            l10 = bVar.rywDelay;
        }
        return bVar.copy(str, l10);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final b copy(String str, Long l10) {
        str.getClass();
        return new b(str, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.rywToken, bVar.rywToken) && Intrinsics.a(this.rywDelay, bVar.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int hashCode = this.rywToken.hashCode() * 31;
        Long l10 = this.rywDelay;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
