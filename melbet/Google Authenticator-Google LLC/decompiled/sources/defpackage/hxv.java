package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxv extends hnu {
    private final hxu a;
    private final int b;

    public hxv(hxu hxuVar, int i) {
        this.a = hxuVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hxv)) {
            return false;
        }
        hxv hxvVar = (hxv) obj;
        return hxvVar.a == this.a && hxvVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(hxv.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.a.c + "salt_size_bytes: " + this.b + ")";
    }
}
