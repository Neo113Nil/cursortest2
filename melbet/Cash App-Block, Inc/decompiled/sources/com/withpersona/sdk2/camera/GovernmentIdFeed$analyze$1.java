package com.withpersona.sdk2.camera;

import android.graphics.Rect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class GovernmentIdFeed$analyze$1 extends ContinuationImpl {
    public ImageToAnalyzeKt$toImageToAnalyze$1 L$0;
    public List L$1;
    public Rect L$2;
    public Iterator L$3;
    public Collection L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GovernmentIdFeed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$1(GovernmentIdFeed governmentIdFeed, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = governmentIdFeed;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4088access$analyzegIAlus = GovernmentIdFeed.m4088access$analyzegIAlus(this.this$0, null, this);
        return m4088access$analyzegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4088access$analyzegIAlus : new Result(m4088access$analyzegIAlus);
    }
}
