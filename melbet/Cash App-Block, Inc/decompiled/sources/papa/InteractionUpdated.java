package papa;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import papa.InteractionEngine;

/* loaded from: classes3.dex */
public interface InteractionUpdated {

    public final class CanceledOnEvent implements InteractionUpdated {
        public final SentEvent event;
        public final InteractionEngine.RealRunningInteraction interaction;
        public final String reason;

        public CanceledOnEvent(SentEvent sentEvent, InteractionEngine.RealRunningInteraction realRunningInteraction, String str) {
            sentEvent.getClass();
            this.event = sentEvent;
            this.interaction = realRunningInteraction;
            this.reason = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CanceledOnEvent) {
                CanceledOnEvent canceledOnEvent = (CanceledOnEvent) obj;
                if (Intrinsics.areEqual(this.event, canceledOnEvent.event) && this.interaction == canceledOnEvent.interaction && this.reason.equals(canceledOnEvent.reason)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.reason.hashCode() + ((this.interaction.hashCode() + (this.event.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CanceledOnEvent(event=");
            sb.append(this.event);
            sb.append(", interaction=");
            sb.append(this.interaction);
            sb.append(", reason=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.reason, ')');
        }
    }

    public final class CanceledOnTimeout implements InteractionUpdated {
        public final InteractionEngine.RealRunningInteraction interaction;
        public final long timeout;

        public CanceledOnTimeout(long j, InteractionEngine.RealRunningInteraction realRunningInteraction) {
            this.timeout = j;
            this.interaction = realRunningInteraction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CanceledOnTimeout)) {
                return false;
            }
            CanceledOnTimeout canceledOnTimeout = (CanceledOnTimeout) obj;
            return Duration.m4166equalsimpl0(this.timeout, canceledOnTimeout.timeout) && this.interaction.equals(canceledOnTimeout.interaction);
        }

        public final int hashCode() {
            Duration.Companion companion = Duration.Companion;
            return this.interaction.hashCode() + (Long.hashCode(this.timeout) * 31);
        }

        public final String toString() {
            return "CanceledOnTimeout(timeout=" + ((Object) Duration.m4177toStringimpl(this.timeout)) + ", interaction=" + this.interaction + ')';
        }
    }

    public final class EventRecorded implements InteractionUpdated {
        public final SentEvent event;
        public final InteractionEngine.RealRunningInteraction interaction;

        public EventRecorded(SentEvent sentEvent, InteractionEngine.RealRunningInteraction realRunningInteraction) {
            sentEvent.getClass();
            this.event = sentEvent;
            this.interaction = realRunningInteraction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EventRecorded) {
                EventRecorded eventRecorded = (EventRecorded) obj;
                return Intrinsics.areEqual(this.event, eventRecorded.event) && this.interaction == eventRecorded.interaction;
            }
            return false;
        }

        public final int hashCode() {
            return this.interaction.hashCode() + (this.event.hashCode() * 31);
        }

        public final String toString() {
            return "EventRecorded(event=" + this.event + ", interaction=" + this.interaction + ')';
        }
    }

    public final class Finished implements InteractionUpdated {
        public final SentEvent event;
        public final InteractionEngine.RealRunningInteraction interaction;

        public Finished(SentEvent sentEvent, InteractionEngine.RealRunningInteraction realRunningInteraction) {
            sentEvent.getClass();
            this.event = sentEvent;
            this.interaction = realRunningInteraction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Finished) {
                Finished finished = (Finished) obj;
                return Intrinsics.areEqual(this.event, finished.event) && this.interaction == finished.interaction;
            }
            return false;
        }

        public final int hashCode() {
            return this.interaction.hashCode() + (this.event.hashCode() * 31);
        }

        public final String toString() {
            return "Finished(event=" + this.event + ", interaction=" + this.interaction + ')';
        }
    }

    public final class FrameRendered implements InteractionUpdated {
        public final SentEvent event;
        public final long frameRenderedUptime;
        public final InteractionEngine.RealRunningInteraction interaction;

        public FrameRendered(SentEvent sentEvent, InteractionEngine.RealRunningInteraction realRunningInteraction, long j) {
            sentEvent.getClass();
            this.event = sentEvent;
            this.interaction = realRunningInteraction;
            this.frameRenderedUptime = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrameRendered)) {
                return false;
            }
            FrameRendered frameRendered = (FrameRendered) obj;
            return Intrinsics.areEqual(this.event, frameRendered.event) && this.interaction.equals(frameRendered.interaction) && Duration.m4166equalsimpl0(this.frameRenderedUptime, frameRendered.frameRenderedUptime);
        }

        public final int hashCode() {
            int hashCode = (this.interaction.hashCode() + (this.event.hashCode() * 31)) * 31;
            Duration.Companion companion = Duration.Companion;
            return Long.hashCode(this.frameRenderedUptime) + hashCode;
        }

        public final String toString() {
            return "FrameRendered(event=" + this.event + ", interaction=" + this.interaction + ", frameRenderedUptime=" + ((Object) Duration.m4177toStringimpl(this.frameRenderedUptime)) + ')';
        }
    }

    public final class Started implements InteractionUpdated {
        public final SentEvent event;
        public final InteractionEngine.RealRunningInteraction interaction;

        public Started(SentEvent sentEvent, InteractionEngine.RealRunningInteraction realRunningInteraction) {
            this.event = sentEvent;
            this.interaction = realRunningInteraction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Started)) {
                return false;
            }
            Started started = (Started) obj;
            return this.event == started.event && this.interaction == started.interaction;
        }

        public final int hashCode() {
            return this.interaction.hashCode() + (this.event.hashCode() * 31);
        }

        public final String toString() {
            return "Started(event=" + this.event + ", interaction=" + this.interaction + ')';
        }
    }
}
