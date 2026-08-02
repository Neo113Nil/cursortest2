package com.withpersona.sdk2.inquiry.shared.image;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealImageHelper$resizeAndCompressImageInPlace$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealImageHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageHelper$resizeAndCompressImageInPlace$1(RealImageHelper realImageHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realImageHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4103resizeAndCompressImageInPlacegIAlus = this.this$0.m4103resizeAndCompressImageInPlacegIAlus(null, this);
        return m4103resizeAndCompressImageInPlacegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4103resizeAndCompressImageInPlacegIAlus : new Result(m4103resizeAndCompressImageInPlacegIAlus);
    }
}
