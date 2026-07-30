package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gb0 extends zm3 {
    public final int o;

    public gb0(int i) {
        this.o = i;
        if (i > 0) {
            return;
        }
        lh.e("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gb0) {
            return this.o == ((gb0) obj).o;
        }
        return false;
    }

    public final int hashCode() {
        return this.o;
    }

    public final String toString() {
        return String.valueOf(this.o);
    }
}
