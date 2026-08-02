package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.userjourneys.tracker.Signal;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class RealUserJourneySignalProcessor$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Signal f$0;

    public /* synthetic */ RealUserJourneySignalProcessor$$ExternalSyntheticLambda10(Signal signal, int i) {
        this.$r8$classId = i;
        this.f$0 = signal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Signal signal = this.f$0;
        ActiveUserJourney activeUserJourney = (ActiveUserJourney) obj;
        switch (i) {
            case 0:
                activeUserJourney.getClass();
                return Boolean.valueOf(activeUserJourney.name == ((Signal.Start) signal).journeyName);
            default:
                activeUserJourney.getClass();
                return Boolean.valueOf(activeUserJourney.name == ((Signal.EndJourney) signal).journeyName);
        }
    }
}
