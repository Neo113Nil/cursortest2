package com.squareup.protos.cash.blockstable.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class InitiateWithdrawalRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateWithdrawalRequest> CREATOR;
    public final String asset;
    public final String chain;
    public final Money customer_supplied_amount;
    public final String destination_address;
    public final String destination_address_uri;
    public final String external_id;
    public final RequestContext request_context;
    public final String source_instrument_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateWithdrawalRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockstable.api.v1.InitiateWithdrawalRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateWithdrawalRequest((String) obj, (RequestContext) obj2, (String) obj3, (Money) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateWithdrawalRequest initiateWithdrawalRequest = (InitiateWithdrawalRequest) obj;
                reverseProtoWriter.getClass();
                initiateWithdrawalRequest.getClass();
                reverseProtoWriter.writeBytes(initiateWithdrawalRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, initiateWithdrawalRequest.destination_address_uri);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, initiateWithdrawalRequest.source_instrument_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, initiateWithdrawalRequest.asset);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, initiateWithdrawalRequest.chain);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, initiateWithdrawalRequest.customer_supplied_amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, initiateWithdrawalRequest.destination_address);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, initiateWithdrawalRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, initiateWithdrawalRequest.external_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateWithdrawalRequest initiateWithdrawalRequest = (InitiateWithdrawalRequest) obj;
                initiateWithdrawalRequest.getClass();
                int size$okio = initiateWithdrawalRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, initiateWithdrawalRequest.destination_address_uri) + protoAdapter2.encodedSizeWithTag(7, initiateWithdrawalRequest.source_instrument_token) + protoAdapter2.encodedSizeWithTag(6, initiateWithdrawalRequest.asset) + protoAdapter2.encodedSizeWithTag(5, initiateWithdrawalRequest.chain) + Money.ADAPTER.encodedSizeWithTag(4, initiateWithdrawalRequest.customer_supplied_amount) + protoAdapter2.encodedSizeWithTag(3, initiateWithdrawalRequest.destination_address) + RequestContext.ADAPTER.encodedSizeWithTag(2, initiateWithdrawalRequest.request_context) + protoAdapter2.encodedSizeWithTag(1, initiateWithdrawalRequest.external_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateWithdrawalRequest initiateWithdrawalRequest = (InitiateWithdrawalRequest) obj;
                initiateWithdrawalRequest.getClass();
                RequestContext requestContext = initiateWithdrawalRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = initiateWithdrawalRequest.customer_supplied_amount;
                return InitiateWithdrawalRequest.copy$default(initiateWithdrawalRequest, requestContext2, money != null ? (Money) Money.ADAPTER.redact(money) : null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateWithdrawalRequest initiateWithdrawalRequest = (InitiateWithdrawalRequest) obj;
                initiateWithdrawalRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, initiateWithdrawalRequest.external_id);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, initiateWithdrawalRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 3, initiateWithdrawalRequest.destination_address);
                Money.ADAPTER.encodeWithTag(protoWriter, 4, initiateWithdrawalRequest.customer_supplied_amount);
                protoAdapter2.encodeWithTag(protoWriter, 5, initiateWithdrawalRequest.chain);
                protoAdapter2.encodeWithTag(protoWriter, 6, initiateWithdrawalRequest.asset);
                protoAdapter2.encodeWithTag(protoWriter, 7, initiateWithdrawalRequest.source_instrument_token);
                protoAdapter2.encodeWithTag(protoWriter, 8, initiateWithdrawalRequest.destination_address_uri);
                protoWriter.writeBytes(initiateWithdrawalRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateWithdrawalRequest(String str, RequestContext requestContext, String str2, Money money, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.external_id = str;
        this.request_context = requestContext;
        this.destination_address = str2;
        this.customer_supplied_amount = money;
        this.chain = str3;
        this.asset = str4;
        this.source_instrument_token = str5;
        this.destination_address_uri = str6;
    }

    public static InitiateWithdrawalRequest copy$default(InitiateWithdrawalRequest initiateWithdrawalRequest, RequestContext requestContext, Money money, ByteString byteString, int i) {
        String str = initiateWithdrawalRequest.external_id;
        String str2 = initiateWithdrawalRequest.destination_address;
        if ((i & 8) != 0) {
            money = initiateWithdrawalRequest.customer_supplied_amount;
        }
        Money money2 = money;
        String str3 = initiateWithdrawalRequest.chain;
        String str4 = initiateWithdrawalRequest.asset;
        String str5 = initiateWithdrawalRequest.source_instrument_token;
        String str6 = initiateWithdrawalRequest.destination_address_uri;
        if ((i & 256) != 0) {
            byteString = initiateWithdrawalRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateWithdrawalRequest.getClass();
        byteString2.getClass();
        return new InitiateWithdrawalRequest(str, requestContext, str2, money2, str3, str4, str5, str6, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateWithdrawalRequest)) {
            return false;
        }
        InitiateWithdrawalRequest initiateWithdrawalRequest = (InitiateWithdrawalRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateWithdrawalRequest.unknownFields()) && Intrinsics.areEqual(this.external_id, initiateWithdrawalRequest.external_id) && Intrinsics.areEqual(this.request_context, initiateWithdrawalRequest.request_context) && Intrinsics.areEqual(this.destination_address, initiateWithdrawalRequest.destination_address) && Intrinsics.areEqual(this.customer_supplied_amount, initiateWithdrawalRequest.customer_supplied_amount) && Intrinsics.areEqual(this.chain, initiateWithdrawalRequest.chain) && Intrinsics.areEqual(this.asset, initiateWithdrawalRequest.asset) && Intrinsics.areEqual(this.source_instrument_token, initiateWithdrawalRequest.source_instrument_token) && Intrinsics.areEqual(this.destination_address_uri, initiateWithdrawalRequest.destination_address_uri);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = (hashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str2 = this.destination_address;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.customer_supplied_amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        String str3 = this.chain;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.asset;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.source_instrument_token;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.destination_address_uri;
        int hashCode9 = hashCode8 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(8, false);
        builder.external_token = this.external_id;
        builder.external_version = this.request_context;
        builder.customer_token = this.destination_address;
        builder.updated_at = this.customer_supplied_amount;
        builder.created_at = this.chain;
        builder.is_badged = this.asset;
        builder.item_type = this.source_instrument_token;
        builder.count_groups = this.destination_address_uri;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str2 = this.destination_address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "destination_address=", arrayList);
        }
        Money money = this.customer_supplied_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_supplied_amount=", money, arrayList);
        }
        String str3 = this.chain;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "chain=", arrayList);
        }
        String str4 = this.asset;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "asset=", arrayList);
        }
        String str5 = this.source_instrument_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "source_instrument_token=", arrayList);
        }
        String str6 = this.destination_address_uri;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "destination_address_uri=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateWithdrawalRequest{", "}", 0, null, null, 56);
    }
}
