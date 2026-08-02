package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eco {
    public final gzp a;
    private final boolean b;

    public eco(gzp gzpVar) {
        this.b = true;
        this.a = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eco) {
            eco ecoVar = (eco) obj;
            if (this.b == ecoVar.b && this.a.equals(ecoVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "UseWithoutAnAccountActionImpl{showForUnicorn=" + this.b + ", availabilityChecker=" + String.valueOf(this.a) + "}";
    }

    public eco() {
        throw null;
    }
}
