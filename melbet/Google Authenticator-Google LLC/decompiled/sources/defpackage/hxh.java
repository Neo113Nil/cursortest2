package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxh extends hnu {
    private final hxg a;

    public hxh(hxg hxgVar) {
        this.a = hxgVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hxh) && ((hxh) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(hxh.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.c + ")";
    }
}
