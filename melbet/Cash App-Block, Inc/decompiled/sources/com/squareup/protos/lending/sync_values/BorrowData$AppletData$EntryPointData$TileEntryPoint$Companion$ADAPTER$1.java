package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint((String) obj, (BorrowData.AppletData.EntryPointData.RowEntryPoint) obj2, (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) obj3, (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint = (BorrowData.AppletData.EntryPointData.TileEntryPoint) obj;
        reverseProtoWriter.getClass();
        tileEntryPoint.getClass();
        reverseProtoWriter.writeBytes(tileEntryPoint.unknownFields());
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile.ADAPTER.encodeWithTag(reverseProtoWriter, 5, tileEntryPoint.half_width_tile);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tileEntryPoint.full_width_tile);
        BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tileEntryPoint.fallback_row_entry_point);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tileEntryPoint.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint = (BorrowData.AppletData.EntryPointData.TileEntryPoint) obj;
        tileEntryPoint.getClass();
        return BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile.ADAPTER.encodedSizeWithTag(5, tileEntryPoint.half_width_tile) + BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile.ADAPTER.encodedSizeWithTag(3, tileEntryPoint.full_width_tile) + BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodedSizeWithTag(2, tileEntryPoint.fallback_row_entry_point) + ProtoAdapter.STRING.encodedSizeWithTag(1, tileEntryPoint.client_route) + tileEntryPoint.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint = (BorrowData.AppletData.EntryPointData.TileEntryPoint) obj;
        tileEntryPoint.getClass();
        BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint = tileEntryPoint.fallback_row_entry_point;
        BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint2 = rowEntryPoint != null ? (BorrowData.AppletData.EntryPointData.RowEntryPoint) BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.redact(rowEntryPoint) : null;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = tileEntryPoint.full_width_tile;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile2 = fullWidthTile != null ? (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile.ADAPTER.redact(fullWidthTile) : null;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = tileEntryPoint.half_width_tile;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile2 = halfWidthTile != null ? (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile.ADAPTER.redact(halfWidthTile) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tileEntryPoint.client_route;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint(str, rowEntryPoint2, fullWidthTile2, halfWidthTile2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint = (BorrowData.AppletData.EntryPointData.TileEntryPoint) obj;
        tileEntryPoint.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tileEntryPoint.client_route);
        BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodeWithTag(protoWriter, 2, tileEntryPoint.fallback_row_entry_point);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile.ADAPTER.encodeWithTag(protoWriter, 3, tileEntryPoint.full_width_tile);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile.ADAPTER.encodeWithTag(protoWriter, 5, tileEntryPoint.half_width_tile);
        protoWriter.writeBytes(tileEntryPoint.unknownFields());
    }
}
