package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksq implements ksi {
    private final Class a;

    public ksq(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.ksi
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ksq) && ksp.b(this.a, ((ksq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
