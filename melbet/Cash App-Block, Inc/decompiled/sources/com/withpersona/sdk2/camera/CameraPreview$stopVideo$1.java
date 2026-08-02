package com.withpersona.sdk2.camera;

import io.noties.markwon.MarkwonConfiguration;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CameraPreview$stopVideo$1 extends ContinuationImpl {
    public MarkwonConfiguration L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CameraPreview this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreview$stopVideo$1(CameraPreview cameraPreview, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cameraPreview;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4086stopVideoIoAF18A = this.this$0.m4086stopVideoIoAF18A(this);
        return m4086stopVideoIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4086stopVideoIoAF18A : new Result(m4086stopVideoIoAF18A);
    }
}
