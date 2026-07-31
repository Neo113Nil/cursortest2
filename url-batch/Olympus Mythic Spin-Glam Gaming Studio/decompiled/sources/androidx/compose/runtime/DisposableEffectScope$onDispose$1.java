package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class DisposableEffectScope$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ Function0 $onDisposeEffect;

    @Override // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.$onDisposeEffect.mo4828invoke();
    }
}
