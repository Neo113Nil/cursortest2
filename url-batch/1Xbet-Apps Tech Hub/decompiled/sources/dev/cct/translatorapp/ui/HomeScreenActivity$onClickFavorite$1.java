package dev.cct.translatorapp.ui;

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

/* compiled from: HomeScreenActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$onClickFavorite$1", f = "HomeScreenActivity.kt", i = {0, 1}, l = {868, 880, 892}, m = "invokeSuspend", n = {"result", "result"}, s = {"I$0", "I$0"})
/* loaded from: classes3.dex */
final class HomeScreenActivity$onClickFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HistoryModel $itemsViewModel;
    final /* synthetic */ int $position;
    int I$0;
    int label;
    final /* synthetic */ HomeScreenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenActivity$onClickFavorite$1(HomeScreenActivity homeScreenActivity, HistoryModel historyModel, int i, Continuation<? super HomeScreenActivity$onClickFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = homeScreenActivity;
        this.$itemsViewModel = historyModel;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenActivity$onClickFavorite$1(this.this$0, this.$itemsViewModel, this.$position, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenActivity$onClickFavorite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: HomeScreenActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$onClickFavorite$1$1", f = "HomeScreenActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.cct.translatorapp.ui.HomeScreenActivity$onClickFavorite$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryModel $itemsViewModel;
        final /* synthetic */ int $position;
        int label;
        final /* synthetic */ HomeScreenActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeScreenActivity homeScreenActivity, int i, HistoryModel historyModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = homeScreenActivity;
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.getAdapter().onClickFavorite(this.$position, this.$itemsViewModel);
            return Unit.INSTANCE;
        }
    }
}
