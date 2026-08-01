package dev.cct.translatorapp.ui;

import androidx.recyclerview.widget.RecyclerView;
import dev.cct.translatorapp.adapter.ConversationAdapter;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import java.util.ArrayList;
import java.util.List;
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

/* compiled from: ConversationActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$setRecyclerView$1", f = "ConversationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConversationActivity$setRecyclerView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecyclerView $recyclerView;
    int label;
    final /* synthetic */ ConversationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationActivity$setRecyclerView$1(ConversationActivity conversationActivity, RecyclerView recyclerView, Continuation<? super ConversationActivity$setRecyclerView$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationActivity;
        this.$recyclerView = recyclerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationActivity$setRecyclerView$1(this.this$0, this.$recyclerView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationActivity$setRecyclerView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel historyViewModel;
        ArrayList<ConversationModel> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            ConversationActivity conversationActivity = this.this$0;
            historyViewModel = conversationActivity.getHistoryViewModel();
            List<ConversationModel> allConversations = historyViewModel.getAllConversations();
            Intrinsics.checkNotNull(allConversations, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.ConversationModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.ConversationModel> }");
            conversationActivity.allConversations = (ArrayList) allConversations;
            this.$recyclerView.setAdapter(this.this$0.getAdapter());
            ConversationAdapter adapter = this.this$0.getAdapter();
            arrayList = this.this$0.allConversations;
            adapter.setData(arrayList);
            arrayList2 = this.this$0.allConversations;
            if (arrayList2.isEmpty()) {
                this.this$0.getBinding().deleteIcon.setVisibility(4);
                this.this$0.getBinding().conversation.setVisibility(0);
            }
            RecyclerView recyclerView = this.this$0.getBinding().recyclerView;
            arrayList3 = this.this$0.allConversations;
            recyclerView.smoothScrollToPosition(arrayList3.size() - 1);
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
