package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayk {
    public static final String a = asq.b("NetworkRequestCompat");
    public final Object b;

    public ayk(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayk) && ksp.b(this.b, ((ayk) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ")";
    }

    public ayk() {
        this(null);
    }
}
