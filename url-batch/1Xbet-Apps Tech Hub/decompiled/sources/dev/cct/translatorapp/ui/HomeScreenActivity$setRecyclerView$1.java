package dev.cct.translatorapp.ui;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import dev.cct.translatorapp.adapter.HistoryHomeAdapter;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
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

/* compiled from: HomeScreenActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$setRecyclerView$1", f = "HomeScreenActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeScreenActivity$setRecyclerView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeScreenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenActivity$setRecyclerView$1(HomeScreenActivity homeScreenActivity, Continuation<? super HomeScreenActivity$setRecyclerView$1> continuation) {
        super(2, continuation);
        this.this$0 = homeScreenActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenActivity$setRecyclerView$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenActivity$setRecyclerView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel historyViewModel;
        List list;
        RecyclerView recyclerView;
        List<HistoryModel> list2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            HomeScreenActivity homeScreenActivity = this.this$0;
            historyViewModel = homeScreenActivity.getHistoryViewModel();
            homeScreenActivity.allHistory = historyViewModel.getTranslations();
            list = this.this$0.allHistory;
            Log.e("TAG", "setRecyclerView: " + list);
            this.this$0.setAdapter(new HistoryHomeAdapter(this.this$0));
            recyclerView = this.this$0.recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView = null;
            }
            recyclerView.setAdapter(this.this$0.getAdapter());
            HistoryHomeAdapter adapter = this.this$0.getAdapter();
            list2 = this.this$0.allHistory;
            adapter.loadAdapter(list2);
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
