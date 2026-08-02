package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcu {
    public static final ldb a = new ldb("REMOVE_FROZEN");
    public final kuj b;
    private final int c;
    private final boolean d;
    private final int e;
    private final kuk f;
    private final bst g;

    public lcu(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        kul kulVar = kul.a;
        this.f = new kuk(null, kulVar);
        this.b = new kuj(0L, kulVar);
        this.g = new bst(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            kuj kujVar = this.b;
            long j = kujVar.b;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = this.e;
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.d) {
                if (this.g.A(i2 & i).a != null) {
                    int i4 = this.c;
                    if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                        break;
                    }
                }
            }
            if (kujVar.c(j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                this.g.A(i2 & i).c(obj);
                while ((this.b.b & 1152921504606846976L) != 0) {
                    this = this.c();
                    bst bstVar = this.g;
                    int i5 = this.e & i2;
                    Object obj2 = bstVar.A(i5).a;
                    if ((obj2 instanceof lct) && ((lct) obj2).a == i2) {
                        bstVar.A(i5).c(obj);
                    } else {
                        this = null;
                    }
                    if (this == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final Object b() {
        while (true) {
            kuj kujVar = this.b;
            long j = kujVar.b;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            long j2 = 1073741823;
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            bst bstVar = this.g;
            Object obj = bstVar.A(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof lct) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (kujVar.c(j, jav.p(j, i4))) {
                    bstVar.A(i3).c(null);
                    return obj;
                }
                if (this.d) {
                    lcu lcuVar = this;
                    while (true) {
                        kuj kujVar2 = lcuVar.b;
                        while (true) {
                            long j3 = kujVar2.b;
                            long j4 = j3 & j2;
                            boolean z = kvo.a;
                            if ((j3 & 1152921504606846976L) != 0) {
                                lcuVar = lcuVar.c();
                                break;
                            }
                            if (kujVar2.c(j3, jav.p(j3, i4))) {
                                lcuVar.g.A(((int) j4) & lcuVar.e).c(null);
                                lcuVar = null;
                                break;
                            }
                            j2 = 1073741823;
                        }
                        if (lcuVar == null) {
                            return obj;
                        }
                        j2 = 1073741823;
                    }
                }
            }
        }
    }

    public final lcu c() {
        long j;
        while (true) {
            kuj kujVar = this.b;
            j = kujVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = 1152921504606846976L | j;
            if (kujVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        kuk kukVar = this.f;
        while (true) {
            lcu lcuVar = (lcu) kukVar.a;
            if (lcuVar != null) {
                return lcuVar;
            }
            int i = this.c;
            lcu lcuVar2 = new lcu(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object obj = this.g.A(i4).a;
                    if (obj == null) {
                        obj = new lct(i2);
                    }
                    lcuVar2.g.A(lcuVar2.e & i2).c(obj);
                    i2++;
                }
            }
            lcuVar2.b.b = (-1152921504606846977L) & j;
            kukVar.d(null, lcuVar2);
        }
    }

    public final boolean d() {
        kuj kujVar;
        long j;
        do {
            kujVar = this.b;
            j = kujVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!kujVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
