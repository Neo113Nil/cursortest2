package o2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800b {
    private final Long rywDelay;
    private final String rywToken;

    public C0800b(String rywToken, Long l7) {
        Intrinsics.checkNotNullParameter(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l7;
    }

    public static /* synthetic */ C0800b copy$default(C0800b c0800b, String str, Long l7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c0800b.rywToken;
        }
        if ((i2 & 2) != 0) {
            l7 = c0800b.rywDelay;
        }
        return c0800b.copy(str, l7);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final C0800b copy(String rywToken, Long l7) {
        Intrinsics.checkNotNullParameter(rywToken, "rywToken");
        return new C0800b(rywToken, l7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0800b)) {
            return false;
        }
        C0800b c0800b = (C0800b) obj;
        return Intrinsics.a(this.rywToken, c0800b.rywToken) && Intrinsics.a(this.rywDelay, c0800b.rywDelay);
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
