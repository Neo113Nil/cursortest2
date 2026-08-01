package com.swmansion.rnscreens;

import com.swmansion.rnscreens.ScreenStack;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: ScreenStack.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\fR\u00020\r0\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/ReverseOrderInRange;", "Lcom/swmansion/rnscreens/ChildDrawingOrderStrategyBase;", "range", "Lkotlin/ranges/IntRange;", "<init>", "(Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "apply", "", "drawingOperations", "", "Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "Lcom/swmansion/rnscreens/ScreenStack;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReverseOrderInRange extends ChildDrawingOrderStrategyBase {
    private final IntRange range;

    public final IntRange getRange() {
        return this.range;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReverseOrderInRange(IntRange range) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(range, "range");
        this.range = range;
    }

    @Override // com.swmansion.rnscreens.ChildDrawingOrderStrategy
    public void apply(List<ScreenStack.DrawingOp> drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (isEnabled()) {
            int intValue = this.range.getStart().intValue();
            for (int intValue2 = this.range.getEndInclusive().intValue(); intValue < intValue2; intValue2--) {
                Collections.swap(drawingOperations, intValue, intValue2);
                intValue++;
            }
        }
    }
}
