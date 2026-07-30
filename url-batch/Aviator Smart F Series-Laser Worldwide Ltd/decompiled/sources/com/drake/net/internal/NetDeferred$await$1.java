package com.drake.net.internal;

import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "com.drake.net.internal.NetDeferred", f = "NetDeferred.kt", i = {0}, l = {38}, m = "await", n = {"occurred"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class NetDeferred$await$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetDeferred this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetDeferred$await$1(NetDeferred netDeferred, c cVar) {
        super(cVar);
        this.this$0 = netDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.await(this);
    }
}
