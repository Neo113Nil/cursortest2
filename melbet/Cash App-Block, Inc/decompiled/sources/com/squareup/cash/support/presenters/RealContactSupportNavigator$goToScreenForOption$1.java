package com.squareup.cash.support.presenters;

import app.cash.broadway.navigation.Navigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealContactSupportNavigator$goToScreenForOption$1 extends ContinuationImpl {
    public Navigator L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactSupportNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSupportNavigator$goToScreenForOption$1(RealContactSupportNavigator realContactSupportNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactSupportNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.goToScreenForOption(null, null, false, null, null, null, null, this);
    }
}
