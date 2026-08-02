package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashapproxy.api.SupTransactions;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ScheduledPaymentDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledPaymentDetails> CREATOR;
    public final List details;
    public final Text title;

    static {
        ScheduledPaymentDetails$Companion$ADAPTER$1 scheduledPaymentDetails$Companion$ADAPTER$1 = new ScheduledPaymentDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledPaymentDetails.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.ScheduledPaymentDetails", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = scheduledPaymentDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledPaymentDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPaymentDetails(Text text, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = text;
        this.details = TransactorKt.immutableCopyOf("details", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledPaymentDetails)) {
            return false;
        }
        ScheduledPaymentDetails scheduledPaymentDetails = (ScheduledPaymentDetails) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledPaymentDetails.unknownFields()) && Intrinsics.areEqual(this.title, scheduledPaymentDetails.title) && Intrinsics.areEqual(this.details, scheduledPaymentDetails.details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = this.details.hashCode() + ((hashCode + (text != null ? text.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupTransactions.Builder builder = new SupTransactions.Builder(1);
        builder.title = this.title;
        builder.rows = this.details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        List list = this.details;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledPaymentDetails{", "}", 0, null, null, 56);
    }
}
