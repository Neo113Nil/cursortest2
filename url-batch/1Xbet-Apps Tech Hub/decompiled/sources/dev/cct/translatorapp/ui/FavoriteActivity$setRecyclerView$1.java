package dev.cct.translatorapp.ui;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import dev.cct.translatorapp.adapter.FavoriteAdapter;
import dev.cct.translatorapp.dataModel.FavoriteModel;
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

/* compiled from: FavoriteActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.FavoriteActivity$setRecyclerView$1", f = "FavoriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FavoriteActivity$setRecyclerView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FavoriteActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteActivity$setRecyclerView$1(FavoriteActivity favoriteActivity, Continuation<? super FavoriteActivity$setRecyclerView$1> continuation) {
        super(2, continuation);
        this.this$0 = favoriteActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteActivity$setRecyclerView$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FavoriteActivity$setRecyclerView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel historyViewModel;
        FavoriteAdapter favoriteAdapter;
        FavoriteAdapter favoriteAdapter2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                historyViewModel = this.this$0.getHistoryViewModel();
                List<FavoriteModel> favorites = historyViewModel.getFavorites();
                Log.d("TAG", "initListeners: favorite list=" + favorites);
                this.this$0.adapter = new FavoriteAdapter(this.this$0);
                RecyclerView recyclerView = this.this$0.getRecyclerView();
                favoriteAdapter = this.this$0.adapter;
                recyclerView.setAdapter(favoriteAdapter);
                favoriteAdapter2 = this.this$0.adapter;
                if (favoriteAdapter2 != null) {
                    Intrinsics.checkNotNull(favorites, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.FavoriteModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.FavoriteModel> }");
                    favoriteAdapter2.setData((ArrayList) favorites);
                }
                if (favorites.isEmpty()) {
                    this.this$0.getBinding().noFavoriteLayout.setVisibility(0);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
