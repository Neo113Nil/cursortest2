package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.InputValue;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetBrandCollectionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/InputValue$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetBrandCollectionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBrandCollectionResponse> CREATOR;
    public final BrandCollection brand_collection;
    public final Long expires_at;

    static {
        GetBrandCollectionResponse$Companion$ADAPTER$1 getBrandCollectionResponse$Companion$ADAPTER$1 = new GetBrandCollectionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBrandCollectionResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetBrandCollectionResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getBrandCollectionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBrandCollectionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBrandCollectionResponse(BrandCollection brandCollection, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand_collection = brandCollection;
        this.expires_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBrandCollectionResponse)) {
            return false;
        }
        GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBrandCollectionResponse.unknownFields()) && Intrinsics.areEqual(this.brand_collection, getBrandCollectionResponse.brand_collection) && Intrinsics.areEqual(this.expires_at, getBrandCollectionResponse.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BrandCollection brandCollection = this.brand_collection;
        int hashCode2 = (hashCode + (brandCollection != null ? brandCollection.hashCode() : 0)) * 37;
        Long l = this.expires_at;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(8);
        builder.input_id = this.brand_collection;
        builder.value = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BrandCollection brandCollection = this.brand_collection;
        if (brandCollection != null) {
            arrayList.add("brand_collection=" + brandCollection);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBrandCollectionResponse{", "}", 0, null, null, 56);
    }
}
