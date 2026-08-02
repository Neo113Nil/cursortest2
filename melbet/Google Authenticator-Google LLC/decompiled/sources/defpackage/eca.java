package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eca {
    private final gzp a;

    public eca(gzp gzpVar) {
        this.a = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eca) {
            return this.a.equals(((eca) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "NonCollapsibleFlavorFeatureImpl{minimizableStorageCardRetriever=" + String.valueOf(this.a) + "}";
    }

    public eca() {
        throw null;
    }
}
