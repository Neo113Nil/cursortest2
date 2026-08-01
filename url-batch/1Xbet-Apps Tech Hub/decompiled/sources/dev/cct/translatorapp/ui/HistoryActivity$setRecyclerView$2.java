package dev.cct.translatorapp.ui;

import androidx.recyclerview.widget.RecyclerView;
import dev.cct.translatorapp.adapter.HistoryAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HistoryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HistoryActivity$setRecyclerView$2", f = "HistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryActivity$setRecyclerView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HistoryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryActivity$setRecyclerView$2(HistoryActivity historyActivity, Continuation<? super HistoryActivity$setRecyclerView$2> continuation) {
        super(2, continuation);
        this.this$0 = historyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryActivity$setRecyclerView$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryActivity$setRecyclerView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryAdapter historyAdapter;
        ArrayList arrayList;
        HistoryAdapter historyAdapter2;
        ArrayList arrayList2;
        RecyclerView recyclerView;
        HistoryAdapter historyAdapter3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            historyAdapter = this.this$0.adapter;
            if (historyAdapter == null) {
                this.this$0.adapter = new HistoryAdapter(this.this$0);
                recyclerView = this.this$0.recyclerView;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView = null;
                }
                historyAdapter3 = this.this$0.adapter;
                recyclerView.setAdapter(historyAdapter3);
            }
            arrayList = this.this$0.allHistory;
            if (arrayList.isEmpty()) {
                this.this$0.getBinding().deleteHistoryIcon.setVisibility(4);
                this.this$0.getBinding().noHistoryLayout.setVisibility(0);
            }
            historyAdapter2 = this.this$0.adapter;
            if (historyAdapter2 == null) {
                return null;
            }
            arrayList2 = this.this$0.allHistory;
            historyAdapter2.loadAdapter(arrayList2);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
