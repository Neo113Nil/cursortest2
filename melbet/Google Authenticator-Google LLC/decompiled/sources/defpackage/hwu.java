package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwu extends hnu {
    private final int a;
    private final int b = 16;
    private final int c = 16;
    private final hwt d;

    public hwu(int i, hwt hwtVar) {
        this.a = i;
        this.d = hwtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hwu)) {
            return false;
        }
        hwu hwuVar = (hwu) obj;
        if (hwuVar.a == this.a) {
            int i = hwuVar.b;
            int i2 = hwuVar.c;
            if (hwuVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(hwu.class, Integer.valueOf(this.a), 16, 16, this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", 16-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
