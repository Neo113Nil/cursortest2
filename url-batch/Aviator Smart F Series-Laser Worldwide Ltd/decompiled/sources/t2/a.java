package t2;

import java.util.Random;

/* loaded from: classes2.dex */
public class a {
    private static final int HEART_RATE_VARIABILITY_RANGE = 60;
    private static final int MIN_HEART_RATE_VARIABILITY = 40;

    private a() {
    }

    public static int calculationHeartRateVariability() {
        return (int) ((new Random().nextFloat() * 60.0f) + 40.0f);
    }
}
