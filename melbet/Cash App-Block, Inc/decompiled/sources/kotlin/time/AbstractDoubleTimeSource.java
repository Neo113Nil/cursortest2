package kotlin.time;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import papa.Handlers$$ExternalSyntheticBUOutline0;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource {

    public final class DoubleTimeMark implements ComparableTimeMark {
        public final long offset;
        public final double startedAt;
        public final AbstractDoubleTimeSource timeSource;

        public DoubleTimeMark(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            abstractDoubleTimeSource.getClass();
            this.startedAt = d;
            this.timeSource = abstractDoubleTimeSource;
            this.offset = j;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ int compareTo(Object obj) {
            return InstantKt.compareTo(this, (ComparableTimeMark) obj);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public final long mo4160elapsedNowUwyO8pc() {
            DurationKt.toDuration(this.timeSource.read() - this.startedAt, (DurationUnit) null);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DoubleTimeMark)) {
                return false;
            }
            if (!this.timeSource.equals(((DoubleTimeMark) obj).timeSource)) {
                return false;
            }
            mo4161minusUwyO8pc((ComparableTimeMark) obj);
            Duration.Companion.getClass();
            return Duration.m4166equalsimpl0(0L, 0L);
        }

        public final int hashCode() {
            DurationKt.toDuration(this.startedAt, (DurationUnit) null);
            throw null;
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc, reason: not valid java name */
        public final long mo4161minusUwyO8pc(ComparableTimeMark comparableTimeMark) {
            comparableTimeMark.getClass();
            if (comparableTimeMark instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) comparableTimeMark;
                long j = doubleTimeMark.offset;
                if (this.timeSource.equals(doubleTimeMark.timeSource)) {
                    long j2 = this.offset;
                    if (Duration.m4166equalsimpl0(j2, j) && Duration.m4171isInfiniteimpl(j2)) {
                        Duration.Companion.getClass();
                        return 0L;
                    }
                    Duration.m4172minusLRDsOJo(j2, j);
                    DurationKt.toDuration(this.startedAt - doubleTimeMark.startedAt, (DurationUnit) null);
                    throw null;
                }
            }
            Handlers$$ExternalSyntheticBUOutline0.m$1("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", comparableTimeMark);
            return 0L;
        }

        public final String toString() {
            DurationUnitKt__DurationUnitKt.shortName(null);
            throw null;
        }
    }

    @Override // kotlin.time.TimeSource
    public final TimeMark markNow() {
        double read = read();
        Duration.Companion.getClass();
        return new DoubleTimeMark(read, this, 0L, null);
    }

    public abstract double read();
}
