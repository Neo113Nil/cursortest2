package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes.dex */
public final class SendPoolContributionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendPoolContributionRequest> CREATOR;
    public final Money amount;
    public final Boolean cancelled_payment_intent;
    public final String creation_mechanism;
    public final String external_id;
    public final String initiator_note;
    public final String passcode_token;
    public final String payment_initiator_app_token;
    public final String pool_contributor_comment;
    public final String pool_token;
    public final RequestContext request_context;
    public final RetryContext retry_context;
    public final Instrument sender_instrument;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendPoolContributionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.pools.SendPoolContributionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v26 */
            /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                ?? r3 = 0;
                String str = null;
                Object obj = null;
                Object obj2 = null;
                String str2 = null;
                String str3 = null;
                Object obj3 = null;
                String str4 = null;
                Boolean bool = null;
                String str5 = null;
                Object obj4 = null;
                String str6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    String str7 = r3;
                    if (nextTag == -1) {
                        return new SendPoolContributionRequest(str7, str, (Money) obj, (Instrument) obj2, str2, str3, (RetryContext) obj3, str4, bool, str5, (RequestContext) obj4, str6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            r3 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                            break;
                        case 4:
                            obj2 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj2);
                            break;
                        case 5:
                            str2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj3 = TransactorKt.decodeMessageOrMerge(RetryContext.ADAPTER, protoReader, obj3);
                            break;
                        case 8:
                            str4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            bool = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            str5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                            break;
                        case 12:
                            str6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                    r3 = str7;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SendPoolContributionRequest sendPoolContributionRequest = (SendPoolContributionRequest) obj;
                reverseProtoWriter.getClass();
                sendPoolContributionRequest.getClass();
                reverseProtoWriter.writeBytes(sendPoolContributionRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 12, sendPoolContributionRequest.pool_contributor_comment);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 11, sendPoolContributionRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, sendPoolContributionRequest.payment_initiator_app_token);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, sendPoolContributionRequest.cancelled_payment_intent);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, sendPoolContributionRequest.passcode_token);
                RetryContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, sendPoolContributionRequest.retry_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, sendPoolContributionRequest.creation_mechanism);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, sendPoolContributionRequest.initiator_note);
                Instrument.ADAPTER.encodeWithTag(reverseProtoWriter, 4, sendPoolContributionRequest.sender_instrument);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sendPoolContributionRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, sendPoolContributionRequest.external_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, sendPoolContributionRequest.pool_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SendPoolContributionRequest sendPoolContributionRequest = (SendPoolContributionRequest) obj;
                sendPoolContributionRequest.getClass();
                int size$okio = sendPoolContributionRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(12, sendPoolContributionRequest.pool_contributor_comment) + RequestContext.ADAPTER.encodedSizeWithTag(11, sendPoolContributionRequest.request_context) + protoAdapter2.encodedSizeWithTag(10, sendPoolContributionRequest.payment_initiator_app_token) + ProtoAdapter.BOOL.encodedSizeWithTag(9, sendPoolContributionRequest.cancelled_payment_intent) + protoAdapter2.encodedSizeWithTag(8, sendPoolContributionRequest.passcode_token) + RetryContext.ADAPTER.encodedSizeWithTag(7, sendPoolContributionRequest.retry_context) + protoAdapter2.encodedSizeWithTag(6, sendPoolContributionRequest.creation_mechanism) + protoAdapter2.encodedSizeWithTag(5, sendPoolContributionRequest.initiator_note) + Instrument.ADAPTER.encodedSizeWithTag(4, sendPoolContributionRequest.sender_instrument) + Money.ADAPTER.encodedSizeWithTag(3, sendPoolContributionRequest.amount) + protoAdapter2.encodedSizeWithTag(2, sendPoolContributionRequest.external_id) + protoAdapter2.encodedSizeWithTag(1, sendPoolContributionRequest.pool_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SendPoolContributionRequest sendPoolContributionRequest = (SendPoolContributionRequest) obj;
                sendPoolContributionRequest.getClass();
                Money money = sendPoolContributionRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Instrument instrument = sendPoolContributionRequest.sender_instrument;
                Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
                RetryContext retryContext = sendPoolContributionRequest.retry_context;
                RetryContext retryContext2 = retryContext != null ? (RetryContext) RetryContext.ADAPTER.redact(retryContext) : null;
                RequestContext requestContext = sendPoolContributionRequest.request_context;
                return SendPoolContributionRequest.copy$default(sendPoolContributionRequest, money2, instrument2, retryContext2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 803);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SendPoolContributionRequest sendPoolContributionRequest = (SendPoolContributionRequest) obj;
                sendPoolContributionRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, sendPoolContributionRequest.pool_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, sendPoolContributionRequest.external_id);
                Money.ADAPTER.encodeWithTag(protoWriter, 3, sendPoolContributionRequest.amount);
                Instrument.ADAPTER.encodeWithTag(protoWriter, 4, sendPoolContributionRequest.sender_instrument);
                protoAdapter2.encodeWithTag(protoWriter, 5, sendPoolContributionRequest.initiator_note);
                protoAdapter2.encodeWithTag(protoWriter, 6, sendPoolContributionRequest.creation_mechanism);
                RetryContext.ADAPTER.encodeWithTag(protoWriter, 7, sendPoolContributionRequest.retry_context);
                protoAdapter2.encodeWithTag(protoWriter, 8, sendPoolContributionRequest.passcode_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, sendPoolContributionRequest.cancelled_payment_intent);
                protoAdapter2.encodeWithTag(protoWriter, 10, sendPoolContributionRequest.payment_initiator_app_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 11, sendPoolContributionRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 12, sendPoolContributionRequest.pool_contributor_comment);
                protoWriter.writeBytes(sendPoolContributionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendPoolContributionRequest(String str, String str2, Money money, Instrument instrument, String str3, String str4, RetryContext retryContext, String str5, Boolean bool, String str6, RequestContext requestContext, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pool_token = str;
        this.external_id = str2;
        this.amount = money;
        this.sender_instrument = instrument;
        this.initiator_note = str3;
        this.creation_mechanism = str4;
        this.retry_context = retryContext;
        this.passcode_token = str5;
        this.cancelled_payment_intent = bool;
        this.payment_initiator_app_token = str6;
        this.request_context = requestContext;
        this.pool_contributor_comment = str7;
    }

    public static SendPoolContributionRequest copy$default(SendPoolContributionRequest sendPoolContributionRequest, Money money, Instrument instrument, RetryContext retryContext, RequestContext requestContext, ByteString byteString, int i) {
        String str = sendPoolContributionRequest.pool_token;
        String str2 = sendPoolContributionRequest.external_id;
        if ((i & 4) != 0) {
            money = sendPoolContributionRequest.amount;
        }
        Money money2 = money;
        Instrument instrument2 = (i & 8) != 0 ? sendPoolContributionRequest.sender_instrument : instrument;
        String str3 = (i & 16) != 0 ? sendPoolContributionRequest.initiator_note : null;
        String str4 = sendPoolContributionRequest.creation_mechanism;
        RetryContext retryContext2 = (i & 64) != 0 ? sendPoolContributionRequest.retry_context : retryContext;
        String str5 = (i & 128) != 0 ? sendPoolContributionRequest.passcode_token : null;
        Boolean bool = sendPoolContributionRequest.cancelled_payment_intent;
        String str6 = sendPoolContributionRequest.payment_initiator_app_token;
        String str7 = (i & 2048) != 0 ? sendPoolContributionRequest.pool_contributor_comment : null;
        ByteString unknownFields = (i & 4096) != 0 ? sendPoolContributionRequest.unknownFields() : byteString;
        sendPoolContributionRequest.getClass();
        unknownFields.getClass();
        return new SendPoolContributionRequest(str, str2, money2, instrument2, str3, str4, retryContext2, str5, bool, str6, requestContext, str7, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendPoolContributionRequest)) {
            return false;
        }
        SendPoolContributionRequest sendPoolContributionRequest = (SendPoolContributionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), sendPoolContributionRequest.unknownFields()) && Intrinsics.areEqual(this.pool_token, sendPoolContributionRequest.pool_token) && Intrinsics.areEqual(this.external_id, sendPoolContributionRequest.external_id) && Intrinsics.areEqual(this.amount, sendPoolContributionRequest.amount) && Intrinsics.areEqual(this.sender_instrument, sendPoolContributionRequest.sender_instrument) && Intrinsics.areEqual(this.initiator_note, sendPoolContributionRequest.initiator_note) && Intrinsics.areEqual(this.creation_mechanism, sendPoolContributionRequest.creation_mechanism) && Intrinsics.areEqual(this.retry_context, sendPoolContributionRequest.retry_context) && Intrinsics.areEqual(this.passcode_token, sendPoolContributionRequest.passcode_token) && Intrinsics.areEqual(this.cancelled_payment_intent, sendPoolContributionRequest.cancelled_payment_intent) && Intrinsics.areEqual(this.payment_initiator_app_token, sendPoolContributionRequest.payment_initiator_app_token) && Intrinsics.areEqual(this.request_context, sendPoolContributionRequest.request_context) && Intrinsics.areEqual(this.pool_contributor_comment, sendPoolContributionRequest.pool_contributor_comment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pool_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.external_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Instrument instrument = this.sender_instrument;
        int hashCode5 = (hashCode4 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        String str3 = this.initiator_note;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.creation_mechanism;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        RetryContext retryContext = this.retry_context;
        int hashCode8 = (hashCode7 + (retryContext != null ? retryContext.hashCode() : 0)) * 37;
        String str5 = this.passcode_token;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.cancelled_payment_intent;
        int hashCode10 = (hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str6 = this.payment_initiator_app_token;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode12 = (hashCode11 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str7 = this.pool_contributor_comment;
        int hashCode13 = hashCode12 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(17, false);
        builder.string_literal = this.pool_token;
        builder.key_path_ref = this.external_id;
        builder.int_literal = this.amount;
        builder.float_literal = this.sender_instrument;
        builder.blob_literal = this.initiator_note;
        builder.unary_op = this.creation_mechanism;
        builder.binary_op = this.retry_context;
        builder.conditional_op = this.passcode_token;
        builder.bool_literal = this.cancelled_payment_intent;
        builder.filter_op = this.payment_initiator_app_token;
        builder.collection_literal = this.request_context;
        builder.format_string_op = this.pool_contributor_comment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pool_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pool_token=", arrayList);
        }
        String str2 = this.external_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "external_id=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Instrument instrument = this.sender_instrument;
        if (instrument != null) {
            arrayList.add("sender_instrument=" + instrument);
        }
        if (this.initiator_note != null) {
            arrayList.add("initiator_note=██");
        }
        String str3 = this.creation_mechanism;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "creation_mechanism=", arrayList);
        }
        RetryContext retryContext = this.retry_context;
        if (retryContext != null) {
            arrayList.add("retry_context=" + retryContext);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        Boolean bool = this.cancelled_payment_intent;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cancelled_payment_intent=", bool, arrayList);
        }
        String str4 = this.payment_initiator_app_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "payment_initiator_app_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.pool_contributor_comment != null) {
            arrayList.add("pool_contributor_comment=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendPoolContributionRequest{", "}", 0, null, null, 56);
    }
}
