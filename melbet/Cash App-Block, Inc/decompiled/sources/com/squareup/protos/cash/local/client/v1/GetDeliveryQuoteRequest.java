package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetDeliveryQuoteRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDeliveryQuoteRequest> CREATOR;
    public final LocalAddress address;
    public final String anonymous_user_app_token;
    public final String brand_token;
    public final List location_tokens;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetDeliveryQuoteRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetDeliveryQuoteRequest((String) obj, (LocalAddress) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetDeliveryQuoteRequest getDeliveryQuoteRequest = (GetDeliveryQuoteRequest) obj;
                reverseProtoWriter.getClass();
                getDeliveryQuoteRequest.getClass();
                reverseProtoWriter.writeBytes(getDeliveryQuoteRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, getDeliveryQuoteRequest.location_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getDeliveryQuoteRequest.anonymous_user_app_token);
                LocalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getDeliveryQuoteRequest.address);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getDeliveryQuoteRequest.brand_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetDeliveryQuoteRequest getDeliveryQuoteRequest = (GetDeliveryQuoteRequest) obj;
                getDeliveryQuoteRequest.getClass();
                int size$okio = getDeliveryQuoteRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(4, getDeliveryQuoteRequest.location_tokens) + protoAdapter2.encodedSizeWithTag(3, getDeliveryQuoteRequest.anonymous_user_app_token) + LocalAddress.ADAPTER.encodedSizeWithTag(2, getDeliveryQuoteRequest.address) + protoAdapter2.encodedSizeWithTag(1, getDeliveryQuoteRequest.brand_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetDeliveryQuoteRequest getDeliveryQuoteRequest = (GetDeliveryQuoteRequest) obj;
                getDeliveryQuoteRequest.getClass();
                LocalAddress localAddress = getDeliveryQuoteRequest.address;
                LocalAddress localAddress2 = localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = getDeliveryQuoteRequest.brand_token;
                String str2 = getDeliveryQuoteRequest.anonymous_user_app_token;
                List list = getDeliveryQuoteRequest.location_tokens;
                list.getClass();
                byteString.getClass();
                return new GetDeliveryQuoteRequest(str, localAddress2, str2, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetDeliveryQuoteRequest getDeliveryQuoteRequest = (GetDeliveryQuoteRequest) obj;
                getDeliveryQuoteRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getDeliveryQuoteRequest.brand_token);
                LocalAddress.ADAPTER.encodeWithTag(protoWriter, 2, getDeliveryQuoteRequest.address);
                protoAdapter2.encodeWithTag(protoWriter, 3, getDeliveryQuoteRequest.anonymous_user_app_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, getDeliveryQuoteRequest.location_tokens);
                protoWriter.writeBytes(getDeliveryQuoteRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeliveryQuoteRequest(String str, LocalAddress localAddress, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.brand_token = str;
        this.address = localAddress;
        this.anonymous_user_app_token = str2;
        this.location_tokens = TransactorKt.immutableCopyOf("location_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDeliveryQuoteRequest)) {
            return false;
        }
        GetDeliveryQuoteRequest getDeliveryQuoteRequest = (GetDeliveryQuoteRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getDeliveryQuoteRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, getDeliveryQuoteRequest.brand_token) && Intrinsics.areEqual(this.address, getDeliveryQuoteRequest.address) && Intrinsics.areEqual(this.anonymous_user_app_token, getDeliveryQuoteRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.location_tokens, getDeliveryQuoteRequest.location_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalAddress localAddress = this.address;
        int hashCode3 = (hashCode2 + (localAddress != null ? localAddress.hashCode() : 0)) * 37;
        String str2 = this.anonymous_user_app_token;
        int hashCode4 = this.location_tokens.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(3);
        builder.id = this.brand_token;
        builder.gift_card_id = this.address;
        builder.last_4 = this.anonymous_user_app_token;
        builder.gift_card_amount = this.location_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
        }
        LocalAddress localAddress = this.address;
        if (localAddress != null) {
            arrayList.add("address=" + localAddress);
        }
        String str2 = this.anonymous_user_app_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "anonymous_user_app_token=", arrayList);
        }
        List list = this.location_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("location_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDeliveryQuoteRequest{", "}", 0, null, null, 56);
    }
}
