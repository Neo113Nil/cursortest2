package com.squareup.cash.wallet.views;

import androidx.compose.foundation.pager.PagerState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class WalletCardSchemeViewKt$peekFirstTag$1 extends ContinuationImpl {
    public PagerState L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return UtilsKt.access$peekFirstTag(null, this);
    }
}
