package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.BankingConfig;
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
public final class CreditFirstTimeBorrowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditFirstTimeBorrowRequest> CREATOR;
    public final RequestContext request_context;
    public final Money requested_amount;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreditFirstTimeBorrowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.CreditFirstTimeBorrowRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CreditFirstTimeBorrowRequest((RequestContext) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreditFirstTimeBorrowRequest creditFirstTimeBorrowRequest = (CreditFirstTimeBorrowRequest) obj;
                reverseProtoWriter.getClass();
                creditFirstTimeBorrowRequest.getClass();
                reverseProtoWriter.writeBytes(creditFirstTimeBorrowRequest.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, creditFirstTimeBorrowRequest.requested_amount);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditFirstTimeBorrowRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreditFirstTimeBorrowRequest creditFirstTimeBorrowRequest = (CreditFirstTimeBorrowRequest) obj;
                creditFirstTimeBorrowRequest.getClass();
                return Money.ADAPTER.encodedSizeWithTag(2, creditFirstTimeBorrowRequest.requested_amount) + RequestContext.ADAPTER.encodedSizeWithTag(1, creditFirstTimeBorrowRequest.request_context) + creditFirstTimeBorrowRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreditFirstTimeBorrowRequest creditFirstTimeBorrowRequest = (CreditFirstTimeBorrowRequest) obj;
                creditFirstTimeBorrowRequest.getClass();
                RequestContext requestContext = creditFirstTimeBorrowRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = creditFirstTimeBorrowRequest.requested_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new CreditFirstTimeBorrowRequest(requestContext2, money2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreditFirstTimeBorrowRequest creditFirstTimeBorrowRequest = (CreditFirstTimeBorrowRequest) obj;
                creditFirstTimeBorrowRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, creditFirstTimeBorrowRequest.request_context);
                Money.ADAPTER.encodeWithTag(protoWriter, 2, creditFirstTimeBorrowRequest.requested_amount);
                protoWriter.writeBytes(creditFirstTimeBorrowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditFirstTimeBorrowRequest(RequestContext requestContext, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.requested_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditFirstTimeBorrowRequest)) {
            return false;
        }
        CreditFirstTimeBorrowRequest creditFirstTimeBorrowRequest = (CreditFirstTimeBorrowRequest) obj;
        return Intrinsics.areEqual(unknownFields(), creditFirstTimeBorrowRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, creditFirstTimeBorrowRequest.request_context) && Intrinsics.areEqual(this.requested_amount, creditFirstTimeBorrowRequest.requested_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Money money = this.requested_amount;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(11);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.requested_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Money money = this.requested_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("requested_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditFirstTimeBorrowRequest{", "}", 0, null, null, 56);
    }
}
