package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic((Color) obj, (Color) obj2, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon) obj3, (Float) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.FLOAT.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) obj;
        reverseProtoWriter.getClass();
        graphic.getClass();
        reverseProtoWriter.writeBytes(graphic.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 6, graphic.accessibility_description);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 4, graphic.fill_percent);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, graphic.foreground_icon);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, graphic.foreground_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, graphic.primary_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) obj;
        graphic.getClass();
        int size$okio = graphic.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return LocalizedString.ADAPTER.encodedSizeWithTag(6, graphic.accessibility_description) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, graphic.fill_percent) + BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.ADAPTER.encodedSizeWithTag(3, graphic.foreground_icon) + protoAdapter.encodedSizeWithTag(2, graphic.foreground_color) + protoAdapter.encodedSizeWithTag(1, graphic.primary_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) obj;
        graphic.getClass();
        Color color = graphic.primary_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = graphic.foreground_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        LocalizedString localizedString = graphic.accessibility_description;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon icon = graphic.foreground_icon;
        Float f = graphic.fill_percent;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic(color2, color4, icon, f, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) obj;
        graphic.getClass();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, graphic.primary_color);
        protoAdapter.encodeWithTag(protoWriter, 2, graphic.foreground_color);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.ADAPTER.encodeWithTag(protoWriter, 3, graphic.foreground_icon);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, graphic.fill_percent);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 6, graphic.accessibility_description);
        protoWriter.writeBytes(graphic.unknownFields());
    }
}
