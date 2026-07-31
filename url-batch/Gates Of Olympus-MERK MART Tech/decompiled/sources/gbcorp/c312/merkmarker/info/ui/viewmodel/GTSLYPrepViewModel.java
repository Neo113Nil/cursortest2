package gbcorp.c312.merkmarker.info.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import gbcorp.c312.merkmarker.info.data.model.GTSLYUrlState;
import gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository;
import gbcorp.c312.merkmarker.info.ui.state.GTSLYPrepState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GTSLYPrepViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/viewmodel/GTSLYPrepViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;)V", "_urlState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "urlState", "Lkotlinx/coroutines/flow/StateFlow;", "getUrlState", "()Lkotlinx/coroutines/flow/StateFlow;", "installRequested", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYPrepViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GTSLYUrlState> _urlState;
    private boolean installRequested;
    private final GTSLYPrepRepository repository;
    private final StateFlow<GTSLYUrlState> urlState;

    public GTSLYPrepViewModel(GTSLYPrepRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        MutableStateFlow<GTSLYUrlState> MutableStateFlow = StateFlowKt.MutableStateFlow(GTSLYUrlState.Loading.INSTANCE);
        this._urlState = MutableStateFlow;
        this.urlState = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final StateFlow<GTSLYUrlState> getUrlState() {
        return this.urlState;
    }

    /* compiled from: GTSLYPrepViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel$1", f = "GTSLYPrepViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, nl = {59}, s = {}, v = 2)
    /* renamed from: gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GTSLYPrepViewModel.this.new AnonymousClass1(continuation);
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
                Flow combine = FlowKt.combine(GTSLYPrepViewModel.this.repository.getUrlState(), GTSLYPrepViewModel.this.repository.getAppsFlyerDataState(), GTSLYPrepViewModel.this.repository.getFcmTokenState(), GTSLYPrepViewModel.this.repository.getInstallReferrerState(), new C00671(null));
                final GTSLYPrepViewModel gTSLYPrepViewModel = GTSLYPrepViewModel.this;
                this.label = 1;
                if (combine.collect(new FlowCollector() { // from class: gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GTSLYPrepState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(GTSLYPrepState gTSLYPrepState, Continuation<? super Unit> continuation) {
                        Object value;
                        GTSLYUrlState urlState = gTSLYPrepState.getUrlState();
                        Map<String, Object> component2 = gTSLYPrepState.component2();
                        String fcmToken = gTSLYPrepState.getFcmToken();
                        String installReferrer = gTSLYPrepState.getInstallReferrer();
                        MutableStateFlow mutableStateFlow = GTSLYPrepViewModel.this._urlState;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, urlState));
                        if ((urlState instanceof GTSLYUrlState.NoUrl) && component2 != null && component2.containsKey("af_status") && fcmToken != null && installReferrer != null && !GTSLYPrepViewModel.this.installRequested) {
                            GTSLYPrepViewModel.this.installRequested = true;
                            Object install = GTSLYPrepViewModel.this.repository.install(fcmToken, continuation);
                            return install == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? install : Unit.INSTANCE;
                        }
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

        /* compiled from: GTSLYPrepViewModel.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "Lgbcorp/c312/merkmarker/info/ui/state/GTSLYPrepState;", "urlState", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "conversionData", "", "", "", "token", "referrer"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel$1$1", f = "GTSLYPrepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00671 extends SuspendLambda implements Function5<GTSLYUrlState, Map<String, ? extends Object>, String, String, Continuation<? super GTSLYPrepState>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            int label;

            C00671(Continuation<? super C00671> continuation) {
                super(5, continuation);
            }

            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(GTSLYUrlState gTSLYUrlState, Map<String, ? extends Object> map, String str, String str2, Continuation<? super GTSLYPrepState> continuation) {
                C00671 c00671 = new C00671(continuation);
                c00671.L$0 = gTSLYUrlState;
                c00671.L$1 = map;
                c00671.L$2 = str;
                c00671.L$3 = str2;
                return c00671.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                GTSLYUrlState gTSLYUrlState = (GTSLYUrlState) this.L$0;
                Map map = (Map) this.L$1;
                String str = (String) this.L$2;
                String str2 = (String) this.L$3;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GTSLYPrepState(gTSLYUrlState, map, str, str2);
            }
        }
    }
}
