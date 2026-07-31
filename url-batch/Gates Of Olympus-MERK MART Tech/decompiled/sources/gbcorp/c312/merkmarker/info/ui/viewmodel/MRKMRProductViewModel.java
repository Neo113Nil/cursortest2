package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRCartRepository;
import gbcorp.c312.merkmarker.info.data.repository.MRKMRProductRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MRKMRProductViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRProductViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;", "cartRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;)V", "_productsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "productsState", "Lkotlinx/coroutines/flow/StateFlow;", "getProductsState", "()Lkotlinx/coroutines/flow/StateFlow;", "observeProducts", "", "addToCart", "productId", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRProductViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<MRKMRDataUiState<List<Product>>> _productsState;
    private final MRKMRCartRepository cartRepository;
    private final MRKMRProductRepository productRepository;

    public MRKMRProductViewModel(MRKMRProductRepository productRepository, MRKMRCartRepository cartRepository) {
        Intrinsics.checkNotNullParameter(productRepository, "productRepository");
        Intrinsics.checkNotNullParameter(cartRepository, "cartRepository");
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
        this._productsState = StateFlowKt.MutableStateFlow(MRKMRDataUiState.Initial.INSTANCE);
        observeProducts();
    }

    public final StateFlow<MRKMRDataUiState<List<Product>>> getProductsState() {
        return FlowKt.asStateFlow(this._productsState);
    }

    private final void observeProducts() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRProductViewModel$observeProducts$1(this, null), 3, null);
    }

    public final void addToCart(int productId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMRProductViewModel$addToCart$1(this, productId, null), 3, null);
    }
}
