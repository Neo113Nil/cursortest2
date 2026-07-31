package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "", "Landroidx/compose/ui/geometry/Offset;", "pixelsPerSecond", "", "confidence", "", "durationMillis", "offset", "<init>", "(JFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPixelsPerSecond-F1C5BW0", "()J", "F", "getConfidence", "()F", "getDurationMillis", "getOffset-F1C5BW0", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* data */ class VelocityEstimate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final VelocityEstimate None;
    private final float confidence;
    private final long durationMillis;
    private final long offset;
    private final long pixelsPerSecond;

    public /* synthetic */ VelocityEstimate(long j, float f, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, j2, j3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VelocityEstimate)) {
            return false;
        }
        VelocityEstimate velocityEstimate = (VelocityEstimate) other;
        return Offset.m1294equalsimpl0(this.pixelsPerSecond, velocityEstimate.pixelsPerSecond) && Intrinsics.areEqual((Object) Float.valueOf(this.confidence), (Object) Float.valueOf(velocityEstimate.confidence)) && this.durationMillis == velocityEstimate.durationMillis && Offset.m1294equalsimpl0(this.offset, velocityEstimate.offset);
    }

    public int hashCode() {
        return (((((Offset.m1299hashCodeimpl(this.pixelsPerSecond) * 31) + Float.hashCode(this.confidence)) * 31) + Long.hashCode(this.durationMillis)) * 31) + Offset.m1299hashCodeimpl(this.offset);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) Offset.m1304toStringimpl(this.pixelsPerSecond)) + ", confidence=" + this.confidence + ", durationMillis=" + this.durationMillis + ", offset=" + ((Object) Offset.m1304toStringimpl(this.offset)) + ')';
    }

    private VelocityEstimate(long j, float f, long j2, long j3) {
        this.pixelsPerSecond = j;
        this.confidence = f;
        this.durationMillis = j2;
        this.offset = j3;
    }

    /* renamed from: getPixelsPerSecond-F1C5BW0, reason: not valid java name and from getter */
    public final long getPixelsPerSecond() {
        return this.pixelsPerSecond;
    }

    /* compiled from: VelocityTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityEstimate$Companion;", "", "()V", "None", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "getNone", "()Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VelocityEstimate getNone() {
            return VelocityEstimate.None;
        }
    }

    static {
        Offset.Companion companion = Offset.INSTANCE;
        None = new VelocityEstimate(companion.m1308getZeroF1C5BW0(), 1.0f, 0L, companion.m1308getZeroF1C5BW0(), null);
    }
}
