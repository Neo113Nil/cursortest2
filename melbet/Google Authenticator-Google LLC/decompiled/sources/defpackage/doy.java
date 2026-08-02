package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doy {
    public final boolean a;

    public doy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof doy) && this.a == ((doy) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "AccountCapabilities{shouldHideEmail=" + this.a + "}";
    }

    public doy() {
        throw null;
    }
}
