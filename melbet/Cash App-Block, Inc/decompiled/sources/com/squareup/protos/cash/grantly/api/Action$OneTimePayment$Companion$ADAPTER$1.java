package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OneTimePayment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OneTimePayment((Long) obj, (CurrencyCode) obj2, (String) obj3, (String) obj4, (Action.OneTimePayment.CheckoutOptions) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Action.OneTimePayment.CheckoutOptions.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OneTimePayment oneTimePayment = (Action.OneTimePayment) obj;
        reverseProtoWriter.getClass();
        oneTimePayment.getClass();
        reverseProtoWriter.writeBytes(oneTimePayment.unknownFields());
        Action.OneTimePayment.CheckoutOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 6, oneTimePayment.checkout_options);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, oneTimePayment.order_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, oneTimePayment.scope_id);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 2, oneTimePayment.currency);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 1, oneTimePayment.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OneTimePayment oneTimePayment = (Action.OneTimePayment) obj;
        oneTimePayment.getClass();
        int encodedSizeWithTag = CurrencyCode.ADAPTER.encodedSizeWithTag(2, oneTimePayment.currency) + ProtoAdapter.UINT64.encodedSizeWithTag(1, oneTimePayment.amount) + oneTimePayment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Action.OneTimePayment.CheckoutOptions.ADAPTER.encodedSizeWithTag(6, oneTimePayment.checkout_options) + protoAdapter.encodedSizeWithTag(5, oneTimePayment.order_id) + protoAdapter.encodedSizeWithTag(4, oneTimePayment.scope_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OneTimePayment oneTimePayment = (Action.OneTimePayment) obj;
        oneTimePayment.getClass();
        Action.OneTimePayment.CheckoutOptions checkoutOptions = oneTimePayment.checkout_options;
        Action.OneTimePayment.CheckoutOptions checkoutOptions2 = checkoutOptions != null ? (Action.OneTimePayment.CheckoutOptions) Action.OneTimePayment.CheckoutOptions.ADAPTER.redact(checkoutOptions) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = oneTimePayment.amount;
        CurrencyCode currencyCode = oneTimePayment.currency;
        String str = oneTimePayment.scope_id;
        String str2 = oneTimePayment.order_id;
        byteString.getClass();
        return new Action.OneTimePayment(l, currencyCode, str, str2, checkoutOptions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OneTimePayment oneTimePayment = (Action.OneTimePayment) obj;
        oneTimePayment.getClass();
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, oneTimePayment.amount);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 2, oneTimePayment.currency);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, oneTimePayment.scope_id);
        protoAdapter.encodeWithTag(protoWriter, 5, oneTimePayment.order_id);
        Action.OneTimePayment.CheckoutOptions.ADAPTER.encodeWithTag(protoWriter, 6, oneTimePayment.checkout_options);
        protoWriter.writeBytes(oneTimePayment.unknownFields());
    }
}
