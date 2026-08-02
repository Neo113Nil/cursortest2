package com.withpersona.sdk2.camera;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CameraPreview$takePicture$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CameraPreview this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreview$takePicture$1(CameraPreview cameraPreview, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cameraPreview;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4087takePicturegIAlus = this.this$0.m4087takePicturegIAlus(null, this);
        return m4087takePicturegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4087takePicturegIAlus : new Result(m4087takePicturegIAlus);
    }
}
