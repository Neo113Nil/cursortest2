package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentScope$slideIntoContainer$3 extends Lambda implements Function1 {
    final /* synthetic */ Function1 $initialOffset;
    final /* synthetic */ AnimatedContentScope<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$slideIntoContainer$3(Function1 function1, AnimatedContentScope<Object> animatedContentScope) {
        super(1);
        this.$initialOffset = function1;
        this.this$0 = animatedContentScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final Integer invoke(int i) {
        long m43getCurrentSizeYbymL2g;
        long m40calculateOffsetemnUabE;
        Function1 function1 = this.$initialOffset;
        AnimatedContentScope<Object> animatedContentScope = this.this$0;
        long IntSize = IntSizeKt.IntSize(i, i);
        m43getCurrentSizeYbymL2g = this.this$0.m43getCurrentSizeYbymL2g();
        m40calculateOffsetemnUabE = animatedContentScope.m40calculateOffsetemnUabE(IntSize, m43getCurrentSizeYbymL2g);
        return (Integer) function1.invoke(Integer.valueOf((-IntOffset.m2553getXimpl(m40calculateOffsetemnUabE)) - i));
    }
}
