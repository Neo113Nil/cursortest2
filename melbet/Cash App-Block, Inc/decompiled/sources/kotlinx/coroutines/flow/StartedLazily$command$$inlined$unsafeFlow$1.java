package kotlinx.coroutines.flow;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class StartedLazily$command$$inlined$unsafeFlow$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $subscriptionCount$inlined;

    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            StartedLazily$command$$inlined$unsafeFlow$1.this.collect(null, this);
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    public /* synthetic */ StartedLazily$command$$inlined$unsafeFlow$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$subscriptionCount$inlined = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:12:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;
        int i2;
        Iterator it;
        int i3;
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1;
        int i4;
        int length;
        FlowCollector flowCollector2;
        int i5;
        int i6 = this.$r8$classId;
        int i7 = 0;
        Object obj = this.$subscriptionCount$inlined;
        switch (i6) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i8 = anonymousClass1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i == 0) {
                            if (i == 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(obj2);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                        StartedLazily$command$1$1 startedLazily$command$1$1 = new StartedLazily$command$1$1(new Ref$BooleanRef(), flowCollector, 0);
                        anonymousClass1.label = 1;
                        ((SubscriptionCountStateFlow) obj).collect(startedLazily$command$1$1, anonymousClass1);
                        return coroutineSingletons;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i == 0) {
                }
            case 1:
                ((FlowToStateFlow) obj).collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 25), continuation);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 2:
                Object collect = ((FinishSetupTileBadgeCounter) obj).collect(new DeviceFeatureRequestWorker$run$1$1(flowCollector, 2), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            case 3:
                if (continuation instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) {
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) continuation;
                    int i9 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj3 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            it = ((Iterable) obj).iterator();
                            i3 = 0;
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i10 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$1;
                            int i11 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$0;
                            it = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$4;
                            FlowCollector flowCollector3 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$2;
                            SafeTrace.throwOnFailure(obj3);
                            i3 = i10;
                            i7 = i11;
                            flowCollector = flowCollector3;
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$2 = flowCollector;
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$4 = it;
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$0 = i7;
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$1 = i3;
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = 1;
                            if (flowCollector.emit(next, flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1(this, continuation);
                Object obj32 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
                if (i2 != 0) {
                }
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                Object[] objArr = (Object[]) obj;
                if (continuation instanceof FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 = (FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) continuation;
                    int i12 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj4 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            length = objArr.length;
                            flowCollector2 = flowCollector;
                            i5 = 0;
                            if (i7 < length) {
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            length = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$2;
                            int i13 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$1;
                            int i14 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$0;
                            FlowCollector flowCollector4 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$2;
                            SafeTrace.throwOnFailure(obj4);
                            flowCollector2 = flowCollector4;
                            i7 = i13 + 1;
                            i5 = i14;
                            if (i7 < length) {
                                Object obj5 = objArr[i7];
                                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$2 = flowCollector2;
                                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$0 = i5;
                                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$1 = i7;
                                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$2 = length;
                                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label = 1;
                                if (flowCollector2.emit(obj5, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                i14 = i5;
                                i13 = i7;
                                i7 = i13 + 1;
                                i5 = i14;
                                if (i7 < length) {
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj42 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label;
                if (i4 != 0) {
                }
        }
    }
}
