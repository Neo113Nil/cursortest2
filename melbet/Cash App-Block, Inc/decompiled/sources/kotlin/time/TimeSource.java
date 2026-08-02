package kotlin.time;

import okio.Okio;

/* loaded from: classes3.dex */
public interface TimeSource {
    TimeMark markNow();

    public final class Monotonic implements TimeSource {
        public static final Monotonic INSTANCE = new Monotonic();

        @Override // kotlin.time.TimeSource
        public final TimeMark markNow() {
            MonotonicTimeSource.INSTANCE.getClass();
            return new ValueTimeMark(MonotonicTimeSource.read$1());
        }

        public final String toString() {
            MonotonicTimeSource.INSTANCE.getClass();
            return "TimeSource(System.nanoTime())";
        }

        public final class ValueTimeMark implements ComparableTimeMark {
            public final long reading;

            public /* synthetic */ ValueTimeMark(long j) {
                this.reading = j;
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m4180elapsedNowUwyO8pc(long j) {
                MonotonicTimeSource.INSTANCE.getClass();
                long read$1 = MonotonicTimeSource.read$1();
                DurationUnit durationUnit = DurationUnit.NANOSECONDS;
                return (1 | (j - 1)) == Long.MAX_VALUE ? Duration.m4179unaryMinusUwyO8pc(Okio.infinityOfSign(j)) : Okio.saturatingFiniteDiff(read$1, j);
            }

            @Override // java.lang.Comparable
            public final /* bridge */ int compareTo(Object obj) {
                return InstantKt.compareTo(this, (ComparableTimeMark) obj);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof ValueTimeMark) {
                    return this.reading == ((ValueTimeMark) obj).reading;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public final long mo4161minusUwyO8pc(ComparableTimeMark comparableTimeMark) {
                comparableTimeMark.getClass();
                boolean z = comparableTimeMark instanceof ValueTimeMark;
                long j = this.reading;
                if (!z) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + comparableTimeMark);
                }
                long j2 = ((ValueTimeMark) comparableTimeMark).reading;
                MonotonicTimeSource.INSTANCE.getClass();
                DurationUnit durationUnit = DurationUnit.NANOSECONDS;
                if (((j2 - 1) | 1) != Long.MAX_VALUE) {
                    return (1 | (j - 1)) == Long.MAX_VALUE ? Okio.infinityOfSign(j) : Okio.saturatingFiniteDiff(j, j2);
                }
                if (j != j2) {
                    return Duration.m4179unaryMinusUwyO8pc(Okio.infinityOfSign(j2));
                }
                Duration.Companion.getClass();
                return 0L;
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.reading + ')';
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public final long mo4160elapsedNowUwyO8pc() {
                return m4180elapsedNowUwyO8pc(this.reading);
            }
        }
    }
}
