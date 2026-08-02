package com.squareup.cash.work.data.real;

import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.LocationScopedClockInControls;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealGetClockInControlsUseCase$getControls$1$1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ Instant $nextShiftStartTime;
    public /* synthetic */ SubscriptionStatus L$0;
    public /* synthetic */ ShiftSettings L$1;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ RealGetClockInControlsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGetClockInControlsUseCase$getControls$1$1(RealGetClockInControlsUseCase realGetClockInControlsUseCase, Instant instant, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realGetClockInControlsUseCase;
        this.$nextShiftStartTime = instant;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        RealGetClockInControlsUseCase$getControls$1$1 realGetClockInControlsUseCase$getControls$1$1 = new RealGetClockInControlsUseCase$getControls$1$1(this.this$0, this.$nextShiftStartTime, (Continuation) obj4);
        realGetClockInControlsUseCase$getControls$1$1.L$0 = (SubscriptionStatus) obj;
        realGetClockInControlsUseCase$getControls$1$1.L$1 = (ShiftSettings) obj2;
        realGetClockInControlsUseCase$getControls$1$1.Z$0 = booleanValue;
        return realGetClockInControlsUseCase$getControls$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (r1 == null) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Instant instant;
        Instant instant2;
        long j2;
        RealGetClockInControlsUseCase$getControls$1$1 realGetClockInControlsUseCase$getControls$1$1 = this;
        SubscriptionStatus subscriptionStatus = realGetClockInControlsUseCase$getControls$1$1.L$0;
        ShiftSettings shiftSettings = realGetClockInControlsUseCase$getControls$1$1.L$1;
        boolean z = realGetClockInControlsUseCase$getControls$1$1.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        boolean z2 = shiftSettings.canClockInFromTeamApp;
        boolean z3 = subscriptionStatus.canEnforceEarlyTimecardActions;
        boolean z4 = subscriptionStatus.canUseAutoClockOut;
        boolean z5 = subscriptionStatus.canUseGeofencing;
        Map map = shiftSettings.byLocationSettings;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            LocationSettings locationSettings = (LocationSettings) entry.getValue();
            Set set = RealGetClockInControlsUseCase.END_BREAK_EARLY_PERMISSIONS;
            boolean z6 = locationSettings.canDeclareCashTips;
            Duration duration = locationSettings.earlyClockInBuffer;
            Duration duration2 = locationSettings.autoClockOutBuffer;
            boolean z7 = duration2 != null;
            Double d = locationSettings.geofenceRadiusInMeters;
            boolean z8 = d != null;
            boolean z9 = locationSettings.earlyBreakCompletionBuffer != null;
            boolean z10 = duration != null;
            double doubleValue = d != null ? d.doubleValue() : 0.0d;
            boolean z11 = z2;
            boolean z12 = z3;
            if (duration2 != null) {
                j = duration2.rawValue;
            } else {
                Duration.Companion.getClass();
                j = 0;
            }
            Instant instant3 = realGetClockInControlsUseCase$getControls$1$1.$nextShiftStartTime;
            Iterator it2 = it;
            if (instant3 != null) {
                long j3 = locationSettings.minScheduledShiftBuffer;
                Duration.Companion companion = Duration.Companion;
                instant = instant3.minusSeconds(Duration.m4176toLongimpl(j3, DurationUnit.SECONDS));
            }
            instant = Instant.MIN;
            instant.getClass();
            if (instant3 != null) {
                if (duration != null) {
                    j2 = duration.rawValue;
                } else {
                    Duration.Companion.getClass();
                    j2 = 0;
                }
                Duration.Companion companion2 = Duration.Companion;
                instant2 = instant3.minusSeconds(Duration.m4176toLongimpl(j2, DurationUnit.SECONDS));
            }
            instant2 = Instant.MIN;
            Instant instant4 = instant2;
            instant4.getClass();
            linkedHashMap.put(key, new LocationScopedClockInControls(z6, z8, z7, z9, z10, instant, instant4, j, doubleValue));
            realGetClockInControlsUseCase$getControls$1$1 = this;
            z2 = z11;
            z3 = z12;
            it = it2;
        }
        return new ClockInControls(z2, z3, z3, z4, z5, z, linkedHashMap);
    }
}
