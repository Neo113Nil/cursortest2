package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.idv.DisplayName;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayOrderDocumentUrlResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/idv/DisplayName$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAfterpayOrderDocumentUrlResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAfterpayOrderDocumentUrlResponse> CREATOR;
    public final String document_url;

    static {
        GetAfterpayOrderDocumentUrlResponse$Companion$ADAPTER$1 getAfterpayOrderDocumentUrlResponse$Companion$ADAPTER$1 = new GetAfterpayOrderDocumentUrlResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAfterpayOrderDocumentUrlResponse.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.GetAfterpayOrderDocumentUrlResponse", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_orders.proto");
        ADAPTER = getAfterpayOrderDocumentUrlResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAfterpayOrderDocumentUrlResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAfterpayOrderDocumentUrlResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.document_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAfterpayOrderDocumentUrlResponse)) {
            return false;
        }
        GetAfterpayOrderDocumentUrlResponse getAfterpayOrderDocumentUrlResponse = (GetAfterpayOrderDocumentUrlResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAfterpayOrderDocumentUrlResponse.unknownFields()) && Intrinsics.areEqual(this.document_url, getAfterpayOrderDocumentUrlResponse.document_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.document_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(26);
        builder.display_name = this.document_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.document_url != null) {
            arrayList.add("document_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAfterpayOrderDocumentUrlResponse{", "}", 0, null, null, 56);
    }
}
