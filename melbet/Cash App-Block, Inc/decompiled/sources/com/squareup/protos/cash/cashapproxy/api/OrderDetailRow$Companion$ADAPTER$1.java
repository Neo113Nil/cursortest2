package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalMoneyKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OrderDetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocalMoneyKt localMoneyKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderDetailRow(localMoneyKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                localMoneyKt = new OrderDetailRow$Row$OrderDetailRow((RowItem) RowItem.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                localMoneyKt = new OrderDetailRow$Row$Spacer((Spacer) Spacer.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                localMoneyKt = new OrderDetailRow$Row$Divider((Divider) Divider.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderDetailRow orderDetailRow = (OrderDetailRow) obj;
        reverseProtoWriter.getClass();
        orderDetailRow.getClass();
        reverseProtoWriter.writeBytes(orderDetailRow.unknownFields());
        LocalMoneyKt localMoneyKt = orderDetailRow.row;
        if (localMoneyKt instanceof OrderDetailRow$Row$OrderDetailRow) {
            RowItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((OrderDetailRow$Row$OrderDetailRow) localMoneyKt).value);
            return;
        }
        if (localMoneyKt instanceof OrderDetailRow$Row$Spacer) {
            Spacer.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OrderDetailRow$Row$Spacer) localMoneyKt).value);
        } else if (localMoneyKt instanceof OrderDetailRow$Row$Divider) {
            Divider.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OrderDetailRow$Row$Divider) localMoneyKt).value);
        } else {
            if (localMoneyKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OrderDetailRow orderDetailRow = (OrderDetailRow) obj;
        orderDetailRow.getClass();
        int size$okio = orderDetailRow.unknownFields().getSize$okio();
        LocalMoneyKt localMoneyKt = orderDetailRow.row;
        if (localMoneyKt instanceof OrderDetailRow$Row$OrderDetailRow) {
            encodedSizeWithTag = RowItem.ADAPTER.encodedSizeWithTag(1, ((OrderDetailRow$Row$OrderDetailRow) localMoneyKt).value);
        } else if (localMoneyKt instanceof OrderDetailRow$Row$Spacer) {
            encodedSizeWithTag = Spacer.ADAPTER.encodedSizeWithTag(2, ((OrderDetailRow$Row$Spacer) localMoneyKt).value);
        } else {
            if (!(localMoneyKt instanceof OrderDetailRow$Row$Divider)) {
                if (localMoneyKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Divider.ADAPTER.encodedSizeWithTag(3, ((OrderDetailRow$Row$Divider) localMoneyKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderDetailRow orderDetailRow = (OrderDetailRow) obj;
        orderDetailRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalMoneyKt localMoneyKt = orderDetailRow.row;
        byteString.getClass();
        return new OrderDetailRow(localMoneyKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderDetailRow orderDetailRow = (OrderDetailRow) obj;
        orderDetailRow.getClass();
        LocalMoneyKt localMoneyKt = orderDetailRow.row;
        if (localMoneyKt instanceof OrderDetailRow$Row$OrderDetailRow) {
            RowItem.ADAPTER.encodeWithTag(protoWriter, 1, ((OrderDetailRow$Row$OrderDetailRow) localMoneyKt).value);
        } else if (localMoneyKt instanceof OrderDetailRow$Row$Spacer) {
            Spacer.ADAPTER.encodeWithTag(protoWriter, 2, ((OrderDetailRow$Row$Spacer) localMoneyKt).value);
        } else if (localMoneyKt instanceof OrderDetailRow$Row$Divider) {
            Divider.ADAPTER.encodeWithTag(protoWriter, 3, ((OrderDetailRow$Row$Divider) localMoneyKt).value);
        } else if (localMoneyKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(orderDetailRow.unknownFields());
    }
}
