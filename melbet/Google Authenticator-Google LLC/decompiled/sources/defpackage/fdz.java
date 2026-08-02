package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fdz {
    public final String a;
    public final Class b;

    public fdz(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdz) {
            fdz fdzVar = (fdz) obj;
            if (this.b == fdzVar.b && this.a.equals(fdzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
