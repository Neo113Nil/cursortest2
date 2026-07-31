package coil.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: Lifecycles.kt */
/* renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* loaded from: classes15.dex */
public abstract class Lifecycles {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitStarted(Lifecycle lifecycle, Continuation continuation) {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        int i;
        Lifecycle lifecycle2;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuation instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuation;
            int i2 = lifecycles$awaitStarted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lifecycles$awaitStarted$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lifecycles$awaitStarted$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
                        return Unit.INSTANCE;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        lifecycles$awaitStarted$1.L$0 = lifecycle;
                        lifecycles$awaitStarted$1.L$1 = ref$ObjectRef2;
                        lifecycles$awaitStarted$1.label = 1;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(lifecycles$awaitStarted$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        ?? r3 = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$awaitStarted$2$1
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public void onStart(LifecycleOwner lifecycleOwner) {
                                CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                            }
                        };
                        ref$ObjectRef2.element = r3;
                        Intrinsics.checkNotNull(r3);
                        lifecycle.addObserver((LifecycleObserver) r3);
                        Object result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(lifecycles$awaitStarted$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lifecycle2 = lifecycle;
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (Throwable th2) {
                        lifecycle2 = lifecycle;
                        ref$ObjectRef = ref$ObjectRef2;
                        th = th2;
                        lifecycleObserver = (LifecycleObserver) ref$ObjectRef.element;
                        if (lifecycleObserver != null) {
                            lifecycle2.removeObserver(lifecycleObserver);
                        }
                        throw th;
                    }
                } else if (i == 1) {
                    ref$ObjectRef = (Ref$ObjectRef) lifecycles$awaitStarted$1.L$1;
                    lifecycle2 = (Lifecycle) lifecycles$awaitStarted$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        lifecycleObserver = (LifecycleObserver) ref$ObjectRef.element;
                        if (lifecycleObserver != null) {
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleObserver2 = (LifecycleObserver) ref$ObjectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            }
        }
        lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuation);
        Object obj2 = lifecycles$awaitStarted$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lifecycles$awaitStarted$1.label;
        if (i != 0) {
        }
        lifecycleObserver2 = (LifecycleObserver) ref$ObjectRef.element;
        if (lifecycleObserver2 != null) {
        }
        return Unit.INSTANCE;
    }

    public static final void removeAndAddObserver(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
