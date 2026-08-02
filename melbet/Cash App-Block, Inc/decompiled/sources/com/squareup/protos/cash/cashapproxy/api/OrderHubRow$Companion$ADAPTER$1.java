package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocationMenuKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OrderHubRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocationMenuKt locationMenuKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderHubRow(locationMenuKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                locationMenuKt = new OrderHubRow$Content$SectionHeader((Text) Text.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                locationMenuKt = new OrderHubRow$Content$RowItem((AfterpayHubRowItem) AfterpayHubRowItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                locationMenuKt = new OrderHubRow$Content$SectionHeaderString((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderHubRow orderHubRow = (OrderHubRow) obj;
        reverseProtoWriter.getClass();
        orderHubRow.getClass();
        reverseProtoWriter.writeBytes(orderHubRow.unknownFields());
        LocationMenuKt locationMenuKt = orderHubRow.content;
        if (locationMenuKt instanceof OrderHubRow$Content$SectionHeader) {
            Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((OrderHubRow$Content$SectionHeader) locationMenuKt).value);
            return;
        }
        if (locationMenuKt instanceof OrderHubRow$Content$RowItem) {
            AfterpayHubRowItem.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OrderHubRow$Content$RowItem) locationMenuKt).value);
        } else if (locationMenuKt instanceof OrderHubRow$Content$SectionHeaderString) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((OrderHubRow$Content$SectionHeaderString) locationMenuKt).value);
        } else {
            if (locationMenuKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OrderHubRow orderHubRow = (OrderHubRow) obj;
        orderHubRow.getClass();
        int size$okio = orderHubRow.unknownFields().getSize$okio();
        LocationMenuKt locationMenuKt = orderHubRow.content;
        if (locationMenuKt instanceof OrderHubRow$Content$SectionHeader) {
            encodedSizeWithTag = Text.ADAPTER.encodedSizeWithTag(1, ((OrderHubRow$Content$SectionHeader) locationMenuKt).value);
        } else if (locationMenuKt instanceof OrderHubRow$Content$RowItem) {
            encodedSizeWithTag = AfterpayHubRowItem.ADAPTER.encodedSizeWithTag(2, ((OrderHubRow$Content$RowItem) locationMenuKt).value);
        } else {
            if (!(locationMenuKt instanceof OrderHubRow$Content$SectionHeaderString)) {
                if (locationMenuKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, ((OrderHubRow$Content$SectionHeaderString) locationMenuKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OrderHubRow) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OrderHubRow(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderHubRow orderHubRow = (OrderHubRow) obj;
        orderHubRow.getClass();
        LocationMenuKt locationMenuKt = orderHubRow.content;
        if (locationMenuKt instanceof OrderHubRow$Content$SectionHeader) {
            Text.ADAPTER.encodeWithTag(protoWriter, 1, ((OrderHubRow$Content$SectionHeader) locationMenuKt).value);
        } else if (locationMenuKt instanceof OrderHubRow$Content$RowItem) {
            AfterpayHubRowItem.ADAPTER.encodeWithTag(protoWriter, 2, ((OrderHubRow$Content$RowItem) locationMenuKt).value);
        } else if (locationMenuKt instanceof OrderHubRow$Content$SectionHeaderString) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((OrderHubRow$Content$SectionHeaderString) locationMenuKt).value);
        } else if (locationMenuKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(orderHubRow.unknownFields());
    }
}
