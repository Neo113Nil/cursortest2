package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow((LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow detailRow = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailRow.title);
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailRow.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow detailRow = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow) obj;
        detailRow.getClass();
        int encodedSizeWithTag = LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.ADAPTER.encodedSizeWithTag(1, detailRow.icon) + detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, detailRow.subtitle) + protoAdapter.encodedSizeWithTag(2, detailRow.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow detailRow = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow) obj;
        detailRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon icon = detailRow.icon;
        String str = detailRow.title;
        String str2 = detailRow.subtitle;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow(icon, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow detailRow = (LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow) obj;
        detailRow.getClass();
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.ADAPTER.encodeWithTag(protoWriter, 1, detailRow.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, detailRow.title);
        protoAdapter.encodeWithTag(protoWriter, 3, detailRow.subtitle);
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
