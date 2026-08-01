package dev.cct.translatorapp.ui;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HistoryActivity.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HistoryActivity", f = "HistoryActivity.kt", i = {}, l = {117}, m = "setRecyclerView", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryActivity$setRecyclerView$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryActivity$setRecyclerView$1(HistoryActivity historyActivity, Continuation<? super HistoryActivity$setRecyclerView$1> continuation) {
        super(continuation);
        this.this$0 = historyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object recyclerView;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        recyclerView = this.this$0.setRecyclerView(this);
        return recyclerView;
    }
}
