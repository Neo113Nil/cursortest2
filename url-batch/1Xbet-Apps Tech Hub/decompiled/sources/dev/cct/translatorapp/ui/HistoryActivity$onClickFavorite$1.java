package dev.cct.translatorapp.ui;

import dev.cct.translatorapp.adapter.HistoryAdapter;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.objectweb.asm.Opcodes;

/* compiled from: HistoryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HistoryActivity$onClickFavorite$1", f = "HistoryActivity.kt", i = {0, 1}, l = {Opcodes.INVOKESTATIC, 196, 208}, m = "invokeSuspend", n = {"result", "result"}, s = {"I$0", "I$0"})
/* loaded from: classes3.dex */
final class HistoryActivity$onClickFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HistoryModel $itemsViewModel;
    final /* synthetic */ int $position;
    int I$0;
    int label;
    final /* synthetic */ HistoryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryActivity$onClickFavorite$1(HistoryActivity historyActivity, HistoryModel historyModel, int i, Continuation<? super HistoryActivity$onClickFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = historyActivity;
        this.$itemsViewModel = historyModel;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryActivity$onClickFavorite$1(this.this$0, this.$itemsViewModel, this.$position, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryActivity$onClickFavorite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel historyViewModel;
        int updateFavorite;
        HistoryViewModel historyViewModel2;
        HistoryViewModel historyViewModel3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            historyViewModel = this.this$0.getHistoryViewModel();
            updateFavorite = historyViewModel.updateFavorite(this.$itemsViewModel);
            if (this.$itemsViewModel.isFavorite()) {
                historyViewModel3 = this.this$0.getHistoryViewModel();
                this.I$0 = updateFavorite;
                this.label = 1;
                if (historyViewModel3.addToFavorite(new FavoriteModel(this.$itemsViewModel.getId(), this.$itemsViewModel.getILangC(), this.$itemsViewModel.getOLangC(), this.$itemsViewModel.getInput(), this.$itemsViewModel.getOutput(), this.$itemsViewModel.isFavorite(), this.$itemsViewModel.isSelected()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                historyViewModel2 = this.this$0.getHistoryViewModel();
                this.I$0 = updateFavorite;
                this.label = 2;
                if (historyViewModel2.removeFromFavorite(new FavoriteModel(this.$itemsViewModel.getId(), this.$itemsViewModel.getILangC(), this.$itemsViewModel.getOLangC(), this.$itemsViewModel.getInput(), this.$itemsViewModel.getOutput(), this.$itemsViewModel.isFavorite(), this.$itemsViewModel.isSelected()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            updateFavorite = this.I$0;
            ResultKt.throwOnFailure(obj);
        }
        if (updateFavorite > 0) {
            this.label = 3;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, this.$position, this.$itemsViewModel, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HistoryActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "dev.cct.translatorapp.ui.HistoryActivity$onClickFavorite$1$1", f = "HistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.cct.translatorapp.ui.HistoryActivity$onClickFavorite$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryModel $itemsViewModel;
        final /* synthetic */ int $position;
        int label;
        final /* synthetic */ HistoryActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HistoryActivity historyActivity, int i, HistoryModel historyModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = historyActivity;
            this.$position = i;
            this.$itemsViewModel = historyModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$position, this.$itemsViewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HistoryAdapter historyAdapter;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                historyAdapter = this.this$0.adapter;
                if (historyAdapter == null) {
                    return null;
                }
                historyAdapter.onClickFavorite(this.$position, this.$itemsViewModel);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
