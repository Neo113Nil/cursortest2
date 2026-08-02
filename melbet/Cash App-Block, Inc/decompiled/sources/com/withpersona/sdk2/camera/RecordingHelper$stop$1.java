package com.withpersona.sdk2.camera;

import com.squareup.scannerview.TextSetter;
import java.io.File;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RecordingHelper$stop$1 extends ContinuationImpl {
    public TextSetter L$0;
    public File L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextSetter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingHelper$stop$1(TextSetter textSetter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textSetter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Serializable m3983stopIoAF18A = this.this$0.m3983stopIoAF18A(this);
        return m3983stopIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m3983stopIoAF18A : new Result(m3983stopIoAF18A);
    }
}
