package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihu {
    public final String a;

    public ihu(bry bryVar) {
        this.a = (String) bryVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ihu) {
            return Objects.equals(this.a, ((ihu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "CapabilityAlias{alias='" + this.a + "'}";
    }
}
