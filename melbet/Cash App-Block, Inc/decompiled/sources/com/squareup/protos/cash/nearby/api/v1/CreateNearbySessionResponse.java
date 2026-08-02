package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/nearby/api/v1/CreateNearbySessionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/GiftCard$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateNearbySessionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateNearbySessionResponse> CREATOR;
    public final ConnectionData connection_data;
    public final Long expired_at_millis;
    public final NearbySession nearby_session;
    public final ByteString nearby_session_uuid;

    static {
        CreateNearbySessionResponse$Companion$ADAPTER$1 createNearbySessionResponse$Companion$ADAPTER$1 = new CreateNearbySessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateNearbySessionResponse.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.CreateNearbySessionResponse", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/endpoint_create_nearby_session.proto");
        ADAPTER = createNearbySessionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createNearbySessionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateNearbySessionResponse(NearbySession nearbySession, ConnectionData connectionData, ByteString byteString, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.nearby_session = nearbySession;
        this.connection_data = connectionData;
        this.nearby_session_uuid = byteString;
        this.expired_at_millis = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateNearbySessionResponse)) {
            return false;
        }
        CreateNearbySessionResponse createNearbySessionResponse = (CreateNearbySessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createNearbySessionResponse.unknownFields()) && Intrinsics.areEqual(this.nearby_session, createNearbySessionResponse.nearby_session) && Intrinsics.areEqual(this.connection_data, createNearbySessionResponse.connection_data) && Intrinsics.areEqual(this.nearby_session_uuid, createNearbySessionResponse.nearby_session_uuid) && Intrinsics.areEqual(this.expired_at_millis, createNearbySessionResponse.expired_at_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NearbySession nearbySession = this.nearby_session;
        int hashCode2 = (hashCode + (nearbySession != null ? nearbySession.hashCode() : 0)) * 37;
        ConnectionData connectionData = this.connection_data;
        int hashCode3 = (hashCode2 + (connectionData != null ? connectionData.hashCode() : 0)) * 37;
        ByteString byteString = this.nearby_session_uuid;
        int hashCode4 = (hashCode3 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Long l = this.expired_at_millis;
        int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(26, false);
        builder.id = this.nearby_session;
        builder.last_4 = this.connection_data;
        builder.gift_card_id = this.nearby_session_uuid;
        builder.gift_card_amount = this.expired_at_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NearbySession nearbySession = this.nearby_session;
        if (nearbySession != null) {
            arrayList.add("nearby_session=" + nearbySession);
        }
        ConnectionData connectionData = this.connection_data;
        if (connectionData != null) {
            arrayList.add("connection_data=" + connectionData);
        }
        ByteString byteString = this.nearby_session_uuid;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("nearby_session_uuid=", byteString, arrayList);
        }
        Long l = this.expired_at_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expired_at_millis=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateNearbySessionResponse{", "}", 0, null, null, 56);
    }
}
