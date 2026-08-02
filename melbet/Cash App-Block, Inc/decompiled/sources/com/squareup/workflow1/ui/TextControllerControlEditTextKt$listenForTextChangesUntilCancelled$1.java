package com.squareup.workflow1.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzna;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        zzna.access$listenForTextChangesUntilCancelled(null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
