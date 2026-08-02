package com.squareup.util.coroutines;

import androidx.compose.runtime.MutableState;
import androidx.core.app.ActivityCompat;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.offers.presenters.DetailCaptionFormatStringResources;
import com.squareup.cash.offers.presenters.DetailTimeUntilExpirationState;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1;
import com.squareup.cash.util.clock.AndroidClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ThrottleFirstKt$throttleFirst$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$flow;
    public final /* synthetic */ Object $emitted;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ long $windowDuration;
    public final /* synthetic */ Object $windowStartTime;

    public ThrottleFirstKt$throttleFirst$1$1(long j, AndroidClock androidClock, DetailCaptionFormatStringResources detailCaptionFormatStringResources, MutableState mutableState) {
        this.$windowDuration = j;
        this.$windowStartTime = androidClock;
        this.$emitted = detailCaptionFormatStringResources;
        this.$$this$flow = mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14 != null ? r14.arguments : null, r13.arguments) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14 != null ? r14.arguments : null, r13.arguments) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14 != null ? r14.arguments : null, r13.arguments) == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f2  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ThrottleFirstKt$throttleFirst$1$1$emit$1 throttleFirstKt$throttleFirst$1$1$emit$1;
        int i;
        AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1 androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        long j = this.$windowDuration;
        Object obj2 = this.$emitted;
        Object obj3 = this.$$this$flow;
        boolean z = false;
        Object obj4 = this.$windowStartTime;
        switch (i3) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                if (continuation instanceof ThrottleFirstKt$throttleFirst$1$1$emit$1) {
                    throttleFirstKt$throttleFirst$1$1$emit$1 = (ThrottleFirstKt$throttleFirst$1$1$emit$1) continuation;
                    int i4 = throttleFirstKt$throttleFirst$1$1$emit$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        throttleFirstKt$throttleFirst$1$1$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj5 = throttleFirstKt$throttleFirst$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = throttleFirstKt$throttleFirst$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            long currentTimeMillis = System.currentTimeMillis();
                            Ref$LongRef ref$LongRef = (Ref$LongRef) obj4;
                            long j2 = ref$LongRef.element;
                            long j3 = currentTimeMillis - j2;
                            if (j3 >= j) {
                                ref$LongRef.element = ((j3 / j) * j) + j2;
                                ref$BooleanRef.element = false;
                            }
                            if (!ref$BooleanRef.element) {
                                throttleFirstKt$throttleFirst$1$1$emit$1.label = 1;
                                if (((FlowCollector) obj3).emit(obj, throttleFirstKt$throttleFirst$1$1$emit$1) == coroutineSingletons) {
                                    break;
                                }
                            }
                            break;
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        ref$BooleanRef.element = true;
                    }
                }
                throttleFirstKt$throttleFirst$1$1$emit$1 = new ThrottleFirstKt$throttleFirst$1$1$emit$1(this, continuation);
                Object obj52 = throttleFirstKt$throttleFirst$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = throttleFirstKt$throttleFirst$1$1$emit$1.label;
                if (i != 0) {
                }
                ref$BooleanRef.element = true;
            case 1:
                DetailCaptionFormatStringResources detailCaptionFormatStringResources = (DetailCaptionFormatStringResources) obj2;
                MutableState mutableState = (MutableState) obj3;
                long duration = DurationKt.toDuration(j - ((AndroidClock) obj4).millis(), DurationUnit.MILLISECONDS);
                Duration.Companion companion = Duration.Companion;
                DurationUnit durationUnit = DurationUnit.DAYS;
                if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(7, durationUnit)) >= 0) {
                    if (((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource != null) {
                        mutableState.setValue(new DetailTimeUntilExpirationState(null, false, false));
                    }
                } else if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(1, durationUnit)) >= 0) {
                    FormattedResource formattedResource = (FormattedResource) detailCaptionFormatStringResources.daysFormat.invoke(new Integer(MathKt__MathJVMKt.roundToInt(Duration.m4165divLRDsOJo(duration, DurationKt.toDuration(1, durationUnit)))));
                    if (Intrinsics.areEqual(((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource, formattedResource)) {
                        FormattedResource formattedResource2 = ((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource;
                        break;
                    }
                    mutableState.setValue(new DetailTimeUntilExpirationState(formattedResource, true, false));
                } else {
                    DurationUnit durationUnit2 = DurationUnit.HOURS;
                    if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(1, durationUnit2)) >= 0) {
                        FormattedResource formattedResource3 = (FormattedResource) detailCaptionFormatStringResources.hoursFormat.invoke(new Integer((int) Duration.m4165divLRDsOJo(duration, DurationKt.toDuration(1, durationUnit2))));
                        FormattedResource formattedResource4 = ((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource;
                        if (formattedResource4 != null && formattedResource4.id == formattedResource3.id) {
                            FormattedResource formattedResource5 = ((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource;
                            break;
                        }
                        mutableState.setValue(new DetailTimeUntilExpirationState(formattedResource3, true, false));
                    } else {
                        DurationUnit durationUnit3 = DurationUnit.MINUTES;
                        if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(1, durationUnit3)) >= 0) {
                            FormattedResource formattedResource6 = (FormattedResource) detailCaptionFormatStringResources.minutesFormat.invoke(new Integer((int) Duration.m4165divLRDsOJo(duration, DurationKt.toDuration(1, durationUnit3))));
                            FormattedResource formattedResource7 = ((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource;
                            if (formattedResource7 != null && formattedResource7.id == formattedResource6.id) {
                                FormattedResource formattedResource8 = ((DetailTimeUntilExpirationState) mutableState.getValue()).formattedResource;
                                break;
                            }
                            mutableState.setValue(new DetailTimeUntilExpirationState(formattedResource6, true, false));
                        } else {
                            DurationUnit durationUnit4 = DurationUnit.SECONDS;
                            if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(1, durationUnit4)) >= 0) {
                                mutableState.setValue(new DetailTimeUntilExpirationState((FormattedResource) detailCaptionFormatStringResources.secondsFormat.invoke(new Integer((int) Duration.m4165divLRDsOJo(duration, DurationKt.toDuration(1, durationUnit4)))), true, false));
                            } else {
                                mutableState.setValue(new DetailTimeUntilExpirationState(null, false, true));
                            }
                        }
                    }
                }
                break;
            default:
                AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) obj4;
                if (continuation instanceof AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1) {
                    androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1 = (AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1) continuation;
                    int i5 = androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj6 = androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            FlowCollector flowCollector = (FlowCollector) obj3;
                            if (!ActivityCompat.shouldShowRequestPermissionRationale(androidPermissionManager.activity, (String) obj2) && androidPermissionManager.clock.millis() - j < 150) {
                                z = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1 = new AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1(this, continuation);
                Object obj62 = androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = androidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public ThrottleFirstKt$throttleFirst$1$1(Ref$LongRef ref$LongRef, long j, Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector) {
        this.$windowStartTime = ref$LongRef;
        this.$windowDuration = j;
        this.$emitted = ref$BooleanRef;
        this.$$this$flow = flowCollector;
    }

    public ThrottleFirstKt$throttleFirst$1$1(FlowCollector flowCollector, AndroidPermissionManager androidPermissionManager, String str, long j) {
        this.$$this$flow = flowCollector;
        this.$windowStartTime = androidPermissionManager;
        this.$emitted = str;
        this.$windowDuration = j;
    }
}
