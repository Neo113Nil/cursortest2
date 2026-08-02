package com.squareup.cash.transfers.backend.real;

import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaxWebAppBridge$openTakePhoto$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealScheduledReloadsManager$fromProfile$$inlined$map$1$2$1(TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = taxWebAppBridge$openTakePhoto$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
