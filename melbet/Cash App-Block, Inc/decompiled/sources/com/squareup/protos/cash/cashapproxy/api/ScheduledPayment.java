package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ScheduledPayment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledPayment> CREATOR;
    public final Money amount;
    public final ScheduledPaymentDetails details;
    public final ScheduledPaymentStatus status;
    public final Text subtitle;
    public final Text title;

    static {
        ScheduledPayment$Companion$ADAPTER$1 scheduledPayment$Companion$ADAPTER$1 = new ScheduledPayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledPayment.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.ScheduledPayment", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = scheduledPayment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledPayment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPayment(Text text, Text text2, Money money, ScheduledPaymentStatus scheduledPaymentStatus, ScheduledPaymentDetails scheduledPaymentDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.subtitle = text2;
        this.amount = money;
        this.status = scheduledPaymentStatus;
        this.details = scheduledPaymentDetails;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledPayment)) {
            return false;
        }
        ScheduledPayment scheduledPayment = (ScheduledPayment) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledPayment.unknownFields()) && Intrinsics.areEqual(this.title, scheduledPayment.title) && Intrinsics.areEqual(this.subtitle, scheduledPayment.subtitle) && Intrinsics.areEqual(this.amount, scheduledPayment.amount) && this.status == scheduledPayment.status && Intrinsics.areEqual(this.details, scheduledPayment.details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.subtitle;
        int hashCode3 = (hashCode2 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        ScheduledPaymentStatus scheduledPaymentStatus = this.status;
        int hashCode5 = (hashCode4 + (scheduledPaymentStatus != null ? scheduledPaymentStatus.hashCode() : 0)) * 37;
        ScheduledPaymentDetails scheduledPaymentDetails = this.details;
        int hashCode6 = hashCode5 + (scheduledPaymentDetails != null ? scheduledPaymentDetails.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(22);
        builder.for_each = this.title;
        builder.moneybot_scaffold = this.subtitle;
        builder.compose_platform = this.amount;
        builder.is_included = this.status;
        builder.motion = this.details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        ScheduledPaymentStatus scheduledPaymentStatus = this.status;
        if (scheduledPaymentStatus != null) {
            arrayList.add("status=" + scheduledPaymentStatus);
        }
        ScheduledPaymentDetails scheduledPaymentDetails = this.details;
        if (scheduledPaymentDetails != null) {
            arrayList.add("details=" + scheduledPaymentDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledPayment{", "}", 0, null, null, 56);
    }
}
