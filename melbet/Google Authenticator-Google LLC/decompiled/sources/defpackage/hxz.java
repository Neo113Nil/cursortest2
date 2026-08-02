package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxz extends hnu {
    private final hxy a;

    public hxz(hxy hxyVar) {
        this.a = hxyVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hxz) && ((hxz) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(hxz.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.c + ")";
    }
}
