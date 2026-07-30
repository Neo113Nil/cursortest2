package androidx.activity.contextaware;

import android.content.Context;
import f6.l;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.r;
import kotlinx.coroutines.o;
import y5.w;

/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, l lVar, c cVar) {
        c intercepted;
        Object coroutine_suspended;
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(oVar, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        oVar.invokeOnCancellation(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object result = oVar.getResult();
        coroutine_suspended = b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, l lVar, c cVar) {
        c intercepted;
        Object coroutine_suspended;
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        r.mark(0);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(oVar, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        oVar.invokeOnCancellation(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        w wVar = w.INSTANCE;
        Object result = oVar.getResult();
        coroutine_suspended = b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            f.probeCoroutineSuspended(cVar);
        }
        r.mark(1);
        return result;
    }
}
