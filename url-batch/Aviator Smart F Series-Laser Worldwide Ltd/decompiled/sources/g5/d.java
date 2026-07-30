package g5;

/* loaded from: classes4.dex */
public class d extends a {
    public static final int DAY_BAR_MAX_VALUE = 200;
    public static final int DAY_CHART_BAR_COUNT = 48;
    public static final int DAY_DEFAULT_STEPS = 20;
    public static final int MONTH_BAR_MAX_VALUE = 10000;
    public static final int MONTH_DEFAULT_STEPS = 1000;
    public static final int WEEK_BAR_MAX_VALUE = 10000;
    public static final int WEEK_CHART_BAR_COUNT = 7;
    public static final int WEEK_DEFAULT_STEPS = 1000;

    public int getActiveSteps(float f8, int i8) {
        return (int) (f8 - i8);
    }
}
