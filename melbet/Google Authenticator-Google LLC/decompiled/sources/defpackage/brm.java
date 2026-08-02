package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class brm extends bsd {
    private final boolean a;

    public brm(boolean z) {
        this.a = z;
    }

    @Override // defpackage.bsd
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof bsd) && this.a == ((bsd) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "NextButtonEvent{firstAppearance=" + this.a + "}";
    }
}
