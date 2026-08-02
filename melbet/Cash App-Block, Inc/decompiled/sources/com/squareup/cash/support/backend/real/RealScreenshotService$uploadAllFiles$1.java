package com.squareup.cash.support.backend.real;

import com.stripe.hcaptcha.HCaptcha;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealScreenshotService$uploadAllFiles$1 extends ContinuationImpl {
    public List L$0;
    public List L$1;
    public Iterator L$2;
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HCaptcha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealScreenshotService$uploadAllFiles$1(HCaptcha hCaptcha, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hCaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return HCaptcha.access$uploadAllFiles(this.this$0, null, this);
    }
}
