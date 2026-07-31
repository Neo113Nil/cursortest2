package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final class EnterExitTransitionKt$slideInHorizontally$2 extends Lambda implements Function1 {
    final /* synthetic */ Function1 $initialOffsetX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$slideInHorizontally$2(Function1 function1) {
        super(1);
        this.$initialOffsetX = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m2545boximpl(m81invokemHKZG7I(((IntSize) obj).getPackedValue()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m81invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(((Number) this.$initialOffsetX.invoke(Integer.valueOf(IntSize.m2567getWidthimpl(j)))).intValue(), 0);
    }
}
