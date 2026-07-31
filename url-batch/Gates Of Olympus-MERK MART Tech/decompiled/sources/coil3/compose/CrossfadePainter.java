package coil3.compose;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

/* compiled from: CrossfadePainter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBO\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0010J\f\u00103\u001a\u000204*\u000205H\u0014J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020+H\u0014J\u0012\u00108\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J#\u00109\u001a\u0002012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b:\u0010;J\u001e\u0010<\u001a\u000204*\u0002052\b\u0010=\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020+H\u0002J\u001f\u0010>\u001a\u0002012\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u000201H\u0002¢\u0006\u0004\bA\u0010BR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010.\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0012R\u0016\u00100\u001a\u000201X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b2\u0010\u0016¨\u0006C"}, d2 = {"Lcoil3/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "start", "end", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "timeSource", "Lkotlin/time/TimeSource;", "fadeStart", "", "preferExactIntrinsicSize", "preferEndFirstIntrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;JLkotlin/time/TimeSource;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;JLkotlin/time/TimeSource;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnd", "()Landroidx/compose/ui/graphics/painter/Painter;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getDuration-UwyO8pc", "()J", "J", "getTimeSource", "()Lkotlin/time/TimeSource;", "getFadeStart", "()Z", "getPreferExactIntrinsicSize", "getPreferEndFirstIntrinsicSize", "<set-?>", "", "invalidateTick", "getInvalidateTick", "()I", "setInvalidateTick", "(I)V", "invalidateTick$delegate", "Landroidx/compose/runtime/MutableIntState;", "startTime", "Lkotlin/time/TimeMark;", "isDone", "maxAlpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "getStart", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "applyAlpha", "alpha", "applyColorFilter", "computeIntrinsicSize", "computeIntrinsicSize-xjbvk4A", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;)J", "drawPainter", "painter", "computeDrawSize", "srcSize", "dstSize", "computeDrawSize-x8L_9b0", "(JJ)J", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossfadePainter extends Painter {
    public static final int $stable = 0;
    private ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final long duration;
    private final Painter end;
    private final boolean fadeStart;
    private final long intrinsicSize;

    /* renamed from: invalidateTick$delegate, reason: from kotlin metadata */
    private final MutableIntState invalidateTick;
    private boolean isDone;
    private float maxAlpha;
    private final boolean preferEndFirstIntrinsicSize;
    private final boolean preferExactIntrinsicSize;
    private Painter start;
    private TimeMark startTime;
    private final TimeSource timeSource;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, TimeSource timeSource, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, painter2, contentScale, j, timeSource, z, z2);
    }

    public /* synthetic */ CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, TimeSource timeSource, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, painter2, contentScale, j, timeSource, z, z2, z3);
    }

    private CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, TimeSource timeSource, boolean z, boolean z2, boolean z3) {
        this.end = painter2;
        this.contentScale = contentScale;
        this.duration = j;
        this.timeSource = timeSource;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.preferEndFirstIntrinsicSize = z3;
        this.invalidateTick = SnapshotIntStateKt.mutableIntStateOf(0);
        this.maxAlpha = 1.0f;
        this.start = painter;
        this.intrinsicSize = m9146computeIntrinsicSizexjbvk4A(painter, painter2);
    }

    public final Painter getEnd() {
        return this.end;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, TimeSource timeSource, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, painter2, r5, r6, (i & 16) != 0 ? TimeSource.Monotonic.INSTANCE : timeSource, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (DefaultConstructorMarker) null);
        long j2;
        ContentScale fit = (i & 4) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        if ((i & 8) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j2 = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
        } else {
            j2 = j;
        }
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    /* renamed from: getDuration-UwyO8pc, reason: not valid java name and from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final TimeSource getTimeSource() {
        return this.timeSource;
    }

    public final boolean getFadeStart() {
        return this.fadeStart;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    public final boolean getPreferEndFirstIntrinsicSize() {
        return this.preferEndFirstIntrinsicSize;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, TimeSource timeSource, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, painter2, r3, r4, (i & 16) != 0 ? TimeSource.Monotonic.INSTANCE : timeSource, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (DefaultConstructorMarker) null);
        long j2;
        ContentScale fit = (i & 4) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        if ((i & 8) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j2 = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
        } else {
            j2 = j;
        }
    }

    private CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, TimeSource timeSource, boolean z, boolean z2) {
        this(painter, painter2, contentScale, j, timeSource, z, z2, false, 128, null);
    }

    private final int getInvalidateTick() {
        return this.invalidateTick.getIntValue();
    }

    private final void setInvalidateTick(int i) {
        this.invalidateTick.setIntValue(i);
    }

    public final Painter getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        if (this.isDone) {
            drawPainter(drawScope, this.end, this.maxAlpha);
            return;
        }
        TimeMark timeMark = this.startTime;
        if (timeMark == null) {
            timeMark = this.timeSource.markNow();
            this.startTime = timeMark;
        }
        float m10945getInWholeMillisecondsimpl = Duration.m10945getInWholeMillisecondsimpl(timeMark.mo10922elapsedNowUwyO8pc()) / Duration.m10945getInWholeMillisecondsimpl(this.duration);
        float coerceIn = RangesKt.coerceIn(m10945getInWholeMillisecondsimpl, 0.0f, 1.0f);
        float f = this.maxAlpha;
        float f2 = coerceIn * f;
        if (this.fadeStart) {
            f -= f2;
        }
        this.isDone = m10945getInWholeMillisecondsimpl >= 1.0f;
        drawPainter(drawScope, this.start, f);
        drawPainter(drawScope, this.end, f2);
        if (this.isDone) {
            this.start = null;
        } else {
            setInvalidateTick(getInvalidateTick() + 1);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.maxAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r5 != false) goto L31;
     */
    /* renamed from: computeIntrinsicSize-xjbvk4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m9146computeIntrinsicSizexjbvk4A(Painter start, Painter end) {
        long intrinsicSize = start != null ? start.getIntrinsicSize() : Size.INSTANCE.m5226getZeroNHjbRc();
        long intrinsicSize2 = end != null ? end.getIntrinsicSize() : Size.INSTANCE.m5226getZeroNHjbRc();
        boolean z = intrinsicSize != InlineClassHelperKt.UnspecifiedPackedFloats;
        boolean z2 = intrinsicSize2 != InlineClassHelperKt.UnspecifiedPackedFloats;
        if (this.preferEndFirstIntrinsicSize) {
            if (!z2) {
            }
            return intrinsicSize2;
        }
        if (z && z2) {
            float max = Math.max(Float.intBitsToFloat((int) (intrinsicSize >> 32)), Float.intBitsToFloat((int) (intrinsicSize2 >> 32)));
            return Size.m5208constructorimpl((Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (intrinsicSize & 4294967295L)), Float.intBitsToFloat((int) (intrinsicSize2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
        }
        if (this.preferExactIntrinsicSize) {
            if (!z) {
            }
            return intrinsicSize;
        }
        return Size.INSTANCE.m5225getUnspecifiedNHjbRc();
    }

    private final void drawPainter(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long mo5974getSizeNHjbRc = drawScope.mo5974getSizeNHjbRc();
        long m9145computeDrawSizex8L_9b0 = m9145computeDrawSizex8L_9b0(painter.getIntrinsicSize(), mo5974getSizeNHjbRc);
        if (mo5974getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m5219isEmptyimpl(mo5974getSizeNHjbRc)) {
            painter.m6100drawx_KDEd0(drawScope, m9145computeDrawSizex8L_9b0, f, this.colorFilter);
            return;
        }
        float f2 = 2;
        float intBitsToFloat = (Float.intBitsToFloat((int) (mo5974getSizeNHjbRc >> 32)) - Float.intBitsToFloat((int) (m9145computeDrawSizex8L_9b0 >> 32))) / f2;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (mo5974getSizeNHjbRc & 4294967295L)) - Float.intBitsToFloat((int) (m9145computeDrawSizex8L_9b0 & 4294967295L))) / f2;
        drawScope.getDrawContext().getTransform().inset(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2);
        try {
            painter.m6100drawx_KDEd0(drawScope, m9145computeDrawSizex8L_9b0, f, this.colorFilter);
        } finally {
            float f3 = -intBitsToFloat;
            float f4 = -intBitsToFloat2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    /* renamed from: computeDrawSize-x8L_9b0, reason: not valid java name */
    private final long m9145computeDrawSizex8L_9b0(long srcSize, long dstSize) {
        return (srcSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m5219isEmptyimpl(srcSize) || dstSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m5219isEmptyimpl(dstSize)) ? dstSize : ScaleFactorKt.m6975timesUQTWf7w(srcSize, this.contentScale.mo6837computeScaleFactorH7hwNQA(srcSize, dstSize));
    }
}
