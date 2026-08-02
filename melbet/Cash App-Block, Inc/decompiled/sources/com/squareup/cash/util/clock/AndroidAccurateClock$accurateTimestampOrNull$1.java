package com.squareup.cash.util.clock;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class AndroidAccurateClock$accurateTimestampOrNull$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidAccurateClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAccurateClock$accurateTimestampOrNull$1(AndroidAccurateClock androidAccurateClock, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidAccurateClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m3789accurateTimestampOrNull_x8W85U(this);
    }
}
