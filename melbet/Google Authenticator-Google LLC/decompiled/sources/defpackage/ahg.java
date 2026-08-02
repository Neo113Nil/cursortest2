package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahg {
    private final ns a;
    private final aer b;

    public ahg(ns nsVar, aer aerVar) {
        this.a = nsVar;
        this.b = aerVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahg)) {
            return false;
        }
        ahg ahgVar = (ahg) obj;
        return ksp.b(this.a, ahgVar.a) && ksp.b(this.b, ahgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ")";
    }

    public ahg() {
        throw null;
    }
}
