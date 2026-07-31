package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SwipeableKt$rememberSwipeableState$2 extends Lambda implements Function0 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ Object $initialValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$rememberSwipeableState$2(Object obj, AnimationSpec<Float> animationSpec, Function1 function1) {
        super(0);
        this.$initialValue = obj;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final SwipeableState<Object> mo4828invoke() {
        return new SwipeableState<>(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
