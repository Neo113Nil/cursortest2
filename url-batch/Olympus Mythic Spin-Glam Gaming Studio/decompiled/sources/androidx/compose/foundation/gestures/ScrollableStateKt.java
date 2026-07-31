package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u001a!\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "consumeScrollDelta", "Lkotlin/Function1;", "", "rememberScrollableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(Function1 consumeScrollDelta) {
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        return new DefaultScrollableState(consumeScrollDelta);
    }

    public static final ScrollableState rememberScrollableState(Function1 consumeScrollDelta, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        composer.startReplaceableGroup(-180460798);
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(consumeScrollDelta, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = ScrollableState(new Function1() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @NotNull
                public final Float invoke(float f) {
                    return (Float) ((Function1) rememberUpdatedState.getValue()).invoke(Float.valueOf(f));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).floatValue());
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollableState scrollableState = (ScrollableState) rememberedValue;
        composer.endReplaceableGroup();
        return scrollableState;
    }
}
