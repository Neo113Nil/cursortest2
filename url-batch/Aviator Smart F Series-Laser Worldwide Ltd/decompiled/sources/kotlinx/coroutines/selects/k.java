package kotlinx.coroutines.selects;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.u0;

/* loaded from: classes5.dex */
public interface k extends j, l2 {
    @Override // kotlinx.coroutines.selects.j
    /* synthetic */ void disposeOnCompletion(u0 u0Var);

    @Override // kotlinx.coroutines.selects.j
    /* synthetic */ CoroutineContext getContext();

    /* synthetic */ void invokeOnCancellation(d0 d0Var, int i8);

    @Override // kotlinx.coroutines.selects.j
    /* synthetic */ void selectInRegistrationPhase(Object obj);

    @Override // kotlinx.coroutines.selects.j
    /* synthetic */ boolean trySelect(Object obj, Object obj2);
}
