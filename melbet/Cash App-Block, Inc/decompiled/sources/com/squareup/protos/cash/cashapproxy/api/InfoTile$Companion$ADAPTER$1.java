package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InfoTile$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InfoTile((Text) obj, (Text) obj2, (InfoTileIcon) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = InfoTileIcon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InfoTile infoTile = (InfoTile) obj;
        reverseProtoWriter.getClass();
        infoTile.getClass();
        reverseProtoWriter.writeBytes(infoTile.unknownFields());
        InfoTileIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, infoTile.icon);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, infoTile.info);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, infoTile.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InfoTile infoTile = (InfoTile) obj;
        infoTile.getClass();
        int size$okio = infoTile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return InfoTileIcon.ADAPTER.encodedSizeWithTag(3, infoTile.icon) + protoAdapter.encodedSizeWithTag(2, infoTile.info) + protoAdapter.encodedSizeWithTag(1, infoTile.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InfoTile infoTile = (InfoTile) obj;
        infoTile.getClass();
        Text text = infoTile.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = infoTile.info;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        InfoTileIcon infoTileIcon = infoTile.icon;
        byteString.getClass();
        return new InfoTile(text2, text4, infoTileIcon, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InfoTile infoTile = (InfoTile) obj;
        infoTile.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, infoTile.title);
        protoAdapter.encodeWithTag(protoWriter, 2, infoTile.info);
        InfoTileIcon.ADAPTER.encodeWithTag(protoWriter, 3, infoTile.icon);
        protoWriter.writeBytes(infoTile.unknownFields());
    }
}
