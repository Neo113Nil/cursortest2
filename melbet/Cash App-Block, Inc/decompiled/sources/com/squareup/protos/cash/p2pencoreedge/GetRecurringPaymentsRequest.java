package com.squareup.protos.cash.p2pencoreedge;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.p2pencoreedge.plasma.flows.Type;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetRecurringPaymentsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRecurringPaymentsRequest> CREATOR;
    public final Boolean include_canceled;
    public final String recipient_token;
    public final String sender_token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1320type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetRecurringPaymentsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetRecurringPaymentsRequest((String) obj, (String) obj2, (Type) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetRecurringPaymentsRequest getRecurringPaymentsRequest = (GetRecurringPaymentsRequest) obj;
                reverseProtoWriter.getClass();
                getRecurringPaymentsRequest.getClass();
                reverseProtoWriter.writeBytes(getRecurringPaymentsRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, getRecurringPaymentsRequest.include_canceled);
                Type.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getRecurringPaymentsRequest.f1320type);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getRecurringPaymentsRequest.recipient_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getRecurringPaymentsRequest.sender_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetRecurringPaymentsRequest getRecurringPaymentsRequest = (GetRecurringPaymentsRequest) obj;
                getRecurringPaymentsRequest.getClass();
                int size$okio = getRecurringPaymentsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, getRecurringPaymentsRequest.include_canceled) + Type.ADAPTER.encodedSizeWithTag(3, getRecurringPaymentsRequest.f1320type) + protoAdapter2.encodedSizeWithTag(2, getRecurringPaymentsRequest.recipient_token) + protoAdapter2.encodedSizeWithTag(1, getRecurringPaymentsRequest.sender_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetRecurringPaymentsRequest getRecurringPaymentsRequest = (GetRecurringPaymentsRequest) obj;
                getRecurringPaymentsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getRecurringPaymentsRequest.sender_token;
                String str2 = getRecurringPaymentsRequest.recipient_token;
                Type type2 = getRecurringPaymentsRequest.f1320type;
                Boolean bool = getRecurringPaymentsRequest.include_canceled;
                byteString.getClass();
                return new GetRecurringPaymentsRequest(str, str2, type2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetRecurringPaymentsRequest getRecurringPaymentsRequest = (GetRecurringPaymentsRequest) obj;
                getRecurringPaymentsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getRecurringPaymentsRequest.sender_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getRecurringPaymentsRequest.recipient_token);
                Type.ADAPTER.encodeWithTag(protoWriter, 3, getRecurringPaymentsRequest.f1320type);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getRecurringPaymentsRequest.include_canceled);
                protoWriter.writeBytes(getRecurringPaymentsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecurringPaymentsRequest(String str, String str2, Type type2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sender_token = str;
        this.recipient_token = str2;
        this.f1320type = type2;
        this.include_canceled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRecurringPaymentsRequest)) {
            return false;
        }
        GetRecurringPaymentsRequest getRecurringPaymentsRequest = (GetRecurringPaymentsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getRecurringPaymentsRequest.unknownFields()) && Intrinsics.areEqual(this.sender_token, getRecurringPaymentsRequest.sender_token) && Intrinsics.areEqual(this.recipient_token, getRecurringPaymentsRequest.recipient_token) && this.f1320type == getRecurringPaymentsRequest.f1320type && Intrinsics.areEqual(this.include_canceled, getRecurringPaymentsRequest.include_canceled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sender_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.recipient_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Type type2 = this.f1320type;
        int hashCode4 = (hashCode3 + (type2 != null ? type2.hashCode() : 0)) * 37;
        Boolean bool = this.include_canceled;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(27, false);
        builder.id = this.sender_token;
        builder.last_4 = this.recipient_token;
        builder.gift_card_id = this.f1320type;
        builder.gift_card_amount = this.include_canceled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sender_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sender_token=", arrayList);
        }
        String str2 = this.recipient_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "recipient_token=", arrayList);
        }
        Type type2 = this.f1320type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Boolean bool = this.include_canceled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_canceled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRecurringPaymentsRequest{", "}", 0, null, null, 56);
    }
}
