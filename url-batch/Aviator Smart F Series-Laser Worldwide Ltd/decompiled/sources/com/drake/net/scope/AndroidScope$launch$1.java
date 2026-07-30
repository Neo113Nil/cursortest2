package com.drake.net.scope;

import f6.p;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.i0;
import y5.g;
import y5.w;

@d(c = "com.drake.net.scope.AndroidScope$launch$1", f = "AndroidScope.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AndroidScope$launch$1 extends SuspendLambda implements p {
    final /* synthetic */ p $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidScope$launch$1(p pVar, c cVar) {
        super(2, cVar);
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        AndroidScope$launch$1 androidScope$launch$1 = new AndroidScope$launch$1(this.$block, cVar);
        androidScope$launch$1.L$0 = obj;
        return androidScope$launch$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            p pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(i0Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.throwOnFailure(obj);
        }
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, c cVar) {
        return ((AndroidScope$launch$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
