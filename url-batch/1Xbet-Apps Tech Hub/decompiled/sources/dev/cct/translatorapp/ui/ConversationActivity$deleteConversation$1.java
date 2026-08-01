package dev.cct.translatorapp.ui;

import android.app.Dialog;
import dev.cct.translatorapp.adapter.ConversationAdapter;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ConversationActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$deleteConversation$1", f = "ConversationActivity.kt", i = {}, l = {583, 586}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConversationActivity$deleteConversation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dialog $delPressDialog;
    final /* synthetic */ ArrayList<ConversationModel> $toDelete;
    Object L$0;
    int label;
    final /* synthetic */ ConversationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationActivity$deleteConversation$1(ArrayList<ConversationModel> arrayList, ConversationActivity conversationActivity, Dialog dialog, Continuation<? super ConversationActivity$deleteConversation$1> continuation) {
        super(2, continuation);
        this.$toDelete = arrayList;
        this.this$0 = conversationActivity;
        this.$delPressDialog = dialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationActivity$deleteConversation$1(this.$toDelete, this.this$0, this.$delPressDialog, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationActivity$deleteConversation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator<ConversationModel> it;
        HistoryViewModel historyViewModel;
        HistoryViewModel historyViewModel2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$toDelete.iterator();
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            it = (Iterator) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            ConversationModel i2 = it.next();
            historyViewModel2 = this.this$0.getHistoryViewModel();
            Intrinsics.checkNotNullExpressionValue(i2, "i");
            this.L$0 = it;
            this.label = 1;
            if (historyViewModel2.deleteConversation(i2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ConversationActivity conversationActivity = this.this$0;
        historyViewModel = conversationActivity.getHistoryViewModel();
        List<ConversationModel> allConversations = historyViewModel.getAllConversations();
        Intrinsics.checkNotNull(allConversations, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.ConversationModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.ConversationModel> }");
        conversationActivity.allConversations = (ArrayList) allConversations;
        this.L$0 = null;
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, this.$delPressDialog, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ConversationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$deleteConversation$1$1", f = "ConversationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.cct.translatorapp.ui.ConversationActivity$deleteConversation$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $delPressDialog;
        int label;
        final /* synthetic */ ConversationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ConversationActivity conversationActivity, Dialog dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = conversationActivity;
            this.$delPressDialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$delPressDialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList<ConversationModel> arrayList;
            ArrayList arrayList2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConversationAdapter adapter = this.this$0.getAdapter();
            arrayList = this.this$0.allConversations;
            adapter.setData(arrayList);
            this.$delPressDialog.dismiss();
            this.this$0.getBinding().deleteBtn.setVisibility(8);
            this.this$0.getBinding().selectAllLayout.setVisibility(8);
            arrayList2 = this.this$0.allConversations;
            if (arrayList2.isEmpty()) {
                this.this$0.getBinding().deleteIcon.setVisibility(4);
                this.this$0.getBinding().conversation.setVisibility(0);
            } else {
                this.this$0.getBinding().deleteIcon.setVisibility(4);
            }
            return Unit.INSTANCE;
        }
    }
}
