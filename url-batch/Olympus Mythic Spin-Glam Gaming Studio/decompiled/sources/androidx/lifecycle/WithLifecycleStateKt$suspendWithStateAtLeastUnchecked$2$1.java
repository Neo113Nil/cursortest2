package androidx.lifecycle;

import kotlin.Metadata;

/* compiled from: WithLifecycleState.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1 implements Runnable {
    final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    @Override // java.lang.Runnable
    public final void run() {
        this.$this_suspendWithStateAtLeastUnchecked.addObserver(this.$observer);
    }
}
