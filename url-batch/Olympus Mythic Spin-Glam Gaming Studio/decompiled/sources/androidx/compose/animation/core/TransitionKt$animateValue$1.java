package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes12.dex */
public final class TransitionKt$animateValue$1 extends Lambda implements Function3 {
    public static final TransitionKt$animateValue$1 INSTANCE = new TransitionKt$animateValue$1();

    public TransitionKt$animateValue$1() {
        super(3);
    }

    @Composable
    @NotNull
    public final SpringSpec<Object> invoke(@NotNull Transition.Segment<Object> segment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-895531546);
        SpringSpec<Object> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Object>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
