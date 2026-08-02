package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Badge$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge((LocalizedString) obj2, (Color) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge badge = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) obj;
        reverseProtoWriter.getClass();
        badge.getClass();
        reverseProtoWriter.writeBytes(badge.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, badge.text);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, badge.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge badge = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) obj;
        badge.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, badge.text) + Color.ADAPTER.encodedSizeWithTag(1, badge.color) + badge.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge badge = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) obj;
        badge.getClass();
        Color color = badge.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizedString localizedString = badge.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge(localizedString2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge badge = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) obj;
        badge.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, badge.color);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, badge.text);
        protoWriter.writeBytes(badge.unknownFields());
    }
}
