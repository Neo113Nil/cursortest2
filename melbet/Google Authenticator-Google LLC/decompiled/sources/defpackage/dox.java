package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dox {
    public final boolean a;
    public final int b;

    public dox(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dox) {
            dox doxVar = (dox) obj;
            if (this.a == doxVar.a) {
                int i = this.b;
                int i2 = doxVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.D(i);
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "GaiaAccountData{isG1User=" + this.a + ", isUnicornUser=" + a.w(this.b) + "}";
    }

    public dox() {
        throw null;
    }
}
