package com.withpersona.sdk2.camera.camera2;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class Camera2Controller$takePicture$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Camera2Controller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2Controller$takePicture$1(Camera2Controller camera2Controller, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = camera2Controller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object mo4085takePictureIoAF18A = this.this$0.mo4085takePictureIoAF18A(this);
        return mo4085takePictureIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4085takePictureIoAF18A : new Result(mo4085takePictureIoAF18A);
    }
}
