package androidx.lifecycle.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LifecycleEffect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/lifecycle/compose/LifecycleResumePauseEffectScope$onPauseOrDispose$1", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "", "runPauseOrOnDisposeEffect", "()V", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class LifecycleResumePauseEffectScope$onPauseOrDispose$1 implements LifecyclePauseOrDisposeEffectResult {
    final /* synthetic */ Function1 $onPauseOrDisposeEffect;
    final /* synthetic */ LifecycleResumePauseEffectScope this$0;

    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
    public void runPauseOrOnDisposeEffect() {
        this.$onPauseOrDisposeEffect.invoke(this.this$0);
    }
}
