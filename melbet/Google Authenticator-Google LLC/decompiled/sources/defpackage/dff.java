package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum dff implements jkr {
    UNKNOWN_DELAY(0),
    IMMEDIATE(1),
    TEN_SECONDS(2),
    ONE_MINUTE(3),
    TEN_MINUTES(4);

    public final int f;

    dff(int i) {
        this.f = i;
    }

    public static dff b(int i) {
        if (i == 0) {
            return UNKNOWN_DELAY;
        }
        if (i == 1) {
            return IMMEDIATE;
        }
        if (i == 2) {
            return TEN_SECONDS;
        }
        if (i == 3) {
            return ONE_MINUTE;
        }
        if (i != 4) {
            return null;
        }
        return TEN_MINUTES;
    }

    @Override // defpackage.jkr
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
