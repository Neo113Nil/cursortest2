package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzi extends hnu {
    private final int a;
    private final int b;
    private final hzh c;
    private final hzg d;

    public hzi(int i, int i2, hzh hzhVar, hzg hzgVar) {
        this.a = i;
        this.b = i2;
        this.c = hzhVar;
        this.d = hzgVar;
    }

    public final int bP() {
        hzh hzhVar = this.c;
        if (hzhVar == hzh.d) {
            return this.b;
        }
        if (hzhVar == hzh.a || hzhVar == hzh.b || hzhVar == hzh.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hzi)) {
            return false;
        }
        hzi hziVar = (hzi) obj;
        return hziVar.a == this.a && hziVar.bP() == bP() && hziVar.c == this.c && hziVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(hzi.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        hzg hzgVar = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(hzgVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
