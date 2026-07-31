package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.merkmarker.info.data.repository.MRKMROnboardingRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MRKMROnboardingVM.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMROnboardingVM;", "Landroidx/lifecycle/ViewModel;", "onboardingRepository", "Lgbcorp/c312/merkmarker/info/data/repository/MRKMROnboardingRepo;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/MRKMROnboardingRepo;)V", "_onboardingSetState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onboardingSetState", "Lkotlinx/coroutines/flow/StateFlow;", "getOnboardingSetState", "()Lkotlinx/coroutines/flow/StateFlow;", "setOnboarded", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMROnboardingVM extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _onboardingSetState;
    private final MRKMROnboardingRepo onboardingRepository;

    public MRKMROnboardingVM(MRKMROnboardingRepo onboardingRepository) {
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.onboardingRepository = onboardingRepository;
        this._onboardingSetState = StateFlowKt.MutableStateFlow(false);
    }

    public final StateFlow<Boolean> getOnboardingSetState() {
        return FlowKt.asStateFlow(this._onboardingSetState);
    }

    public final void setOnboarded() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MRKMROnboardingVM$setOnboarded$1(this, null), 3, null);
    }
}
