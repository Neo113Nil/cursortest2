package com.withpersona.sdk2.camera.camera2;

import io.noties.markwon.LinkResolverDef;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class CameraCaptureSessionWrapper$Companion$create$1 extends ContinuationImpl {
    public CameraCaptureSessionWrapper L$0;
    public CameraCaptureSessionWrapper L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LinkResolverDef this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraCaptureSessionWrapper$Companion$create$1(LinkResolverDef linkResolverDef, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = linkResolverDef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.create(null, null, null, null, null, this);
    }
}
