package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcz extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public kcz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kcz) && this.a == ((kcz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
