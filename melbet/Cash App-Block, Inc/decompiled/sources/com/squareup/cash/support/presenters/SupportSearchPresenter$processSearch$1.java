package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SupportSearchPresenter$processSearch$1 extends ContinuationImpl {
    public String L$0;
    public MutableState L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SupportSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportSearchPresenter$processSearch$1(SupportSearchPresenter supportSearchPresenter, Continuation continuation) {
        super(continuation);
        this.this$0 = supportSearchPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SupportSearchPresenter.access$processSearch(this.this$0, null, null, this);
    }
}
