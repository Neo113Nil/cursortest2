package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Summary$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Summary((Text) obj, (TextWithInfo) obj2, (Text) obj3, (TextWithInfo) obj4, (InfoTile) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TextWithInfo.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(TextWithInfo.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(InfoTile.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Summary summary = (Summary) obj;
        reverseProtoWriter.getClass();
        summary.getClass();
        reverseProtoWriter.writeBytes(summary.unknownFields());
        InfoTile.ADAPTER.encodeWithTag(reverseProtoWriter, 5, summary.info_tile);
        ProtoAdapter protoAdapter = TextWithInfo.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, summary.total_owed_detail);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, summary.total_owed_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, summary.balance_detail);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, summary.balance_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Summary summary = (Summary) obj;
        summary.getClass();
        int size$okio = summary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, summary.balance_title) + size$okio;
        ProtoAdapter protoAdapter2 = TextWithInfo.ADAPTER;
        return InfoTile.ADAPTER.encodedSizeWithTag(5, summary.info_tile) + protoAdapter2.encodedSizeWithTag(4, summary.total_owed_detail) + protoAdapter.encodedSizeWithTag(3, summary.total_owed_title) + protoAdapter2.encodedSizeWithTag(2, summary.balance_detail) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Summary summary = (Summary) obj;
        summary.getClass();
        Text text = summary.balance_title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        TextWithInfo textWithInfo = summary.balance_detail;
        TextWithInfo textWithInfo2 = textWithInfo != null ? (TextWithInfo) TextWithInfo.ADAPTER.redact(textWithInfo) : null;
        Text text3 = summary.total_owed_title;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        TextWithInfo textWithInfo3 = summary.total_owed_detail;
        TextWithInfo textWithInfo4 = textWithInfo3 != null ? (TextWithInfo) TextWithInfo.ADAPTER.redact(textWithInfo3) : null;
        InfoTile infoTile = summary.info_tile;
        InfoTile infoTile2 = infoTile != null ? (InfoTile) InfoTile.ADAPTER.redact(infoTile) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Summary(text2, textWithInfo2, text4, textWithInfo4, infoTile2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Summary summary = (Summary) obj;
        summary.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, summary.balance_title);
        ProtoAdapter protoAdapter2 = TextWithInfo.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, summary.balance_detail);
        protoAdapter.encodeWithTag(protoWriter, 3, summary.total_owed_title);
        protoAdapter2.encodeWithTag(protoWriter, 4, summary.total_owed_detail);
        InfoTile.ADAPTER.encodeWithTag(protoWriter, 5, summary.info_tile);
        protoWriter.writeBytes(summary.unknownFields());
    }
}
