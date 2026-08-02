package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/tax/OpenTaxResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/OpaqueRoute$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenTaxResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenTaxResponse> CREATOR;
    public final String flow_url;

    static {
        OpenTaxResponse$Companion$ADAPTER$1 openTaxResponse$Companion$ADAPTER$1 = new OpenTaxResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenTaxResponse.class), "type.googleapis.com/squareup.cash.tax.OpenTaxResponse", Syntax.PROTO_2, null, "squareup/cash/tax/tax_front_door_api.proto");
        ADAPTER = openTaxResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(openTaxResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTaxResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.flow_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenTaxResponse)) {
            return false;
        }
        OpenTaxResponse openTaxResponse = (OpenTaxResponse) obj;
        return Intrinsics.areEqual(unknownFields(), openTaxResponse.unknownFields()) && Intrinsics.areEqual(this.flow_url, openTaxResponse.flow_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.flow_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(2);
        builder.client_route = this.flow_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.flow_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenTaxResponse{", "}", 0, null, null, 56);
    }
}
