package com.squareup.cash.userjourneys.tracker;

import coil3.size.DimensionKt;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractCancelFlow;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractCompleteFlow;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.userjourneys.tracker.Signal;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class UserJourneyAnalytics implements Analytics {
    public final RealUserJourneyTracker subUserJourneyTracker;
    public final UserJourneyTracker userJourneyTracker;

    public UserJourneyAnalytics(UserJourneyTracker userJourneyTracker, RealUserJourneyTracker realUserJourneyTracker) {
        this.userJourneyTracker = userJourneyTracker;
        this.subUserJourneyTracker = realUserJourneyTracker;
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        final String str;
        final String str2;
        RealUserJourneyTracker realUserJourneyTracker = this.subUserJourneyTracker;
        AndroidClock androidClock = realUserJourneyTracker.clock;
        DoubleCheck doubleCheck = realUserJourneyTracker.signalProcessorProvider;
        event.getClass();
        boolean areEqual = Intrinsics.areEqual(event.getName(), "BlockerFlow Interact StartFlow");
        UserJourneyTracker userJourneyTracker = this.userJourneyTracker;
        if ((areEqual || Intrinsics.areEqual(event.getName(), "BlockerFlow Interact ViewBlocker")) && (str = (String) event.getParameters().get("client_scenario")) != null) {
            zzaag zzaagVar = new zzaag(str) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Tag$ClientScenario
                public final String clientScenario;

                {
                    super("client-scenario-".concat(str));
                    this.clientScenario = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Tag$ClientScenario) && Intrinsics.areEqual(this.clientScenario, ((UserJourney$Tag$ClientScenario) obj).clientScenario);
                }

                public final int hashCode() {
                    return this.clientScenario.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientScenario(clientScenario=", this.clientScenario, ")");
                }
            };
            UserJourneyTracker.Companion companion = UserJourneyTracker.Companion;
            ((RealUserJourneyTracker) userJourneyTracker).addTag(null, zzaagVar);
        }
        if (Intrinsics.areEqual(event.getName(), "BlockerFlow Interact ViewBlocker") && (str2 = (String) event.getParameters().get("blocker_id")) != null) {
            zzaag zzaagVar2 = new zzaag(str2) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Tag$BlockerId
                public final String blockerId;

                {
                    super(str2);
                    this.blockerId = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Tag$BlockerId) && this.blockerId.equals(((UserJourney$Tag$BlockerId) obj).blockerId);
                }

                public final int hashCode() {
                    return this.blockerId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerId(blockerId=", this.blockerId, ")");
                }
            };
            UserJourneyTracker.Companion companion2 = UserJourneyTracker.Companion;
            ((RealUserJourneyTracker) userJourneyTracker).addTag(null, zzaagVar2);
        }
        if (StringsKt__StringsJVMKt.equals((String) event.getParameters().get("client_scenario"), "UNLOCK_APP", true)) {
            return;
        }
        if (event instanceof BlockerFlowInteractCompleteFlow) {
            ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) doubleCheck.getValue())).add(new Signal.EndAllSubJourneys(new UserJourney$Outcome.Terminated(UserJourney$TerminationReason.MISSING_BLOCKER_FLOW_OUTCOME), DimensionKt.elapsedRealtimeDuration(androidClock)));
        } else if (event instanceof BlockerFlowInteractCancelFlow) {
            ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) doubleCheck.getValue())).add(new Signal.EndAllSubJourneys(UserJourney$Outcome.UserCanceled.INSTANCE, DimensionKt.elapsedRealtimeDuration(androidClock)));
        }
    }
}
