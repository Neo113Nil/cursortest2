package com.squareup.cash.work.applets.presenters;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShiftsTileDataLoader$resolveShiftState$1 extends ContinuationImpl {
    public ArrayList L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShiftsTileDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftsTileDataLoader$resolveShiftState$1(RealShiftsTileDataLoader realShiftsTileDataLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShiftsTileDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.resolveShiftState(null, this);
    }
}
