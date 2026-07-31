package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MRKMRAppViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRAppViewModel;", "Landroidx/lifecycle/ViewModel;", "cartRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;)V", "_cartPopulatedState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "cartPopulatedState", "Lkotlinx/coroutines/flow/StateFlow;", "getCartPopulatedState", "()Lkotlinx/coroutines/flow/StateFlow;", "_itemsInCartState", "", "itemsInCartState", "getItemsInCartState", "observeCart", "clearCart", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRAppViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<MRKMRDataUiState<Unit>> _cartPopulatedState;
    private final MutableStateFlow<Integer> _itemsInCartState;
    private final MRKMRCartRepository cartRepository;

    public MRKMRAppViewModel(MRKMRCartRepository cartRepository) {
        Intrinsics.checkNotNullParameter(cartRepository, "cartRepository");
        this.cartRepository = cartRepository;
        this._cartPopulatedState = StateFlowKt.MutableStateFlow(MRKMRDataUiState.Initial.INSTANCE);
        this._itemsInCartState = StateFlowKt.MutableStateFlow(0);
        observeCart();
    }

    public final StateFlow<MRKMRDataUiState<Unit>> getCartPopulatedState() {
        return FlowKt.asStateFlow(this._cartPopulatedState);
    }

    public final StateFlow<Integer> getItemsInCartState() {
        return FlowKt.asStateFlow(this._itemsInCartState);
    }

    private final void observeCart() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRAppViewModel$observeCart$1(this, null), 3, null);
    }

    public final void clearCart() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRAppViewModel$clearCart$1(this, null), 3, null);
    }
}
