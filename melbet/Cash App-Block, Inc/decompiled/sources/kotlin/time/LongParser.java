package kotlin.time;

/* loaded from: classes9.dex */
public final class LongParser {
    public static final LongParser iso = new LongParser(4611686018427387903L, true);
    public final boolean allowSign;
    public final long lastDigitMax;
    public final long overflowThreshold;

    public LongParser(long j, boolean z) {
        this.allowSign = z;
        this.overflowThreshold = j / 10;
        this.lastDigitMax = j % 10;
    }
}
