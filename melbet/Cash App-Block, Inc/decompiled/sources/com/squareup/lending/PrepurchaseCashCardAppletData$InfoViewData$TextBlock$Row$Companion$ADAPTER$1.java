package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoViewData$TextBlock$Row$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row((LocalizedString) obj, (LocalizedString) obj2, (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row row = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, row.style);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.trailing_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, row.leading_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row row = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.ADAPTER.encodedSizeWithTag(3, row.style) + protoAdapter.encodedSizeWithTag(2, row.trailing_text) + protoAdapter.encodedSizeWithTag(1, row.leading_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row row = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row) obj;
        row.getClass();
        LocalizedString localizedString = row.leading_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = row.trailing_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle rowStyle = row.style;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row(localizedString2, localizedString4, rowStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row row = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row) obj;
        row.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, row.leading_text);
        protoAdapter.encodeWithTag(protoWriter, 2, row.trailing_text);
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.ADAPTER.encodeWithTag(protoWriter, 3, row.style);
        protoWriter.writeBytes(row.unknownFields());
    }
}
