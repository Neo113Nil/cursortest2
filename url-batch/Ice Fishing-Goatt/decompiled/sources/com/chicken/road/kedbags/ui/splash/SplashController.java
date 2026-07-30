package com.chicken.road.kedbags.ui.splash;

import com.chicken.road.kedbags.data.device.FrostSignalCollector;
import com.chicken.road.kedbags.data.model.FrostCatchSnapshot;
import com.chicken.road.kedbags.data.repository.SplashRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SplashController.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\"\u001a\u00020\u0013J\u0006\u0010#\u001a\u00020\u0013J\u0006\u0010$\u001a\u00020\u0013J\b\u0010%\u001a\u00020\u0013H\u0002J\u0016\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/chicken/road/kedbags/ui/splash/SplashController;", "", "repository", "Lcom/chicken/road/kedbags/data/repository/SplashRepository;", "signalCollector", "Lcom/chicken/road/kedbags/data/device/FrostSignalCollector;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/chicken/road/kedbags/data/repository/SplashRepository;Lcom/chicken/road/kedbags/data/device/FrostSignalCollector;Lkotlinx/coroutines/CoroutineScope;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/chicken/road/kedbags/ui/splash/SplashUiState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "_navigateHome", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "navigateHome", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigateHome", "()Lkotlinx/coroutines/flow/SharedFlow;", "_openOffer", "", "openOffer", "getOpenOffer", "isRouted", "", "bypassCache", "bootstrapJob", "Lkotlinx/coroutines/Job;", "started", "start", "onBackPressed", "retry", "launchBootstrap", "route", "snapshot", "Lcom/chicken/road/kedbags/data/model/FrostCatchSnapshot;", "(Lcom/chicken/road/kedbags/data/model/FrostCatchSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SplashController {
    public static final int $stable = 8;
    private final MutableSharedFlow<Unit> _navigateHome;
    private final MutableSharedFlow<String> _openOffer;
    private final MutableStateFlow<SplashUiState> _state;
    private Job bootstrapJob;
    private boolean bypassCache;
    private boolean isRouted;
    private final SharedFlow<Unit> navigateHome;
    private final SharedFlow<String> openOffer;
    private final SplashRepository repository;
    private final CoroutineScope scope;
    private final FrostSignalCollector signalCollector;
    private boolean started;
    private final StateFlow<SplashUiState> state;

    public SplashController(SplashRepository repository, FrostSignalCollector signalCollector, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(signalCollector, "signalCollector");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.repository = repository;
        this.signalCollector = signalCollector;
        this.scope = scope;
        MutableStateFlow<SplashUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new SplashUiState(false, false, 3, null));
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._navigateHome = MutableSharedFlow$default;
        this.navigateHome = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<String> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._openOffer = MutableSharedFlow$default2;
        this.openOffer = FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    public final StateFlow<SplashUiState> getState() {
        return this.state;
    }

    public final SharedFlow<Unit> getNavigateHome() {
        return this.navigateHome;
    }

    public final SharedFlow<String> getOpenOffer() {
        return this.openOffer;
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        launchBootstrap();
    }

    public final void onBackPressed() {
        if (this.isRouted) {
            return;
        }
        Job job = this.bootstrapJob;
        if (job == null || !job.isActive()) {
            if (this._state.getValue().getError() || this._state.getValue().getLoading()) {
                retry();
            }
        }
    }

    public final void retry() {
        if (this.isRouted) {
            return;
        }
        Job job = this.bootstrapJob;
        if (job == null || !job.isActive()) {
            this.bypassCache = true;
            this._state.setValue(new SplashUiState(true, false));
            launchBootstrap();
        }
    }

    private final void launchBootstrap() {
        Job launch$default;
        Job job = this.bootstrapJob;
        if (job == null || !job.isActive()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SplashController$launchBootstrap$1(this, null), 3, null);
            this.bootstrapJob = launch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object route(FrostCatchSnapshot frostCatchSnapshot, Continuation<? super Unit> continuation) {
        this.isRouted = true;
        this.bypassCache = false;
        if (frostCatchSnapshot.opensOfferTab()) {
            Object emit = this._openOffer.emit(frostCatchSnapshot.getLureStyle(), continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
        }
        this._state.setValue(new SplashUiState(false, false));
        Object emit2 = this._navigateHome.emit(Unit.INSTANCE, continuation);
        return emit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : Unit.INSTANCE;
    }
}
