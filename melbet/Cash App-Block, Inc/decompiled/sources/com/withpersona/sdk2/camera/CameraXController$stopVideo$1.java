package com.withpersona.sdk2.camera;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CameraXController$stopVideo$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CameraXController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraXController$stopVideo$1(CameraXController cameraXController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cameraXController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object mo4084stopVideoIoAF18A = this.this$0.mo4084stopVideoIoAF18A(this);
        return mo4084stopVideoIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4084stopVideoIoAF18A : new Result(mo4084stopVideoIoAF18A);
    }
}
