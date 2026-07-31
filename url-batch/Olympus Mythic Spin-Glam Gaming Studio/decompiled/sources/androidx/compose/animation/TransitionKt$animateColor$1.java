package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes14.dex */
public final class TransitionKt$animateColor$1 extends Lambda implements Function3 {
    public static final TransitionKt$animateColor$1 INSTANCE = new TransitionKt$animateColor$1();

    public TransitionKt$animateColor$1() {
        super(3);
    }

    @Composable
    @NotNull
    public final SpringSpec<Color> invoke(@NotNull Transition.Segment<Object> segment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-1457805428);
        SpringSpec<Color> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Object>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
