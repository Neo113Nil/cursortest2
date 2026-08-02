package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateBitcoinWithdrawalRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateBitcoinWithdrawalRequest> CREATOR;
    public final CryptoAmount customer_supplied_amount;
    public final RequestContext request_context;
    public final InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination withdrawal_type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateBitcoinWithdrawalRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashliteflow.api.v1.InitiateBitcoinWithdrawalRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateBitcoinWithdrawalRequest((RequestContext) obj, initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination, (CryptoAmount) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = new InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(CryptoAmount.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest = (InitiateBitcoinWithdrawalRequest) obj;
                reverseProtoWriter.getClass();
                initiateBitcoinWithdrawalRequest.getClass();
                reverseProtoWriter.writeBytes(initiateBitcoinWithdrawalRequest.unknownFields());
                InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = initiateBitcoinWithdrawalRequest.withdrawal_type;
                if (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination.value);
                } else if (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                CryptoAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 3, initiateBitcoinWithdrawalRequest.customer_supplied_amount);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateBitcoinWithdrawalRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest = (InitiateBitcoinWithdrawalRequest) obj;
                initiateBitcoinWithdrawalRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, initiateBitcoinWithdrawalRequest.request_context) + initiateBitcoinWithdrawalRequest.unknownFields().getSize$okio();
                InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = initiateBitcoinWithdrawalRequest.withdrawal_type;
                if (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null) {
                    encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination.value);
                } else if (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return CryptoAmount.ADAPTER.encodedSizeWithTag(3, initiateBitcoinWithdrawalRequest.customer_supplied_amount) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest = (InitiateBitcoinWithdrawalRequest) obj;
                initiateBitcoinWithdrawalRequest.getClass();
                RequestContext requestContext = initiateBitcoinWithdrawalRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                CryptoAmount cryptoAmount = initiateBitcoinWithdrawalRequest.customer_supplied_amount;
                CryptoAmount cryptoAmount2 = cryptoAmount != null ? (CryptoAmount) CryptoAmount.ADAPTER.redact(cryptoAmount) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new InitiateBitcoinWithdrawalRequest(requestContext2, (InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination) null, cryptoAmount2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest = (InitiateBitcoinWithdrawalRequest) obj;
                initiateBitcoinWithdrawalRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateBitcoinWithdrawalRequest.request_context);
                CryptoAmount.ADAPTER.encodeWithTag(protoWriter, 3, initiateBitcoinWithdrawalRequest.customer_supplied_amount);
                InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = initiateBitcoinWithdrawalRequest.withdrawal_type;
                if (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination.value);
                } else if (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(initiateBitcoinWithdrawalRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateBitcoinWithdrawalRequest(RequestContext requestContext, InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination, CryptoAmount cryptoAmount, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.withdrawal_type = initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination;
        this.customer_supplied_amount = cryptoAmount;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateBitcoinWithdrawalRequest)) {
            return false;
        }
        InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest = (InitiateBitcoinWithdrawalRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateBitcoinWithdrawalRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, initiateBitcoinWithdrawalRequest.request_context) && Intrinsics.areEqual(this.withdrawal_type, initiateBitcoinWithdrawalRequest.withdrawal_type) && Intrinsics.areEqual(this.customer_supplied_amount, initiateBitcoinWithdrawalRequest.customer_supplied_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination = this.withdrawal_type;
        int hashCode3 = (hashCode2 + (initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination != null ? initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination.hashCode() : 0)) * 37;
        CryptoAmount cryptoAmount = this.customer_supplied_amount;
        int hashCode4 = hashCode3 + (cryptoAmount != null ? cryptoAmount.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(12);
        builder.title = this.request_context;
        builder.subtitle = this.withdrawal_type;
        builder.action = this.customer_supplied_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.withdrawal_type != null) {
            arrayList.add("withdrawal_type=██");
        }
        CryptoAmount cryptoAmount = this.customer_supplied_amount;
        if (cryptoAmount != null) {
            arrayList.add("customer_supplied_amount=" + cryptoAmount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateBitcoinWithdrawalRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ InitiateBitcoinWithdrawalRequest(RequestContext requestContext, InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination, CryptoAmount cryptoAmount, int i) {
        this(requestContext, initiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination, (i & 4) != 0 ? null : cryptoAmount, ByteString.EMPTY);
    }
}
