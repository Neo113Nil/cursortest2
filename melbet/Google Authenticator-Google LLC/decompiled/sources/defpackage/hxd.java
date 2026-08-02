package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxd extends hnu {
    private final int a;
    private final hxc b;

    public hxd(int i, hxc hxcVar) {
        this.a = i;
        this.b = hxcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hxd)) {
            return false;
        }
        hxd hxdVar = (hxd) obj;
        return hxdVar.a == this.a && hxdVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(hxd.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
