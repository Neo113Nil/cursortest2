package com.squareup.cash.treehouse.sqldelight;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class AndroidSqlDelightBridge$executeQuery$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public String L$0;
    public List L$1;
    public Semaphore L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidSqlDelightBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSqlDelightBridge$executeQuery$1(AndroidSqlDelightBridge androidSqlDelightBridge, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidSqlDelightBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.executeQuery(null, null, 0, this);
    }
}
