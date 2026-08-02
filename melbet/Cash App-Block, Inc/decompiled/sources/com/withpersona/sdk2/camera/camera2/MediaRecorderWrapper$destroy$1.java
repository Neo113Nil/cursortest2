package com.withpersona.sdk2.camera.camera2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class MediaRecorderWrapper$destroy$1 extends ContinuationImpl {
    public MutexImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MediaRecorderWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaRecorderWrapper$destroy$1(MediaRecorderWrapper mediaRecorderWrapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mediaRecorderWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.destroy(this);
    }
}
