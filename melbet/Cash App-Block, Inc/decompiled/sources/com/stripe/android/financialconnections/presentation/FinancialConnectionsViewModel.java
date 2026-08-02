package com.stripe.android.financialconnections.presentation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsViewModel extends ViewModel {
    public final StateFlowImpl _stateFlow;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final ReadonlyStateFlow stateFlow;

    public FinancialConnectionsViewModel(Object obj, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        nativeAuthFlowCoordinator.getClass();
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(obj);
        this._stateFlow = MutableStateFlow;
        this.stateFlow = FlowKt.asStateFlow(MutableStateFlow);
        Continuation continuation = null;
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ShimmerModifierKt$shimmer$1$1(this, obj, continuation, 13), 3);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ExoPlayerVideoView.AnonymousClass2(this, continuation, 29), 3);
    }

    public static StandaloneCoroutine execute$default(FinancialConnectionsViewModel financialConnectionsViewModel, Function1 function1, Function2 function2) {
        financialConnectionsViewModel.getClass();
        return JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsViewModel), null, null, new WorkflowLayout$start$1(financialConnectionsViewModel, function2, (Object) null, function1, (Continuation) null, 27), 3);
    }

    public static void onAsync$default(FinancialConnectionsViewModel financialConnectionsViewModel, KProperty1 kProperty1, Function2 function2, Function2 function22, int i) {
        Continuation continuation = null;
        int i2 = 2;
        if ((i & 2) != 0) {
            function2 = new CachedPagingDataKt$cachedIn$4(i2, continuation, 13);
        }
        if ((i & 4) != 0) {
            function22 = new CachedPagingDataKt$cachedIn$4(i2, continuation, 14);
        }
        financialConnectionsViewModel.onAsync(kProperty1, function2, function22);
    }

    public final void onAsync(KProperty1 kProperty1, Function2 function2, Function2 function22) {
        kProperty1.getClass();
        function2.getClass();
        function22.getClass();
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FlowKt__LimitKt$transformWhile$1(this, kProperty1, function2, function22, null, 1), 3);
    }

    public final void setState(Function1 function1) {
        StateFlowImpl stateFlowImpl;
        Object value;
        function1.getClass();
        do {
            stateFlowImpl = this._stateFlow;
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.compareAndSet(value, function1.invoke(value)));
    }

    public abstract TopAppBarStateUpdate updateTopAppBar(Object obj);

    public final void withState(Function1 function1) {
        function1.invoke(this.stateFlow.$$delegate_0.getValue());
    }
}
