package com.chicken.road.kedbags.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SplashRepository.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.data.repository.SplashRepository", f = "SplashRepository.kt", i = {0}, l = {32}, m = "fetchSnapshot", n = {"signals"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class SplashRepository$fetchSnapshot$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplashRepository$fetchSnapshot$1(SplashRepository splashRepository, Continuation<? super SplashRepository$fetchSnapshot$1> continuation) {
        super(continuation);
        this.this$0 = splashRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchSnapshot(null, this);
    }
}
