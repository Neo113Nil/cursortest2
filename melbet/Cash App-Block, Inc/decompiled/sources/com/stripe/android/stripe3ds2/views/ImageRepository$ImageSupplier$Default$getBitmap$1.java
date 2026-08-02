package com.stripe.android.stripe3ds2.views;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ImageRepository$ImageSupplier$Default$getBitmap$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ImageRepository$ImageSupplier$Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRepository$ImageSupplier$Default$getBitmap$1(ImageRepository$ImageSupplier$Default imageRepository$ImageSupplier$Default, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = imageRepository$ImageSupplier$Default;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getBitmap(null, this);
    }
}
