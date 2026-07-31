package coil.compose;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil.size.Size;
import coil.size.SizeResolver;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncImage.kt */
/* loaded from: classes8.dex */
public final class ConstraintsSizeResolver implements SizeResolver, LayoutModifier {
    private final MutableStateFlow _constraints = StateFlowKt.MutableStateFlow(Constraints.m2475boximpl(UtilsKt.getZeroConstraints()));

    @Override // coil.size.SizeResolver
    public Object size(Continuation continuation) {
        final MutableStateFlow mutableStateFlow = this._constraints;
        return FlowKt.first(new Flow() { // from class: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            /* renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE}, m = "emit")
                /* renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Size m2902toSizeOrNullBRTryo0;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                m2902toSizeOrNullBRTryo0 = AsyncImageKt.m2902toSizeOrNullBRTryo0(((Constraints) obj).getValue());
                                if (m2902toSizeOrNullBRTryo0 != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(m2902toSizeOrNullBRTryo0, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, continuation);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        this._constraints.setValue(Constraints.m2475boximpl(j));
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: coil.compose.ConstraintsSizeResolver$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
