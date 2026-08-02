package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class FrontOrBackAnalyzer$analyze$1 extends ContinuationImpl {
    public ImageToAnalyzeKt$toImageToAnalyze$1 L$0;
    public Rect L$1;
    public Ref$ObjectRef L$2;
    public Iterator L$3;
    public ParsedIdSideOrNone.Side L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FrontOrBackAnalyzer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrontOrBackAnalyzer$analyze$1(FrontOrBackAnalyzer frontOrBackAnalyzer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = frontOrBackAnalyzer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object mo4089analyze0E7RQCE = this.this$0.mo4089analyze0E7RQCE(null, null, this);
        return mo4089analyze0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4089analyze0E7RQCE : new Result(mo4089analyze0E7RQCE);
    }
}
