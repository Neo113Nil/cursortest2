package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "sections", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "", "expire_section_after", "Ljava/lang/Long;", "Companion", "Builder", "Sections", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySection> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long expire_section_after;

    @WireSealedOneof(schemaIndex = 0)
    public final Sections sections;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection;", "<init>", "()V", "sections", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "expire_section_after", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long expire_section_after;
        public Sections sections;

        @Override // com.squareup.wire.Message.Builder
        public ActivitySection build() {
            return new ActivitySection(this.sections, this.expire_section_after, buildUnknownFields());
        }

        public final Builder expire_section_after(Long expire_section_after) {
            this.expire_section_after = expire_section_after;
            return this;
        }

        public final Builder sections(Sections sections) {
            this.sections = sections;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "", "PendingSection", "UpcomingSection", "CompletedSection", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections$CompletedSection;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections$PendingSection;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections$UpcomingSection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Sections {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.CompletedSection#ADAPTER", declaredName = "completed_section", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections$CompletedSection;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "Lcom/squareup/protos/cash/activity/api/v1/CompletedSection;", "value", "Lcom/squareup/protos/cash/activity/api/v1/CompletedSection;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/CompletedSection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CompletedSection extends Sections {
            private final com.squareup.protos.cash.activity.api.v1.CompletedSection value;

            public CompletedSection(com.squareup.protos.cash.activity.api.v1.CompletedSection completedSection) {
                completedSection.getClass();
                this.value = completedSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompletedSection) && Intrinsics.areEqual(this.value, ((CompletedSection) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.CompletedSection getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CompletedSection(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PendingSection#ADAPTER", declaredName = "pending_section", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections$PendingSection;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "Lcom/squareup/protos/cash/activity/api/v1/PendingSection;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PendingSection;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PendingSection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PendingSection extends Sections {
            private final com.squareup.protos.cash.activity.api.v1.PendingSection value;

            public PendingSection(com.squareup.protos.cash.activity.api.v1.PendingSection pendingSection) {
                pendingSection.getClass();
                this.value = pendingSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingSection) && Intrinsics.areEqual(this.value, ((PendingSection) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.PendingSection getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PendingSection(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.UpcomingSection#ADAPTER", declaredName = "upcoming_section", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections$UpcomingSection;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection$Sections;", "Lcom/squareup/protos/cash/activity/api/v1/UpcomingSection;", "value", "Lcom/squareup/protos/cash/activity/api/v1/UpcomingSection;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/UpcomingSection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UpcomingSection extends Sections {
            private final com.squareup.protos.cash.activity.api.v1.UpcomingSection value;

            public UpcomingSection(com.squareup.protos.cash.activity.api.v1.UpcomingSection upcomingSection) {
                upcomingSection.getClass();
                this.value = upcomingSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpcomingSection) && Intrinsics.areEqual(this.value, ((UpcomingSection) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.UpcomingSection getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "UpcomingSection(value=" + this.value + ")";
            }
        }
    }

    static {
        ActivitySection$Companion$ADAPTER$1 activitySection$Companion$ADAPTER$1 = new ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/models.proto");
        ADAPTER = activitySection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySection(Sections sections, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sections = sections;
        this.expire_section_after = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySection)) {
            return false;
        }
        ActivitySection activitySection = (ActivitySection) obj;
        return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.sections, activitySection.sections) && Intrinsics.areEqual(this.expire_section_after, activitySection.expire_section_after);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Sections sections = this.sections;
        int hashCode2 = (hashCode + (sections != null ? sections.hashCode() : 0)) * 37;
        Long l = this.expire_section_after;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sections = this.sections;
        builder.expire_section_after = this.expire_section_after;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Sections sections = this.sections;
        if (sections != null) {
            arrayList.add("sections=" + sections);
        }
        Long l = this.expire_section_after;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_section_after=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
    }
}
