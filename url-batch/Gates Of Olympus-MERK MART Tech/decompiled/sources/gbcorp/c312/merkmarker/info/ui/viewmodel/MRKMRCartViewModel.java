package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRCartItemUiState;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MRKMRCartViewModel.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001e"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRCartViewModel;", "Landroidx/lifecycle/ViewModel;", "cartRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;", "productRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;)V", "_cartItemsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRCartItemUiState;", "cartItemsState", "Lkotlinx/coroutines/flow/StateFlow;", "getCartItemsState", "()Lkotlinx/coroutines/flow/StateFlow;", "_totalPrice", "", "totalPrice", "getTotalPrice", "observeCartItems", "", "incrementProductInCart", "productId", "", "deleteFromCart", "decrementItemInCart", "calculateTotalPrice", FirebaseAnalytics.Param.ITEMS, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRCartViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<MRKMRDataUiState<List<MRKMRCartItemUiState>>> _cartItemsState;
    private final MutableStateFlow<Double> _totalPrice;
    private final MRKMRCartRepository cartRepository;
    private final MRKMRProductRepository productRepository;

    public MRKMRCartViewModel(MRKMRCartRepository cartRepository, MRKMRProductRepository productRepository) {
        Intrinsics.checkNotNullParameter(cartRepository, "cartRepository");
        Intrinsics.checkNotNullParameter(productRepository, "productRepository");
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this._cartItemsState = StateFlowKt.MutableStateFlow(MRKMRDataUiState.Initial.INSTANCE);
        this._totalPrice = StateFlowKt.MutableStateFlow(Double.valueOf(0.0d));
        observeCartItems();
    }

    public final StateFlow<MRKMRDataUiState<List<MRKMRCartItemUiState>>> getCartItemsState() {
        return FlowKt.asStateFlow(this._cartItemsState);
    }

    public final StateFlow<Double> getTotalPrice() {
        return FlowKt.asStateFlow(this._totalPrice);
    }

    private final void observeCartItems() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRCartViewModel$observeCartItems$1(this, null), 3, null);
    }

    public final void incrementProductInCart(int productId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRCartViewModel$incrementProductInCart$1(this, productId, null), 3, null);
    }

    public final void deleteFromCart(int productId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRCartViewModel$deleteFromCart$1(this, productId, null), 3, null);
    }

    public final void decrementItemInCart(int productId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRCartViewModel$decrementItemInCart$1(this, productId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double calculateTotalPrice(List<MRKMRCartItemUiState> items) {
        Iterator<T> it = items.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((MRKMRCartItemUiState) it.next()).getProductPrice() * r7.getQuantity();
        }
        return d;
    }
}
