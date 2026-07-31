package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$0$0$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ Ref$ObjectRef $effectResult$inlined;
    final /* synthetic */ LifecycleOwner $lifecycleOwner$inlined;
    final /* synthetic */ LifecycleEventObserver $observer$inlined;

    @Override // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.$lifecycleOwner$inlined.getLifecycle().removeObserver(this.$observer$inlined);
        LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) this.$effectResult$inlined.element;
        if (lifecyclePauseOrDisposeEffectResult != null) {
            lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
        }
    }
}
