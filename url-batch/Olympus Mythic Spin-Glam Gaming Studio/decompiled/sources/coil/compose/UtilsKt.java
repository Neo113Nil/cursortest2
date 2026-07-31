package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.request.ImageRequest;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Utils.kt */
/* loaded from: classes4.dex */
public abstract class UtilsKt {
    private static final long ZeroConstraints = Constraints.INSTANCE.m2495fixedJhjzzOo(0, 0);

    public static final ImageRequest requestOf(Object obj, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof ImageRequest) {
            return (ImageRequest) obj;
        }
        return new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj).build();
    }

    public static final Scale toScale(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return Intrinsics.areEqual(contentScale, companion.getFit()) ? true : Intrinsics.areEqual(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final float m2914constrainWidthK40F9xA(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m2489getMinWidthimpl(j), Constraints.m2487getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final float m2913constrainHeightK40F9xA(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m2488getMinHeightimpl(j), Constraints.m2486getMaxHeightimpl(j));
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m2915toIntSizeuvyYCjk(long j) {
        return IntSizeKt.IntSize(MathKt.roundToInt(Size.m1335getWidthimpl(j)), MathKt.roundToInt(Size.m1333getHeightimpl(j)));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }
}
