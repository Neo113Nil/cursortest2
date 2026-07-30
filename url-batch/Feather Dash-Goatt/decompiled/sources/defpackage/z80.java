package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z80 {
    public final int a;

    public /* synthetic */ z80(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z80) {
            return this.a == ((z80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
