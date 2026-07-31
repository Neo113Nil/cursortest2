package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

/* compiled from: LifecycleEffect.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {
    private final Lifecycle lifecycle;

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
