package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AddMoneyRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AddMoneyRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddMoneyRequest((RequestContext) obj, (Money) obj2, (AddMoneyRequest.PaymentMethod) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = AddMoneyRequest.PaymentMethod.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddMoneyRequest addMoneyRequest = (AddMoneyRequest) obj;
        reverseProtoWriter.getClass();
        addMoneyRequest.getClass();
        reverseProtoWriter.writeBytes(addMoneyRequest.unknownFields());
        AddMoneyRequest.PaymentMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 3, addMoneyRequest.payment_method);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addMoneyRequest.amount);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addMoneyRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddMoneyRequest addMoneyRequest = (AddMoneyRequest) obj;
        addMoneyRequest.getClass();
        return AddMoneyRequest.PaymentMethod.ADAPTER.encodedSizeWithTag(3, addMoneyRequest.payment_method) + Money.ADAPTER.encodedSizeWithTag(2, addMoneyRequest.amount) + RequestContext.ADAPTER.encodedSizeWithTag(1, addMoneyRequest.request_context) + addMoneyRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddMoneyRequest addMoneyRequest = (AddMoneyRequest) obj;
        addMoneyRequest.getClass();
        RequestContext requestContext = addMoneyRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        Money money = addMoneyRequest.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        AddMoneyRequest.PaymentMethod paymentMethod = addMoneyRequest.payment_method;
        byteString.getClass();
        return new AddMoneyRequest(requestContext2, money2, paymentMethod, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddMoneyRequest addMoneyRequest = (AddMoneyRequest) obj;
        addMoneyRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, addMoneyRequest.request_context);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, addMoneyRequest.amount);
        AddMoneyRequest.PaymentMethod.ADAPTER.encodeWithTag(protoWriter, 3, addMoneyRequest.payment_method);
        protoWriter.writeBytes(addMoneyRequest.unknownFields());
    }
}
