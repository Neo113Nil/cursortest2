package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$HalfWidthTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile((LocalizedString) obj, (LocalizedString) obj2, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) obj;
        reverseProtoWriter.getClass();
        halfWidthTile.getClass();
        reverseProtoWriter.writeBytes(halfWidthTile.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, halfWidthTile.is_applet_adopted);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, halfWidthTile.secondary_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, halfWidthTile.primary_text);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.encodeWithTag(reverseProtoWriter, 3, halfWidthTile.graphic);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, halfWidthTile.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, halfWidthTile.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) obj;
        halfWidthTile.getClass();
        int size$okio = halfWidthTile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, halfWidthTile.is_applet_adopted) + protoAdapter.encodedSizeWithTag(5, halfWidthTile.secondary_text) + protoAdapter.encodedSizeWithTag(4, halfWidthTile.primary_text) + BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.encodedSizeWithTag(3, halfWidthTile.graphic) + protoAdapter.encodedSizeWithTag(2, halfWidthTile.subtitle) + protoAdapter.encodedSizeWithTag(1, halfWidthTile.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) obj;
        halfWidthTile.getClass();
        LocalizedString localizedString = halfWidthTile.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = halfWidthTile.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic = halfWidthTile.graphic;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic2 = graphic != null ? (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.redact(graphic) : null;
        LocalizedString localizedString5 = halfWidthTile.primary_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = halfWidthTile.secondary_text;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = halfWidthTile.is_applet_adopted;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile(localizedString2, localizedString4, graphic2, localizedString6, localizedString8, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) obj;
        halfWidthTile.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, halfWidthTile.title);
        protoAdapter.encodeWithTag(protoWriter, 2, halfWidthTile.subtitle);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.encodeWithTag(protoWriter, 3, halfWidthTile.graphic);
        protoAdapter.encodeWithTag(protoWriter, 4, halfWidthTile.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 5, halfWidthTile.secondary_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, halfWidthTile.is_applet_adopted);
        protoWriter.writeBytes(halfWidthTile.unknownFields());
    }
}
