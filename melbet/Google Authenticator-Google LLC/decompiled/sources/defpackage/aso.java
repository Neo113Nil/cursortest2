package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aso extends yo {
    public final asa a;

    public aso(asa asaVar) {
        this.a = asaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((aso) obj).a);
    }

    public final int hashCode() {
        return 3003683 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public aso() {
        this(asa.a);
    }
}
