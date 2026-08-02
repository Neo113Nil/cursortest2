package com.squareup.cash.wallet.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealCardAppletTileRepository$lastViewedHeroTag$1 extends ContinuationImpl {
    public int I$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCardAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCardAppletTileRepository$lastViewedHeroTag$1(RealCardAppletTileRepository realCardAppletTileRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCardAppletTileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.lastViewedHeroTag(this);
    }
}
