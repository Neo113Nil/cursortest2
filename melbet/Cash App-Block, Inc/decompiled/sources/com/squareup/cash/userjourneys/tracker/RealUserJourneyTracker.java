package com.squareup.cash.userjourneys.tracker;

import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.userjourneys.tracker.Signal;
import com.squareup.cash.util.clock.AndroidClock;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public final class RealUserJourneyTracker implements UserJourneyTracker {
    public final AndroidClock clock;
    public final Provider sessionManagerProvider;
    public final DoubleCheck signalProcessorProvider;

    public RealUserJourneyTracker(AndroidClock androidClock, DoubleCheck doubleCheck, Provider provider) {
        provider.getClass();
        this.clock = androidClock;
        this.signalProcessorProvider = doubleCheck;
        this.sessionManagerProvider = provider;
    }

    public static UserJourney$Name toUserJourneyName(String str) {
        Object obj;
        Iterator<E> it = UserJourney$Name.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((UserJourney$Name) obj).getLabel(), str)) {
                break;
            }
        }
        return (UserJourney$Name) obj;
    }

    public final void addFrictionSignal(UserJourney$Name userJourney$Name, UserJourney$Friction userJourney$Friction) {
        userJourney$Friction.getClass();
        ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) this.signalProcessorProvider.getValue())).add(new Signal.AddFriction(userJourney$Name, userJourney$Friction));
    }

    public final void addFrustrationSignal(UserJourney$Name userJourney$Name, UserJourney$Friction userJourney$Friction) {
        userJourney$Friction.getClass();
        ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) this.signalProcessorProvider.getValue())).add(new Signal.AddFrustration(userJourney$Name, userJourney$Friction));
    }

    public final void addTag(UserJourney$Name userJourney$Name, zzaag zzaagVar) {
        ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) this.signalProcessorProvider.getValue())).add(new Signal.AddTag(userJourney$Name, zzaagVar));
    }

    public final void endJourney(UserJourney$Name userJourney$Name, UserJourney$Outcome userJourney$Outcome) {
        userJourney$Name.getClass();
        userJourney$Outcome.getClass();
        ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) this.signalProcessorProvider.getValue())).add(new Signal.EndJourney(userJourney$Name, userJourney$Outcome, DimensionKt.elapsedRealtimeDuration(this.clock)));
    }

    public final void setVariant(UserJourney$Name userJourney$Name, zzaag zzaagVar) {
        userJourney$Name.getClass();
        ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) this.signalProcessorProvider.getValue())).add(new Signal.SetVariant(userJourney$Name, zzaagVar));
    }

    /* renamed from: startJourney-tmZmOBY, reason: not valid java name */
    public final void m3787startJourneytmZmOBY(UserJourney$Name userJourney$Name, long j, Duration duration, Duration duration2, boolean z) {
        long duration3;
        UserJourneySignalProcessor userJourneySignalProcessor = (UserJourneySignalProcessor) this.signalProcessorProvider.getValue();
        AndroidClock androidClock = this.clock;
        long elapsedRealtimeDuration = duration != null ? duration.rawValue : DimensionKt.elapsedRealtimeDuration(androidClock);
        if (duration2 != null) {
            duration3 = duration2.rawValue;
        } else {
            Duration.Companion companion = Duration.Companion;
            duration3 = DurationKt.toDuration(androidClock.millis(), DurationUnit.MILLISECONDS);
        }
        long j2 = duration3;
        Provider provider = this.sessionManagerProvider;
        ((RealUserJourneySignalProcessor) userJourneySignalProcessor).add(new Signal.Start(userJourney$Name, j, elapsedRealtimeDuration, j2, PlatformKt.activeAccountTokenOrNull((SessionManager) provider.invoke()), PlatformKt.appTokenOrNull((SessionManager) provider.invoke()), z));
    }
}
