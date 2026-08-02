package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ScheduledPayment$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ScheduledPayment((Text) obj, (Text) obj2, (Money) obj3, (ScheduledPaymentStatus) obj4, (ScheduledPaymentDetails) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                try {
                    obj4 = ScheduledPaymentStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(ScheduledPaymentDetails.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledPayment scheduledPayment = (ScheduledPayment) obj;
        reverseProtoWriter.getClass();
        scheduledPayment.getClass();
        reverseProtoWriter.writeBytes(scheduledPayment.unknownFields());
        ScheduledPaymentDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 5, scheduledPayment.details);
        ScheduledPaymentStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, scheduledPayment.status);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, scheduledPayment.amount);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, scheduledPayment.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, scheduledPayment.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledPayment scheduledPayment = (ScheduledPayment) obj;
        scheduledPayment.getClass();
        int size$okio = scheduledPayment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ScheduledPaymentDetails.ADAPTER.encodedSizeWithTag(5, scheduledPayment.details) + ScheduledPaymentStatus.ADAPTER.encodedSizeWithTag(4, scheduledPayment.status) + Money.ADAPTER.encodedSizeWithTag(3, scheduledPayment.amount) + protoAdapter.encodedSizeWithTag(2, scheduledPayment.subtitle) + protoAdapter.encodedSizeWithTag(1, scheduledPayment.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledPayment scheduledPayment = (ScheduledPayment) obj;
        scheduledPayment.getClass();
        Text text = scheduledPayment.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = scheduledPayment.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Money money = scheduledPayment.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ScheduledPaymentDetails scheduledPaymentDetails = scheduledPayment.details;
        ScheduledPaymentDetails scheduledPaymentDetails2 = scheduledPaymentDetails != null ? (ScheduledPaymentDetails) ScheduledPaymentDetails.ADAPTER.redact(scheduledPaymentDetails) : null;
        ByteString byteString = ByteString.EMPTY;
        ScheduledPaymentStatus scheduledPaymentStatus = scheduledPayment.status;
        byteString.getClass();
        return new ScheduledPayment(text2, text4, money2, scheduledPaymentStatus, scheduledPaymentDetails2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledPayment scheduledPayment = (ScheduledPayment) obj;
        scheduledPayment.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, scheduledPayment.title);
        protoAdapter.encodeWithTag(protoWriter, 2, scheduledPayment.subtitle);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, scheduledPayment.amount);
        ScheduledPaymentStatus.ADAPTER.encodeWithTag(protoWriter, 4, scheduledPayment.status);
        ScheduledPaymentDetails.ADAPTER.encodeWithTag(protoWriter, 5, scheduledPayment.details);
        protoWriter.writeBytes(scheduledPayment.unknownFields());
    }
}
