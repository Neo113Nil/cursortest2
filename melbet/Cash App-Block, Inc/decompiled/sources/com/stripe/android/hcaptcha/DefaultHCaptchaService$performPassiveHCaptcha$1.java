package com.stripe.android.hcaptcha;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultHCaptchaService$performPassiveHCaptcha$1 extends ContinuationImpl {
    public String L$1;
    public HCaptchaService$Result L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultHCaptchaService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHCaptchaService$performPassiveHCaptcha$1(DefaultHCaptchaService defaultHCaptchaService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultHCaptchaService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performPassiveHCaptcha(null, null, null, null, this);
    }
}
