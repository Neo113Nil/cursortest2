package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avu extends zy {
    public final int a;

    public avu(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avu) && this.a == ((avu) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ")";
    }
}
