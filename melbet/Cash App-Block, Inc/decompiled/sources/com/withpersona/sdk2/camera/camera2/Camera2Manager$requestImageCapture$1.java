package com.withpersona.sdk2.camera.camera2;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class Camera2Manager$requestImageCapture$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Camera2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2Manager$requestImageCapture$1(Camera2Manager camera2Manager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = camera2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4090requestImageCaptureIoAF18A = this.this$0.m4090requestImageCaptureIoAF18A(this);
        return m4090requestImageCaptureIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4090requestImageCaptureIoAF18A : new Result(m4090requestImageCaptureIoAF18A);
    }
}
