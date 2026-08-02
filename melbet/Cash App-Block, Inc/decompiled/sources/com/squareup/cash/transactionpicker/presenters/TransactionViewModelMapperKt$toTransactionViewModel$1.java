package com.squareup.cash.transactionpicker.presenters;

import androidx.media3.ui.compose.modifiers.ExtensionsKt;
import com.squareup.cash.db2.activity.CashActivity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class TransactionViewModelMapperKt$toTransactionViewModel$1 extends ContinuationImpl {
    public CashActivity L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ExtensionsKt.toTransactionViewModel(null, null, this);
    }
}
