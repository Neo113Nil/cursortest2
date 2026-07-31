package I2;

/* loaded from: classes3.dex */
public abstract class e implements b {
    @Override // I2.b
    public abstract j b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return b().equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }
}
