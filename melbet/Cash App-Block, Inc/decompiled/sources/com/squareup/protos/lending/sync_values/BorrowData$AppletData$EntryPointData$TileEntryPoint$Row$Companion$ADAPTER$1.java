package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzjk borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        zzjk zzjkVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row((BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon) obj, (Color) obj2, (Color) obj3, zzjkVar, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
                    continue;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText.ADAPTER, protoReader, obj4);
                    continue;
                case 5:
                    borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic((BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic) BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations((BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations) BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzjkVar = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row row = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        zzjk zzjkVar = row.visual;
        if (zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) zzjkVar).value);
        } else if (zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) zzjkVar).value);
        } else if (zzjkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText.ADAPTER.encodeWithTag(reverseProtoWriter, 4, row.text);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, row.icon_background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.icon_foreground_color);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, row.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row row = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row) obj;
        row.getClass();
        int encodedSizeWithTag2 = BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon.ADAPTER.encodedSizeWithTag(1, row.icon) + row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(3, row.icon_background_color) + protoAdapter.encodedSizeWithTag(2, row.icon_foreground_color) + encodedSizeWithTag2;
        zzjk zzjkVar = row.visual;
        if (zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) {
            encodedSizeWithTag = BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.encodedSizeWithTag(5, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) zzjkVar).value);
        } else {
            if (!(zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations)) {
                if (zzjkVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText.ADAPTER.encodedSizeWithTag(4, row.text) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.ADAPTER.encodedSizeWithTag(6, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) zzjkVar).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText.ADAPTER.encodedSizeWithTag(4, row.text) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row row = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row) obj;
        row.getClass();
        Color color = row.icon_foreground_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = row.icon_background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText = row.text;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText2 = detailText != null ? (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText.ADAPTER.redact(detailText) : null;
        ByteString byteString = ByteString.EMPTY;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon icon = row.icon;
        zzjk zzjkVar = row.visual;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row(icon, color2, color4, zzjkVar, detailText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row row = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row) obj;
        row.getClass();
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon.ADAPTER.encodeWithTag(protoWriter, 1, row.icon);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, row.icon_foreground_color);
        protoAdapter.encodeWithTag(protoWriter, 3, row.icon_background_color);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText.ADAPTER.encodeWithTag(protoWriter, 4, row.text);
        zzjk zzjkVar = row.visual;
        if (zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.ADAPTER.encodeWithTag(protoWriter, 5, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) zzjkVar).value);
        } else if (zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.ADAPTER.encodeWithTag(protoWriter, 6, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) zzjkVar).value);
        } else if (zzjkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(row.unknownFields());
    }
}
