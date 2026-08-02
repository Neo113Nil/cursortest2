package defpackage;

import j$.util.Objects;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eru {
    public static final eru a;
    public static final eru b = new eru(-1, 3);
    private static final int[] e;
    public final int c;
    public final int d;

    static {
        int[] iArr = {1, 10, 100, 1000, 10000, 100000, 1000000};
        e = iArr;
        a = new eru(iArr[3], 3);
    }

    public eru(int i, int i2) {
        hoq.x(i >= -1);
        hoq.x(i2 >= 0);
        this.c = i;
        this.d = i2;
    }

    public static eru b(lgc lgcVar) {
        int i = lgcVar.c;
        int i2 = i != 0 ? i != 2 ? i != 4 ? 0 : 2 : 1 : 3;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return new eru((i == 4 ? (lga) lgcVar.d : lga.a).c, (lgcVar.c == 4 ? (lga) lgcVar.d : lga.a).d);
            }
            if (i3 != 2) {
                throw new RuntimeException(null, null);
            }
        }
        return new eru(i == 2 ? ((Integer) lgcVar.d).intValue() : 0, 3);
    }

    public final int a() {
        int i = this.d;
        return i < 7 ? e[i] : (int) Math.pow(10.0d, i);
    }

    public final boolean c(Random random) {
        return random.nextDouble() * ((double) a()) < ((double) this.c);
    }

    public final boolean d() {
        return this.d == 3;
    }

    public final boolean e() {
        return this.c == -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eru) {
            eru eruVar = (eru) obj;
            if (this.c == eruVar.c && this.d == eruVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
