package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: TransformableState.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends Lambda implements Function3 {
    final /* synthetic */ State<Function3> $lambdaState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformableStateKt$rememberTransformableState$1$1(State<? extends Function3> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m291invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).getPackedValue(), ((Number) obj3).floatValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m291invoked4ec7I(float f, long j, float f2) {
        ((Function3) this.$lambdaState.getValue()).invoke(Float.valueOf(f), Offset.m1288boximpl(j), Float.valueOf(f2));
    }
}
