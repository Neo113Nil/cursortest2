package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction$Builder;", "", "saved_report_uuid", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy;", "email_report_policy", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendReportingDataAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendReportingDataAction> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ScheduledReportEmailPolicy#ADAPTER", schemaIndex = 1, tag = 2)
    public final ScheduledReportEmailPolicy email_report_policy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String saved_report_uuid;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction;", "<init>", "()V", "saved_report_uuid", "", "email_report_policy", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ScheduledReportEmailPolicy email_report_policy;
        public String saved_report_uuid;

        @Override // com.squareup.wire.Message.Builder
        public SendReportingDataAction build() {
            return new SendReportingDataAction(this.saved_report_uuid, this.email_report_policy, buildUnknownFields());
        }

        public final Builder email_report_policy(ScheduledReportEmailPolicy email_report_policy) {
            this.email_report_policy = email_report_policy;
            return this;
        }

        public final Builder saved_report_uuid(String saved_report_uuid) {
            this.saved_report_uuid = saved_report_uuid;
            return this;
        }
    }

    static {
        SendReportingDataAction$Companion$ADAPTER$1 sendReportingDataAction$Companion$ADAPTER$1 = new SendReportingDataAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SendReportingDataAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.SendReportingDataAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = sendReportingDataAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sendReportingDataAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendReportingDataAction(String str, ScheduledReportEmailPolicy scheduledReportEmailPolicy, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.saved_report_uuid = str;
        this.email_report_policy = scheduledReportEmailPolicy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendReportingDataAction)) {
            return false;
        }
        SendReportingDataAction sendReportingDataAction = (SendReportingDataAction) obj;
        return Intrinsics.areEqual(unknownFields(), sendReportingDataAction.unknownFields()) && Intrinsics.areEqual(this.saved_report_uuid, sendReportingDataAction.saved_report_uuid) && Intrinsics.areEqual(this.email_report_policy, sendReportingDataAction.email_report_policy);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.saved_report_uuid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = this.email_report_policy;
        int hashCode3 = hashCode2 + (scheduledReportEmailPolicy != null ? scheduledReportEmailPolicy.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.saved_report_uuid = this.saved_report_uuid;
        builder.email_report_policy = this.email_report_policy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.saved_report_uuid;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "saved_report_uuid=", arrayList);
        }
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = this.email_report_policy;
        if (scheduledReportEmailPolicy != null) {
            arrayList.add("email_report_policy=" + scheduledReportEmailPolicy);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendReportingDataAction{", "}", 0, null, null, 56);
    }
}
