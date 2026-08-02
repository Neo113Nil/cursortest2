package com.squareup.cash.wallet.data;

import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.postcard.app.GetCardDetailsResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealIssuedCardManager$retrieveCardDetails$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public WalletHomeScreen L$0;
    public Screen L$1;
    public Function2 L$2;
    public Function0 L$3;
    public Function1 L$4;
    public BlockersData L$5;
    public ApiResult L$7;
    public GetCardDetailsResponse L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealIssuedCardManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIssuedCardManager$retrieveCardDetails$1(RealIssuedCardManager realIssuedCardManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realIssuedCardManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.retrieveCardDetails(null, null, null, null, null, this);
    }
}
