package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehx implements eia {
    public static final ehx a = new ehx();
    private static final dkr b;

    static {
        iwq iwqVar = dlf.a;
        jkj k = dle.a.k();
        if (!k.b.M()) {
            k.t();
        }
        dle dleVar = (dle) k.b;
        dleVar.d = 4;
        dleVar.b |= 2;
        b = new dkr(iwqVar, (dle) k.q());
    }

    private ehx() {
    }

    @Override // defpackage.eia
    public final dkr a() {
        return b;
    }

    @Override // defpackage.eia
    public final jit b() {
        return null;
    }

    @Override // defpackage.eia
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehx)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1930127820;
    }

    public final String toString() {
        return "IncognitoAccount";
    }
}
