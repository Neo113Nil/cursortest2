package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class CancelledContinuation extends CompletedExceptionally {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _resumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;
}
