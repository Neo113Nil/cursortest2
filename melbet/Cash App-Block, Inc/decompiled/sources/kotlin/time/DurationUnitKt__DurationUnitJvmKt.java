package kotlin.time;

/* loaded from: classes3.dex */
public class DurationUnitKt__DurationUnitJvmKt {
    public static final double convertDurationUnit(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
        durationUnit.getClass();
        durationUnit2.getClass();
        long convert = durationUnit2.timeUnit.convert(1L, durationUnit.timeUnit);
        return convert > 0 ? d * convert : d / durationUnit.timeUnit.convert(1L, durationUnit2.timeUnit);
    }
}
