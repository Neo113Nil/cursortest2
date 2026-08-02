package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreateListingResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aliases/Cashtag$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateListingResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateListingResponse> CREATOR;
    public final String listing_token;
    public final String listing_url;

    static {
        CreateListingResponse$Companion$ADAPTER$1 createListingResponse$Companion$ADAPTER$1 = new CreateListingResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateListingResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.CreateListingResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/listing.proto");
        ADAPTER = createListingResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createListingResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateListingResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.listing_token = str;
        this.listing_url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateListingResponse)) {
            return false;
        }
        CreateListingResponse createListingResponse = (CreateListingResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createListingResponse.unknownFields()) && Intrinsics.areEqual(this.listing_token, createListingResponse.listing_token) && Intrinsics.areEqual(this.listing_url, createListingResponse.listing_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.listing_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.listing_url;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(12);
        builder.prefix = this.listing_token;
        builder.name = this.listing_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.listing_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "listing_token=", arrayList);
        }
        String str2 = this.listing_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "listing_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateListingResponse{", "}", 0, null, null, 56);
    }
}
