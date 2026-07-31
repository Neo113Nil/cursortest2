package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeToDismiss.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SwipeToDismissKt$rememberDismissState$2 extends Lambda implements Function0 {
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ DismissValue $initialValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeToDismissKt$rememberDismissState$2(DismissValue dismissValue, Function1 function1) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final DismissState mo4828invoke() {
        return new DismissState(this.$initialValue, this.$confirmStateChange);
    }
}
