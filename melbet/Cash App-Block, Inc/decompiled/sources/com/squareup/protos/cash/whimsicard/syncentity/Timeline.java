package com.squareup.protos.cash.whimsicard.syncentity;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Timeline extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Timeline> CREATOR;
    public final Action action;
    public final TimelineIcon icon;
    public final List steps;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    public final class Step extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Step> CREATOR;
        public final LocalizedString date;
        public final StepStyle style;
        public final LocalizedString title;

        public enum StepStyle implements WireEnum {
            STEP_STYLE_UNSPECIFIED(0),
            COMPLETED(1),
            IN_PROGRESS(2),
            UPCOMING(3);

            public static final Timeline$Step$StepStyle$Companion$ADAPTER$1 ADAPTER;
            public static final TaxEnvironment.Companion Companion;
            public final int value;

            static {
                StepStyle stepStyle = STEP_STYLE_UNSPECIFIED;
                Companion = new TaxEnvironment.Companion();
                ADAPTER = new Timeline$Step$StepStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StepStyle.class), Syntax.PROTO_2, stepStyle);
            }

            StepStyle(int i) {
                this.value = i;
            }

            public static final StepStyle fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return STEP_STYLE_UNSPECIFIED;
                }
                if (i == 1) {
                    return COMPLETED;
                }
                if (i == 2) {
                    return IN_PROGRESS;
                }
                if (i != 3) {
                    return null;
                }
                return UPCOMING;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Timeline$Step$Companion$ADAPTER$1 timeline$Step$Companion$ADAPTER$1 = new Timeline$Step$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Step.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.Timeline.Step", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
            ADAPTER = timeline$Step$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(timeline$Step$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Step(LocalizedString localizedString, LocalizedString localizedString2, StepStyle stepStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.date = localizedString2;
            this.style = stepStyle;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return Intrinsics.areEqual(unknownFields(), step.unknownFields()) && Intrinsics.areEqual(this.title, step.title) && Intrinsics.areEqual(this.date, step.date) && this.style == step.style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.date;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            StepStyle stepStyle = this.style;
            int hashCode4 = hashCode3 + (stepStyle != null ? stepStyle.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAlias.Builder builder = new UiAlias.Builder(6);
            builder.f1364type = this.title;
            builder.canonical_text = this.date;
            builder.formatted = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.date;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("date=", localizedString2, arrayList);
            }
            StepStyle stepStyle = this.style;
            if (stepStyle != null) {
                arrayList.add("style=" + stepStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Step{", "}", 0, null, null, 56);
        }
    }

    public enum TimelineIcon implements WireEnum {
        TIMELINE_ICON_UNSPECIFIED(0),
        CHECKMARK(1),
        PACKAGE(2),
        TRUCK(3),
        CHECKMARK_SUCCESS(4);

        public static final Timeline$TimelineIcon$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            TimelineIcon timelineIcon = TIMELINE_ICON_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new Timeline$TimelineIcon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TimelineIcon.class), Syntax.PROTO_2, timelineIcon);
        }

        TimelineIcon(int i) {
            this.value = i;
        }

        public static final TimelineIcon fromValue(int i) {
            Companion.getClass();
            return TextSize.Companion.m3922fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Timeline$Companion$ADAPTER$1 timeline$Companion$ADAPTER$1 = new Timeline$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Timeline.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.Timeline", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
        ADAPTER = timeline$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timeline$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline(TimelineIcon timelineIcon, LocalizedString localizedString, LocalizedString localizedString2, List list, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.icon = timelineIcon;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.action = action;
        this.steps = TransactorKt.immutableCopyOf("steps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        return Intrinsics.areEqual(unknownFields(), timeline.unknownFields()) && this.icon == timeline.icon && Intrinsics.areEqual(this.title, timeline.title) && Intrinsics.areEqual(this.subtitle, timeline.subtitle) && Intrinsics.areEqual(this.steps, timeline.steps) && Intrinsics.areEqual(this.action, timeline.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TimelineIcon timelineIcon = this.icon;
        int hashCode2 = (hashCode + (timelineIcon != null ? timelineIcon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.steps);
        Action action = this.action;
        int hashCode4 = m + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(23, false);
        builder.instant_usec = this.icon;
        builder.ordinal = this.title;
        builder.timezone_offset_min = this.subtitle;
        builder.tz_name = this.steps;
        builder.posix_tz = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TimelineIcon timelineIcon = this.icon;
        if (timelineIcon != null) {
            arrayList.add("icon=" + timelineIcon);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        List list = this.steps;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("steps=", arrayList, list);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Timeline{", "}", 0, null, null, 56);
    }
}
