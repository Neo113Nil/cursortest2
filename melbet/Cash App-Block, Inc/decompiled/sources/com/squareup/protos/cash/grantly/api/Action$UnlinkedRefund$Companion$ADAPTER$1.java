package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$UnlinkedRefund$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Action.UnlinkedRefund((Long) obj, (CurrencyCode) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.UnlinkedRefund unlinkedRefund = (Action.UnlinkedRefund) obj;
        reverseProtoWriter.getClass();
        unlinkedRefund.getClass();
        reverseProtoWriter.writeBytes(unlinkedRefund.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, unlinkedRefund.scope_id);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 2, unlinkedRefund.currency);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 1, unlinkedRefund.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.UnlinkedRefund unlinkedRefund = (Action.UnlinkedRefund) obj;
        unlinkedRefund.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, unlinkedRefund.scope_id) + CurrencyCode.ADAPTER.encodedSizeWithTag(2, unlinkedRefund.currency) + ProtoAdapter.UINT64.encodedSizeWithTag(1, unlinkedRefund.amount) + unlinkedRefund.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.UnlinkedRefund unlinkedRefund = (Action.UnlinkedRefund) obj;
        unlinkedRefund.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = unlinkedRefund.amount;
        CurrencyCode currencyCode = unlinkedRefund.currency;
        String str = unlinkedRefund.scope_id;
        byteString.getClass();
        return new Action.UnlinkedRefund(l, currencyCode, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.UnlinkedRefund unlinkedRefund = (Action.UnlinkedRefund) obj;
        unlinkedRefund.getClass();
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, unlinkedRefund.amount);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 2, unlinkedRefund.currency);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, unlinkedRefund.scope_id);
        protoWriter.writeBytes(unlinkedRefund.unknownFields());
    }
}
