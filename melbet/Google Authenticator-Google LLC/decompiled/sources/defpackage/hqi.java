package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hqi extends hqj {
    final int a;

    public hqi() {
        hoq.E(true, "%s (%s) must be > 0", "numAttempts", 3);
        this.a = 3;
    }

    @Override // defpackage.hqj
    public final boolean a(int i) {
        hoq.E(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hqi)) {
            return false;
        }
        int i = ((hqi) obj).a;
        return true;
    }

    public final int hashCode() {
        return 3;
    }
}
