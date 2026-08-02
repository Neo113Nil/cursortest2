package com.squareup.cash.wallet.views;

import android.app.ActivityManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RevolvingInteractiveCardsKt$rotateCards$1 extends ContinuationImpl {
    public CardNuxState L$0;
    public List L$1;
    public ActivityManager L$2;
    public CardRegistry L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RevolvingInteractiveCardsKt.rotateCards(null, null, null, null, this);
    }
}
