package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public enum lo {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    lo(long j) {
        this.mValue = j;
    }

    public static lo fromValue(long j) {
        lo[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    public long getValue() {
        return this.mValue;
    }
}
