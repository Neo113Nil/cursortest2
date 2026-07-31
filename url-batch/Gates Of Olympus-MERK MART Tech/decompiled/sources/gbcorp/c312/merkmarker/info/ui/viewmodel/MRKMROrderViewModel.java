package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROrderRepository;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MRKMROrderViewModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMROrderViewModel;", "Landroidx/lifecycle/ViewModel;", "orderRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMROrderRepository;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/MRKMROrderRepository;)V", "_ordersState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "ordersState", "Lkotlinx/coroutines/flow/StateFlow;", "getOrdersState", "()Lkotlinx/coroutines/flow/StateFlow;", "observeOrders", "", "deleteOrder", "orderNumber", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMROrderViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<MRKMRDataUiState<List<MRKMROrderEntity>>> _ordersState;
    private final MRKMROrderRepository orderRepository;

    public MRKMROrderViewModel(MRKMROrderRepository orderRepository) {
        Intrinsics.checkNotNullParameter(orderRepository, "orderRepository");
        this.orderRepository = orderRepository;
        this._ordersState = StateFlowKt.MutableStateFlow(MRKMRDataUiState.Initial.INSTANCE);
        observeOrders();
    }

    public final StateFlow<MRKMRDataUiState<List<MRKMROrderEntity>>> getOrdersState() {
        return FlowKt.asStateFlow(this._ordersState);
    }

    private final void observeOrders() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMROrderViewModel$observeOrders$1(this, null), 3, null);
    }

    public final void deleteOrder(String orderNumber) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMROrderViewModel$deleteOrder$1(this, orderNumber, null), 3, null);
    }
}
