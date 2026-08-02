package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class InitiateLoanRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateLoanRequest> CREATOR;
    public final Money amount;
    public final String credit_line_token;
    public final String idempotence_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateLoanRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.lending.InitiateLoanRequest$Companion$ADAPTER$1
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
                        return new InitiateLoanRequest((RequestContext) obj, (String) obj2, (String) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateLoanRequest initiateLoanRequest = (InitiateLoanRequest) obj;
                reverseProtoWriter.getClass();
                initiateLoanRequest.getClass();
                reverseProtoWriter.writeBytes(initiateLoanRequest.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, initiateLoanRequest.amount);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, initiateLoanRequest.idempotence_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, initiateLoanRequest.credit_line_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateLoanRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateLoanRequest initiateLoanRequest = (InitiateLoanRequest) obj;
                initiateLoanRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, initiateLoanRequest.request_context) + initiateLoanRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Money.ADAPTER.encodedSizeWithTag(4, initiateLoanRequest.amount) + protoAdapter2.encodedSizeWithTag(3, initiateLoanRequest.idempotence_token) + protoAdapter2.encodedSizeWithTag(2, initiateLoanRequest.credit_line_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateLoanRequest initiateLoanRequest = (InitiateLoanRequest) obj;
                initiateLoanRequest.getClass();
                RequestContext requestContext = initiateLoanRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = initiateLoanRequest.amount;
                return InitiateLoanRequest.copy$default(initiateLoanRequest, requestContext2, money != null ? (Money) Money.ADAPTER.redact(money) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateLoanRequest initiateLoanRequest = (InitiateLoanRequest) obj;
                initiateLoanRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateLoanRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, initiateLoanRequest.credit_line_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, initiateLoanRequest.idempotence_token);
                Money.ADAPTER.encodeWithTag(protoWriter, 4, initiateLoanRequest.amount);
                protoWriter.writeBytes(initiateLoanRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateLoanRequest(RequestContext requestContext, String str, String str2, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.credit_line_token = str;
        this.idempotence_token = str2;
        this.amount = money;
    }

    public static InitiateLoanRequest copy$default(InitiateLoanRequest initiateLoanRequest, RequestContext requestContext, Money money, ByteString byteString, int i) {
        String str = initiateLoanRequest.credit_line_token;
        String str2 = initiateLoanRequest.idempotence_token;
        if ((i & 8) != 0) {
            money = initiateLoanRequest.amount;
        }
        Money money2 = money;
        if ((i & 16) != 0) {
            byteString = initiateLoanRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateLoanRequest.getClass();
        byteString2.getClass();
        return new InitiateLoanRequest(requestContext, str, str2, money2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateLoanRequest)) {
            return false;
        }
        InitiateLoanRequest initiateLoanRequest = (InitiateLoanRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateLoanRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, initiateLoanRequest.request_context) && Intrinsics.areEqual(this.credit_line_token, initiateLoanRequest.credit_line_token) && Intrinsics.areEqual(this.idempotence_token, initiateLoanRequest.idempotence_token) && Intrinsics.areEqual(this.amount, initiateLoanRequest.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.credit_line_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.idempotence_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(4);
        builder.account = this.request_context;
        builder.enabled = this.credit_line_token;
        builder.button = this.idempotence_token;
        builder.dda_form = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.credit_line_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "credit_line_token=", arrayList);
        }
        String str2 = this.idempotence_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotence_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateLoanRequest{", "}", 0, null, null, 56);
    }
}
