package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ije implements jkr {
    BADGE_SOURCE_UNDEFINED(0),
    BADGE_SOURCE_AO(1),
    BADGE_SOURCE_G1(2),
    BADGE_SOURCE_CS(3),
    BADGE_SOURCE_G1_ADVICE(4),
    BADGE_SOURCE_LEGACY_AO(5),
    ALL(6);

    public final int h;

    ije(int i2) {
        this.h = i2;
    }

    public static ije b(int i2) {
        switch (i2) {
            case 0:
                return BADGE_SOURCE_UNDEFINED;
            case 1:
                return BADGE_SOURCE_AO;
            case 2:
                return BADGE_SOURCE_G1;
            case 3:
                return BADGE_SOURCE_CS;
            case 4:
                return BADGE_SOURCE_G1_ADVICE;
            case 5:
                return BADGE_SOURCE_LEGACY_AO;
            case 6:
                return ALL;
            default:
                return null;
        }
    }

    @Override // defpackage.jkr
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
