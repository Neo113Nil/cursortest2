package kotlinx.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes3.dex */
public final class DispatchedCoroutine extends ScopeCoroutine {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _decision$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void afterCompletion(Object obj) {
        afterResume(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void afterResume(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = _decision$volatile$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("Already resumed");
                    return;
                } else {
                    InlineList.resumeCancellableWithInternal(JobKt.recoverResult(obj), IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.uCont));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
