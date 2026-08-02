package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreateReceiptResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/ToggleScreen$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateReceiptResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateReceiptResponse> CREATOR;
    public final List receipt_sent_to;
    public final String receipt_url;

    static {
        CreateReceiptResponse$Companion$ADAPTER$1 createReceiptResponse$Companion$ADAPTER$1 = new CreateReceiptResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateReceiptResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.CreateReceiptResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/listing.proto");
        ADAPTER = createReceiptResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createReceiptResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateReceiptResponse(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.receipt_url = str;
        this.receipt_sent_to = TransactorKt.immutableCopyOf("receipt_sent_to", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateReceiptResponse)) {
            return false;
        }
        CreateReceiptResponse createReceiptResponse = (CreateReceiptResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createReceiptResponse.unknownFields()) && Intrinsics.areEqual(this.receipt_url, createReceiptResponse.receipt_url) && Intrinsics.areEqual(this.receipt_sent_to, createReceiptResponse.receipt_sent_to);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.receipt_url;
        int hashCode2 = this.receipt_sent_to.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(8, false);
        builder.toggle_title = this.receipt_url;
        builder.sections = this.receipt_sent_to;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.receipt_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "receipt_url=", arrayList);
        }
        if (!this.receipt_sent_to.isEmpty()) {
            arrayList.add("receipt_sent_to=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateReceiptResponse{", "}", 0, null, null, 56);
    }
}
