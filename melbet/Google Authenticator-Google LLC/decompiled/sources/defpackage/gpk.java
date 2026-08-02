package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpk {
    public final int a;
    public final int b;

    public gpk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpk) {
            gpk gpkVar = (gpk) obj;
            if (this.a == gpkVar.a && this.b == gpkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "StorageSpec{type=" + (this.a != 1 ? "CACHE" : "FILES") + ", directBoot=" + (this.b != 1 ? "CREDENTIAL" : "DEVICE") + "}";
    }

    public gpk() {
        throw null;
    }
}
