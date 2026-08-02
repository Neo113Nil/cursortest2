package com.squareup.protos.cash.incidentalerts.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Incident extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Incident> CREATOR;
    public final Boolean customer_can_change_subscription;
    public final Boolean customer_subscribed;
    public final String details;
    public final String id;
    public final Long reported_at;
    public final Long resolved_at;
    public final Status status;
    public final String title;
    public final Workflow workflow;

    public enum Status implements WireEnum {
        INCIDENT_UNSPECIFIED(0),
        INVESTIGATING(1),
        IDENTIFIED(2),
        RESOLVED(3);

        public static final Incident$Status$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            Status status = INCIDENT_UNSPECIFIED;
            Companion = new RetailerType.Companion();
            ADAPTER = new Incident$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INCIDENT_UNSPECIFIED;
            }
            if (i == 1) {
                return INVESTIGATING;
            }
            if (i == 2) {
                return IDENTIFIED;
            }
            if (i != 3) {
                return null;
            }
            return RESOLVED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Workflow implements WireEnum {
        WORKFLOW_UNSPECIFIED(0),
        SEND_VIA_FLACK(1);

        public static final Incident$Workflow$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            Workflow workflow = WORKFLOW_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new Incident$Workflow$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Workflow.class), Syntax.PROTO_2, workflow);
        }

        Workflow(int i) {
            this.value = i;
        }

        public static final Workflow fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return WORKFLOW_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return SEND_VIA_FLACK;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Incident$Companion$ADAPTER$1 incident$Companion$ADAPTER$1 = new Incident$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Incident.class), "type.googleapis.com/squareup.cash.incidentalerts.app.v1.Incident", Syntax.PROTO_2, null, "squareup/cash/incidentalerts/app/v1/app.proto");
        ADAPTER = incident$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(incident$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Incident(String str, String str2, String str3, Long l, Boolean bool, Status status, Long l2, Boolean bool2, Workflow workflow, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.title = str2;
        this.details = str3;
        this.reported_at = l;
        this.customer_subscribed = bool;
        this.status = status;
        this.resolved_at = l2;
        this.customer_can_change_subscription = bool2;
        this.workflow = workflow;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Incident)) {
            return false;
        }
        Incident incident = (Incident) obj;
        return Intrinsics.areEqual(unknownFields(), incident.unknownFields()) && Intrinsics.areEqual(this.id, incident.id) && Intrinsics.areEqual(this.title, incident.title) && Intrinsics.areEqual(this.details, incident.details) && Intrinsics.areEqual(this.reported_at, incident.reported_at) && Intrinsics.areEqual(this.customer_subscribed, incident.customer_subscribed) && this.status == incident.status && Intrinsics.areEqual(this.resolved_at, incident.resolved_at) && Intrinsics.areEqual(this.customer_can_change_subscription, incident.customer_can_change_subscription) && this.workflow == incident.workflow;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.details;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.reported_at;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.customer_subscribed;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Status status = this.status;
        int hashCode7 = (hashCode6 + (status != null ? status.hashCode() : 0)) * 37;
        Long l2 = this.resolved_at;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Boolean bool2 = this.customer_can_change_subscription;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Workflow workflow = this.workflow;
        int hashCode10 = hashCode9 + (workflow != null ? workflow.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(19, false);
        builder.locale = this.id;
        builder.title = this.title;
        builder.info_rows_header = this.details;
        builder.footer_text = this.reported_at;
        builder.loadable_subtitle = this.customer_subscribed;
        builder.info_rows = this.status;
        builder.primary_footer_button_state = this.resolved_at;
        builder.secondary_footer_button_state = this.customer_can_change_subscription;
        builder.payment_plans_data = this.workflow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.details;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "details=", arrayList);
        }
        Long l = this.reported_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reported_at=", l, arrayList);
        }
        Boolean bool = this.customer_subscribed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_subscribed=", bool, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Long l2 = this.resolved_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resolved_at=", l2, arrayList);
        }
        Boolean bool2 = this.customer_can_change_subscription;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_can_change_subscription=", bool2, arrayList);
        }
        Workflow workflow = this.workflow;
        if (workflow != null) {
            arrayList.add("workflow=" + workflow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Incident{", "}", 0, null, null, 56);
    }
}
