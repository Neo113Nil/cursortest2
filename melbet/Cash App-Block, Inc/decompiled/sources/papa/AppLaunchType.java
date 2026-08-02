package papa;

/* loaded from: classes3.dex */
public enum AppLaunchType {
    COLD(0),
    WARM(1),
    HOT(2);

    public final long slowThresholdMillis;

    AppLaunchType(int i) {
        this.slowThresholdMillis = r1;
    }
}
