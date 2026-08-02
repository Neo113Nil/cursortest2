package papa.internal;

import android.os.Process;
import android.os.SystemClock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import papa.AppLaunchType;
import papa.AppStart$AppStartData;
import papa.AppUpdateData;
import papa.AppVisibilityState;
import papa.PapaEvent;
import papa.PapaEventListener;
import papa.PreLaunchState;
import papa.SafeTrace;
import papa.internal.LaunchTracker;

/* loaded from: classes3.dex */
public final /* synthetic */ class Perfs$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ long f$0;
    public final /* synthetic */ AppVisibilityState f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ Perfs$$ExternalSyntheticLambda3(long j, AppVisibilityState appVisibilityState, long j2, long j3) {
        this.f$0 = j;
        this.f$1 = appVisibilityState;
        this.f$2 = j2;
        this.f$3 = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Throwable th;
        PreLaunchState preLaunchState;
        PreLaunchState preLaunchState2;
        Object obj2;
        Pair pair;
        Object obj3;
        long j = this.f$0;
        AppVisibilityState appVisibilityState = this.f$1;
        long j2 = this.f$2;
        long j3 = this.f$3;
        LaunchTracker.Launch launch = (LaunchTracker.Launch) obj;
        launch.getClass();
        Long l = Perfs.firstPostUptimeMillis;
        if (l != null) {
            str = "appStartData";
            th = null;
            if (launch.startUptimeMillis > l.longValue()) {
                int ordinal = launch.activityStartingTransition.ordinal();
                if (ordinal == 0) {
                    preLaunchState = PreLaunchState.NO_ACTIVITY_NO_SAVED_STATE;
                } else if (ordinal == 1) {
                    preLaunchState = PreLaunchState.NO_ACTIVITY_BUT_SAVED_STATE;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    preLaunchState = PreLaunchState.ACTIVITY_WAS_STOPPED;
                }
                preLaunchState2 = preLaunchState;
                if (preLaunchState2.launchType != AppLaunchType.COLD) {
                    long startUptimeMillis = Process.getStartUptimeMillis();
                    AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
                    if (appStart$AppStartData == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        throw th;
                    }
                    Long l2 = appStart$AppStartData.firstPostAtFrontElapsedUptimeMillis;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        AppStart$AppStartData appStart$AppStartData2 = Perfs.appStartData;
                        if (appStart$AppStartData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            throw th;
                        }
                        if ((longValue - appStart$AppStartData2.processStartUptimeMillis) - startUptimeMillis >= 60000) {
                            startUptimeMillis = Perfs.classInitUptimeMillis;
                        }
                    }
                    if (j == -1) {
                        obj3 = th;
                    } else if (appVisibilityState == AppVisibilityState.INVISIBLE) {
                        obj3 = Long.valueOf((System.currentTimeMillis() - (SystemClock.uptimeMillis() - startUptimeMillis)) - j);
                    } else {
                        AppStart$AppStartData appStart$AppStartData3 = Perfs.appStartData;
                        if (appStart$AppStartData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            throw th;
                        }
                        obj3 = Long.valueOf(appStart$AppStartData3.lastAppAliveElapsedTimeMillis.longValue() - (j2 - startUptimeMillis));
                    }
                    pair = new Pair(Long.valueOf(startUptimeMillis), obj3);
                } else {
                    long j4 = launch.startUptimeMillis;
                    Long l3 = launch.invisibleDurationRealtimeMillis;
                    if (l3 != null) {
                        obj2 = l3;
                    } else if (j == -1) {
                        obj2 = th;
                    } else if (appVisibilityState == AppVisibilityState.INVISIBLE) {
                        obj2 = Long.valueOf((System.currentTimeMillis() - (SystemClock.uptimeMillis() - j4)) - j);
                    } else {
                        AppStart$AppStartData appStart$AppStartData4 = Perfs.appStartData;
                        if (appStart$AppStartData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            throw th;
                        }
                        obj2 = Long.valueOf((launch.startRealtimeMillis - j3) + appStart$AppStartData4.lastAppAliveElapsedTimeMillis.longValue());
                    }
                    pair = new Pair(Long.valueOf(launch.startUptimeMillis), obj2);
                }
                long longValue2 = ((Number) pair.first).longValue();
                Long l4 = (Long) pair.second;
                if (Perfs.isTracingLaunch) {
                    SafeTrace.endAsyncSection("App Launch", 0);
                    Perfs.isTracingLaunch = false;
                }
                PapaEventListener.Companion companion = PapaEventListener.Companion;
                PapaEvent.AppLaunch appLaunch = new PapaEvent.AppLaunch(preLaunchState2, launch.endUptimeMillis - longValue2, launch.trampoline, l4, longValue2);
                companion.getClass();
                PapaEventListener.Companion.sendEvent$papa_release(appLaunch);
                return Unit.INSTANCE;
            }
        } else {
            str = "appStartData";
            th = null;
        }
        AppStart$AppStartData appStart$AppStartData5 = Perfs.appStartData;
        if (appStart$AppStartData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw th;
        }
        if (appStart$AppStartData5.importance == 100) {
            AppStart$AppStartData appStart$AppStartData6 = Perfs.appStartData;
            if (appStart$AppStartData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw th;
            }
            AppUpdateData appUpdateData = appStart$AppStartData6.appUpdateData;
            if (appUpdateData instanceof AppUpdateData.RealAppUpdateData) {
                int ordinal2 = ((AppUpdateData.RealAppUpdateData) appUpdateData).status.ordinal();
                if (ordinal2 == 0) {
                    preLaunchState = PreLaunchState.NO_PROCESS_FIRST_LAUNCH_AFTER_CLEAR_DATA;
                } else if (ordinal2 == 1) {
                    preLaunchState = PreLaunchState.NO_PROCESS_FIRST_LAUNCH_AFTER_INSTALL;
                } else if (ordinal2 == 2) {
                    preLaunchState = PreLaunchState.NO_PROCESS_FIRST_LAUNCH_AFTER_UPGRADE;
                } else {
                    if (ordinal2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return th;
                    }
                    preLaunchState = PreLaunchState.NO_PROCESS;
                }
            } else {
                preLaunchState = PreLaunchState.NO_PROCESS;
            }
        } else {
            preLaunchState = PreLaunchState.PROCESS_WAS_LAUNCHING_IN_BACKGROUND;
        }
        preLaunchState2 = preLaunchState;
        if (preLaunchState2.launchType != AppLaunchType.COLD) {
        }
        long longValue22 = ((Number) pair.first).longValue();
        Long l42 = (Long) pair.second;
        if (Perfs.isTracingLaunch) {
        }
        PapaEventListener.Companion companion2 = PapaEventListener.Companion;
        PapaEvent.AppLaunch appLaunch2 = new PapaEvent.AppLaunch(preLaunchState2, launch.endUptimeMillis - longValue22, launch.trampoline, l42, longValue22);
        companion2.getClass();
        PapaEventListener.Companion.sendEvent$papa_release(appLaunch2);
        return Unit.INSTANCE;
    }
}
