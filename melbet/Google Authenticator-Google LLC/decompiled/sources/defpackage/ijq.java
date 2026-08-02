package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ijq implements jkr {
    CARD_LOCATION_UNSPECIFIED(0),
    ABOVE_ACCOUNT_SWITCHER(1),
    BELOW_ACCOUNT_SWITCHER(2);

    private final int e;

    ijq(int i) {
        this.e = i;
    }

    public static ijq b(int i) {
        if (i == 0) {
            return CARD_LOCATION_UNSPECIFIED;
        }
        if (i == 1) {
            return ABOVE_ACCOUNT_SWITCHER;
        }
        if (i != 2) {
            return null;
        }
        return BELOW_ACCOUNT_SWITCHER;
    }

    @Override // defpackage.jkr
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
