package gbcorp.c312.merkmarker.info.ui.viewmodel;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.gtsly.NativeLib;
import gbcorp.c312.merkmarker.info.util.GTSLYNetworkMonitor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GTSLYDetailsScreenViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0015"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/GTSLYDetailsScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "networkMonitor", "Lgbcorp/c312/merkmarker/info/util/GTSLYNetworkMonitor;", "<init>", "(Lgbcorp/c312/merkmarker/info/util/GTSLYNetworkMonitor;)V", "_connectionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "connectionState", "Lkotlinx/coroutines/flow/StateFlow;", "getConnectionState", "()Lkotlinx/coroutines/flow/StateFlow;", "_gtslyDetailsState", "Ljava/lang/reflect/Method;", "gtslyDetailsState", "getGtslyDetailsState", "updateGTSLYDetails", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYDetailsScreenViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _connectionState;
    private final MutableStateFlow<Method> _gtslyDetailsState;
    private final StateFlow<Boolean> connectionState;
    private final GTSLYNetworkMonitor networkMonitor;

    public GTSLYDetailsScreenViewModel(GTSLYNetworkMonitor networkMonitor) {
        Intrinsics.checkNotNullParameter(networkMonitor, "networkMonitor");
        this.networkMonitor = networkMonitor;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(networkMonitor.checkValidated()));
        this._connectionState = MutableStateFlow;
        this.connectionState = MutableStateFlow;
        this._gtslyDetailsState = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final StateFlow<Boolean> getConnectionState() {
        return this.connectionState;
    }

    public final StateFlow<Method> getGtslyDetailsState() {
        return FlowKt.asStateFlow(this._gtslyDetailsState);
    }

    /* compiled from: GTSLYDetailsScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYDetailsScreenViewModel$1", f = "GTSLYDetailsScreenViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, nl = {30}, s = {}, v = 2)
    /* renamed from: gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYDetailsScreenViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GTSLYDetailsScreenViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> isConnected = GTSLYDetailsScreenViewModel.this.networkMonitor.isConnected();
                final GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel = GTSLYDetailsScreenViewModel.this;
                this.label = 1;
                if (isConnected.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYDetailsScreenViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        GTSLYDetailsScreenViewModel.this._connectionState.setValue(Boxing.boxBoolean(z));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateGTSLYDetails(Context context) {
        Method value;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Method loadDynamicScreen = new NativeLib().loadDynamicScreen(context);
            MutableStateFlow<Method> mutableStateFlow = this._gtslyDetailsState;
            do {
                value = mutableStateFlow.getValue();
                Method method = value;
            } while (!mutableStateFlow.compareAndSet(value, loadDynamicScreen));
        } catch (Exception unused) {
        }
    }
}
