package com.stripe.android.financialconnections.navigation.bottomsheet;

import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1 extends ContinuationImpl {
    public int I$0;
    public List L$2;
    public FlowCollector L$3;
    public Throwable L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TakeUntil$collectSafely$2.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1(TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
