package I2;

/* loaded from: classes3.dex */
public abstract class j extends e {
    j() {
    }

    abstract boolean d(j jVar);

    abstract void e(h hVar);

    @Override // I2.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && d(((b) obj).b());
    }

    abstract int f();

    @Override // I2.e
    public abstract int hashCode();

    @Override // I2.e, I2.b
    public j b() {
        return this;
    }

    j g() {
        return this;
    }
}
