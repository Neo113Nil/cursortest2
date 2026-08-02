package papa.internal;

import kotlin.time.Duration;
import papa.InteractionEngine;
import papa.InteractionUpdated;
import papa.OnFrameRenderedListener;
import papa.SentEvent;
import papa.internal.LaunchTracker;

/* loaded from: classes3.dex */
public final class LaunchTracker$onActivityResumed$1$1 implements OnFrameRenderedListener {
    public final /* synthetic */ Object $activityStartingTransition;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $resumedActivityHash;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ LaunchTracker$onActivityResumed$1$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$resumedActivityHash = obj2;
        this.$activityStartingTransition = obj3;
    }

    @Override // papa.OnFrameRenderedListener
    /* renamed from: onFrameRendered-LRDsOJo */
    public final void mo4370onFrameRenderedLRDsOJo(long j) {
        int i = this.$r8$classId;
        Object obj = this.$activityStartingTransition;
        Object obj2 = this.$resumedActivityHash;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                LaunchTracker launchTracker = (LaunchTracker) obj3;
                LaunchTracker.LaunchInProgress launchInProgress = (LaunchTracker.LaunchInProgress) launchTracker.launchInProgress;
                if (launchInProgress != null) {
                    launchTracker.launchInProgress = null;
                    Long l = launchInProgress.invisibleDurationRealtimeMillis;
                    if (l == null || l.longValue() >= 500) {
                        ((Perfs$$ExternalSyntheticLambda3) launchTracker.appLaunchedCallback).invoke(new LaunchTracker.Launch(!launchInProgress.activityHash.equals((String) obj2), launchInProgress.startUptimeMillis, launchInProgress.startRealtimeMillis, Duration.m4167getInWholeMillisecondsimpl(j), launchInProgress.invisibleDurationRealtimeMillis, (LaunchedActivityStartingTransition) obj));
                        break;
                    }
                }
                break;
            default:
                InteractionEngine.RealRunningInteraction realRunningInteraction = (InteractionEngine.RealRunningInteraction) obj3;
                realRunningInteraction.trace.endTrace();
                InteractionEngine interactionEngine = (InteractionEngine) obj2;
                interactionEngine.finishingInteractions.remove(realRunningInteraction);
                interactionEngine.updateListener.onInteractionUpdate(new InteractionUpdated.FrameRendered((SentEvent) obj, realRunningInteraction, j));
                break;
        }
    }
}
