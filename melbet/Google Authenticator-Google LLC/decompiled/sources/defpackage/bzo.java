package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzo extends kt {
    public final bpc a;

    public bzo(bpc bpcVar) {
        this.a = bpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzo) && ksp.b(this.a, ((bzo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(otp=" + this.a + ")";
    }
}
