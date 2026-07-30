package kotlin.coroutines.intrinsics;

import f6.l;
import kotlin.NotImplementedError;
import kotlin.coroutines.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class b extends IntrinsicsKt__IntrinsicsJvmKt {
    public static Object getCOROUTINE_SUSPENDED() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public static /* synthetic */ void getCOROUTINE_SUSPENDED$annotations() {
    }

    private static final <T> Object suspendCoroutineUninterceptedOrReturn(l lVar, c cVar) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
}
