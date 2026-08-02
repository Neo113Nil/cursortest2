package com.withpersona.sdk2.camera.camera2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class Camera2Manager$start$initializeCameraAndSetState$1 extends ContinuationImpl {
    public Camera2Manager L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return Camera2Manager.access$start$initializeCameraAndSetState(null, this);
    }
}
