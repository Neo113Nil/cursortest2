package com.squareup.cash.ui.qrcodes.widget;

import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.protos.franklin.ui.FullCashtag;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1 extends ContinuationImpl {
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaxWebAppBridge$openTakePhoto$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$2$emit$1(TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = taxWebAppBridge$openTakePhoto$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((FullCashtag) null, (Continuation) this);
    }
}
