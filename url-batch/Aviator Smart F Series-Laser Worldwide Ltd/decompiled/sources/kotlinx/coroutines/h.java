package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class h {
    public static final <T> T runBlocking(CoroutineContext coroutineContext, f6.p pVar) {
        y0 currentOrNull$kotlinx_coroutines_core;
        CoroutineContext newCoroutineContext;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(kotlin.coroutines.d.Key);
        if (dVar == null) {
            currentOrNull$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            newCoroutineContext = CoroutineContextKt.newCoroutineContext(e1.INSTANCE, coroutineContext.plus(currentOrNull$kotlinx_coroutines_core));
        } else {
            y0 y0Var = dVar instanceof y0 ? (y0) dVar : null;
            if (y0Var != null) {
                y0 y0Var2 = y0Var.shouldBeProcessedFromContext() ? y0Var : null;
                if (y0Var2 != null) {
                    currentOrNull$kotlinx_coroutines_core = y0Var2;
                    newCoroutineContext = CoroutineContextKt.newCoroutineContext(e1.INSTANCE, coroutineContext);
                }
            }
            currentOrNull$kotlinx_coroutines_core = h2.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            newCoroutineContext = CoroutineContextKt.newCoroutineContext(e1.INSTANCE, coroutineContext);
        }
        e eVar = new e(newCoroutineContext, currentThread, currentOrNull$kotlinx_coroutines_core);
        eVar.start(CoroutineStart.DEFAULT, eVar, pVar);
        return (T) eVar.joinBlocking();
    }

    public static /* synthetic */ Object runBlocking$default(CoroutineContext coroutineContext, f6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return g.runBlocking(coroutineContext, pVar);
    }
}
