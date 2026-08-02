package papa.internal;

import android.os.MessageQueue;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import papa.AppStart$AppStartData;

/* loaded from: classes3.dex */
public final /* synthetic */ class Perfs$$ExternalSyntheticLambda1 implements MessageQueue.IdleHandler {
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
        if (appStart$AppStartData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStartData");
            throw null;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - appStart$AppStartData.processStartUptimeMillis;
        AppStart$AppStartData appStart$AppStartData2 = Perfs.appStartData;
        if (appStart$AppStartData2 != null) {
            Perfs.appStartData = AppStart$AppStartData.copy$default(appStart$AppStartData2, Long.valueOf(uptimeMillis), null, null, null, null, null, null, null, null, null, null, null, null, null, -65537);
            return false;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appStartData");
        throw null;
    }
}
