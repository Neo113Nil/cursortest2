package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt", f = "Slider.kt", l = {795}, m = "awaitSlop-8vUncbI")
/* loaded from: classes8.dex */
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SliderKt$awaitSlop$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m964awaitSlop8vUncbI;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m964awaitSlop8vUncbI = SliderKt.m964awaitSlop8vUncbI(null, 0L, 0, this);
        return m964awaitSlop8vUncbI;
    }
}
