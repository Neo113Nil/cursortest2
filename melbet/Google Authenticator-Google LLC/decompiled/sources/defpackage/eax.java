package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eax {
    public final boolean a;
    public final boolean b;

    public eax(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eax)) {
            return false;
        }
        eax eaxVar = (eax) obj;
        return this.a == eaxVar.a && this.b == eaxVar.b;
    }

    public final int hashCode() {
        return (a.m(this.a) * 31) + a.m(this.b);
    }

    public final String toString() {
        return "CardViewModelData(isImportant=" + this.a + ", isCritical=" + this.b + ")";
    }

    public eax() {
        this(false, false);
    }
}
