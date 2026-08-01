package dev.cct.translatorapp.ui;

import dev.cct.translatorapp.adapter.FavoriteAdapter;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FavoriteActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.FavoriteActivity$onClickFavorite$1", f = "FavoriteActivity.kt", i = {}, l = {106, 117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FavoriteActivity$onClickFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HistoryModel $itemsViewModel;
    int label;
    final /* synthetic */ FavoriteActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteActivity$onClickFavorite$1(FavoriteActivity favoriteActivity, HistoryModel historyModel, Continuation<? super FavoriteActivity$onClickFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = favoriteActivity;
        this.$itemsViewModel = historyModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteActivity$onClickFavorite$1(this.this$0, this.$itemsViewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FavoriteActivity$onClickFavorite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel historyViewModel;
        HistoryViewModel historyViewModel2;
        HistoryViewModel historyViewModel3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            historyViewModel = this.this$0.getHistoryViewModel();
            historyViewModel.updateFavorite(this.$itemsViewModel);
            historyViewModel2 = this.this$0.getHistoryViewModel();
            this.label = 1;
            if (historyViewModel2.removeFromFavorite(new FavoriteModel(this.$itemsViewModel.getId(), this.$itemsViewModel.getILangC(), this.$itemsViewModel.getOLangC(), this.$itemsViewModel.getInput(), this.$itemsViewModel.getOutput(), this.$itemsViewModel.isFavorite(), this.$itemsViewModel.isSelected()), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        historyViewModel3 = this.this$0.getHistoryViewModel();
        List<FavoriteModel> favorites = historyViewModel3.getFavorites();
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, favorites, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FavoriteActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "dev.cct.translatorapp.ui.FavoriteActivity$onClickFavorite$1$1", f = "FavoriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.cct.translatorapp.ui.FavoriteActivity$onClickFavorite$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<FavoriteModel> $list;
        int label;
        final /* synthetic */ FavoriteActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FavoriteActivity favoriteActivity, List<FavoriteModel> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = favoriteActivity;
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$list, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FavoriteAdapter favoriteAdapter;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                favoriteAdapter = this.this$0.adapter;
                if (favoriteAdapter != null) {
                    List<FavoriteModel> list = this.$list;
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.FavoriteModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.FavoriteModel> }");
                    favoriteAdapter.setData((ArrayList) list);
                }
                if (this.$list.isEmpty()) {
                    this.this$0.getBinding().noFavoriteLayout.setVisibility(0);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
