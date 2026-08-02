package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axa {
    public final String a;
    public final Long b;

    public axa(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axa)) {
            return false;
        }
        axa axaVar = (axa) obj;
        return ksp.b(this.a, axaVar.a) && ksp.b(this.b, axaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ")";
    }
}
