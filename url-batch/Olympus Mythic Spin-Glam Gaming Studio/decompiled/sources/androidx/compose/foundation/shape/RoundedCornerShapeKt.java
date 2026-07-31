package androidx.compose.foundation.shape;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundedCornerShape.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000b\"\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/shape/CornerSize;", "corner", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/ui/unit/Dp;", "size", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", "(I)Landroidx/compose/foundation/shape/RoundedCornerShape;", "CircleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape RoundedCornerShape(CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new RoundedCornerShape(corner, corner, corner, corner);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m510RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(CornerSizeKt.m509CornerSize0680j_4(f));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i));
    }
}
