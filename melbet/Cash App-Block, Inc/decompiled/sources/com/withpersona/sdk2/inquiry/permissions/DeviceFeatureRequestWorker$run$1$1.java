package com.withpersona.sdk2.inquiry.permissions;

import androidx.activity.result.ActivityResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.integrity.bx;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class DeviceFeatureRequestWorker$run$1$1 implements FlowCollector {
    public final /* synthetic */ FlowCollector $$this$flow;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DeviceFeatureRequestWorker$run$1$1(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$$this$flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1 playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1 playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        UiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1 uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1;
        int i3;
        int i4 = this.$r8$classId;
        FlowCollector flowCollector = this.$$this$flow;
        switch (i4) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult != null && activityResult.resultCode == -1) {
                    Object emit = flowCollector.emit(DeviceFeatureRequestWorker.Output.Success.INSTANCE, continuation);
                    if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                } else {
                    Object emit2 = flowCollector.emit(DeviceFeatureRequestWorker.Output.Denied.INSTANCE, continuation);
                    if (emit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 1:
                if (continuation instanceof PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1) {
                    playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1 = (PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i5 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj2 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            PlayIntegrityHelper.PlayIntegrityState playIntegrityState = (PlayIntegrityHelper.PlayIntegrityState) obj;
                            if ((playIntegrityState instanceof PlayIntegrityHelper.PlayIntegrityState.Error) || (playIntegrityState instanceof PlayIntegrityHelper.PlayIntegrityState.Ready)) {
                                playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1 = new PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj22 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                }
                break;
            case 2:
                if (continuation instanceof PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1) {
                    playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1 = (PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i6 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            PlayIntegrityHelper.PlayIntegrityState playIntegrityState2 = (PlayIntegrityHelper.PlayIntegrityState) obj;
                            PlayIntegrityHelper.PlayIntegrityState.Ready ready = playIntegrityState2 instanceof PlayIntegrityHelper.PlayIntegrityState.Ready ? (PlayIntegrityHelper.PlayIntegrityState.Ready) playIntegrityState2 : null;
                            bx bxVar = ready != null ? ready.integrityTokenProvider : null;
                            playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bxVar, playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1 = new PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj32 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = playIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    Object emit3 = flowCollector.emit(PermissionRequestDialogWorker.Output.Denied.INSTANCE, continuation);
                    if (emit3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                } else {
                    Object emit4 = flowCollector.emit(PermissionRequestDialogWorker.Output.Success.INSTANCE, continuation);
                    if (emit4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            default:
                if (continuation instanceof UiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1) {
                    uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1 = (UiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i7 = uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj4 = uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            String str = ((UiWorkflow.Input) obj).stepName;
                            uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1 = new UiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj42 = uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = uiStepStateManager$3$invokeSuspend$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
