package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "Landroidx/compose/ui/geometry/Offset;", "point", "", "time", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPoint-F1C5BW0", "()J", "getTime", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class PointAtTime {
    private final long point;
    private final long time;

    public /* synthetic */ PointAtTime(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointAtTime)) {
            return false;
        }
        PointAtTime pointAtTime = (PointAtTime) other;
        return Offset.m1294equalsimpl0(this.point, pointAtTime.point) && this.time == pointAtTime.time;
    }

    public int hashCode() {
        return (Offset.m1299hashCodeimpl(this.point) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "PointAtTime(point=" + ((Object) Offset.m1304toStringimpl(this.point)) + ", time=" + this.time + ')';
    }

    private PointAtTime(long j, long j2) {
        this.point = j;
        this.time = j2;
    }

    /* renamed from: getPoint-F1C5BW0, reason: not valid java name and from getter */
    public final long getPoint() {
        return this.point;
    }

    public final long getTime() {
        return this.time;
    }
}
