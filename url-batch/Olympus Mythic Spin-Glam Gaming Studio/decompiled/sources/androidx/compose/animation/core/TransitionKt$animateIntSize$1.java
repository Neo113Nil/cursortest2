package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class TransitionKt$animateIntSize$1 extends Lambda implements Function3 {
    public static final TransitionKt$animateIntSize$1 INSTANCE = new TransitionKt$animateIntSize$1();

    public TransitionKt$animateIntSize$1() {
        super(3);
    }

    @Composable
    @NotNull
    public final SpringSpec<IntSize> invoke(@NotNull Transition.Segment<Object> segment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(967893300);
        SpringSpec<IntSize> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m2562boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Object>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
