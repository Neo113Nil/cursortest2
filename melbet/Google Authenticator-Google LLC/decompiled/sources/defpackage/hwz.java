package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwz extends hnu {
    private final int a;
    private final int b = 12;
    private final int c = 16;
    private final hwy d;

    public hwz(int i, hwy hwyVar) {
        this.a = i;
        this.d = hwyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hwz)) {
            return false;
        }
        hwz hwzVar = (hwz) obj;
        if (hwzVar.a == this.a) {
            int i = hwzVar.b;
            int i2 = hwzVar.c;
            if (hwzVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(hwz.class, Integer.valueOf(this.a), 12, 16, this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
