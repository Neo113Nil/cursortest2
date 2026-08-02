package com.stripe.android.core.networking;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.full.KClasses$$Lambda$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RequestExecutorKt$executeRequestWithModelJsonParser$1 extends ContinuationImpl {
    public KClasses$$Lambda$1 L$1;
    public ApiRequest L$2;
    public ModelJsonParser L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return JsonUtilsKt.executeRequestWithModelJsonParser(null, null, null, null, this);
    }
}
