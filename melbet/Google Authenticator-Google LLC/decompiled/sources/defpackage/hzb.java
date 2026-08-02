package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzb extends hnu {
    private final int a = 32;
    private final hza b;

    public hzb(hza hzaVar) {
        this.b = hzaVar;
    }

    public final int bP() {
        hza hzaVar = this.b;
        if (hzaVar == hza.d) {
            return 16;
        }
        if (hzaVar == hza.a || hzaVar == hza.b || hzaVar == hza.c) {
            return 21;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hzb)) {
            return false;
        }
        hzb hzbVar = (hzb) obj;
        int i = hzbVar.a;
        return hzbVar.bP() == bP() && hzbVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(hzb.class, 32, 16, this.b);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.b) + ", 16-byte tags, and 32-byte key)";
    }
}
