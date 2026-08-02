package com.squareup.cash.userjourneys.tracker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzaag;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes.dex */
public interface Signal {

    public final class AddFriction implements Signal {
        public final UserJourney$Friction frictionSignal;
        public final UserJourney$Name journeyName;

        public AddFriction(UserJourney$Name userJourney$Name, UserJourney$Friction userJourney$Friction) {
            userJourney$Friction.getClass();
            this.journeyName = userJourney$Name;
            this.frictionSignal = userJourney$Friction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddFriction)) {
                return false;
            }
            AddFriction addFriction = (AddFriction) obj;
            return this.journeyName == addFriction.journeyName && Intrinsics.areEqual(this.frictionSignal, addFriction.frictionSignal);
        }

        public final int hashCode() {
            UserJourney$Name userJourney$Name = this.journeyName;
            return this.frictionSignal.hashCode() + ((userJourney$Name == null ? 0 : userJourney$Name.hashCode()) * 31);
        }

        public final String toString() {
            return "AddFriction(journeyName=" + this.journeyName + ", frictionSignal=" + this.frictionSignal + ")";
        }
    }

    public final class AddFrustration implements Signal {
        public final UserJourney$Friction frustrationSignal;
        public final UserJourney$Name journeyName;

        public AddFrustration(UserJourney$Name userJourney$Name, UserJourney$Friction userJourney$Friction) {
            userJourney$Friction.getClass();
            this.journeyName = userJourney$Name;
            this.frustrationSignal = userJourney$Friction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddFrustration)) {
                return false;
            }
            AddFrustration addFrustration = (AddFrustration) obj;
            return this.journeyName == addFrustration.journeyName && Intrinsics.areEqual(this.frustrationSignal, addFrustration.frustrationSignal);
        }

        public final int hashCode() {
            UserJourney$Name userJourney$Name = this.journeyName;
            return this.frustrationSignal.hashCode() + ((userJourney$Name == null ? 0 : userJourney$Name.hashCode()) * 31);
        }

        public final String toString() {
            return "AddFrustration(journeyName=" + this.journeyName + ", frustrationSignal=" + this.frustrationSignal + ")";
        }
    }

    public final class AddTag implements Signal {
        public final UserJourney$Name journeyName;
        public final zzaag tag;

        public AddTag(UserJourney$Name userJourney$Name, zzaag zzaagVar) {
            this.journeyName = userJourney$Name;
            this.tag = zzaagVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddTag)) {
                return false;
            }
            AddTag addTag = (AddTag) obj;
            return this.journeyName == addTag.journeyName && this.tag.equals(addTag.tag);
        }

        public final int hashCode() {
            UserJourney$Name userJourney$Name = this.journeyName;
            return this.tag.hashCode() + ((userJourney$Name == null ? 0 : userJourney$Name.hashCode()) * 31);
        }

        public final String toString() {
            return "AddTag(journeyName=" + this.journeyName + ", tag=" + this.tag + ")";
        }
    }

    public final class EndAllSubJourneys implements Signal {
        public final long journeyCompletedAtRealtime;
        public final UserJourney$Outcome outcome;

        public EndAllSubJourneys(UserJourney$Outcome userJourney$Outcome, long j) {
            this.outcome = userJourney$Outcome;
            this.journeyCompletedAtRealtime = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EndAllSubJourneys)) {
                return false;
            }
            EndAllSubJourneys endAllSubJourneys = (EndAllSubJourneys) obj;
            return this.outcome.equals(endAllSubJourneys.outcome) && Duration.m4166equalsimpl0(this.journeyCompletedAtRealtime, endAllSubJourneys.journeyCompletedAtRealtime);
        }

        public final int hashCode() {
            int hashCode = this.outcome.hashCode() * 31;
            Duration.Companion companion = Duration.Companion;
            return Long.hashCode(this.journeyCompletedAtRealtime) + hashCode;
        }

        public final String toString() {
            return "EndAllSubJourneys(outcome=" + this.outcome + ", journeyCompletedAtRealtime=" + Duration.m4177toStringimpl(this.journeyCompletedAtRealtime) + ")";
        }
    }

    public final class EndJourney implements Signal {
        public final long journeyCompletedAtRealtime;
        public final UserJourney$Name journeyName;
        public final UserJourney$Outcome outcome;

        public EndJourney(UserJourney$Name userJourney$Name, UserJourney$Outcome userJourney$Outcome, long j) {
            userJourney$Name.getClass();
            userJourney$Outcome.getClass();
            this.journeyName = userJourney$Name;
            this.outcome = userJourney$Outcome;
            this.journeyCompletedAtRealtime = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EndJourney)) {
                return false;
            }
            EndJourney endJourney = (EndJourney) obj;
            return this.journeyName == endJourney.journeyName && Intrinsics.areEqual(this.outcome, endJourney.outcome) && Duration.m4166equalsimpl0(this.journeyCompletedAtRealtime, endJourney.journeyCompletedAtRealtime);
        }

        public final int hashCode() {
            int hashCode = (this.outcome.hashCode() + (this.journeyName.hashCode() * 31)) * 31;
            Duration.Companion companion = Duration.Companion;
            return Long.hashCode(this.journeyCompletedAtRealtime) + hashCode;
        }

        public final String toString() {
            String m4177toStringimpl = Duration.m4177toStringimpl(this.journeyCompletedAtRealtime);
            StringBuilder sb = new StringBuilder("EndJourney(journeyName=");
            sb.append(this.journeyName);
            sb.append(", outcome=");
            sb.append(this.outcome);
            sb.append(", journeyCompletedAtRealtime=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m4177toStringimpl, ")");
        }
    }

    public final class SetVariant implements Signal {
        public final UserJourney$Name journeyName;
        public final zzaag variant;

        public SetVariant(UserJourney$Name userJourney$Name, zzaag zzaagVar) {
            userJourney$Name.getClass();
            this.journeyName = userJourney$Name;
            this.variant = zzaagVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetVariant)) {
                return false;
            }
            SetVariant setVariant = (SetVariant) obj;
            return this.journeyName == setVariant.journeyName && this.variant.equals(setVariant.variant);
        }

        public final int hashCode() {
            return this.variant.hashCode() + (this.journeyName.hashCode() * 31);
        }

        public final String toString() {
            return "SetVariant(journeyName=" + this.journeyName + ", variant=" + this.variant + ")";
        }
    }

    public final class Start implements Signal {
        public final String appToken;
        public final long createdAtEpoch;
        public final long createdAtRealtime;
        public final String entityId;
        public final UUID id;
        public final boolean isSubJourney;
        public final UserJourney$Name journeyName;
        public final long timeout;

        public Start(UserJourney$Name userJourney$Name, long j, long j2, long j3, String str, String str2, boolean z) {
            UUID randomUUID = UUID.randomUUID();
            randomUUID.getClass();
            userJourney$Name.getClass();
            this.journeyName = userJourney$Name;
            this.id = randomUUID;
            this.timeout = j;
            this.createdAtRealtime = j2;
            this.createdAtEpoch = j3;
            this.entityId = str;
            this.appToken = str2;
            this.isSubJourney = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Start)) {
                return false;
            }
            Start start = (Start) obj;
            return this.journeyName == start.journeyName && Intrinsics.areEqual(this.id, start.id) && Duration.m4166equalsimpl0(this.timeout, start.timeout) && Duration.m4166equalsimpl0(this.createdAtRealtime, start.createdAtRealtime) && Duration.m4166equalsimpl0(this.createdAtEpoch, start.createdAtEpoch) && Intrinsics.areEqual(this.entityId, start.entityId) && Intrinsics.areEqual(this.appToken, start.appToken) && this.isSubJourney == start.isSubJourney;
        }

        public final int hashCode() {
            int hashCode = (this.id.hashCode() + (this.journeyName.hashCode() * 31)) * 31;
            Duration.Companion companion = Duration.Companion;
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.timeout), 31, this.createdAtRealtime), 31, this.createdAtEpoch);
            String str = this.entityId;
            int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appToken;
            return Boolean.hashCode(this.isSubJourney) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String m4177toStringimpl = Duration.m4177toStringimpl(this.timeout);
            String m4177toStringimpl2 = Duration.m4177toStringimpl(this.createdAtRealtime);
            String m4177toStringimpl3 = Duration.m4177toStringimpl(this.createdAtEpoch);
            StringBuilder sb = new StringBuilder("Start(journeyName=");
            sb.append(this.journeyName);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", timeout=");
            Boxes$$ExternalSyntheticOutline1.m(sb, m4177toStringimpl, ", createdAtRealtime=", m4177toStringimpl2, ", createdAtEpoch=");
            Boxes$$ExternalSyntheticOutline1.m(sb, m4177toStringimpl3, ", entityId=", this.entityId, ", appToken=");
            return re$$ExternalSyntheticOutline0.m(sb, this.appToken, ", isSubJourney=", this.isSubJourney, ")");
        }
    }

    /* loaded from: classes4.dex */
    public final class TimeOutJourney implements Signal {
        public final UUID journeyId;

        public TimeOutJourney(UUID uuid) {
            uuid.getClass();
            this.journeyId = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeOutJourney) && Intrinsics.areEqual(this.journeyId, ((TimeOutJourney) obj).journeyId);
        }

        public final UUID getJourneyId() {
            return this.journeyId;
        }

        public final int hashCode() {
            return this.journeyId.hashCode();
        }

        public final String toString() {
            return "TimeOutJourney(journeyId=" + this.journeyId + ")";
        }
    }
}
