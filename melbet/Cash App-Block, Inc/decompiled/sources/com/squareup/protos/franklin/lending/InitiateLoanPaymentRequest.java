package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.person.Alias;
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
public final class InitiateLoanPaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateLoanPaymentRequest> CREATOR;
    public final String idempotence_token;
    public final Money last_known_balance;
    public final String loan_token;
    public final String loan_transaction_token;
    public final String opaque_data;
    public final Money payment_amount;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateLoanPaymentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.lending.InitiateLoanPaymentRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateLoanPaymentRequest((RequestContext) obj, (String) obj2, (String) obj3, (Money) obj4, (Money) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateLoanPaymentRequest initiateLoanPaymentRequest = (InitiateLoanPaymentRequest) obj;
                reverseProtoWriter.getClass();
                initiateLoanPaymentRequest.getClass();
                reverseProtoWriter.writeBytes(initiateLoanPaymentRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, initiateLoanPaymentRequest.opaque_data);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, initiateLoanPaymentRequest.loan_transaction_token);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 5, initiateLoanPaymentRequest.last_known_balance);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, initiateLoanPaymentRequest.payment_amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, initiateLoanPaymentRequest.idempotence_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, initiateLoanPaymentRequest.loan_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateLoanPaymentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateLoanPaymentRequest initiateLoanPaymentRequest = (InitiateLoanPaymentRequest) obj;
                initiateLoanPaymentRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, initiateLoanPaymentRequest.request_context) + initiateLoanPaymentRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, initiateLoanPaymentRequest.idempotence_token) + protoAdapter2.encodedSizeWithTag(2, initiateLoanPaymentRequest.loan_token) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(7, initiateLoanPaymentRequest.opaque_data) + protoAdapter2.encodedSizeWithTag(6, initiateLoanPaymentRequest.loan_transaction_token) + protoAdapter3.encodedSizeWithTag(5, initiateLoanPaymentRequest.last_known_balance) + protoAdapter3.encodedSizeWithTag(4, initiateLoanPaymentRequest.payment_amount) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateLoanPaymentRequest initiateLoanPaymentRequest = (InitiateLoanPaymentRequest) obj;
                initiateLoanPaymentRequest.getClass();
                RequestContext requestContext = initiateLoanPaymentRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = initiateLoanPaymentRequest.payment_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = initiateLoanPaymentRequest.last_known_balance;
                return InitiateLoanPaymentRequest.copy$default(initiateLoanPaymentRequest, requestContext2, money2, money3 != null ? (Money) Money.ADAPTER.redact(money3) : null, ByteString.EMPTY, 102);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateLoanPaymentRequest initiateLoanPaymentRequest = (InitiateLoanPaymentRequest) obj;
                initiateLoanPaymentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateLoanPaymentRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, initiateLoanPaymentRequest.loan_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, initiateLoanPaymentRequest.idempotence_token);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 4, initiateLoanPaymentRequest.payment_amount);
                protoAdapter3.encodeWithTag(protoWriter, 5, initiateLoanPaymentRequest.last_known_balance);
                protoAdapter2.encodeWithTag(protoWriter, 6, initiateLoanPaymentRequest.loan_transaction_token);
                protoAdapter2.encodeWithTag(protoWriter, 7, initiateLoanPaymentRequest.opaque_data);
                protoWriter.writeBytes(initiateLoanPaymentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ InitiateLoanPaymentRequest(String str, String str2, Money money, String str3, String str4, int i) {
        this(null, (i & 2) != 0 ? null : str, str2, money, null, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, ByteString.EMPTY);
    }

    public static InitiateLoanPaymentRequest copy$default(InitiateLoanPaymentRequest initiateLoanPaymentRequest, RequestContext requestContext, Money money, Money money2, ByteString byteString, int i) {
        String str = initiateLoanPaymentRequest.loan_token;
        String str2 = initiateLoanPaymentRequest.idempotence_token;
        if ((i & 8) != 0) {
            money = initiateLoanPaymentRequest.payment_amount;
        }
        Money money3 = money;
        if ((i & 16) != 0) {
            money2 = initiateLoanPaymentRequest.last_known_balance;
        }
        Money money4 = money2;
        String str3 = initiateLoanPaymentRequest.loan_transaction_token;
        String str4 = initiateLoanPaymentRequest.opaque_data;
        if ((i & 128) != 0) {
            byteString = initiateLoanPaymentRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateLoanPaymentRequest.getClass();
        byteString2.getClass();
        return new InitiateLoanPaymentRequest(requestContext, str, str2, money3, money4, str3, str4, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateLoanPaymentRequest)) {
            return false;
        }
        InitiateLoanPaymentRequest initiateLoanPaymentRequest = (InitiateLoanPaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateLoanPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, initiateLoanPaymentRequest.request_context) && Intrinsics.areEqual(this.loan_token, initiateLoanPaymentRequest.loan_token) && Intrinsics.areEqual(this.idempotence_token, initiateLoanPaymentRequest.idempotence_token) && Intrinsics.areEqual(this.payment_amount, initiateLoanPaymentRequest.payment_amount) && Intrinsics.areEqual(this.last_known_balance, initiateLoanPaymentRequest.last_known_balance) && Intrinsics.areEqual(this.loan_transaction_token, initiateLoanPaymentRequest.loan_transaction_token) && Intrinsics.areEqual(this.opaque_data, initiateLoanPaymentRequest.opaque_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.loan_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.idempotence_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.payment_amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.last_known_balance;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str3 = this.loan_transaction_token;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.opaque_data;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(14, false);
        builder.f1407type = this.request_context;
        builder.scope = this.loan_token;
        builder.value = this.idempotence_token;
        builder.first_verified_at_ms = this.payment_amount;
        builder.last_verified_at_ms = this.last_known_balance;
        builder.created_at = this.loan_transaction_token;
        builder.updated_at = this.opaque_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.loan_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "loan_token=", arrayList);
        }
        String str2 = this.idempotence_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotence_token=", arrayList);
        }
        Money money = this.payment_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("payment_amount=", money, arrayList);
        }
        Money money2 = this.last_known_balance;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("last_known_balance=", money2, arrayList);
        }
        String str3 = this.loan_transaction_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loan_transaction_token=", arrayList);
        }
        String str4 = this.opaque_data;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "opaque_data=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateLoanPaymentRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateLoanPaymentRequest(RequestContext requestContext, String str, String str2, Money money, Money money2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.loan_token = str;
        this.idempotence_token = str2;
        this.payment_amount = money;
        this.last_known_balance = money2;
        this.loan_transaction_token = str3;
        this.opaque_data = str4;
    }
}
